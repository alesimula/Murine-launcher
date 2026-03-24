package com.android.internal.content.om;

public class OverlayScanner {
    public OverlayScanner() {}
    @android.annotation.Nullable
    public final com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo getParsedInfo(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    final java.util.Collection<com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo> getAllParsedInfos() { return null; }
    final boolean isExcludedOverlayPackage(java.lang.String p0, com.android.internal.content.om.OverlayConfigParser.OverlayPartition p1) { return false; }
    public void scanDir(java.io.File p0) {}
    public com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo parseOverlayManifest(java.io.File p0, java.util.List<android.util.Pair<java.lang.String, java.io.File>> p1) { return null; }

    public static class ParsedOverlayInfo {
        public final java.lang.String packageName = null;
        public final java.lang.String targetPackageName = null;
        public final int targetSdkVersion = 0;
        public final boolean isStatic = false;
        public final int priority = 0;
        public final java.io.File path = null;
        @android.annotation.Nullable
        public final java.io.File preInstalledApexPath = null;
        public ParsedOverlayInfo(java.lang.String p0, java.lang.String p1, int p2, boolean p3, int p4, java.io.File p5, java.io.File p6) {}
        public java.lang.String toString() { return null; }
        @android.annotation.NonNull
        public java.io.File getOriginalPartitionPath() { return null; }
    }
}
