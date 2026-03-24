package android.graphics;

@java.lang.Deprecated
public class FontFamily {
    private static java.lang.String TAG;
    private java.lang.Runnable mNativeBuilderCleaner;
    @android.annotation.UnsupportedAppUsage(trackingBug=123768928L)
    public long mNativePtr;
    private long mBuilderPtr;
    @android.annotation.UnsupportedAppUsage(trackingBug=123768928L)
    public FontFamily() {}
    @android.annotation.UnsupportedAppUsage(trackingBug=123768928L)
    public FontFamily(java.lang.String[] p0, int p1) {}
    @android.annotation.UnsupportedAppUsage(trackingBug=123768928L)
    public boolean freeze() { return false; }
    @android.annotation.UnsupportedAppUsage(trackingBug=123768928L)
    public void abortCreation() {}
    @android.annotation.UnsupportedAppUsage(trackingBug=123768928L)
    public boolean addFont(java.lang.String p0, int p1, android.graphics.fonts.FontVariationAxis[] p2, int p3, int p4) { return false; }
    @android.annotation.UnsupportedAppUsage(trackingBug=123768928L)
    public boolean addFontFromBuffer(java.nio.ByteBuffer p0, int p1, android.graphics.fonts.FontVariationAxis[] p2, int p3, int p4) { return false; }
    @android.annotation.UnsupportedAppUsage(trackingBug=123768928L)
    public boolean addFontFromAssetManager(android.content.res.AssetManager p0, java.lang.String p1, int p2, boolean p3, int p4, int p5, int p6, android.graphics.fonts.FontVariationAxis[] p7) { return false; }
    private static boolean nAddFont(long p0, java.nio.ByteBuffer p1, int p2) { return false; }
    private static native long nInitBuilder(java.lang.String p0, int p1);
    private static native long nCreateFamily(long p0);
    private static native long nGetBuilderReleaseFunc();
    private static native long nGetFamilyReleaseFunc();
    private static native boolean nAddFont(long p0, java.nio.ByteBuffer p1, int p2, int p3, int p4);
    private static native boolean nAddFontWeightStyle(long p0, java.nio.ByteBuffer p1, int p2, int p3, int p4);
    private static native boolean nAddFontFromAssetManager(long p0, android.content.res.AssetManager p1, java.lang.String p2, int p3, boolean p4, int p5, int p6, int p7);
    private static native void nAddAxisValue(long p0, int p1, float p2);
}
