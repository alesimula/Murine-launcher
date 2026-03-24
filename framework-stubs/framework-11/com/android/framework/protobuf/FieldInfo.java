package com.android.framework.protobuf;

final class FieldInfo implements java.lang.Comparable<com.android.framework.protobuf.FieldInfo> {
    private final java.lang.reflect.Field field = null;
    private final com.android.framework.protobuf.FieldType type = null;
    private final java.lang.Class<?> messageClass = null;
    private final int fieldNumber = 0;
    private final java.lang.reflect.Field presenceField = null;
    private final int presenceMask = 0;
    private final boolean required = false;
    private final boolean enforceUtf8 = false;
    private final com.android.framework.protobuf.OneofInfo oneof = null;
    private final java.lang.reflect.Field cachedSizeField = null;
    private final java.lang.Class<?> oneofStoredType = null;
    private final java.lang.Object mapDefaultEntry = null;
    private final com.android.framework.protobuf.Internal.EnumVerifier enumVerifier = null;
    public static com.android.framework.protobuf.FieldInfo forField(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, boolean p3) { return null; }
    public static com.android.framework.protobuf.FieldInfo forPackedField(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, java.lang.reflect.Field p3) { return null; }
    public static com.android.framework.protobuf.FieldInfo forRepeatedMessageField(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, java.lang.Class<?> p3) { return null; }
    public static com.android.framework.protobuf.FieldInfo forFieldWithEnumVerifier(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, com.android.framework.protobuf.Internal.EnumVerifier p3) { return null; }
    public static com.android.framework.protobuf.FieldInfo forPackedFieldWithEnumVerifier(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, com.android.framework.protobuf.Internal.EnumVerifier p3, java.lang.reflect.Field p4) { return null; }
    public static com.android.framework.protobuf.FieldInfo forProto2OptionalField(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, java.lang.reflect.Field p3, int p4, boolean p5, com.android.framework.protobuf.Internal.EnumVerifier p6) { return null; }
    public static com.android.framework.protobuf.FieldInfo forOneofMemberField(int p0, com.android.framework.protobuf.FieldType p1, com.android.framework.protobuf.OneofInfo p2, java.lang.Class<?> p3, boolean p4, com.android.framework.protobuf.Internal.EnumVerifier p5) { return null; }
    private static void checkFieldNumber(int p0) {}
    public static com.android.framework.protobuf.FieldInfo forProto2RequiredField(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, java.lang.reflect.Field p3, int p4, boolean p5, com.android.framework.protobuf.Internal.EnumVerifier p6) { return null; }
    public static com.android.framework.protobuf.FieldInfo forMapField(java.lang.reflect.Field p0, int p1, java.lang.Object p2, com.android.framework.protobuf.Internal.EnumVerifier p3) { return null; }
    private FieldInfo(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, java.lang.Class<?> p3, java.lang.reflect.Field p4, int p5, boolean p6, boolean p7, com.android.framework.protobuf.OneofInfo p8, java.lang.Class<?> p9, java.lang.Object p10, com.android.framework.protobuf.Internal.EnumVerifier p11, java.lang.reflect.Field p12) {}
    public int getFieldNumber() { return 0; }
    public java.lang.reflect.Field getField() { return null; }
    public com.android.framework.protobuf.FieldType getType() { return null; }
    public com.android.framework.protobuf.OneofInfo getOneof() { return null; }
    public java.lang.Class<?> getOneofStoredType() { return null; }
    public com.android.framework.protobuf.Internal.EnumVerifier getEnumVerifier() { return null; }
    public int compareTo(com.android.framework.protobuf.FieldInfo p0) { return 0; }
    public java.lang.Class<?> getListElementType() { return null; }
    public java.lang.reflect.Field getPresenceField() { return null; }
    public java.lang.Object getMapDefaultEntry() { return null; }
    public int getPresenceMask() { return 0; }
    public boolean isRequired() { return false; }
    public boolean isEnforceUtf8() { return false; }
    public java.lang.reflect.Field getCachedSizeField() { return null; }
    public java.lang.Class<?> getMessageFieldClass() { return null; }
    public static com.android.framework.protobuf.FieldInfo.Builder newBuilder() { return null; }
    private static boolean isExactlyOneBitSet(int p0) { return false; }

    public static final class Builder {
        private java.lang.reflect.Field field;
        private com.android.framework.protobuf.FieldType type;
        private int fieldNumber;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private boolean enforceUtf8;
        private com.android.framework.protobuf.OneofInfo oneof;
        private java.lang.Class<?> oneofStoredType;
        private java.lang.Object mapDefaultEntry;
        private com.android.framework.protobuf.Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field cachedSizeField;
        private Builder() {}
        public com.android.framework.protobuf.FieldInfo.Builder withField(java.lang.reflect.Field p0) { return null; }
        public com.android.framework.protobuf.FieldInfo.Builder withType(com.android.framework.protobuf.FieldType p0) { return null; }
        public com.android.framework.protobuf.FieldInfo.Builder withFieldNumber(int p0) { return null; }
        public com.android.framework.protobuf.FieldInfo.Builder withPresence(java.lang.reflect.Field p0, int p1) { return null; }
        public com.android.framework.protobuf.FieldInfo.Builder withOneof(com.android.framework.protobuf.OneofInfo p0, java.lang.Class<?> p1) { return null; }
        public com.android.framework.protobuf.FieldInfo.Builder withRequired(boolean p0) { return null; }
        public com.android.framework.protobuf.FieldInfo.Builder withMapDefaultEntry(java.lang.Object p0) { return null; }
        public com.android.framework.protobuf.FieldInfo.Builder withEnforceUtf8(boolean p0) { return null; }
        public com.android.framework.protobuf.FieldInfo.Builder withEnumVerifier(com.android.framework.protobuf.Internal.EnumVerifier p0) { return null; }
        public com.android.framework.protobuf.FieldInfo.Builder withCachedSizeField(java.lang.reflect.Field p0) { return null; }
        public com.android.framework.protobuf.FieldInfo build() { return null; }
    }
}
