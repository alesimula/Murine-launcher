package android.app.ondeviceintelligence.flags;

public class FakeFeatureFlagsImpl extends android.app.ondeviceintelligence.flags.CustomFeatureFlags {
    public FakeFeatureFlagsImpl() { super(null); }
    public FakeFeatureFlagsImpl(android.app.ondeviceintelligence.flags.FeatureFlags p0) { super(null); }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.app.ondeviceintelligence.flags.FeatureFlags> p1) { return false; }
    public void setFlag(java.lang.String p0, boolean p1) {}
    public void resetAll() {}
}
