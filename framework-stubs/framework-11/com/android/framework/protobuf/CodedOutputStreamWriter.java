package com.android.framework.protobuf;

final class CodedOutputStreamWriter implements com.android.framework.protobuf.Writer {
    private final com.android.framework.protobuf.CodedOutputStream output = null;
    public static com.android.framework.protobuf.CodedOutputStreamWriter forCodedOutput(com.android.framework.protobuf.CodedOutputStream p0) { return null; }
    private CodedOutputStreamWriter(com.android.framework.protobuf.CodedOutputStream p0) {}
    public com.android.framework.protobuf.Writer.FieldOrder fieldOrder() { return null; }
    public int getTotalBytesWritten() { return 0; }
    public void writeSFixed32(int p0, int p1) throws java.io.IOException {}
    public void writeInt64(int p0, long p1) throws java.io.IOException {}
    public void writeSFixed64(int p0, long p1) throws java.io.IOException {}
    public void writeFloat(int p0, float p1) throws java.io.IOException {}
    public void writeDouble(int p0, double p1) throws java.io.IOException {}
    public void writeEnum(int p0, int p1) throws java.io.IOException {}
    public void writeUInt64(int p0, long p1) throws java.io.IOException {}
    public void writeInt32(int p0, int p1) throws java.io.IOException {}
    public void writeFixed64(int p0, long p1) throws java.io.IOException {}
    public void writeFixed32(int p0, int p1) throws java.io.IOException {}
    public void writeBool(int p0, boolean p1) throws java.io.IOException {}
    public void writeString(int p0, java.lang.String p1) throws java.io.IOException {}
    public void writeBytes(int p0, com.android.framework.protobuf.ByteString p1) throws java.io.IOException {}
    public void writeUInt32(int p0, int p1) throws java.io.IOException {}
    public void writeSInt32(int p0, int p1) throws java.io.IOException {}
    public void writeSInt64(int p0, long p1) throws java.io.IOException {}
    public void writeMessage(int p0, java.lang.Object p1) throws java.io.IOException {}
    public void writeMessage(int p0, java.lang.Object p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException {}
    public void writeGroup(int p0, java.lang.Object p1) throws java.io.IOException {}
    public void writeGroup(int p0, java.lang.Object p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException {}
    public void writeStartGroup(int p0) throws java.io.IOException {}
    public void writeEndGroup(int p0) throws java.io.IOException {}
    public final void writeMessageSetItem(int p0, java.lang.Object p1) throws java.io.IOException {}
    public void writeInt32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    public void writeFixed32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    public void writeInt64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException {}
    public void writeUInt64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException {}
    public void writeFixed64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException {}
    public void writeFloatList(int p0, java.util.List<java.lang.Float> p1, boolean p2) throws java.io.IOException {}
    public void writeDoubleList(int p0, java.util.List<java.lang.Double> p1, boolean p2) throws java.io.IOException {}
    public void writeEnumList(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    public void writeBoolList(int p0, java.util.List<java.lang.Boolean> p1, boolean p2) throws java.io.IOException {}
    public void writeStringList(int p0, java.util.List<java.lang.String> p1) throws java.io.IOException {}
    private void writeLazyString(int p0, java.lang.Object p1) throws java.io.IOException {}
    public void writeBytesList(int p0, java.util.List<com.android.framework.protobuf.ByteString> p1) throws java.io.IOException {}
    public void writeUInt32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    public void writeSFixed32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    public void writeSFixed64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException {}
    public void writeSInt32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    public void writeSInt64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException {}
    public void writeMessageList(int p0, java.util.List<?> p1) throws java.io.IOException {}
    public void writeMessageList(int p0, java.util.List<?> p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException {}
    public void writeGroupList(int p0, java.util.List<?> p1) throws java.io.IOException {}
    public void writeGroupList(int p0, java.util.List<?> p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException {}
    public <K extends java.lang.Object, V extends java.lang.Object> void writeMap(int p0, com.android.framework.protobuf.MapEntryLite.Metadata<K, V> p1, java.util.Map<K, V> p2) throws java.io.IOException {}
    private <K extends java.lang.Object, V extends java.lang.Object> void writeDeterministicMap(int p0, com.android.framework.protobuf.MapEntryLite.Metadata<K, V> p1, java.util.Map<K, V> p2) throws java.io.IOException {}
    private <V extends java.lang.Object> void writeDeterministicBooleanMapEntry(int p0, boolean p1, V p2, com.android.framework.protobuf.MapEntryLite.Metadata<java.lang.Boolean, V> p3) throws java.io.IOException {}
    private <V extends java.lang.Object> void writeDeterministicIntegerMap(int p0, com.android.framework.protobuf.MapEntryLite.Metadata<java.lang.Integer, V> p1, java.util.Map<java.lang.Integer, V> p2) throws java.io.IOException {}
    private <V extends java.lang.Object> void writeDeterministicLongMap(int p0, com.android.framework.protobuf.MapEntryLite.Metadata<java.lang.Long, V> p1, java.util.Map<java.lang.Long, V> p2) throws java.io.IOException {}
    private <V extends java.lang.Object> void writeDeterministicStringMap(int p0, com.android.framework.protobuf.MapEntryLite.Metadata<java.lang.String, V> p1, java.util.Map<java.lang.String, V> p2) throws java.io.IOException {}
}
