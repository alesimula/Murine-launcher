package android.credentials.flags;

public class CustomFeatureFlags implements android.credentials.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.credentials.flags.FeatureFlags>> p0) {}
    public boolean clearCredentialsFixEnabled() { return false; }
    public boolean clearSessionEnabled() { return false; }
    public boolean configurableSelectorUiEnabled() { return false; }
    public boolean credmanBiometricApiEnabled() { return false; }
    public boolean hybridFilterOptFixEnabled() { return false; }
    public boolean instantAppsEnabled() { return false; }
    public boolean newFrameworkMetrics() { return false; }
    public boolean newSettingsIntents() { return false; }
    public boolean newSettingsUi() { return false; }
    public boolean selectorUiImprovementsEnabled() { return false; }
    public boolean settingsActivityEnabled() { return false; }
    public boolean wearCredentialManagerEnabled() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.credentials.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
