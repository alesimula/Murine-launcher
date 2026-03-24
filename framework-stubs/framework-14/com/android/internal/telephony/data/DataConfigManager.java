package com.android.internal.telephony.data;

public class DataConfigManager extends android.os.Handler {
    public DataConfigManager(com.android.internal.telephony.Phone p0, android.os.Looper p1) { super(); }
    public void registerCallback(com.android.internal.telephony.data.DataConfigManager.DataConfigManagerCallback p0) {}
    public void unregisterCallback(com.android.internal.telephony.data.DataConfigManager.DataConfigManagerCallback p0) {}
    public void handleMessage(android.os.Message p0) {}
    public boolean isConfigCarrierSpecific() { return false; }
    public int getNetworkCapabilityPriority(int p0) { return 0; }
    public java.util.List<com.android.internal.telephony.data.DataRetryManager.DataSetupRetryRule> getDataSetupRetryRules() { return null; }
    public java.util.List<com.android.internal.telephony.data.DataRetryManager.DataHandoverRetryRule> getDataHandoverRetryRules() { return null; }
    public boolean isDataRoamingEnabledByDefault() { return false; }
    public java.util.Set<java.lang.Integer> getMeteredNetworkCapabilities(boolean p0) { return null; }
    public boolean isTetheringProfileDisabledForRoaming() { return false; }
    public boolean isMeteredCapability(int p0, boolean p1) { return false; }
    public boolean isAnyMeteredCapability(int[] p0, boolean p1) { return false; }
    public boolean shouldUseDataActivityForRrcDetection() { return false; }
    public java.util.List<java.lang.Integer> getNetworkTypesOnlySupportSingleDataNetwork() { return null; }
    public java.util.Set<java.lang.Integer> getCapabilitiesExemptFromSingleDataNetwork() { return null; }
    public boolean shouldKeepNetworkUpInNonVops() { return false; }
    public boolean isPingTestBeforeAutoDataSwitchRequired() { return false; }
    public boolean isTempNotMeteredSupportedByCarrier() { return false; }
    public boolean isNetworkTypeUnmetered(android.telephony.TelephonyDisplayInfo p0, android.telephony.ServiceState p1) { return false; }
    public com.android.internal.telephony.data.DataNetwork.NetworkBandwidth getBandwidthForNetworkType(android.telephony.TelephonyDisplayInfo p0) { return null; }
    public boolean shouldResetDataThrottlingWhenTacChanges() { return false; }
    public java.lang.String getDataServicePackageName() { return null; }
    public int getDefaultMtu() { return 0; }
    public com.android.internal.telephony.data.DataConfigManager.EventFrequency getAnomalySetupDataCallThreshold() { return null; }
    public com.android.internal.telephony.data.DataConfigManager.EventFrequency getAnomalyNetworkUnwantedThreshold() { return null; }
    public com.android.internal.telephony.data.DataConfigManager.EventFrequency getAnomalyImsReleaseRequestThreshold() { return null; }
    public boolean isInvalidQnsParamAnomalyReportEnabled() { return false; }
    public int getAnomalyNetworkConnectingTimeoutMs() { return 0; }
    public int getAnomalyNetworkDisconnectingTimeoutMs() { return 0; }
    public int getNetworkHandoverTimeoutMs() { return 0; }
    public boolean isApnConfigAnomalyReportEnabled() { return false; }
    public int getAutoDataSwitchValidationMaxRetry() { return 0; }
    public long getAutoDataSwitchAvailabilityStabilityTimeThreshold() { return 0L; }
    public java.lang.String getTcpConfigString(android.telephony.TelephonyDisplayInfo p0) { return null; }
    public java.lang.String getDefaultTcpConfigString() { return null; }
    public long getImsDeregistrationDelay() { return 0L; }
    public boolean shouldPersistIwlanDataNetworksWhenDataServiceRestarted() { return false; }
    public boolean isIwlanHandoverPolicyEnabled() { return false; }
    public boolean isImsDelayTearDownUntilVoiceCallEndEnabled() { return false; }
    @com.android.internal.telephony.data.DataNetwork.BandwidthEstimationSource
    public int getBandwidthEstimateSource() { return 0; }
    public com.android.internal.telephony.data.DataConfigManager.EventFrequency parseSlidingWindowCounterThreshold(java.lang.String p0, long p1, int p2) { return null; }
    public java.util.List<com.android.internal.telephony.data.DataNetworkController.HandoverRule> getHandoverRules() { return null; }
    public long getRetrySetupAfterDisconnectMillis() { return 0L; }
    public long[] getDataStallRecoveryDelayMillis() { return null; }
    public boolean[] getDataStallRecoveryShouldSkipArray() { return null; }
    public java.lang.String getDefaultPreferredApn() { return null; }
    public int getNrAdvancedCapablePcoId() { return 0; }
    public java.util.List<java.lang.Integer> getAllowedInitialAttachApnTypes() { return null; }
    public boolean isEnhancedIwlanHandoverCheckEnabled() { return false; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static class DataConfigManagerCallback extends com.android.internal.telephony.data.DataCallback {
        public DataConfigManagerCallback(java.util.concurrent.Executor p0) { super(null); }
        public void onCarrierConfigChanged() {}
        public void onDeviceConfigChanged() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface DataConfigNetworkType {
    }

    public static class EventFrequency {
        public final long timeWindow = 0L;
        public final int eventNumOccurrence = 0;
        public EventFrequency(long p0, int p1) {}
        public java.lang.String toString() { return null; }
    }
}
