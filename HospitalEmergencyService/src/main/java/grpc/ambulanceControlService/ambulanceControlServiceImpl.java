// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ambulanceControlService.proto

package grpc.ambulanceControlService;

public final class ambulanceControlServiceImpl {
  private ambulanceControlServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AmbulanceControlService_AmbulanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AmbulanceControlService_AmbulanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AmbulanceControlService_AmbulanceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AmbulanceControlService_AmbulanceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AmbulanceControlService_sendRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AmbulanceControlService_sendRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AmbulanceControlService_SendResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AmbulanceControlService_SendResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ambulanceControlService.proto\022\027Ambulan" +
      "ceControlService\"B\n\020AmbulanceRequest\022\017\n\007" +
      "numbers\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\017\n\007address\030\003" +
      " \001(\t\"$\n\021AmbulanceResponse\022\017\n\007message\030\001 \001" +
      "(\t\"H\n\013sendRequest\022\027\n\017ambulancenumber\030\001 \001" +
      "(\005\022\020\n\010fromBase\030\002 \001(\t\022\016\n\006toBase\030\003 \001(\t\"=\n\014" +
      "SendResponse\022\024\n\014finalMessage\030\001 \001(\t\022\027\n\017am" +
      "bulanceNumber\030\002 \001(\0052\360\001\n\027ambulanceControl" +
      "Service\022o\n\022emergencyAmbulance\022).Ambulanc" +
      "eControlService.AmbulanceRequest\032*.Ambul" +
      "anceControlService.AmbulanceResponse\"\0000\001" +
      "\022d\n\017ambulanceStatus\022$.AmbulanceControlSe" +
      "rvice.sendRequest\032%.AmbulanceControlServ" +
      "ice.SendResponse\"\000(\0010\001B=\n\034grpc.ambulance" +
      "ControlServiceB\033ambulanceControlServiceI" +
      "mplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_AmbulanceControlService_AmbulanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AmbulanceControlService_AmbulanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AmbulanceControlService_AmbulanceRequest_descriptor,
        new java.lang.String[] { "Numbers", "Name", "Address", });
    internal_static_AmbulanceControlService_AmbulanceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AmbulanceControlService_AmbulanceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AmbulanceControlService_AmbulanceResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_AmbulanceControlService_sendRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AmbulanceControlService_sendRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AmbulanceControlService_sendRequest_descriptor,
        new java.lang.String[] { "Ambulancenumber", "FromBase", "ToBase", });
    internal_static_AmbulanceControlService_SendResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_AmbulanceControlService_SendResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AmbulanceControlService_SendResponse_descriptor,
        new java.lang.String[] { "FinalMessage", "AmbulanceNumber", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}