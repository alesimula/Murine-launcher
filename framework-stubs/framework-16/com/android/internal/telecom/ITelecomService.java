package com.android.internal.telecom;

public interface ITelecomService extends android.os.IInterface {
    public void showInCallScreen(boolean p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.telecom.PhoneAccountHandle getDefaultOutgoingPhoneAccount(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.telecom.PhoneAccountHandle getUserSelectedOutgoingPhoneAccount(java.lang.String p0) throws android.os.RemoteException;
    public void setUserSelectedOutgoingPhoneAccount(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getCallCapablePhoneAccounts(boolean p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getSelfManagedPhoneAccounts(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getOwnSelfManagedPhoneAccounts(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getPhoneAccountsSupportingScheme(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getPhoneAccountsForPackage(java.lang.String p0) throws android.os.RemoteException;
    public android.telecom.PhoneAccount getPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.telecom.PhoneAccount> getRegisteredPhoneAccounts(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getAllPhoneAccountsCount() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.telecom.PhoneAccount> getAllPhoneAccounts() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getAllPhoneAccountHandles() throws android.os.RemoteException;
    public android.telecom.PhoneAccountHandle getSimCallManager(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telecom.PhoneAccountHandle getSimCallManagerForUser(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerPhoneAccount(android.telecom.PhoneAccount p0, java.lang.String p1) throws android.os.RemoteException;
    public void unregisterPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public void clearAccounts(java.lang.String p0) throws android.os.RemoteException;
    public boolean isVoiceMailNumber(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public java.lang.String getVoiceMailNumber(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getLine1Number(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.content.ComponentName getDefaultPhoneApp() throws android.os.RemoteException;
    public java.lang.String getDefaultDialerPackage(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getDefaultDialerPackageForUser(int p0) throws android.os.RemoteException;
    public java.lang.String getSystemDialerPackage(java.lang.String p0) throws android.os.RemoteException;
    public android.telecom.TelecomAnalytics dumpCallAnalytics() throws android.os.RemoteException;
    public void silenceRinger(java.lang.String p0) throws android.os.RemoteException;
    public boolean isInCall(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean hasManageOngoingCallsPermission(java.lang.String p0) throws android.os.RemoteException;
    public boolean isInManagedCall(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isRinging(java.lang.String p0) throws android.os.RemoteException;
    public int getCallState() throws android.os.RemoteException;
    public int getCallStateUsingPackage(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean endCall(java.lang.String p0) throws android.os.RemoteException;
    public void acceptRingingCall(java.lang.String p0) throws android.os.RemoteException;
    public void acceptRingingCallWithVideoState(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void cancelMissedCallsNotification(java.lang.String p0) throws android.os.RemoteException;
    public boolean handlePinMmi(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean handlePinMmiForPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.net.Uri getAdnUriForPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isTtySupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getCurrentTtyMode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void addNewIncomingCall(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1, java.lang.String p2) throws android.os.RemoteException;
    public void addNewIncomingConference(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1, java.lang.String p2) throws android.os.RemoteException;
    public void addNewUnknownCall(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void startConference(java.util.List<android.net.Uri> p0, android.os.Bundle p1, java.lang.String p2) throws android.os.RemoteException;
    public void placeCall(android.net.Uri p0, android.os.Bundle p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean enablePhoneAccount(android.telecom.PhoneAccountHandle p0, boolean p1) throws android.os.RemoteException;
    public boolean setDefaultDialer(java.lang.String p0) throws android.os.RemoteException;
    public void stopBlockSuppression() throws android.os.RemoteException;
    public android.content.Intent createManageBlockedNumbersIntent(java.lang.String p0) throws android.os.RemoteException;
    public android.content.Intent createLaunchEmergencyDialerIntent(java.lang.String p0) throws android.os.RemoteException;
    public boolean isIncomingCallPermitted(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isOutgoingCallPermitted(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public void waitOnHandlers() throws android.os.RemoteException;
    public void acceptHandover(android.net.Uri p0, int p1, android.telecom.PhoneAccountHandle p2, java.lang.String p3) throws android.os.RemoteException;
    public void setTestEmergencyPhoneAccountPackageNameFilter(java.lang.String p0) throws android.os.RemoteException;
    public boolean isInEmergencyCall() throws android.os.RemoteException;
    public void handleCallIntent(android.content.Intent p0, java.lang.String p1) throws android.os.RemoteException;
    public void cleanupStuckCalls() throws android.os.RemoteException;
    public int cleanupOrphanPhoneAccounts() throws android.os.RemoteException;
    public boolean isNonUiInCallServiceBound(java.lang.String p0) throws android.os.RemoteException;
    public void resetCarMode() throws android.os.RemoteException;
    public void setTestDefaultCallRedirectionApp(java.lang.String p0) throws android.os.RemoteException;
    public void requestLogMark(java.lang.String p0) throws android.os.RemoteException;
    public void setTestPhoneAcctSuggestionComponent(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public void setTestDefaultCallScreeningApp(java.lang.String p0) throws android.os.RemoteException;
    public void addOrRemoveTestCallCompanionApp(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setSystemDialer(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setTestDefaultDialer(java.lang.String p0) throws android.os.RemoteException;
    public void setTestCallDiagnosticService(java.lang.String p0) throws android.os.RemoteException;
    public boolean isInSelfManagedCall(java.lang.String p0, android.os.UserHandle p1, java.lang.String p2) throws android.os.RemoteException;
    public void addCall(android.telecom.CallAttributes p0, com.android.internal.telecom.ICallEventCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean hasForegroundServiceDelegation(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public void setMetricsTestMode(boolean p0) throws android.os.RemoteException;
    public void waitForAudioToUpdate(boolean p0) throws android.os.RemoteException;
    public int getCallConnectedIndicatorPreference(java.lang.String p0) throws android.os.RemoteException;
    public void setCallConnectedIndicatorPreference(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.ITelecomService {
        public Default() {}
        public void showInCallScreen(boolean p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.telecom.PhoneAccountHandle getDefaultOutgoingPhoneAccount(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.telecom.PhoneAccountHandle getUserSelectedOutgoingPhoneAccount(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void setUserSelectedOutgoingPhoneAccount(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getCallCapablePhoneAccounts(boolean p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getSelfManagedPhoneAccounts(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getOwnSelfManagedPhoneAccounts(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getPhoneAccountsSupportingScheme(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getPhoneAccountsForPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.telecom.PhoneAccount getPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice<android.telecom.PhoneAccount> getRegisteredPhoneAccounts(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int getAllPhoneAccountsCount() throws android.os.RemoteException { return 0; }
        public android.content.pm.ParceledListSlice<android.telecom.PhoneAccount> getAllPhoneAccounts() throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getAllPhoneAccountHandles() throws android.os.RemoteException { return null; }
        public android.telecom.PhoneAccountHandle getSimCallManager(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.telecom.PhoneAccountHandle getSimCallManagerForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void registerPhoneAccount(android.telecom.PhoneAccount p0, java.lang.String p1) throws android.os.RemoteException {}
        public void unregisterPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException {}
        public void clearAccounts(java.lang.String p0) throws android.os.RemoteException {}
        public boolean isVoiceMailNumber(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return false; }
        public java.lang.String getVoiceMailNumber(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getLine1Number(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getDefaultPhoneApp() throws android.os.RemoteException { return null; }
        public java.lang.String getDefaultDialerPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getDefaultDialerPackageForUser(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getSystemDialerPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.telecom.TelecomAnalytics dumpCallAnalytics() throws android.os.RemoteException { return null; }
        public void silenceRinger(java.lang.String p0) throws android.os.RemoteException {}
        public boolean isInCall(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean hasManageOngoingCallsPermission(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isInManagedCall(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isRinging(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int getCallState() throws android.os.RemoteException { return 0; }
        public int getCallStateUsingPackage(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public boolean endCall(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void acceptRingingCall(java.lang.String p0) throws android.os.RemoteException {}
        public void acceptRingingCallWithVideoState(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void cancelMissedCallsNotification(java.lang.String p0) throws android.os.RemoteException {}
        public boolean handlePinMmi(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean handlePinMmiForPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public android.net.Uri getAdnUriForPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isTtySupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public int getCurrentTtyMode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void addNewIncomingCall(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1, java.lang.String p2) throws android.os.RemoteException {}
        public void addNewIncomingConference(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1, java.lang.String p2) throws android.os.RemoteException {}
        public void addNewUnknownCall(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void startConference(java.util.List<android.net.Uri> p0, android.os.Bundle p1, java.lang.String p2) throws android.os.RemoteException {}
        public void placeCall(android.net.Uri p0, android.os.Bundle p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public boolean enablePhoneAccount(android.telecom.PhoneAccountHandle p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean setDefaultDialer(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void stopBlockSuppression() throws android.os.RemoteException {}
        public android.content.Intent createManageBlockedNumbersIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.Intent createLaunchEmergencyDialerIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean isIncomingCallPermitted(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isOutgoingCallPermitted(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void waitOnHandlers() throws android.os.RemoteException {}
        public void acceptHandover(android.net.Uri p0, int p1, android.telecom.PhoneAccountHandle p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setTestEmergencyPhoneAccountPackageNameFilter(java.lang.String p0) throws android.os.RemoteException {}
        public boolean isInEmergencyCall() throws android.os.RemoteException { return false; }
        public void handleCallIntent(android.content.Intent p0, java.lang.String p1) throws android.os.RemoteException {}
        public void cleanupStuckCalls() throws android.os.RemoteException {}
        public int cleanupOrphanPhoneAccounts() throws android.os.RemoteException { return 0; }
        public boolean isNonUiInCallServiceBound(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void resetCarMode() throws android.os.RemoteException {}
        public void setTestDefaultCallRedirectionApp(java.lang.String p0) throws android.os.RemoteException {}
        public void requestLogMark(java.lang.String p0) throws android.os.RemoteException {}
        public void setTestPhoneAcctSuggestionComponent(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException {}
        public void setTestDefaultCallScreeningApp(java.lang.String p0) throws android.os.RemoteException {}
        public void addOrRemoveTestCallCompanionApp(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void setSystemDialer(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void setTestDefaultDialer(java.lang.String p0) throws android.os.RemoteException {}
        public void setTestCallDiagnosticService(java.lang.String p0) throws android.os.RemoteException {}
        public boolean isInSelfManagedCall(java.lang.String p0, android.os.UserHandle p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void addCall(android.telecom.CallAttributes p0, com.android.internal.telecom.ICallEventCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public boolean hasForegroundServiceDelegation(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void setMetricsTestMode(boolean p0) throws android.os.RemoteException {}
        public void waitForAudioToUpdate(boolean p0) throws android.os.RemoteException {}
        public int getCallConnectedIndicatorPreference(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void setCallConnectedIndicatorPreference(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.ITelecomService {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.ITelecomService";
        static final int TRANSACTION_showInCallScreen = 1;
        static final int TRANSACTION_getDefaultOutgoingPhoneAccount = 2;
        static final int TRANSACTION_getUserSelectedOutgoingPhoneAccount = 3;
        static final int TRANSACTION_setUserSelectedOutgoingPhoneAccount = 4;
        static final int TRANSACTION_getCallCapablePhoneAccounts = 5;
        static final int TRANSACTION_getSelfManagedPhoneAccounts = 6;
        static final int TRANSACTION_getOwnSelfManagedPhoneAccounts = 7;
        static final int TRANSACTION_getPhoneAccountsSupportingScheme = 8;
        static final int TRANSACTION_getPhoneAccountsForPackage = 9;
        static final int TRANSACTION_getPhoneAccount = 10;
        static final int TRANSACTION_getRegisteredPhoneAccounts = 11;
        static final int TRANSACTION_getAllPhoneAccountsCount = 12;
        static final int TRANSACTION_getAllPhoneAccounts = 13;
        static final int TRANSACTION_getAllPhoneAccountHandles = 14;
        static final int TRANSACTION_getSimCallManager = 15;
        static final int TRANSACTION_getSimCallManagerForUser = 16;
        static final int TRANSACTION_registerPhoneAccount = 17;
        static final int TRANSACTION_unregisterPhoneAccount = 18;
        static final int TRANSACTION_clearAccounts = 19;
        static final int TRANSACTION_isVoiceMailNumber = 20;
        static final int TRANSACTION_getVoiceMailNumber = 21;
        static final int TRANSACTION_getLine1Number = 22;
        static final int TRANSACTION_getDefaultPhoneApp = 23;
        static final int TRANSACTION_getDefaultDialerPackage = 24;
        static final int TRANSACTION_getDefaultDialerPackageForUser = 25;
        static final int TRANSACTION_getSystemDialerPackage = 26;
        static final int TRANSACTION_dumpCallAnalytics = 27;
        static final int TRANSACTION_silenceRinger = 28;
        static final int TRANSACTION_isInCall = 29;
        static final int TRANSACTION_hasManageOngoingCallsPermission = 30;
        static final int TRANSACTION_isInManagedCall = 31;
        static final int TRANSACTION_isRinging = 32;
        static final int TRANSACTION_getCallState = 33;
        static final int TRANSACTION_getCallStateUsingPackage = 34;
        static final int TRANSACTION_endCall = 35;
        static final int TRANSACTION_acceptRingingCall = 36;
        static final int TRANSACTION_acceptRingingCallWithVideoState = 37;
        static final int TRANSACTION_cancelMissedCallsNotification = 38;
        static final int TRANSACTION_handlePinMmi = 39;
        static final int TRANSACTION_handlePinMmiForPhoneAccount = 40;
        static final int TRANSACTION_getAdnUriForPhoneAccount = 41;
        static final int TRANSACTION_isTtySupported = 42;
        static final int TRANSACTION_getCurrentTtyMode = 43;
        static final int TRANSACTION_addNewIncomingCall = 44;
        static final int TRANSACTION_addNewIncomingConference = 45;
        static final int TRANSACTION_addNewUnknownCall = 46;
        static final int TRANSACTION_startConference = 47;
        static final int TRANSACTION_placeCall = 48;
        static final int TRANSACTION_enablePhoneAccount = 49;
        static final int TRANSACTION_setDefaultDialer = 50;
        static final int TRANSACTION_stopBlockSuppression = 51;
        static final int TRANSACTION_createManageBlockedNumbersIntent = 52;
        static final int TRANSACTION_createLaunchEmergencyDialerIntent = 53;
        static final int TRANSACTION_isIncomingCallPermitted = 54;
        static final int TRANSACTION_isOutgoingCallPermitted = 55;
        static final int TRANSACTION_waitOnHandlers = 56;
        static final int TRANSACTION_acceptHandover = 57;
        static final int TRANSACTION_setTestEmergencyPhoneAccountPackageNameFilter = 58;
        static final int TRANSACTION_isInEmergencyCall = 59;
        static final int TRANSACTION_handleCallIntent = 60;
        static final int TRANSACTION_cleanupStuckCalls = 61;
        static final int TRANSACTION_cleanupOrphanPhoneAccounts = 62;
        static final int TRANSACTION_isNonUiInCallServiceBound = 63;
        static final int TRANSACTION_resetCarMode = 64;
        static final int TRANSACTION_setTestDefaultCallRedirectionApp = 65;
        static final int TRANSACTION_requestLogMark = 66;
        static final int TRANSACTION_setTestPhoneAcctSuggestionComponent = 67;
        static final int TRANSACTION_setTestDefaultCallScreeningApp = 68;
        static final int TRANSACTION_addOrRemoveTestCallCompanionApp = 69;
        static final int TRANSACTION_setSystemDialer = 70;
        static final int TRANSACTION_setTestDefaultDialer = 71;
        static final int TRANSACTION_setTestCallDiagnosticService = 72;
        static final int TRANSACTION_isInSelfManagedCall = 73;
        static final int TRANSACTION_addCall = 74;
        static final int TRANSACTION_hasForegroundServiceDelegation = 75;
        static final int TRANSACTION_setMetricsTestMode = 76;
        static final int TRANSACTION_waitForAudioToUpdate = 77;
        static final int TRANSACTION_getCallConnectedIndicatorPreference = 78;
        static final int TRANSACTION_setCallConnectedIndicatorPreference = 79;
        public Stub() { super(); }
        public static com.android.internal.telecom.ITelecomService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telecom.ITelecomService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void showInCallScreen(boolean p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public android.telecom.PhoneAccountHandle getDefaultOutgoingPhoneAccount(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.telecom.PhoneAccountHandle getUserSelectedOutgoingPhoneAccount(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void setUserSelectedOutgoingPhoneAccount(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getCallCapablePhoneAccounts(boolean p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getSelfManagedPhoneAccounts(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getOwnSelfManagedPhoneAccounts(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getPhoneAccountsSupportingScheme(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getPhoneAccountsForPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.telecom.PhoneAccount getPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice<android.telecom.PhoneAccount> getRegisteredPhoneAccounts(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int getAllPhoneAccountsCount() throws android.os.RemoteException { return 0; }
            public android.content.pm.ParceledListSlice<android.telecom.PhoneAccount> getAllPhoneAccounts() throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice<android.telecom.PhoneAccountHandle> getAllPhoneAccountHandles() throws android.os.RemoteException { return null; }
            public android.telecom.PhoneAccountHandle getSimCallManager(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.telecom.PhoneAccountHandle getSimCallManagerForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void registerPhoneAccount(android.telecom.PhoneAccount p0, java.lang.String p1) throws android.os.RemoteException {}
            public void unregisterPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException {}
            public void clearAccounts(java.lang.String p0) throws android.os.RemoteException {}
            public boolean isVoiceMailNumber(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return false; }
            public java.lang.String getVoiceMailNumber(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getLine1Number(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getDefaultPhoneApp() throws android.os.RemoteException { return null; }
            public java.lang.String getDefaultDialerPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getDefaultDialerPackageForUser(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getSystemDialerPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.telecom.TelecomAnalytics dumpCallAnalytics() throws android.os.RemoteException { return null; }
            public void silenceRinger(java.lang.String p0) throws android.os.RemoteException {}
            public boolean isInCall(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean hasManageOngoingCallsPermission(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isInManagedCall(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isRinging(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int getCallState() throws android.os.RemoteException { return 0; }
            public int getCallStateUsingPackage(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public boolean endCall(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void acceptRingingCall(java.lang.String p0) throws android.os.RemoteException {}
            public void acceptRingingCallWithVideoState(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void cancelMissedCallsNotification(java.lang.String p0) throws android.os.RemoteException {}
            public boolean handlePinMmi(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean handlePinMmiForPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public android.net.Uri getAdnUriForPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isTtySupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public int getCurrentTtyMode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void addNewIncomingCall(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1, java.lang.String p2) throws android.os.RemoteException {}
            public void addNewIncomingConference(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1, java.lang.String p2) throws android.os.RemoteException {}
            public void addNewUnknownCall(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void startConference(java.util.List<android.net.Uri> p0, android.os.Bundle p1, java.lang.String p2) throws android.os.RemoteException {}
            public void placeCall(android.net.Uri p0, android.os.Bundle p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public boolean enablePhoneAccount(android.telecom.PhoneAccountHandle p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean setDefaultDialer(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void stopBlockSuppression() throws android.os.RemoteException {}
            public android.content.Intent createManageBlockedNumbersIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.Intent createLaunchEmergencyDialerIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean isIncomingCallPermitted(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isOutgoingCallPermitted(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void waitOnHandlers() throws android.os.RemoteException {}
            public void acceptHandover(android.net.Uri p0, int p1, android.telecom.PhoneAccountHandle p2, java.lang.String p3) throws android.os.RemoteException {}
            public void setTestEmergencyPhoneAccountPackageNameFilter(java.lang.String p0) throws android.os.RemoteException {}
            public boolean isInEmergencyCall() throws android.os.RemoteException { return false; }
            public void handleCallIntent(android.content.Intent p0, java.lang.String p1) throws android.os.RemoteException {}
            public void cleanupStuckCalls() throws android.os.RemoteException {}
            public int cleanupOrphanPhoneAccounts() throws android.os.RemoteException { return 0; }
            public boolean isNonUiInCallServiceBound(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void resetCarMode() throws android.os.RemoteException {}
            public void setTestDefaultCallRedirectionApp(java.lang.String p0) throws android.os.RemoteException {}
            public void requestLogMark(java.lang.String p0) throws android.os.RemoteException {}
            public void setTestPhoneAcctSuggestionComponent(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException {}
            public void setTestDefaultCallScreeningApp(java.lang.String p0) throws android.os.RemoteException {}
            public void addOrRemoveTestCallCompanionApp(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void setSystemDialer(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void setTestDefaultDialer(java.lang.String p0) throws android.os.RemoteException {}
            public void setTestCallDiagnosticService(java.lang.String p0) throws android.os.RemoteException {}
            public boolean isInSelfManagedCall(java.lang.String p0, android.os.UserHandle p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void addCall(android.telecom.CallAttributes p0, com.android.internal.telecom.ICallEventCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public boolean hasForegroundServiceDelegation(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void setMetricsTestMode(boolean p0) throws android.os.RemoteException {}
            public void waitForAudioToUpdate(boolean p0) throws android.os.RemoteException {}
            public int getCallConnectedIndicatorPreference(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void setCallConnectedIndicatorPreference(java.lang.String p0, int p1) throws android.os.RemoteException {}
        }
    }
}
