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
    public void updateServiceLocation() throws android.os.RemoteException;
    public void updateServiceLocationWithPackageName(java.lang.String p0) throws android.os.RemoteException;
    public void enableLocationUpdates() throws android.os.RemoteException;
    public void disableLocationUpdates() throws android.os.RemoteException;
    public boolean enableDataConnectivity() throws android.os.RemoteException;
    public boolean disableDataConnectivity() throws android.os.RemoteException;
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
    public void setCellInfoListRate(int p0) throws android.os.RemoteException;
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannelBySlot(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public boolean iccCloseLogicalChannelBySlot(int p0, int p1) throws android.os.RemoteException;
    public boolean iccCloseLogicalChannel(int p0, int p1) throws android.os.RemoteException;
    public java.lang.String iccTransmitApduLogicalChannelBySlot(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException;
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
    public int requestNetworkScan(int p0, android.telephony.NetworkScanRequest p1, android.os.Messenger p2, android.os.IBinder p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException;
    public void stopNetworkScan(int p0, int p1) throws android.os.RemoteException;
    public boolean setNetworkSelectionModeManual(int p0, com.android.internal.telephony.OperatorInfo p1, boolean p2) throws android.os.RemoteException;
    public long getAllowedNetworkTypesForReason(int p0, int p1) throws android.os.RemoteException;
    public boolean setAllowedNetworkTypesForReason(int p0, int p1, long p2) throws android.os.RemoteException;
    public boolean getDataEnabled(int p0) throws android.os.RemoteException;
    public boolean isUserDataEnabled(int p0) throws android.os.RemoteException;
    public boolean isDataEnabled(int p0) throws android.os.RemoteException;
    public void setDataEnabledForReason(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean isDataEnabledForReason(int p0, int p1) throws android.os.RemoteException;
    public boolean isManualNetworkSelectionAllowed(int p0) throws android.os.RemoteException;
    public void setAlwaysReportSignalStrength(int p0, boolean p1) throws android.os.RemoteException;
    public java.lang.String[] getPcscfAddress(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
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
    public java.lang.String getTypeAllocationCodeForSlot(int p0) throws android.os.RemoteException;
    public java.lang.String getMeidForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getManufacturerCodeForSlot(int p0) throws android.os.RemoteException;
    public java.lang.String getDeviceSoftwareVersionForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getSubIdForPhoneAccount(android.telecom.PhoneAccount p0) throws android.os.RemoteException;
    public int getSubIdForPhoneAccountHandle(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.telecom.PhoneAccountHandle getPhoneAccountHandleForSubscriptionId(int p0) throws android.os.RemoteException;
    public void factoryReset(int p0) throws android.os.RemoteException;
    public java.lang.String getSimLocaleForSubscriber(int p0) throws android.os.RemoteException;
    public void requestModemActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public android.telephony.ServiceState getServiceStateForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
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
    public android.telephony.UiccSlotInfo[] getUiccSlotsInfo() throws android.os.RemoteException;
    public boolean switchSlots(int[] p0) throws android.os.RemoteException;
    public boolean isDataRoamingEnabled(int p0) throws android.os.RemoteException;
    public void setDataRoamingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public int getCdmaRoamingMode(int p0) throws android.os.RemoteException;
    public boolean setCdmaRoamingMode(int p0, int p1) throws android.os.RemoteException;
    public int getCdmaSubscriptionMode(int p0) throws android.os.RemoteException;
    public boolean setCdmaSubscriptionMode(int p0, int p1) throws android.os.RemoteException;
    public void setCarrierTestOverride(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) throws android.os.RemoteException;
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
    public void setImsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    public boolean getImsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean getRcsProvisioningStatusForCapability(int p0, int p1) throws android.os.RemoteException;
    public void setRcsProvisioningStatusForCapability(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean isMmTelCapabilityProvisionedInCache(int p0, int p1, int p2) throws android.os.RemoteException;
    public void cacheMmTelCapabilityProvisioning(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
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
    public int[] getSlotsMapping() throws android.os.RemoteException;
    public int getRadioHalVersion() throws android.os.RemoteException;
    public java.lang.String getCurrentPackageName() throws android.os.RemoteException;
    public boolean isApplicationOnUicc(int p0, int p1) throws android.os.RemoteException;
    public boolean isModemEnabledForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isDataEnabledForApn(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isApnMetered(int p0, int p1) throws android.os.RemoteException;
    public void setSystemSelectionChannels(java.util.List<android.telephony.RadioAccessSpecifier> p0, int p1, com.android.internal.telephony.IBooleanConsumer p2) throws android.os.RemoteException;
    public java.util.List<android.telephony.RadioAccessSpecifier> getSystemSelectionChannels(int p0) throws android.os.RemoteException;
    public boolean isMvnoMatched(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void enqueueSmsPickResult(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
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
        public void updateServiceLocation() throws android.os.RemoteException {}
        public void updateServiceLocationWithPackageName(java.lang.String p0) throws android.os.RemoteException {}
        public void enableLocationUpdates() throws android.os.RemoteException {}
        public void disableLocationUpdates() throws android.os.RemoteException {}
        public boolean enableDataConnectivity() throws android.os.RemoteException { return false; }
        public boolean disableDataConnectivity() throws android.os.RemoteException { return false; }
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
        public int requestNetworkScan(int p0, android.telephony.NetworkScanRequest p1, android.os.Messenger p2, android.os.IBinder p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException { return 0; }
        public void stopNetworkScan(int p0, int p1) throws android.os.RemoteException {}
        public boolean setNetworkSelectionModeManual(int p0, com.android.internal.telephony.OperatorInfo p1, boolean p2) throws android.os.RemoteException { return false; }
        public long getAllowedNetworkTypesForReason(int p0, int p1) throws android.os.RemoteException { return 0L; }
        public boolean setAllowedNetworkTypesForReason(int p0, int p1, long p2) throws android.os.RemoteException { return false; }
        public boolean getDataEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserDataEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isDataEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setDataEnabledForReason(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public boolean isDataEnabledForReason(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isManualNetworkSelectionAllowed(int p0) throws android.os.RemoteException { return false; }
        public void setAlwaysReportSignalStrength(int p0, boolean p1) throws android.os.RemoteException {}
        public java.lang.String[] getPcscfAddress(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
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
        public java.lang.String getTypeAllocationCodeForSlot(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getMeidForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getManufacturerCodeForSlot(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getDeviceSoftwareVersionForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public int getSubIdForPhoneAccount(android.telecom.PhoneAccount p0) throws android.os.RemoteException { return 0; }
        public int getSubIdForPhoneAccountHandle(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public android.telecom.PhoneAccountHandle getPhoneAccountHandleForSubscriptionId(int p0) throws android.os.RemoteException { return null; }
        public void factoryReset(int p0) throws android.os.RemoteException {}
        public java.lang.String getSimLocaleForSubscriber(int p0) throws android.os.RemoteException { return null; }
        public void requestModemActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public android.telephony.ServiceState getServiceStateForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
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
        public android.telephony.UiccSlotInfo[] getUiccSlotsInfo() throws android.os.RemoteException { return null; }
        public boolean switchSlots(int[] p0) throws android.os.RemoteException { return false; }
        public boolean isDataRoamingEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setDataRoamingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public int getCdmaRoamingMode(int p0) throws android.os.RemoteException { return 0; }
        public boolean setCdmaRoamingMode(int p0, int p1) throws android.os.RemoteException { return false; }
        public int getCdmaSubscriptionMode(int p0) throws android.os.RemoteException { return 0; }
        public boolean setCdmaSubscriptionMode(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setCarrierTestOverride(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) throws android.os.RemoteException {}
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
        public void setImsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
        public boolean getImsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean getRcsProvisioningStatusForCapability(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setRcsProvisioningStatusForCapability(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public boolean isMmTelCapabilityProvisionedInCache(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void cacheMmTelCapabilityProvisioning(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
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
        public int[] getSlotsMapping() throws android.os.RemoteException { return null; }
        public int getRadioHalVersion() throws android.os.RemoteException { return 0; }
        public java.lang.String getCurrentPackageName() throws android.os.RemoteException { return null; }
        public boolean isApplicationOnUicc(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isModemEnabledForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isDataEnabledForApn(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isApnMetered(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setSystemSelectionChannels(java.util.List<android.telephony.RadioAccessSpecifier> p0, int p1, com.android.internal.telephony.IBooleanConsumer p2) throws android.os.RemoteException {}
        public java.util.List<android.telephony.RadioAccessSpecifier> getSystemSelectionChannels(int p0) throws android.os.RemoteException { return null; }
        public boolean isMvnoMatched(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void enqueueSmsPickResult(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
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
        static final int TRANSACTION_updateServiceLocation = 21;
        static final int TRANSACTION_updateServiceLocationWithPackageName = 22;
        static final int TRANSACTION_enableLocationUpdates = 23;
        static final int TRANSACTION_disableLocationUpdates = 24;
        static final int TRANSACTION_enableDataConnectivity = 25;
        static final int TRANSACTION_disableDataConnectivity = 26;
        static final int TRANSACTION_isDataConnectivityPossible = 27;
        static final int TRANSACTION_getCellLocation = 28;
        static final int TRANSACTION_getNetworkCountryIsoForPhone = 29;
        static final int TRANSACTION_getNeighboringCellInfo = 30;
        static final int TRANSACTION_getCallState = 31;
        static final int TRANSACTION_getCallStateForSubscription = 32;
        static final int TRANSACTION_getDataActivity = 33;
        static final int TRANSACTION_getDataActivityForSubId = 34;
        static final int TRANSACTION_getDataState = 35;
        static final int TRANSACTION_getDataStateForSubId = 36;
        static final int TRANSACTION_getActivePhoneType = 37;
        static final int TRANSACTION_getActivePhoneTypeForSlot = 38;
        static final int TRANSACTION_getCdmaEriIconIndex = 39;
        static final int TRANSACTION_getCdmaEriIconIndexForSubscriber = 40;
        static final int TRANSACTION_getCdmaEriIconMode = 41;
        static final int TRANSACTION_getCdmaEriIconModeForSubscriber = 42;
        static final int TRANSACTION_getCdmaEriText = 43;
        static final int TRANSACTION_getCdmaEriTextForSubscriber = 44;
        static final int TRANSACTION_needsOtaServiceProvisioning = 45;
        static final int TRANSACTION_setVoiceMailNumber = 46;
        static final int TRANSACTION_setVoiceActivationState = 47;
        static final int TRANSACTION_setDataActivationState = 48;
        static final int TRANSACTION_getVoiceActivationState = 49;
        static final int TRANSACTION_getDataActivationState = 50;
        static final int TRANSACTION_getVoiceMessageCountForSubscriber = 51;
        static final int TRANSACTION_isConcurrentVoiceAndDataAllowed = 52;
        static final int TRANSACTION_getVisualVoicemailSettings = 53;
        static final int TRANSACTION_getVisualVoicemailPackageName = 54;
        static final int TRANSACTION_enableVisualVoicemailSmsFilter = 55;
        static final int TRANSACTION_disableVisualVoicemailSmsFilter = 56;
        static final int TRANSACTION_getVisualVoicemailSmsFilterSettings = 57;
        static final int TRANSACTION_getActiveVisualVoicemailSmsFilterSettings = 58;
        static final int TRANSACTION_sendVisualVoicemailSmsForSubscriber = 59;
        static final int TRANSACTION_sendDialerSpecialCode = 60;
        static final int TRANSACTION_getNetworkTypeForSubscriber = 61;
        static final int TRANSACTION_getDataNetworkType = 62;
        static final int TRANSACTION_getDataNetworkTypeForSubscriber = 63;
        static final int TRANSACTION_getVoiceNetworkTypeForSubscriber = 64;
        static final int TRANSACTION_hasIccCard = 65;
        static final int TRANSACTION_hasIccCardUsingSlotIndex = 66;
        static final int TRANSACTION_getLteOnCdmaMode = 67;
        static final int TRANSACTION_getLteOnCdmaModeForSubscriber = 68;
        static final int TRANSACTION_getAllCellInfo = 69;
        static final int TRANSACTION_requestCellInfoUpdate = 70;
        static final int TRANSACTION_requestCellInfoUpdateWithWorkSource = 71;
        static final int TRANSACTION_setCellInfoListRate = 72;
        static final int TRANSACTION_iccOpenLogicalChannelBySlot = 73;
        static final int TRANSACTION_iccOpenLogicalChannel = 74;
        static final int TRANSACTION_iccCloseLogicalChannelBySlot = 75;
        static final int TRANSACTION_iccCloseLogicalChannel = 76;
        static final int TRANSACTION_iccTransmitApduLogicalChannelBySlot = 77;
        static final int TRANSACTION_iccTransmitApduLogicalChannel = 78;
        static final int TRANSACTION_iccTransmitApduBasicChannelBySlot = 79;
        static final int TRANSACTION_iccTransmitApduBasicChannel = 80;
        static final int TRANSACTION_iccExchangeSimIO = 81;
        static final int TRANSACTION_sendEnvelopeWithStatus = 82;
        static final int TRANSACTION_nvReadItem = 83;
        static final int TRANSACTION_nvWriteItem = 84;
        static final int TRANSACTION_nvWriteCdmaPrl = 85;
        static final int TRANSACTION_resetModemConfig = 86;
        static final int TRANSACTION_rebootModem = 87;
        static final int TRANSACTION_getAllowedNetworkTypesBitmask = 88;
        static final int TRANSACTION_isTetheringApnRequiredForSubscriber = 89;
        static final int TRANSACTION_enableIms = 90;
        static final int TRANSACTION_disableIms = 91;
        static final int TRANSACTION_resetIms = 92;
        static final int TRANSACTION_registerMmTelFeatureCallback = 93;
        static final int TRANSACTION_unregisterImsFeatureCallback = 94;
        static final int TRANSACTION_getImsRegistration = 95;
        static final int TRANSACTION_getImsConfig = 96;
        static final int TRANSACTION_setBoundImsServiceOverride = 97;
        static final int TRANSACTION_clearCarrierImsServiceOverride = 98;
        static final int TRANSACTION_getBoundImsServicePackage = 99;
        static final int TRANSACTION_getImsMmTelFeatureState = 100;
        static final int TRANSACTION_setNetworkSelectionModeAutomatic = 101;
        static final int TRANSACTION_getCellNetworkScanResults = 102;
        static final int TRANSACTION_requestNetworkScan = 103;
        static final int TRANSACTION_stopNetworkScan = 104;
        static final int TRANSACTION_setNetworkSelectionModeManual = 105;
        static final int TRANSACTION_getAllowedNetworkTypesForReason = 106;
        static final int TRANSACTION_setAllowedNetworkTypesForReason = 107;
        static final int TRANSACTION_getDataEnabled = 108;
        static final int TRANSACTION_isUserDataEnabled = 109;
        static final int TRANSACTION_isDataEnabled = 110;
        static final int TRANSACTION_setDataEnabledForReason = 111;
        static final int TRANSACTION_isDataEnabledForReason = 112;
        static final int TRANSACTION_isManualNetworkSelectionAllowed = 113;
        static final int TRANSACTION_setAlwaysReportSignalStrength = 114;
        static final int TRANSACTION_getPcscfAddress = 115;
        static final int TRANSACTION_setImsRegistrationState = 116;
        static final int TRANSACTION_getCdmaMdn = 117;
        static final int TRANSACTION_getCdmaMin = 118;
        static final int TRANSACTION_requestNumberVerification = 119;
        static final int TRANSACTION_getCarrierPrivilegeStatus = 120;
        static final int TRANSACTION_getCarrierPrivilegeStatusForUid = 121;
        static final int TRANSACTION_checkCarrierPrivilegesForPackage = 122;
        static final int TRANSACTION_checkCarrierPrivilegesForPackageAnyPhone = 123;
        static final int TRANSACTION_getCarrierPackageNamesForIntentAndPhone = 124;
        static final int TRANSACTION_setLine1NumberForDisplayForSubscriber = 125;
        static final int TRANSACTION_getLine1NumberForDisplay = 126;
        static final int TRANSACTION_getLine1AlphaTagForDisplay = 127;
        static final int TRANSACTION_getMergedSubscriberIds = 128;
        static final int TRANSACTION_getMergedImsisFromGroup = 129;
        static final int TRANSACTION_setOperatorBrandOverride = 130;
        static final int TRANSACTION_setRoamingOverride = 131;
        static final int TRANSACTION_invokeOemRilRequestRaw = 132;
        static final int TRANSACTION_needMobileRadioShutdown = 133;
        static final int TRANSACTION_shutdownMobileRadios = 134;
        static final int TRANSACTION_getRadioAccessFamily = 135;
        static final int TRANSACTION_uploadCallComposerPicture = 136;
        static final int TRANSACTION_enableVideoCalling = 137;
        static final int TRANSACTION_isVideoCallingEnabled = 138;
        static final int TRANSACTION_canChangeDtmfToneLength = 139;
        static final int TRANSACTION_isWorldPhone = 140;
        static final int TRANSACTION_isTtyModeSupported = 141;
        static final int TRANSACTION_isRttSupported = 142;
        static final int TRANSACTION_isHearingAidCompatibilitySupported = 143;
        static final int TRANSACTION_isImsRegistered = 144;
        static final int TRANSACTION_isWifiCallingAvailable = 145;
        static final int TRANSACTION_isVideoTelephonyAvailable = 146;
        static final int TRANSACTION_getImsRegTechnologyForMmTel = 147;
        static final int TRANSACTION_getDeviceId = 148;
        static final int TRANSACTION_getDeviceIdWithFeature = 149;
        static final int TRANSACTION_getImeiForSlot = 150;
        static final int TRANSACTION_getTypeAllocationCodeForSlot = 151;
        static final int TRANSACTION_getMeidForSlot = 152;
        static final int TRANSACTION_getManufacturerCodeForSlot = 153;
        static final int TRANSACTION_getDeviceSoftwareVersionForSlot = 154;
        static final int TRANSACTION_getSubIdForPhoneAccount = 155;
        static final int TRANSACTION_getSubIdForPhoneAccountHandle = 156;
        static final int TRANSACTION_getPhoneAccountHandleForSubscriptionId = 157;
        static final int TRANSACTION_factoryReset = 158;
        static final int TRANSACTION_getSimLocaleForSubscriber = 159;
        static final int TRANSACTION_requestModemActivityInfo = 160;
        static final int TRANSACTION_getServiceStateForSubscriber = 161;
        static final int TRANSACTION_getVoicemailRingtoneUri = 162;
        static final int TRANSACTION_setVoicemailRingtoneUri = 163;
        static final int TRANSACTION_isVoicemailVibrationEnabled = 164;
        static final int TRANSACTION_setVoicemailVibrationEnabled = 165;
        static final int TRANSACTION_getPackagesWithCarrierPrivileges = 166;
        static final int TRANSACTION_getPackagesWithCarrierPrivilegesForAllPhones = 167;
        static final int TRANSACTION_getAidForAppType = 168;
        static final int TRANSACTION_getEsn = 169;
        static final int TRANSACTION_getCdmaPrlVersion = 170;
        static final int TRANSACTION_getTelephonyHistograms = 171;
        static final int TRANSACTION_setAllowedCarriers = 172;
        static final int TRANSACTION_getAllowedCarriers = 173;
        static final int TRANSACTION_getSubscriptionCarrierId = 174;
        static final int TRANSACTION_getSubscriptionCarrierName = 175;
        static final int TRANSACTION_getSubscriptionSpecificCarrierId = 176;
        static final int TRANSACTION_getSubscriptionSpecificCarrierName = 177;
        static final int TRANSACTION_getCarrierIdFromMccMnc = 178;
        static final int TRANSACTION_carrierActionSetRadioEnabled = 179;
        static final int TRANSACTION_carrierActionReportDefaultNetworkStatus = 180;
        static final int TRANSACTION_carrierActionResetAll = 181;
        static final int TRANSACTION_getCallForwarding = 182;
        static final int TRANSACTION_setCallForwarding = 183;
        static final int TRANSACTION_getCallWaitingStatus = 184;
        static final int TRANSACTION_setCallWaitingStatus = 185;
        static final int TRANSACTION_getClientRequestStats = 186;
        static final int TRANSACTION_setSimPowerStateForSlot = 187;
        static final int TRANSACTION_setSimPowerStateForSlotWithCallback = 188;
        static final int TRANSACTION_getForbiddenPlmns = 189;
        static final int TRANSACTION_setForbiddenPlmns = 190;
        static final int TRANSACTION_getEmergencyCallbackMode = 191;
        static final int TRANSACTION_getSignalStrength = 192;
        static final int TRANSACTION_getCardIdForDefaultEuicc = 193;
        static final int TRANSACTION_getUiccCardsInfo = 194;
        static final int TRANSACTION_getUiccSlotsInfo = 195;
        static final int TRANSACTION_switchSlots = 196;
        static final int TRANSACTION_isDataRoamingEnabled = 197;
        static final int TRANSACTION_setDataRoamingEnabled = 198;
        static final int TRANSACTION_getCdmaRoamingMode = 199;
        static final int TRANSACTION_setCdmaRoamingMode = 200;
        static final int TRANSACTION_getCdmaSubscriptionMode = 201;
        static final int TRANSACTION_setCdmaSubscriptionMode = 202;
        static final int TRANSACTION_setCarrierTestOverride = 203;
        static final int TRANSACTION_getCarrierIdListVersion = 204;
        static final int TRANSACTION_refreshUiccProfile = 205;
        static final int TRANSACTION_getNumberOfModemsWithSimultaneousDataConnections = 206;
        static final int TRANSACTION_getNetworkSelectionMode = 207;
        static final int TRANSACTION_isInEmergencySmsMode = 208;
        static final int TRANSACTION_getRadioPowerState = 209;
        static final int TRANSACTION_registerImsRegistrationCallback = 210;
        static final int TRANSACTION_unregisterImsRegistrationCallback = 211;
        static final int TRANSACTION_getImsMmTelRegistrationState = 212;
        static final int TRANSACTION_getImsMmTelRegistrationTransportType = 213;
        static final int TRANSACTION_registerMmTelCapabilityCallback = 214;
        static final int TRANSACTION_unregisterMmTelCapabilityCallback = 215;
        static final int TRANSACTION_isCapable = 216;
        static final int TRANSACTION_isAvailable = 217;
        static final int TRANSACTION_isMmTelCapabilitySupported = 218;
        static final int TRANSACTION_isAdvancedCallingSettingEnabled = 219;
        static final int TRANSACTION_setAdvancedCallingSettingEnabled = 220;
        static final int TRANSACTION_isVtSettingEnabled = 221;
        static final int TRANSACTION_setVtSettingEnabled = 222;
        static final int TRANSACTION_isVoWiFiSettingEnabled = 223;
        static final int TRANSACTION_setVoWiFiSettingEnabled = 224;
        static final int TRANSACTION_isCrossSimCallingEnabledByUser = 225;
        static final int TRANSACTION_setCrossSimCallingEnabled = 226;
        static final int TRANSACTION_isVoWiFiRoamingSettingEnabled = 227;
        static final int TRANSACTION_setVoWiFiRoamingSettingEnabled = 228;
        static final int TRANSACTION_setVoWiFiNonPersistent = 229;
        static final int TRANSACTION_getVoWiFiModeSetting = 230;
        static final int TRANSACTION_setVoWiFiModeSetting = 231;
        static final int TRANSACTION_getVoWiFiRoamingModeSetting = 232;
        static final int TRANSACTION_setVoWiFiRoamingModeSetting = 233;
        static final int TRANSACTION_setRttCapabilitySetting = 234;
        static final int TRANSACTION_isTtyOverVolteEnabled = 235;
        static final int TRANSACTION_getEmergencyNumberList = 236;
        static final int TRANSACTION_isEmergencyNumber = 237;
        static final int TRANSACTION_getCertsFromCarrierPrivilegeAccessRules = 238;
        static final int TRANSACTION_registerImsProvisioningChangedCallback = 239;
        static final int TRANSACTION_unregisterImsProvisioningChangedCallback = 240;
        static final int TRANSACTION_setImsProvisioningStatusForCapability = 241;
        static final int TRANSACTION_getImsProvisioningStatusForCapability = 242;
        static final int TRANSACTION_getRcsProvisioningStatusForCapability = 243;
        static final int TRANSACTION_setRcsProvisioningStatusForCapability = 244;
        static final int TRANSACTION_isMmTelCapabilityProvisionedInCache = 245;
        static final int TRANSACTION_cacheMmTelCapabilityProvisioning = 246;
        static final int TRANSACTION_getImsProvisioningInt = 247;
        static final int TRANSACTION_getImsProvisioningString = 248;
        static final int TRANSACTION_setImsProvisioningInt = 249;
        static final int TRANSACTION_setImsProvisioningString = 250;
        static final int TRANSACTION_startEmergencyCallbackMode = 251;
        static final int TRANSACTION_updateEmergencyNumberListTestMode = 252;
        static final int TRANSACTION_getEmergencyNumberListTestMode = 253;
        static final int TRANSACTION_getEmergencyNumberDbVersion = 254;
        static final int TRANSACTION_notifyOtaEmergencyNumberDbInstalled = 255;
        static final int TRANSACTION_updateOtaEmergencyNumberDbFilePath = 256;
        static final int TRANSACTION_resetOtaEmergencyNumberDbFilePath = 257;
        static final int TRANSACTION_enableModemForSlot = 258;
        static final int TRANSACTION_setMultiSimCarrierRestriction = 259;
        static final int TRANSACTION_isMultiSimSupported = 260;
        static final int TRANSACTION_switchMultiSimConfig = 261;
        static final int TRANSACTION_doesSwitchMultiSimConfigTriggerReboot = 262;
        static final int TRANSACTION_getSlotsMapping = 263;
        static final int TRANSACTION_getRadioHalVersion = 264;
        static final int TRANSACTION_getCurrentPackageName = 265;
        static final int TRANSACTION_isApplicationOnUicc = 266;
        static final int TRANSACTION_isModemEnabledForSlot = 267;
        static final int TRANSACTION_isDataEnabledForApn = 268;
        static final int TRANSACTION_isApnMetered = 269;
        static final int TRANSACTION_setSystemSelectionChannels = 270;
        static final int TRANSACTION_getSystemSelectionChannels = 271;
        static final int TRANSACTION_isMvnoMatched = 272;
        static final int TRANSACTION_enqueueSmsPickResult = 273;
        static final int TRANSACTION_getMmsUserAgent = 274;
        static final int TRANSACTION_getMmsUAProfUrl = 275;
        static final int TRANSACTION_setMobileDataPolicyEnabled = 276;
        static final int TRANSACTION_isMobileDataPolicyEnabled = 277;
        static final int TRANSACTION_setCepEnabled = 278;
        static final int TRANSACTION_notifyRcsAutoConfigurationReceived = 279;
        static final int TRANSACTION_isIccLockEnabled = 280;
        static final int TRANSACTION_setIccLockEnabled = 281;
        static final int TRANSACTION_changeIccLockPassword = 282;
        static final int TRANSACTION_requestUserActivityNotification = 283;
        static final int TRANSACTION_userActivity = 284;
        static final int TRANSACTION_getManualNetworkSelectionPlmn = 285;
        static final int TRANSACTION_canConnectTo5GInDsdsMode = 286;
        static final int TRANSACTION_getEquivalentHomePlmns = 287;
        static final int TRANSACTION_setNrDualConnectivityState = 288;
        static final int TRANSACTION_isNrDualConnectivityEnabled = 289;
        static final int TRANSACTION_isRadioInterfaceCapabilitySupported = 290;
        static final int TRANSACTION_sendThermalMitigationRequest = 291;
        static final int TRANSACTION_bootstrapAuthenticationRequest = 292;
        static final int TRANSACTION_setBoundGbaServiceOverride = 293;
        static final int TRANSACTION_getBoundGbaService = 294;
        static final int TRANSACTION_setGbaReleaseTimeOverride = 295;
        static final int TRANSACTION_getGbaReleaseTime = 296;
        static final int TRANSACTION_setRcsClientConfiguration = 297;
        static final int TRANSACTION_isRcsVolteSingleRegistrationCapable = 298;
        static final int TRANSACTION_registerRcsProvisioningCallback = 299;
        static final int TRANSACTION_unregisterRcsProvisioningCallback = 300;
        static final int TRANSACTION_triggerRcsReconfiguration = 301;
        static final int TRANSACTION_setRcsSingleRegistrationTestModeEnabled = 302;
        static final int TRANSACTION_getRcsSingleRegistrationTestModeEnabled = 303;
        static final int TRANSACTION_setDeviceSingleRegistrationEnabledOverride = 304;
        static final int TRANSACTION_getDeviceSingleRegistrationEnabled = 305;
        static final int TRANSACTION_setCarrierSingleRegistrationEnabledOverride = 306;
        static final int TRANSACTION_sendDeviceToDeviceMessage = 307;
        static final int TRANSACTION_setActiveDeviceToDeviceTransport = 308;
        static final int TRANSACTION_setDeviceToDeviceForceEnabled = 309;
        static final int TRANSACTION_getCarrierSingleRegistrationEnabled = 310;
        static final int TRANSACTION_setImsFeatureValidationOverride = 311;
        static final int TRANSACTION_getImsFeatureValidationOverride = 312;
        static final int TRANSACTION_getMobileProvisioningUrl = 313;
        static final int TRANSACTION_removeContactFromEab = 314;
        static final int TRANSACTION_getContactFromEab = 315;
        static final int TRANSACTION_getCapabilityFromEab = 316;
        static final int TRANSACTION_getDeviceUceEnabled = 317;
        static final int TRANSACTION_setDeviceUceEnabled = 318;
        static final int TRANSACTION_addUceRegistrationOverrideShell = 319;
        static final int TRANSACTION_removeUceRegistrationOverrideShell = 320;
        static final int TRANSACTION_clearUceRegistrationOverrideShell = 321;
        static final int TRANSACTION_getLatestRcsContactUceCapabilityShell = 322;
        static final int TRANSACTION_getLastUcePidfXmlShell = 323;
        static final int TRANSACTION_removeUceRequestDisallowedStatus = 324;
        static final int TRANSACTION_setCapabilitiesRequestTimeout = 325;
        static final int TRANSACTION_setSignalStrengthUpdateRequest = 326;
        static final int TRANSACTION_clearSignalStrengthUpdateRequest = 327;
        static final int TRANSACTION_getPhoneCapability = 328;
        static final int TRANSACTION_prepareForUnattendedReboot = 329;
        static final int TRANSACTION_getSlicingConfig = 330;
        public Stub() { super(); }
        public static com.android.internal.telephony.ITelephony asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        private boolean onTransact$sendVisualVoicemailSmsForSubscriber$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestCellInfoUpdate$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestCellInfoUpdateWithWorkSource$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$iccOpenLogicalChannelBySlot$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$iccOpenLogicalChannel$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$iccTransmitApduLogicalChannelBySlot$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$iccTransmitApduLogicalChannel$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$iccTransmitApduBasicChannelBySlot$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$iccTransmitApduBasicChannel$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$iccExchangeSimIO$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setBoundImsServiceOverride$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestNetworkScan$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestNumberVerification$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setRoamingOverride$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$uploadCallComposerPicture$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getServiceStateForSubscriber$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setVoicemailRingtoneUri$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setVoicemailVibrationEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getCarrierIdFromMccMnc$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getCallForwarding$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setCallForwarding$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setCallWaitingStatus$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getClientRequestStats$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSimPowerStateForSlotWithCallback$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getForbiddenPlmns$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setForbiddenPlmns$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setCarrierTestOverride$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getNumberOfModemsWithSimultaneousDataConnections$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getRadioPowerState$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isCapable$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isAvailable$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isMmTelCapabilitySupported$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setVoWiFiNonPersistent$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setImsProvisioningStatusForCapability$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getImsProvisioningStatusForCapability$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setRcsProvisioningStatusForCapability$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isMmTelCapabilityProvisionedInCache$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$cacheMmTelCapabilityProvisioning$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setImsProvisioningInt$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setImsProvisioningString$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$doesSwitchMultiSimConfigTriggerReboot$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isModemEnabledForSlot$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isDataEnabledForApn$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSystemSelectionChannels$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isMvnoMatched$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$enqueueSmsPickResult$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setMobileDataPolicyEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$notifyRcsAutoConfigurationReceived$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setIccLockEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$changeIccLockPassword$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getEquivalentHomePlmns$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$sendThermalMitigationRequest$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$bootstrapAuthenticationRequest$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSignalStrengthUpdateRequest$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$clearSignalStrengthUpdateRequest$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
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
            public void updateServiceLocation() throws android.os.RemoteException {}
            public void updateServiceLocationWithPackageName(java.lang.String p0) throws android.os.RemoteException {}
            public void enableLocationUpdates() throws android.os.RemoteException {}
            public void disableLocationUpdates() throws android.os.RemoteException {}
            public boolean enableDataConnectivity() throws android.os.RemoteException { return false; }
            public boolean disableDataConnectivity() throws android.os.RemoteException { return false; }
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
            public int requestNetworkScan(int p0, android.telephony.NetworkScanRequest p1, android.os.Messenger p2, android.os.IBinder p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException { return 0; }
            public void stopNetworkScan(int p0, int p1) throws android.os.RemoteException {}
            public boolean setNetworkSelectionModeManual(int p0, com.android.internal.telephony.OperatorInfo p1, boolean p2) throws android.os.RemoteException { return false; }
            public long getAllowedNetworkTypesForReason(int p0, int p1) throws android.os.RemoteException { return 0L; }
            public boolean setAllowedNetworkTypesForReason(int p0, int p1, long p2) throws android.os.RemoteException { return false; }
            public boolean getDataEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserDataEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isDataEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setDataEnabledForReason(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public boolean isDataEnabledForReason(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isManualNetworkSelectionAllowed(int p0) throws android.os.RemoteException { return false; }
            public void setAlwaysReportSignalStrength(int p0, boolean p1) throws android.os.RemoteException {}
            public java.lang.String[] getPcscfAddress(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
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
            public java.lang.String getTypeAllocationCodeForSlot(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getMeidForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getManufacturerCodeForSlot(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getDeviceSoftwareVersionForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public int getSubIdForPhoneAccount(android.telecom.PhoneAccount p0) throws android.os.RemoteException { return 0; }
            public int getSubIdForPhoneAccountHandle(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public android.telecom.PhoneAccountHandle getPhoneAccountHandleForSubscriptionId(int p0) throws android.os.RemoteException { return null; }
            public void factoryReset(int p0) throws android.os.RemoteException {}
            public java.lang.String getSimLocaleForSubscriber(int p0) throws android.os.RemoteException { return null; }
            public void requestModemActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public android.telephony.ServiceState getServiceStateForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
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
            public android.telephony.UiccSlotInfo[] getUiccSlotsInfo() throws android.os.RemoteException { return null; }
            public boolean switchSlots(int[] p0) throws android.os.RemoteException { return false; }
            public boolean isDataRoamingEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setDataRoamingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public int getCdmaRoamingMode(int p0) throws android.os.RemoteException { return 0; }
            public boolean setCdmaRoamingMode(int p0, int p1) throws android.os.RemoteException { return false; }
            public int getCdmaSubscriptionMode(int p0) throws android.os.RemoteException { return 0; }
            public boolean setCdmaSubscriptionMode(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setCarrierTestOverride(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) throws android.os.RemoteException {}
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
            public void setImsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
            public boolean getImsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean getRcsProvisioningStatusForCapability(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setRcsProvisioningStatusForCapability(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public boolean isMmTelCapabilityProvisionedInCache(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void cacheMmTelCapabilityProvisioning(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
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
            public int[] getSlotsMapping() throws android.os.RemoteException { return null; }
            public int getRadioHalVersion() throws android.os.RemoteException { return 0; }
            public java.lang.String getCurrentPackageName() throws android.os.RemoteException { return null; }
            public boolean isApplicationOnUicc(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isModemEnabledForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isDataEnabledForApn(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isApnMetered(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setSystemSelectionChannels(java.util.List<android.telephony.RadioAccessSpecifier> p0, int p1, com.android.internal.telephony.IBooleanConsumer p2) throws android.os.RemoteException {}
            public java.util.List<android.telephony.RadioAccessSpecifier> getSystemSelectionChannels(int p0) throws android.os.RemoteException { return null; }
            public boolean isMvnoMatched(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void enqueueSmsPickResult(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
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
        }
    }
}
