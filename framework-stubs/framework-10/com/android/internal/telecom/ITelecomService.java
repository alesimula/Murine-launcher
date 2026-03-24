package com.android.internal.telecom;

public interface ITelecomService extends android.os.IInterface {
    public void showInCallScreen(boolean p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telecom.PhoneAccountHandle getDefaultOutgoingPhoneAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telecom.PhoneAccountHandle getUserSelectedOutgoingPhoneAccount(java.lang.String p0) throws android.os.RemoteException;
    public void setUserSelectedOutgoingPhoneAccount(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException;
    public java.util.List<android.telecom.PhoneAccountHandle> getCallCapablePhoneAccounts(boolean p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.telecom.PhoneAccountHandle> getSelfManagedPhoneAccounts(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<android.telecom.PhoneAccountHandle> getPhoneAccountsSupportingScheme(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.telecom.PhoneAccountHandle> getPhoneAccountsForPackage(java.lang.String p0) throws android.os.RemoteException;
    public android.telecom.PhoneAccount getPhoneAccount(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException;
    public int getAllPhoneAccountsCount() throws android.os.RemoteException;
    public java.util.List<android.telecom.PhoneAccount> getAllPhoneAccounts() throws android.os.RemoteException;
    public java.util.List<android.telecom.PhoneAccountHandle> getAllPhoneAccountHandles() throws android.os.RemoteException;
    public android.telecom.PhoneAccountHandle getSimCallManager(int p0) throws android.os.RemoteException;
    public android.telecom.PhoneAccountHandle getSimCallManagerForUser(int p0) throws android.os.RemoteException;
    public void registerPhoneAccount(android.telecom.PhoneAccount p0) throws android.os.RemoteException;
    public void unregisterPhoneAccount(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException;
    public void clearAccounts(java.lang.String p0) throws android.os.RemoteException;
    public boolean isVoiceMailNumber(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getVoiceMailNumber(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getLine1Number(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.ComponentName getDefaultPhoneApp() throws android.os.RemoteException;
    public java.lang.String getDefaultDialerPackage() throws android.os.RemoteException;
    public java.lang.String getSystemDialerPackage() throws android.os.RemoteException;
    public android.telecom.TelecomAnalytics dumpCallAnalytics() throws android.os.RemoteException;
    public void silenceRinger(java.lang.String p0) throws android.os.RemoteException;
    public boolean isInCall(java.lang.String p0) throws android.os.RemoteException;
    public boolean isInManagedCall(java.lang.String p0) throws android.os.RemoteException;
    public boolean isRinging(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getCallState() throws android.os.RemoteException;
    public boolean endCall(java.lang.String p0) throws android.os.RemoteException;
    public void acceptRingingCall(java.lang.String p0) throws android.os.RemoteException;
    public void acceptRingingCallWithVideoState(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void cancelMissedCallsNotification(java.lang.String p0) throws android.os.RemoteException;
    public boolean handlePinMmi(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean handlePinMmiForPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.net.Uri getAdnUriForPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isTtySupported(java.lang.String p0) throws android.os.RemoteException;
    public int getCurrentTtyMode(java.lang.String p0) throws android.os.RemoteException;
    public void addNewIncomingCall(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void addNewUnknownCall(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void placeCall(android.net.Uri p0, android.os.Bundle p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean enablePhoneAccount(android.telecom.PhoneAccountHandle p0, boolean p1) throws android.os.RemoteException;
    public boolean setDefaultDialer(java.lang.String p0) throws android.os.RemoteException;
    public android.content.Intent createManageBlockedNumbersIntent() throws android.os.RemoteException;
    public boolean isIncomingCallPermitted(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException;
    public boolean isOutgoingCallPermitted(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException;
    public void waitOnHandlers() throws android.os.RemoteException;
    public void acceptHandover(android.net.Uri p0, int p1, android.telecom.PhoneAccountHandle p2) throws android.os.RemoteException;
    public boolean isInEmergencyCall() throws android.os.RemoteException;
    public void handleCallIntent(android.content.Intent p0) throws android.os.RemoteException;
    public void setTestDefaultCallRedirectionApp(java.lang.String p0) throws android.os.RemoteException;
    public void setTestPhoneAcctSuggestionComponent(java.lang.String p0) throws android.os.RemoteException;
    public void setTestDefaultCallScreeningApp(java.lang.String p0) throws android.os.RemoteException;
    public void addOrRemoveTestCallCompanionApp(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setTestAutoModeApp(java.lang.String p0) throws android.os.RemoteException;
    public void setTestDefaultDialer(java.lang.String p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.ITelecomService {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.ITelecomService";
        static final int TRANSACTION_showInCallScreen = 1;
        static final int TRANSACTION_getDefaultOutgoingPhoneAccount = 2;
        static final int TRANSACTION_getUserSelectedOutgoingPhoneAccount = 3;
        static final int TRANSACTION_setUserSelectedOutgoingPhoneAccount = 4;
        static final int TRANSACTION_getCallCapablePhoneAccounts = 5;
        static final int TRANSACTION_getSelfManagedPhoneAccounts = 6;
        static final int TRANSACTION_getPhoneAccountsSupportingScheme = 7;
        static final int TRANSACTION_getPhoneAccountsForPackage = 8;
        static final int TRANSACTION_getPhoneAccount = 9;
        static final int TRANSACTION_getAllPhoneAccountsCount = 10;
        static final int TRANSACTION_getAllPhoneAccounts = 11;
        static final int TRANSACTION_getAllPhoneAccountHandles = 12;
        static final int TRANSACTION_getSimCallManager = 13;
        static final int TRANSACTION_getSimCallManagerForUser = 14;
        static final int TRANSACTION_registerPhoneAccount = 15;
        static final int TRANSACTION_unregisterPhoneAccount = 16;
        static final int TRANSACTION_clearAccounts = 17;
        static final int TRANSACTION_isVoiceMailNumber = 18;
        static final int TRANSACTION_getVoiceMailNumber = 19;
        static final int TRANSACTION_getLine1Number = 20;
        static final int TRANSACTION_getDefaultPhoneApp = 21;
        static final int TRANSACTION_getDefaultDialerPackage = 22;
        static final int TRANSACTION_getSystemDialerPackage = 23;
        static final int TRANSACTION_dumpCallAnalytics = 24;
        static final int TRANSACTION_silenceRinger = 25;
        static final int TRANSACTION_isInCall = 26;
        static final int TRANSACTION_isInManagedCall = 27;
        static final int TRANSACTION_isRinging = 28;
        static final int TRANSACTION_getCallState = 29;
        static final int TRANSACTION_endCall = 30;
        static final int TRANSACTION_acceptRingingCall = 31;
        static final int TRANSACTION_acceptRingingCallWithVideoState = 32;
        static final int TRANSACTION_cancelMissedCallsNotification = 33;
        static final int TRANSACTION_handlePinMmi = 34;
        static final int TRANSACTION_handlePinMmiForPhoneAccount = 35;
        static final int TRANSACTION_getAdnUriForPhoneAccount = 36;
        static final int TRANSACTION_isTtySupported = 37;
        static final int TRANSACTION_getCurrentTtyMode = 38;
        static final int TRANSACTION_addNewIncomingCall = 39;
        static final int TRANSACTION_addNewUnknownCall = 40;
        static final int TRANSACTION_placeCall = 41;
        static final int TRANSACTION_enablePhoneAccount = 42;
        static final int TRANSACTION_setDefaultDialer = 43;
        static final int TRANSACTION_createManageBlockedNumbersIntent = 44;
        static final int TRANSACTION_isIncomingCallPermitted = 45;
        static final int TRANSACTION_isOutgoingCallPermitted = 46;
        static final int TRANSACTION_waitOnHandlers = 47;
        static final int TRANSACTION_acceptHandover = 48;
        static final int TRANSACTION_isInEmergencyCall = 49;
        static final int TRANSACTION_handleCallIntent = 50;
        static final int TRANSACTION_setTestDefaultCallRedirectionApp = 51;
        static final int TRANSACTION_setTestPhoneAcctSuggestionComponent = 52;
        static final int TRANSACTION_setTestDefaultCallScreeningApp = 53;
        static final int TRANSACTION_addOrRemoveTestCallCompanionApp = 54;
        static final int TRANSACTION_setTestAutoModeApp = 55;
        static final int TRANSACTION_setTestDefaultDialer = 56;
        public Stub() { super(); }
        public static com.android.internal.telecom.ITelecomService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telecom.ITelecomService p0) { return false; }
        public static com.android.internal.telecom.ITelecomService getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telecom.ITelecomService {
            private android.os.IBinder mRemote;
            public static com.android.internal.telecom.ITelecomService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void showInCallScreen(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.telecom.PhoneAccountHandle getDefaultOutgoingPhoneAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.telecom.PhoneAccountHandle getUserSelectedOutgoingPhoneAccount(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void setUserSelectedOutgoingPhoneAccount(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException {}
            public java.util.List<android.telecom.PhoneAccountHandle> getCallCapablePhoneAccounts(boolean p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.telecom.PhoneAccountHandle> getSelfManagedPhoneAccounts(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.telecom.PhoneAccountHandle> getPhoneAccountsSupportingScheme(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.telecom.PhoneAccountHandle> getPhoneAccountsForPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.telecom.PhoneAccount getPhoneAccount(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException { return null; }
            public int getAllPhoneAccountsCount() throws android.os.RemoteException { return 0; }
            public java.util.List<android.telecom.PhoneAccount> getAllPhoneAccounts() throws android.os.RemoteException { return null; }
            public java.util.List<android.telecom.PhoneAccountHandle> getAllPhoneAccountHandles() throws android.os.RemoteException { return null; }
            public android.telecom.PhoneAccountHandle getSimCallManager(int p0) throws android.os.RemoteException { return null; }
            public android.telecom.PhoneAccountHandle getSimCallManagerForUser(int p0) throws android.os.RemoteException { return null; }
            public void registerPhoneAccount(android.telecom.PhoneAccount p0) throws android.os.RemoteException {}
            public void unregisterPhoneAccount(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException {}
            public void clearAccounts(java.lang.String p0) throws android.os.RemoteException {}
            public boolean isVoiceMailNumber(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public java.lang.String getVoiceMailNumber(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getLine1Number(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getDefaultPhoneApp() throws android.os.RemoteException { return null; }
            public java.lang.String getDefaultDialerPackage() throws android.os.RemoteException { return null; }
            public java.lang.String getSystemDialerPackage() throws android.os.RemoteException { return null; }
            public android.telecom.TelecomAnalytics dumpCallAnalytics() throws android.os.RemoteException { return null; }
            public void silenceRinger(java.lang.String p0) throws android.os.RemoteException {}
            public boolean isInCall(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isInManagedCall(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isRinging(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int getCallState() throws android.os.RemoteException { return 0; }
            public boolean endCall(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void acceptRingingCall(java.lang.String p0) throws android.os.RemoteException {}
            public void acceptRingingCallWithVideoState(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void cancelMissedCallsNotification(java.lang.String p0) throws android.os.RemoteException {}
            public boolean handlePinMmi(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean handlePinMmiForPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public android.net.Uri getAdnUriForPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isTtySupported(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int getCurrentTtyMode(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void addNewIncomingCall(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void addNewUnknownCall(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void placeCall(android.net.Uri p0, android.os.Bundle p1, java.lang.String p2) throws android.os.RemoteException {}
            public boolean enablePhoneAccount(android.telecom.PhoneAccountHandle p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean setDefaultDialer(java.lang.String p0) throws android.os.RemoteException { return false; }
            public android.content.Intent createManageBlockedNumbersIntent() throws android.os.RemoteException { return null; }
            public boolean isIncomingCallPermitted(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException { return false; }
            public boolean isOutgoingCallPermitted(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException { return false; }
            public void waitOnHandlers() throws android.os.RemoteException {}
            public void acceptHandover(android.net.Uri p0, int p1, android.telecom.PhoneAccountHandle p2) throws android.os.RemoteException {}
            public boolean isInEmergencyCall() throws android.os.RemoteException { return false; }
            public void handleCallIntent(android.content.Intent p0) throws android.os.RemoteException {}
            public void setTestDefaultCallRedirectionApp(java.lang.String p0) throws android.os.RemoteException {}
            public void setTestPhoneAcctSuggestionComponent(java.lang.String p0) throws android.os.RemoteException {}
            public void setTestDefaultCallScreeningApp(java.lang.String p0) throws android.os.RemoteException {}
            public void addOrRemoveTestCallCompanionApp(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void setTestAutoModeApp(java.lang.String p0) throws android.os.RemoteException {}
            public void setTestDefaultDialer(java.lang.String p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.telecom.ITelecomService {
        public Default() {}
        public void showInCallScreen(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.telecom.PhoneAccountHandle getDefaultOutgoingPhoneAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.telecom.PhoneAccountHandle getUserSelectedOutgoingPhoneAccount(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void setUserSelectedOutgoingPhoneAccount(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException {}
        public java.util.List<android.telecom.PhoneAccountHandle> getCallCapablePhoneAccounts(boolean p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.telecom.PhoneAccountHandle> getSelfManagedPhoneAccounts(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.telecom.PhoneAccountHandle> getPhoneAccountsSupportingScheme(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.telecom.PhoneAccountHandle> getPhoneAccountsForPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.telecom.PhoneAccount getPhoneAccount(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException { return null; }
        public int getAllPhoneAccountsCount() throws android.os.RemoteException { return 0; }
        public java.util.List<android.telecom.PhoneAccount> getAllPhoneAccounts() throws android.os.RemoteException { return null; }
        public java.util.List<android.telecom.PhoneAccountHandle> getAllPhoneAccountHandles() throws android.os.RemoteException { return null; }
        public android.telecom.PhoneAccountHandle getSimCallManager(int p0) throws android.os.RemoteException { return null; }
        public android.telecom.PhoneAccountHandle getSimCallManagerForUser(int p0) throws android.os.RemoteException { return null; }
        public void registerPhoneAccount(android.telecom.PhoneAccount p0) throws android.os.RemoteException {}
        public void unregisterPhoneAccount(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException {}
        public void clearAccounts(java.lang.String p0) throws android.os.RemoteException {}
        public boolean isVoiceMailNumber(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public java.lang.String getVoiceMailNumber(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getLine1Number(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getDefaultPhoneApp() throws android.os.RemoteException { return null; }
        public java.lang.String getDefaultDialerPackage() throws android.os.RemoteException { return null; }
        public java.lang.String getSystemDialerPackage() throws android.os.RemoteException { return null; }
        public android.telecom.TelecomAnalytics dumpCallAnalytics() throws android.os.RemoteException { return null; }
        public void silenceRinger(java.lang.String p0) throws android.os.RemoteException {}
        public boolean isInCall(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isInManagedCall(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isRinging(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int getCallState() throws android.os.RemoteException { return 0; }
        public boolean endCall(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void acceptRingingCall(java.lang.String p0) throws android.os.RemoteException {}
        public void acceptRingingCallWithVideoState(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void cancelMissedCallsNotification(java.lang.String p0) throws android.os.RemoteException {}
        public boolean handlePinMmi(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean handlePinMmiForPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public android.net.Uri getAdnUriForPhoneAccount(android.telecom.PhoneAccountHandle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isTtySupported(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int getCurrentTtyMode(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void addNewIncomingCall(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void addNewUnknownCall(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void placeCall(android.net.Uri p0, android.os.Bundle p1, java.lang.String p2) throws android.os.RemoteException {}
        public boolean enablePhoneAccount(android.telecom.PhoneAccountHandle p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean setDefaultDialer(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.content.Intent createManageBlockedNumbersIntent() throws android.os.RemoteException { return null; }
        public boolean isIncomingCallPermitted(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException { return false; }
        public boolean isOutgoingCallPermitted(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException { return false; }
        public void waitOnHandlers() throws android.os.RemoteException {}
        public void acceptHandover(android.net.Uri p0, int p1, android.telecom.PhoneAccountHandle p2) throws android.os.RemoteException {}
        public boolean isInEmergencyCall() throws android.os.RemoteException { return false; }
        public void handleCallIntent(android.content.Intent p0) throws android.os.RemoteException {}
        public void setTestDefaultCallRedirectionApp(java.lang.String p0) throws android.os.RemoteException {}
        public void setTestPhoneAcctSuggestionComponent(java.lang.String p0) throws android.os.RemoteException {}
        public void setTestDefaultCallScreeningApp(java.lang.String p0) throws android.os.RemoteException {}
        public void addOrRemoveTestCallCompanionApp(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void setTestAutoModeApp(java.lang.String p0) throws android.os.RemoteException {}
        public void setTestDefaultDialer(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
