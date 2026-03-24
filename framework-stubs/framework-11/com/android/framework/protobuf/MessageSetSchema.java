package com.android.framework.protobuf;

final class MessageSetSchema<T extends java.lang.Object> implements com.android.framework.protobuf.Schema<T> {
    private final com.android.framework.protobuf.MessageLite defaultInstance = null;
    private final com.android.framework.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema = null;
    private final boolean hasExtensions = false;
    private final com.android.framework.protobuf.ExtensionSchema<?> extensionSchema = null;
    private MessageSetSchema(com.android.framework.protobuf.UnknownFieldSchema<?, ?> p0, com.android.framework.protobuf.ExtensionSchema<?> p1, com.android.framework.protobuf.MessageLite p2) {}
    static <T extends java.lang.Object> com.android.framework.protobuf.MessageSetSchema<T> newSchema(com.android.framework.protobuf.UnknownFieldSchema<?, ?> p0, com.android.framework.protobuf.ExtensionSchema<?> p1, com.android.framework.protobuf.MessageLite p2) { return null; }
    public T newInstance() { return null; }
    public boolean equals(T p0, T p1) { return false; }
    public int hashCode(T p0) { return 0; }
    public void mergeFrom(T p0, T p1) {}
    public void writeTo(T p0, com.android.framework.protobuf.Writer p1) throws java.io.IOException {}
    private <UT extends java.lang.Object, UB extends java.lang.Object> void writeUnknownFieldsHelper(com.android.framework.protobuf.UnknownFieldSchema<UT, UB> p0, T p1, com.android.framework.protobuf.Writer p2) throws java.io.IOException {}
    public void mergeFrom(T p0, byte[] p1, int p2, int p3, com.android.framework.protobuf.ArrayDecoders.Registers p4) throws java.io.IOException {}
    public void mergeFrom(T p0, com.android.framework.protobuf.Reader p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
    private <UT extends java.lang.Object, UB extends java.lang.Object, ET extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.android.framework.protobuf.UnknownFieldSchema<UT, UB> p0, com.android.framework.protobuf.ExtensionSchema<ET> p1, T p2, com.android.framework.protobuf.Reader p3, com.android.framework.protobuf.ExtensionRegistryLite p4) throws java.io.IOException {}
    public void makeImmutable(T p0) {}
    private <UT extends java.lang.Object, UB extends java.lang.Object, ET extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(com.android.framework.protobuf.Reader p0, com.android.framework.protobuf.ExtensionRegistryLite p1, com.android.framework.protobuf.ExtensionSchema<ET> p2, com.android.framework.protobuf.FieldSet<ET> p3, com.android.framework.protobuf.UnknownFieldSchema<UT, UB> p4, UB p5) throws java.io.IOException { return false; }
    public final boolean isInitialized(T p0) { return false; }
    public int getSerializedSize(T p0) { return 0; }
    private <UT extends java.lang.Object, UB extends java.lang.Object> int getUnknownFieldsSerializedSize(com.android.framework.protobuf.UnknownFieldSchema<UT, UB> p0, T p1) { return 0; }
}
