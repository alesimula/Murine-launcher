package com.android.framework.protobuf;

final class StructuralMessageInfo implements com.android.framework.protobuf.MessageInfo {
    private final com.android.framework.protobuf.ProtoSyntax syntax = null;
    private final boolean messageSetWireFormat = false;
    private final int[] checkInitialized = null;
    private final com.android.framework.protobuf.FieldInfo[] fields = null;
    private final com.android.framework.protobuf.MessageLite defaultInstance = null;
    StructuralMessageInfo(com.android.framework.protobuf.ProtoSyntax p0, boolean p1, int[] p2, com.android.framework.protobuf.FieldInfo[] p3, java.lang.Object p4) {}
    public com.android.framework.protobuf.ProtoSyntax getSyntax() { return null; }
    public boolean isMessageSetWireFormat() { return false; }
    public int[] getCheckInitialized() { return null; }
    public com.android.framework.protobuf.FieldInfo[] getFields() { return null; }
    public com.android.framework.protobuf.MessageLite getDefaultInstance() { return null; }
    public static com.android.framework.protobuf.StructuralMessageInfo.Builder newBuilder() { return null; }
    public static com.android.framework.protobuf.StructuralMessageInfo.Builder newBuilder(int p0) { return null; }

    public static final class Builder {
        private final java.util.List<com.android.framework.protobuf.FieldInfo> fields = null;
        private com.android.framework.protobuf.ProtoSyntax syntax;
        private boolean wasBuilt;
        private boolean messageSetWireFormat;
        private int[] checkInitialized;
        private java.lang.Object defaultInstance;
        public Builder() {}
        public Builder(int p0) {}
        public void withDefaultInstance(java.lang.Object p0) {}
        public void withSyntax(com.android.framework.protobuf.ProtoSyntax p0) {}
        public void withMessageSetWireFormat(boolean p0) {}
        public void withCheckInitialized(int[] p0) {}
        public void withField(com.android.framework.protobuf.FieldInfo p0) {}
        public com.android.framework.protobuf.StructuralMessageInfo build() { return null; }
    }
}
