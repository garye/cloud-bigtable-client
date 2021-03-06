/*
 * Copyright (C) 2015 The Google Cloud Dataflow Hadoop Library Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.cloud.bigtable.dataflowimport;

import com.google.cloud.dataflow.sdk.coders.Coder;
import com.google.cloud.dataflow.sdk.coders.CoderException;
import com.google.cloud.dataflow.sdk.coders.StandardCoder;
import com.google.cloud.dataflow.sdk.util.CloudObject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.hadoop.io.Writable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * Part of third party contribution to Google Dataflow Java SDK
 * (http://github.com/GoogleCloudPlatform/DataflowJavaSDK/tree/master/contrib/hadoop). Repackaged
 * here for convenience.
 *
 * <p>A {@code WritableCoder} is a {@link com.google.cloud.dataflow.sdk.coders.Coder} for a
 * Java class that implements {@link org.apache.hadoop.io.Writable}.
 *
 * <p> To use, specify the coder type on a PCollection:
 * <pre>
 * {@code
 *   PCollection<MyRecord> records =
 *       foo.apply(...).setCoder(WritableCoder.of(MyRecord.class));
 * }
 * </pre>
 *
 * @param <T> the type of elements handled by this coder
 * @author sduskis
 * @version $Id: $Id
 */
public class WritableCoder<T extends Writable> extends StandardCoder<T> {
  private static final long serialVersionUID = 0L;

  /**
   * Returns a {@code WritableCoder} instance for the provided element class.
   *
   * @param clazz a {@link java.lang.Class} object.
   * @return a {@link com.google.cloud.bigtable.dataflowimport.WritableCoder} object.
   */
  public static <T extends Writable> WritableCoder<T> of(Class<T> clazz) {
    return new WritableCoder<>(clazz);
  }

  /**
   * <p>of.</p>
   *
   * @param classType a {@link java.lang.String} object.
   * @return a {@link com.google.cloud.bigtable.dataflowimport.WritableCoder} object.
   * @throws java.lang.ClassNotFoundException if any.
   */
  @JsonCreator
  @SuppressWarnings("unchecked")
  public static WritableCoder<?> of(@JsonProperty("type") String classType)
      throws ClassNotFoundException {
    Class<?> clazz = Class.forName(classType);
    if (!Writable.class.isAssignableFrom(clazz)) {
      throw new ClassNotFoundException(
          "Class " + classType + " does not implement Writable");
    }
    return of((Class<? extends Writable>) clazz);
  }

  private final Class<T> type;

  /**
   * <p>Constructor for WritableCoder.</p>
   *
   * @param type a {@link java.lang.Class} object.
   */
  public WritableCoder(Class<T> type) {
    this.type = type;
  }

  /** {@inheritDoc} */
  @Override
  public void encode(T value, OutputStream outStream, Context context) throws IOException {
    value.write(new DataOutputStream(outStream));
  }

  /** {@inheritDoc} */
  @Override
  public T decode(InputStream inStream, Context context) throws IOException {
    try {
      T t = type.newInstance();
      t.readFields(new DataInputStream(inStream));
      return t;
    } catch (InstantiationException | IllegalAccessException e) {
      throw new CoderException("unable to deserialize record", e);
    }
  }

  /** {@inheritDoc} */
  @Override
  public List<Coder<?>> getCoderArguments() {
    return null;
  }

  /** {@inheritDoc} */
  @Override
  public CloudObject asCloudObject() {
    CloudObject result = super.asCloudObject();
    result.put("type", type.getName());
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void verifyDeterministic() throws NonDeterministicException {
    throw new NonDeterministicException(this,
        "Hadoop Writable may be non-deterministic.");
  }

}
