package com.android.net.thread.platform.flags;

public final class FeatureFlagsImpl implements com.android.net.thread.platform.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean threadEnabledPlatform() { return false; }
    public boolean threadUserRestrictionEnabled() { return false; }
}
