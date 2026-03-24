package com.android.framework.protobuf;

public class ExtensionRegistryLite {
    private static volatile boolean eagerlyParseMessageSets;
    private final java.util.Map<com.android.framework.protobuf.ExtensionRegistryLite.ObjectIntPair, com.android.framework.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber = null;
    private static final com.android.framework.protobuf.ExtensionRegistryLite EMPTY = null;
    public static boolean isEagerlyParseMessageSets() { return false; }
    public static void setEagerlyParseMessageSets(boolean p0) {}
    public static com.android.framework.protobuf.ExtensionRegistryLite newInstance() { return null; }
    public static com.android.framework.protobuf.ExtensionRegistryLite getEmptyRegistry() { return null; }
    public com.android.framework.protobuf.ExtensionRegistryLite getUnmodifiable() { return null; }
    public <ContainingType extends com.android.framework.protobuf.MessageLite> com.android.framework.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType p0, int p1) { return null; }
    public final void add(com.android.framework.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> p0) {}
    ExtensionRegistryLite() {}
    ExtensionRegistryLite(com.android.framework.protobuf.ExtensionRegistryLite p0) {}
    private ExtensionRegistryLite(boolean p0) {}

    private static final class ObjectIntPair {
        private final java.lang.Object object = null;
        private final int number = 0;
        ObjectIntPair(java.lang.Object p0, int p1) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }
}
