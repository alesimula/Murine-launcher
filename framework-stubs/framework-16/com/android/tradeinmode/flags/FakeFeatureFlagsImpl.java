package com.android.tradeinmode.flags;

public class FakeFeatureFlagsImpl extends com.android.tradeinmode.flags.CustomFeatureFlags {
    public FakeFeatureFlagsImpl() { super(null); }
    public FakeFeatureFlagsImpl(com.android.tradeinmode.flags.FeatureFlags p0) { super(null); }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.tradeinmode.flags.FeatureFlags> p1) { return false; }
    public void setFlag(java.lang.String p0, boolean p1) {}
    public void resetAll() {}
}
