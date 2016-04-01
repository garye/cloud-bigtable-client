package com.google.cloud.bigtable.client;

/**
 * Created by garyelliott on 4/1/16.
 */
public class BigtableServiceException extends Exception {

  public BigtableServiceException(Throwable cause) {
    super(cause);
  }

  public BigtableServiceException(String message, Throwable cause) {
    super(message, cause);
  }
}
