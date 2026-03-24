package android.service.dreams;

public class CustomFeatureFlags implements android.service.dreams.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.service.dreams.FeatureFlags>> p0) {}
    public boolean allowDreamWhenPostured() { return false; }
    public boolean allowDreamWithChargeLimit() { return false; }
    public boolean cleanupDreamSettingsOnUninstall() { return false; }
    public boolean dismissDreamOnKeyguardDismiss() { return false; }
    public boolean dreamHandlesBeingObscured() { return false; }
    public boolean dreamHandlesConfirmKeys() { return false; }
    public boolean dreamOverlayHost() { return false; }
    public boolean dreamWakeRedirect() { return false; }
    public boolean dreamsV2() { return false; }
    public boolean dreamsV2Resources() { return false; }
    public boolean publishPreviewStateToOverlay() { return false; }
    public boolean startAndStopDozingInBackground() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.service.dreams.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
