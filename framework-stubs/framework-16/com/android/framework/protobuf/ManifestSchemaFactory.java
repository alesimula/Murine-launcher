package com.android.framework.protobuf;

@com.android.framework.protobuf.CheckReturnValue
final class ManifestSchemaFactory implements com.android.framework.protobuf.SchemaFactory {
    public ManifestSchemaFactory() {}
    public <T extends java.lang.Object> com.android.framework.protobuf.Schema<T> createSchema(java.lang.Class<T> p0) { return null; }

    private static class CompositeMessageInfoFactory implements com.android.framework.protobuf.MessageInfoFactory {
        CompositeMessageInfoFactory(com.android.framework.protobuf.MessageInfoFactory... p0) {}
        public boolean isSupported(java.lang.Class<?> p0) { return false; }
        public com.android.framework.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> p0) { return null; }
    }
}
