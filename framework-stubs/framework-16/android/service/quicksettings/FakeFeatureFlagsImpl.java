package android.service.quicksettings;

public class FakeFeatureFlagsImpl extends android.service.quicksettings.CustomFeatureFlags {
    public FakeFeatureFlagsImpl() { super(null); }
    public FakeFeatureFlagsImpl(android.service.quicksettings.FeatureFlags p0) { super(null); }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.service.quicksettings.FeatureFlags> p1) { return false; }
    public void setFlag(java.lang.String p0, boolean p1) {}
    public void resetAll() {}
}
