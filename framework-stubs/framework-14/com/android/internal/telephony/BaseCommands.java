package com.android.internal.telephony;

public abstract class BaseCommands implements com.android.internal.telephony.CommandsInterface {
    protected android.content.Context mContext;
    protected int mState;
    protected java.lang.Object mStateMonitor;
    protected com.android.internal.telephony.RegistrantList mRadioStateChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mOnRegistrants;
    protected com.android.internal.telephony.RegistrantList mAvailRegistrants;
    protected com.android.internal.telephony.RegistrantList mOffOrNotAvailRegistrants;
    protected com.android.internal.telephony.RegistrantList mNotAvailRegistrants;
    protected com.android.internal.telephony.RegistrantList mCallStateRegistrants;
    protected com.android.internal.telephony.RegistrantList mNetworkStateRegistrants;
    protected com.android.internal.telephony.RegistrantList mDataCallListChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mApnUnthrottledRegistrants;
    protected com.android.internal.telephony.RegistrantList mSlicingConfigChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mVoiceRadioTechChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mImsNetworkStateChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mIccStatusChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mIccSlotStatusChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mVoicePrivacyOnRegistrants;
    protected com.android.internal.telephony.RegistrantList mVoicePrivacyOffRegistrants;
    protected com.android.internal.telephony.Registrant mUnsolOemHookRawRegistrant;
    protected com.android.internal.telephony.RegistrantList mOtaProvisionRegistrants;
    protected com.android.internal.telephony.RegistrantList mCallWaitingInfoRegistrants;
    protected com.android.internal.telephony.RegistrantList mDisplayInfoRegistrants;
    protected com.android.internal.telephony.RegistrantList mSignalInfoRegistrants;
    protected com.android.internal.telephony.RegistrantList mNumberInfoRegistrants;
    protected com.android.internal.telephony.RegistrantList mRedirNumInfoRegistrants;
    protected com.android.internal.telephony.RegistrantList mLineControlInfoRegistrants;
    protected com.android.internal.telephony.RegistrantList mT53ClirInfoRegistrants;
    protected com.android.internal.telephony.RegistrantList mT53AudCntrlInfoRegistrants;
    protected com.android.internal.telephony.RegistrantList mRingbackToneRegistrants;
    protected com.android.internal.telephony.RegistrantList mResendIncallMuteRegistrants;
    protected com.android.internal.telephony.RegistrantList mCdmaSubscriptionChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mCdmaPrlChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mExitEmergencyCallbackModeRegistrants;
    protected com.android.internal.telephony.RegistrantList mRilConnectedRegistrants;
    protected com.android.internal.telephony.RegistrantList mIccRefreshRegistrants;
    protected com.android.internal.telephony.RegistrantList mRilCellInfoListRegistrants;
    protected com.android.internal.telephony.RegistrantList mSubscriptionStatusRegistrants;
    protected com.android.internal.telephony.RegistrantList mSrvccStateRegistrants;
    protected com.android.internal.telephony.RegistrantList mHardwareConfigChangeRegistrants;
    protected com.android.internal.telephony.RegistrantList mPhoneRadioCapabilityChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mPcoDataRegistrants;
    protected com.android.internal.telephony.RegistrantList mCarrierInfoForImsiEncryptionRegistrants;
    protected com.android.internal.telephony.RegistrantList mRilNetworkScanResultRegistrants;
    protected com.android.internal.telephony.RegistrantList mModemResetRegistrants;
    protected com.android.internal.telephony.RegistrantList mNattKeepaliveStatusRegistrants;
    protected com.android.internal.telephony.RegistrantList mPhysicalChannelConfigurationRegistrants;
    protected com.android.internal.telephony.RegistrantList mLceInfoRegistrants;
    protected com.android.internal.telephony.RegistrantList mEmergencyNumberListRegistrants;
    protected com.android.internal.telephony.RegistrantList mUiccApplicationsEnablementRegistrants;
    protected com.android.internal.telephony.RegistrantList mBarringInfoChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mSimPhonebookChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mSimPhonebookRecordsReceivedRegistrants;
    protected com.android.internal.telephony.RegistrantList mEmergencyNetworkScanRegistrants;
    protected com.android.internal.telephony.RegistrantList mConnectionSetupFailureRegistrants;
    protected com.android.internal.telephony.RegistrantList mNotifyAnbrRegistrants;
    protected com.android.internal.telephony.RegistrantList mTriggerImsDeregistrationRegistrants;
    protected com.android.internal.telephony.RegistrantList mPendingSatelliteMessageCountRegistrants;
    protected com.android.internal.telephony.RegistrantList mNewSatelliteMessagesRegistrants;
    protected com.android.internal.telephony.RegistrantList mSatelliteMessagesTransferCompleteRegistrants;
    protected com.android.internal.telephony.RegistrantList mSatellitePointingInfoChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mSatelliteModeChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mSatelliteRadioTechnologyChangedRegistrants;
    protected com.android.internal.telephony.RegistrantList mSatelliteProvisionStateChangedRegistrants;
    protected com.android.internal.telephony.Registrant mGsmSmsRegistrant;
    protected com.android.internal.telephony.Registrant mCdmaSmsRegistrant;
    protected com.android.internal.telephony.Registrant mNITZTimeRegistrant;
    protected com.android.internal.telephony.Registrant mSignalStrengthRegistrant;
    protected com.android.internal.telephony.Registrant mUSSDRegistrant;
    protected com.android.internal.telephony.Registrant mSmsOnSimRegistrant;
    protected com.android.internal.telephony.Registrant mSmsStatusRegistrant;
    protected com.android.internal.telephony.Registrant mSsnRegistrant;
    protected com.android.internal.telephony.Registrant mCatSessionEndRegistrant;
    protected com.android.internal.telephony.Registrant mCatProCmdRegistrant;
    protected com.android.internal.telephony.Registrant mCatEventRegistrant;
    protected com.android.internal.telephony.Registrant mCatCallSetUpRegistrant;
    protected com.android.internal.telephony.Registrant mIccSmsFullRegistrant;
    protected com.android.internal.telephony.Registrant mEmergencyCallbackModeRegistrant;
    protected com.android.internal.telephony.Registrant mRingRegistrant;
    protected com.android.internal.telephony.Registrant mRestrictedStateRegistrant;
    protected com.android.internal.telephony.Registrant mGsmBroadcastSmsRegistrant;
    protected com.android.internal.telephony.Registrant mCatCcAlphaRegistrant;
    protected com.android.internal.telephony.Registrant mSsRegistrant;
    protected com.android.internal.telephony.Registrant mRegistrationFailedRegistrant;
    protected android.telephony.BarringInfo mLastBarringInfo;
    protected int mAllowedNetworkTypesBitmask;
    protected int mCdmaSubscription;
    protected int mPhoneType;
    protected int mRilVersion;
    public BaseCommands(android.content.Context p0) {}
    public int getRadioState() { return 0; }
    public void registerForRadioStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForRadioStateChanged(android.os.Handler p0) {}
    public void registerForImsNetworkStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForImsNetworkStateChanged(android.os.Handler p0) {}
    public void registerForOn(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForOn(android.os.Handler p0) {}
    public void registerForAvailable(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForAvailable(android.os.Handler p0) {}
    public void registerForNotAvailable(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNotAvailable(android.os.Handler p0) {}
    public void registerForOffOrNotAvailable(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForOffOrNotAvailable(android.os.Handler p0) {}
    public void registerForCallStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCallStateChanged(android.os.Handler p0) {}
    public void registerForNetworkStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNetworkStateChanged(android.os.Handler p0) {}
    public void registerForDataCallListChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForDataCallListChanged(android.os.Handler p0) {}
    public void registerForApnUnthrottled(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForApnUnthrottled(android.os.Handler p0) {}
    public void registerForSlicingConfigChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSlicingConfigChanged(android.os.Handler p0) {}
    public void registerForVoiceRadioTechChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForVoiceRadioTechChanged(android.os.Handler p0) {}
    public void registerForIccStatusChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForIccStatusChanged(android.os.Handler p0) {}
    public void registerForIccSlotStatusChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForIccSlotStatusChanged(android.os.Handler p0) {}
    public void setOnNewGsmSms(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnNewGsmSms(android.os.Handler p0) {}
    public void setOnNewCdmaSms(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnNewCdmaSms(android.os.Handler p0) {}
    public void setOnNewGsmBroadcastSms(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnNewGsmBroadcastSms(android.os.Handler p0) {}
    public void setOnSmsOnSim(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnSmsOnSim(android.os.Handler p0) {}
    public void setOnSmsStatus(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnSmsStatus(android.os.Handler p0) {}
    public void setOnSignalStrengthUpdate(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnSignalStrengthUpdate(android.os.Handler p0) {}
    public void setOnNITZTime(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnNITZTime(android.os.Handler p0) {}
    public void setOnUSSD(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnUSSD(android.os.Handler p0) {}
    public void setOnSuppServiceNotification(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnSuppServiceNotification(android.os.Handler p0) {}
    public void setOnCatSessionEnd(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnCatSessionEnd(android.os.Handler p0) {}
    public void setOnCatProactiveCmd(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnCatProactiveCmd(android.os.Handler p0) {}
    public void setOnCatEvent(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnCatEvent(android.os.Handler p0) {}
    public void setOnCatCallSetUp(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnCatCallSetUp(android.os.Handler p0) {}
    public void setOnIccSmsFull(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnIccSmsFull(android.os.Handler p0) {}
    public void registerForIccRefresh(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void setOnIccRefresh(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void setEmergencyCallbackMode(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForIccRefresh(android.os.Handler p0) {}
    public void unsetOnIccRefresh(android.os.Handler p0) {}
    public void setOnCallRing(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnCallRing(android.os.Handler p0) {}
    public void setOnSs(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnSs(android.os.Handler p0) {}
    public void setOnCatCcAlphaNotify(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnCatCcAlphaNotify(android.os.Handler p0) {}
    public void setOnRegistrationFailed(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnRegistrationFailed(android.os.Handler p0) {}
    public void registerForInCallVoicePrivacyOn(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForInCallVoicePrivacyOn(android.os.Handler p0) {}
    public void registerForInCallVoicePrivacyOff(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForInCallVoicePrivacyOff(android.os.Handler p0) {}
    public void setOnRestrictedStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnRestrictedStateChanged(android.os.Handler p0) {}
    public void registerForDisplayInfo(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForDisplayInfo(android.os.Handler p0) {}
    public void registerForCallWaitingInfo(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCallWaitingInfo(android.os.Handler p0) {}
    public void registerForSignalInfo(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void setOnUnsolOemHookRaw(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unSetOnUnsolOemHookRaw(android.os.Handler p0) {}
    public void unregisterForSignalInfo(android.os.Handler p0) {}
    public void registerForCdmaOtaProvision(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCdmaOtaProvision(android.os.Handler p0) {}
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
    public void registerForRingbackTone(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForRingbackTone(android.os.Handler p0) {}
    public void registerForResendIncallMute(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForResendIncallMute(android.os.Handler p0) {}
    public void registerForCdmaSubscriptionChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCdmaSubscriptionChanged(android.os.Handler p0) {}
    public void registerForCdmaPrlChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCdmaPrlChanged(android.os.Handler p0) {}
    public void registerForExitEmergencyCallbackMode(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForExitEmergencyCallbackMode(android.os.Handler p0) {}
    public void registerForHardwareConfigChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForHardwareConfigChanged(android.os.Handler p0) {}
    public void registerForNetworkScanResult(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNetworkScanResult(android.os.Handler p0) {}
    public void registerForRilConnected(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForRilConnected(android.os.Handler p0) {}
    public void registerForSubscriptionStatusChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSubscriptionStatusChanged(android.os.Handler p0) {}
    public void registerForEmergencyNumberList(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForEmergencyNumberList(android.os.Handler p0) {}
    protected void setRadioState(int p0, boolean p1) {}
    protected void cacheEmergencyNumberListIndication(java.util.List<android.telephony.emergency.EmergencyNumber> p0) {}
    public android.telephony.BarringInfo getLastBarringInfo() { return null; }
    public void registerForCellInfoList(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCellInfoList(android.os.Handler p0) {}
    public void registerForPhysicalChannelConfiguration(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForPhysicalChannelConfiguration(android.os.Handler p0) {}
    public void registerForSrvccStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSrvccStateChanged(android.os.Handler p0) {}
    public void testingEmergencyCall() {}
    public int getRilVersion() { return 0; }
    public void setUiccSubscription(int p0, int p1, int p2, int p3, android.os.Message p4) {}
    public void setDataAllowed(boolean p0, android.os.Message p1) {}
    public void requestShutdown(android.os.Message p0) {}
    public void getRadioCapability(android.os.Message p0) {}
    public void setRadioCapability(com.android.internal.telephony.RadioCapability p0, android.os.Message p1) {}
    public void registerForRadioCapabilityChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForRadioCapabilityChanged(android.os.Handler p0) {}
    public void startLceService(int p0, boolean p1, android.os.Message p2) {}
    public void stopLceService(android.os.Message p0) {}
    public void pullLceData(android.os.Message p0) {}
    public void registerForLceInfo(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForLceInfo(android.os.Handler p0) {}
    public void registerForModemReset(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForModemReset(android.os.Handler p0) {}
    public void registerForPcoData(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForPcoData(android.os.Handler p0) {}
    public void registerForCarrierInfoForImsiEncryption(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCarrierInfoForImsiEncryption(android.os.Handler p0) {}
    public void registerForNattKeepaliveStatus(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNattKeepaliveStatus(android.os.Handler p0) {}
    public void registerUiccApplicationEnablementChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterUiccApplicationEnablementChanged(android.os.Handler p0) {}
    public void registerForBarringInfoChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForBarringInfoChanged(android.os.Handler p0) {}
    public void registerForSimPhonebookChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSimPhonebookChanged(android.os.Handler p0) {}
    public void registerForSimPhonebookRecordsReceived(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSimPhonebookRecordsReceived(android.os.Handler p0) {}
    public void getSimPhonebookRecords(android.os.Message p0) {}
    public void getSimPhonebookCapacity(android.os.Message p0) {}
    public void updateSimPhonebookRecord(com.android.internal.telephony.uicc.SimPhonebookRecord p0, android.os.Message p1) {}
    public void registerForEmergencyNetworkScan(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForEmergencyNetworkScan(android.os.Handler p0) {}
    public void registerForConnectionSetupFailure(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForConnectionSetupFailure(android.os.Handler p0) {}
    public void registerForNotifyAnbr(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNotifyAnbr(android.os.Handler p0) {}
    public void registerForTriggerImsDeregistration(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForTriggerImsDeregistration(android.os.Handler p0) {}
    public void registerForPendingSatelliteMessageCount(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForPendingSatelliteMessageCount(android.os.Handler p0) {}
    public void registerForNewSatelliteMessages(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNewSatelliteMessages(android.os.Handler p0) {}
    public void registerForSatelliteMessagesTransferComplete(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSatelliteMessagesTransferComplete(android.os.Handler p0) {}
    public void registerForSatellitePointingInfoChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSatellitePointingInfoChanged(android.os.Handler p0) {}
    public void registerForSatelliteModeChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSatelliteModeChanged(android.os.Handler p0) {}
    public void registerForSatelliteRadioTechnologyChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSatelliteRadioTechnologyChanged(android.os.Handler p0) {}
    public void registerForSatelliteProvisionStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSatelliteProvisionStateChanged(android.os.Handler p0) {}
}
