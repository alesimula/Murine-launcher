package android.content.res;

public final class ResourcesKey {
    @android.annotation.Nullable
    public final java.lang.String mResDir = null;
    @android.annotation.Nullable
    public final java.lang.String[] mSplitResDirs = null;
    @android.annotation.Nullable
    public final java.lang.String[] mOverlayPaths = null;
    @android.annotation.Nullable
    public final java.lang.String[] mLibDirs = null;
    public int mDisplayId;
    @android.annotation.NonNull
    public final android.content.res.Configuration mOverrideConfiguration = null;
    @android.annotation.NonNull
    public final android.content.res.CompatibilityInfo mCompatInfo = null;
    @android.annotation.Nullable
    public final android.content.res.loader.ResourcesLoader[] mLoaders = null;
    public ResourcesKey(java.lang.String p0, java.lang.String[] p1, java.lang.String[] p2, java.lang.String[] p3, int p4, android.content.res.Configuration p5, android.content.res.CompatibilityInfo p6, android.content.res.loader.ResourcesLoader[] p7) {}
    public ResourcesKey(java.lang.String p0, java.lang.String[] p1, java.lang.String[] p2, java.lang.String[] p3, int p4, android.content.res.Configuration p5, android.content.res.CompatibilityInfo p6) {}
    public boolean hasOverrideConfiguration() { return false; }
    public boolean isPathReferenced(java.lang.String p0) { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
}
