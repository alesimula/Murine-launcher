package android.content.pm.split;

public class DefaultSplitAssetLoader implements android.content.pm.split.SplitAssetLoader {
    private final java.lang.String mBaseCodePath = null;
    private final java.lang.String[] mSplitCodePaths = null;
    private final int mFlags = 0;
    private android.content.res.AssetManager mCachedAssetManager;
    public DefaultSplitAssetLoader(android.content.pm.PackageParser.PackageLite p0, int p1) {}
    private static android.content.res.ApkAssets loadApkAssets(java.lang.String p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public android.content.res.AssetManager getBaseAssetManager() throws android.content.pm.PackageParser.PackageParserException { return null; }
    public android.content.res.AssetManager getSplitAssetManager(int p0) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public void close() throws java.lang.Exception {}
}
