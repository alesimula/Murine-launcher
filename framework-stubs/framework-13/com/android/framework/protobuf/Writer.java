package com.android.framework.protobuf;

interface Writer {
    public com.android.framework.protobuf.Writer.FieldOrder fieldOrder();
    public void writeSFixed32(int p0, int p1) throws java.io.IOException;
    public void writeInt64(int p0, long p1) throws java.io.IOException;
    public void writeSFixed64(int p0, long p1) throws java.io.IOException;
    public void writeFloat(int p0, float p1) throws java.io.IOException;
    public void writeDouble(int p0, double p1) throws java.io.IOException;
    public void writeEnum(int p0, int p1) throws java.io.IOException;
    public void writeUInt64(int p0, long p1) throws java.io.IOException;
    public void writeInt32(int p0, int p1) throws java.io.IOException;
    public void writeFixed64(int p0, long p1) throws java.io.IOException;
    public void writeFixed32(int p0, int p1) throws java.io.IOException;
    public void writeBool(int p0, boolean p1) throws java.io.IOException;
    public void writeString(int p0, java.lang.String p1) throws java.io.IOException;
    public void writeBytes(int p0, com.android.framework.protobuf.ByteString p1) throws java.io.IOException;
    public void writeUInt32(int p0, int p1) throws java.io.IOException;
    public void writeSInt32(int p0, int p1) throws java.io.IOException;
    public void writeSInt64(int p0, long p1) throws java.io.IOException;
    public void writeMessage(int p0, java.lang.Object p1) throws java.io.IOException;
    public void writeMessage(int p0, java.lang.Object p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException;
    @java.lang.Deprecated
    public void writeGroup(int p0, java.lang.Object p1) throws java.io.IOException;
    @java.lang.Deprecated
    public void writeGroup(int p0, java.lang.Object p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException;
    @java.lang.Deprecated
    public void writeStartGroup(int p0) throws java.io.IOException;
    @java.lang.Deprecated
    public void writeEndGroup(int p0) throws java.io.IOException;
    public void writeInt32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException;
    public void writeFixed32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException;
    public void writeInt64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException;
    public void writeUInt64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException;
    public void writeFixed64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException;
    public void writeFloatList(int p0, java.util.List<java.lang.Float> p1, boolean p2) throws java.io.IOException;
    public void writeDoubleList(int p0, java.util.List<java.lang.Double> p1, boolean p2) throws java.io.IOException;
    public void writeEnumList(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException;
    public void writeBoolList(int p0, java.util.List<java.lang.Boolean> p1, boolean p2) throws java.io.IOException;
    public void writeStringList(int p0, java.util.List<java.lang.String> p1) throws java.io.IOException;
    public void writeBytesList(int p0, java.util.List<com.android.framework.protobuf.ByteString> p1) throws java.io.IOException;
    public void writeUInt32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException;
    public void writeSFixed32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException;
    public void writeSFixed64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException;
    public void writeSInt32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException;
    public void writeSInt64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException;
    public void writeMessageList(int p0, java.util.List<?> p1) throws java.io.IOException;
    public void writeMessageList(int p0, java.util.List<?> p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException;
    @java.lang.Deprecated
    public void writeGroupList(int p0, java.util.List<?> p1) throws java.io.IOException;
    @java.lang.Deprecated
    public void writeGroupList(int p0, java.util.List<?> p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException;
    public void writeMessageSetItem(int p0, java.lang.Object p1) throws java.io.IOException;
    public <K extends java.lang.Object, V extends java.lang.Object> void writeMap(int p0, com.android.framework.protobuf.MapEntryLite.Metadata<K, V> p1, java.util.Map<K, V> p2) throws java.io.IOException;

    public static enum FieldOrder {
        ASCENDING,
        DESCENDING;
    }
}
