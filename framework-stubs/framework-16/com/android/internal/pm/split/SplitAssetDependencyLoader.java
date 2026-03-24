package com.android.internal.pm.split;

public class SplitAssetDependencyLoader extends android.content.pm.split.SplitDependencyLoader<java.lang.IllegalArgumentException> implements com.android.internal.pm.split.SplitAssetLoader {
    public SplitAssetDependencyLoader(android.content.pm.parsing.PackageLite p0, android.util.SparseArray<int[]> p1, int p2) { super(null); }
    protected boolean isSplitCached(int p0) { return false; }
    protected void constructSplit(int p0, int[] p1, int p2) throws java.lang.IllegalArgumentException {}
    public android.content.res.AssetManager getBaseAssetManager() throws java.lang.IllegalArgumentException { return null; }
    public android.content.res.AssetManager getSplitAssetManager(int p0) throws java.lang.IllegalArgumentException { return null; }
    public android.content.res.ApkAssets getBaseApkAssets() { return null; }
    public void close() throws java.lang.Exception {}
}
