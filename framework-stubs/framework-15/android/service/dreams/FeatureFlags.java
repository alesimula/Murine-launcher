package android.service.dreams;

public interface FeatureFlags {
    public boolean dismissDreamOnKeyguardDismiss();
    public boolean dreamHandlesBeingObscured();
    public boolean dreamHandlesConfirmKeys();
    public boolean dreamOverlayHost();
    public boolean dreamWakeRedirect();
}
