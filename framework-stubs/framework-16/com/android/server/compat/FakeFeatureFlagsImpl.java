package com.android.server.compat;

public class FakeFeatureFlagsImpl extends com.android.server.compat.CustomFeatureFlags {
    public FakeFeatureFlagsImpl() { super(null); }
    public FakeFeatureFlagsImpl(com.android.server.compat.FeatureFlags p0) { super(null); }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.server.compat.FeatureFlags> p1) { return false; }
    public void setFlag(java.lang.String p0, boolean p1) {}
    public void resetAll() {}
}
