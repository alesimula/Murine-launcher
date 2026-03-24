package com.android.framework.protobuf;

final class MessageSchema<T extends java.lang.Object> implements com.android.framework.protobuf.Schema<T> {
    static final int ONEOF_TYPE_OFFSET = 51;
    static <T extends java.lang.Object> com.android.framework.protobuf.MessageSchema<T> newSchema(java.lang.Class<T> p0, com.android.framework.protobuf.MessageInfo p1, com.android.framework.protobuf.NewInstanceSchema p2, com.android.framework.protobuf.ListFieldSchema p3, com.android.framework.protobuf.UnknownFieldSchema<?, ?> p4, com.android.framework.protobuf.ExtensionSchema<?> p5, com.android.framework.protobuf.MapFieldSchema p6) { return null; }
    static <T extends java.lang.Object> com.android.framework.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.android.framework.protobuf.RawMessageInfo p0, com.android.framework.protobuf.NewInstanceSchema p1, com.android.framework.protobuf.ListFieldSchema p2, com.android.framework.protobuf.UnknownFieldSchema<?, ?> p3, com.android.framework.protobuf.ExtensionSchema<?> p4, com.android.framework.protobuf.MapFieldSchema p5) { return null; }
    static <T extends java.lang.Object> com.android.framework.protobuf.MessageSchema<T> newSchemaForMessageInfo(com.android.framework.protobuf.StructuralMessageInfo p0, com.android.framework.protobuf.NewInstanceSchema p1, com.android.framework.protobuf.ListFieldSchema p2, com.android.framework.protobuf.UnknownFieldSchema<?, ?> p3, com.android.framework.protobuf.ExtensionSchema<?> p4, com.android.framework.protobuf.MapFieldSchema p5) { return null; }
    public T newInstance() { return null; }
    public boolean equals(T p0, T p1) { return false; }
    public int hashCode(T p0) { return 0; }
    public void mergeFrom(T p0, T p1) {}
    public int getSerializedSize(T p0) { return 0; }
    public void writeTo(T p0, com.android.framework.protobuf.Writer p1) throws java.io.IOException {}
    public void mergeFrom(T p0, com.android.framework.protobuf.Reader p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
    static com.android.framework.protobuf.UnknownFieldSetLite getMutableUnknownFields(java.lang.Object p0) { return null; }
    int parseProto2Message(T p0, byte[] p1, int p2, int p3, int p4, com.android.framework.protobuf.ArrayDecoders.Registers p5) throws java.io.IOException { return 0; }
    public void mergeFrom(T p0, byte[] p1, int p2, int p3, com.android.framework.protobuf.ArrayDecoders.Registers p4) throws java.io.IOException {}
    public void makeImmutable(T p0) {}
    public final boolean isInitialized(T p0) { return false; }
    int getSchemaSize() { return 0; }
}
