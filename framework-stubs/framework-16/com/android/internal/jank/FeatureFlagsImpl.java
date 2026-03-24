package com.android.internal.jank;

public final class FeatureFlagsImpl implements com.android.internal.jank.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean ignoreHwuiIsFirstFrame() { return false; }
    public boolean useSfFrameDuration() { return false; }
}
