package android.service.dreams;

public final class FeatureFlagsImpl implements android.service.dreams.FeatureFlags {
    public FeatureFlagsImpl() {}
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
}
