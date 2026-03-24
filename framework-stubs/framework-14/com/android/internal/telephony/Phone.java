package com.android.internal.telephony;

public abstract class Phone extends android.os.Handler implements com.android.internal.telephony.PhoneInternalInterface {
    protected static final java.lang.Object lockForRadioTechnologyChange = null;
    protected final int USSD_MAX_QUEUE = 0;
    public static final java.lang.String NETWORK_SELECTION_KEY = "network_selection_key";
    public static final java.lang.String NETWORK_SELECTION_NAME_KEY = "network_selection_name_key";
    public static final java.lang.String NETWORK_SELECTION_SHORT_KEY = "network_selection_short_key";
    public static final java.lang.String DATA_DISABLED_ON_BOOT_KEY = "disabled_on_boot_key";
    public static final java.lang.String DATA_ROAMING_IS_USER_SETTING_KEY = "data_roaming_is_user_setting_key";
    protected static final int EVENT_RADIO_AVAILABLE = 1;
    protected static final int EVENT_SSN = 2;
    protected static final int EVENT_SIM_RECORDS_LOADED = 3;
    protected static final int EVENT_RADIO_ON = 5;
    protected static final int EVENT_GET_BASEBAND_VERSION_DONE = 6;
    protected static final int EVENT_USSD = 7;
    public static final int EVENT_RADIO_OFF_OR_NOT_AVAILABLE = 8;
    protected static final int EVENT_SET_CALL_FORWARD_DONE = 12;
    protected static final int EVENT_GET_CALL_FORWARD_DONE = 13;
    protected static final int EVENT_CALL_RING = 14;
    protected static final int EVENT_SET_CLIR_COMPLETE = 18;
    protected static final int EVENT_REGISTERED_TO_NETWORK = 19;
    protected static final int EVENT_SET_VM_NUMBER_DONE = 20;
    protected static final int EVENT_GET_DEVICE_IDENTITY_DONE = 21;
    protected static final int EVENT_RUIM_RECORDS_LOADED = 22;
    protected static final int EVENT_NV_READY = 23;
    public static final int EVENT_EMERGENCY_CALLBACK_MODE_ENTER = 25;
    protected static final int EVENT_EXIT_EMERGENCY_CALLBACK_RESPONSE = 26;
    protected static final int EVENT_CDMA_SUBSCRIPTION_SOURCE_CHANGED = 27;
    protected static final int EVENT_SET_NETWORK_AUTOMATIC = 28;
    protected static final int EVENT_ICC_RECORD_EVENTS = 29;
    protected static final int EVENT_ICC_CHANGED = 30;
    protected static final int EVENT_SRVCC_STATE_CHANGED = 31;
    protected static final int EVENT_GET_RADIO_CAPABILITY = 35;
    protected static final int EVENT_SS = 36;
    protected static final int EVENT_VOICE_RADIO_TECH_CHANGED = 39;
    protected static final int EVENT_REQUEST_VOICE_RADIO_TECH_DONE = 40;
    protected static final int EVENT_RIL_CONNECTED = 41;
    protected static final int EVENT_UPDATE_PHONE_OBJECT = 42;
    protected static final int EVENT_CARRIER_CONFIG_CHANGED = 43;
    protected static final int EVENT_SET_ROAMING_PREFERENCE_DONE = 44;
    protected static final int EVENT_MODEM_RESET = 45;
    protected static final int EVENT_VRS_OR_RAT_CHANGED = 46;
    protected static final int EVENT_RADIO_STATE_CHANGED = 47;
    protected static final int EVENT_SET_CARRIER_DATA_ENABLED = 48;
    protected static final int EVENT_GET_AVAILABLE_NETWORKS_DONE = 51;
    protected static final int EVENT_UICC_APPS_ENABLEMENT_STATUS_CHANGED = 53;
    protected static final int EVENT_UICC_APPS_ENABLEMENT_SETTING_CHANGED = 54;
    protected static final int EVENT_GET_UICC_APPS_ENABLEMENT_DONE = 55;
    protected static final int EVENT_REAPPLY_UICC_APPS_ENABLEMENT_DONE = 56;
    protected static final int EVENT_REGISTRATION_FAILED = 57;
    protected static final int EVENT_BARRING_INFO_CHANGED = 58;
    protected static final int EVENT_LINK_CAPACITY_CHANGED = 59;
    protected static final int EVENT_RESET_CARRIER_KEY_IMSI_ENCRYPTION = 60;
    protected static final int EVENT_SET_VONR_ENABLED_DONE = 61;
    protected static final int EVENT_SUBSCRIPTIONS_CHANGED = 62;
    protected static final int EVENT_GET_USAGE_SETTING_DONE = 63;
    protected static final int EVENT_SET_USAGE_SETTING_DONE = 64;
    protected static final int EVENT_IMS_DEREGISTRATION_TRIGGERED = 65;
    protected static final int EVENT_SET_NULL_CIPHER_AND_INTEGRITY_DONE = 66;
    protected static final int EVENT_GET_DEVICE_IMEI_DONE = 67;
    protected static final int EVENT_TRIGGER_NOTIFY_ANBR = 68;
    protected static final int EVENT_LAST = 68;
    public static final java.lang.String CLIR_KEY = "clir_sub_key";
    public static final java.lang.String CF_STATUS = "cf_status_key";
    public static final java.lang.String CF_ID = "cf_id_key";
    public static final java.lang.String PREF_NULL_CIPHER_AND_INTEGRITY_ENABLED = "pref_null_cipher_and_integrity_enabled";
    public com.android.internal.telephony.CommandsInterface mCi;
    protected int mVmCount;
    protected com.android.internal.telephony.data.DataNetworkController mDataNetworkController;
    protected com.android.internal.telephony.CarrierSignalAgent mCarrierSignalAgent;
    protected com.android.internal.telephony.CarrierActionAgent mCarrierActionAgent;
    protected boolean mIsPhoneInEcmState;
    protected boolean mEcmCanceledForEmergency;
    protected boolean mIsVideoCapable;
    protected com.android.internal.telephony.uicc.UiccController mUiccController;
    protected final java.util.concurrent.atomic.AtomicReference<com.android.internal.telephony.uicc.IccRecords> mIccRecords = null;
    public com.android.internal.telephony.SmsStorageMonitor mSmsStorageMonitor;
    public com.android.internal.telephony.SmsUsageMonitor mSmsUsageMonitor;
    protected java.util.concurrent.atomic.AtomicReference<com.android.internal.telephony.uicc.UiccCardApplication> mUiccApplication;
    protected com.android.internal.telephony.DeviceStateMonitor mDeviceStateMonitor;
    protected com.android.internal.telephony.DisplayInfoController mDisplayInfoController;
    protected com.android.internal.telephony.data.AccessNetworksManager mAccessNetworksManager;
    protected com.android.internal.telephony.CarrierResolver mCarrierResolver;
    protected com.android.internal.telephony.SignalStrengthController mSignalStrengthController;
    protected int mPhoneId;
    protected com.android.internal.telephony.Phone mImsPhone;
    protected com.android.internal.telephony.TelephonyComponentFactory mTelephonyComponentFactory;
    public static final java.lang.String CS_FALLBACK = "cs_fallback";
    public static final java.lang.String CS_FALLBACK_SS = "cs_fallback_ss";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_KEY_ALERT_TITLE = "android.telephony.ims.extra.WFC_REGISTRATION_FAILURE_TITLE";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_KEY_ALERT_MESSAGE = "android.telephony.ims.extra.WFC_REGISTRATION_FAILURE_MESSAGE";
    public static final java.lang.String EXTRA_KEY_ALERT_SHOW = "alertShow";
    public static final java.lang.String EXTRA_KEY_NOTIFICATION_MESSAGE = "notificationMessage";
    protected final com.android.internal.telephony.RegistrantList mPreciseCallStateRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mDisconnectRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mMmiCompleteRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mMmiRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mUnknownConnectionRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mSuppServiceFailedRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mRadioOffOrNotAvailableRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mSimRecordsLoadedRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mEmergencyCallToggledRegistrants = null;
    protected com.android.internal.telephony.Registrant mPostDialHandler;
    protected final com.android.internal.telephony.LocalLog mLocalLog = null;
    protected final android.content.Context mContext = null;
    protected com.android.internal.telephony.subscription.SubscriptionManagerService mSubscriptionManagerService;
    protected com.android.internal.telephony.PhoneNotifier mNotifier;
    protected com.android.internal.telephony.test.SimulatedRadioControl mSimulatedRadioControl;
    protected boolean mIsCarrierNrSupported;
    protected boolean mIsAllowedNetworkTypesLoadedFromDb;
    protected com.android.internal.telephony.metrics.VoiceCallSessionStats mVoiceCallSessionStats;
    protected com.android.internal.telephony.metrics.SmsStats mSmsStats;
    protected com.android.internal.telephony.data.LinkBandwidthEstimator mLinkBandwidthEstimator;
    public static final int IMEI_TYPE_UNKNOWN = -1;
    public static final int IMEI_TYPE_PRIMARY = 1;
    public static final int IMEI_TYPE_SECONDARY = 2;
    protected void handleExitEmergencyCallbackMode() {}
    public com.android.internal.telephony.uicc.IccRecords getIccRecords() { return null; }
    public java.lang.String getPhoneName() { return null; }
    protected void setPhoneName(java.lang.String p0) {}
    public java.lang.String getNai() { return null; }
    public java.lang.String getActionDetached() { return null; }
    public java.lang.String getActionAttached() { return null; }
    public java.lang.String getSystemProperty(java.lang.String p0, java.lang.String p1) { return null; }
    protected Phone(java.lang.String p0, com.android.internal.telephony.PhoneNotifier p1, android.content.Context p2, com.android.internal.telephony.CommandsInterface p3, boolean p4) { super(); }
    protected Phone(java.lang.String p0, com.android.internal.telephony.PhoneNotifier p1, android.content.Context p2, com.android.internal.telephony.CommandsInterface p3, boolean p4, int p5, com.android.internal.telephony.TelephonyComponentFactory p6) { super(); }
    public void createImsPhone() {}
    public boolean supportsConversionOfCdmaCallerIdMmiCodesWhileRoaming() { return false; }
    public boolean isClirActivationAndDeactivationPrevented() { return false; }
    public void handleMessage(android.os.Message p0) {}
    public java.util.ArrayList<com.android.internal.telephony.Connection> getHandoverConnection() { return null; }
    public void notifySrvccState(int p0) {}
    public void registerForSilentRedial(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSilentRedial(android.os.Handler p0) {}
    public void registerForVolteSilentRedial(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForVolteSilentRedial(android.os.Handler p0) {}
    public android.content.Context getContext() { return null; }
    protected abstract void onUpdateIccAvailability();
    public void disableDnsCheck(boolean p0) {}
    public boolean isDnsCheckDisabled() { return false; }
    public void registerForPreciseCallStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForPreciseCallStateChanged(android.os.Handler p0) {}
    public void registerForHandoverStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForHandoverStateChanged(android.os.Handler p0) {}
    public void notifyHandoverStateChanged(com.android.internal.telephony.Connection p0) {}
    public void registerForRedialConnectionChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForRedialConnectionChanged(android.os.Handler p0) {}
    public void notifyRedialConnectionChanged(com.android.internal.telephony.Connection p0) {}
    protected void setIsInEmergencyCall() {}
    public void notifySmsSent(java.lang.String p0) {}
    public boolean isInEmergencySmsMode() { return false; }
    protected void migrateFrom(com.android.internal.telephony.Phone p0) {}
    protected void migrate(com.android.internal.telephony.RegistrantList p0, com.android.internal.telephony.RegistrantList p1) {}
    public void registerForUnknownConnection(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForUnknownConnection(android.os.Handler p0) {}
    public void registerForNewRingingConnection(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNewRingingConnection(android.os.Handler p0) {}
    public void registerForVideoCapabilityChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForVideoCapabilityChanged(android.os.Handler p0) {}
    public void registerForInCallVoicePrivacyOn(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForInCallVoicePrivacyOn(android.os.Handler p0) {}
    public void registerForInCallVoicePrivacyOff(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForInCallVoicePrivacyOff(android.os.Handler p0) {}
    public void registerForIncomingRing(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForIncomingRing(android.os.Handler p0) {}
    public void registerForDisconnect(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForDisconnect(android.os.Handler p0) {}
    public void registerForSuppServiceFailed(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSuppServiceFailed(android.os.Handler p0) {}
    public void registerForMmiInitiate(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForMmiInitiate(android.os.Handler p0) {}
    public void registerForMmiComplete(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForMmiComplete(android.os.Handler p0) {}
    public void registerForSimRecordsLoaded(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSimRecordsLoaded(android.os.Handler p0) {}
    public void registerForTtyModeReceived(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForTtyModeReceived(android.os.Handler p0) {}
    public void setNetworkSelectionModeAutomatic(android.os.Message p0) {}
    public void getNetworkSelectionMode(android.os.Message p0) {}
    public java.util.List<android.telephony.ClientRequestStats> getClientRequestStats() { return null; }
    public void selectNetworkManually(com.android.internal.telephony.OperatorInfo p0, boolean p1, android.os.Message p2) {}
    public void registerForEmergencyCallToggle(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForEmergencyCallToggle(android.os.Handler p0) {}
    protected void updateManualNetworkSelection(com.android.internal.telephony.Phone.NetworkSelectMessage p0) {}
    public com.android.internal.telephony.OperatorInfo getSavedNetworkSelection() { return null; }
    public void saveClirSetting(int p0) {}
    public boolean getUnitTestMode() { return false; }
    protected void notifyDisconnectP(com.android.internal.telephony.Connection p0) {}
    public void registerForServiceStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForServiceStateChanged(android.os.Handler p0) {}
    public void registerForRingbackTone(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForRingbackTone(android.os.Handler p0) {}
    public void registerForOnHoldTone(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForOnHoldTone(android.os.Handler p0) {}
    public void registerForResendIncallMute(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForResendIncallMute(android.os.Handler p0) {}
    public void registerForCellInfo(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCellInfo(android.os.Handler p0) {}
    public void setEchoSuppressionEnabled() {}
    protected void notifyServiceStateChangedP(android.telephony.ServiceState p0) {}
    protected void notifyServiceStateChangedPForSubId(android.telephony.ServiceState p0, int p1) {}
    public com.android.internal.telephony.test.SimulatedRadioControl getSimulatedRadioControl() { return null; }
    java.util.Locale getLocaleFromCarrierProperties() { return null; }
    public abstract com.android.internal.telephony.PhoneConstants.State getState();
    public com.android.internal.telephony.uicc.IccFileHandler getIccFileHandler() { return null; }
    public android.os.Handler getHandler() { return null; }
    public void updatePhoneObject(int p0) {}
    public com.android.internal.telephony.ServiceStateTracker getServiceStateTracker() { return null; }
    public void setVoiceServiceStateOverride(boolean p0) {}
    public boolean isRadioOffForThermalMitigation() { return false; }
    public com.android.internal.telephony.emergency.EmergencyNumberTracker getEmergencyNumberTracker() { return null; }
    public com.android.internal.telephony.CallTracker getCallTracker() { return null; }
    public com.android.internal.telephony.data.AccessNetworksManager getAccessNetworksManager() { return null; }
    public com.android.internal.telephony.DeviceStateMonitor getDeviceStateMonitor() { return null; }
    public com.android.internal.telephony.DisplayInfoController getDisplayInfoController() { return null; }
    public com.android.internal.telephony.SignalStrengthController getSignalStrengthController() { return null; }
    public void setVoiceActivationState(int p0) {}
    public void setDataActivationState(int p0) {}
    public int getVoiceActivationState() { return 0; }
    public int getDataActivationState() { return 0; }
    public void updateVoiceMail() {}
    public com.android.internal.telephony.uicc.IccCardApplicationStatus.AppType getCurrentUiccAppType() { return null; }
    public com.android.internal.telephony.IccCard getIccCard() { return null; }
    public java.lang.String getIccSerialNumber() { return null; }
    public java.lang.String getFullIccSerialNumber() { return null; }
    public boolean getIccRecordsLoaded() { return false; }
    public void setCellInfoMinInterval(int p0) {}
    public java.util.List<android.telephony.CellInfo> getAllCellInfo() { return null; }
    public void requestCellInfoUpdate(android.os.WorkSource p0, android.os.Message p1) {}
    public android.telephony.CellIdentity getCurrentCellIdentity() { return null; }
    public void getCellIdentity(android.os.WorkSource p0, android.os.Message p1) {}
    public void setCellInfoListRate(int p0, android.os.WorkSource p1) {}
    public boolean getMessageWaitingIndicator() { return false; }
    public java.lang.String getManualNetworkSelectionPlmn() { return null; }
    public void setVoiceCallForwardingFlag(int p0, boolean p1, java.lang.String p2) {}
    public void setVoiceCallForwardingFlag(com.android.internal.telephony.uicc.IccRecords p0, int p1, boolean p2, java.lang.String p3) {}
    public boolean getCallForwardingIndicator() { return false; }
    public com.android.internal.telephony.CarrierSignalAgent getCarrierSignalAgent() { return null; }
    public com.android.internal.telephony.CarrierActionAgent getCarrierActionAgent() { return null; }
    public void queryCdmaRoamingPreference(android.os.Message p0) {}
    public void queryCdmaSubscriptionMode(android.os.Message p0) {}
    public android.telephony.SignalStrength getSignalStrength() { return null; }
    public boolean isConcurrentVoiceAndDataAllowed() { return false; }
    public void setCdmaRoamingPreference(int p0, android.os.Message p1) {}
    public void setCdmaSubscriptionMode(int p0, android.os.Message p1) {}
    public void notifyAllowedNetworkTypesChanged(int p0) {}
    public void isNrDualConnectivityEnabled(android.os.Message p0, android.os.WorkSource p1) {}
    public void setNrDualConnectivityState(int p0, android.os.Message p1, android.os.WorkSource p2) {}
    public long getAllowedNetworkTypes(int p0) { return 0L; }
    public void loadAllowedNetworksFromSubscriptionDatabase() {}
    public static java.lang.String convertAllowedNetworkTypeMapIndexToDbName(int p0) { return null; }
    public void setAllowedNetworkTypes(int p0, long p1, android.os.Message p2) {}
    protected void updateAllowedNetworkTypes(android.os.Message p0) {}
    public void getAllowedNetworkTypesBitmask(android.os.Message p0) {}
    public void registerForPreferredNetworkTypeChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForPreferredNetworkTypeChanged(android.os.Handler p0) {}
    public int getCachedAllowedNetworkTypesBitmask() { return 0; }
    public void getSmscAddress(android.os.Message p0) {}
    public void setSmscAddress(java.lang.String p0, android.os.Message p1) {}
    public void setTTYMode(int p0, android.os.Message p1) {}
    public void setUiTTYMode(int p0, android.os.Message p1) {}
    public void queryTTYMode(android.os.Message p0) {}
    public void enableEnhancedVoicePrivacy(boolean p0, android.os.Message p1) {}
    public void getEnhancedVoicePrivacy(android.os.Message p0) {}
    public void setBandMode(int p0, android.os.Message p1) {}
    public void queryAvailableBandMode(android.os.Message p0) {}
    @java.lang.Deprecated
    public void invokeOemRilRequestRaw(byte[] p0, android.os.Message p1) {}
    @java.lang.Deprecated
    public void invokeOemRilRequestStrings(java.lang.String[] p0, android.os.Message p1) {}
    public void nvReadItem(int p0, android.os.Message p1, android.os.WorkSource p2) {}
    public void nvWriteItem(int p0, java.lang.String p1, android.os.Message p2, android.os.WorkSource p3) {}
    public void nvWriteCdmaPrl(byte[] p0, android.os.Message p1) {}
    public void rebootModem(android.os.Message p0) {}
    public void resetModemConfig(android.os.Message p0) {}
    public void eraseModemConfig(android.os.Message p0) {}
    public boolean eraseDataInSharedPreferences() { return false; }
    public void setSystemSelectionChannels(java.util.List<android.telephony.RadioAccessSpecifier> p0, android.os.Message p1) {}
    public void getSystemSelectionChannels(android.os.Message p0) {}
    public void notifyDataActivity() {}
    public void notifyDataConnection(android.telephony.PreciseDataConnectionState p0) {}
    public void notifyOtaspChanged(int p0) {}
    public void notifyVoiceActivationStateChanged(int p0) {}
    public void notifyDataActivationStateChanged(int p0) {}
    public void notifyUserMobileDataStateChanged(boolean p0) {}
    public void notifyDisplayInfoChanged(android.telephony.TelephonyDisplayInfo p0) {}
    public void notifySignalStrength() {}
    public com.android.internal.telephony.PhoneConstants.DataState getDataConnectionState(java.lang.String p0) { return null; }
    public android.telephony.PreciseDataConnectionState getPreciseDataConnectionState(java.lang.String p0) { return null; }
    public void notifyCellInfo(java.util.List<android.telephony.CellInfo> p0) {}
    public void registerForPhysicalChannelConfig(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForPhysicalChannelConfig(android.os.Handler p0) {}
    public void notifyPhysicalChannelConfig(java.util.List<android.telephony.PhysicalChannelConfig> p0) {}
    public java.util.List<android.telephony.PhysicalChannelConfig> getPhysicalChannelConfigList() { return null; }
    public void notifySrvccStateChanged(int p0) {}
    public void notifyEmergencyNumberList() {}
    public void notifyOutgoingEmergencySms(android.telephony.emergency.EmergencyNumber p0) {}
    public void notifyDataEnabled(boolean p0, int p1) {}
    public void notifyLinkCapacityEstimateChanged(java.util.List<android.telephony.LinkCapacityEstimate> p0) {}
    public boolean isInEmergencyCall() { return false; }
    protected static boolean getInEcmMode() { return false; }
    public boolean isInEcm() { return false; }
    public boolean isInImsEcm() { return false; }
    public boolean isInCdmaEcm() { return false; }
    public void setIsInEcm(boolean p0) {}
    public boolean isEcmCanceledForEmergency() { return false; }
    public void setEcmCanceledForEmergency(boolean p0) {}
    public boolean isImsVideoCallOrConferencePresent() { return false; }
    public abstract int getPhoneType();
    public int getVoiceMessageCount() { return 0; }
    public void setVoiceMessageCount(int p0) {}
    protected int getStoredVoiceMessageCount() { return 0; }
    public void sendDialerSpecialCode(java.lang.String p0) {}
    public int getCdmaEriIconIndex() { return 0; }
    public int getCdmaEriIconMode() { return 0; }
    public java.lang.String getCdmaEriText() { return null; }
    public java.lang.String getCdmaMin() { return null; }
    public boolean isMinInfoReady() { return false; }
    public java.lang.String getCdmaPrlVersion() { return null; }
    public boolean isDataSuspended() { return false; }
    public void sendBurstDtmf(java.lang.String p0, int p1, int p2, android.os.Message p3) {}
    public void setOnPostDialCharacter(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public com.android.internal.telephony.Registrant getPostDialHandler() { return null; }
    public void exitEmergencyCallbackMode() {}
    public void registerForCdmaOtaStatusChange(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCdmaOtaStatusChange(android.os.Handler p0) {}
    public void registerForSubscriptionInfoReady(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSubscriptionInfoReady(android.os.Handler p0) {}
    public boolean needsOtaServiceProvisioning() { return false; }
    public boolean isOtaSpNumber(java.lang.String p0) { return false; }
    public void registerForOtaspChange(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForOtaspChange(android.os.Handler p0) {}
    public int getOtasp() { return 0; }
    public void registerForCallWaiting(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCallWaiting(android.os.Handler p0) {}
    public void registerForEcmTimerReset(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForEcmTimerReset(android.os.Handler p0) {}
    public void registerForSignalInfo(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSignalInfo(android.os.Handler p0) {}
    public void registerForDisplayInfo(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForDisplayInfo(android.os.Handler p0) {}
    public void registerForNumberInfo(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNumberInfo(android.os.Handler p0) {}
    public void registerForRedirectedNumberInfo(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForRedirectedNumberInfo(android.os.Handler p0) {}
    public void registerForLineControlInfo(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForLineControlInfo(android.os.Handler p0) {}
    public void registerFoT53ClirlInfo(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForT53ClirInfo(android.os.Handler p0) {}
    public void registerForT53AudioControlInfo(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForT53AudioControlInfo(android.os.Handler p0) {}
    public void setOnEcbModeExitResponse(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unsetOnEcbModeExitResponse(android.os.Handler p0) {}
    public void registerForRadioOffOrNotAvailable(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForRadioOffOrNotAvailable(android.os.Handler p0) {}
    public java.lang.String getMobileProvisioningUrl() { return null; }
    public boolean hasMatchedTetherApnSetting() { return false; }
    public boolean isDataAllowed() { return false; }
    public void carrierActionSetMeteredApnsEnabled(boolean p0) {}
    public void carrierActionSetRadioEnabled(boolean p0) {}
    public void carrierActionReportDefaultNetworkStatus(boolean p0) {}
    public void carrierActionResetAll() {}
    public void notifyNewRingingConnectionP(com.android.internal.telephony.Connection p0) {}
    public void notifyUnknownConnectionP(com.android.internal.telephony.Connection p0) {}
    public void notifyForVideoCapabilityChanged(boolean p0) {}
    public void setAlwaysReportSignalStrength(boolean p0) {}
    public boolean isCspPlmnEnabled() { return false; }
    public com.android.internal.telephony.uicc.IsimRecords getIsimRecords() { return null; }
    public java.lang.String getMsisdn() { return null; }
    public java.lang.String getPlmn() { return null; }
    public void notifyCallForwardingIndicator() {}
    public void setVoiceMessageWaiting(int p0, int p1) {}
    public com.android.internal.telephony.uicc.UsimServiceTable getUsimServiceTable() { return null; }
    public com.android.internal.telephony.uicc.UiccCard getUiccCard() { return null; }
    public com.android.internal.telephony.uicc.UiccPort getUiccPort() { return null; }
    public void setImsRegistrationState(boolean p0) {}
    public com.android.internal.telephony.Phone getImsPhone() { return null; }
    public void setImsPhone(com.android.internal.telephony.imsphone.ImsPhone p0) {}
    public android.telephony.ImsiEncryptionInfo getCarrierInfoForImsiEncryption(int p0, boolean p1) { return null; }
    public void setCarrierInfoForImsiEncryption(android.telephony.ImsiEncryptionInfo p0) {}
    public void deleteCarrierInfoForImsiEncryption(int p0) {}
    public int getCarrierId() { return 0; }
    public java.lang.String getCarrierName() { return null; }
    public int getMNOCarrierId() { return 0; }
    public int getSpecificCarrierId() { return 0; }
    public java.lang.String getSpecificCarrierName() { return null; }
    public int getCarrierIdListVersion() { return 0; }
    public int getEmergencyNumberDbVersion() { return 0; }
    public void resolveSubscriptionCarrierId(java.lang.String p0) {}
    public void resetCarrierKeysForImsiEncryption() {}
    public boolean isUtEnabled() { return false; }
    public void dispose() {}
    protected com.android.internal.telephony.Connection dialInternal(java.lang.String p0, com.android.internal.telephony.PhoneInternalInterface.DialArgs p1) throws com.android.internal.telephony.CallStateException { return null; }
    public void setCallWaiting(boolean p0, int p1, android.os.Message p2) {}
    public void queryCLIP(android.os.Message p0) {}
    public int getSubId() { return 0; }
    public int getPhoneId() { return 0; }
    public boolean setOperatorBrandOverride(java.lang.String p0) { return false; }
    public boolean setRoamingOverride(java.util.List<java.lang.String> p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3) { return false; }
    public boolean isMccMncMarkedAsRoaming(java.lang.String p0) { return false; }
    public boolean isMccMncMarkedAsNonRoaming(java.lang.String p0) { return false; }
    public boolean isSidMarkedAsRoaming(int p0) { return false; }
    public boolean isSidMarkedAsNonRoaming(int p0) { return false; }
    public boolean isImsRegistered() { return false; }
    public boolean isWifiCallingEnabled() { return false; }
    public boolean isImsCapabilityAvailable(int p0, int p1) throws com.android.ims.ImsException { return false; }
    @java.lang.Deprecated
    public boolean isVolteEnabled() { return false; }
    public boolean isVoiceOverCellularImsEnabled() { return false; }
    public int getImsRegistrationTech() { return 0; }
    public void getImsRegistrationTech(java.util.function.Consumer<java.lang.Integer> p0) {}
    public void getImsRegistrationState(java.util.function.Consumer<java.lang.Integer> p0) {}
    public int getRadioPowerState() { return 0; }
    public boolean isRadioAvailable() { return false; }
    public boolean isRadioOn() { return false; }
    public void shutdownRadio() {}
    public boolean isShuttingDown() { return false; }
    public void setRadioCapability(com.android.internal.telephony.RadioCapability p0, android.os.Message p1) {}
    public int getRadioAccessFamily() { return 0; }
    public java.lang.String getModemUuId() { return null; }
    public com.android.internal.telephony.RadioCapability getRadioCapability() { return null; }
    public void radioCapabilityUpdated(com.android.internal.telephony.RadioCapability p0, boolean p1) {}
    public void sendSubscriptionSettings(boolean p0) {}
    public boolean updateUsageSetting() { return false; }
    public void registerForRadioCapabilityChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForRadioCapabilityChanged(android.os.Handler p0) {}
    public boolean isImsAvailable() { return false; }
    public boolean isVideoEnabled() { return false; }
    public int getLceStatus() { return 0; }
    public void getModemActivityInfo(android.os.Message p0, android.os.WorkSource p1) {}
    public void startLceAfterRadioIsAvailable() {}
    public void setDataThrottling(android.os.Message p0, android.os.WorkSource p1, int p2, long p3) {}
    public void setAllowedCarriers(android.telephony.CarrierRestrictionRules p0, android.os.Message p1, android.os.WorkSource p2) {}
    public void setLinkCapacityReportingCriteria(int[] p0, int[] p1, int p2) {}
    public void getAllowedCarriers(android.os.Message p0, android.os.WorkSource p1) {}
    public java.util.Locale getLocaleFromSimAndCarrierPrefs() { return null; }
    public boolean updateCurrentCarrierInProvider() { return false; }
    public com.android.internal.telephony.IccSmsInterfaceManager getIccSmsInterfaceManager() { return null; }
    protected boolean isMatchGid(java.lang.String p0) { return false; }
    public static void checkWfcWifiOnlyModeBeforeDial(com.android.internal.telephony.Phone p0, int p1, android.content.Context p2) throws com.android.internal.telephony.CallStateException {}
    public void startRingbackTone() {}
    public void stopRingbackTone() {}
    public void callEndCleanupHandOverCallIfAny() {}
    public void cancelUSSD(android.os.Message p0) {}
    public abstract void setBroadcastEmergencyCallStateChanges(boolean p0);
    public abstract void sendEmergencyCallStateChange(boolean p0);
    public com.android.internal.telephony.Phone getDefaultPhone() { return null; }
    public android.net.Uri[] getCurrentSubscriberUris() { return null; }
    public com.android.internal.telephony.AppSmsManager getAppSmsManager() { return null; }
    public void setSimPowerState(int p0, android.os.Message p1, android.os.WorkSource p2) {}
    public void setVoNrEnabled(boolean p0, android.os.Message p1, android.os.WorkSource p2) {}
    public void isVoNrEnabled(android.os.Message p0, android.os.WorkSource p1) {}
    public void setCarrierTestOverride(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8) {}
    public static boolean isEmergencyCallOnly() { return false; }
    public boolean isCdmaSubscriptionAppPresent() { return false; }
    public void enableUiccApplications(boolean p0, android.os.Message p1) {}
    public boolean canDisablePhysicalSubscription() { return false; }
    @java.lang.Deprecated
    public com.android.internal.telephony.HalVersion getHalVersion() { return null; }
    public com.android.internal.telephony.HalVersion getHalVersion(int p0) { return null; }
    public java.lang.String getOperatorNumeric() { return null; }
    public com.android.internal.telephony.metrics.VoiceCallSessionStats getVoiceCallSessionStats() { return null; }
    public void setVoiceCallSessionStats(com.android.internal.telephony.metrics.VoiceCallSessionStats p0) {}
    public com.android.internal.telephony.metrics.SmsStats getSmsStats() { return null; }
    public void setSmsStats(com.android.internal.telephony.metrics.SmsStats p0) {}
    public com.android.internal.telephony.CarrierPrivilegesTracker getCarrierPrivilegesTracker() { return null; }
    public boolean useSsOverIms(android.os.Message p0) { return false; }
    public boolean isDeviceIdle() { return false; }
    public void notifyDeviceIdleStateChanged(boolean p0) {}
    public java.util.List<java.lang.String> getEquivalentHomePlmns() { return null; }
    public java.util.List<java.lang.String> getDataServicePackages() { return null; }
    public com.android.internal.telephony.data.LinkBandwidthEstimator getLinkBandwidthEstimator() { return null; }
    public void getSlicingConfig(android.os.Message p0) {}
    public com.android.internal.telephony.InboundSmsHandler getInboundSmsHandler(boolean p0) { return null; }
    public com.android.internal.telephony.data.DataNetworkController getDataNetworkController() { return null; }
    public com.android.internal.telephony.data.DataSettingsManager getDataSettingsManager() { return null; }
    public boolean isAllowedNetworkTypesLoadedFromDb() { return false; }
    public int getTerminalBasedCallWaitingState(boolean p0) { return 0; }
    public void setTerminalBasedCallWaitingStatus(int p0) {}
    public void setTerminalBasedCallWaitingSupported(boolean p0) {}
    public void startImsTraffic(int p0, int p1, int p2, int p3, android.os.Message p4) {}
    public void stopImsTraffic(int p0, android.os.Message p1) {}
    public void registerForConnectionSetupFailure(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForConnectionSetupFailure(android.os.Handler p0) {}
    public void triggerEpsFallback(int p0, android.os.Message p1) {}
    public void triggerNotifyAnbr(int p0, int p1, int p2) {}
    public void setEmergencyMode(int p0, android.os.Message p1) {}
    public void triggerEmergencyNetworkScan(int[] p0, int p1, android.os.Message p2) {}
    public void cancelEmergencyNetworkScan(boolean p0, android.os.Message p1) {}
    public void exitEmergencyMode(android.os.Message p0) {}
    public void registerForEmergencyNetworkScan(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForEmergencyNetworkScan(android.os.Handler p0) {}
    public void triggerImsDeregistration(int p0) {}
    public void registerForEmergencyDomainSelected(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForEmergencyDomainSelected(android.os.Handler p0) {}
    public void notifyEmergencyDomainSelected(int p0) {}
    public com.android.internal.telephony.TelephonyTester getTelephonyTester() { return null; }
    public android.os.UserHandle getUserHandle() { return null; }
    public boolean isManagedProfile() { return false; }
    public boolean getNullCipherAndIntegrityEnabledPreference() { return false; }
    public boolean isNullCipherAndIntegritySupported() { return false; }
    public void handleNullCipherEnabledChange() {}
    public void updateImsCallStatus(java.util.List<com.android.internal.telephony.imsphone.ImsCallInfo> p0, android.os.Message p1) {}
    public void setN1ModeEnabled(boolean p0, android.os.Message p1) {}
    public void isN1ModeEnabled(android.os.Message p0) {}
    public java.util.List<android.telephony.CellBroadcastIdRange> getCellBroadcastIdRanges() { return null; }
    public void setCellBroadcastIdRanges(java.util.List<android.telephony.CellBroadcastIdRange> p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public void startSatellitePositionUpdates(android.os.Message p0) {}
    public void stopSatellitePositionUpdates(android.os.Message p0) {}
    public void getMaxCharactersPerSatelliteTextMessage(android.os.Message p0) {}
    public void setSatellitePower(android.os.Message p0, boolean p1) {}
    public void isSatellitePowerOn(android.os.Message p0) {}
    public void isSatelliteSupported(android.os.Message p0) {}
    public void isSatelliteProvisioned(android.os.Message p0) {}
    public void getSatelliteCapabilities(android.os.Message p0) {}
    public void registerForSatellitePositionInfoChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSatellitePositionInfoChanged(android.os.Handler p0) {}
    public void registerForSatelliteDatagramsDelivered(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSatelliteDatagramsDelivered(android.os.Handler p0) {}
    public void provisionSatelliteService(android.os.Message p0, java.lang.String p1) {}
    public void deprovisionSatelliteService(android.os.Message p0, java.lang.String p1) {}
    public void registerForSatelliteProvisionStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSatelliteProvisionStateChanged(android.os.Handler p0) {}
    public void getProvisionedSatelliteFeatures(android.os.Message p0) {}
    public void registerForSatelliteModemStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSatelliteModemStateChanged(android.os.Handler p0) {}
    public void registerForPendingDatagramCount(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForPendingDatagramCount(android.os.Handler p0) {}
    public void registerForSatelliteDatagramsReceived(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSatelliteDatagramsReceived(android.os.Handler p0) {}
    public void pollPendingSatelliteDatagrams(android.os.Message p0) {}
    public void sendSatelliteDatagram(android.os.Message p0, android.telephony.satellite.SatelliteDatagram p1, boolean p2) {}
    public void isSatelliteCommunicationAllowedForCurrentLocation(android.os.Message p0) {}
    public void requestTimeForNextSatelliteVisibility(android.os.Message p0) {}
    public void startCallbackMode(int p0) {}
    public void stopCallbackMode(int p0, int p1) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    protected static class NetworkSelectMessage {
        public android.os.Message message;
        public java.lang.String operatorNumeric;
        public java.lang.String operatorAlphaLong;
        public java.lang.String operatorAlphaShort;
        protected NetworkSelectMessage() {}
    }

    public static class SilentRedialParam {
        public java.lang.String dialString;
        public int causeCode;
        public com.android.internal.telephony.PhoneInternalInterface.DialArgs dialArgs;
        public SilentRedialParam(java.lang.String p0, int p1, com.android.internal.telephony.PhoneInternalInterface.DialArgs p2) {}
    }
}
