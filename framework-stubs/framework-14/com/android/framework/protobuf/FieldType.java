package com.android.framework.protobuf;

public enum FieldType {
    DOUBLE,
    FLOAT,
    INT64,
    UINT64,
    INT32,
    FIXED64,
    FIXED32,
    BOOL,
    STRING,
    MESSAGE,
    BYTES,
    UINT32,
    ENUM,
    SFIXED32,
    SFIXED64,
    SINT32,
    SINT64,
    GROUP,
    DOUBLE_LIST,
    FLOAT_LIST,
    INT64_LIST,
    UINT64_LIST,
    INT32_LIST,
    FIXED64_LIST,
    FIXED32_LIST,
    BOOL_LIST,
    STRING_LIST,
    MESSAGE_LIST,
    BYTES_LIST,
    UINT32_LIST,
    ENUM_LIST,
    SFIXED32_LIST,
    SFIXED64_LIST,
    SINT32_LIST,
    SINT64_LIST,
    DOUBLE_LIST_PACKED,
    FLOAT_LIST_PACKED,
    INT64_LIST_PACKED,
    UINT64_LIST_PACKED,
    INT32_LIST_PACKED,
    FIXED64_LIST_PACKED,
    FIXED32_LIST_PACKED,
    BOOL_LIST_PACKED,
    UINT32_LIST_PACKED,
    ENUM_LIST_PACKED,
    SFIXED32_LIST_PACKED,
    SFIXED64_LIST_PACKED,
    SINT32_LIST_PACKED,
    SINT64_LIST_PACKED,
    GROUP_LIST,
    MAP;
    public int id() { return 0; }
    public com.android.framework.protobuf.JavaType getJavaType() { return null; }
    public boolean isPacked() { return false; }
    public boolean isPrimitiveScalar() { return false; }
    public boolean isScalar() { return false; }
    public boolean isList() { return false; }
    public boolean isMap() { return false; }
    public boolean isValidForField(java.lang.reflect.Field p0) { return false; }
    public static com.android.framework.protobuf.FieldType forId(int p0) { return null; }

    static enum Collection {
        SCALAR,
        VECTOR,
        PACKED_VECTOR,
        MAP;
        public boolean isList() { return false; }
    }
}
