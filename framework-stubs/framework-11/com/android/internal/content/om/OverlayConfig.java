package com.android.internal.content.om;

public class OverlayConfig {
    static final java.lang.String TAG = "OverlayConfig";
    public static final int DEFAULT_PRIORITY = 2147483647;
    private static final java.util.Comparator<com.android.internal.content.om.OverlayConfigParser.ParsedConfiguration> sStaticOverlayComparator = null;
    private final android.util.ArrayMap<java.lang.String, com.android.internal.content.om.OverlayConfig.Configuration> mConfigurations = null;
    private static com.android.internal.content.om.OverlayConfig sInstance;
    public OverlayConfig(java.io.File p0, java.util.function.Supplier<com.android.internal.content.om.OverlayScanner> p1, com.android.internal.content.om.OverlayConfig.PackageProvider p2) {}
    public static com.android.internal.content.om.OverlayConfig getZygoteInstance() { return null; }
    public static com.android.internal.content.om.OverlayConfig initializeSystemInstance(com.android.internal.content.om.OverlayConfig.PackageProvider p0) { return null; }
    public static com.android.internal.content.om.OverlayConfig getSystemInstance() { return null; }
    public com.android.internal.content.om.OverlayConfig.Configuration getConfiguration(java.lang.String p0) { return null; }
    public boolean isEnabled(java.lang.String p0) { return false; }
    public boolean isMutable(java.lang.String p0) { return false; }
    public int getPriority(java.lang.String p0) { return 0; }
    private java.util.ArrayList<com.android.internal.content.om.OverlayConfig.Configuration> getSortedOverlays() { return null; }
    private static java.util.ArrayList<com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo> getOverlayPackageInfos(com.android.internal.content.om.OverlayConfig.PackageProvider p0) { return null; }
    public java.util.ArrayList<com.android.internal.content.om.OverlayConfig.IdmapInvocation> getImmutableFrameworkOverlayIdmapInvocations() { return null; }
    public java.lang.String[] createImmutableFrameworkIdmapsInZygote() { return null; }
    private static native java.lang.String[] createIdmap(java.lang.String p0, java.lang.String[] p1, java.lang.String[] p2, boolean p3);

    public static final class Configuration {
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
        public void forEachPackage(java.util.function.BiConsumer<android.content.pm.parsing.ParsingPackageRead, java.lang.Boolean> p0);
    }
}
