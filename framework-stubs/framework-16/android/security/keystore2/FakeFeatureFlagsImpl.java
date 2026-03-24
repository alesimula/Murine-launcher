package android.security.keystore2;

public class FakeFeatureFlagsImpl extends android.security.keystore2.CustomFeatureFlags {
    public FakeFeatureFlagsImpl() { super(null); }
    public FakeFeatureFlagsImpl(android.security.keystore2.FeatureFlags p0) { super(null); }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.security.keystore2.FeatureFlags> p1) { return false; }
    public void setFlag(java.lang.String p0, boolean p1) {}
    public void resetAll() {}
}
