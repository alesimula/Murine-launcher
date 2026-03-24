package com.android.internal.telephony;

public interface ITelephony extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public void dial(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void call(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isRadioOn(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean isRadioOnForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean supplyPin(java.lang.String p0) throws android.os.RemoteException;
    public boolean supplyPinForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean supplyPuk(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean supplyPukForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int[] supplyPinReportResult(java.lang.String p0) throws android.os.RemoteException;
    public int[] supplyPinReportResultForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int[] supplyPukReportResult(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int[] supplyPukReportResultForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean handlePinMmi(java.lang.String p0) throws android.os.RemoteException;
    public void handleUssdRequest(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean handlePinMmiForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void toggleRadioOnOff() throws android.os.RemoteException;
    public void toggleRadioOnOffForSubscriber(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean setRadio(boolean p0) throws android.os.RemoteException;
    public boolean setRadioForSubscriber(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setRadioPower(boolean p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void updateServiceLocation() throws android.os.RemoteException;
    public void updateServiceLocationForSubscriber(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void enableLocationUpdates() throws android.os.RemoteException;
    public void enableLocationUpdatesForSubscriber(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void disableLocationUpdates() throws android.os.RemoteException;
    public void disableLocationUpdatesForSubscriber(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean enableDataConnectivity() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean disableDataConnectivity() throws android.os.RemoteException;
    public boolean isDataConnectivityPossible(int p0) throws android.os.RemoteException;
    public android.os.Bundle getCellLocation(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getNetworkCountryIsoForPhone(int p0) throws android.os.RemoteException;
    public java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getCallState() throws android.os.RemoteException;
    public int getCallStateForSlot(int p0) throws android.os.RemoteException;
    public int getDataActivity() throws android.os.RemoteException;
    public int getDataActivityForSubId(int p0) throws android.os.RemoteException;
    public int getDataState() throws android.os.RemoteException;
    public int getDataStateForSubId(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getActivePhoneType() throws android.os.RemoteException;
    public int getActivePhoneTypeForSlot(int p0) throws android.os.RemoteException;
    public int getCdmaEriIconIndex(java.lang.String p0) throws android.os.RemoteException;
    public int getCdmaEriIconIndexForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getCdmaEriIconMode(java.lang.String p0) throws android.os.RemoteException;
    public int getCdmaEriIconModeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getCdmaEriText(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getCdmaEriTextForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean needsOtaServiceProvisioning() throws android.os.RemoteException;
    public boolean setVoiceMailNumber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setVoiceActivationState(int p0, int p1) throws android.os.RemoteException;
    public void setDataActivationState(int p0, int p1) throws android.os.RemoteException;
    public int getVoiceActivationState(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getDataActivationState(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getVoiceMessageCountForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isConcurrentVoiceAndDataAllowed(int p0) throws android.os.RemoteException;
    public android.os.Bundle getVisualVoicemailSettings(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.lang.String getVisualVoicemailPackageName(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void enableVisualVoicemailSmsFilter(java.lang.String p0, int p1, android.telephony.VisualVoicemailSmsFilterSettings p2) throws android.os.RemoteException;
    public void disableVisualVoicemailSmsFilter(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.telephony.VisualVoicemailSmsFilterSettings getVisualVoicemailSmsFilterSettings(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.telephony.VisualVoicemailSmsFilterSettings getActiveVisualVoicemailSmsFilterSettings(int p0) throws android.os.RemoteException;
    public void sendVisualVoicemailSmsForSubscriber(java.lang.String p0, int p1, java.lang.String p2, int p3, java.lang.String p4, android.app.PendingIntent p5) throws android.os.RemoteException;
    public void sendDialerSpecialCode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getNetworkTypeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getDataNetworkType(java.lang.String p0) throws android.os.RemoteException;
    public int getDataNetworkTypeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getVoiceNetworkTypeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean hasIccCard() throws android.os.RemoteException;
    public boolean hasIccCardUsingSlotIndex(int p0) throws android.os.RemoteException;
    public int getLteOnCdmaMode(java.lang.String p0) throws android.os.RemoteException;
    public int getLteOnCdmaModeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.telephony.CellInfo> getAllCellInfo(java.lang.String p0) throws android.os.RemoteException;
    public void requestCellInfoUpdate(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2) throws android.os.RemoteException;
    public void requestCellInfoUpdateWithWorkSource(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, android.os.WorkSource p3) throws android.os.RemoteException;
    public void setCellInfoListRate(int p0) throws android.os.RemoteException;
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannelBySlot(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public boolean iccCloseLogicalChannelBySlot(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean iccCloseLogicalChannel(int p0, int p1) throws android.os.RemoteException;
    public java.lang.String iccTransmitApduLogicalChannelBySlot(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException;
    public java.lang.String iccTransmitApduBasicChannelBySlot(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException;
    public java.lang.String iccTransmitApduBasicChannel(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException;
    public byte[] iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) throws android.os.RemoteException;
    public java.lang.String sendEnvelopeWithStatus(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String nvReadItem(int p0) throws android.os.RemoteException;
    public boolean nvWriteItem(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean nvWriteCdmaPrl(byte[] p0) throws android.os.RemoteException;
    public boolean resetModemConfig(int p0) throws android.os.RemoteException;
    public boolean rebootModem(int p0) throws android.os.RemoteException;
    public int getCalculatedPreferredNetworkType(java.lang.String p0) throws android.os.RemoteException;
    public int getPreferredNetworkType(int p0) throws android.os.RemoteException;
    public boolean getTetherApnRequiredForSubscriber(int p0) throws android.os.RemoteException;
    public void enableIms(int p0) throws android.os.RemoteException;
    public void disableIms(int p0) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsMmTelFeature getMmTelFeatureAndListen(int p0, com.android.ims.internal.IImsServiceFeatureCallback p1) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsRcsFeature getRcsFeatureAndListen(int p0, com.android.ims.internal.IImsServiceFeatureCallback p1) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsRegistration getImsRegistration(int p0, int p1) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsConfig getImsConfig(int p0, int p1) throws android.os.RemoteException;
    public boolean setImsService(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getImsService(int p0, boolean p1) throws android.os.RemoteException;
    public void setNetworkSelectionModeAutomatic(int p0) throws android.os.RemoteException;
    public com.android.internal.telephony.CellNetworkScanResult getCellNetworkScanResults(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int requestNetworkScan(int p0, android.telephony.NetworkScanRequest p1, android.os.Messenger p2, android.os.IBinder p3, java.lang.String p4) throws android.os.RemoteException;
    public void stopNetworkScan(int p0, int p1) throws android.os.RemoteException;
    public boolean setNetworkSelectionModeManual(int p0, com.android.internal.telephony.OperatorInfo p1, boolean p2) throws android.os.RemoteException;
    public boolean setPreferredNetworkType(int p0, int p1) throws android.os.RemoteException;
    public void setUserDataEnabled(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean getDataEnabled(int p0) throws android.os.RemoteException;
    public boolean isUserDataEnabled(int p0) throws android.os.RemoteException;
    public boolean isDataEnabled(int p0) throws android.os.RemoteException;
    public boolean isManualNetworkSelectionAllowed(int p0) throws android.os.RemoteException;
    public java.lang.String[] getPcscfAddress(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setImsRegistrationState(boolean p0) throws android.os.RemoteException;
    public java.lang.String getCdmaMdn(int p0) throws android.os.RemoteException;
    public java.lang.String getCdmaMin(int p0) throws android.os.RemoteException;
    public void requestNumberVerification(android.telephony.PhoneNumberRange p0, long p1, com.android.internal.telephony.INumberVerificationCallback p2, java.lang.String p3) throws android.os.RemoteException;
    public int getCarrierPrivilegeStatus(int p0) throws android.os.RemoteException;
    public int getCarrierPrivilegeStatusForUid(int p0, int p1) throws android.os.RemoteException;
    public int checkCarrierPrivilegesForPackage(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int checkCarrierPrivilegesForPackageAnyPhone(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCarrierPackageNamesForIntentAndPhone(android.content.Intent p0, int p1) throws android.os.RemoteException;
    public boolean setLine1NumberForDisplayForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getLine1NumberForDisplay(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getLine1AlphaTagForDisplay(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String[] getMergedSubscriberIds(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String[] getMergedSubscriberIdsFromGroup(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setOperatorBrandOverride(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setRoamingOverride(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException;
    public int invokeOemRilRequestRaw(byte[] p0, byte[] p1) throws android.os.RemoteException;
    public boolean needMobileRadioShutdown() throws android.os.RemoteException;
    public void shutdownMobileRadios() throws android.os.RemoteException;
    public void setRadioCapability(android.telephony.RadioAccessFamily[] p0) throws android.os.RemoteException;
    public int getRadioAccessFamily(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void enableVideoCalling(boolean p0) throws android.os.RemoteException;
    public boolean isVideoCallingEnabled(java.lang.String p0) throws android.os.RemoteException;
    public boolean canChangeDtmfToneLength(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isWorldPhone(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isTtyModeSupported() throws android.os.RemoteException;
    public boolean isRttSupported(int p0) throws android.os.RemoteException;
    public boolean isHearingAidCompatibilitySupported() throws android.os.RemoteException;
    public boolean isImsRegistered(int p0) throws android.os.RemoteException;
    public boolean isWifiCallingAvailable(int p0) throws android.os.RemoteException;
    public boolean isVideoTelephonyAvailable(int p0) throws android.os.RemoteException;
    public int getImsRegTechnologyForMmTel(int p0) throws android.os.RemoteException;
    public java.lang.String getDeviceId(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getImeiForSlot(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getTypeAllocationCodeForSlot(int p0) throws android.os.RemoteException;
    public java.lang.String getMeidForSlot(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getManufacturerCodeForSlot(int p0) throws android.os.RemoteException;
    public java.lang.String getDeviceSoftwareVersionForSlot(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getSubIdForPhoneAccount(android.telecom.PhoneAccount p0) throws android.os.RemoteException;
    public android.telecom.PhoneAccountHandle getPhoneAccountHandleForSubscriptionId(int p0) throws android.os.RemoteException;
    public void factoryReset(int p0) throws android.os.RemoteException;
    public java.lang.String getSimLocaleForSubscriber(int p0) throws android.os.RemoteException;
    public void requestModemActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public android.telephony.ServiceState getServiceStateForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.net.Uri getVoicemailRingtoneUri(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException;
    public void setVoicemailRingtoneUri(java.lang.String p0, android.telecom.PhoneAccountHandle p1, android.net.Uri p2) throws android.os.RemoteException;
    public boolean isVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException;
    public void setVoicemailVibrationEnabled(java.lang.String p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPackagesWithCarrierPrivileges(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPackagesWithCarrierPrivilegesForAllPhones() throws android.os.RemoteException;
    public java.lang.String getAidForAppType(int p0, int p1) throws android.os.RemoteException;
    public java.lang.String getEsn(int p0) throws android.os.RemoteException;
    public java.lang.String getCdmaPrlVersion(int p0) throws android.os.RemoteException;
    public java.util.List<android.telephony.TelephonyHistogram> getTelephonyHistograms() throws android.os.RemoteException;
    public int setAllowedCarriers(android.telephony.CarrierRestrictionRules p0) throws android.os.RemoteException;
    public android.telephony.CarrierRestrictionRules getAllowedCarriers() throws android.os.RemoteException;
    public int getSubscriptionCarrierId(int p0) throws android.os.RemoteException;
    public java.lang.String getSubscriptionCarrierName(int p0) throws android.os.RemoteException;
    public int getSubscriptionSpecificCarrierId(int p0) throws android.os.RemoteException;
    public java.lang.String getSubscriptionSpecificCarrierName(int p0) throws android.os.RemoteException;
    public int getCarrierIdFromMccMnc(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void carrierActionSetMeteredApnsEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void carrierActionSetRadioEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void carrierActionReportDefaultNetworkStatus(int p0, boolean p1) throws android.os.RemoteException;
    public void carrierActionResetAll(int p0) throws android.os.RemoteException;
    public android.net.NetworkStats getVtDataUsage(int p0, boolean p1) throws android.os.RemoteException;
    public void setPolicyDataEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.telephony.ClientRequestStats> getClientRequestStats(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setSimPowerStateForSlot(int p0, int p1) throws android.os.RemoteException;
    public java.lang.String[] getForbiddenPlmns(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean getEmergencyCallbackMode(int p0) throws android.os.RemoteException;
    public android.telephony.SignalStrength getSignalStrength(int p0) throws android.os.RemoteException;
    public int getCardIdForDefaultEuicc(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.telephony.UiccCardInfo> getUiccCardsInfo(java.lang.String p0) throws android.os.RemoteException;
    public android.telephony.UiccSlotInfo[] getUiccSlotsInfo() throws android.os.RemoteException;
    public boolean switchSlots(int[] p0) throws android.os.RemoteException;
    public void setRadioIndicationUpdateMode(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isDataRoamingEnabled(int p0) throws android.os.RemoteException;
    public void setDataRoamingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public int getCdmaRoamingMode(int p0) throws android.os.RemoteException;
    public boolean setCdmaRoamingMode(int p0, int p1) throws android.os.RemoteException;
    public boolean setCdmaSubscriptionMode(int p0, int p1) throws android.os.RemoteException;
    public void setCarrierTestOverride(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) throws android.os.RemoteException;
    public int getCarrierIdListVersion(int p0) throws android.os.RemoteException;
    public void refreshUiccProfile(int p0) throws android.os.RemoteException;
    public int getNumberOfModemsWithSimultaneousDataConnections(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getNetworkSelectionMode(int p0) throws android.os.RemoteException;
    public boolean isInEmergencySmsMode() throws android.os.RemoteException;
    public java.lang.String[] getSmsApps(int p0) throws android.os.RemoteException;
    public java.lang.String getDefaultSmsApp(int p0) throws android.os.RemoteException;
    public void setDefaultSmsApp(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getRadioPowerState(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException;
    public void unregisterImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException;
    public void registerMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException;
    public void unregisterMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException;
    public boolean isCapable(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isAvailable(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isAdvancedCallingSettingEnabled(int p0) throws android.os.RemoteException;
    public void setAdvancedCallingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isVtSettingEnabled(int p0) throws android.os.RemoteException;
    public void setVtSettingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isVoWiFiSettingEnabled(int p0) throws android.os.RemoteException;
    public void setVoWiFiSettingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isVoWiFiRoamingSettingEnabled(int p0) throws android.os.RemoteException;
    public void setVoWiFiRoamingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void setVoWiFiNonPersistent(int p0, boolean p1, int p2) throws android.os.RemoteException;
    public int getVoWiFiModeSetting(int p0) throws android.os.RemoteException;
    public void setVoWiFiModeSetting(int p0, int p1) throws android.os.RemoteException;
    public int getVoWiFiRoamingModeSetting(int p0) throws android.os.RemoteException;
    public void setVoWiFiRoamingModeSetting(int p0, int p1) throws android.os.RemoteException;
    public void setRttCapabilitySetting(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isTtyOverVolteEnabled(int p0) throws android.os.RemoteException;
    public java.util.Map getEmergencyNumberList(java.lang.String p0) throws android.os.RemoteException;
    public boolean isEmergencyNumber(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCertsFromCarrierPrivilegeAccessRules(int p0) throws android.os.RemoteException;
    public void registerImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException;
    public void unregisterImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException;
    public void setImsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    public boolean getImsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isMmTelCapabilityProvisionedInCache(int p0, int p1, int p2) throws android.os.RemoteException;
    public void cacheMmTelCapabilityProvisioning(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    public int getImsProvisioningInt(int p0, int p1) throws android.os.RemoteException;
    public java.lang.String getImsProvisioningString(int p0, int p1) throws android.os.RemoteException;
    public int setImsProvisioningInt(int p0, int p1, int p2) throws android.os.RemoteException;
    public int setImsProvisioningString(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void updateEmergencyNumberListTestMode(int p0, android.telephony.emergency.EmergencyNumber p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getEmergencyNumberListTestMode() throws android.os.RemoteException;
    public boolean enableModemForSlot(int p0, boolean p1) throws android.os.RemoteException;
    public void setMultiSimCarrierRestriction(boolean p0) throws android.os.RemoteException;
    public int isMultiSimSupported(java.lang.String p0) throws android.os.RemoteException;
    public void switchMultiSimConfig(int p0) throws android.os.RemoteException;
    public boolean doesSwitchMultiSimConfigTriggerReboot(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int[] getSlotsMapping() throws android.os.RemoteException;
    public int getRadioHalVersion() throws android.os.RemoteException;
    public boolean isModemEnabledForSlot(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isDataEnabledForApn(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isApnMetered(int p0, int p1) throws android.os.RemoteException;
    public void enqueueSmsPickResult(java.lang.String p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public java.lang.String getMmsUserAgent(int p0) throws android.os.RemoteException;
    public java.lang.String getMmsUAProfUrl(int p0) throws android.os.RemoteException;
    public boolean setDataAllowedDuringVoiceCall(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isDataAllowedInVoiceCall(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ITelephony {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ITelephony";
        static final int TRANSACTION_dial = 1;
        static final int TRANSACTION_call = 2;
        static final int TRANSACTION_isRadioOn = 3;
        static final int TRANSACTION_isRadioOnForSubscriber = 4;
        static final int TRANSACTION_supplyPin = 5;
        static final int TRANSACTION_supplyPinForSubscriber = 6;
        static final int TRANSACTION_supplyPuk = 7;
        static final int TRANSACTION_supplyPukForSubscriber = 8;
        static final int TRANSACTION_supplyPinReportResult = 9;
        static final int TRANSACTION_supplyPinReportResultForSubscriber = 10;
        static final int TRANSACTION_supplyPukReportResult = 11;
        static final int TRANSACTION_supplyPukReportResultForSubscriber = 12;
        static final int TRANSACTION_handlePinMmi = 13;
        static final int TRANSACTION_handleUssdRequest = 14;
        static final int TRANSACTION_handlePinMmiForSubscriber = 15;
        static final int TRANSACTION_toggleRadioOnOff = 16;
        static final int TRANSACTION_toggleRadioOnOffForSubscriber = 17;
        static final int TRANSACTION_setRadio = 18;
        static final int TRANSACTION_setRadioForSubscriber = 19;
        static final int TRANSACTION_setRadioPower = 20;
        static final int TRANSACTION_updateServiceLocation = 21;
        static final int TRANSACTION_updateServiceLocationForSubscriber = 22;
        static final int TRANSACTION_enableLocationUpdates = 23;
        static final int TRANSACTION_enableLocationUpdatesForSubscriber = 24;
        static final int TRANSACTION_disableLocationUpdates = 25;
        static final int TRANSACTION_disableLocationUpdatesForSubscriber = 26;
        static final int TRANSACTION_enableDataConnectivity = 27;
        static final int TRANSACTION_disableDataConnectivity = 28;
        static final int TRANSACTION_isDataConnectivityPossible = 29;
        static final int TRANSACTION_getCellLocation = 30;
        static final int TRANSACTION_getNetworkCountryIsoForPhone = 31;
        static final int TRANSACTION_getNeighboringCellInfo = 32;
        static final int TRANSACTION_getCallState = 33;
        static final int TRANSACTION_getCallStateForSlot = 34;
        static final int TRANSACTION_getDataActivity = 35;
        static final int TRANSACTION_getDataActivityForSubId = 36;
        static final int TRANSACTION_getDataState = 37;
        static final int TRANSACTION_getDataStateForSubId = 38;
        static final int TRANSACTION_getActivePhoneType = 39;
        static final int TRANSACTION_getActivePhoneTypeForSlot = 40;
        static final int TRANSACTION_getCdmaEriIconIndex = 41;
        static final int TRANSACTION_getCdmaEriIconIndexForSubscriber = 42;
        static final int TRANSACTION_getCdmaEriIconMode = 43;
        static final int TRANSACTION_getCdmaEriIconModeForSubscriber = 44;
        static final int TRANSACTION_getCdmaEriText = 45;
        static final int TRANSACTION_getCdmaEriTextForSubscriber = 46;
        static final int TRANSACTION_needsOtaServiceProvisioning = 47;
        static final int TRANSACTION_setVoiceMailNumber = 48;
        static final int TRANSACTION_setVoiceActivationState = 49;
        static final int TRANSACTION_setDataActivationState = 50;
        static final int TRANSACTION_getVoiceActivationState = 51;
        static final int TRANSACTION_getDataActivationState = 52;
        static final int TRANSACTION_getVoiceMessageCountForSubscriber = 53;
        static final int TRANSACTION_isConcurrentVoiceAndDataAllowed = 54;
        static final int TRANSACTION_getVisualVoicemailSettings = 55;
        static final int TRANSACTION_getVisualVoicemailPackageName = 56;
        static final int TRANSACTION_enableVisualVoicemailSmsFilter = 57;
        static final int TRANSACTION_disableVisualVoicemailSmsFilter = 58;
        static final int TRANSACTION_getVisualVoicemailSmsFilterSettings = 59;
        static final int TRANSACTION_getActiveVisualVoicemailSmsFilterSettings = 60;
        static final int TRANSACTION_sendVisualVoicemailSmsForSubscriber = 61;
        static final int TRANSACTION_sendDialerSpecialCode = 62;
        static final int TRANSACTION_getNetworkTypeForSubscriber = 63;
        static final int TRANSACTION_getDataNetworkType = 64;
        static final int TRANSACTION_getDataNetworkTypeForSubscriber = 65;
        static final int TRANSACTION_getVoiceNetworkTypeForSubscriber = 66;
        static final int TRANSACTION_hasIccCard = 67;
        static final int TRANSACTION_hasIccCardUsingSlotIndex = 68;
        static final int TRANSACTION_getLteOnCdmaMode = 69;
        static final int TRANSACTION_getLteOnCdmaModeForSubscriber = 70;
        static final int TRANSACTION_getAllCellInfo = 71;
        static final int TRANSACTION_requestCellInfoUpdate = 72;
        static final int TRANSACTION_requestCellInfoUpdateWithWorkSource = 73;
        static final int TRANSACTION_setCellInfoListRate = 74;
        static final int TRANSACTION_iccOpenLogicalChannelBySlot = 75;
        static final int TRANSACTION_iccOpenLogicalChannel = 76;
        static final int TRANSACTION_iccCloseLogicalChannelBySlot = 77;
        static final int TRANSACTION_iccCloseLogicalChannel = 78;
        static final int TRANSACTION_iccTransmitApduLogicalChannelBySlot = 79;
        static final int TRANSACTION_iccTransmitApduLogicalChannel = 80;
        static final int TRANSACTION_iccTransmitApduBasicChannelBySlot = 81;
        static final int TRANSACTION_iccTransmitApduBasicChannel = 82;
        static final int TRANSACTION_iccExchangeSimIO = 83;
        static final int TRANSACTION_sendEnvelopeWithStatus = 84;
        static final int TRANSACTION_nvReadItem = 85;
        static final int TRANSACTION_nvWriteItem = 86;
        static final int TRANSACTION_nvWriteCdmaPrl = 87;
        static final int TRANSACTION_resetModemConfig = 88;
        static final int TRANSACTION_rebootModem = 89;
        static final int TRANSACTION_getCalculatedPreferredNetworkType = 90;
        static final int TRANSACTION_getPreferredNetworkType = 91;
        static final int TRANSACTION_getTetherApnRequiredForSubscriber = 92;
        static final int TRANSACTION_enableIms = 93;
        static final int TRANSACTION_disableIms = 94;
        static final int TRANSACTION_getMmTelFeatureAndListen = 95;
        static final int TRANSACTION_getRcsFeatureAndListen = 96;
        static final int TRANSACTION_getImsRegistration = 97;
        static final int TRANSACTION_getImsConfig = 98;
        static final int TRANSACTION_setImsService = 99;
        static final int TRANSACTION_getImsService = 100;
        static final int TRANSACTION_setNetworkSelectionModeAutomatic = 101;
        static final int TRANSACTION_getCellNetworkScanResults = 102;
        static final int TRANSACTION_requestNetworkScan = 103;
        static final int TRANSACTION_stopNetworkScan = 104;
        static final int TRANSACTION_setNetworkSelectionModeManual = 105;
        static final int TRANSACTION_setPreferredNetworkType = 106;
        static final int TRANSACTION_setUserDataEnabled = 107;
        static final int TRANSACTION_getDataEnabled = 108;
        static final int TRANSACTION_isUserDataEnabled = 109;
        static final int TRANSACTION_isDataEnabled = 110;
        static final int TRANSACTION_isManualNetworkSelectionAllowed = 111;
        static final int TRANSACTION_getPcscfAddress = 112;
        static final int TRANSACTION_setImsRegistrationState = 113;
        static final int TRANSACTION_getCdmaMdn = 114;
        static final int TRANSACTION_getCdmaMin = 115;
        static final int TRANSACTION_requestNumberVerification = 116;
        static final int TRANSACTION_getCarrierPrivilegeStatus = 117;
        static final int TRANSACTION_getCarrierPrivilegeStatusForUid = 118;
        static final int TRANSACTION_checkCarrierPrivilegesForPackage = 119;
        static final int TRANSACTION_checkCarrierPrivilegesForPackageAnyPhone = 120;
        static final int TRANSACTION_getCarrierPackageNamesForIntentAndPhone = 121;
        static final int TRANSACTION_setLine1NumberForDisplayForSubscriber = 122;
        static final int TRANSACTION_getLine1NumberForDisplay = 123;
        static final int TRANSACTION_getLine1AlphaTagForDisplay = 124;
        static final int TRANSACTION_getMergedSubscriberIds = 125;
        static final int TRANSACTION_getMergedSubscriberIdsFromGroup = 126;
        static final int TRANSACTION_setOperatorBrandOverride = 127;
        static final int TRANSACTION_setRoamingOverride = 128;
        static final int TRANSACTION_invokeOemRilRequestRaw = 129;
        static final int TRANSACTION_needMobileRadioShutdown = 130;
        static final int TRANSACTION_shutdownMobileRadios = 131;
        static final int TRANSACTION_setRadioCapability = 132;
        static final int TRANSACTION_getRadioAccessFamily = 133;
        static final int TRANSACTION_enableVideoCalling = 134;
        static final int TRANSACTION_isVideoCallingEnabled = 135;
        static final int TRANSACTION_canChangeDtmfToneLength = 136;
        static final int TRANSACTION_isWorldPhone = 137;
        static final int TRANSACTION_isTtyModeSupported = 138;
        static final int TRANSACTION_isRttSupported = 139;
        static final int TRANSACTION_isHearingAidCompatibilitySupported = 140;
        static final int TRANSACTION_isImsRegistered = 141;
        static final int TRANSACTION_isWifiCallingAvailable = 142;
        static final int TRANSACTION_isVideoTelephonyAvailable = 143;
        static final int TRANSACTION_getImsRegTechnologyForMmTel = 144;
        static final int TRANSACTION_getDeviceId = 145;
        static final int TRANSACTION_getImeiForSlot = 146;
        static final int TRANSACTION_getTypeAllocationCodeForSlot = 147;
        static final int TRANSACTION_getMeidForSlot = 148;
        static final int TRANSACTION_getManufacturerCodeForSlot = 149;
        static final int TRANSACTION_getDeviceSoftwareVersionForSlot = 150;
        static final int TRANSACTION_getSubIdForPhoneAccount = 151;
        static final int TRANSACTION_getPhoneAccountHandleForSubscriptionId = 152;
        static final int TRANSACTION_factoryReset = 153;
        static final int TRANSACTION_getSimLocaleForSubscriber = 154;
        static final int TRANSACTION_requestModemActivityInfo = 155;
        static final int TRANSACTION_getServiceStateForSubscriber = 156;
        static final int TRANSACTION_getVoicemailRingtoneUri = 157;
        static final int TRANSACTION_setVoicemailRingtoneUri = 158;
        static final int TRANSACTION_isVoicemailVibrationEnabled = 159;
        static final int TRANSACTION_setVoicemailVibrationEnabled = 160;
        static final int TRANSACTION_getPackagesWithCarrierPrivileges = 161;
        static final int TRANSACTION_getPackagesWithCarrierPrivilegesForAllPhones = 162;
        static final int TRANSACTION_getAidForAppType = 163;
        static final int TRANSACTION_getEsn = 164;
        static final int TRANSACTION_getCdmaPrlVersion = 165;
        static final int TRANSACTION_getTelephonyHistograms = 166;
        static final int TRANSACTION_setAllowedCarriers = 167;
        static final int TRANSACTION_getAllowedCarriers = 168;
        static final int TRANSACTION_getSubscriptionCarrierId = 169;
        static final int TRANSACTION_getSubscriptionCarrierName = 170;
        static final int TRANSACTION_getSubscriptionSpecificCarrierId = 171;
        static final int TRANSACTION_getSubscriptionSpecificCarrierName = 172;
        static final int TRANSACTION_getCarrierIdFromMccMnc = 173;
        static final int TRANSACTION_carrierActionSetMeteredApnsEnabled = 174;
        static final int TRANSACTION_carrierActionSetRadioEnabled = 175;
        static final int TRANSACTION_carrierActionReportDefaultNetworkStatus = 176;
        static final int TRANSACTION_carrierActionResetAll = 177;
        static final int TRANSACTION_getVtDataUsage = 178;
        static final int TRANSACTION_setPolicyDataEnabled = 179;
        static final int TRANSACTION_getClientRequestStats = 180;
        static final int TRANSACTION_setSimPowerStateForSlot = 181;
        static final int TRANSACTION_getForbiddenPlmns = 182;
        static final int TRANSACTION_getEmergencyCallbackMode = 183;
        static final int TRANSACTION_getSignalStrength = 184;
        static final int TRANSACTION_getCardIdForDefaultEuicc = 185;
        static final int TRANSACTION_getUiccCardsInfo = 186;
        static final int TRANSACTION_getUiccSlotsInfo = 187;
        static final int TRANSACTION_switchSlots = 188;
        static final int TRANSACTION_setRadioIndicationUpdateMode = 189;
        static final int TRANSACTION_isDataRoamingEnabled = 190;
        static final int TRANSACTION_setDataRoamingEnabled = 191;
        static final int TRANSACTION_getCdmaRoamingMode = 192;
        static final int TRANSACTION_setCdmaRoamingMode = 193;
        static final int TRANSACTION_setCdmaSubscriptionMode = 194;
        static final int TRANSACTION_setCarrierTestOverride = 195;
        static final int TRANSACTION_getCarrierIdListVersion = 196;
        static final int TRANSACTION_refreshUiccProfile = 197;
        static final int TRANSACTION_getNumberOfModemsWithSimultaneousDataConnections = 198;
        static final int TRANSACTION_getNetworkSelectionMode = 199;
        static final int TRANSACTION_isInEmergencySmsMode = 200;
        static final int TRANSACTION_getSmsApps = 201;
        static final int TRANSACTION_getDefaultSmsApp = 202;
        static final int TRANSACTION_setDefaultSmsApp = 203;
        static final int TRANSACTION_getRadioPowerState = 204;
        static final int TRANSACTION_registerImsRegistrationCallback = 205;
        static final int TRANSACTION_unregisterImsRegistrationCallback = 206;
        static final int TRANSACTION_registerMmTelCapabilityCallback = 207;
        static final int TRANSACTION_unregisterMmTelCapabilityCallback = 208;
        static final int TRANSACTION_isCapable = 209;
        static final int TRANSACTION_isAvailable = 210;
        static final int TRANSACTION_isAdvancedCallingSettingEnabled = 211;
        static final int TRANSACTION_setAdvancedCallingSettingEnabled = 212;
        static final int TRANSACTION_isVtSettingEnabled = 213;
        static final int TRANSACTION_setVtSettingEnabled = 214;
        static final int TRANSACTION_isVoWiFiSettingEnabled = 215;
        static final int TRANSACTION_setVoWiFiSettingEnabled = 216;
        static final int TRANSACTION_isVoWiFiRoamingSettingEnabled = 217;
        static final int TRANSACTION_setVoWiFiRoamingSettingEnabled = 218;
        static final int TRANSACTION_setVoWiFiNonPersistent = 219;
        static final int TRANSACTION_getVoWiFiModeSetting = 220;
        static final int TRANSACTION_setVoWiFiModeSetting = 221;
        static final int TRANSACTION_getVoWiFiRoamingModeSetting = 222;
        static final int TRANSACTION_setVoWiFiRoamingModeSetting = 223;
        static final int TRANSACTION_setRttCapabilitySetting = 224;
        static final int TRANSACTION_isTtyOverVolteEnabled = 225;
        static final int TRANSACTION_getEmergencyNumberList = 226;
        static final int TRANSACTION_isEmergencyNumber = 227;
        static final int TRANSACTION_getCertsFromCarrierPrivilegeAccessRules = 228;
        static final int TRANSACTION_registerImsProvisioningChangedCallback = 229;
        static final int TRANSACTION_unregisterImsProvisioningChangedCallback = 230;
        static final int TRANSACTION_setImsProvisioningStatusForCapability = 231;
        static final int TRANSACTION_getImsProvisioningStatusForCapability = 232;
        static final int TRANSACTION_isMmTelCapabilityProvisionedInCache = 233;
        static final int TRANSACTION_cacheMmTelCapabilityProvisioning = 234;
        static final int TRANSACTION_getImsProvisioningInt = 235;
        static final int TRANSACTION_getImsProvisioningString = 236;
        static final int TRANSACTION_setImsProvisioningInt = 237;
        static final int TRANSACTION_setImsProvisioningString = 238;
        static final int TRANSACTION_updateEmergencyNumberListTestMode = 239;
        static final int TRANSACTION_getEmergencyNumberListTestMode = 240;
        static final int TRANSACTION_enableModemForSlot = 241;
        static final int TRANSACTION_setMultiSimCarrierRestriction = 242;
        static final int TRANSACTION_isMultiSimSupported = 243;
        static final int TRANSACTION_switchMultiSimConfig = 244;
        static final int TRANSACTION_doesSwitchMultiSimConfigTriggerReboot = 245;
        static final int TRANSACTION_getSlotsMapping = 246;
        static final int TRANSACTION_getRadioHalVersion = 247;
        static final int TRANSACTION_isModemEnabledForSlot = 248;
        static final int TRANSACTION_isDataEnabledForApn = 249;
        static final int TRANSACTION_isApnMetered = 250;
        static final int TRANSACTION_enqueueSmsPickResult = 251;
        static final int TRANSACTION_getMmsUserAgent = 252;
        static final int TRANSACTION_getMmsUAProfUrl = 253;
        static final int TRANSACTION_setDataAllowedDuringVoiceCall = 254;
        static final int TRANSACTION_isDataAllowedInVoiceCall = 255;
        public Stub() { super(); }
        public static com.android.internal.telephony.ITelephony asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telephony.ITelephony p0) { return false; }
        public static com.android.internal.telephony.ITelephony getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telephony.ITelephony {
            private android.os.IBinder mRemote;
            public static com.android.internal.telephony.ITelephony sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void dial(java.lang.String p0) throws android.os.RemoteException {}
            public void call(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean isRadioOn(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isRadioOnForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean supplyPin(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean supplyPinForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean supplyPuk(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean supplyPukForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public int[] supplyPinReportResult(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int[] supplyPinReportResultForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int[] supplyPukReportResult(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int[] supplyPukReportResultForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean handlePinMmi(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void handleUssdRequest(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public boolean handlePinMmiForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void toggleRadioOnOff() throws android.os.RemoteException {}
            public void toggleRadioOnOffForSubscriber(int p0) throws android.os.RemoteException {}
            public boolean setRadio(boolean p0) throws android.os.RemoteException { return false; }
            public boolean setRadioForSubscriber(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean setRadioPower(boolean p0) throws android.os.RemoteException { return false; }
            public void updateServiceLocation() throws android.os.RemoteException {}
            public void updateServiceLocationForSubscriber(int p0) throws android.os.RemoteException {}
            public void enableLocationUpdates() throws android.os.RemoteException {}
            public void enableLocationUpdatesForSubscriber(int p0) throws android.os.RemoteException {}
            public void disableLocationUpdates() throws android.os.RemoteException {}
            public void disableLocationUpdatesForSubscriber(int p0) throws android.os.RemoteException {}
            public boolean enableDataConnectivity() throws android.os.RemoteException { return false; }
            public boolean disableDataConnectivity() throws android.os.RemoteException { return false; }
            public boolean isDataConnectivityPossible(int p0) throws android.os.RemoteException { return false; }
            public android.os.Bundle getCellLocation(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getNetworkCountryIsoForPhone(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getCallState() throws android.os.RemoteException { return 0; }
            public int getCallStateForSlot(int p0) throws android.os.RemoteException { return 0; }
            public int getDataActivity() throws android.os.RemoteException { return 0; }
            public int getDataActivityForSubId(int p0) throws android.os.RemoteException { return 0; }
            public int getDataState() throws android.os.RemoteException { return 0; }
            public int getDataStateForSubId(int p0) throws android.os.RemoteException { return 0; }
            public int getActivePhoneType() throws android.os.RemoteException { return 0; }
            public int getActivePhoneTypeForSlot(int p0) throws android.os.RemoteException { return 0; }
            public int getCdmaEriIconIndex(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getCdmaEriIconIndexForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getCdmaEriIconMode(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getCdmaEriIconModeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public java.lang.String getCdmaEriText(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getCdmaEriTextForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean needsOtaServiceProvisioning() throws android.os.RemoteException { return false; }
            public boolean setVoiceMailNumber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void setVoiceActivationState(int p0, int p1) throws android.os.RemoteException {}
            public void setDataActivationState(int p0, int p1) throws android.os.RemoteException {}
            public int getVoiceActivationState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getDataActivationState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getVoiceMessageCountForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public boolean isConcurrentVoiceAndDataAllowed(int p0) throws android.os.RemoteException { return false; }
            public android.os.Bundle getVisualVoicemailSettings(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public java.lang.String getVisualVoicemailPackageName(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void enableVisualVoicemailSmsFilter(java.lang.String p0, int p1, android.telephony.VisualVoicemailSmsFilterSettings p2) throws android.os.RemoteException {}
            public void disableVisualVoicemailSmsFilter(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public android.telephony.VisualVoicemailSmsFilterSettings getVisualVoicemailSmsFilterSettings(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.telephony.VisualVoicemailSmsFilterSettings getActiveVisualVoicemailSmsFilterSettings(int p0) throws android.os.RemoteException { return null; }
            public void sendVisualVoicemailSmsForSubscriber(java.lang.String p0, int p1, java.lang.String p2, int p3, java.lang.String p4, android.app.PendingIntent p5) throws android.os.RemoteException {}
            public void sendDialerSpecialCode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public int getNetworkTypeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getDataNetworkType(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getDataNetworkTypeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getVoiceNetworkTypeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public boolean hasIccCard() throws android.os.RemoteException { return false; }
            public boolean hasIccCardUsingSlotIndex(int p0) throws android.os.RemoteException { return false; }
            public int getLteOnCdmaMode(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getLteOnCdmaModeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public java.util.List<android.telephony.CellInfo> getAllCellInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void requestCellInfoUpdate(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2) throws android.os.RemoteException {}
            public void requestCellInfoUpdateWithWorkSource(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, android.os.WorkSource p3) throws android.os.RemoteException {}
            public void setCellInfoListRate(int p0) throws android.os.RemoteException {}
            public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannelBySlot(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return null; }
            public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return null; }
            public boolean iccCloseLogicalChannelBySlot(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean iccCloseLogicalChannel(int p0, int p1) throws android.os.RemoteException { return false; }
            public java.lang.String iccTransmitApduLogicalChannelBySlot(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
            public java.lang.String iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
            public java.lang.String iccTransmitApduBasicChannelBySlot(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
            public java.lang.String iccTransmitApduBasicChannel(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
            public byte[] iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) throws android.os.RemoteException { return null; }
            public java.lang.String sendEnvelopeWithStatus(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String nvReadItem(int p0) throws android.os.RemoteException { return null; }
            public boolean nvWriteItem(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean nvWriteCdmaPrl(byte[] p0) throws android.os.RemoteException { return false; }
            public boolean resetModemConfig(int p0) throws android.os.RemoteException { return false; }
            public boolean rebootModem(int p0) throws android.os.RemoteException { return false; }
            public int getCalculatedPreferredNetworkType(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getPreferredNetworkType(int p0) throws android.os.RemoteException { return 0; }
            public boolean getTetherApnRequiredForSubscriber(int p0) throws android.os.RemoteException { return false; }
            public void enableIms(int p0) throws android.os.RemoteException {}
            public void disableIms(int p0) throws android.os.RemoteException {}
            public android.telephony.ims.aidl.IImsMmTelFeature getMmTelFeatureAndListen(int p0, com.android.ims.internal.IImsServiceFeatureCallback p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.aidl.IImsRcsFeature getRcsFeatureAndListen(int p0, com.android.ims.internal.IImsServiceFeatureCallback p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.aidl.IImsRegistration getImsRegistration(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.aidl.IImsConfig getImsConfig(int p0, int p1) throws android.os.RemoteException { return null; }
            public boolean setImsService(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public java.lang.String getImsService(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public void setNetworkSelectionModeAutomatic(int p0) throws android.os.RemoteException {}
            public com.android.internal.telephony.CellNetworkScanResult getCellNetworkScanResults(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int requestNetworkScan(int p0, android.telephony.NetworkScanRequest p1, android.os.Messenger p2, android.os.IBinder p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
            public void stopNetworkScan(int p0, int p1) throws android.os.RemoteException {}
            public boolean setNetworkSelectionModeManual(int p0, com.android.internal.telephony.OperatorInfo p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean setPreferredNetworkType(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setUserDataEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean getDataEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserDataEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isDataEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isManualNetworkSelectionAllowed(int p0) throws android.os.RemoteException { return false; }
            public java.lang.String[] getPcscfAddress(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setImsRegistrationState(boolean p0) throws android.os.RemoteException {}
            public java.lang.String getCdmaMdn(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getCdmaMin(int p0) throws android.os.RemoteException { return null; }
            public void requestNumberVerification(android.telephony.PhoneNumberRange p0, long p1, com.android.internal.telephony.INumberVerificationCallback p2, java.lang.String p3) throws android.os.RemoteException {}
            public int getCarrierPrivilegeStatus(int p0) throws android.os.RemoteException { return 0; }
            public int getCarrierPrivilegeStatusForUid(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int checkCarrierPrivilegesForPackage(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int checkCarrierPrivilegesForPackageAnyPhone(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getCarrierPackageNamesForIntentAndPhone(android.content.Intent p0, int p1) throws android.os.RemoteException { return null; }
            public boolean setLine1NumberForDisplayForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public java.lang.String getLine1NumberForDisplay(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getLine1AlphaTagForDisplay(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String[] getMergedSubscriberIds(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String[] getMergedSubscriberIdsFromGroup(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean setOperatorBrandOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean setRoamingOverride(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException { return false; }
            public int invokeOemRilRequestRaw(byte[] p0, byte[] p1) throws android.os.RemoteException { return 0; }
            public boolean needMobileRadioShutdown() throws android.os.RemoteException { return false; }
            public void shutdownMobileRadios() throws android.os.RemoteException {}
            public void setRadioCapability(android.telephony.RadioAccessFamily[] p0) throws android.os.RemoteException {}
            public int getRadioAccessFamily(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void enableVideoCalling(boolean p0) throws android.os.RemoteException {}
            public boolean isVideoCallingEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean canChangeDtmfToneLength(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isWorldPhone(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isTtyModeSupported() throws android.os.RemoteException { return false; }
            public boolean isRttSupported(int p0) throws android.os.RemoteException { return false; }
            public boolean isHearingAidCompatibilitySupported() throws android.os.RemoteException { return false; }
            public boolean isImsRegistered(int p0) throws android.os.RemoteException { return false; }
            public boolean isWifiCallingAvailable(int p0) throws android.os.RemoteException { return false; }
            public boolean isVideoTelephonyAvailable(int p0) throws android.os.RemoteException { return false; }
            public int getImsRegTechnologyForMmTel(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getDeviceId(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getImeiForSlot(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getTypeAllocationCodeForSlot(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getMeidForSlot(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getManufacturerCodeForSlot(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getDeviceSoftwareVersionForSlot(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int getSubIdForPhoneAccount(android.telecom.PhoneAccount p0) throws android.os.RemoteException { return 0; }
            public android.telecom.PhoneAccountHandle getPhoneAccountHandleForSubscriptionId(int p0) throws android.os.RemoteException { return null; }
            public void factoryReset(int p0) throws android.os.RemoteException {}
            public java.lang.String getSimLocaleForSubscriber(int p0) throws android.os.RemoteException { return null; }
            public void requestModemActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public android.telephony.ServiceState getServiceStateForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.net.Uri getVoicemailRingtoneUri(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException { return null; }
            public void setVoicemailRingtoneUri(java.lang.String p0, android.telecom.PhoneAccountHandle p1, android.net.Uri p2) throws android.os.RemoteException {}
            public boolean isVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException { return false; }
            public void setVoicemailVibrationEnabled(java.lang.String p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getPackagesWithCarrierPrivileges(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPackagesWithCarrierPrivilegesForAllPhones() throws android.os.RemoteException { return null; }
            public java.lang.String getAidForAppType(int p0, int p1) throws android.os.RemoteException { return null; }
            public java.lang.String getEsn(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getCdmaPrlVersion(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.telephony.TelephonyHistogram> getTelephonyHistograms() throws android.os.RemoteException { return null; }
            public int setAllowedCarriers(android.telephony.CarrierRestrictionRules p0) throws android.os.RemoteException { return 0; }
            public android.telephony.CarrierRestrictionRules getAllowedCarriers() throws android.os.RemoteException { return null; }
            public int getSubscriptionCarrierId(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getSubscriptionCarrierName(int p0) throws android.os.RemoteException { return null; }
            public int getSubscriptionSpecificCarrierId(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getSubscriptionSpecificCarrierName(int p0) throws android.os.RemoteException { return null; }
            public int getCarrierIdFromMccMnc(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return 0; }
            public void carrierActionSetMeteredApnsEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void carrierActionSetRadioEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void carrierActionReportDefaultNetworkStatus(int p0, boolean p1) throws android.os.RemoteException {}
            public void carrierActionResetAll(int p0) throws android.os.RemoteException {}
            public android.net.NetworkStats getVtDataUsage(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public void setPolicyDataEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public java.util.List<android.telephony.ClientRequestStats> getClientRequestStats(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setSimPowerStateForSlot(int p0, int p1) throws android.os.RemoteException {}
            public java.lang.String[] getForbiddenPlmns(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean getEmergencyCallbackMode(int p0) throws android.os.RemoteException { return false; }
            public android.telephony.SignalStrength getSignalStrength(int p0) throws android.os.RemoteException { return null; }
            public int getCardIdForDefaultEuicc(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public java.util.List<android.telephony.UiccCardInfo> getUiccCardsInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.telephony.UiccSlotInfo[] getUiccSlotsInfo() throws android.os.RemoteException { return null; }
            public boolean switchSlots(int[] p0) throws android.os.RemoteException { return false; }
            public void setRadioIndicationUpdateMode(int p0, int p1, int p2) throws android.os.RemoteException {}
            public boolean isDataRoamingEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setDataRoamingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public int getCdmaRoamingMode(int p0) throws android.os.RemoteException { return 0; }
            public boolean setCdmaRoamingMode(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean setCdmaSubscriptionMode(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setCarrierTestOverride(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) throws android.os.RemoteException {}
            public int getCarrierIdListVersion(int p0) throws android.os.RemoteException { return 0; }
            public void refreshUiccProfile(int p0) throws android.os.RemoteException {}
            public int getNumberOfModemsWithSimultaneousDataConnections(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getNetworkSelectionMode(int p0) throws android.os.RemoteException { return 0; }
            public boolean isInEmergencySmsMode() throws android.os.RemoteException { return false; }
            public java.lang.String[] getSmsApps(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getDefaultSmsApp(int p0) throws android.os.RemoteException { return null; }
            public void setDefaultSmsApp(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public int getRadioPowerState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void registerImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
            public void unregisterImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
            public void registerMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
            public void unregisterMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
            public boolean isCapable(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isAvailable(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isAdvancedCallingSettingEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setAdvancedCallingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean isVtSettingEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setVtSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean isVoWiFiSettingEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setVoWiFiSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean isVoWiFiRoamingSettingEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setVoWiFiRoamingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void setVoWiFiNonPersistent(int p0, boolean p1, int p2) throws android.os.RemoteException {}
            public int getVoWiFiModeSetting(int p0) throws android.os.RemoteException { return 0; }
            public void setVoWiFiModeSetting(int p0, int p1) throws android.os.RemoteException {}
            public int getVoWiFiRoamingModeSetting(int p0) throws android.os.RemoteException { return 0; }
            public void setVoWiFiRoamingModeSetting(int p0, int p1) throws android.os.RemoteException {}
            public void setRttCapabilitySetting(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean isTtyOverVolteEnabled(int p0) throws android.os.RemoteException { return false; }
            public java.util.Map getEmergencyNumberList(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean isEmergencyNumber(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getCertsFromCarrierPrivilegeAccessRules(int p0) throws android.os.RemoteException { return null; }
            public void registerImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException {}
            public void unregisterImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException {}
            public void setImsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
            public boolean getImsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isMmTelCapabilityProvisionedInCache(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void cacheMmTelCapabilityProvisioning(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
            public int getImsProvisioningInt(int p0, int p1) throws android.os.RemoteException { return 0; }
            public java.lang.String getImsProvisioningString(int p0, int p1) throws android.os.RemoteException { return null; }
            public int setImsProvisioningInt(int p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public int setImsProvisioningString(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void updateEmergencyNumberListTestMode(int p0, android.telephony.emergency.EmergencyNumber p1) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getEmergencyNumberListTestMode() throws android.os.RemoteException { return null; }
            public boolean enableModemForSlot(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public void setMultiSimCarrierRestriction(boolean p0) throws android.os.RemoteException {}
            public int isMultiSimSupported(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void switchMultiSimConfig(int p0) throws android.os.RemoteException {}
            public boolean doesSwitchMultiSimConfigTriggerReboot(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public int[] getSlotsMapping() throws android.os.RemoteException { return null; }
            public int getRadioHalVersion() throws android.os.RemoteException { return 0; }
            public boolean isModemEnabledForSlot(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isDataEnabledForApn(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isApnMetered(int p0, int p1) throws android.os.RemoteException { return false; }
            public void enqueueSmsPickResult(java.lang.String p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public java.lang.String getMmsUserAgent(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getMmsUAProfUrl(int p0) throws android.os.RemoteException { return null; }
            public boolean setDataAllowedDuringVoiceCall(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean isDataAllowedInVoiceCall(int p0) throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements com.android.internal.telephony.ITelephony {
        public Default() {}
        public void dial(java.lang.String p0) throws android.os.RemoteException {}
        public void call(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean isRadioOn(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isRadioOnForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean supplyPin(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean supplyPinForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean supplyPuk(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean supplyPukForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public int[] supplyPinReportResult(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int[] supplyPinReportResultForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int[] supplyPukReportResult(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int[] supplyPukReportResultForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean handlePinMmi(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void handleUssdRequest(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public boolean handlePinMmiForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void toggleRadioOnOff() throws android.os.RemoteException {}
        public void toggleRadioOnOffForSubscriber(int p0) throws android.os.RemoteException {}
        public boolean setRadio(boolean p0) throws android.os.RemoteException { return false; }
        public boolean setRadioForSubscriber(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean setRadioPower(boolean p0) throws android.os.RemoteException { return false; }
        public void updateServiceLocation() throws android.os.RemoteException {}
        public void updateServiceLocationForSubscriber(int p0) throws android.os.RemoteException {}
        public void enableLocationUpdates() throws android.os.RemoteException {}
        public void enableLocationUpdatesForSubscriber(int p0) throws android.os.RemoteException {}
        public void disableLocationUpdates() throws android.os.RemoteException {}
        public void disableLocationUpdatesForSubscriber(int p0) throws android.os.RemoteException {}
        public boolean enableDataConnectivity() throws android.os.RemoteException { return false; }
        public boolean disableDataConnectivity() throws android.os.RemoteException { return false; }
        public boolean isDataConnectivityPossible(int p0) throws android.os.RemoteException { return false; }
        public android.os.Bundle getCellLocation(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getNetworkCountryIsoForPhone(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getCallState() throws android.os.RemoteException { return 0; }
        public int getCallStateForSlot(int p0) throws android.os.RemoteException { return 0; }
        public int getDataActivity() throws android.os.RemoteException { return 0; }
        public int getDataActivityForSubId(int p0) throws android.os.RemoteException { return 0; }
        public int getDataState() throws android.os.RemoteException { return 0; }
        public int getDataStateForSubId(int p0) throws android.os.RemoteException { return 0; }
        public int getActivePhoneType() throws android.os.RemoteException { return 0; }
        public int getActivePhoneTypeForSlot(int p0) throws android.os.RemoteException { return 0; }
        public int getCdmaEriIconIndex(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getCdmaEriIconIndexForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getCdmaEriIconMode(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getCdmaEriIconModeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public java.lang.String getCdmaEriText(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getCdmaEriTextForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean needsOtaServiceProvisioning() throws android.os.RemoteException { return false; }
        public boolean setVoiceMailNumber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void setVoiceActivationState(int p0, int p1) throws android.os.RemoteException {}
        public void setDataActivationState(int p0, int p1) throws android.os.RemoteException {}
        public int getVoiceActivationState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getDataActivationState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getVoiceMessageCountForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public boolean isConcurrentVoiceAndDataAllowed(int p0) throws android.os.RemoteException { return false; }
        public android.os.Bundle getVisualVoicemailSettings(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public java.lang.String getVisualVoicemailPackageName(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void enableVisualVoicemailSmsFilter(java.lang.String p0, int p1, android.telephony.VisualVoicemailSmsFilterSettings p2) throws android.os.RemoteException {}
        public void disableVisualVoicemailSmsFilter(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public android.telephony.VisualVoicemailSmsFilterSettings getVisualVoicemailSmsFilterSettings(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.telephony.VisualVoicemailSmsFilterSettings getActiveVisualVoicemailSmsFilterSettings(int p0) throws android.os.RemoteException { return null; }
        public void sendVisualVoicemailSmsForSubscriber(java.lang.String p0, int p1, java.lang.String p2, int p3, java.lang.String p4, android.app.PendingIntent p5) throws android.os.RemoteException {}
        public void sendDialerSpecialCode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public int getNetworkTypeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getDataNetworkType(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getDataNetworkTypeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getVoiceNetworkTypeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public boolean hasIccCard() throws android.os.RemoteException { return false; }
        public boolean hasIccCardUsingSlotIndex(int p0) throws android.os.RemoteException { return false; }
        public int getLteOnCdmaMode(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getLteOnCdmaModeForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public java.util.List<android.telephony.CellInfo> getAllCellInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void requestCellInfoUpdate(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2) throws android.os.RemoteException {}
        public void requestCellInfoUpdateWithWorkSource(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, android.os.WorkSource p3) throws android.os.RemoteException {}
        public void setCellInfoListRate(int p0) throws android.os.RemoteException {}
        public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannelBySlot(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return null; }
        public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return null; }
        public boolean iccCloseLogicalChannelBySlot(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean iccCloseLogicalChannel(int p0, int p1) throws android.os.RemoteException { return false; }
        public java.lang.String iccTransmitApduLogicalChannelBySlot(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
        public java.lang.String iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
        public java.lang.String iccTransmitApduBasicChannelBySlot(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
        public java.lang.String iccTransmitApduBasicChannel(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
        public byte[] iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) throws android.os.RemoteException { return null; }
        public java.lang.String sendEnvelopeWithStatus(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String nvReadItem(int p0) throws android.os.RemoteException { return null; }
        public boolean nvWriteItem(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean nvWriteCdmaPrl(byte[] p0) throws android.os.RemoteException { return false; }
        public boolean resetModemConfig(int p0) throws android.os.RemoteException { return false; }
        public boolean rebootModem(int p0) throws android.os.RemoteException { return false; }
        public int getCalculatedPreferredNetworkType(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getPreferredNetworkType(int p0) throws android.os.RemoteException { return 0; }
        public boolean getTetherApnRequiredForSubscriber(int p0) throws android.os.RemoteException { return false; }
        public void enableIms(int p0) throws android.os.RemoteException {}
        public void disableIms(int p0) throws android.os.RemoteException {}
        public android.telephony.ims.aidl.IImsMmTelFeature getMmTelFeatureAndListen(int p0, com.android.ims.internal.IImsServiceFeatureCallback p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.aidl.IImsRcsFeature getRcsFeatureAndListen(int p0, com.android.ims.internal.IImsServiceFeatureCallback p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.aidl.IImsRegistration getImsRegistration(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.aidl.IImsConfig getImsConfig(int p0, int p1) throws android.os.RemoteException { return null; }
        public boolean setImsService(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public java.lang.String getImsService(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public void setNetworkSelectionModeAutomatic(int p0) throws android.os.RemoteException {}
        public com.android.internal.telephony.CellNetworkScanResult getCellNetworkScanResults(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int requestNetworkScan(int p0, android.telephony.NetworkScanRequest p1, android.os.Messenger p2, android.os.IBinder p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
        public void stopNetworkScan(int p0, int p1) throws android.os.RemoteException {}
        public boolean setNetworkSelectionModeManual(int p0, com.android.internal.telephony.OperatorInfo p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean setPreferredNetworkType(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setUserDataEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean getDataEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserDataEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isDataEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isManualNetworkSelectionAllowed(int p0) throws android.os.RemoteException { return false; }
        public java.lang.String[] getPcscfAddress(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setImsRegistrationState(boolean p0) throws android.os.RemoteException {}
        public java.lang.String getCdmaMdn(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getCdmaMin(int p0) throws android.os.RemoteException { return null; }
        public void requestNumberVerification(android.telephony.PhoneNumberRange p0, long p1, com.android.internal.telephony.INumberVerificationCallback p2, java.lang.String p3) throws android.os.RemoteException {}
        public int getCarrierPrivilegeStatus(int p0) throws android.os.RemoteException { return 0; }
        public int getCarrierPrivilegeStatusForUid(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int checkCarrierPrivilegesForPackage(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int checkCarrierPrivilegesForPackageAnyPhone(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getCarrierPackageNamesForIntentAndPhone(android.content.Intent p0, int p1) throws android.os.RemoteException { return null; }
        public boolean setLine1NumberForDisplayForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public java.lang.String getLine1NumberForDisplay(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getLine1AlphaTagForDisplay(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String[] getMergedSubscriberIds(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String[] getMergedSubscriberIdsFromGroup(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean setOperatorBrandOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean setRoamingOverride(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException { return false; }
        public int invokeOemRilRequestRaw(byte[] p0, byte[] p1) throws android.os.RemoteException { return 0; }
        public boolean needMobileRadioShutdown() throws android.os.RemoteException { return false; }
        public void shutdownMobileRadios() throws android.os.RemoteException {}
        public void setRadioCapability(android.telephony.RadioAccessFamily[] p0) throws android.os.RemoteException {}
        public int getRadioAccessFamily(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void enableVideoCalling(boolean p0) throws android.os.RemoteException {}
        public boolean isVideoCallingEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean canChangeDtmfToneLength(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isWorldPhone(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isTtyModeSupported() throws android.os.RemoteException { return false; }
        public boolean isRttSupported(int p0) throws android.os.RemoteException { return false; }
        public boolean isHearingAidCompatibilitySupported() throws android.os.RemoteException { return false; }
        public boolean isImsRegistered(int p0) throws android.os.RemoteException { return false; }
        public boolean isWifiCallingAvailable(int p0) throws android.os.RemoteException { return false; }
        public boolean isVideoTelephonyAvailable(int p0) throws android.os.RemoteException { return false; }
        public int getImsRegTechnologyForMmTel(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getDeviceId(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getImeiForSlot(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getTypeAllocationCodeForSlot(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getMeidForSlot(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getManufacturerCodeForSlot(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getDeviceSoftwareVersionForSlot(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int getSubIdForPhoneAccount(android.telecom.PhoneAccount p0) throws android.os.RemoteException { return 0; }
        public android.telecom.PhoneAccountHandle getPhoneAccountHandleForSubscriptionId(int p0) throws android.os.RemoteException { return null; }
        public void factoryReset(int p0) throws android.os.RemoteException {}
        public java.lang.String getSimLocaleForSubscriber(int p0) throws android.os.RemoteException { return null; }
        public void requestModemActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public android.telephony.ServiceState getServiceStateForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.net.Uri getVoicemailRingtoneUri(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException { return null; }
        public void setVoicemailRingtoneUri(java.lang.String p0, android.telecom.PhoneAccountHandle p1, android.net.Uri p2) throws android.os.RemoteException {}
        public boolean isVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException { return false; }
        public void setVoicemailVibrationEnabled(java.lang.String p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getPackagesWithCarrierPrivileges(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPackagesWithCarrierPrivilegesForAllPhones() throws android.os.RemoteException { return null; }
        public java.lang.String getAidForAppType(int p0, int p1) throws android.os.RemoteException { return null; }
        public java.lang.String getEsn(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getCdmaPrlVersion(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.telephony.TelephonyHistogram> getTelephonyHistograms() throws android.os.RemoteException { return null; }
        public int setAllowedCarriers(android.telephony.CarrierRestrictionRules p0) throws android.os.RemoteException { return 0; }
        public android.telephony.CarrierRestrictionRules getAllowedCarriers() throws android.os.RemoteException { return null; }
        public int getSubscriptionCarrierId(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getSubscriptionCarrierName(int p0) throws android.os.RemoteException { return null; }
        public int getSubscriptionSpecificCarrierId(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getSubscriptionSpecificCarrierName(int p0) throws android.os.RemoteException { return null; }
        public int getCarrierIdFromMccMnc(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return 0; }
        public void carrierActionSetMeteredApnsEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void carrierActionSetRadioEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void carrierActionReportDefaultNetworkStatus(int p0, boolean p1) throws android.os.RemoteException {}
        public void carrierActionResetAll(int p0) throws android.os.RemoteException {}
        public android.net.NetworkStats getVtDataUsage(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public void setPolicyDataEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public java.util.List<android.telephony.ClientRequestStats> getClientRequestStats(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setSimPowerStateForSlot(int p0, int p1) throws android.os.RemoteException {}
        public java.lang.String[] getForbiddenPlmns(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean getEmergencyCallbackMode(int p0) throws android.os.RemoteException { return false; }
        public android.telephony.SignalStrength getSignalStrength(int p0) throws android.os.RemoteException { return null; }
        public int getCardIdForDefaultEuicc(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public java.util.List<android.telephony.UiccCardInfo> getUiccCardsInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.telephony.UiccSlotInfo[] getUiccSlotsInfo() throws android.os.RemoteException { return null; }
        public boolean switchSlots(int[] p0) throws android.os.RemoteException { return false; }
        public void setRadioIndicationUpdateMode(int p0, int p1, int p2) throws android.os.RemoteException {}
        public boolean isDataRoamingEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setDataRoamingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public int getCdmaRoamingMode(int p0) throws android.os.RemoteException { return 0; }
        public boolean setCdmaRoamingMode(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean setCdmaSubscriptionMode(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setCarrierTestOverride(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) throws android.os.RemoteException {}
        public int getCarrierIdListVersion(int p0) throws android.os.RemoteException { return 0; }
        public void refreshUiccProfile(int p0) throws android.os.RemoteException {}
        public int getNumberOfModemsWithSimultaneousDataConnections(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getNetworkSelectionMode(int p0) throws android.os.RemoteException { return 0; }
        public boolean isInEmergencySmsMode() throws android.os.RemoteException { return false; }
        public java.lang.String[] getSmsApps(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getDefaultSmsApp(int p0) throws android.os.RemoteException { return null; }
        public void setDefaultSmsApp(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public int getRadioPowerState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void registerImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
        public void unregisterImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
        public void registerMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
        public void unregisterMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
        public boolean isCapable(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isAvailable(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isAdvancedCallingSettingEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setAdvancedCallingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean isVtSettingEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setVtSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean isVoWiFiSettingEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setVoWiFiSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean isVoWiFiRoamingSettingEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setVoWiFiRoamingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void setVoWiFiNonPersistent(int p0, boolean p1, int p2) throws android.os.RemoteException {}
        public int getVoWiFiModeSetting(int p0) throws android.os.RemoteException { return 0; }
        public void setVoWiFiModeSetting(int p0, int p1) throws android.os.RemoteException {}
        public int getVoWiFiRoamingModeSetting(int p0) throws android.os.RemoteException { return 0; }
        public void setVoWiFiRoamingModeSetting(int p0, int p1) throws android.os.RemoteException {}
        public void setRttCapabilitySetting(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean isTtyOverVolteEnabled(int p0) throws android.os.RemoteException { return false; }
        public java.util.Map getEmergencyNumberList(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean isEmergencyNumber(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getCertsFromCarrierPrivilegeAccessRules(int p0) throws android.os.RemoteException { return null; }
        public void registerImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException {}
        public void unregisterImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException {}
        public void setImsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
        public boolean getImsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isMmTelCapabilityProvisionedInCache(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void cacheMmTelCapabilityProvisioning(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
        public int getImsProvisioningInt(int p0, int p1) throws android.os.RemoteException { return 0; }
        public java.lang.String getImsProvisioningString(int p0, int p1) throws android.os.RemoteException { return null; }
        public int setImsProvisioningInt(int p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public int setImsProvisioningString(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void updateEmergencyNumberListTestMode(int p0, android.telephony.emergency.EmergencyNumber p1) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getEmergencyNumberListTestMode() throws android.os.RemoteException { return null; }
        public boolean enableModemForSlot(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public void setMultiSimCarrierRestriction(boolean p0) throws android.os.RemoteException {}
        public int isMultiSimSupported(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void switchMultiSimConfig(int p0) throws android.os.RemoteException {}
        public boolean doesSwitchMultiSimConfigTriggerReboot(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public int[] getSlotsMapping() throws android.os.RemoteException { return null; }
        public int getRadioHalVersion() throws android.os.RemoteException { return 0; }
        public boolean isModemEnabledForSlot(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isDataEnabledForApn(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isApnMetered(int p0, int p1) throws android.os.RemoteException { return false; }
        public void enqueueSmsPickResult(java.lang.String p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public java.lang.String getMmsUserAgent(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getMmsUAProfUrl(int p0) throws android.os.RemoteException { return null; }
        public boolean setDataAllowedDuringVoiceCall(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean isDataAllowedInVoiceCall(int p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
