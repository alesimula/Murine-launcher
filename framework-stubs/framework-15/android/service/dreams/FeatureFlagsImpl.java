package android.service.dreams;

public final class FeatureFlagsImpl implements android.service.dreams.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean dismissDreamOnKeyguardDismiss() { return false; }
    public boolean dreamHandlesBeingObscured() { return false; }
    public boolean dreamHandlesConfirmKeys() { return false; }
    public boolean dreamOverlayHost() { return false; }
    public boolean dreamWakeRedirect() { return false; }
}
