package android.companion.virtual.flags;

public class CustomFeatureFlags implements android.companion.virtual.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.companion.virtual.flags.FeatureFlags>> p0) {}
    public boolean consistentDisplayFlags() { return false; }
    public boolean crossDeviceClipboard() { return false; }
    public boolean dynamicPolicy() { return false; }
    public boolean enableNativeVdm() { return false; }
    public boolean expressMetrics() { return false; }
    public boolean impulseVelocityStrategyForTouchNavigation() { return false; }
    public boolean interactiveScreenMirror() { return false; }
    public boolean interceptIntentsBeforeApplyingPolicy() { return false; }
    public boolean persistentDeviceIdApi() { return false; }
    public boolean streamCamera() { return false; }
    public boolean streamPermissions() { return false; }
    public boolean vdmCustomHome() { return false; }
    public boolean vdmCustomIme() { return false; }
    public boolean vdmPublicApis() { return false; }
    public boolean virtualCamera() { return false; }
    public boolean virtualStylus() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.companion.virtual.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
