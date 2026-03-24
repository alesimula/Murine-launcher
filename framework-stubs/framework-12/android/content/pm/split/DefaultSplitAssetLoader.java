package android.content.pm.split;

public class DefaultSplitAssetLoader implements android.content.pm.split.SplitAssetLoader {
    private final java.lang.String mBaseApkPath = null;
    private final java.lang.String[] mSplitApkPaths = null;
    private final int mFlags = 0;
    private android.content.res.AssetManager mCachedAssetManager;
    private android.content.res.ApkAssets mBaseApkAssets;
    public DefaultSplitAssetLoader(android.content.pm.parsing.PackageLite p0, int p1) {}
    private static android.content.res.ApkAssets loadApkAssets(java.lang.String p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public android.content.res.AssetManager getBaseAssetManager() throws android.content.pm.PackageParser.PackageParserException { return null; }
    public android.content.res.AssetManager getSplitAssetManager(int p0) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public android.content.res.ApkAssets getBaseApkAssets() { return null; }
    public void close() throws java.lang.Exception {}
}
