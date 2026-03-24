package com.android.internal.telephony.imsphone;

abstract class ImsPhoneBase extends com.android.internal.telephony.Phone {
    public ImsPhoneBase(java.lang.String p0, android.content.Context p1, com.android.internal.telephony.PhoneNotifier p2, boolean p3) { super((java.lang.String)null, (com.android.internal.telephony.PhoneNotifier)null, (android.content.Context)null, (com.android.internal.telephony.CommandsInterface)null, false); }
    public void migrateFrom(com.android.internal.telephony.Phone p0) {}
    public void registerForRingbackTone(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForRingbackTone(android.os.Handler p0) {}
    public void startRingbackTone() {}
    public void stopRingbackTone() {}
    public void registerForOnHoldTone(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForOnHoldTone(android.os.Handler p0) {}
    public void startOnHoldTone(com.android.internal.telephony.Connection p0) {}
    protected void stopOnHoldTone(com.android.internal.telephony.Connection p0) {}
    public void registerForTtyModeReceived(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForTtyModeReceived(android.os.Handler p0) {}
    public void onTtyModeReceived(int p0) {}
    public void onCallQualityChanged(android.telephony.CallQuality p0, int p1) {}
    public void onMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0) {}
    public android.telephony.ServiceState getServiceState() { return null; }
    public com.android.internal.telephony.PhoneConstants.State getState() { return null; }
    public int getPhoneType() { return 0; }
    public android.telephony.SignalStrength getSignalStrength() { return null; }
    public boolean getMessageWaitingIndicator() { return false; }
    public java.util.List<? extends com.android.internal.telephony.MmiCode> getPendingMmiCodes() { return null; }
    public int getDataActivityState() { return 0; }
    public void notifyPhoneStateChanged() {}
    public void notifyPreciseCallStateChanged() {}
    public void notifyPreciseCallStateToNotifier() {}
    public void notifyDisconnect(com.android.internal.telephony.Connection p0) {}
    public void notifyImsReason(android.telephony.ims.ImsReasonInfo p0) {}
    void notifyUnknownConnection() {}
    public void notifySuppServiceFailed(com.android.internal.telephony.PhoneInternalInterface.SuppService p0) {}
    void notifyServiceStateChanged(android.telephony.ServiceState p0) {}
    public void notifyCallForwardingIndicator() {}
    public boolean canDial() { return false; }
    public boolean handleInCallMmiCommands(java.lang.String p0) { return false; }
    boolean isInCall() { return false; }
    public boolean handlePinMmi(java.lang.String p0) { return false; }
    public void sendUssdResponse(java.lang.String p0) {}
    public void registerForSuppServiceNotification(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSuppServiceNotification(android.os.Handler p0) {}
    public void setRadioPower(boolean p0) {}
    public java.lang.String getVoiceMailNumber() { return null; }
    public java.lang.String getVoiceMailAlphaTag() { return null; }
    public java.lang.String getDeviceId() { return null; }
    public java.lang.String getDeviceSvn() { return null; }
    public java.lang.String getImei() { return null; }
    public int getImeiType() { return 0; }
    public java.lang.String getEsn() { return null; }
    public java.lang.String getMeid() { return null; }
    public java.lang.String getSubscriberId() { return null; }
    public java.lang.String getGroupIdLevel1() { return null; }
    public java.lang.String getGroupIdLevel2() { return null; }
    public java.lang.String getIccSerialNumber() { return null; }
    public java.lang.String getLine1AlphaTag() { return null; }
    public boolean setLine1Number(java.lang.String p0, java.lang.String p1, android.os.Message p2) { return false; }
    public void setVoiceMailNumber(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void getCallForwardingOption(int p0, android.os.Message p1) {}
    public void getCallForwardingOption(int p0, int p1, android.os.Message p2) {}
    public void setCallForwardingOption(int p0, int p1, java.lang.String p2, int p3, android.os.Message p4) {}
    public void setCallForwardingOption(int p0, int p1, java.lang.String p2, int p3, int p4, android.os.Message p5) {}
    public void getOutgoingCallerIdDisplay(android.os.Message p0) {}
    public void setOutgoingCallerIdDisplay(int p0, android.os.Message p1) {}
    public void getCallWaiting(android.os.Message p0) {}
    public void setCallWaiting(boolean p0, android.os.Message p1) {}
    public boolean getIccRecordsLoaded() { return false; }
    public com.android.internal.telephony.IccCard getIccCard() { return null; }
    public void getAvailableNetworks(android.os.Message p0) {}
    public void startNetworkScan(android.telephony.NetworkScanRequest p0, android.os.Message p1) {}
    public void stopNetworkScan(android.os.Message p0) {}
    public void setNetworkSelectionModeAutomatic(android.os.Message p0) {}
    public void selectNetworkManually(com.android.internal.telephony.OperatorInfo p0, boolean p1, android.os.Message p2) {}
    public void updateServiceLocation() {}
    public void enableLocationUpdates() {}
    public void disableLocationUpdates() {}
    public boolean getDataRoamingEnabled() { return false; }
    public void setDataRoamingEnabled(boolean p0) {}
    public boolean isUserDataEnabled() { return false; }
    public boolean enableDataConnectivity() { return false; }
    public boolean disableDataConnectivity() { return false; }
    public boolean isDataAllowed() { return false; }
    public com.android.internal.telephony.IccPhoneBookInterfaceManager getIccPhoneBookInterfaceManager() { return null; }
    public com.android.internal.telephony.uicc.IccFileHandler getIccFileHandler() { return null; }
    public void activateCellBroadcastSms(int p0, android.os.Message p1) {}
    public void getCellBroadcastSmsConfig(android.os.Message p0) {}
    public void setCellBroadcastSmsConfig(int[] p0, android.os.Message p1) {}
    public boolean needsOtaServiceProvisioning() { return false; }
    public void getCallBarring(java.lang.String p0, java.lang.String p1, android.os.Message p2, int p3) {}
    public void setCallBarring(java.lang.String p0, boolean p1, java.lang.String p2, android.os.Message p3, int p4) {}
    protected void onUpdateIccAvailability() {}
    void updatePhoneState() {}
    public int getTerminalBasedCallWaitingState(boolean p0) { return 0; }
    public void setTerminalBasedCallWaitingSupported(boolean p0) {}
}
