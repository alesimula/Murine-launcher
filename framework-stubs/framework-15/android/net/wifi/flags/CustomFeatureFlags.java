package android.net.wifi.flags;

public class CustomFeatureFlags implements android.net.wifi.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.net.wifi.flags.FeatureFlags>> p0) {}
    public boolean getDeviceCrossAkmRoamingSupport() { return false; }
    public boolean networkProviderBatteryChargingStatus() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.net.wifi.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
