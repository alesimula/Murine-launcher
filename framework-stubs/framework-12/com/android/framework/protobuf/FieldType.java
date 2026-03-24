package com.android.framework.protobuf;

public enum FieldType {
    DOUBLE((com.android.framework.protobuf.JavaType)null),
    FLOAT((com.android.framework.protobuf.JavaType)null),
    INT64((com.android.framework.protobuf.JavaType)null),
    UINT64((com.android.framework.protobuf.JavaType)null),
    INT32((com.android.framework.protobuf.JavaType)null),
    FIXED64((com.android.framework.protobuf.JavaType)null),
    FIXED32((com.android.framework.protobuf.JavaType)null),
    BOOL((com.android.framework.protobuf.JavaType)null),
    STRING((com.android.framework.protobuf.JavaType)null),
    MESSAGE((com.android.framework.protobuf.JavaType)null),
    BYTES((com.android.framework.protobuf.JavaType)null),
    UINT32((com.android.framework.protobuf.JavaType)null),
    ENUM((com.android.framework.protobuf.JavaType)null),
    SFIXED32((com.android.framework.protobuf.JavaType)null),
    SFIXED64((com.android.framework.protobuf.JavaType)null),
    SINT32((com.android.framework.protobuf.JavaType)null),
    SINT64((com.android.framework.protobuf.JavaType)null),
    GROUP((com.android.framework.protobuf.JavaType)null),
    DOUBLE_LIST((com.android.framework.protobuf.JavaType)null),
    FLOAT_LIST((com.android.framework.protobuf.JavaType)null),
    INT64_LIST((com.android.framework.protobuf.JavaType)null),
    UINT64_LIST((com.android.framework.protobuf.JavaType)null),
    INT32_LIST((com.android.framework.protobuf.JavaType)null),
    FIXED64_LIST((com.android.framework.protobuf.JavaType)null),
    FIXED32_LIST((com.android.framework.protobuf.JavaType)null),
    BOOL_LIST((com.android.framework.protobuf.JavaType)null),
    STRING_LIST((com.android.framework.protobuf.JavaType)null),
    MESSAGE_LIST((com.android.framework.protobuf.JavaType)null),
    BYTES_LIST((com.android.framework.protobuf.JavaType)null),
    UINT32_LIST((com.android.framework.protobuf.JavaType)null),
    ENUM_LIST((com.android.framework.protobuf.JavaType)null),
    SFIXED32_LIST((com.android.framework.protobuf.JavaType)null),
    SFIXED64_LIST((com.android.framework.protobuf.JavaType)null),
    SINT32_LIST((com.android.framework.protobuf.JavaType)null),
    SINT64_LIST((com.android.framework.protobuf.JavaType)null),
    DOUBLE_LIST_PACKED((com.android.framework.protobuf.JavaType)null),
    FLOAT_LIST_PACKED((com.android.framework.protobuf.JavaType)null),
    INT64_LIST_PACKED((com.android.framework.protobuf.JavaType)null),
    UINT64_LIST_PACKED((com.android.framework.protobuf.JavaType)null),
    INT32_LIST_PACKED((com.android.framework.protobuf.JavaType)null),
    FIXED64_LIST_PACKED((com.android.framework.protobuf.JavaType)null),
    FIXED32_LIST_PACKED((com.android.framework.protobuf.JavaType)null),
    BOOL_LIST_PACKED((com.android.framework.protobuf.JavaType)null),
    UINT32_LIST_PACKED((com.android.framework.protobuf.JavaType)null),
    ENUM_LIST_PACKED((com.android.framework.protobuf.JavaType)null),
    SFIXED32_LIST_PACKED((com.android.framework.protobuf.JavaType)null),
    SFIXED64_LIST_PACKED((com.android.framework.protobuf.JavaType)null),
    SINT32_LIST_PACKED((com.android.framework.protobuf.JavaType)null),
    SINT64_LIST_PACKED((com.android.framework.protobuf.JavaType)null),
    GROUP_LIST((com.android.framework.protobuf.JavaType)null),
    MAP((com.android.framework.protobuf.JavaType)null);
    private final com.android.framework.protobuf.JavaType javaType = null;
    private final int id = 0;
    private final com.android.framework.protobuf.FieldType.Collection collection = null;
    private final java.lang.Class<?> elementType = null;
    private final boolean primitiveScalar = false;
    private static final com.android.framework.protobuf.FieldType[] VALUES = null;
    private static final java.lang.reflect.Type[] EMPTY_TYPES = null;
    private FieldType(com.android.framework.protobuf.JavaType p0) {}
    public int id() { return 0; }
    public com.android.framework.protobuf.JavaType getJavaType() { return null; }
    public boolean isPacked() { return false; }
    public boolean isPrimitiveScalar() { return false; }
    public boolean isScalar() { return false; }
    public boolean isList() { return false; }
    public boolean isMap() { return false; }
    public boolean isValidForField(java.lang.reflect.Field p0) { return false; }
    private boolean isValidForList(java.lang.reflect.Field p0) { return false; }
    public static com.android.framework.protobuf.FieldType forId(int p0) { return null; }
    private static java.lang.reflect.Type getGenericSuperList(java.lang.Class<?> p0) { return null; }
    private static java.lang.reflect.Type getListParameter(java.lang.Class<?> p0, java.lang.reflect.Type[] p1) { return null; }

    static enum Collection {
        SCALAR,
        VECTOR,
        PACKED_VECTOR,
        MAP;
        private final boolean isList = false;
        private Collection() {}
        public boolean isList() { return false; }
    }
}
