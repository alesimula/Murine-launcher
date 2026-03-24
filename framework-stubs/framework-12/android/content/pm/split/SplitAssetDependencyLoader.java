package android.content.pm.split;

public class SplitAssetDependencyLoader extends android.content.pm.split.SplitDependencyLoader<android.content.pm.PackageParser.PackageParserException> implements android.content.pm.split.SplitAssetLoader {
    private final java.lang.String[] mSplitPaths = null;
    private final int mFlags = 0;
    private final android.content.res.ApkAssets[][] mCachedSplitApks = null;
    private final android.content.res.AssetManager[] mCachedAssetManagers = null;
    public SplitAssetDependencyLoader(android.content.pm.parsing.PackageLite p0, android.util.SparseArray<int[]> p1, int p2) { super(null); }
    protected boolean isSplitCached(int p0) { return false; }
    private static android.content.res.ApkAssets loadApkAssets(java.lang.String p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    private static android.content.res.AssetManager createAssetManagerWithAssets(android.content.res.ApkAssets[] p0) { return null; }
    protected void constructSplit(int p0, int[] p1, int p2) throws android.content.pm.PackageParser.PackageParserException {}
    public android.content.res.AssetManager getBaseAssetManager() throws android.content.pm.PackageParser.PackageParserException { return null; }
    public android.content.res.AssetManager getSplitAssetManager(int p0) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public android.content.res.ApkAssets getBaseApkAssets() { return null; }
    public void close() throws java.lang.Exception {}
}
