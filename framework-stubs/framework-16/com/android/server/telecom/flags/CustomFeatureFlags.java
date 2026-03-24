package com.android.server.telecom.flags;

public class CustomFeatureFlags implements com.android.server.telecom.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.server.telecom.flags.FeatureFlags>> p0) {}
    public boolean addCallUriForMissedCalls() { return false; }
    public boolean allowCallOnSameConnectionMgr() { return false; }
    public boolean allowSystemAppsResolveVoipCalls() { return false; }
    public boolean availableRoutesNeverUpdatedAfterSetSystemAudioState() { return false; }
    public boolean busDeviceIsASpeaker() { return false; }
    public boolean businessCallComposer() { return false; }
    public boolean bypassHoldForEccDial() { return false; }
    public boolean cacheCallEvents() { return false; }
    public boolean callConnectedIndicatorPreference() { return false; }
    public boolean callDetailsIdChanges() { return false; }
    public boolean callSequencingCallResumeFailed() { return false; }
    public boolean callSequencingMetrics() { return false; }
    public boolean cancelRemovalOnEmergencyRedial() { return false; }
    public boolean checkDeviceTypeOnRouteChange() { return false; }
    public boolean cleanupVerifyCallState() { return false; }
    public boolean communicationDeviceProtectedByLock() { return false; }
    public boolean cswServiceInterfaceIsNull() { return false; }
    public boolean disconnectSelfManagedStuckStartupCalls() { return false; }
    public boolean doNotSendCallToNullIcs() { return false; }
    public boolean dontTimeoutDestroyedCalls() { return false; }
    public boolean earlyBindingToIncallService() { return false; }
    public boolean echoAbortTransactionalOutgoing() { return false; }
    public boolean enableCallExceptionAnomReports() { return false; }
    public boolean enableCallSequencing() { return false; }
    public boolean enableRespondViaSmsManagerAsync() { return false; }
    public boolean enforceTransactionalExclusivity() { return false; }
    public boolean ensureAudioModeUpdatesOnForegroundCallChange() { return false; }
    public boolean getLastKnownCellIdentity() { return false; }
    public boolean getRegisteredPhoneAccounts() { return false; }
    public boolean integratedCallLogs() { return false; }
    public boolean keepBluetoothDevicesCacheUpdated() { return false; }
    public boolean postponeRegisterToLeaudio() { return false; }
    public boolean preventRedundantLocationPermissionGrantAndRevoke() { return false; }
    public boolean preventSelfManagedCallLogging() { return false; }
    public boolean resetMuteWhenEnteringQuiescentBtRoute() { return false; }
    public boolean resolveHiddenDependenciesTwo() { return false; }
    public boolean reuseOriginalConnRemoteConfApi() { return false; }
    public boolean revertDisconnectingDuringMerge() { return false; }
    public boolean selectPhoneAccountBeforeMakingRoom() { return false; }
    public boolean setAudioModeBeforeAbandonFocus() { return false; }
    public boolean setMuteState() { return false; }
    public boolean setRemoteConnectionCallId() { return false; }
    public boolean skipFilterPhoneAccountPerformDndFilter() { return false; }
    public boolean telecomAppLabelProxyHsumAware() { return false; }
    public boolean telecomMainUserInBlockCheck() { return false; }
    public boolean telecomMainUserInGetRespondMessageApp() { return false; }
    public boolean telecomMainlineBlockedNumbersManager() { return false; }
    public boolean telecomMetricsSupport() { return false; }
    public boolean telecomResolveHiddenDependencies() { return false; }
    public boolean telephonyHasDefaultButTelecomDoesNot() { return false; }
    public boolean transactionalCsVerifier() { return false; }
    public boolean transactionalVideoState() { return false; }
    public boolean transitRouteBeforeAudioDisconnectBt() { return false; }
    public boolean unregisterUnresolvableAccounts() { return false; }
    public boolean updateRouteMaskWhenBtConnected() { return false; }
    public boolean useActualAddressToEnterConnectingState() { return false; }
    public boolean useDeviceProvidedSerializedRingerVibration() { return false; }
    public boolean useRefactoredAudioRouteSwitching() { return false; }
    public boolean voipAppActionsSupport() { return false; }
    public boolean voipDndFocus() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.server.telecom.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
