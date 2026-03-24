package com.android.framework.protobuf;

@com.android.framework.protobuf.CheckReturnValue
abstract class ExtensionSchema<T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> {
    ExtensionSchema() {}
    abstract boolean hasExtensions(com.android.framework.protobuf.MessageLite p0);
    abstract com.android.framework.protobuf.FieldSet<T> getExtensions(java.lang.Object p0);
    abstract void setExtensions(java.lang.Object p0, com.android.framework.protobuf.FieldSet<T> p1);
    abstract com.android.framework.protobuf.FieldSet<T> getMutableExtensions(java.lang.Object p0);
    abstract void makeImmutable(java.lang.Object p0);
    abstract <UT extends java.lang.Object, UB extends java.lang.Object> UB parseExtension(java.lang.Object p0, com.android.framework.protobuf.Reader p1, java.lang.Object p2, com.android.framework.protobuf.ExtensionRegistryLite p3, com.android.framework.protobuf.FieldSet<T> p4, UB p5, com.android.framework.protobuf.UnknownFieldSchema<UT, UB> p6) throws java.io.IOException;
    abstract int extensionNumber(java.util.Map.Entry<?, ?> p0);
    abstract void serializeExtension(com.android.framework.protobuf.Writer p0, java.util.Map.Entry<?, ?> p1) throws java.io.IOException;
    abstract java.lang.Object findExtensionByNumber(com.android.framework.protobuf.ExtensionRegistryLite p0, com.android.framework.protobuf.MessageLite p1, int p2);
    abstract void parseLengthPrefixedMessageSetItem(com.android.framework.protobuf.Reader p0, java.lang.Object p1, com.android.framework.protobuf.ExtensionRegistryLite p2, com.android.framework.protobuf.FieldSet<T> p3) throws java.io.IOException;
    abstract void parseMessageSetItem(com.android.framework.protobuf.ByteString p0, java.lang.Object p1, com.android.framework.protobuf.ExtensionRegistryLite p2, com.android.framework.protobuf.FieldSet<T> p3) throws java.io.IOException;
}
