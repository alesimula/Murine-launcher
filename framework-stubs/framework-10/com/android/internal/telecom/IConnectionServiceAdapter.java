package com.android.internal.telecom;

public interface IConnectionServiceAdapter extends android.os.IInterface {
    public void handleCreateConnectionComplete(java.lang.String p0, android.telecom.ConnectionRequest p1, android.telecom.ParcelableConnection p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException;
    public void setActive(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void setRinging(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void setDialing(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void setPulling(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void setDisconnected(java.lang.String p0, android.telecom.DisconnectCause p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void setOnHold(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void setRingbackRequested(java.lang.String p0, boolean p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void setConnectionCapabilities(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void setConnectionProperties(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void setIsConferenced(java.lang.String p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void setConferenceMergeFailed(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void addConferenceCall(java.lang.String p0, android.telecom.ParcelableConference p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void removeCall(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void onPostDialWait(java.lang.String p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void onPostDialChar(java.lang.String p0, char p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void queryRemoteConnectionServices(com.android.internal.telecom.RemoteServiceCallback p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void setVideoProvider(java.lang.String p0, com.android.internal.telecom.IVideoProvider p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void setVideoState(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void setIsVoipAudioMode(java.lang.String p0, boolean p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void setStatusHints(java.lang.String p0, android.telecom.StatusHints p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void setAddress(java.lang.String p0, android.net.Uri p1, int p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException;
    public void setCallerDisplayName(java.lang.String p0, java.lang.String p1, int p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException;
    public void setConferenceableConnections(java.lang.String p0, java.util.List<java.lang.String> p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void addExistingConnection(java.lang.String p0, android.telecom.ParcelableConnection p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void putExtras(java.lang.String p0, android.os.Bundle p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void removeExtras(java.lang.String p0, java.util.List<java.lang.String> p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void setAudioRoute(java.lang.String p0, int p1, java.lang.String p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException;
    public void onConnectionEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException;
    public void onRttInitiationSuccess(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void onRttInitiationFailure(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void onRttSessionRemotelyTerminated(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void onRemoteRttRequest(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void onPhoneAccountChanged(java.lang.String p0, android.telecom.PhoneAccountHandle p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void onConnectionServiceFocusReleased(android.telecom.Logging.Session.Info p0) throws android.os.RemoteException;
    public void resetConnectionTime(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void setConferenceState(java.lang.String p0, boolean p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.IConnectionServiceAdapter {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.IConnectionServiceAdapter";
        static final int TRANSACTION_handleCreateConnectionComplete = 1;
        static final int TRANSACTION_setActive = 2;
        static final int TRANSACTION_setRinging = 3;
        static final int TRANSACTION_setDialing = 4;
        static final int TRANSACTION_setPulling = 5;
        static final int TRANSACTION_setDisconnected = 6;
        static final int TRANSACTION_setOnHold = 7;
        static final int TRANSACTION_setRingbackRequested = 8;
        static final int TRANSACTION_setConnectionCapabilities = 9;
        static final int TRANSACTION_setConnectionProperties = 10;
        static final int TRANSACTION_setIsConferenced = 11;
        static final int TRANSACTION_setConferenceMergeFailed = 12;
        static final int TRANSACTION_addConferenceCall = 13;
        static final int TRANSACTION_removeCall = 14;
        static final int TRANSACTION_onPostDialWait = 15;
        static final int TRANSACTION_onPostDialChar = 16;
        static final int TRANSACTION_queryRemoteConnectionServices = 17;
        static final int TRANSACTION_setVideoProvider = 18;
        static final int TRANSACTION_setVideoState = 19;
        static final int TRANSACTION_setIsVoipAudioMode = 20;
        static final int TRANSACTION_setStatusHints = 21;
        static final int TRANSACTION_setAddress = 22;
        static final int TRANSACTION_setCallerDisplayName = 23;
        static final int TRANSACTION_setConferenceableConnections = 24;
        static final int TRANSACTION_addExistingConnection = 25;
        static final int TRANSACTION_putExtras = 26;
        static final int TRANSACTION_removeExtras = 27;
        static final int TRANSACTION_setAudioRoute = 28;
        static final int TRANSACTION_onConnectionEvent = 29;
        static final int TRANSACTION_onRttInitiationSuccess = 30;
        static final int TRANSACTION_onRttInitiationFailure = 31;
        static final int TRANSACTION_onRttSessionRemotelyTerminated = 32;
        static final int TRANSACTION_onRemoteRttRequest = 33;
        static final int TRANSACTION_onPhoneAccountChanged = 34;
        static final int TRANSACTION_onConnectionServiceFocusReleased = 35;
        static final int TRANSACTION_resetConnectionTime = 36;
        static final int TRANSACTION_setConferenceState = 37;
        public Stub() { super(); }
        public static com.android.internal.telecom.IConnectionServiceAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telecom.IConnectionServiceAdapter p0) { return false; }
        public static com.android.internal.telecom.IConnectionServiceAdapter getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telecom.IConnectionServiceAdapter {
            private android.os.IBinder mRemote;
            public static com.android.internal.telecom.IConnectionServiceAdapter sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void handleCreateConnectionComplete(java.lang.String p0, android.telecom.ConnectionRequest p1, android.telecom.ParcelableConnection p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
            public void setActive(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void setRinging(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void setDialing(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void setPulling(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void setDisconnected(java.lang.String p0, android.telecom.DisconnectCause p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void setOnHold(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void setRingbackRequested(java.lang.String p0, boolean p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void setConnectionCapabilities(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void setConnectionProperties(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void setIsConferenced(java.lang.String p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void setConferenceMergeFailed(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void addConferenceCall(java.lang.String p0, android.telecom.ParcelableConference p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void removeCall(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void onPostDialWait(java.lang.String p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void onPostDialChar(java.lang.String p0, char p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void queryRemoteConnectionServices(com.android.internal.telecom.RemoteServiceCallback p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void setVideoProvider(java.lang.String p0, com.android.internal.telecom.IVideoProvider p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void setVideoState(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void setIsVoipAudioMode(java.lang.String p0, boolean p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void setStatusHints(java.lang.String p0, android.telecom.StatusHints p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void setAddress(java.lang.String p0, android.net.Uri p1, int p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
            public void setCallerDisplayName(java.lang.String p0, java.lang.String p1, int p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
            public void setConferenceableConnections(java.lang.String p0, java.util.List<java.lang.String> p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void addExistingConnection(java.lang.String p0, android.telecom.ParcelableConnection p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void putExtras(java.lang.String p0, android.os.Bundle p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void removeExtras(java.lang.String p0, java.util.List<java.lang.String> p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void setAudioRoute(java.lang.String p0, int p1, java.lang.String p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
            public void onConnectionEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
            public void onRttInitiationSuccess(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void onRttInitiationFailure(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void onRttSessionRemotelyTerminated(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void onRemoteRttRequest(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void onPhoneAccountChanged(java.lang.String p0, android.telecom.PhoneAccountHandle p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void onConnectionServiceFocusReleased(android.telecom.Logging.Session.Info p0) throws android.os.RemoteException {}
            public void resetConnectionTime(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void setConferenceState(java.lang.String p0, boolean p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.telecom.IConnectionServiceAdapter {
        public Default() {}
        public void handleCreateConnectionComplete(java.lang.String p0, android.telecom.ConnectionRequest p1, android.telecom.ParcelableConnection p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
        public void setActive(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void setRinging(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void setDialing(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void setPulling(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void setDisconnected(java.lang.String p0, android.telecom.DisconnectCause p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void setOnHold(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void setRingbackRequested(java.lang.String p0, boolean p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void setConnectionCapabilities(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void setConnectionProperties(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void setIsConferenced(java.lang.String p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void setConferenceMergeFailed(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void addConferenceCall(java.lang.String p0, android.telecom.ParcelableConference p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void removeCall(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void onPostDialWait(java.lang.String p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void onPostDialChar(java.lang.String p0, char p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void queryRemoteConnectionServices(com.android.internal.telecom.RemoteServiceCallback p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void setVideoProvider(java.lang.String p0, com.android.internal.telecom.IVideoProvider p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void setVideoState(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void setIsVoipAudioMode(java.lang.String p0, boolean p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void setStatusHints(java.lang.String p0, android.telecom.StatusHints p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void setAddress(java.lang.String p0, android.net.Uri p1, int p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
        public void setCallerDisplayName(java.lang.String p0, java.lang.String p1, int p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
        public void setConferenceableConnections(java.lang.String p0, java.util.List<java.lang.String> p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void addExistingConnection(java.lang.String p0, android.telecom.ParcelableConnection p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void putExtras(java.lang.String p0, android.os.Bundle p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void removeExtras(java.lang.String p0, java.util.List<java.lang.String> p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void setAudioRoute(java.lang.String p0, int p1, java.lang.String p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
        public void onConnectionEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
        public void onRttInitiationSuccess(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void onRttInitiationFailure(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void onRttSessionRemotelyTerminated(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void onRemoteRttRequest(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void onPhoneAccountChanged(java.lang.String p0, android.telecom.PhoneAccountHandle p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void onConnectionServiceFocusReleased(android.telecom.Logging.Session.Info p0) throws android.os.RemoteException {}
        public void resetConnectionTime(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void setConferenceState(java.lang.String p0, boolean p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
