package com.android.framework.protobuf;

final class FieldSet<FieldDescriptorType extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<FieldDescriptorType>> {
    public static <T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> com.android.framework.protobuf.FieldSet<T> newFieldSet() { return null; }
    public static <T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> com.android.framework.protobuf.FieldSet<T> emptySet() { return null; }
    boolean isEmpty() { return false; }
    public void makeImmutable() {}
    public boolean isImmutable() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public com.android.framework.protobuf.FieldSet<FieldDescriptorType> clone() { return null; }
    public void clear() {}
    public java.util.Map<FieldDescriptorType, java.lang.Object> getAllFields() { return null; }
    public java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> iterator() { return null; }
    java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> descendingIterator() { return null; }
    public boolean hasField(FieldDescriptorType p0) { return false; }
    public java.lang.Object getField(FieldDescriptorType p0) { return null; }
    public void setField(FieldDescriptorType p0, java.lang.Object p1) {}
    public void clearField(FieldDescriptorType p0) {}
    public int getRepeatedFieldCount(FieldDescriptorType p0) { return 0; }
    public java.lang.Object getRepeatedField(FieldDescriptorType p0, int p1) { return null; }
    public void setRepeatedField(FieldDescriptorType p0, int p1, java.lang.Object p2) {}
    public void addRepeatedField(FieldDescriptorType p0, java.lang.Object p1) {}
    public boolean isInitialized() { return false; }
    static int getWireFormatForFieldType(com.android.framework.protobuf.WireFormat.FieldType p0, boolean p1) { return 0; }
    public void mergeFrom(com.android.framework.protobuf.FieldSet<FieldDescriptorType> p0) {}
    public static java.lang.Object readPrimitiveField(com.android.framework.protobuf.CodedInputStream p0, com.android.framework.protobuf.WireFormat.FieldType p1, boolean p2) throws java.io.IOException { return null; }
    public void writeTo(com.android.framework.protobuf.CodedOutputStream p0) throws java.io.IOException {}
    public void writeMessageSetTo(com.android.framework.protobuf.CodedOutputStream p0) throws java.io.IOException {}
    static void writeElement(com.android.framework.protobuf.CodedOutputStream p0, com.android.framework.protobuf.WireFormat.FieldType p1, int p2, java.lang.Object p3) throws java.io.IOException {}
    static void writeElementNoTag(com.android.framework.protobuf.CodedOutputStream p0, com.android.framework.protobuf.WireFormat.FieldType p1, java.lang.Object p2) throws java.io.IOException {}
    public static void writeField(com.android.framework.protobuf.FieldSet.FieldDescriptorLite<?> p0, java.lang.Object p1, com.android.framework.protobuf.CodedOutputStream p2) throws java.io.IOException {}
    public int getSerializedSize() { return 0; }
    public int getMessageSetSerializedSize() { return 0; }
    static int computeElementSize(com.android.framework.protobuf.WireFormat.FieldType p0, int p1, java.lang.Object p2) { return 0; }
    static int computeElementSizeNoTag(com.android.framework.protobuf.WireFormat.FieldType p0, java.lang.Object p1) { return 0; }
    public static int computeFieldSize(com.android.framework.protobuf.FieldSet.FieldDescriptorLite<?> p0, java.lang.Object p1) { return 0; }

    public static interface FieldDescriptorLite<T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> extends java.lang.Comparable<T> {
        public int getNumber();
        public com.android.framework.protobuf.WireFormat.FieldType getLiteType();
        public com.android.framework.protobuf.WireFormat.JavaType getLiteJavaType();
        public boolean isRepeated();
        public boolean isPacked();
        public com.android.framework.protobuf.Internal.EnumLiteMap<?> getEnumType();
        public com.android.framework.protobuf.MessageLite.Builder internalMergeFrom(com.android.framework.protobuf.MessageLite.Builder p0, com.android.framework.protobuf.MessageLite p1);
    }
}
