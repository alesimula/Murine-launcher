package com.android.internal.telephony;

public class ServiceStateTracker extends android.os.Handler {
    static final java.lang.String LOG_TAG = "SST";
    static final boolean DBG = true;
    public android.telephony.ServiceState mSS;
    public com.android.internal.telephony.RestrictedState mRestrictedState;
    public int[] mPollingContext;
    protected android.util.SparseArray<com.android.internal.telephony.RegistrantList> mAttachedRegistrants;
    protected android.util.SparseArray<com.android.internal.telephony.RegistrantList> mDetachedRegistrants;
    public static final int DEFAULT_GPRS_CHECK_PERIOD_MILLIS = 60000;
    protected static final int EVENT_RADIO_STATE_CHANGED = 1;
    protected static final int EVENT_NETWORK_STATE_CHANGED = 2;
    protected static final int EVENT_POLL_STATE_CS_CELLULAR_REGISTRATION = 4;
    protected static final int EVENT_POLL_STATE_PS_CELLULAR_REGISTRATION = 5;
    protected static final int EVENT_POLL_STATE_PS_IWLAN_REGISTRATION = 6;
    protected static final int EVENT_POLL_STATE_OPERATOR = 7;
    protected static final int EVENT_NITZ_TIME = 11;
    protected static final int EVENT_POLL_STATE_NETWORK_SELECTION_MODE = 14;
    protected static final int EVENT_GET_LOC_DONE = 15;
    protected static final int EVENT_SIM_RECORDS_LOADED = 16;
    protected static final int EVENT_SIM_READY = 17;
    protected static final int EVENT_LOCATION_UPDATES_ENABLED = 18;
    protected static final int EVENT_GET_ALLOWED_NETWORK_TYPES = 19;
    protected static final int EVENT_SET_ALLOWED_NETWORK_TYPES = 20;
    protected static final int EVENT_RESET_ALLOWED_NETWORK_TYPES = 21;
    protected static final int EVENT_CHECK_REPORT_GPRS = 22;
    protected static final int EVENT_RESTRICTED_STATE_CHANGED = 23;
    protected static final int EVENT_RUIM_READY = 26;
    protected static final int EVENT_RUIM_RECORDS_LOADED = 27;
    protected static final int EVENT_POLL_STATE_CDMA_SUBSCRIPTION = 34;
    protected static final int EVENT_NV_READY = 35;
    protected static final int EVENT_OTA_PROVISION_STATUS_CHANGE = 37;
    protected static final int EVENT_SET_RADIO_POWER_OFF = 38;
    protected static final int EVENT_CDMA_SUBSCRIPTION_SOURCE_CHANGED = 39;
    protected static final int EVENT_CDMA_PRL_VERSION_CHANGED = 40;
    protected static final int EVENT_RADIO_ON = 41;
    public static final int EVENT_ICC_CHANGED = 42;
    protected static final int EVENT_GET_CELL_INFO_LIST = 43;
    protected static final int EVENT_UNSOL_CELL_INFO_LIST = 44;
    protected static final int EVENT_CHANGE_IMS_STATE = 45;
    protected static final int EVENT_IMS_STATE_CHANGED = 46;
    protected static final int EVENT_IMS_STATE_DONE = 47;
    protected static final int EVENT_IMS_CAPABILITY_CHANGED = 48;
    protected static final int EVENT_ALL_DATA_DISCONNECTED = 49;
    protected static final int EVENT_PHONE_TYPE_SWITCHED = 50;
    protected static final int EVENT_RADIO_POWER_FROM_CARRIER = 51;
    protected static final int EVENT_IMS_SERVICE_STATE_CHANGED = 53;
    protected static final int EVENT_RADIO_POWER_OFF_DONE = 54;
    protected static final int EVENT_PHYSICAL_CHANNEL_CONFIG = 55;
    protected static final int EVENT_CELL_LOCATION_RESPONSE = 56;
    protected static final int EVENT_RESET_LAST_KNOWN_CELL_IDENTITY = 63;
    protected static final int EVENT_TELECOM_VOICE_SERVICE_STATE_OVERRIDE_CHANGED = 65;
    public static final int CARRIER_NAME_DISPLAY_BITMASK_SHOW_SPN = 1;
    public static final int CARRIER_NAME_DISPLAY_BITMASK_SHOW_PLMN = 2;
    protected static final java.lang.String REGISTRATION_DENIED_GEN = "General";
    protected static final java.lang.String REGISTRATION_DENIED_AUTH = "Authentication Failure";
    public int mSubId;
    protected final com.android.internal.telephony.GsmCdmaPhone mPhone = null;
    public static final int PS_ENABLED = 1001;
    public static final int PS_DISABLED = 1002;
    public static final int CS_ENABLED = 1003;
    public static final int CS_DISABLED = 1004;
    public static final int CS_NORMAL_ENABLED = 1005;
    public static final int CS_EMERGENCY_ENABLED = 1006;
    public static final int CS_REJECT_CAUSE_ENABLED = 2001;
    public static final int CS_REJECT_CAUSE_DISABLED = 2002;
    public static final int PS_NOTIFICATION = 888;
    public static final int CS_NOTIFICATION = 999;
    public static final int CS_REJECT_CAUSE_NOTIFICATION = 111;
    public static final java.lang.String UNACTIVATED_MIN2_VALUE = "000000";
    public static final java.lang.String UNACTIVATED_MIN_VALUE = "1111110111";
    public static final java.lang.String INVALID_MCC = "000";
    public static final java.lang.String DEFAULT_MNC = "00";
    public ServiceStateTracker(com.android.internal.telephony.GsmCdmaPhone p0, com.android.internal.telephony.CommandsInterface p1) { super(); }
    public void updatePhoneType() {}
    public void requestShutdown() {}
    public int getRadioPowerOffDelayTimeoutForImsRegistration() { return 0; }
    public void dispose() {}
    public boolean getDesiredPowerState() { return false; }
    public boolean getPowerStateFromCarrier() { return false; }
    public java.util.List<android.telephony.PhysicalChannelConfig> getPhysicalChannelConfigList() { return null; }
    protected void notifyVoiceRegStateRilRadioTechnologyChanged() {}
    protected void notifyDataRegStateRilRadioTechnologyChanged(int p0) {}
    protected void useDataRegStateForDataOnlyDevices() {}
    protected void updatePhoneObject() {}
    public void registerForVoiceRoamingOn(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForVoiceRoamingOn(android.os.Handler p0) {}
    public void registerForVoiceRoamingOff(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForVoiceRoamingOff(android.os.Handler p0) {}
    public void registerForDataRoamingOn(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForDataRoamingOn(android.os.Handler p0) {}
    public void registerForDataRoamingOff(android.os.Handler p0, int p1, java.lang.Object p2, boolean p3) {}
    public void unregisterForDataRoamingOff(android.os.Handler p0) {}
    public void reRegisterNetwork(android.os.Message p0) {}
    public java.util.Set<java.lang.Integer> getRadioPowerOffReasons() { return null; }
    public void clearAllRadioOffReasons() {}
    public final void setRadioPower(boolean p0) {}
    public void setRadioPower(boolean p0, boolean p1, boolean p2, boolean p3) {}
    public void setRadioPowerForReason(boolean p0, boolean p1, boolean p2, boolean p3, int p4) {}
    public void enableSingleLocationUpdate(android.os.WorkSource p0) {}
    public void enableLocationUpdates() {}
    protected void disableSingleLocationUpdate() {}
    public void disableLocationUpdates() {}
    public void handleMessage(android.os.Message p0) {}
    protected boolean isSidsAllZeros() { return false; }
    public android.telephony.ServiceState getServiceState() { return null; }
    public java.lang.String getMdnNumber() { return null; }
    public java.lang.String getCdmaMin() { return null; }
    public java.lang.String getPrlVersion() { return null; }
    public java.lang.String getImsi() { return null; }
    public boolean isMinInfoReady() { return false; }
    public int getOtasp() { return 0; }
    protected void parseSidNid(java.lang.String p0, java.lang.String p1) {}
    protected void updateOtaspState() {}
    public void onAirplaneModeChanged(boolean p0) {}
    protected com.android.internal.telephony.Phone getPhone() { return null; }
    protected void handlePollStateResult(int p0, android.os.AsyncResult p1) {}
    protected void handlePollStateResultMessage(int p0, android.os.AsyncResult p1) {}
    protected void updateRoamingState() {}
    public void updateSpnDisplay() {}
    public boolean shouldForceDisplayNoService() { return false; }
    protected void setPowerStateToDesired() {}
    protected void setPowerStateToDesired(boolean p0, boolean p1, boolean p2) {}
    protected void onUpdateIccAvailability() {}
    protected final void log(java.lang.String p0) {}
    protected final void loge(java.lang.String p0) {}
    public int getCurrentDataConnectionState() { return 0; }
    public boolean isConcurrentVoiceAndDataAllowed() { return false; }
    public void onImsServiceStateChanged() {}
    public void setImsRegistrationState(boolean p0) {}
    public void onImsCapabilityChanged() {}
    public boolean isRadioOn() { return false; }
    public void pollState() {}
    public static java.util.List<android.telephony.CellIdentity> getPrioritizedCellIdentities(android.telephony.ServiceState p0) { return null; }
    public java.lang.String getServiceProviderName() { return null; }
    public int getCarrierNameDisplayBitmask(android.telephony.ServiceState p0) { return 0; }
    protected void setOperatorIdd(java.lang.String p0) {}
    public android.telephony.CellIdentity getCellIdentity() { return null; }
    public void requestCellIdentity(android.os.WorkSource p0, android.os.Message p1) {}
    public void setNotification(int p0) {}
    public void registerForDataConnectionAttached(int p0, android.os.Handler p1, int p2, java.lang.Object p3) {}
    public void unregisterForDataConnectionAttached(int p0, android.os.Handler p1) {}
    public void registerForDataConnectionDetached(int p0, android.os.Handler p1, int p2, java.lang.Object p3) {}
    public void unregisterForDataConnectionDetached(int p0, android.os.Handler p1) {}
    public void registerForVoiceRegStateOrRatChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForVoiceRegStateOrRatChanged(android.os.Handler p0) {}
    public void registerForDataRegStateOrRatChanged(int p0, android.os.Handler p1, int p2, java.lang.Object p3) {}
    public void unregisterForDataRegStateOrRatChanged(int p0, android.os.Handler p1) {}
    public void registerForAirplaneModeChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForAirplaneModeChanged(android.os.Handler p0) {}
    public void registerForNetworkAttached(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNetworkAttached(android.os.Handler p0) {}
    public void registerForNetworkDetached(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNetworkDetached(android.os.Handler p0) {}
    public void registerForPsRestrictedEnabled(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForPsRestrictedEnabled(android.os.Handler p0) {}
    public void registerForPsRestrictedDisabled(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForPsRestrictedDisabled(android.os.Handler p0) {}
    public void registerForImsCapabilityChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForImsCapabilityChanged(android.os.Handler p0) {}
    public void registerForServiceStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForServiceStateChanged(android.os.Handler p0) {}
    public void powerOffRadioSafely() {}
    public boolean processPendingRadioPowerOffAfterDataOff() { return false; }
    protected void hangupAndPowerOff() {}
    protected void cancelPollState() {}
    public java.lang.String getSystemProperty(java.lang.String p0, java.lang.String p1) { return null; }
    public java.util.List<android.telephony.CellInfo> getAllCellInfo() { return null; }
    public void setCellInfoMinInterval(int p0) {}
    public void requestAllCellInfo(android.os.WorkSource p0, android.os.Message p1) {}
    public void registerForSubscriptionInfoReady(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSubscriptionInfoReady(android.os.Handler p0) {}
    public void onTelecomVoiceServiceStateOverrideChanged() {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public boolean isImsRegistered() { return false; }
    protected void checkCorrectThread() {}
    protected boolean isCallerOnDifferentThread() { return false; }
    protected boolean inSameCountry(java.lang.String p0) { return false; }
    protected void setRoamingType(android.telephony.ServiceState p0) {}
    protected java.lang.String getHomeOperatorNumeric() { return null; }
    protected int getPhoneId() { return 0; }
    protected final boolean alwaysOnHomeNetwork(android.os.BaseBundle p0) { return false; }
    protected final boolean isRoamingInGsmNetwork(android.os.BaseBundle p0, java.lang.String p1) { return false; }
    protected final boolean isNonRoamingInGsmNetwork(android.os.BaseBundle p0, java.lang.String p1) { return false; }
    protected final boolean isRoamingInCdmaNetwork(android.os.BaseBundle p0, java.lang.String p1) { return false; }
    protected final boolean isNonRoamingInCdmaNetwork(android.os.BaseBundle p0, java.lang.String p1) { return false; }
    public boolean isDeviceShuttingDown() { return false; }
    public int getCombinedRegState(android.telephony.ServiceState p0) { return 0; }
    public com.android.internal.telephony.LocaleTracker getLocaleTracker() { return null; }
    java.lang.String getCdmaEriText(int p0, int p1) { return null; }
    public void updateOperatorNameForCellInfo(java.util.List<android.telephony.CellInfo> p0) {}
    public java.lang.String filterOperatorNameByPattern(java.lang.String p0) { return null; }
    public void registerForNrStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNrStateChanged(android.os.Handler p0) {}
    public void registerForNrFrequencyChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNrFrequencyChanged(android.os.Handler p0) {}
    public void registerForCssIndicatorChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCssIndicatorChanged(android.os.Handler p0) {}
    public java.util.Set<java.lang.Integer> getNrContextIds() { return null; }
    public com.android.internal.telephony.metrics.ServiceStateStats getServiceStateStats() { return null; }
    public void setServiceStateStats(com.android.internal.telephony.metrics.ServiceStateStats p0) {}
    public void registerForAreaCodeChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForAreaCodeChanged(android.os.Handler p0) {}
    public android.telephony.CellIdentity getLastKnownCellIdentity() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CarrierNameDisplayBitmask {
    }

    private class SstSubscriptionsChangedListener extends android.telephony.SubscriptionManager.OnSubscriptionsChangedListener {
        public void onSubscriptionsChanged() {}
    }
}
