package com.android.server.display.feature.flags;

public class FakeFeatureFlagsImpl extends com.android.server.display.feature.flags.CustomFeatureFlags {
    public FakeFeatureFlagsImpl() { super(null); }
    public FakeFeatureFlagsImpl(com.android.server.display.feature.flags.FeatureFlags p0) { super(null); }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.server.display.feature.flags.FeatureFlags> p1) { return false; }
    public void setFlag(java.lang.String p0, boolean p1) {}
    public void resetAll() {}
}
