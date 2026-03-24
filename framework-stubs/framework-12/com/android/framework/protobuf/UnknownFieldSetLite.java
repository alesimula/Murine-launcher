package com.android.framework.protobuf;

public final class UnknownFieldSetLite {
    private static final int MIN_CAPACITY = 8;
    private static final com.android.framework.protobuf.UnknownFieldSetLite DEFAULT_INSTANCE = null;
    private int count;
    private int[] tags;
    private java.lang.Object[] objects;
    private int memoizedSerializedSize;
    private boolean isMutable;
    public static com.android.framework.protobuf.UnknownFieldSetLite getDefaultInstance() { return null; }
    static com.android.framework.protobuf.UnknownFieldSetLite newInstance() { return null; }
    static com.android.framework.protobuf.UnknownFieldSetLite mutableCopyOf(com.android.framework.protobuf.UnknownFieldSetLite p0, com.android.framework.protobuf.UnknownFieldSetLite p1) { return null; }
    private UnknownFieldSetLite() {}
    private UnknownFieldSetLite(int p0, int[] p1, java.lang.Object[] p2, boolean p3) {}
    public void makeImmutable() {}
    void checkMutable() {}
    public void writeTo(com.android.framework.protobuf.CodedOutputStream p0) throws java.io.IOException {}
    public void writeAsMessageSetTo(com.android.framework.protobuf.CodedOutputStream p0) throws java.io.IOException {}
    void writeAsMessageSetTo(com.android.framework.protobuf.Writer p0) throws java.io.IOException {}
    public void writeTo(com.android.framework.protobuf.Writer p0) throws java.io.IOException {}
    private static void writeField(int p0, java.lang.Object p1, com.android.framework.protobuf.Writer p2) throws java.io.IOException {}
    public int getSerializedSizeAsMessageSet() { return 0; }
    public int getSerializedSize() { return 0; }
    private static boolean equals(int[] p0, int[] p1, int p2) { return false; }
    private static boolean equals(java.lang.Object[] p0, java.lang.Object[] p1, int p2) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    private static int hashCode(int[] p0, int p1) { return 0; }
    private static int hashCode(java.lang.Object[] p0, int p1) { return 0; }
    public int hashCode() { return 0; }
    final void printWithIndent(java.lang.StringBuilder p0, int p1) {}
    void storeField(int p0, java.lang.Object p1) {}
    private void ensureCapacity() {}
    boolean mergeFieldFrom(int p0, com.android.framework.protobuf.CodedInputStream p1) throws java.io.IOException { return false; }
    com.android.framework.protobuf.UnknownFieldSetLite mergeVarintField(int p0, int p1) { return null; }
    com.android.framework.protobuf.UnknownFieldSetLite mergeLengthDelimitedField(int p0, com.android.framework.protobuf.ByteString p1) { return null; }
    private com.android.framework.protobuf.UnknownFieldSetLite mergeFrom(com.android.framework.protobuf.CodedInputStream p0) throws java.io.IOException { return null; }
}
