package com.android.internal.hidden_from_bootclasspath.android.service.dreams;

public interface FeatureFlags {
    public boolean allowDreamWhenPostured();
    public boolean allowDreamWithChargeLimit();
    public boolean cleanupDreamSettingsOnUninstall();
    public boolean dismissDreamOnKeyguardDismiss();
    public boolean dreamHandlesBeingObscured();
    public boolean dreamHandlesConfirmKeys();
    public boolean dreamOverlayHost();
    public boolean dreamWakeRedirect();
    public boolean dreamsV2();
    public boolean dreamsV2Resources();
    public boolean publishPreviewStateToOverlay();
    public boolean startAndStopDozingInBackground();
}
