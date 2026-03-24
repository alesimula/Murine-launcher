package com.android.internal.hidden_from_bootclasspath.android.security;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.security.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.security.FeatureFlags>> p0) {}
    public boolean aapmApi() { return false; }
    public boolean aapmFeatureDisableCellular2g() { return false; }
    public boolean aapmFeatureDisableInstallUnknownSources() { return false; }
    public boolean aapmFeatureMemoryTaggingExtension() { return false; }
    public boolean aapmFeatureUsbDataProtection() { return false; }
    public boolean aflApi() { return false; }
    public boolean asmOptSystemIntoEnforcement() { return false; }
    public boolean asmReintroduceGracePeriod() { return false; }
    public boolean asmRestrictionsEnabled() { return false; }
    public boolean asmRestrictionsV2() { return false; }
    public boolean asmToastsEnabled() { return false; }
    public boolean blockNullActionIntents() { return false; }
    public boolean certificateTransparencyConfiguration() { return false; }
    public boolean contentUriPermissionApis() { return false; }
    public boolean disableAdaptiveAuthCounterLock() { return false; }
    public boolean enableIntentMatchingFlags() { return false; }
    public boolean enforceIntentFilterMatch() { return false; }
    public boolean extendEcmToAllSettings() { return false; }
    public boolean failedAuthLockToggle() { return false; }
    public boolean frpEnforcement() { return false; }
    public boolean fsverityApi() { return false; }
    public boolean implicitUriGrantsRestrictedForSendAction() { return false; }
    public boolean implicitUriGrantsRestrictedForSendmultipleImagecaptureActions() { return false; }
    public boolean internalLogEventListener() { return false; }
    public boolean keyinfoUnlockedDeviceRequired() { return false; }
    public boolean keystoreGrantApi() { return false; }
    public boolean mgf1DigestSetterV2() { return false; }
    public boolean preventIntentRedirect() { return false; }
    public boolean preventIntentRedirectAbortOrThrowException() { return false; }
    public boolean preventIntentRedirectCollectNestedKeysOnServerIfNotCollected() { return false; }
    public boolean preventIntentRedirectShowToast() { return false; }
    public boolean preventIntentRedirectShowToastIfNestedKeysNotCollectedRW() { return false; }
    public boolean preventIntentRedirectThrowExceptionIfNestedKeysNotCollected() { return false; }
    public boolean protectDeviceConfigFlags() { return false; }
    public boolean secureLockDevice() { return false; }
    public boolean secureLockdown() { return false; }
    public boolean shouldTrustManagerListenForPrimaryAuth() { return false; }
    public boolean softwareRatelimiter() { return false; }
    public boolean subscribeToKeyguardLockedStatePermPrivFlag() { return false; }
    public boolean unlockedStorageApi() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.security.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
