package com.android.framework.protobuf;

final class ManifestSchemaFactory implements com.android.framework.protobuf.SchemaFactory {
    private final com.android.framework.protobuf.MessageInfoFactory messageInfoFactory = null;
    private static final com.android.framework.protobuf.MessageInfoFactory EMPTY_FACTORY = null;
    public ManifestSchemaFactory() {}
    private ManifestSchemaFactory(com.android.framework.protobuf.MessageInfoFactory p0) {}
    public <T extends java.lang.Object> com.android.framework.protobuf.Schema<T> createSchema(java.lang.Class<T> p0) { return null; }
    private static <T extends java.lang.Object> com.android.framework.protobuf.Schema<T> newSchema(java.lang.Class<T> p0, com.android.framework.protobuf.MessageInfo p1) { return null; }
    private static boolean isProto2(com.android.framework.protobuf.MessageInfo p0) { return false; }
    private static com.android.framework.protobuf.MessageInfoFactory getDefaultMessageInfoFactory() { return null; }
    private static com.android.framework.protobuf.MessageInfoFactory getDescriptorMessageInfoFactory() { return null; }

    private static class CompositeMessageInfoFactory implements com.android.framework.protobuf.MessageInfoFactory {
        private com.android.framework.protobuf.MessageInfoFactory[] factories;
        CompositeMessageInfoFactory(com.android.framework.protobuf.MessageInfoFactory... p0) {}
        public boolean isSupported(java.lang.Class<?> p0) { return false; }
        public com.android.framework.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> p0) { return null; }
    }
}
