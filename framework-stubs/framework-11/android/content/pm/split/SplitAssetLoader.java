package android.content.pm.split;

public interface SplitAssetLoader extends java.lang.AutoCloseable {
    public android.content.res.AssetManager getBaseAssetManager() throws android.content.pm.PackageParser.PackageParserException;
    public android.content.res.AssetManager getSplitAssetManager(int p0) throws android.content.pm.PackageParser.PackageParserException;
}
