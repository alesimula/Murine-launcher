package com.android.internal.content.om;

public class OverlayConfig {
    static final java.lang.String TAG = "OverlayConfig";
    public static final int DEFAULT_PRIORITY = 2147483647;
    public static final java.lang.String PARTITION_ORDER_FILE_PATH = "/product/overlay/partition_order.xml";
    public OverlayConfig(java.io.File p0, java.util.function.Supplier<com.android.internal.content.om.OverlayScanner> p1, com.android.internal.content.om.OverlayConfig.PackageProvider p2) {}
    public static boolean sortPartitions(java.lang.String p0, java.util.List<com.android.internal.content.om.OverlayConfigParser.OverlayPartition> p1) { return false; }
    @android.annotation.NonNull
    public static com.android.internal.content.om.OverlayConfig getZygoteInstance() { return null; }
    @android.annotation.NonNull
    public static com.android.internal.content.om.OverlayConfig initializeSystemInstance(com.android.internal.content.om.OverlayConfig.PackageProvider p0) { return null; }
    @android.annotation.NonNull
    public static com.android.internal.content.om.OverlayConfig getSystemInstance() { return null; }
    @android.annotation.Nullable
    public com.android.internal.content.om.OverlayConfig.Configuration getConfiguration(java.lang.String p0) { return null; }
    public boolean isEnabled(java.lang.String p0) { return false; }
    public boolean isMutable(java.lang.String p0) { return false; }
    public int getPriority(java.lang.String p0) { return 0; }
    public java.util.ArrayList<com.android.internal.content.om.OverlayConfig.IdmapInvocation> getImmutableFrameworkOverlayIdmapInvocations() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] createImmutableFrameworkIdmapsInZygote() { return null; }
    public void dump(java.io.PrintWriter p0) {}
    public boolean isDefaultPartitionOrder() { return false; }
    public java.lang.String getPartitionOrder() { return null; }

    public static final class Configuration {
        @android.annotation.Nullable
        public final com.android.internal.content.om.OverlayConfigParser.ParsedConfiguration parsedConfig = null;
        public final int configIndex = 0;
        public Configuration(com.android.internal.content.om.OverlayConfigParser.ParsedConfiguration p0, int p1) {}
    }

    public static class IdmapInvocation {
        public final boolean enforceOverlayable = false;
        public final java.lang.String policy = null;
        public final java.util.ArrayList<java.lang.String> overlayPaths = null;
        IdmapInvocation(boolean p0, java.lang.String p1) {}
        public java.lang.String toString() { return null; }
    }

    public static interface PackageProvider {
        public void forEachPackage(com.android.internal.util.function.TriConsumer<com.android.internal.content.om.OverlayConfig.PackageProvider.Package, java.lang.Boolean, java.io.File> p0);

        public static interface Package {
            public java.lang.String getBaseApkPath();
            public int getOverlayPriority();
            public java.lang.String getOverlayTarget();
            public java.lang.String getPackageName();
            public int getTargetSdkVersion();
            public boolean isOverlayIsStatic();
        }
    }
}
