package com.android.internal.pm.split;

public interface SplitAssetLoader extends java.lang.AutoCloseable {
    public android.content.res.AssetManager getBaseAssetManager() throws java.lang.IllegalArgumentException;
    public android.content.res.AssetManager getSplitAssetManager(int p0) throws java.lang.IllegalArgumentException;
    public android.content.res.ApkAssets getBaseApkAssets();
}
