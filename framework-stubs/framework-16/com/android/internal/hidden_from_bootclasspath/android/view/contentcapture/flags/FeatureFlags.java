package com.android.internal.hidden_from_bootclasspath.android.view.contentcapture.flags;

public interface FeatureFlags {
    public boolean ccapiBaklavaEnabled();
    public boolean enableSystemUiUnderlay();
    public boolean flushAfterEachFrame();
    public boolean runOnBackgroundThreadEnabled();
    public boolean warmUpBackgroundThreadForContentCapture();
}
