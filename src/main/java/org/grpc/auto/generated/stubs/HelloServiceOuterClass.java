// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloService.proto

package org.grpc.auto.generated.stubs;

public final class HelloServiceOuterClass {
  private HelloServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_grpc_auto_generated_stubs_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_grpc_auto_generated_stubs_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_grpc_auto_generated_stubs_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_grpc_auto_generated_stubs_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022HelloService.proto\022\035org.grpc.auto.gene" +
      "rated.stubs\"3\n\014HelloRequest\022\021\n\tfirstName" +
      "\030\001 \001(\t\022\020\n\010lastName\030\002 \001(\t\"!\n\rHelloRespons" +
      "e\022\020\n\010greeting\030\001 \001(\t2r\n\014HelloService\022b\n\005h" +
      "ello\022+.org.grpc.auto.generated.stubs.Hel" +
      "loRequest\032,.org.grpc.auto.generated.stub" +
      "s.HelloResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_grpc_auto_generated_stubs_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_grpc_auto_generated_stubs_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_grpc_auto_generated_stubs_HelloRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_org_grpc_auto_generated_stubs_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_grpc_auto_generated_stubs_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_grpc_auto_generated_stubs_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
