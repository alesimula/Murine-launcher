package android.flags;

public class FeatureFlagsFake extends android.flags.FeatureFlags {
    public FeatureFlagsFake(android.flags.IFeatureFlags p0) { super(null); }
    public boolean isEnabled(android.flags.BooleanFlag p0) { return false; }
    public boolean isEnabled(android.flags.FusedOffFlag p0) { return false; }
    public boolean isEnabled(android.flags.FusedOnFlag p0) { return false; }
    public boolean isCurrentlyEnabled(android.flags.DynamicBooleanFlag p0) { return false; }
    protected void syncInternal(java.util.Set<android.flags.Flag<?>> p0) {}
    public void setFlagValue(android.flags.BooleanFlagBase p0, boolean p1) {}
}
