// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ambulanceControlService.proto

package grpc.ambulanceControlService;

public interface SendResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AmbulanceControlService.SendResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *status
   * </pre>
   *
   * <code>string finalMessage = 1;</code>
   */
  java.lang.String getFinalMessage();
  /**
   * <pre>
   *status
   * </pre>
   *
   * <code>string finalMessage = 1;</code>
   */
  com.google.protobuf.ByteString
      getFinalMessageBytes();

  /**
   * <pre>
   *ambulance no.
   * </pre>
   *
   * <code>int32 ambulanceNumber = 2;</code>
   */
  int getAmbulanceNumber();
}