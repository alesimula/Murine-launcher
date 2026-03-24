package com.android.internal.telephony;

public interface ITelephony extends android.os.IInterface {
    public void dial(java.lang.String p0) throws android.os.RemoteException;
    public void call(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public boolean isRadioOn(java.lang.String p0) throws android.os.RemoteException;
    public boolean isRadioOnWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public boolean isRadioOnForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isRadioOnForSubscriberWithFeature(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setCallComposerStatus(int p0, int p1) throws android.os.RemoteException;
    public int getCallComposerStatus(int p0) throws android.os.RemoteException;
    public boolean supplyPinForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean supplyPukForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int[] supplyPinReportResultForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int[] supplyPukReportResultForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean handlePinMmi(java.lang.String p0) throws android.os.RemoteException;
    public void handleUssdRequest(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public boolean handlePinMmiForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void toggleRadioOnOff() throws android.os.RemoteException;
    public void toggleRadioOnOffForSubscriber(int p0) throws android.os.RemoteException;
    public boolean setRadio(boolean p0) throws android.os.RemoteException;
    public boolean setRadioForSubscriber(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setRadioPower(boolean p0) throws android.os.RemoteException;
    public boolean requestRadioPowerOffForReason(int p0, int p1) throws android.os.RemoteException;
    public boolean clearRadioPowerOffForReason(int p0, int p1) throws android.os.RemoteException;
    public java.util.List getRadioPowerOffReasons(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void updateServiceLocation() throws android.os.RemoteException;
    public void updateServiceLocationWithPackageName(java.lang.String p0) throws android.os.RemoteException;
    public void enableLocationUpdates() throws android.os.RemoteException;
    public void disableLocationUpdates() throws android.os.RemoteException;
    public boolean enableDataConnectivity(java.lang.String p0) throws android.os.RemoteException;
    public boolean disableDataConnectivity(java.lang.String p0) throws android.os.RemoteException;
    public boolean isDataConnectivityPossible(int p0) throws android.os.RemoteException;
    public android.telephony.CellIdentity getCellLocation(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getNetworkCountryIsoForPhone(int p0) throws android.os.RemoteException;
    public java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getCallState() throws android.os.RemoteException;
    public int getCallStateForSubscription(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getDataActivity() throws android.os.RemoteException;
    public int getDataActivityForSubId(int p0) throws android.os.RemoteException;
    public int getDataState() throws android.os.RemoteException;
    public int getDataStateForSubId(int p0) throws android.os.RemoteException;
    public int getActivePhoneType() throws android.os.RemoteException;
    public int getActivePhoneTypeForSlot(int p0) throws android.os.RemoteException;
    public int getCdmaEriIconIndex(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getCdmaEriIconIndexForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getCdmaEriIconMode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getCdmaEriIconModeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getCdmaEriText(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getCdmaEriTextForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean needsOtaServiceProvisioning() throws android.os.RemoteException;
    public boolean setVoiceMailNumber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setVoiceActivationState(int p0, int p1) throws android.os.RemoteException;
    public void setDataActivationState(int p0, int p1) throws android.os.RemoteException;
    public int getVoiceActivationState(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getDataActivationState(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getVoiceMessageCountForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isConcurrentVoiceAndDataAllowed(int p0) throws android.os.RemoteException;
    public android.os.Bundle getVisualVoicemailSettings(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.lang.String getVisualVoicemailPackageName(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void enableVisualVoicemailSmsFilter(java.lang.String p0, int p1, android.telephony.VisualVoicemailSmsFilterSettings p2) throws android.os.RemoteException;
    public void disableVisualVoicemailSmsFilter(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.telephony.VisualVoicemailSmsFilterSettings getVisualVoicemailSmsFilterSettings(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.telephony.VisualVoicemailSmsFilterSettings getActiveVisualVoicemailSmsFilterSettings(int p0) throws android.os.RemoteException;
    public void sendVisualVoicemailSmsForSubscriber(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, int p4, java.lang.String p5, android.app.PendingIntent p6) throws android.os.RemoteException;
    public void sendDialerSpecialCode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getDataNetworkType(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getDataNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getVoiceNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean hasIccCard() throws android.os.RemoteException;
    public boolean hasIccCardUsingSlotIndex(int p0) throws android.os.RemoteException;
    public int getLteOnCdmaMode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getLteOnCdmaModeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<android.telephony.CellInfo> getAllCellInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void requestCellInfoUpdate(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void requestCellInfoUpdateWithWorkSource(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4) throws android.os.RemoteException;
    public void setCellInfoListRate(int p0, int p1) throws android.os.RemoteException;
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(com.android.internal.telephony.IccLogicalChannelRequest p0) throws android.os.RemoteException;
    public boolean iccCloseLogicalChannel(com.android.internal.telephony.IccLogicalChannelRequest p0) throws android.os.RemoteException;
    public java.lang.String iccTransmitApduLogicalChannelByPort(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, java.lang.String p8) throws android.os.RemoteException;
    public java.lang.String iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException;
    public java.lang.String iccTransmitApduBasicChannelByPort(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, int p6, int p7, java.lang.String p8) throws android.os.RemoteException;
    public java.lang.String iccTransmitApduBasicChannel(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException;
    public byte[] iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) throws android.os.RemoteException;
    public java.lang.String sendEnvelopeWithStatus(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String nvReadItem(int p0) throws android.os.RemoteException;
    public boolean nvWriteItem(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean nvWriteCdmaPrl(byte[] p0) throws android.os.RemoteException;
    public boolean resetModemConfig(int p0) throws android.os.RemoteException;
    public boolean rebootModem(int p0) throws android.os.RemoteException;
    public int getAllowedNetworkTypesBitmask(int p0) throws android.os.RemoteException;
    public boolean isTetheringApnRequiredForSubscriber(int p0) throws android.os.RemoteException;
    public void enableIms(int p0) throws android.os.RemoteException;
    public void disableIms(int p0) throws android.os.RemoteException;
    public void resetIms(int p0) throws android.os.RemoteException;
    public void registerMmTelFeatureCallback(int p0, com.android.ims.internal.IImsServiceFeatureCallback p1) throws android.os.RemoteException;
    public void unregisterImsFeatureCallback(com.android.ims.internal.IImsServiceFeatureCallback p0) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsRegistration getImsRegistration(int p0, int p1) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsConfig getImsConfig(int p0, int p1) throws android.os.RemoteException;
    public boolean setBoundImsServiceOverride(int p0, boolean p1, int[] p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean clearCarrierImsServiceOverride(int p0) throws android.os.RemoteException;
    public java.lang.String getBoundImsServicePackage(int p0, boolean p1, int p2) throws android.os.RemoteException;
    public void getImsMmTelFeatureState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void setNetworkSelectionModeAutomatic(int p0) throws android.os.RemoteException;
    public com.android.internal.telephony.CellNetworkScanResult getCellNetworkScanResults(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int requestNetworkScan(int p0, boolean p1, android.telephony.NetworkScanRequest p2, android.os.Messenger p3, android.os.IBinder p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException;
    public void stopNetworkScan(int p0, int p1) throws android.os.RemoteException;
    public boolean setNetworkSelectionModeManual(int p0, com.android.internal.telephony.OperatorInfo p1, boolean p2) throws android.os.RemoteException;
    public long getAllowedNetworkTypesForReason(int p0, int p1) throws android.os.RemoteException;
    public boolean setAllowedNetworkTypesForReason(int p0, int p1, long p2) throws android.os.RemoteException;
    public boolean getDataEnabled(int p0) throws android.os.RemoteException;
    public boolean isUserDataEnabled(int p0) throws android.os.RemoteException;
    public boolean isDataEnabled(int p0) throws android.os.RemoteException;
    public void setDataEnabledForReason(int p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean isDataEnabledForReason(int p0, int p1) throws android.os.RemoteException;
    public boolean isManualNetworkSelectionAllowed(int p0) throws android.os.RemoteException;
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
    public java.lang.String getLine1NumberForDisplay(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getLine1AlphaTagForDisplay(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String[] getMergedSubscriberIds(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String[] getMergedImsisFromGroup(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setOperatorBrandOverride(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setRoamingOverride(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException;
    public int invokeOemRilRequestRaw(byte[] p0, byte[] p1) throws android.os.RemoteException;
    public boolean needMobileRadioShutdown() throws android.os.RemoteException;
    public void shutdownMobileRadios() throws android.os.RemoteException;
    public int getRadioAccessFamily(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void uploadCallComposerPicture(int p0, java.lang.String p1, java.lang.String p2, android.os.ParcelFileDescriptor p3, android.os.ResultReceiver p4) throws android.os.RemoteException;
    public void enableVideoCalling(boolean p0) throws android.os.RemoteException;
    public boolean isVideoCallingEnabled(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean canChangeDtmfToneLength(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isWorldPhone(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isTtyModeSupported() throws android.os.RemoteException;
    public boolean isRttSupported(int p0) throws android.os.RemoteException;
    public boolean isHearingAidCompatibilitySupported() throws android.os.RemoteException;
    public boolean isImsRegistered(int p0) throws android.os.RemoteException;
    public boolean isWifiCallingAvailable(int p0) throws android.os.RemoteException;
    public boolean isVideoTelephonyAvailable(int p0) throws android.os.RemoteException;
    public int getImsRegTechnologyForMmTel(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public java.lang.String getDeviceId(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getDeviceIdWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getImeiForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getPrimaryImei(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getTypeAllocationCodeForSlot(int p0) throws android.os.RemoteException;
    public java.lang.String getMeidForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getManufacturerCodeForSlot(int p0) throws android.os.RemoteException;
    public java.lang.String getDeviceSoftwareVersionForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getSubIdForPhoneAccountHandle(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.telecom.PhoneAccountHandle getPhoneAccountHandleForSubscriptionId(int p0) throws android.os.RemoteException;
    public void factoryReset(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getSimLocaleForSubscriber(int p0) throws android.os.RemoteException;
    public void requestModemActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public android.telephony.ServiceState getServiceStateForSubscriber(int p0, boolean p1, boolean p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
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
    public void carrierActionSetRadioEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void carrierActionReportDefaultNetworkStatus(int p0, boolean p1) throws android.os.RemoteException;
    public void carrierActionResetAll(int p0) throws android.os.RemoteException;
    public void getCallForwarding(int p0, int p1, com.android.internal.telephony.ICallForwardingInfoCallback p2) throws android.os.RemoteException;
    public void setCallForwarding(int p0, android.telephony.CallForwardingInfo p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public void getCallWaitingStatus(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void setCallWaitingStatus(int p0, boolean p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public java.util.List<android.telephony.ClientRequestStats> getClientRequestStats(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setSimPowerStateForSlot(int p0, int p1) throws android.os.RemoteException;
    public void setSimPowerStateForSlotWithCallback(int p0, int p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public java.lang.String[] getForbiddenPlmns(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public int setForbiddenPlmns(int p0, int p1, java.util.List<java.lang.String> p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public boolean getEmergencyCallbackMode(int p0) throws android.os.RemoteException;
    public android.telephony.SignalStrength getSignalStrength(int p0) throws android.os.RemoteException;
    public int getCardIdForDefaultEuicc(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.telephony.UiccCardInfo> getUiccCardsInfo(java.lang.String p0) throws android.os.RemoteException;
    public android.telephony.UiccSlotInfo[] getUiccSlotsInfo(java.lang.String p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public boolean switchSlots(int[] p0) throws android.os.RemoteException;
    public boolean setSimSlotMapping(java.util.List<android.telephony.UiccSlotMapping> p0) throws android.os.RemoteException;
    public boolean isDataRoamingEnabled(int p0) throws android.os.RemoteException;
    public void setDataRoamingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public int getCdmaRoamingMode(int p0) throws android.os.RemoteException;
    public boolean setCdmaRoamingMode(int p0, int p1) throws android.os.RemoteException;
    public int getCdmaSubscriptionMode(int p0) throws android.os.RemoteException;
    public boolean setCdmaSubscriptionMode(int p0, int p1) throws android.os.RemoteException;
    public void setCarrierTestOverride(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) throws android.os.RemoteException;
    public void setCarrierServicePackageOverride(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getCarrierIdListVersion(int p0) throws android.os.RemoteException;
    public void refreshUiccProfile(int p0) throws android.os.RemoteException;
    public int getNumberOfModemsWithSimultaneousDataConnections(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getNetworkSelectionMode(int p0) throws android.os.RemoteException;
    public boolean isInEmergencySmsMode() throws android.os.RemoteException;
    public int getRadioPowerState(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void registerImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException;
    public void unregisterImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException;
    public void getImsMmTelRegistrationState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void getImsMmTelRegistrationTransportType(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void registerMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException;
    public void unregisterMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException;
    public boolean isCapable(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isAvailable(int p0, int p1, int p2) throws android.os.RemoteException;
    public void isMmTelCapabilitySupported(int p0, com.android.internal.telephony.IIntegerConsumer p1, int p2, int p3) throws android.os.RemoteException;
    public boolean isAdvancedCallingSettingEnabled(int p0) throws android.os.RemoteException;
    public void setAdvancedCallingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isVtSettingEnabled(int p0) throws android.os.RemoteException;
    public void setVtSettingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isVoWiFiSettingEnabled(int p0) throws android.os.RemoteException;
    public void setVoWiFiSettingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isCrossSimCallingEnabledByUser(int p0) throws android.os.RemoteException;
    public void setCrossSimCallingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isVoWiFiRoamingSettingEnabled(int p0) throws android.os.RemoteException;
    public void setVoWiFiRoamingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void setVoWiFiNonPersistent(int p0, boolean p1, int p2) throws android.os.RemoteException;
    public int getVoWiFiModeSetting(int p0) throws android.os.RemoteException;
    public void setVoWiFiModeSetting(int p0, int p1) throws android.os.RemoteException;
    public int getVoWiFiRoamingModeSetting(int p0) throws android.os.RemoteException;
    public void setVoWiFiRoamingModeSetting(int p0, int p1) throws android.os.RemoteException;
    public void setRttCapabilitySetting(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isTtyOverVolteEnabled(int p0) throws android.os.RemoteException;
    public java.util.Map getEmergencyNumberList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isEmergencyNumber(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCertsFromCarrierPrivilegeAccessRules(int p0) throws android.os.RemoteException;
    public void registerImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException;
    public void unregisterImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException;
    public void registerFeatureProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IFeatureProvisioningCallback p1) throws android.os.RemoteException;
    public void unregisterFeatureProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IFeatureProvisioningCallback p1) throws android.os.RemoteException;
    public void setImsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    public boolean getImsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean getRcsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setRcsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    public int getImsProvisioningInt(int p0, int p1) throws android.os.RemoteException;
    public java.lang.String getImsProvisioningString(int p0, int p1) throws android.os.RemoteException;
    public int setImsProvisioningInt(int p0, int p1, int p2) throws android.os.RemoteException;
    public int setImsProvisioningString(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void startEmergencyCallbackMode() throws android.os.RemoteException;
    public void updateEmergencyNumberListTestMode(int p0, android.telephony.emergency.EmergencyNumber p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getEmergencyNumberListTestMode() throws android.os.RemoteException;
    public int getEmergencyNumberDbVersion(int p0) throws android.os.RemoteException;
    public void notifyOtaEmergencyNumberDbInstalled() throws android.os.RemoteException;
    public void updateOtaEmergencyNumberDbFilePath(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    public void resetOtaEmergencyNumberDbFilePath() throws android.os.RemoteException;
    public boolean enableModemForSlot(int p0, boolean p1) throws android.os.RemoteException;
    public void setMultiSimCarrierRestriction(boolean p0) throws android.os.RemoteException;
    public int isMultiSimSupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void switchMultiSimConfig(int p0) throws android.os.RemoteException;
    public boolean doesSwitchMultiSimConfigTriggerReboot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<android.telephony.UiccSlotMapping> getSlotsMapping(java.lang.String p0) throws android.os.RemoteException;
    public int getRadioHalVersion() throws android.os.RemoteException;
    public int getHalVersion(int p0) throws android.os.RemoteException;
    public java.lang.String getCurrentPackageName() throws android.os.RemoteException;
    public boolean isApplicationOnUicc(int p0, int p1) throws android.os.RemoteException;
    public boolean isModemEnabledForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isDataEnabledForApn(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isApnMetered(int p0, int p1) throws android.os.RemoteException;
    public void setSystemSelectionChannels(java.util.List<android.telephony.RadioAccessSpecifier> p0, int p1, com.android.internal.telephony.IBooleanConsumer p2) throws android.os.RemoteException;
    public java.util.List<android.telephony.RadioAccessSpecifier> getSystemSelectionChannels(int p0) throws android.os.RemoteException;
    public boolean isMvnoMatched(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void enqueueSmsPickResult(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public void showSwitchToManagedProfileDialog() throws android.os.RemoteException;
    public java.lang.String getMmsUserAgent(int p0) throws android.os.RemoteException;
    public java.lang.String getMmsUAProfUrl(int p0) throws android.os.RemoteException;
    public void setMobileDataPolicyEnabled(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean isMobileDataPolicyEnabled(int p0, int p1) throws android.os.RemoteException;
    public void setCepEnabled(boolean p0) throws android.os.RemoteException;
    public void notifyRcsAutoConfigurationReceived(int p0, byte[] p1, boolean p2) throws android.os.RemoteException;
    public boolean isIccLockEnabled(int p0) throws android.os.RemoteException;
    public int setIccLockEnabled(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public int changeIccLockPassword(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void requestUserActivityNotification() throws android.os.RemoteException;
    public void userActivity() throws android.os.RemoteException;
    public java.lang.String getManualNetworkSelectionPlmn(int p0) throws android.os.RemoteException;
    public boolean canConnectTo5GInDsdsMode() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getEquivalentHomePlmns(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int setVoNrEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isVoNrEnabled(int p0) throws android.os.RemoteException;
    public int setNrDualConnectivityState(int p0, int p1) throws android.os.RemoteException;
    public boolean isNrDualConnectivityEnabled(int p0) throws android.os.RemoteException;
    public boolean isRadioInterfaceCapabilitySupported(java.lang.String p0) throws android.os.RemoteException;
    public int sendThermalMitigationRequest(int p0, android.telephony.ThermalMitigationRequest p1, java.lang.String p2) throws android.os.RemoteException;
    public void bootstrapAuthenticationRequest(int p0, int p1, android.net.Uri p2, android.telephony.gba.UaSecurityProtocolIdentifier p3, boolean p4, android.telephony.IBootstrapAuthenticationCallback p5) throws android.os.RemoteException;
    public boolean setBoundGbaServiceOverride(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getBoundGbaService(int p0) throws android.os.RemoteException;
    public boolean setGbaReleaseTimeOverride(int p0, int p1) throws android.os.RemoteException;
    public int getGbaReleaseTime(int p0) throws android.os.RemoteException;
    public void setRcsClientConfiguration(int p0, android.telephony.ims.RcsClientConfiguration p1) throws android.os.RemoteException;
    public boolean isRcsVolteSingleRegistrationCapable(int p0) throws android.os.RemoteException;
    public void registerRcsProvisioningCallback(int p0, android.telephony.ims.aidl.IRcsConfigCallback p1) throws android.os.RemoteException;
    public void unregisterRcsProvisioningCallback(int p0, android.telephony.ims.aidl.IRcsConfigCallback p1) throws android.os.RemoteException;
    public void triggerRcsReconfiguration(int p0) throws android.os.RemoteException;
    public void setRcsSingleRegistrationTestModeEnabled(boolean p0) throws android.os.RemoteException;
    public boolean getRcsSingleRegistrationTestModeEnabled() throws android.os.RemoteException;
    public void setDeviceSingleRegistrationEnabledOverride(java.lang.String p0) throws android.os.RemoteException;
    public boolean getDeviceSingleRegistrationEnabled() throws android.os.RemoteException;
    public boolean setCarrierSingleRegistrationEnabledOverride(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void sendDeviceToDeviceMessage(int p0, int p1) throws android.os.RemoteException;
    public void setActiveDeviceToDeviceTransport(java.lang.String p0) throws android.os.RemoteException;
    public void setDeviceToDeviceForceEnabled(boolean p0) throws android.os.RemoteException;
    public boolean getCarrierSingleRegistrationEnabled(int p0) throws android.os.RemoteException;
    public boolean setImsFeatureValidationOverride(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean getImsFeatureValidationOverride(int p0) throws android.os.RemoteException;
    public java.lang.String getMobileProvisioningUrl() throws android.os.RemoteException;
    public int removeContactFromEab(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getContactFromEab(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getCapabilityFromEab(java.lang.String p0) throws android.os.RemoteException;
    public boolean getDeviceUceEnabled() throws android.os.RemoteException;
    public void setDeviceUceEnabled(boolean p0) throws android.os.RemoteException;
    public android.telephony.ims.RcsContactUceCapability addUceRegistrationOverrideShell(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public android.telephony.ims.RcsContactUceCapability removeUceRegistrationOverrideShell(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public android.telephony.ims.RcsContactUceCapability clearUceRegistrationOverrideShell(int p0) throws android.os.RemoteException;
    public android.telephony.ims.RcsContactUceCapability getLatestRcsContactUceCapabilityShell(int p0) throws android.os.RemoteException;
    public java.lang.String getLastUcePidfXmlShell(int p0) throws android.os.RemoteException;
    public boolean removeUceRequestDisallowedStatus(int p0) throws android.os.RemoteException;
    public boolean setCapabilitiesRequestTimeout(int p0, long p1) throws android.os.RemoteException;
    public void setSignalStrengthUpdateRequest(int p0, android.telephony.SignalStrengthUpdateRequest p1, java.lang.String p2) throws android.os.RemoteException;
    public void clearSignalStrengthUpdateRequest(int p0, android.telephony.SignalStrengthUpdateRequest p1, java.lang.String p2) throws android.os.RemoteException;
    public android.telephony.PhoneCapability getPhoneCapability() throws android.os.RemoteException;
    public int prepareForUnattendedReboot() throws android.os.RemoteException;
    public void getSlicingConfig(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public boolean isPremiumCapabilityAvailableForPurchase(int p0, int p1) throws android.os.RemoteException;
    public void purchasePremiumCapability(int p0, com.android.internal.telephony.IIntegerConsumer p1, int p2) throws android.os.RemoteException;
    public void registerImsStateCallback(int p0, int p1, com.android.internal.telephony.IImsStateCallback p2, java.lang.String p3) throws android.os.RemoteException;
    public void unregisterImsStateCallback(com.android.internal.telephony.IImsStateCallback p0) throws android.os.RemoteException;
    public android.telephony.CellIdentity getLastKnownCellIdentity(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean setModemService(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getModemService() throws android.os.RemoteException;
    public boolean isProvisioningRequiredForCapability(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isRcsProvisioningRequiredForCapability(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setVoiceServiceStateOverride(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getCarrierServicePackageNameForLogicalSlot(int p0) throws android.os.RemoteException;
    public void setRemovableEsimAsDefaultEuicc(boolean p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isRemovableEsimDefaultEuicc(java.lang.String p0) throws android.os.RemoteException;
    public android.content.ComponentName getDefaultRespondViaMessageApplication(int p0, boolean p1) throws android.os.RemoteException;
    public int getSimStateForSlotIndex(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.DUMP")
    public void persistEmergencyCallDiagnosticData(java.lang.String p0, boolean p1, long p2, boolean p3, boolean p4) throws android.os.RemoteException;
    public void setNullCipherAndIntegrityEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isNullCipherAndIntegrityPreferenceEnabled() throws android.os.RemoteException;
    public java.util.List<android.telephony.CellBroadcastIdRange> getCellBroadcastIdRanges(int p0) throws android.os.RemoteException;
    public void setCellBroadcastIdRanges(int p0, java.util.List<android.telephony.CellBroadcastIdRange> p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public boolean isDomainSelectionSupported() throws android.os.RemoteException;
    public void getCarrierRestrictionStatus(com.android.internal.telephony.IIntegerConsumer p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestSatelliteEnabled(int p0, boolean p1, boolean p2, com.android.internal.telephony.IIntegerConsumer p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestIsSatelliteEnabled(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestIsDemoModeEnabled(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void requestIsSatelliteSupported(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestSatelliteCapabilities(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void startSatelliteTransmissionUpdates(int p0, com.android.internal.telephony.IIntegerConsumer p1, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void stopSatelliteTransmissionUpdates(int p0, com.android.internal.telephony.IIntegerConsumer p1, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public android.os.ICancellationSignal provisionSatelliteService(int p0, java.lang.String p1, byte[] p2, com.android.internal.telephony.IIntegerConsumer p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void deprovisionSatelliteService(int p0, java.lang.String p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForSatelliteProvisionStateChanged(int p0, android.telephony.satellite.ISatelliteProvisionStateCallback p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void unregisterForSatelliteProvisionStateChanged(int p0, android.telephony.satellite.ISatelliteProvisionStateCallback p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestIsSatelliteProvisioned(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForSatelliteModemStateChanged(int p0, android.telephony.satellite.ISatelliteStateCallback p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void unregisterForSatelliteModemStateChanged(int p0, android.telephony.satellite.ISatelliteStateCallback p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForSatelliteDatagram(int p0, android.telephony.satellite.ISatelliteDatagramCallback p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void unregisterForSatelliteDatagram(int p0, android.telephony.satellite.ISatelliteDatagramCallback p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void pollPendingSatelliteDatagrams(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void sendSatelliteDatagram(int p0, int p1, android.telephony.satellite.SatelliteDatagram p2, boolean p3, com.android.internal.telephony.IIntegerConsumer p4) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestIsSatelliteCommunicationAllowedForCurrentLocation(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestTimeForNextSatelliteVisibility(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void onDeviceAlignedWithSatellite(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setSatelliteServicePackageName(java.lang.String p0) throws android.os.RemoteException;
    public boolean setSatelliteGatewayServicePackageName(java.lang.String p0) throws android.os.RemoteException;
    public boolean setSatelliteListeningTimeoutDuration(long p0) throws android.os.RemoteException;
    public boolean setSatellitePointingUiClassName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setSatelliteDeviceAlignedTimeoutDuration(long p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.util.List<java.lang.String> getShaIdFromAllowList(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.ITelephony {
        public Default() {}
        public void dial(java.lang.String p0) throws android.os.RemoteException {}
        public void call(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean isRadioOn(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isRadioOnWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isRadioOnForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isRadioOnForSubscriberWithFeature(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void setCallComposerStatus(int p0, int p1) throws android.os.RemoteException {}
        public int getCallComposerStatus(int p0) throws android.os.RemoteException { return 0; }
        public boolean supplyPinForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean supplyPukForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public int[] supplyPinReportResultForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int[] supplyPukReportResultForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean handlePinMmi(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void handleUssdRequest(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public boolean handlePinMmiForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void toggleRadioOnOff() throws android.os.RemoteException {}
        public void toggleRadioOnOffForSubscriber(int p0) throws android.os.RemoteException {}
        public boolean setRadio(boolean p0) throws android.os.RemoteException { return false; }
        public boolean setRadioForSubscriber(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean setRadioPower(boolean p0) throws android.os.RemoteException { return false; }
        public boolean requestRadioPowerOffForReason(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean clearRadioPowerOffForReason(int p0, int p1) throws android.os.RemoteException { return false; }
        public java.util.List getRadioPowerOffReasons(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void updateServiceLocation() throws android.os.RemoteException {}
        public void updateServiceLocationWithPackageName(java.lang.String p0) throws android.os.RemoteException {}
        public void enableLocationUpdates() throws android.os.RemoteException {}
        public void disableLocationUpdates() throws android.os.RemoteException {}
        public boolean enableDataConnectivity(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean disableDataConnectivity(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isDataConnectivityPossible(int p0) throws android.os.RemoteException { return false; }
        public android.telephony.CellIdentity getCellLocation(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getNetworkCountryIsoForPhone(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int getCallState() throws android.os.RemoteException { return 0; }
        public int getCallStateForSubscription(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int getDataActivity() throws android.os.RemoteException { return 0; }
        public int getDataActivityForSubId(int p0) throws android.os.RemoteException { return 0; }
        public int getDataState() throws android.os.RemoteException { return 0; }
        public int getDataStateForSubId(int p0) throws android.os.RemoteException { return 0; }
        public int getActivePhoneType() throws android.os.RemoteException { return 0; }
        public int getActivePhoneTypeForSlot(int p0) throws android.os.RemoteException { return 0; }
        public int getCdmaEriIconIndex(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getCdmaEriIconIndexForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int getCdmaEriIconMode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getCdmaEriIconModeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public java.lang.String getCdmaEriText(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getCdmaEriTextForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean needsOtaServiceProvisioning() throws android.os.RemoteException { return false; }
        public boolean setVoiceMailNumber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void setVoiceActivationState(int p0, int p1) throws android.os.RemoteException {}
        public void setDataActivationState(int p0, int p1) throws android.os.RemoteException {}
        public int getVoiceActivationState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getDataActivationState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getVoiceMessageCountForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public boolean isConcurrentVoiceAndDataAllowed(int p0) throws android.os.RemoteException { return false; }
        public android.os.Bundle getVisualVoicemailSettings(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public java.lang.String getVisualVoicemailPackageName(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public void enableVisualVoicemailSmsFilter(java.lang.String p0, int p1, android.telephony.VisualVoicemailSmsFilterSettings p2) throws android.os.RemoteException {}
        public void disableVisualVoicemailSmsFilter(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public android.telephony.VisualVoicemailSmsFilterSettings getVisualVoicemailSmsFilterSettings(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.telephony.VisualVoicemailSmsFilterSettings getActiveVisualVoicemailSmsFilterSettings(int p0) throws android.os.RemoteException { return null; }
        public void sendVisualVoicemailSmsForSubscriber(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, int p4, java.lang.String p5, android.app.PendingIntent p6) throws android.os.RemoteException {}
        public void sendDialerSpecialCode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public int getNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int getDataNetworkType(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getDataNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int getVoiceNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public boolean hasIccCard() throws android.os.RemoteException { return false; }
        public boolean hasIccCardUsingSlotIndex(int p0) throws android.os.RemoteException { return false; }
        public int getLteOnCdmaMode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getLteOnCdmaModeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public java.util.List<android.telephony.CellInfo> getAllCellInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void requestCellInfoUpdate(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void requestCellInfoUpdateWithWorkSource(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4) throws android.os.RemoteException {}
        public void setCellInfoListRate(int p0, int p1) throws android.os.RemoteException {}
        public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(com.android.internal.telephony.IccLogicalChannelRequest p0) throws android.os.RemoteException { return null; }
        public boolean iccCloseLogicalChannel(com.android.internal.telephony.IccLogicalChannelRequest p0) throws android.os.RemoteException { return false; }
        public java.lang.String iccTransmitApduLogicalChannelByPort(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, java.lang.String p8) throws android.os.RemoteException { return null; }
        public java.lang.String iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
        public java.lang.String iccTransmitApduBasicChannelByPort(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, int p6, int p7, java.lang.String p8) throws android.os.RemoteException { return null; }
        public java.lang.String iccTransmitApduBasicChannel(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
        public byte[] iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) throws android.os.RemoteException { return null; }
        public java.lang.String sendEnvelopeWithStatus(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String nvReadItem(int p0) throws android.os.RemoteException { return null; }
        public boolean nvWriteItem(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean nvWriteCdmaPrl(byte[] p0) throws android.os.RemoteException { return false; }
        public boolean resetModemConfig(int p0) throws android.os.RemoteException { return false; }
        public boolean rebootModem(int p0) throws android.os.RemoteException { return false; }
        public int getAllowedNetworkTypesBitmask(int p0) throws android.os.RemoteException { return 0; }
        public boolean isTetheringApnRequiredForSubscriber(int p0) throws android.os.RemoteException { return false; }
        public void enableIms(int p0) throws android.os.RemoteException {}
        public void disableIms(int p0) throws android.os.RemoteException {}
        public void resetIms(int p0) throws android.os.RemoteException {}
        public void registerMmTelFeatureCallback(int p0, com.android.ims.internal.IImsServiceFeatureCallback p1) throws android.os.RemoteException {}
        public void unregisterImsFeatureCallback(com.android.ims.internal.IImsServiceFeatureCallback p0) throws android.os.RemoteException {}
        public android.telephony.ims.aidl.IImsRegistration getImsRegistration(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.aidl.IImsConfig getImsConfig(int p0, int p1) throws android.os.RemoteException { return null; }
        public boolean setBoundImsServiceOverride(int p0, boolean p1, int[] p2, java.lang.String p3) throws android.os.RemoteException { return false; }
        public boolean clearCarrierImsServiceOverride(int p0) throws android.os.RemoteException { return false; }
        public java.lang.String getBoundImsServicePackage(int p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
        public void getImsMmTelFeatureState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void setNetworkSelectionModeAutomatic(int p0) throws android.os.RemoteException {}
        public com.android.internal.telephony.CellNetworkScanResult getCellNetworkScanResults(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public int requestNetworkScan(int p0, boolean p1, android.telephony.NetworkScanRequest p2, android.os.Messenger p3, android.os.IBinder p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException { return 0; }
        public void stopNetworkScan(int p0, int p1) throws android.os.RemoteException {}
        public boolean setNetworkSelectionModeManual(int p0, com.android.internal.telephony.OperatorInfo p1, boolean p2) throws android.os.RemoteException { return false; }
        public long getAllowedNetworkTypesForReason(int p0, int p1) throws android.os.RemoteException { return 0L; }
        public boolean setAllowedNetworkTypesForReason(int p0, int p1, long p2) throws android.os.RemoteException { return false; }
        public boolean getDataEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserDataEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isDataEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setDataEnabledForReason(int p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
        public boolean isDataEnabledForReason(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isManualNetworkSelectionAllowed(int p0) throws android.os.RemoteException { return false; }
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
        public java.lang.String getLine1NumberForDisplay(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getLine1AlphaTagForDisplay(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String[] getMergedSubscriberIds(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String[] getMergedImsisFromGroup(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean setOperatorBrandOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean setRoamingOverride(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException { return false; }
        public int invokeOemRilRequestRaw(byte[] p0, byte[] p1) throws android.os.RemoteException { return 0; }
        public boolean needMobileRadioShutdown() throws android.os.RemoteException { return false; }
        public void shutdownMobileRadios() throws android.os.RemoteException {}
        public int getRadioAccessFamily(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void uploadCallComposerPicture(int p0, java.lang.String p1, java.lang.String p2, android.os.ParcelFileDescriptor p3, android.os.ResultReceiver p4) throws android.os.RemoteException {}
        public void enableVideoCalling(boolean p0) throws android.os.RemoteException {}
        public boolean isVideoCallingEnabled(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean canChangeDtmfToneLength(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isWorldPhone(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isTtyModeSupported() throws android.os.RemoteException { return false; }
        public boolean isRttSupported(int p0) throws android.os.RemoteException { return false; }
        public boolean isHearingAidCompatibilitySupported() throws android.os.RemoteException { return false; }
        public boolean isImsRegistered(int p0) throws android.os.RemoteException { return false; }
        public boolean isWifiCallingAvailable(int p0) throws android.os.RemoteException { return false; }
        public boolean isVideoTelephonyAvailable(int p0) throws android.os.RemoteException { return false; }
        public int getImsRegTechnologyForMmTel(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getDeviceId(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getDeviceIdWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getImeiForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getPrimaryImei(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getTypeAllocationCodeForSlot(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getMeidForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getManufacturerCodeForSlot(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getDeviceSoftwareVersionForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public int getSubIdForPhoneAccountHandle(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public android.telecom.PhoneAccountHandle getPhoneAccountHandleForSubscriptionId(int p0) throws android.os.RemoteException { return null; }
        public void factoryReset(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.lang.String getSimLocaleForSubscriber(int p0) throws android.os.RemoteException { return null; }
        public void requestModemActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public android.telephony.ServiceState getServiceStateForSubscriber(int p0, boolean p1, boolean p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
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
        public void carrierActionSetRadioEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void carrierActionReportDefaultNetworkStatus(int p0, boolean p1) throws android.os.RemoteException {}
        public void carrierActionResetAll(int p0) throws android.os.RemoteException {}
        public void getCallForwarding(int p0, int p1, com.android.internal.telephony.ICallForwardingInfoCallback p2) throws android.os.RemoteException {}
        public void setCallForwarding(int p0, android.telephony.CallForwardingInfo p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public void getCallWaitingStatus(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void setCallWaitingStatus(int p0, boolean p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public java.util.List<android.telephony.ClientRequestStats> getClientRequestStats(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public void setSimPowerStateForSlot(int p0, int p1) throws android.os.RemoteException {}
        public void setSimPowerStateForSlotWithCallback(int p0, int p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public java.lang.String[] getForbiddenPlmns(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public int setForbiddenPlmns(int p0, int p1, java.util.List<java.lang.String> p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
        public boolean getEmergencyCallbackMode(int p0) throws android.os.RemoteException { return false; }
        public android.telephony.SignalStrength getSignalStrength(int p0) throws android.os.RemoteException { return null; }
        public int getCardIdForDefaultEuicc(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public java.util.List<android.telephony.UiccCardInfo> getUiccCardsInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.telephony.UiccSlotInfo[] getUiccSlotsInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean switchSlots(int[] p0) throws android.os.RemoteException { return false; }
        public boolean setSimSlotMapping(java.util.List<android.telephony.UiccSlotMapping> p0) throws android.os.RemoteException { return false; }
        public boolean isDataRoamingEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setDataRoamingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public int getCdmaRoamingMode(int p0) throws android.os.RemoteException { return 0; }
        public boolean setCdmaRoamingMode(int p0, int p1) throws android.os.RemoteException { return false; }
        public int getCdmaSubscriptionMode(int p0) throws android.os.RemoteException { return 0; }
        public boolean setCdmaSubscriptionMode(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setCarrierTestOverride(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) throws android.os.RemoteException {}
        public void setCarrierServicePackageOverride(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public int getCarrierIdListVersion(int p0) throws android.os.RemoteException { return 0; }
        public void refreshUiccProfile(int p0) throws android.os.RemoteException {}
        public int getNumberOfModemsWithSimultaneousDataConnections(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int getNetworkSelectionMode(int p0) throws android.os.RemoteException { return 0; }
        public boolean isInEmergencySmsMode() throws android.os.RemoteException { return false; }
        public int getRadioPowerState(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void registerImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
        public void unregisterImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
        public void getImsMmTelRegistrationState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void getImsMmTelRegistrationTransportType(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void registerMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
        public void unregisterMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
        public boolean isCapable(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isAvailable(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void isMmTelCapabilitySupported(int p0, com.android.internal.telephony.IIntegerConsumer p1, int p2, int p3) throws android.os.RemoteException {}
        public boolean isAdvancedCallingSettingEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setAdvancedCallingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean isVtSettingEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setVtSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean isVoWiFiSettingEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setVoWiFiSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean isCrossSimCallingEnabledByUser(int p0) throws android.os.RemoteException { return false; }
        public void setCrossSimCallingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean isVoWiFiRoamingSettingEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setVoWiFiRoamingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void setVoWiFiNonPersistent(int p0, boolean p1, int p2) throws android.os.RemoteException {}
        public int getVoWiFiModeSetting(int p0) throws android.os.RemoteException { return 0; }
        public void setVoWiFiModeSetting(int p0, int p1) throws android.os.RemoteException {}
        public int getVoWiFiRoamingModeSetting(int p0) throws android.os.RemoteException { return 0; }
        public void setVoWiFiRoamingModeSetting(int p0, int p1) throws android.os.RemoteException {}
        public void setRttCapabilitySetting(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean isTtyOverVolteEnabled(int p0) throws android.os.RemoteException { return false; }
        public java.util.Map getEmergencyNumberList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isEmergencyNumber(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getCertsFromCarrierPrivilegeAccessRules(int p0) throws android.os.RemoteException { return null; }
        public void registerImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException {}
        public void unregisterImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException {}
        public void registerFeatureProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IFeatureProvisioningCallback p1) throws android.os.RemoteException {}
        public void unregisterFeatureProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IFeatureProvisioningCallback p1) throws android.os.RemoteException {}
        public void setImsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
        public boolean getImsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean getRcsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void setRcsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
        public int getImsProvisioningInt(int p0, int p1) throws android.os.RemoteException { return 0; }
        public java.lang.String getImsProvisioningString(int p0, int p1) throws android.os.RemoteException { return null; }
        public int setImsProvisioningInt(int p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public int setImsProvisioningString(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void startEmergencyCallbackMode() throws android.os.RemoteException {}
        public void updateEmergencyNumberListTestMode(int p0, android.telephony.emergency.EmergencyNumber p1) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getEmergencyNumberListTestMode() throws android.os.RemoteException { return null; }
        public int getEmergencyNumberDbVersion(int p0) throws android.os.RemoteException { return 0; }
        public void notifyOtaEmergencyNumberDbInstalled() throws android.os.RemoteException {}
        public void updateOtaEmergencyNumberDbFilePath(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public void resetOtaEmergencyNumberDbFilePath() throws android.os.RemoteException {}
        public boolean enableModemForSlot(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public void setMultiSimCarrierRestriction(boolean p0) throws android.os.RemoteException {}
        public int isMultiSimSupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void switchMultiSimConfig(int p0) throws android.os.RemoteException {}
        public boolean doesSwitchMultiSimConfigTriggerReboot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public java.util.List<android.telephony.UiccSlotMapping> getSlotsMapping(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getRadioHalVersion() throws android.os.RemoteException { return 0; }
        public int getHalVersion(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getCurrentPackageName() throws android.os.RemoteException { return null; }
        public boolean isApplicationOnUicc(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isModemEnabledForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isDataEnabledForApn(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isApnMetered(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setSystemSelectionChannels(java.util.List<android.telephony.RadioAccessSpecifier> p0, int p1, com.android.internal.telephony.IBooleanConsumer p2) throws android.os.RemoteException {}
        public java.util.List<android.telephony.RadioAccessSpecifier> getSystemSelectionChannels(int p0) throws android.os.RemoteException { return null; }
        public boolean isMvnoMatched(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void enqueueSmsPickResult(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public void showSwitchToManagedProfileDialog() throws android.os.RemoteException {}
        public java.lang.String getMmsUserAgent(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getMmsUAProfUrl(int p0) throws android.os.RemoteException { return null; }
        public void setMobileDataPolicyEnabled(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public boolean isMobileDataPolicyEnabled(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setCepEnabled(boolean p0) throws android.os.RemoteException {}
        public void notifyRcsAutoConfigurationReceived(int p0, byte[] p1, boolean p2) throws android.os.RemoteException {}
        public boolean isIccLockEnabled(int p0) throws android.os.RemoteException { return false; }
        public int setIccLockEnabled(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int changeIccLockPassword(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void requestUserActivityNotification() throws android.os.RemoteException {}
        public void userActivity() throws android.os.RemoteException {}
        public java.lang.String getManualNetworkSelectionPlmn(int p0) throws android.os.RemoteException { return null; }
        public boolean canConnectTo5GInDsdsMode() throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getEquivalentHomePlmns(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public int setVoNrEnabled(int p0, boolean p1) throws android.os.RemoteException { return 0; }
        public boolean isVoNrEnabled(int p0) throws android.os.RemoteException { return false; }
        public int setNrDualConnectivityState(int p0, int p1) throws android.os.RemoteException { return 0; }
        public boolean isNrDualConnectivityEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isRadioInterfaceCapabilitySupported(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int sendThermalMitigationRequest(int p0, android.telephony.ThermalMitigationRequest p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void bootstrapAuthenticationRequest(int p0, int p1, android.net.Uri p2, android.telephony.gba.UaSecurityProtocolIdentifier p3, boolean p4, android.telephony.IBootstrapAuthenticationCallback p5) throws android.os.RemoteException {}
        public boolean setBoundGbaServiceOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public java.lang.String getBoundGbaService(int p0) throws android.os.RemoteException { return null; }
        public boolean setGbaReleaseTimeOverride(int p0, int p1) throws android.os.RemoteException { return false; }
        public int getGbaReleaseTime(int p0) throws android.os.RemoteException { return 0; }
        public void setRcsClientConfiguration(int p0, android.telephony.ims.RcsClientConfiguration p1) throws android.os.RemoteException {}
        public boolean isRcsVolteSingleRegistrationCapable(int p0) throws android.os.RemoteException { return false; }
        public void registerRcsProvisioningCallback(int p0, android.telephony.ims.aidl.IRcsConfigCallback p1) throws android.os.RemoteException {}
        public void unregisterRcsProvisioningCallback(int p0, android.telephony.ims.aidl.IRcsConfigCallback p1) throws android.os.RemoteException {}
        public void triggerRcsReconfiguration(int p0) throws android.os.RemoteException {}
        public void setRcsSingleRegistrationTestModeEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean getRcsSingleRegistrationTestModeEnabled() throws android.os.RemoteException { return false; }
        public void setDeviceSingleRegistrationEnabledOverride(java.lang.String p0) throws android.os.RemoteException {}
        public boolean getDeviceSingleRegistrationEnabled() throws android.os.RemoteException { return false; }
        public boolean setCarrierSingleRegistrationEnabledOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void sendDeviceToDeviceMessage(int p0, int p1) throws android.os.RemoteException {}
        public void setActiveDeviceToDeviceTransport(java.lang.String p0) throws android.os.RemoteException {}
        public void setDeviceToDeviceForceEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean getCarrierSingleRegistrationEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean setImsFeatureValidationOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean getImsFeatureValidationOverride(int p0) throws android.os.RemoteException { return false; }
        public java.lang.String getMobileProvisioningUrl() throws android.os.RemoteException { return null; }
        public int removeContactFromEab(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public java.lang.String getContactFromEab(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getCapabilityFromEab(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean getDeviceUceEnabled() throws android.os.RemoteException { return false; }
        public void setDeviceUceEnabled(boolean p0) throws android.os.RemoteException {}
        public android.telephony.ims.RcsContactUceCapability addUceRegistrationOverrideShell(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.RcsContactUceCapability removeUceRegistrationOverrideShell(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.RcsContactUceCapability clearUceRegistrationOverrideShell(int p0) throws android.os.RemoteException { return null; }
        public android.telephony.ims.RcsContactUceCapability getLatestRcsContactUceCapabilityShell(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getLastUcePidfXmlShell(int p0) throws android.os.RemoteException { return null; }
        public boolean removeUceRequestDisallowedStatus(int p0) throws android.os.RemoteException { return false; }
        public boolean setCapabilitiesRequestTimeout(int p0, long p1) throws android.os.RemoteException { return false; }
        public void setSignalStrengthUpdateRequest(int p0, android.telephony.SignalStrengthUpdateRequest p1, java.lang.String p2) throws android.os.RemoteException {}
        public void clearSignalStrengthUpdateRequest(int p0, android.telephony.SignalStrengthUpdateRequest p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.telephony.PhoneCapability getPhoneCapability() throws android.os.RemoteException { return null; }
        public int prepareForUnattendedReboot() throws android.os.RemoteException { return 0; }
        public void getSlicingConfig(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public boolean isPremiumCapabilityAvailableForPurchase(int p0, int p1) throws android.os.RemoteException { return false; }
        public void purchasePremiumCapability(int p0, com.android.internal.telephony.IIntegerConsumer p1, int p2) throws android.os.RemoteException {}
        public void registerImsStateCallback(int p0, int p1, com.android.internal.telephony.IImsStateCallback p2, java.lang.String p3) throws android.os.RemoteException {}
        public void unregisterImsStateCallback(com.android.internal.telephony.IImsStateCallback p0) throws android.os.RemoteException {}
        public android.telephony.CellIdentity getLastKnownCellIdentity(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean setModemService(java.lang.String p0) throws android.os.RemoteException { return false; }
        public java.lang.String getModemService() throws android.os.RemoteException { return null; }
        public boolean isProvisioningRequiredForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isRcsProvisioningRequiredForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void setVoiceServiceStateOverride(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.lang.String getCarrierServicePackageNameForLogicalSlot(int p0) throws android.os.RemoteException { return null; }
        public void setRemovableEsimAsDefaultEuicc(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean isRemovableEsimDefaultEuicc(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.content.ComponentName getDefaultRespondViaMessageApplication(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public int getSimStateForSlotIndex(int p0) throws android.os.RemoteException { return 0; }
        public void persistEmergencyCallDiagnosticData(java.lang.String p0, boolean p1, long p2, boolean p3, boolean p4) throws android.os.RemoteException {}
        public void setNullCipherAndIntegrityEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean isNullCipherAndIntegrityPreferenceEnabled() throws android.os.RemoteException { return false; }
        public java.util.List<android.telephony.CellBroadcastIdRange> getCellBroadcastIdRanges(int p0) throws android.os.RemoteException { return null; }
        public void setCellBroadcastIdRanges(int p0, java.util.List<android.telephony.CellBroadcastIdRange> p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public boolean isDomainSelectionSupported() throws android.os.RemoteException { return false; }
        public void getCarrierRestrictionStatus(com.android.internal.telephony.IIntegerConsumer p0, java.lang.String p1) throws android.os.RemoteException {}
        public void requestSatelliteEnabled(int p0, boolean p1, boolean p2, com.android.internal.telephony.IIntegerConsumer p3) throws android.os.RemoteException {}
        public void requestIsSatelliteEnabled(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void requestIsDemoModeEnabled(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void requestIsSatelliteSupported(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void requestSatelliteCapabilities(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void startSatelliteTransmissionUpdates(int p0, com.android.internal.telephony.IIntegerConsumer p1, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p2) throws android.os.RemoteException {}
        public void stopSatelliteTransmissionUpdates(int p0, com.android.internal.telephony.IIntegerConsumer p1, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p2) throws android.os.RemoteException {}
        public android.os.ICancellationSignal provisionSatelliteService(int p0, java.lang.String p1, byte[] p2, com.android.internal.telephony.IIntegerConsumer p3) throws android.os.RemoteException { return null; }
        public void deprovisionSatelliteService(int p0, java.lang.String p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public int registerForSatelliteProvisionStateChanged(int p0, android.telephony.satellite.ISatelliteProvisionStateCallback p1) throws android.os.RemoteException { return 0; }
        public void unregisterForSatelliteProvisionStateChanged(int p0, android.telephony.satellite.ISatelliteProvisionStateCallback p1) throws android.os.RemoteException {}
        public void requestIsSatelliteProvisioned(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public int registerForSatelliteModemStateChanged(int p0, android.telephony.satellite.ISatelliteStateCallback p1) throws android.os.RemoteException { return 0; }
        public void unregisterForSatelliteModemStateChanged(int p0, android.telephony.satellite.ISatelliteStateCallback p1) throws android.os.RemoteException {}
        public int registerForSatelliteDatagram(int p0, android.telephony.satellite.ISatelliteDatagramCallback p1) throws android.os.RemoteException { return 0; }
        public void unregisterForSatelliteDatagram(int p0, android.telephony.satellite.ISatelliteDatagramCallback p1) throws android.os.RemoteException {}
        public void pollPendingSatelliteDatagrams(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void sendSatelliteDatagram(int p0, int p1, android.telephony.satellite.SatelliteDatagram p2, boolean p3, com.android.internal.telephony.IIntegerConsumer p4) throws android.os.RemoteException {}
        public void requestIsSatelliteCommunicationAllowedForCurrentLocation(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void requestTimeForNextSatelliteVisibility(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void onDeviceAlignedWithSatellite(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean setSatelliteServicePackageName(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean setSatelliteGatewayServicePackageName(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean setSatelliteListeningTimeoutDuration(long p0) throws android.os.RemoteException { return false; }
        public boolean setSatellitePointingUiClassName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean setSatelliteDeviceAlignedTimeoutDuration(long p0) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getShaIdFromAllowList(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ITelephony {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ITelephony";
        static final int TRANSACTION_dial = 1;
        static final int TRANSACTION_call = 2;
        static final int TRANSACTION_isRadioOn = 3;
        static final int TRANSACTION_isRadioOnWithFeature = 4;
        static final int TRANSACTION_isRadioOnForSubscriber = 5;
        static final int TRANSACTION_isRadioOnForSubscriberWithFeature = 6;
        static final int TRANSACTION_setCallComposerStatus = 7;
        static final int TRANSACTION_getCallComposerStatus = 8;
        static final int TRANSACTION_supplyPinForSubscriber = 9;
        static final int TRANSACTION_supplyPukForSubscriber = 10;
        static final int TRANSACTION_supplyPinReportResultForSubscriber = 11;
        static final int TRANSACTION_supplyPukReportResultForSubscriber = 12;
        static final int TRANSACTION_handlePinMmi = 13;
        static final int TRANSACTION_handleUssdRequest = 14;
        static final int TRANSACTION_handlePinMmiForSubscriber = 15;
        static final int TRANSACTION_toggleRadioOnOff = 16;
        static final int TRANSACTION_toggleRadioOnOffForSubscriber = 17;
        static final int TRANSACTION_setRadio = 18;
        static final int TRANSACTION_setRadioForSubscriber = 19;
        static final int TRANSACTION_setRadioPower = 20;
        static final int TRANSACTION_requestRadioPowerOffForReason = 21;
        static final int TRANSACTION_clearRadioPowerOffForReason = 22;
        static final int TRANSACTION_getRadioPowerOffReasons = 23;
        static final int TRANSACTION_updateServiceLocation = 24;
        static final int TRANSACTION_updateServiceLocationWithPackageName = 25;
        static final int TRANSACTION_enableLocationUpdates = 26;
        static final int TRANSACTION_disableLocationUpdates = 27;
        static final int TRANSACTION_enableDataConnectivity = 28;
        static final int TRANSACTION_disableDataConnectivity = 29;
        static final int TRANSACTION_isDataConnectivityPossible = 30;
        static final int TRANSACTION_getCellLocation = 31;
        static final int TRANSACTION_getNetworkCountryIsoForPhone = 32;
        static final int TRANSACTION_getNeighboringCellInfo = 33;
        static final int TRANSACTION_getCallState = 34;
        static final int TRANSACTION_getCallStateForSubscription = 35;
        static final int TRANSACTION_getDataActivity = 36;
        static final int TRANSACTION_getDataActivityForSubId = 37;
        static final int TRANSACTION_getDataState = 38;
        static final int TRANSACTION_getDataStateForSubId = 39;
        static final int TRANSACTION_getActivePhoneType = 40;
        static final int TRANSACTION_getActivePhoneTypeForSlot = 41;
        static final int TRANSACTION_getCdmaEriIconIndex = 42;
        static final int TRANSACTION_getCdmaEriIconIndexForSubscriber = 43;
        static final int TRANSACTION_getCdmaEriIconMode = 44;
        static final int TRANSACTION_getCdmaEriIconModeForSubscriber = 45;
        static final int TRANSACTION_getCdmaEriText = 46;
        static final int TRANSACTION_getCdmaEriTextForSubscriber = 47;
        static final int TRANSACTION_needsOtaServiceProvisioning = 48;
        static final int TRANSACTION_setVoiceMailNumber = 49;
        static final int TRANSACTION_setVoiceActivationState = 50;
        static final int TRANSACTION_setDataActivationState = 51;
        static final int TRANSACTION_getVoiceActivationState = 52;
        static final int TRANSACTION_getDataActivationState = 53;
        static final int TRANSACTION_getVoiceMessageCountForSubscriber = 54;
        static final int TRANSACTION_isConcurrentVoiceAndDataAllowed = 55;
        static final int TRANSACTION_getVisualVoicemailSettings = 56;
        static final int TRANSACTION_getVisualVoicemailPackageName = 57;
        static final int TRANSACTION_enableVisualVoicemailSmsFilter = 58;
        static final int TRANSACTION_disableVisualVoicemailSmsFilter = 59;
        static final int TRANSACTION_getVisualVoicemailSmsFilterSettings = 60;
        static final int TRANSACTION_getActiveVisualVoicemailSmsFilterSettings = 61;
        static final int TRANSACTION_sendVisualVoicemailSmsForSubscriber = 62;
        static final int TRANSACTION_sendDialerSpecialCode = 63;
        static final int TRANSACTION_getNetworkTypeForSubscriber = 64;
        static final int TRANSACTION_getDataNetworkType = 65;
        static final int TRANSACTION_getDataNetworkTypeForSubscriber = 66;
        static final int TRANSACTION_getVoiceNetworkTypeForSubscriber = 67;
        static final int TRANSACTION_hasIccCard = 68;
        static final int TRANSACTION_hasIccCardUsingSlotIndex = 69;
        static final int TRANSACTION_getLteOnCdmaMode = 70;
        static final int TRANSACTION_getLteOnCdmaModeForSubscriber = 71;
        static final int TRANSACTION_getAllCellInfo = 72;
        static final int TRANSACTION_requestCellInfoUpdate = 73;
        static final int TRANSACTION_requestCellInfoUpdateWithWorkSource = 74;
        static final int TRANSACTION_setCellInfoListRate = 75;
        static final int TRANSACTION_iccOpenLogicalChannel = 76;
        static final int TRANSACTION_iccCloseLogicalChannel = 77;
        static final int TRANSACTION_iccTransmitApduLogicalChannelByPort = 78;
        static final int TRANSACTION_iccTransmitApduLogicalChannel = 79;
        static final int TRANSACTION_iccTransmitApduBasicChannelByPort = 80;
        static final int TRANSACTION_iccTransmitApduBasicChannel = 81;
        static final int TRANSACTION_iccExchangeSimIO = 82;
        static final int TRANSACTION_sendEnvelopeWithStatus = 83;
        static final int TRANSACTION_nvReadItem = 84;
        static final int TRANSACTION_nvWriteItem = 85;
        static final int TRANSACTION_nvWriteCdmaPrl = 86;
        static final int TRANSACTION_resetModemConfig = 87;
        static final int TRANSACTION_rebootModem = 88;
        static final int TRANSACTION_getAllowedNetworkTypesBitmask = 89;
        static final int TRANSACTION_isTetheringApnRequiredForSubscriber = 90;
        static final int TRANSACTION_enableIms = 91;
        static final int TRANSACTION_disableIms = 92;
        static final int TRANSACTION_resetIms = 93;
        static final int TRANSACTION_registerMmTelFeatureCallback = 94;
        static final int TRANSACTION_unregisterImsFeatureCallback = 95;
        static final int TRANSACTION_getImsRegistration = 96;
        static final int TRANSACTION_getImsConfig = 97;
        static final int TRANSACTION_setBoundImsServiceOverride = 98;
        static final int TRANSACTION_clearCarrierImsServiceOverride = 99;
        static final int TRANSACTION_getBoundImsServicePackage = 100;
        static final int TRANSACTION_getImsMmTelFeatureState = 101;
        static final int TRANSACTION_setNetworkSelectionModeAutomatic = 102;
        static final int TRANSACTION_getCellNetworkScanResults = 103;
        static final int TRANSACTION_requestNetworkScan = 104;
        static final int TRANSACTION_stopNetworkScan = 105;
        static final int TRANSACTION_setNetworkSelectionModeManual = 106;
        static final int TRANSACTION_getAllowedNetworkTypesForReason = 107;
        static final int TRANSACTION_setAllowedNetworkTypesForReason = 108;
        static final int TRANSACTION_getDataEnabled = 109;
        static final int TRANSACTION_isUserDataEnabled = 110;
        static final int TRANSACTION_isDataEnabled = 111;
        static final int TRANSACTION_setDataEnabledForReason = 112;
        static final int TRANSACTION_isDataEnabledForReason = 113;
        static final int TRANSACTION_isManualNetworkSelectionAllowed = 114;
        static final int TRANSACTION_setImsRegistrationState = 115;
        static final int TRANSACTION_getCdmaMdn = 116;
        static final int TRANSACTION_getCdmaMin = 117;
        static final int TRANSACTION_requestNumberVerification = 118;
        static final int TRANSACTION_getCarrierPrivilegeStatus = 119;
        static final int TRANSACTION_getCarrierPrivilegeStatusForUid = 120;
        static final int TRANSACTION_checkCarrierPrivilegesForPackage = 121;
        static final int TRANSACTION_checkCarrierPrivilegesForPackageAnyPhone = 122;
        static final int TRANSACTION_getCarrierPackageNamesForIntentAndPhone = 123;
        static final int TRANSACTION_setLine1NumberForDisplayForSubscriber = 124;
        static final int TRANSACTION_getLine1NumberForDisplay = 125;
        static final int TRANSACTION_getLine1AlphaTagForDisplay = 126;
        static final int TRANSACTION_getMergedSubscriberIds = 127;
        static final int TRANSACTION_getMergedImsisFromGroup = 128;
        static final int TRANSACTION_setOperatorBrandOverride = 129;
        static final int TRANSACTION_setRoamingOverride = 130;
        static final int TRANSACTION_invokeOemRilRequestRaw = 131;
        static final int TRANSACTION_needMobileRadioShutdown = 132;
        static final int TRANSACTION_shutdownMobileRadios = 133;
        static final int TRANSACTION_getRadioAccessFamily = 134;
        static final int TRANSACTION_uploadCallComposerPicture = 135;
        static final int TRANSACTION_enableVideoCalling = 136;
        static final int TRANSACTION_isVideoCallingEnabled = 137;
        static final int TRANSACTION_canChangeDtmfToneLength = 138;
        static final int TRANSACTION_isWorldPhone = 139;
        static final int TRANSACTION_isTtyModeSupported = 140;
        static final int TRANSACTION_isRttSupported = 141;
        static final int TRANSACTION_isHearingAidCompatibilitySupported = 142;
        static final int TRANSACTION_isImsRegistered = 143;
        static final int TRANSACTION_isWifiCallingAvailable = 144;
        static final int TRANSACTION_isVideoTelephonyAvailable = 145;
        static final int TRANSACTION_getImsRegTechnologyForMmTel = 146;
        static final int TRANSACTION_getDeviceId = 147;
        static final int TRANSACTION_getDeviceIdWithFeature = 148;
        static final int TRANSACTION_getImeiForSlot = 149;
        static final int TRANSACTION_getPrimaryImei = 150;
        static final int TRANSACTION_getTypeAllocationCodeForSlot = 151;
        static final int TRANSACTION_getMeidForSlot = 152;
        static final int TRANSACTION_getManufacturerCodeForSlot = 153;
        static final int TRANSACTION_getDeviceSoftwareVersionForSlot = 154;
        static final int TRANSACTION_getSubIdForPhoneAccountHandle = 155;
        static final int TRANSACTION_getPhoneAccountHandleForSubscriptionId = 156;
        static final int TRANSACTION_factoryReset = 157;
        static final int TRANSACTION_getSimLocaleForSubscriber = 158;
        static final int TRANSACTION_requestModemActivityInfo = 159;
        static final int TRANSACTION_getServiceStateForSubscriber = 160;
        static final int TRANSACTION_getVoicemailRingtoneUri = 161;
        static final int TRANSACTION_setVoicemailRingtoneUri = 162;
        static final int TRANSACTION_isVoicemailVibrationEnabled = 163;
        static final int TRANSACTION_setVoicemailVibrationEnabled = 164;
        static final int TRANSACTION_getPackagesWithCarrierPrivileges = 165;
        static final int TRANSACTION_getPackagesWithCarrierPrivilegesForAllPhones = 166;
        static final int TRANSACTION_getAidForAppType = 167;
        static final int TRANSACTION_getEsn = 168;
        static final int TRANSACTION_getCdmaPrlVersion = 169;
        static final int TRANSACTION_getTelephonyHistograms = 170;
        static final int TRANSACTION_setAllowedCarriers = 171;
        static final int TRANSACTION_getAllowedCarriers = 172;
        static final int TRANSACTION_getSubscriptionCarrierId = 173;
        static final int TRANSACTION_getSubscriptionCarrierName = 174;
        static final int TRANSACTION_getSubscriptionSpecificCarrierId = 175;
        static final int TRANSACTION_getSubscriptionSpecificCarrierName = 176;
        static final int TRANSACTION_getCarrierIdFromMccMnc = 177;
        static final int TRANSACTION_carrierActionSetRadioEnabled = 178;
        static final int TRANSACTION_carrierActionReportDefaultNetworkStatus = 179;
        static final int TRANSACTION_carrierActionResetAll = 180;
        static final int TRANSACTION_getCallForwarding = 181;
        static final int TRANSACTION_setCallForwarding = 182;
        static final int TRANSACTION_getCallWaitingStatus = 183;
        static final int TRANSACTION_setCallWaitingStatus = 184;
        static final int TRANSACTION_getClientRequestStats = 185;
        static final int TRANSACTION_setSimPowerStateForSlot = 186;
        static final int TRANSACTION_setSimPowerStateForSlotWithCallback = 187;
        static final int TRANSACTION_getForbiddenPlmns = 188;
        static final int TRANSACTION_setForbiddenPlmns = 189;
        static final int TRANSACTION_getEmergencyCallbackMode = 190;
        static final int TRANSACTION_getSignalStrength = 191;
        static final int TRANSACTION_getCardIdForDefaultEuicc = 192;
        static final int TRANSACTION_getUiccCardsInfo = 193;
        static final int TRANSACTION_getUiccSlotsInfo = 194;
        static final int TRANSACTION_switchSlots = 195;
        static final int TRANSACTION_setSimSlotMapping = 196;
        static final int TRANSACTION_isDataRoamingEnabled = 197;
        static final int TRANSACTION_setDataRoamingEnabled = 198;
        static final int TRANSACTION_getCdmaRoamingMode = 199;
        static final int TRANSACTION_setCdmaRoamingMode = 200;
        static final int TRANSACTION_getCdmaSubscriptionMode = 201;
        static final int TRANSACTION_setCdmaSubscriptionMode = 202;
        static final int TRANSACTION_setCarrierTestOverride = 203;
        static final int TRANSACTION_setCarrierServicePackageOverride = 204;
        static final int TRANSACTION_getCarrierIdListVersion = 205;
        static final int TRANSACTION_refreshUiccProfile = 206;
        static final int TRANSACTION_getNumberOfModemsWithSimultaneousDataConnections = 207;
        static final int TRANSACTION_getNetworkSelectionMode = 208;
        static final int TRANSACTION_isInEmergencySmsMode = 209;
        static final int TRANSACTION_getRadioPowerState = 210;
        static final int TRANSACTION_registerImsRegistrationCallback = 211;
        static final int TRANSACTION_unregisterImsRegistrationCallback = 212;
        static final int TRANSACTION_getImsMmTelRegistrationState = 213;
        static final int TRANSACTION_getImsMmTelRegistrationTransportType = 214;
        static final int TRANSACTION_registerMmTelCapabilityCallback = 215;
        static final int TRANSACTION_unregisterMmTelCapabilityCallback = 216;
        static final int TRANSACTION_isCapable = 217;
        static final int TRANSACTION_isAvailable = 218;
        static final int TRANSACTION_isMmTelCapabilitySupported = 219;
        static final int TRANSACTION_isAdvancedCallingSettingEnabled = 220;
        static final int TRANSACTION_setAdvancedCallingSettingEnabled = 221;
        static final int TRANSACTION_isVtSettingEnabled = 222;
        static final int TRANSACTION_setVtSettingEnabled = 223;
        static final int TRANSACTION_isVoWiFiSettingEnabled = 224;
        static final int TRANSACTION_setVoWiFiSettingEnabled = 225;
        static final int TRANSACTION_isCrossSimCallingEnabledByUser = 226;
        static final int TRANSACTION_setCrossSimCallingEnabled = 227;
        static final int TRANSACTION_isVoWiFiRoamingSettingEnabled = 228;
        static final int TRANSACTION_setVoWiFiRoamingSettingEnabled = 229;
        static final int TRANSACTION_setVoWiFiNonPersistent = 230;
        static final int TRANSACTION_getVoWiFiModeSetting = 231;
        static final int TRANSACTION_setVoWiFiModeSetting = 232;
        static final int TRANSACTION_getVoWiFiRoamingModeSetting = 233;
        static final int TRANSACTION_setVoWiFiRoamingModeSetting = 234;
        static final int TRANSACTION_setRttCapabilitySetting = 235;
        static final int TRANSACTION_isTtyOverVolteEnabled = 236;
        static final int TRANSACTION_getEmergencyNumberList = 237;
        static final int TRANSACTION_isEmergencyNumber = 238;
        static final int TRANSACTION_getCertsFromCarrierPrivilegeAccessRules = 239;
        static final int TRANSACTION_registerImsProvisioningChangedCallback = 240;
        static final int TRANSACTION_unregisterImsProvisioningChangedCallback = 241;
        static final int TRANSACTION_registerFeatureProvisioningChangedCallback = 242;
        static final int TRANSACTION_unregisterFeatureProvisioningChangedCallback = 243;
        static final int TRANSACTION_setImsProvisioningStatusForCapability = 244;
        static final int TRANSACTION_getImsProvisioningStatusForCapability = 245;
        static final int TRANSACTION_getRcsProvisioningStatusForCapability = 246;
        static final int TRANSACTION_setRcsProvisioningStatusForCapability = 247;
        static final int TRANSACTION_getImsProvisioningInt = 248;
        static final int TRANSACTION_getImsProvisioningString = 249;
        static final int TRANSACTION_setImsProvisioningInt = 250;
        static final int TRANSACTION_setImsProvisioningString = 251;
        static final int TRANSACTION_startEmergencyCallbackMode = 252;
        static final int TRANSACTION_updateEmergencyNumberListTestMode = 253;
        static final int TRANSACTION_getEmergencyNumberListTestMode = 254;
        static final int TRANSACTION_getEmergencyNumberDbVersion = 255;
        static final int TRANSACTION_notifyOtaEmergencyNumberDbInstalled = 256;
        static final int TRANSACTION_updateOtaEmergencyNumberDbFilePath = 257;
        static final int TRANSACTION_resetOtaEmergencyNumberDbFilePath = 258;
        static final int TRANSACTION_enableModemForSlot = 259;
        static final int TRANSACTION_setMultiSimCarrierRestriction = 260;
        static final int TRANSACTION_isMultiSimSupported = 261;
        static final int TRANSACTION_switchMultiSimConfig = 262;
        static final int TRANSACTION_doesSwitchMultiSimConfigTriggerReboot = 263;
        static final int TRANSACTION_getSlotsMapping = 264;
        static final int TRANSACTION_getRadioHalVersion = 265;
        static final int TRANSACTION_getHalVersion = 266;
        static final int TRANSACTION_getCurrentPackageName = 267;
        static final int TRANSACTION_isApplicationOnUicc = 268;
        static final int TRANSACTION_isModemEnabledForSlot = 269;
        static final int TRANSACTION_isDataEnabledForApn = 270;
        static final int TRANSACTION_isApnMetered = 271;
        static final int TRANSACTION_setSystemSelectionChannels = 272;
        static final int TRANSACTION_getSystemSelectionChannels = 273;
        static final int TRANSACTION_isMvnoMatched = 274;
        static final int TRANSACTION_enqueueSmsPickResult = 275;
        static final int TRANSACTION_showSwitchToManagedProfileDialog = 276;
        static final int TRANSACTION_getMmsUserAgent = 277;
        static final int TRANSACTION_getMmsUAProfUrl = 278;
        static final int TRANSACTION_setMobileDataPolicyEnabled = 279;
        static final int TRANSACTION_isMobileDataPolicyEnabled = 280;
        static final int TRANSACTION_setCepEnabled = 281;
        static final int TRANSACTION_notifyRcsAutoConfigurationReceived = 282;
        static final int TRANSACTION_isIccLockEnabled = 283;
        static final int TRANSACTION_setIccLockEnabled = 284;
        static final int TRANSACTION_changeIccLockPassword = 285;
        static final int TRANSACTION_requestUserActivityNotification = 286;
        static final int TRANSACTION_userActivity = 287;
        static final int TRANSACTION_getManualNetworkSelectionPlmn = 288;
        static final int TRANSACTION_canConnectTo5GInDsdsMode = 289;
        static final int TRANSACTION_getEquivalentHomePlmns = 290;
        static final int TRANSACTION_setVoNrEnabled = 291;
        static final int TRANSACTION_isVoNrEnabled = 292;
        static final int TRANSACTION_setNrDualConnectivityState = 293;
        static final int TRANSACTION_isNrDualConnectivityEnabled = 294;
        static final int TRANSACTION_isRadioInterfaceCapabilitySupported = 295;
        static final int TRANSACTION_sendThermalMitigationRequest = 296;
        static final int TRANSACTION_bootstrapAuthenticationRequest = 297;
        static final int TRANSACTION_setBoundGbaServiceOverride = 298;
        static final int TRANSACTION_getBoundGbaService = 299;
        static final int TRANSACTION_setGbaReleaseTimeOverride = 300;
        static final int TRANSACTION_getGbaReleaseTime = 301;
        static final int TRANSACTION_setRcsClientConfiguration = 302;
        static final int TRANSACTION_isRcsVolteSingleRegistrationCapable = 303;
        static final int TRANSACTION_registerRcsProvisioningCallback = 304;
        static final int TRANSACTION_unregisterRcsProvisioningCallback = 305;
        static final int TRANSACTION_triggerRcsReconfiguration = 306;
        static final int TRANSACTION_setRcsSingleRegistrationTestModeEnabled = 307;
        static final int TRANSACTION_getRcsSingleRegistrationTestModeEnabled = 308;
        static final int TRANSACTION_setDeviceSingleRegistrationEnabledOverride = 309;
        static final int TRANSACTION_getDeviceSingleRegistrationEnabled = 310;
        static final int TRANSACTION_setCarrierSingleRegistrationEnabledOverride = 311;
        static final int TRANSACTION_sendDeviceToDeviceMessage = 312;
        static final int TRANSACTION_setActiveDeviceToDeviceTransport = 313;
        static final int TRANSACTION_setDeviceToDeviceForceEnabled = 314;
        static final int TRANSACTION_getCarrierSingleRegistrationEnabled = 315;
        static final int TRANSACTION_setImsFeatureValidationOverride = 316;
        static final int TRANSACTION_getImsFeatureValidationOverride = 317;
        static final int TRANSACTION_getMobileProvisioningUrl = 318;
        static final int TRANSACTION_removeContactFromEab = 319;
        static final int TRANSACTION_getContactFromEab = 320;
        static final int TRANSACTION_getCapabilityFromEab = 321;
        static final int TRANSACTION_getDeviceUceEnabled = 322;
        static final int TRANSACTION_setDeviceUceEnabled = 323;
        static final int TRANSACTION_addUceRegistrationOverrideShell = 324;
        static final int TRANSACTION_removeUceRegistrationOverrideShell = 325;
        static final int TRANSACTION_clearUceRegistrationOverrideShell = 326;
        static final int TRANSACTION_getLatestRcsContactUceCapabilityShell = 327;
        static final int TRANSACTION_getLastUcePidfXmlShell = 328;
        static final int TRANSACTION_removeUceRequestDisallowedStatus = 329;
        static final int TRANSACTION_setCapabilitiesRequestTimeout = 330;
        static final int TRANSACTION_setSignalStrengthUpdateRequest = 331;
        static final int TRANSACTION_clearSignalStrengthUpdateRequest = 332;
        static final int TRANSACTION_getPhoneCapability = 333;
        static final int TRANSACTION_prepareForUnattendedReboot = 334;
        static final int TRANSACTION_getSlicingConfig = 335;
        static final int TRANSACTION_isPremiumCapabilityAvailableForPurchase = 336;
        static final int TRANSACTION_purchasePremiumCapability = 337;
        static final int TRANSACTION_registerImsStateCallback = 338;
        static final int TRANSACTION_unregisterImsStateCallback = 339;
        static final int TRANSACTION_getLastKnownCellIdentity = 340;
        static final int TRANSACTION_setModemService = 341;
        static final int TRANSACTION_getModemService = 342;
        static final int TRANSACTION_isProvisioningRequiredForCapability = 343;
        static final int TRANSACTION_isRcsProvisioningRequiredForCapability = 344;
        static final int TRANSACTION_setVoiceServiceStateOverride = 345;
        static final int TRANSACTION_getCarrierServicePackageNameForLogicalSlot = 346;
        static final int TRANSACTION_setRemovableEsimAsDefaultEuicc = 347;
        static final int TRANSACTION_isRemovableEsimDefaultEuicc = 348;
        static final int TRANSACTION_getDefaultRespondViaMessageApplication = 349;
        static final int TRANSACTION_getSimStateForSlotIndex = 350;
        static final int TRANSACTION_persistEmergencyCallDiagnosticData = 351;
        static final int TRANSACTION_setNullCipherAndIntegrityEnabled = 352;
        static final int TRANSACTION_isNullCipherAndIntegrityPreferenceEnabled = 353;
        static final int TRANSACTION_getCellBroadcastIdRanges = 354;
        static final int TRANSACTION_setCellBroadcastIdRanges = 355;
        static final int TRANSACTION_isDomainSelectionSupported = 356;
        static final int TRANSACTION_getCarrierRestrictionStatus = 357;
        static final int TRANSACTION_requestSatelliteEnabled = 358;
        static final int TRANSACTION_requestIsSatelliteEnabled = 359;
        static final int TRANSACTION_requestIsDemoModeEnabled = 360;
        static final int TRANSACTION_requestIsSatelliteSupported = 361;
        static final int TRANSACTION_requestSatelliteCapabilities = 362;
        static final int TRANSACTION_startSatelliteTransmissionUpdates = 363;
        static final int TRANSACTION_stopSatelliteTransmissionUpdates = 364;
        static final int TRANSACTION_provisionSatelliteService = 365;
        static final int TRANSACTION_deprovisionSatelliteService = 366;
        static final int TRANSACTION_registerForSatelliteProvisionStateChanged = 367;
        static final int TRANSACTION_unregisterForSatelliteProvisionStateChanged = 368;
        static final int TRANSACTION_requestIsSatelliteProvisioned = 369;
        static final int TRANSACTION_registerForSatelliteModemStateChanged = 370;
        static final int TRANSACTION_unregisterForSatelliteModemStateChanged = 371;
        static final int TRANSACTION_registerForSatelliteDatagram = 372;
        static final int TRANSACTION_unregisterForSatelliteDatagram = 373;
        static final int TRANSACTION_pollPendingSatelliteDatagrams = 374;
        static final int TRANSACTION_sendSatelliteDatagram = 375;
        static final int TRANSACTION_requestIsSatelliteCommunicationAllowedForCurrentLocation = 376;
        static final int TRANSACTION_requestTimeForNextSatelliteVisibility = 377;
        static final int TRANSACTION_onDeviceAlignedWithSatellite = 378;
        static final int TRANSACTION_setSatelliteServicePackageName = 379;
        static final int TRANSACTION_setSatelliteGatewayServicePackageName = 380;
        static final int TRANSACTION_setSatelliteListeningTimeoutDuration = 381;
        static final int TRANSACTION_setSatellitePointingUiClassName = 382;
        static final int TRANSACTION_setSatelliteDeviceAlignedTimeoutDuration = 383;
        static final int TRANSACTION_getShaIdFromAllowList = 384;
        public Stub() { super(); }
        public static com.android.internal.telephony.ITelephony asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telephony.ITelephony {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void dial(java.lang.String p0) throws android.os.RemoteException {}
            public void call(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean isRadioOn(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isRadioOnWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isRadioOnForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isRadioOnForSubscriberWithFeature(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void setCallComposerStatus(int p0, int p1) throws android.os.RemoteException {}
            public int getCallComposerStatus(int p0) throws android.os.RemoteException { return 0; }
            public boolean supplyPinForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean supplyPukForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public int[] supplyPinReportResultForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int[] supplyPukReportResultForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean handlePinMmi(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void handleUssdRequest(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public boolean handlePinMmiForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void toggleRadioOnOff() throws android.os.RemoteException {}
            public void toggleRadioOnOffForSubscriber(int p0) throws android.os.RemoteException {}
            public boolean setRadio(boolean p0) throws android.os.RemoteException { return false; }
            public boolean setRadioForSubscriber(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean setRadioPower(boolean p0) throws android.os.RemoteException { return false; }
            public boolean requestRadioPowerOffForReason(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean clearRadioPowerOffForReason(int p0, int p1) throws android.os.RemoteException { return false; }
            public java.util.List getRadioPowerOffReasons(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void updateServiceLocation() throws android.os.RemoteException {}
            public void updateServiceLocationWithPackageName(java.lang.String p0) throws android.os.RemoteException {}
            public void enableLocationUpdates() throws android.os.RemoteException {}
            public void disableLocationUpdates() throws android.os.RemoteException {}
            public boolean enableDataConnectivity(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean disableDataConnectivity(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isDataConnectivityPossible(int p0) throws android.os.RemoteException { return false; }
            public android.telephony.CellIdentity getCellLocation(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getNetworkCountryIsoForPhone(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int getCallState() throws android.os.RemoteException { return 0; }
            public int getCallStateForSubscription(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int getDataActivity() throws android.os.RemoteException { return 0; }
            public int getDataActivityForSubId(int p0) throws android.os.RemoteException { return 0; }
            public int getDataState() throws android.os.RemoteException { return 0; }
            public int getDataStateForSubId(int p0) throws android.os.RemoteException { return 0; }
            public int getActivePhoneType() throws android.os.RemoteException { return 0; }
            public int getActivePhoneTypeForSlot(int p0) throws android.os.RemoteException { return 0; }
            public int getCdmaEriIconIndex(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getCdmaEriIconIndexForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int getCdmaEriIconMode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getCdmaEriIconModeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public java.lang.String getCdmaEriText(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getCdmaEriTextForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean needsOtaServiceProvisioning() throws android.os.RemoteException { return false; }
            public boolean setVoiceMailNumber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void setVoiceActivationState(int p0, int p1) throws android.os.RemoteException {}
            public void setDataActivationState(int p0, int p1) throws android.os.RemoteException {}
            public int getVoiceActivationState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getDataActivationState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getVoiceMessageCountForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public boolean isConcurrentVoiceAndDataAllowed(int p0) throws android.os.RemoteException { return false; }
            public android.os.Bundle getVisualVoicemailSettings(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public java.lang.String getVisualVoicemailPackageName(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public void enableVisualVoicemailSmsFilter(java.lang.String p0, int p1, android.telephony.VisualVoicemailSmsFilterSettings p2) throws android.os.RemoteException {}
            public void disableVisualVoicemailSmsFilter(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public android.telephony.VisualVoicemailSmsFilterSettings getVisualVoicemailSmsFilterSettings(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.telephony.VisualVoicemailSmsFilterSettings getActiveVisualVoicemailSmsFilterSettings(int p0) throws android.os.RemoteException { return null; }
            public void sendVisualVoicemailSmsForSubscriber(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, int p4, java.lang.String p5, android.app.PendingIntent p6) throws android.os.RemoteException {}
            public void sendDialerSpecialCode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public int getNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int getDataNetworkType(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getDataNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int getVoiceNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public boolean hasIccCard() throws android.os.RemoteException { return false; }
            public boolean hasIccCardUsingSlotIndex(int p0) throws android.os.RemoteException { return false; }
            public int getLteOnCdmaMode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getLteOnCdmaModeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public java.util.List<android.telephony.CellInfo> getAllCellInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void requestCellInfoUpdate(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void requestCellInfoUpdateWithWorkSource(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4) throws android.os.RemoteException {}
            public void setCellInfoListRate(int p0, int p1) throws android.os.RemoteException {}
            public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(com.android.internal.telephony.IccLogicalChannelRequest p0) throws android.os.RemoteException { return null; }
            public boolean iccCloseLogicalChannel(com.android.internal.telephony.IccLogicalChannelRequest p0) throws android.os.RemoteException { return false; }
            public java.lang.String iccTransmitApduLogicalChannelByPort(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, java.lang.String p8) throws android.os.RemoteException { return null; }
            public java.lang.String iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
            public java.lang.String iccTransmitApduBasicChannelByPort(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, int p6, int p7, java.lang.String p8) throws android.os.RemoteException { return null; }
            public java.lang.String iccTransmitApduBasicChannel(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
            public byte[] iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) throws android.os.RemoteException { return null; }
            public java.lang.String sendEnvelopeWithStatus(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String nvReadItem(int p0) throws android.os.RemoteException { return null; }
            public boolean nvWriteItem(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean nvWriteCdmaPrl(byte[] p0) throws android.os.RemoteException { return false; }
            public boolean resetModemConfig(int p0) throws android.os.RemoteException { return false; }
            public boolean rebootModem(int p0) throws android.os.RemoteException { return false; }
            public int getAllowedNetworkTypesBitmask(int p0) throws android.os.RemoteException { return 0; }
            public boolean isTetheringApnRequiredForSubscriber(int p0) throws android.os.RemoteException { return false; }
            public void enableIms(int p0) throws android.os.RemoteException {}
            public void disableIms(int p0) throws android.os.RemoteException {}
            public void resetIms(int p0) throws android.os.RemoteException {}
            public void registerMmTelFeatureCallback(int p0, com.android.ims.internal.IImsServiceFeatureCallback p1) throws android.os.RemoteException {}
            public void unregisterImsFeatureCallback(com.android.ims.internal.IImsServiceFeatureCallback p0) throws android.os.RemoteException {}
            public android.telephony.ims.aidl.IImsRegistration getImsRegistration(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.aidl.IImsConfig getImsConfig(int p0, int p1) throws android.os.RemoteException { return null; }
            public boolean setBoundImsServiceOverride(int p0, boolean p1, int[] p2, java.lang.String p3) throws android.os.RemoteException { return false; }
            public boolean clearCarrierImsServiceOverride(int p0) throws android.os.RemoteException { return false; }
            public java.lang.String getBoundImsServicePackage(int p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
            public void getImsMmTelFeatureState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void setNetworkSelectionModeAutomatic(int p0) throws android.os.RemoteException {}
            public com.android.internal.telephony.CellNetworkScanResult getCellNetworkScanResults(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public int requestNetworkScan(int p0, boolean p1, android.telephony.NetworkScanRequest p2, android.os.Messenger p3, android.os.IBinder p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException { return 0; }
            public void stopNetworkScan(int p0, int p1) throws android.os.RemoteException {}
            public boolean setNetworkSelectionModeManual(int p0, com.android.internal.telephony.OperatorInfo p1, boolean p2) throws android.os.RemoteException { return false; }
            public long getAllowedNetworkTypesForReason(int p0, int p1) throws android.os.RemoteException { return 0L; }
            public boolean setAllowedNetworkTypesForReason(int p0, int p1, long p2) throws android.os.RemoteException { return false; }
            public boolean getDataEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserDataEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isDataEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setDataEnabledForReason(int p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
            public boolean isDataEnabledForReason(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isManualNetworkSelectionAllowed(int p0) throws android.os.RemoteException { return false; }
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
            public java.lang.String getLine1NumberForDisplay(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getLine1AlphaTagForDisplay(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String[] getMergedSubscriberIds(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String[] getMergedImsisFromGroup(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean setOperatorBrandOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean setRoamingOverride(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException { return false; }
            public int invokeOemRilRequestRaw(byte[] p0, byte[] p1) throws android.os.RemoteException { return 0; }
            public boolean needMobileRadioShutdown() throws android.os.RemoteException { return false; }
            public void shutdownMobileRadios() throws android.os.RemoteException {}
            public int getRadioAccessFamily(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void uploadCallComposerPicture(int p0, java.lang.String p1, java.lang.String p2, android.os.ParcelFileDescriptor p3, android.os.ResultReceiver p4) throws android.os.RemoteException {}
            public void enableVideoCalling(boolean p0) throws android.os.RemoteException {}
            public boolean isVideoCallingEnabled(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean canChangeDtmfToneLength(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isWorldPhone(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isTtyModeSupported() throws android.os.RemoteException { return false; }
            public boolean isRttSupported(int p0) throws android.os.RemoteException { return false; }
            public boolean isHearingAidCompatibilitySupported() throws android.os.RemoteException { return false; }
            public boolean isImsRegistered(int p0) throws android.os.RemoteException { return false; }
            public boolean isWifiCallingAvailable(int p0) throws android.os.RemoteException { return false; }
            public boolean isVideoTelephonyAvailable(int p0) throws android.os.RemoteException { return false; }
            public int getImsRegTechnologyForMmTel(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getDeviceId(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getDeviceIdWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getImeiForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getPrimaryImei(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getTypeAllocationCodeForSlot(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getMeidForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getManufacturerCodeForSlot(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getDeviceSoftwareVersionForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public int getSubIdForPhoneAccountHandle(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public android.telecom.PhoneAccountHandle getPhoneAccountHandleForSubscriptionId(int p0) throws android.os.RemoteException { return null; }
            public void factoryReset(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.lang.String getSimLocaleForSubscriber(int p0) throws android.os.RemoteException { return null; }
            public void requestModemActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public android.telephony.ServiceState getServiceStateForSubscriber(int p0, boolean p1, boolean p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
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
            public void carrierActionSetRadioEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void carrierActionReportDefaultNetworkStatus(int p0, boolean p1) throws android.os.RemoteException {}
            public void carrierActionResetAll(int p0) throws android.os.RemoteException {}
            public void getCallForwarding(int p0, int p1, com.android.internal.telephony.ICallForwardingInfoCallback p2) throws android.os.RemoteException {}
            public void setCallForwarding(int p0, android.telephony.CallForwardingInfo p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public void getCallWaitingStatus(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void setCallWaitingStatus(int p0, boolean p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public java.util.List<android.telephony.ClientRequestStats> getClientRequestStats(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public void setSimPowerStateForSlot(int p0, int p1) throws android.os.RemoteException {}
            public void setSimPowerStateForSlotWithCallback(int p0, int p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public java.lang.String[] getForbiddenPlmns(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public int setForbiddenPlmns(int p0, int p1, java.util.List<java.lang.String> p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
            public boolean getEmergencyCallbackMode(int p0) throws android.os.RemoteException { return false; }
            public android.telephony.SignalStrength getSignalStrength(int p0) throws android.os.RemoteException { return null; }
            public int getCardIdForDefaultEuicc(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public java.util.List<android.telephony.UiccCardInfo> getUiccCardsInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.telephony.UiccSlotInfo[] getUiccSlotsInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean switchSlots(int[] p0) throws android.os.RemoteException { return false; }
            public boolean setSimSlotMapping(java.util.List<android.telephony.UiccSlotMapping> p0) throws android.os.RemoteException { return false; }
            public boolean isDataRoamingEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setDataRoamingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public int getCdmaRoamingMode(int p0) throws android.os.RemoteException { return 0; }
            public boolean setCdmaRoamingMode(int p0, int p1) throws android.os.RemoteException { return false; }
            public int getCdmaSubscriptionMode(int p0) throws android.os.RemoteException { return 0; }
            public boolean setCdmaSubscriptionMode(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setCarrierTestOverride(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) throws android.os.RemoteException {}
            public void setCarrierServicePackageOverride(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public int getCarrierIdListVersion(int p0) throws android.os.RemoteException { return 0; }
            public void refreshUiccProfile(int p0) throws android.os.RemoteException {}
            public int getNumberOfModemsWithSimultaneousDataConnections(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int getNetworkSelectionMode(int p0) throws android.os.RemoteException { return 0; }
            public boolean isInEmergencySmsMode() throws android.os.RemoteException { return false; }
            public int getRadioPowerState(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void registerImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
            public void unregisterImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
            public void getImsMmTelRegistrationState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void getImsMmTelRegistrationTransportType(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void registerMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
            public void unregisterMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
            public boolean isCapable(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isAvailable(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void isMmTelCapabilitySupported(int p0, com.android.internal.telephony.IIntegerConsumer p1, int p2, int p3) throws android.os.RemoteException {}
            public boolean isAdvancedCallingSettingEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setAdvancedCallingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean isVtSettingEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setVtSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean isVoWiFiSettingEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setVoWiFiSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean isCrossSimCallingEnabledByUser(int p0) throws android.os.RemoteException { return false; }
            public void setCrossSimCallingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean isVoWiFiRoamingSettingEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setVoWiFiRoamingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void setVoWiFiNonPersistent(int p0, boolean p1, int p2) throws android.os.RemoteException {}
            public int getVoWiFiModeSetting(int p0) throws android.os.RemoteException { return 0; }
            public void setVoWiFiModeSetting(int p0, int p1) throws android.os.RemoteException {}
            public int getVoWiFiRoamingModeSetting(int p0) throws android.os.RemoteException { return 0; }
            public void setVoWiFiRoamingModeSetting(int p0, int p1) throws android.os.RemoteException {}
            public void setRttCapabilitySetting(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean isTtyOverVolteEnabled(int p0) throws android.os.RemoteException { return false; }
            public java.util.Map getEmergencyNumberList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isEmergencyNumber(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getCertsFromCarrierPrivilegeAccessRules(int p0) throws android.os.RemoteException { return null; }
            public void registerImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException {}
            public void unregisterImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException {}
            public void registerFeatureProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IFeatureProvisioningCallback p1) throws android.os.RemoteException {}
            public void unregisterFeatureProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IFeatureProvisioningCallback p1) throws android.os.RemoteException {}
            public void setImsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
            public boolean getImsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean getRcsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void setRcsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
            public int getImsProvisioningInt(int p0, int p1) throws android.os.RemoteException { return 0; }
            public java.lang.String getImsProvisioningString(int p0, int p1) throws android.os.RemoteException { return null; }
            public int setImsProvisioningInt(int p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public int setImsProvisioningString(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void startEmergencyCallbackMode() throws android.os.RemoteException {}
            public void updateEmergencyNumberListTestMode(int p0, android.telephony.emergency.EmergencyNumber p1) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getEmergencyNumberListTestMode() throws android.os.RemoteException { return null; }
            public int getEmergencyNumberDbVersion(int p0) throws android.os.RemoteException { return 0; }
            public void notifyOtaEmergencyNumberDbInstalled() throws android.os.RemoteException {}
            public void updateOtaEmergencyNumberDbFilePath(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
            public void resetOtaEmergencyNumberDbFilePath() throws android.os.RemoteException {}
            public boolean enableModemForSlot(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public void setMultiSimCarrierRestriction(boolean p0) throws android.os.RemoteException {}
            public int isMultiSimSupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void switchMultiSimConfig(int p0) throws android.os.RemoteException {}
            public boolean doesSwitchMultiSimConfigTriggerReboot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public java.util.List<android.telephony.UiccSlotMapping> getSlotsMapping(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getRadioHalVersion() throws android.os.RemoteException { return 0; }
            public int getHalVersion(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getCurrentPackageName() throws android.os.RemoteException { return null; }
            public boolean isApplicationOnUicc(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isModemEnabledForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isDataEnabledForApn(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isApnMetered(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setSystemSelectionChannels(java.util.List<android.telephony.RadioAccessSpecifier> p0, int p1, com.android.internal.telephony.IBooleanConsumer p2) throws android.os.RemoteException {}
            public java.util.List<android.telephony.RadioAccessSpecifier> getSystemSelectionChannels(int p0) throws android.os.RemoteException { return null; }
            public boolean isMvnoMatched(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void enqueueSmsPickResult(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public void showSwitchToManagedProfileDialog() throws android.os.RemoteException {}
            public java.lang.String getMmsUserAgent(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getMmsUAProfUrl(int p0) throws android.os.RemoteException { return null; }
            public void setMobileDataPolicyEnabled(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public boolean isMobileDataPolicyEnabled(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setCepEnabled(boolean p0) throws android.os.RemoteException {}
            public void notifyRcsAutoConfigurationReceived(int p0, byte[] p1, boolean p2) throws android.os.RemoteException {}
            public boolean isIccLockEnabled(int p0) throws android.os.RemoteException { return false; }
            public int setIccLockEnabled(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int changeIccLockPassword(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void requestUserActivityNotification() throws android.os.RemoteException {}
            public void userActivity() throws android.os.RemoteException {}
            public java.lang.String getManualNetworkSelectionPlmn(int p0) throws android.os.RemoteException { return null; }
            public boolean canConnectTo5GInDsdsMode() throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getEquivalentHomePlmns(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public int setVoNrEnabled(int p0, boolean p1) throws android.os.RemoteException { return 0; }
            public boolean isVoNrEnabled(int p0) throws android.os.RemoteException { return false; }
            public int setNrDualConnectivityState(int p0, int p1) throws android.os.RemoteException { return 0; }
            public boolean isNrDualConnectivityEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isRadioInterfaceCapabilitySupported(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int sendThermalMitigationRequest(int p0, android.telephony.ThermalMitigationRequest p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void bootstrapAuthenticationRequest(int p0, int p1, android.net.Uri p2, android.telephony.gba.UaSecurityProtocolIdentifier p3, boolean p4, android.telephony.IBootstrapAuthenticationCallback p5) throws android.os.RemoteException {}
            public boolean setBoundGbaServiceOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public java.lang.String getBoundGbaService(int p0) throws android.os.RemoteException { return null; }
            public boolean setGbaReleaseTimeOverride(int p0, int p1) throws android.os.RemoteException { return false; }
            public int getGbaReleaseTime(int p0) throws android.os.RemoteException { return 0; }
            public void setRcsClientConfiguration(int p0, android.telephony.ims.RcsClientConfiguration p1) throws android.os.RemoteException {}
            public boolean isRcsVolteSingleRegistrationCapable(int p0) throws android.os.RemoteException { return false; }
            public void registerRcsProvisioningCallback(int p0, android.telephony.ims.aidl.IRcsConfigCallback p1) throws android.os.RemoteException {}
            public void unregisterRcsProvisioningCallback(int p0, android.telephony.ims.aidl.IRcsConfigCallback p1) throws android.os.RemoteException {}
            public void triggerRcsReconfiguration(int p0) throws android.os.RemoteException {}
            public void setRcsSingleRegistrationTestModeEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean getRcsSingleRegistrationTestModeEnabled() throws android.os.RemoteException { return false; }
            public void setDeviceSingleRegistrationEnabledOverride(java.lang.String p0) throws android.os.RemoteException {}
            public boolean getDeviceSingleRegistrationEnabled() throws android.os.RemoteException { return false; }
            public boolean setCarrierSingleRegistrationEnabledOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void sendDeviceToDeviceMessage(int p0, int p1) throws android.os.RemoteException {}
            public void setActiveDeviceToDeviceTransport(java.lang.String p0) throws android.os.RemoteException {}
            public void setDeviceToDeviceForceEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean getCarrierSingleRegistrationEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean setImsFeatureValidationOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean getImsFeatureValidationOverride(int p0) throws android.os.RemoteException { return false; }
            public java.lang.String getMobileProvisioningUrl() throws android.os.RemoteException { return null; }
            public int removeContactFromEab(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public java.lang.String getContactFromEab(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getCapabilityFromEab(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean getDeviceUceEnabled() throws android.os.RemoteException { return false; }
            public void setDeviceUceEnabled(boolean p0) throws android.os.RemoteException {}
            public android.telephony.ims.RcsContactUceCapability addUceRegistrationOverrideShell(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.RcsContactUceCapability removeUceRegistrationOverrideShell(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.RcsContactUceCapability clearUceRegistrationOverrideShell(int p0) throws android.os.RemoteException { return null; }
            public android.telephony.ims.RcsContactUceCapability getLatestRcsContactUceCapabilityShell(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getLastUcePidfXmlShell(int p0) throws android.os.RemoteException { return null; }
            public boolean removeUceRequestDisallowedStatus(int p0) throws android.os.RemoteException { return false; }
            public boolean setCapabilitiesRequestTimeout(int p0, long p1) throws android.os.RemoteException { return false; }
            public void setSignalStrengthUpdateRequest(int p0, android.telephony.SignalStrengthUpdateRequest p1, java.lang.String p2) throws android.os.RemoteException {}
            public void clearSignalStrengthUpdateRequest(int p0, android.telephony.SignalStrengthUpdateRequest p1, java.lang.String p2) throws android.os.RemoteException {}
            public android.telephony.PhoneCapability getPhoneCapability() throws android.os.RemoteException { return null; }
            public int prepareForUnattendedReboot() throws android.os.RemoteException { return 0; }
            public void getSlicingConfig(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public boolean isPremiumCapabilityAvailableForPurchase(int p0, int p1) throws android.os.RemoteException { return false; }
            public void purchasePremiumCapability(int p0, com.android.internal.telephony.IIntegerConsumer p1, int p2) throws android.os.RemoteException {}
            public void registerImsStateCallback(int p0, int p1, com.android.internal.telephony.IImsStateCallback p2, java.lang.String p3) throws android.os.RemoteException {}
            public void unregisterImsStateCallback(com.android.internal.telephony.IImsStateCallback p0) throws android.os.RemoteException {}
            public android.telephony.CellIdentity getLastKnownCellIdentity(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean setModemService(java.lang.String p0) throws android.os.RemoteException { return false; }
            public java.lang.String getModemService() throws android.os.RemoteException { return null; }
            public boolean isProvisioningRequiredForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isRcsProvisioningRequiredForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void setVoiceServiceStateOverride(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.lang.String getCarrierServicePackageNameForLogicalSlot(int p0) throws android.os.RemoteException { return null; }
            public void setRemovableEsimAsDefaultEuicc(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean isRemovableEsimDefaultEuicc(java.lang.String p0) throws android.os.RemoteException { return false; }
            public android.content.ComponentName getDefaultRespondViaMessageApplication(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public int getSimStateForSlotIndex(int p0) throws android.os.RemoteException { return 0; }
            public void persistEmergencyCallDiagnosticData(java.lang.String p0, boolean p1, long p2, boolean p3, boolean p4) throws android.os.RemoteException {}
            public void setNullCipherAndIntegrityEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean isNullCipherAndIntegrityPreferenceEnabled() throws android.os.RemoteException { return false; }
            public java.util.List<android.telephony.CellBroadcastIdRange> getCellBroadcastIdRanges(int p0) throws android.os.RemoteException { return null; }
            public void setCellBroadcastIdRanges(int p0, java.util.List<android.telephony.CellBroadcastIdRange> p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public boolean isDomainSelectionSupported() throws android.os.RemoteException { return false; }
            public void getCarrierRestrictionStatus(com.android.internal.telephony.IIntegerConsumer p0, java.lang.String p1) throws android.os.RemoteException {}
            public void requestSatelliteEnabled(int p0, boolean p1, boolean p2, com.android.internal.telephony.IIntegerConsumer p3) throws android.os.RemoteException {}
            public void requestIsSatelliteEnabled(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void requestIsDemoModeEnabled(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void requestIsSatelliteSupported(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void requestSatelliteCapabilities(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void startSatelliteTransmissionUpdates(int p0, com.android.internal.telephony.IIntegerConsumer p1, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p2) throws android.os.RemoteException {}
            public void stopSatelliteTransmissionUpdates(int p0, com.android.internal.telephony.IIntegerConsumer p1, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p2) throws android.os.RemoteException {}
            public android.os.ICancellationSignal provisionSatelliteService(int p0, java.lang.String p1, byte[] p2, com.android.internal.telephony.IIntegerConsumer p3) throws android.os.RemoteException { return null; }
            public void deprovisionSatelliteService(int p0, java.lang.String p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public int registerForSatelliteProvisionStateChanged(int p0, android.telephony.satellite.ISatelliteProvisionStateCallback p1) throws android.os.RemoteException { return 0; }
            public void unregisterForSatelliteProvisionStateChanged(int p0, android.telephony.satellite.ISatelliteProvisionStateCallback p1) throws android.os.RemoteException {}
            public void requestIsSatelliteProvisioned(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public int registerForSatelliteModemStateChanged(int p0, android.telephony.satellite.ISatelliteStateCallback p1) throws android.os.RemoteException { return 0; }
            public void unregisterForSatelliteModemStateChanged(int p0, android.telephony.satellite.ISatelliteStateCallback p1) throws android.os.RemoteException {}
            public int registerForSatelliteDatagram(int p0, android.telephony.satellite.ISatelliteDatagramCallback p1) throws android.os.RemoteException { return 0; }
            public void unregisterForSatelliteDatagram(int p0, android.telephony.satellite.ISatelliteDatagramCallback p1) throws android.os.RemoteException {}
            public void pollPendingSatelliteDatagrams(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void sendSatelliteDatagram(int p0, int p1, android.telephony.satellite.SatelliteDatagram p2, boolean p3, com.android.internal.telephony.IIntegerConsumer p4) throws android.os.RemoteException {}
            public void requestIsSatelliteCommunicationAllowedForCurrentLocation(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void requestTimeForNextSatelliteVisibility(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void onDeviceAlignedWithSatellite(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean setSatelliteServicePackageName(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean setSatelliteGatewayServicePackageName(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean setSatelliteListeningTimeoutDuration(long p0) throws android.os.RemoteException { return false; }
            public boolean setSatellitePointingUiClassName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean setSatelliteDeviceAlignedTimeoutDuration(long p0) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getShaIdFromAllowList(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        }
    }
}
