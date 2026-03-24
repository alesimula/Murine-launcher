package android.hardware.devicestate.feature.flags;

public class CustomFeatureFlags implements android.hardware.devicestate.feature.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.hardware.devicestate.feature.flags.FeatureFlags>> p0) {}
    public boolean desktopDeviceStatePropertyApi() { return false; }
    public boolean deviceStateConfigurationFlag() { return false; }
    public boolean deviceStatePropertyApi() { return false; }
    public boolean deviceStatePropertyMigration() { return false; }
    public boolean deviceStateRdmV2() { return false; }
    public boolean deviceStateRequesterCancelState() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.hardware.devicestate.feature.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
