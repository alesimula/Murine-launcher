package com.android.internal.telephony.subscription;

public class SubscriptionDatabaseManager extends android.os.Handler {
    public SubscriptionDatabaseManager(android.content.Context p0, android.os.Looper p1, com.android.internal.telephony.subscription.SubscriptionDatabaseManager.SubscriptionDatabaseManagerCallback p2) { super(); }
    public java.lang.Object getSubscriptionProperty(int p0, java.lang.String p1) { return null; }
    public void setSubscriptionProperty(int p0, java.lang.String p1, java.lang.Object p2) {}
    public int insertSubscriptionInfo(com.android.internal.telephony.subscription.SubscriptionInfoInternal p0) { return 0; }
    public void removeSubscriptionInfo(int p0) {}
    public void updateSubscription(com.android.internal.telephony.subscription.SubscriptionInfoInternal p0) {}
    public void setIccId(int p0, java.lang.String p1) {}
    public void setSimSlotIndex(int p0, int p1) {}
    public void setDisplayName(int p0, java.lang.String p1) {}
    public void setCarrierName(int p0, java.lang.String p1) {}
    public void setDisplayNameSource(int p0, int p1) {}
    public void setIconTint(int p0, int p1) {}
    public void setNumber(int p0, java.lang.String p1) {}
    public void setDataRoaming(int p0, int p1) {}
    public void setMcc(int p0, java.lang.String p1) {}
    public void setMnc(int p0, java.lang.String p1) {}
    public void setEhplmns(int p0, java.lang.String[] p1) {}
    public void setEhplmns(int p0, java.lang.String p1) {}
    public void setHplmns(int p0, java.lang.String[] p1) {}
    public void setHplmns(int p0, java.lang.String p1) {}
    public void setEmbedded(int p0, int p1) {}
    public void setEmbedded(int p0, boolean p1) {}
    public void setCardString(int p0, java.lang.String p1) {}
    public void setCardId(int p0, int p1) {}
    public void setNativeAccessRules(int p0, byte[] p1) {}
    public void setCarrierConfigAccessRules(int p0, byte[] p1) {}
    public void setCarrierConfigAccessRules(int p0, android.telephony.UiccAccessRule[] p1) {}
    public void setRemovableEmbedded(int p0, int p1) {}
    public void setCellBroadcastExtremeThreatAlertEnabled(int p0, int p1) {}
    public void setCellBroadcastSevereThreatAlertEnabled(int p0, int p1) {}
    public void setCellBroadcastAmberAlertEnabled(int p0, int p1) {}
    public void setCellBroadcastEmergencyAlertEnabled(int p0, int p1) {}
    public void setCellBroadcastAlertSoundDuration(int p0, int p1) {}
    public void setCellBroadcastAlertReminderInterval(int p0, int p1) {}
    public void setCellBroadcastAlertVibrationEnabled(int p0, int p1) {}
    public void setCellBroadcastAlertSpeechEnabled(int p0, int p1) {}
    public void setCellBroadcastEtwsTestAlertEnabled(int p0, int p1) {}
    public void setCellBroadcastAreaInfoMessageEnabled(int p0, int p1) {}
    public void setCellBroadcastTestAlertEnabled(int p0, int p1) {}
    public void setCellBroadcastOptOutDialogEnabled(int p0, int p1) {}
    public void setEnhanced4GModeEnabled(int p0, int p1) {}
    public void setVideoTelephonyEnabled(int p0, int p1) {}
    public void setWifiCallingEnabled(int p0, int p1) {}
    public void setWifiCallingMode(int p0, int p1) {}
    public void setWifiCallingModeForRoaming(int p0, int p1) {}
    public void setWifiCallingEnabledForRoaming(int p0, int p1) {}
    public void setOpportunistic(int p0, boolean p1) {}
    public void setOpportunistic(int p0, int p1) {}
    public void setGroupUuid(int p0, java.lang.String p1) {}
    public void setCountryIso(int p0, java.lang.String p1) {}
    public void setCarrierId(int p0, int p1) {}
    public void setProfileClass(int p0, int p1) {}
    public void setSubscriptionType(int p0, int p1) {}
    public void setGroupOwner(int p0, java.lang.String p1) {}
    public void setEnabledMobileDataPolicies(int p0, java.lang.String p1) {}
    public void setImsi(int p0, java.lang.String p1) {}
    public void setUiccApplicationsEnabled(int p0, boolean p1) {}
    public void setUiccApplicationsEnabled(int p0, int p1) {}
    public void setRcsUceEnabled(int p0, int p1) {}
    public void setCrossSimCallingEnabled(int p0, int p1) {}
    public void setRcsConfig(int p0, byte[] p1) {}
    public void setAllowedNetworkTypesForReasons(int p0, java.lang.String p1) {}
    public void setDeviceToDeviceStatusSharingPreference(int p0, int p1) {}
    public void setVoImsOptInEnabled(int p0, int p1) {}
    public void setDeviceToDeviceStatusSharingContacts(int p0, java.lang.String p1) {}
    public void setNrAdvancedCallingEnabled(int p0, int p1) {}
    public void setNumberFromCarrier(int p0, java.lang.String p1) {}
    public void setNumberFromIms(int p0, java.lang.String p1) {}
    public void setPortIndex(int p0, int p1) {}
    public void setUsageSetting(int p0, int p1) {}
    public void setLastUsedTPMessageReference(int p0, int p1) {}
    public void setUserId(int p0, int p1) {}
    public void setSatelliteEnabled(int p0, int p1) {}
    public void setGroupDisabled(int p0, boolean p1) {}
    public void reloadDatabase() {}
    public void syncToGroup(int p0) {}
    public com.android.internal.telephony.subscription.SubscriptionInfoInternal getSubscriptionInfoInternal(int p0) { return null; }
    public java.util.List<com.android.internal.telephony.subscription.SubscriptionInfoInternal> getAllSubscriptions() { return null; }
    public com.android.internal.telephony.subscription.SubscriptionInfoInternal getSubscriptionInfoInternalByIccId(java.lang.String p0) { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static abstract class SubscriptionDatabaseManagerCallback {
        public SubscriptionDatabaseManagerCallback(java.util.concurrent.Executor p0) {}
        public java.util.concurrent.Executor getExecutor() { return null; }
        public void invokeFromExecutor(java.lang.Runnable p0) {}
        public abstract void onInitialized();
        public abstract void onSubscriptionChanged(int p0);
    }
}
