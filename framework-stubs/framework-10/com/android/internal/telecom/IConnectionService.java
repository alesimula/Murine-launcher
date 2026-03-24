package com.android.internal.telecom;

public interface IConnectionService extends android.os.IInterface {
    public void addConnectionServiceAdapter(com.android.internal.telecom.IConnectionServiceAdapter p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void removeConnectionServiceAdapter(com.android.internal.telecom.IConnectionServiceAdapter p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void createConnection(android.telecom.PhoneAccountHandle p0, java.lang.String p1, android.telecom.ConnectionRequest p2, boolean p3, boolean p4, android.telecom.Logging.Session.Info p5) throws android.os.RemoteException;
    public void createConnectionComplete(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void createConnectionFailed(android.telecom.PhoneAccountHandle p0, java.lang.String p1, android.telecom.ConnectionRequest p2, boolean p3, android.telecom.Logging.Session.Info p4) throws android.os.RemoteException;
    public void abort(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void answerVideo(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void answer(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void deflect(java.lang.String p0, android.net.Uri p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void reject(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void rejectWithMessage(java.lang.String p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void disconnect(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void silence(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void hold(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void unhold(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void onCallAudioStateChanged(java.lang.String p0, android.telecom.CallAudioState p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void playDtmfTone(java.lang.String p0, char p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void stopDtmfTone(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void conference(java.lang.String p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void splitFromConference(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void mergeConference(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void swapConference(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void onPostDialContinue(java.lang.String p0, boolean p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void pullExternalCall(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void sendCallEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException;
    public void onExtrasChanged(java.lang.String p0, android.os.Bundle p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException;
    public void startRtt(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException;
    public void stopRtt(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;
    public void respondToRttUpgradeRequest(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException;
    public void connectionServiceFocusLost(android.telecom.Logging.Session.Info p0) throws android.os.RemoteException;
    public void connectionServiceFocusGained(android.telecom.Logging.Session.Info p0) throws android.os.RemoteException;
    public void handoverFailed(java.lang.String p0, android.telecom.ConnectionRequest p1, int p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException;
    public void handoverComplete(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.IConnectionService {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.IConnectionService";
        static final int TRANSACTION_addConnectionServiceAdapter = 1;
        static final int TRANSACTION_removeConnectionServiceAdapter = 2;
        static final int TRANSACTION_createConnection = 3;
        static final int TRANSACTION_createConnectionComplete = 4;
        static final int TRANSACTION_createConnectionFailed = 5;
        static final int TRANSACTION_abort = 6;
        static final int TRANSACTION_answerVideo = 7;
        static final int TRANSACTION_answer = 8;
        static final int TRANSACTION_deflect = 9;
        static final int TRANSACTION_reject = 10;
        static final int TRANSACTION_rejectWithMessage = 11;
        static final int TRANSACTION_disconnect = 12;
        static final int TRANSACTION_silence = 13;
        static final int TRANSACTION_hold = 14;
        static final int TRANSACTION_unhold = 15;
        static final int TRANSACTION_onCallAudioStateChanged = 16;
        static final int TRANSACTION_playDtmfTone = 17;
        static final int TRANSACTION_stopDtmfTone = 18;
        static final int TRANSACTION_conference = 19;
        static final int TRANSACTION_splitFromConference = 20;
        static final int TRANSACTION_mergeConference = 21;
        static final int TRANSACTION_swapConference = 22;
        static final int TRANSACTION_onPostDialContinue = 23;
        static final int TRANSACTION_pullExternalCall = 24;
        static final int TRANSACTION_sendCallEvent = 25;
        static final int TRANSACTION_onExtrasChanged = 26;
        static final int TRANSACTION_startRtt = 27;
        static final int TRANSACTION_stopRtt = 28;
        static final int TRANSACTION_respondToRttUpgradeRequest = 29;
        static final int TRANSACTION_connectionServiceFocusLost = 30;
        static final int TRANSACTION_connectionServiceFocusGained = 31;
        static final int TRANSACTION_handoverFailed = 32;
        static final int TRANSACTION_handoverComplete = 33;
        public Stub() { super(); }
        public static com.android.internal.telecom.IConnectionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telecom.IConnectionService p0) { return false; }
        public static com.android.internal.telecom.IConnectionService getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telecom.IConnectionService {
            private android.os.IBinder mRemote;
            public static com.android.internal.telecom.IConnectionService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addConnectionServiceAdapter(com.android.internal.telecom.IConnectionServiceAdapter p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void removeConnectionServiceAdapter(com.android.internal.telecom.IConnectionServiceAdapter p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void createConnection(android.telecom.PhoneAccountHandle p0, java.lang.String p1, android.telecom.ConnectionRequest p2, boolean p3, boolean p4, android.telecom.Logging.Session.Info p5) throws android.os.RemoteException {}
            public void createConnectionComplete(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void createConnectionFailed(android.telecom.PhoneAccountHandle p0, java.lang.String p1, android.telecom.ConnectionRequest p2, boolean p3, android.telecom.Logging.Session.Info p4) throws android.os.RemoteException {}
            public void abort(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void answerVideo(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void answer(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void deflect(java.lang.String p0, android.net.Uri p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void reject(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void rejectWithMessage(java.lang.String p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void disconnect(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void silence(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void hold(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void unhold(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void onCallAudioStateChanged(java.lang.String p0, android.telecom.CallAudioState p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void playDtmfTone(java.lang.String p0, char p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void stopDtmfTone(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void conference(java.lang.String p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void splitFromConference(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void mergeConference(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void swapConference(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void onPostDialContinue(java.lang.String p0, boolean p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void pullExternalCall(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void sendCallEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
            public void onExtrasChanged(java.lang.String p0, android.os.Bundle p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
            public void startRtt(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
            public void stopRtt(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
            public void respondToRttUpgradeRequest(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
            public void connectionServiceFocusLost(android.telecom.Logging.Session.Info p0) throws android.os.RemoteException {}
            public void connectionServiceFocusGained(android.telecom.Logging.Session.Info p0) throws android.os.RemoteException {}
            public void handoverFailed(java.lang.String p0, android.telecom.ConnectionRequest p1, int p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
            public void handoverComplete(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.telecom.IConnectionService {
        public Default() {}
        public void addConnectionServiceAdapter(com.android.internal.telecom.IConnectionServiceAdapter p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void removeConnectionServiceAdapter(com.android.internal.telecom.IConnectionServiceAdapter p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void createConnection(android.telecom.PhoneAccountHandle p0, java.lang.String p1, android.telecom.ConnectionRequest p2, boolean p3, boolean p4, android.telecom.Logging.Session.Info p5) throws android.os.RemoteException {}
        public void createConnectionComplete(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void createConnectionFailed(android.telecom.PhoneAccountHandle p0, java.lang.String p1, android.telecom.ConnectionRequest p2, boolean p3, android.telecom.Logging.Session.Info p4) throws android.os.RemoteException {}
        public void abort(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void answerVideo(java.lang.String p0, int p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void answer(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void deflect(java.lang.String p0, android.net.Uri p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void reject(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void rejectWithMessage(java.lang.String p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void disconnect(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void silence(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void hold(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void unhold(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void onCallAudioStateChanged(java.lang.String p0, android.telecom.CallAudioState p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void playDtmfTone(java.lang.String p0, char p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void stopDtmfTone(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void conference(java.lang.String p0, java.lang.String p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void splitFromConference(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void mergeConference(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void swapConference(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void onPostDialContinue(java.lang.String p0, boolean p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void pullExternalCall(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void sendCallEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
        public void onExtrasChanged(java.lang.String p0, android.os.Bundle p1, android.telecom.Logging.Session.Info p2) throws android.os.RemoteException {}
        public void startRtt(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
        public void stopRtt(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public void respondToRttUpgradeRequest(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
        public void connectionServiceFocusLost(android.telecom.Logging.Session.Info p0) throws android.os.RemoteException {}
        public void connectionServiceFocusGained(android.telecom.Logging.Session.Info p0) throws android.os.RemoteException {}
        public void handoverFailed(java.lang.String p0, android.telecom.ConnectionRequest p1, int p2, android.telecom.Logging.Session.Info p3) throws android.os.RemoteException {}
        public void handoverComplete(java.lang.String p0, android.telecom.Logging.Session.Info p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
