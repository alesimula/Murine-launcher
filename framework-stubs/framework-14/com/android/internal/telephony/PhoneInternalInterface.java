package com.android.internal.telephony;

public interface PhoneInternalInterface {
    public static final boolean DEBUG_PHONE = true;
    public static final java.lang.String FEATURE_ENABLE_MMS = "enableMMS";
    public static final java.lang.String FEATURE_ENABLE_SUPL = "enableSUPL";
    public static final java.lang.String FEATURE_ENABLE_DUN = "enableDUN";
    public static final java.lang.String FEATURE_ENABLE_HIPRI = "enableHIPRI";
    public static final java.lang.String FEATURE_ENABLE_DUN_ALWAYS = "enableDUNAlways";
    public static final java.lang.String FEATURE_ENABLE_FOTA = "enableFOTA";
    public static final java.lang.String FEATURE_ENABLE_IMS = "enableIMS";
    public static final java.lang.String FEATURE_ENABLE_CBS = "enableCBS";
    public static final java.lang.String FEATURE_ENABLE_EMERGENCY = "enableEmergency";
    public static final java.lang.String REASON_ROAMING_ON = "roamingOn";
    public static final java.lang.String REASON_ROAMING_OFF = "roamingOff";
    public static final java.lang.String REASON_DATA_DISABLED_INTERNAL = "dataDisabledInternal";
    public static final java.lang.String REASON_DATA_ENABLED = "dataEnabled";
    public static final java.lang.String REASON_DATA_ATTACHED = "dataAttached";
    public static final java.lang.String REASON_DATA_DETACHED = "dataDetached";
    public static final java.lang.String REASON_CDMA_DATA_ATTACHED = "cdmaDataAttached";
    public static final java.lang.String REASON_CDMA_DATA_DETACHED = "cdmaDataDetached";
    public static final java.lang.String REASON_APN_CHANGED = "apnChanged";
    public static final java.lang.String REASON_APN_SWITCHED = "apnSwitched";
    public static final java.lang.String REASON_APN_FAILED = "apnFailed";
    public static final java.lang.String REASON_RESTORE_DEFAULT_APN = "restoreDefaultApn";
    public static final java.lang.String REASON_RADIO_TURNED_OFF = "radioTurnedOff";
    public static final java.lang.String REASON_PDP_RESET = "pdpReset";
    public static final java.lang.String REASON_VOICE_CALL_ENDED = "2GVoiceCallEnded";
    public static final java.lang.String REASON_VOICE_CALL_STARTED = "2GVoiceCallStarted";
    public static final java.lang.String REASON_PS_RESTRICT_ENABLED = "psRestrictEnabled";
    public static final java.lang.String REASON_PS_RESTRICT_DISABLED = "psRestrictDisabled";
    public static final java.lang.String REASON_SIM_LOADED = "simLoaded";
    public static final java.lang.String REASON_NW_TYPE_CHANGED = "nwTypeChanged";
    public static final java.lang.String REASON_DATA_DEPENDENCY_MET = "dependencyMet";
    public static final java.lang.String REASON_DATA_DEPENDENCY_UNMET = "dependencyUnmet";
    public static final java.lang.String REASON_LOST_DATA_CONNECTION = "lostDataConnection";
    public static final java.lang.String REASON_CONNECTED = "connected";
    public static final java.lang.String REASON_SINGLE_PDN_ARBITRATION = "SinglePdnArbitration";
    public static final java.lang.String REASON_DATA_SPECIFIC_DISABLED = "specificDisabled";
    public static final java.lang.String REASON_SIM_NOT_READY = "simNotReady";
    public static final java.lang.String REASON_IWLAN_AVAILABLE = "iwlanAvailable";
    public static final java.lang.String REASON_CARRIER_CHANGE = "carrierChange";
    public static final java.lang.String REASON_CARRIER_ACTION_DISABLE_METERED_APN = "carrierActionDisableMeteredApn";
    public static final java.lang.String REASON_CSS_INDICATOR_CHANGED = "cssIndicatorChanged";
    public static final java.lang.String REASON_RELEASED_BY_CONNECTIVITY_SERVICE = "releasedByConnectivityService";
    public static final java.lang.String REASON_DATA_ENABLED_OVERRIDE = "dataEnabledOverride";
    public static final java.lang.String REASON_IWLAN_DATA_SERVICE_DIED = "iwlanDataServiceDied";
    public static final java.lang.String REASON_VCN_REQUESTED_TEARDOWN = "vcnRequestedTeardown";
    public static final java.lang.String REASON_DATA_UNTHROTTLED = "dataUnthrottled";
    public static final java.lang.String REASON_TRAFFIC_DESCRIPTORS_UPDATED = "trafficDescriptorsUpdated";
    public static final int BM_UNSPECIFIED = 0;
    public static final int BM_EURO_BAND = 1;
    public static final int BM_US_BAND = 2;
    public static final int BM_JPN_BAND = 3;
    public static final int BM_AUS_BAND = 4;
    public static final int BM_AUS2_BAND = 5;
    public static final int BM_CELL_800 = 6;
    public static final int BM_PCS = 7;
    public static final int BM_JTACS = 8;
    public static final int BM_KOREA_PCS = 9;
    public static final int BM_4_450M = 10;
    public static final int BM_IMT2000 = 11;
    public static final int BM_7_700M2 = 12;
    public static final int BM_8_1800M = 13;
    public static final int BM_9_900M = 14;
    public static final int BM_10_800M_2 = 15;
    public static final int BM_EURO_PAMR = 16;
    public static final int BM_AWS = 17;
    public static final int BM_US_2500M = 18;
    public static final int BM_NUM_BAND_MODES = 19;
    public static final int PREFERRED_NT_MODE = Integer.valueOf(0);
    public static final int CDMA_RM_HOME = 0;
    public static final int CDMA_RM_AFFILIATED = 1;
    public static final int CDMA_RM_ANY = 2;
    public static final int CDMA_SUBSCRIPTION_UNKNOWN = -1;
    public static final int CDMA_SUBSCRIPTION_RUIM_SIM = 0;
    public static final int CDMA_SUBSCRIPTION_NV = 1;
    public static final int PREFERRED_CDMA_SUBSCRIPTION = 0;
    public static final int TTY_MODE_OFF = 0;
    public static final int TTY_MODE_FULL = 1;
    public static final int TTY_MODE_HCO = 2;
    public static final int TTY_MODE_VCO = 3;
    public static final int CDMA_OTA_PROVISION_STATUS_SPL_UNLOCKED = 0;
    public static final int CDMA_OTA_PROVISION_STATUS_SPC_RETRIES_EXCEEDED = 1;
    public static final int CDMA_OTA_PROVISION_STATUS_A_KEY_EXCHANGED = 2;
    public static final int CDMA_OTA_PROVISION_STATUS_SSD_UPDATED = 3;
    public static final int CDMA_OTA_PROVISION_STATUS_NAM_DOWNLOADED = 4;
    public static final int CDMA_OTA_PROVISION_STATUS_MDN_DOWNLOADED = 5;
    public static final int CDMA_OTA_PROVISION_STATUS_IMSI_DOWNLOADED = 6;
    public static final int CDMA_OTA_PROVISION_STATUS_PRL_DOWNLOADED = 7;
    public static final int CDMA_OTA_PROVISION_STATUS_COMMITTED = 8;
    public static final int CDMA_OTA_PROVISION_STATUS_OTAPA_STARTED = 9;
    public static final int CDMA_OTA_PROVISION_STATUS_OTAPA_STOPPED = 10;
    public static final int CDMA_OTA_PROVISION_STATUS_OTAPA_ABORTED = 11;
    public android.telephony.ServiceState getServiceState();
    public com.android.internal.telephony.PhoneConstants.DataState getDataConnectionState(java.lang.String p0);
    public android.telephony.PreciseDataConnectionState getPreciseDataConnectionState(java.lang.String p0);
    public int getDataActivityState();
    public java.util.List<? extends com.android.internal.telephony.MmiCode> getPendingMmiCodes();
    public void sendUssdResponse(java.lang.String p0);
    public void registerForSuppServiceNotification(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForSuppServiceNotification(android.os.Handler p0);
    public void acceptCall(int p0) throws com.android.internal.telephony.CallStateException;
    public void rejectCall() throws com.android.internal.telephony.CallStateException;
    public void switchHoldingAndActive() throws com.android.internal.telephony.CallStateException;
    public boolean canConference();
    public void conference() throws com.android.internal.telephony.CallStateException;
    public boolean canTransfer();
    public void explicitCallTransfer() throws com.android.internal.telephony.CallStateException;
    public void clearDisconnected();
    public com.android.internal.telephony.Call getForegroundCall();
    public com.android.internal.telephony.Call getBackgroundCall();
    public com.android.internal.telephony.Call getRingingCall();
    public com.android.internal.telephony.Connection dial(java.lang.String p0, com.android.internal.telephony.PhoneInternalInterface.DialArgs p1, java.util.function.Consumer<com.android.internal.telephony.Phone> p2) throws com.android.internal.telephony.CallStateException;
    default public com.android.internal.telephony.Connection dial(java.lang.String p0, com.android.internal.telephony.PhoneInternalInterface.DialArgs p1) throws com.android.internal.telephony.CallStateException { return null; }
    public com.android.internal.telephony.Connection startConference(java.lang.String[] p0, com.android.internal.telephony.PhoneInternalInterface.DialArgs p1) throws com.android.internal.telephony.CallStateException;
    public boolean handlePinMmi(java.lang.String p0);
    public boolean handleUssdRequest(java.lang.String p0, android.os.ResultReceiver p1) throws com.android.internal.telephony.CallStateException;
    public boolean handleInCallMmiCommands(java.lang.String p0) throws com.android.internal.telephony.CallStateException;
    public void sendDtmf(char p0);
    public void startDtmf(char p0);
    public void stopDtmf();
    default public void setRadioPower(boolean p0) {}
    default public void setRadioPowerOnForTestEmergencyCall(boolean p0) {}
    default public void setRadioPower(boolean p0, boolean p1, boolean p2, boolean p3) {}
    default public void setRadioPowerForReason(boolean p0, int p1) {}
    default public java.util.Set<java.lang.Integer> getRadioPowerOffReasons() { return null; }
    default public void setRadioPowerForReason(boolean p0, boolean p1, boolean p2, boolean p3, int p4) {}
    public java.lang.String getLine1Number();
    public java.lang.String getLine1AlphaTag();
    public boolean setLine1Number(java.lang.String p0, java.lang.String p1, android.os.Message p2);
    public java.lang.String getVoiceMailNumber();
    public java.lang.String getVoiceMailAlphaTag();
    public void setVoiceMailNumber(java.lang.String p0, java.lang.String p1, android.os.Message p2);
    public void getCallForwardingOption(int p0, android.os.Message p1);
    public void getCallForwardingOption(int p0, int p1, android.os.Message p2);
    public void setCallForwardingOption(int p0, int p1, java.lang.String p2, int p3, android.os.Message p4);
    public void setCallForwardingOption(int p0, int p1, java.lang.String p2, int p3, int p4, android.os.Message p5);
    public void getCallBarring(java.lang.String p0, java.lang.String p1, android.os.Message p2, int p3);
    public void setCallBarring(java.lang.String p0, boolean p1, java.lang.String p2, android.os.Message p3, int p4);
    public void getOutgoingCallerIdDisplay(android.os.Message p0);
    public void setOutgoingCallerIdDisplay(int p0, android.os.Message p1);
    public void getCallWaiting(android.os.Message p0);
    public void setCallWaiting(boolean p0, android.os.Message p1);
    public void getAvailableNetworks(android.os.Message p0);
    public void startNetworkScan(android.telephony.NetworkScanRequest p0, android.os.Message p1);
    public void stopNetworkScan(android.os.Message p0);
    public void setMute(boolean p0);
    public boolean getMute();
    default public void updateServiceLocation(android.os.WorkSource p0) {}
    default public void updateServiceLocation() {}
    public void enableLocationUpdates();
    public void disableLocationUpdates();
    public boolean getDataRoamingEnabled();
    public void setDataRoamingEnabled(boolean p0);
    public boolean isUserDataEnabled();
    public java.lang.String getDeviceId();
    public java.lang.String getDeviceSvn();
    public java.lang.String getSubscriberId();
    public java.lang.String getGroupIdLevel1();
    public java.lang.String getGroupIdLevel2();
    public java.lang.String getEsn();
    public java.lang.String getMeid();
    public java.lang.String getImei();
    public int getImeiType();
    public com.android.internal.telephony.IccPhoneBookInterfaceManager getIccPhoneBookInterfaceManager();
    public void activateCellBroadcastSms(int p0, android.os.Message p1);
    public void getCellBroadcastSmsConfig(android.os.Message p0);
    public void setCellBroadcastSmsConfig(int[] p0, android.os.Message p1);
    public void setCarrierInfoForImsiEncryption(android.telephony.ImsiEncryptionInfo p0);
    public android.telephony.ImsiEncryptionInfo getCarrierInfoForImsiEncryption(int p0, boolean p1);
    public void resetCarrierKeysForImsiEncryption();
    public java.lang.String getMobileProvisioningUrl();
    public boolean updateUsageSetting();

    public static enum DataActivityState {
        NONE,
        DATAIN,
        DATAOUT,
        DATAINANDOUT,
        DORMANT;
    }

    public static class DialArgs {
        public final com.android.internal.telephony.UUSInfo uusInfo = null;
        public final int clirMode = 0;
        public final boolean isEmergency = false;
        public final int videoState = 0;
        public final android.os.Bundle intentExtras = null;
        public final int eccCategory = 0;
        protected DialArgs(com.android.internal.telephony.PhoneInternalInterface.DialArgs.Builder p0) {}

        public static class Builder<T extends com.android.internal.telephony.PhoneInternalInterface.DialArgs.Builder<T>> {
            protected com.android.internal.telephony.UUSInfo mUusInfo;
            protected int mClirMode;
            protected boolean mIsEmergency;
            protected int mVideoState;
            protected android.os.Bundle mIntentExtras;
            protected int mEccCategory;
            public Builder() {}
            public static com.android.internal.telephony.PhoneInternalInterface.DialArgs.Builder from(com.android.internal.telephony.PhoneInternalInterface.DialArgs p0) { return null; }
            public T setUusInfo(com.android.internal.telephony.UUSInfo p0) { return null; }
            public T setClirMode(int p0) { return null; }
            public T setIsEmergency(boolean p0) { return null; }
            public T setVideoState(int p0) { return null; }
            public T setIntentExtras(android.os.Bundle p0) { return null; }
            public T setEccCategory(int p0) { return null; }
            public com.android.internal.telephony.PhoneInternalInterface.DialArgs build() { return null; }
        }
    }

    public static enum SuppService {
        UNKNOWN,
        SWITCH,
        SEPARATE,
        TRANSFER,
        CONFERENCE,
        REJECT,
        HANGUP,
        RESUME,
        HOLD;
    }
}
