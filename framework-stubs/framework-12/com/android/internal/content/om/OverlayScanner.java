package com.android.internal.content.om;

public class OverlayScanner {
    private final android.util.ArrayMap<java.lang.String, com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo> mParsedOverlayInfos = null;
    public OverlayScanner() {}
    public final com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo getParsedInfo(java.lang.String p0) { return null; }
    final java.util.Collection<com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo> getAllParsedInfos() { return null; }
    public void scanDir(java.io.File p0) {}
    public com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo parseOverlayManifest(java.io.File p0) { return null; }

    public static class ParsedOverlayInfo {
        public final java.lang.String packageName = null;
        public final java.lang.String targetPackageName = null;
        public final int targetSdkVersion = 0;
        public final boolean isStatic = false;
        public final int priority = 0;
        public final java.io.File path = null;
        public ParsedOverlayInfo(java.lang.String p0, java.lang.String p1, int p2, boolean p3, int p4, java.io.File p5) {}
        public java.lang.String toString() { return null; }
    }
}
