package com.android.framework.protobuf;

@com.android.framework.protobuf.CheckReturnValue
interface Reader {
    public static final int READ_DONE = 2147483647;
    public static final int TAG_UNKNOWN = 0;
    public boolean shouldDiscardUnknownFields();
    public int getFieldNumber() throws java.io.IOException;
    public int getTag();
    public boolean skipField() throws java.io.IOException;
    public double readDouble() throws java.io.IOException;
    public float readFloat() throws java.io.IOException;
    public long readUInt64() throws java.io.IOException;
    public long readInt64() throws java.io.IOException;
    public int readInt32() throws java.io.IOException;
    public long readFixed64() throws java.io.IOException;
    public int readFixed32() throws java.io.IOException;
    public boolean readBool() throws java.io.IOException;
    public java.lang.String readString() throws java.io.IOException;
    public java.lang.String readStringRequireUtf8() throws java.io.IOException;
    public <T extends java.lang.Object> T readMessageBySchemaWithCheck(com.android.framework.protobuf.Schema<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException;
    public <T extends java.lang.Object> T readMessage(java.lang.Class<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException;
    @java.lang.Deprecated
    public <T extends java.lang.Object> T readGroup(java.lang.Class<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException;
    @java.lang.Deprecated
    public <T extends java.lang.Object> T readGroupBySchemaWithCheck(com.android.framework.protobuf.Schema<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException;
    public <T extends java.lang.Object> void mergeMessageField(T p0, com.android.framework.protobuf.Schema<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException;
    public <T extends java.lang.Object> void mergeGroupField(T p0, com.android.framework.protobuf.Schema<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException;
    public com.android.framework.protobuf.ByteString readBytes() throws java.io.IOException;
    public int readUInt32() throws java.io.IOException;
    public int readEnum() throws java.io.IOException;
    public int readSFixed32() throws java.io.IOException;
    public long readSFixed64() throws java.io.IOException;
    public int readSInt32() throws java.io.IOException;
    public long readSInt64() throws java.io.IOException;
    public void readDoubleList(java.util.List<java.lang.Double> p0) throws java.io.IOException;
    public void readFloatList(java.util.List<java.lang.Float> p0) throws java.io.IOException;
    public void readUInt64List(java.util.List<java.lang.Long> p0) throws java.io.IOException;
    public void readInt64List(java.util.List<java.lang.Long> p0) throws java.io.IOException;
    public void readInt32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException;
    public void readFixed64List(java.util.List<java.lang.Long> p0) throws java.io.IOException;
    public void readFixed32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException;
    public void readBoolList(java.util.List<java.lang.Boolean> p0) throws java.io.IOException;
    public void readStringList(java.util.List<java.lang.String> p0) throws java.io.IOException;
    public void readStringListRequireUtf8(java.util.List<java.lang.String> p0) throws java.io.IOException;
    public <T extends java.lang.Object> void readMessageList(java.util.List<T> p0, com.android.framework.protobuf.Schema<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException;
    public <T extends java.lang.Object> void readMessageList(java.util.List<T> p0, java.lang.Class<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException;
    @java.lang.Deprecated
    public <T extends java.lang.Object> void readGroupList(java.util.List<T> p0, java.lang.Class<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException;
    @java.lang.Deprecated
    public <T extends java.lang.Object> void readGroupList(java.util.List<T> p0, com.android.framework.protobuf.Schema<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException;
    public void readBytesList(java.util.List<com.android.framework.protobuf.ByteString> p0) throws java.io.IOException;
    public void readUInt32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException;
    public void readEnumList(java.util.List<java.lang.Integer> p0) throws java.io.IOException;
    public void readSFixed32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException;
    public void readSFixed64List(java.util.List<java.lang.Long> p0) throws java.io.IOException;
    public void readSInt32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException;
    public void readSInt64List(java.util.List<java.lang.Long> p0) throws java.io.IOException;
    public <K extends java.lang.Object, V extends java.lang.Object> void readMap(java.util.Map<K, V> p0, com.android.framework.protobuf.MapEntryLite.Metadata<K, V> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException;
}
