package com.android.framework.protobuf;

final class CodedInputStreamReader implements com.android.framework.protobuf.Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET = 0;
    private final com.android.framework.protobuf.CodedInputStream input = null;
    private int tag;
    private int endGroupTag;
    private int nextTag;
    public static com.android.framework.protobuf.CodedInputStreamReader forCodedInput(com.android.framework.protobuf.CodedInputStream p0) { return null; }
    private CodedInputStreamReader(com.android.framework.protobuf.CodedInputStream p0) {}
    public boolean shouldDiscardUnknownFields() { return false; }
    public int getFieldNumber() throws java.io.IOException { return 0; }
    public int getTag() { return 0; }
    public boolean skipField() throws java.io.IOException { return false; }
    private void requireWireType(int p0) throws java.io.IOException {}
    public double readDouble() throws java.io.IOException { return 0.0; }
    public float readFloat() throws java.io.IOException { return 0.0f; }
    public long readUInt64() throws java.io.IOException { return 0L; }
    public long readInt64() throws java.io.IOException { return 0L; }
    public int readInt32() throws java.io.IOException { return 0; }
    public long readFixed64() throws java.io.IOException { return 0L; }
    public int readFixed32() throws java.io.IOException { return 0; }
    public boolean readBool() throws java.io.IOException { return false; }
    public java.lang.String readString() throws java.io.IOException { return null; }
    public java.lang.String readStringRequireUtf8() throws java.io.IOException { return null; }
    public <T extends java.lang.Object> T readMessage(java.lang.Class<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
    public <T extends java.lang.Object> T readMessageBySchemaWithCheck(com.android.framework.protobuf.Schema<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
    public <T extends java.lang.Object> T readGroup(java.lang.Class<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
    public <T extends java.lang.Object> T readGroupBySchemaWithCheck(com.android.framework.protobuf.Schema<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
    private <T extends java.lang.Object> T readMessage(com.android.framework.protobuf.Schema<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
    private <T extends java.lang.Object> T readGroup(com.android.framework.protobuf.Schema<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
    public com.android.framework.protobuf.ByteString readBytes() throws java.io.IOException { return null; }
    public int readUInt32() throws java.io.IOException { return 0; }
    public int readEnum() throws java.io.IOException { return 0; }
    public int readSFixed32() throws java.io.IOException { return 0; }
    public long readSFixed64() throws java.io.IOException { return 0L; }
    public int readSInt32() throws java.io.IOException { return 0; }
    public long readSInt64() throws java.io.IOException { return 0L; }
    public void readDoubleList(java.util.List<java.lang.Double> p0) throws java.io.IOException {}
    public void readFloatList(java.util.List<java.lang.Float> p0) throws java.io.IOException {}
    public void readUInt64List(java.util.List<java.lang.Long> p0) throws java.io.IOException {}
    public void readInt64List(java.util.List<java.lang.Long> p0) throws java.io.IOException {}
    public void readInt32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException {}
    public void readFixed64List(java.util.List<java.lang.Long> p0) throws java.io.IOException {}
    public void readFixed32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException {}
    public void readBoolList(java.util.List<java.lang.Boolean> p0) throws java.io.IOException {}
    public void readStringList(java.util.List<java.lang.String> p0) throws java.io.IOException {}
    public void readStringListRequireUtf8(java.util.List<java.lang.String> p0) throws java.io.IOException {}
    public void readStringListInternal(java.util.List<java.lang.String> p0, boolean p1) throws java.io.IOException {}
    public <T extends java.lang.Object> void readMessageList(java.util.List<T> p0, java.lang.Class<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
    public <T extends java.lang.Object> void readMessageList(java.util.List<T> p0, com.android.framework.protobuf.Schema<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
    public <T extends java.lang.Object> void readGroupList(java.util.List<T> p0, java.lang.Class<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
    public <T extends java.lang.Object> void readGroupList(java.util.List<T> p0, com.android.framework.protobuf.Schema<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
    public void readBytesList(java.util.List<com.android.framework.protobuf.ByteString> p0) throws java.io.IOException {}
    public void readUInt32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException {}
    public void readEnumList(java.util.List<java.lang.Integer> p0) throws java.io.IOException {}
    public void readSFixed32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException {}
    public void readSFixed64List(java.util.List<java.lang.Long> p0) throws java.io.IOException {}
    public void readSInt32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException {}
    public void readSInt64List(java.util.List<java.lang.Long> p0) throws java.io.IOException {}
    private void verifyPackedFixed64Length(int p0) throws java.io.IOException {}
    public <K extends java.lang.Object, V extends java.lang.Object> void readMap(java.util.Map<K, V> p0, com.android.framework.protobuf.MapEntryLite.Metadata<K, V> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
    private java.lang.Object readField(com.android.framework.protobuf.WireFormat.FieldType p0, java.lang.Class<?> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException { return null; }
    private void verifyPackedFixed32Length(int p0) throws java.io.IOException {}
    private void requirePosition(int p0) throws java.io.IOException {}
}
