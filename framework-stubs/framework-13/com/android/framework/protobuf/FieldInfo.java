package com.android.framework.protobuf;

final class FieldInfo implements java.lang.Comparable<com.android.framework.protobuf.FieldInfo> {
    public static com.android.framework.protobuf.FieldInfo forField(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, boolean p3) { return null; }
    public static com.android.framework.protobuf.FieldInfo forPackedField(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, java.lang.reflect.Field p3) { return null; }
    public static com.android.framework.protobuf.FieldInfo forRepeatedMessageField(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, java.lang.Class<?> p3) { return null; }
    public static com.android.framework.protobuf.FieldInfo forFieldWithEnumVerifier(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, com.android.framework.protobuf.Internal.EnumVerifier p3) { return null; }
    public static com.android.framework.protobuf.FieldInfo forPackedFieldWithEnumVerifier(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, com.android.framework.protobuf.Internal.EnumVerifier p3, java.lang.reflect.Field p4) { return null; }
    public static com.android.framework.protobuf.FieldInfo forProto2OptionalField(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, java.lang.reflect.Field p3, int p4, boolean p5, com.android.framework.protobuf.Internal.EnumVerifier p6) { return null; }
    public static com.android.framework.protobuf.FieldInfo forOneofMemberField(int p0, com.android.framework.protobuf.FieldType p1, com.android.framework.protobuf.OneofInfo p2, java.lang.Class<?> p3, boolean p4, com.android.framework.protobuf.Internal.EnumVerifier p5) { return null; }
    public static com.android.framework.protobuf.FieldInfo forProto2RequiredField(java.lang.reflect.Field p0, int p1, com.android.framework.protobuf.FieldType p2, java.lang.reflect.Field p3, int p4, boolean p5, com.android.framework.protobuf.Internal.EnumVerifier p6) { return null; }
    public static com.android.framework.protobuf.FieldInfo forMapField(java.lang.reflect.Field p0, int p1, java.lang.Object p2, com.android.framework.protobuf.Internal.EnumVerifier p3) { return null; }
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

    public static final class Builder {
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
