package com.android.framework.protobuf;

public final class WireFormat {
    static final int FIXED32_SIZE = 4;
    static final int FIXED64_SIZE = 8;
    static final int MAX_VARINT32_SIZE = 5;
    static final int MAX_VARINT64_SIZE = 10;
    static final int MAX_VARINT_SIZE = 10;
    public static final int WIRETYPE_VARINT = 0;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_ITEM_TAG = Integer.valueOf(0);
    static final int MESSAGE_SET_ITEM_END_TAG = Integer.valueOf(0);
    static final int MESSAGE_SET_TYPE_ID_TAG = Integer.valueOf(0);
    static final int MESSAGE_SET_MESSAGE_TAG = Integer.valueOf(0);
    public static int getTagWireType(int p0) { return 0; }
    public static int getTagFieldNumber(int p0) { return 0; }
    static int makeTag(int p0, int p1) { return 0; }
    static java.lang.Object readPrimitiveField(com.android.framework.protobuf.CodedInputStream p0, com.android.framework.protobuf.WireFormat.FieldType p1, com.android.framework.protobuf.WireFormat.Utf8Validation p2) throws java.io.IOException { return null; }

    public static enum FieldType {
        DOUBLE,
        FLOAT,
        INT64,
        UINT64,
        INT32,
        FIXED64,
        FIXED32,
        BOOL,
        STRING,
        GROUP,
        MESSAGE,
        BYTES,
        UINT32,
        ENUM,
        SFIXED32,
        SFIXED64,
        SINT32,
        SINT64;
        public com.android.framework.protobuf.WireFormat.JavaType getJavaType() { return null; }
        public int getWireType() { return 0; }
        public boolean isPackable() { return false; }
    }

    public static enum JavaType {
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        BOOLEAN,
        STRING,
        BYTE_STRING,
        ENUM,
        MESSAGE;
        java.lang.Object getDefaultDefault() { return null; }
    }

    static enum Utf8Validation {
        LOOSE,
        STRICT,
        LAZY;
        java.lang.Object readString(com.android.framework.protobuf.CodedInputStream p0) throws java.io.IOException { return null; }
    }
}
