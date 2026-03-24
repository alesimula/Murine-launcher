package com.android.internal.telecom;

public interface IInCallAdapter extends android.os.IInterface {
    public void answerCall(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void deflectCall(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException;
    public void rejectCall(java.lang.String p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public void disconnectCall(java.lang.String p0) throws android.os.RemoteException;
    public void holdCall(java.lang.String p0) throws android.os.RemoteException;
    public void unholdCall(java.lang.String p0) throws android.os.RemoteException;
    public void mute(boolean p0) throws android.os.RemoteException;
    public void setAudioRoute(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void playDtmfTone(java.lang.String p0, char p1) throws android.os.RemoteException;
    public void stopDtmfTone(java.lang.String p0) throws android.os.RemoteException;
    public void postDialContinue(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void phoneAccountSelected(java.lang.String p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException;
    public void conference(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void splitFromConference(java.lang.String p0) throws android.os.RemoteException;
    public void mergeConference(java.lang.String p0) throws android.os.RemoteException;
    public void swapConference(java.lang.String p0) throws android.os.RemoteException;
    public void turnOnProximitySensor() throws android.os.RemoteException;
    public void turnOffProximitySensor(boolean p0) throws android.os.RemoteException;
    public void pullExternalCall(java.lang.String p0) throws android.os.RemoteException;
    public void sendCallEvent(java.lang.String p0, java.lang.String p1, int p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void putExtras(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void removeExtras(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public void sendRttRequest(java.lang.String p0) throws android.os.RemoteException;
    public void respondToRttRequest(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void stopRtt(java.lang.String p0) throws android.os.RemoteException;
    public void setRttMode(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void handoverTo(java.lang.String p0, android.telecom.PhoneAccountHandle p1, int p2, android.os.Bundle p3) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.IInCallAdapter {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.IInCallAdapter";
        static final int TRANSACTION_answerCall = 1;
        static final int TRANSACTION_deflectCall = 2;
        static final int TRANSACTION_rejectCall = 3;
        static final int TRANSACTION_disconnectCall = 4;
        static final int TRANSACTION_holdCall = 5;
        static final int TRANSACTION_unholdCall = 6;
        static final int TRANSACTION_mute = 7;
        static final int TRANSACTION_setAudioRoute = 8;
        static final int TRANSACTION_playDtmfTone = 9;
        static final int TRANSACTION_stopDtmfTone = 10;
        static final int TRANSACTION_postDialContinue = 11;
        static final int TRANSACTION_phoneAccountSelected = 12;
        static final int TRANSACTION_conference = 13;
        static final int TRANSACTION_splitFromConference = 14;
        static final int TRANSACTION_mergeConference = 15;
        static final int TRANSACTION_swapConference = 16;
        static final int TRANSACTION_turnOnProximitySensor = 17;
        static final int TRANSACTION_turnOffProximitySensor = 18;
        static final int TRANSACTION_pullExternalCall = 19;
        static final int TRANSACTION_sendCallEvent = 20;
        static final int TRANSACTION_putExtras = 21;
        static final int TRANSACTION_removeExtras = 22;
        static final int TRANSACTION_sendRttRequest = 23;
        static final int TRANSACTION_respondToRttRequest = 24;
        static final int TRANSACTION_stopRtt = 25;
        static final int TRANSACTION_setRttMode = 26;
        static final int TRANSACTION_handoverTo = 27;
        public Stub() { super(); }
        public static com.android.internal.telecom.IInCallAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telecom.IInCallAdapter p0) { return false; }
        public static com.android.internal.telecom.IInCallAdapter getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telecom.IInCallAdapter {
            private android.os.IBinder mRemote;
            public static com.android.internal.telecom.IInCallAdapter sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void answerCall(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void deflectCall(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException {}
            public void rejectCall(java.lang.String p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
            public void disconnectCall(java.lang.String p0) throws android.os.RemoteException {}
            public void holdCall(java.lang.String p0) throws android.os.RemoteException {}
            public void unholdCall(java.lang.String p0) throws android.os.RemoteException {}
            public void mute(boolean p0) throws android.os.RemoteException {}
            public void setAudioRoute(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void playDtmfTone(java.lang.String p0, char p1) throws android.os.RemoteException {}
            public void stopDtmfTone(java.lang.String p0) throws android.os.RemoteException {}
            public void postDialContinue(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void phoneAccountSelected(java.lang.String p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException {}
            public void conference(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void splitFromConference(java.lang.String p0) throws android.os.RemoteException {}
            public void mergeConference(java.lang.String p0) throws android.os.RemoteException {}
            public void swapConference(java.lang.String p0) throws android.os.RemoteException {}
            public void turnOnProximitySensor() throws android.os.RemoteException {}
            public void turnOffProximitySensor(boolean p0) throws android.os.RemoteException {}
            public void pullExternalCall(java.lang.String p0) throws android.os.RemoteException {}
            public void sendCallEvent(java.lang.String p0, java.lang.String p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void putExtras(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void removeExtras(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public void sendRttRequest(java.lang.String p0) throws android.os.RemoteException {}
            public void respondToRttRequest(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void stopRtt(java.lang.String p0) throws android.os.RemoteException {}
            public void setRttMode(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void handoverTo(java.lang.String p0, android.telecom.PhoneAccountHandle p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.telecom.IInCallAdapter {
        public Default() {}
        public void answerCall(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void deflectCall(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException {}
        public void rejectCall(java.lang.String p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
        public void disconnectCall(java.lang.String p0) throws android.os.RemoteException {}
        public void holdCall(java.lang.String p0) throws android.os.RemoteException {}
        public void unholdCall(java.lang.String p0) throws android.os.RemoteException {}
        public void mute(boolean p0) throws android.os.RemoteException {}
        public void setAudioRoute(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void playDtmfTone(java.lang.String p0, char p1) throws android.os.RemoteException {}
        public void stopDtmfTone(java.lang.String p0) throws android.os.RemoteException {}
        public void postDialContinue(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void phoneAccountSelected(java.lang.String p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException {}
        public void conference(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void splitFromConference(java.lang.String p0) throws android.os.RemoteException {}
        public void mergeConference(java.lang.String p0) throws android.os.RemoteException {}
        public void swapConference(java.lang.String p0) throws android.os.RemoteException {}
        public void turnOnProximitySensor() throws android.os.RemoteException {}
        public void turnOffProximitySensor(boolean p0) throws android.os.RemoteException {}
        public void pullExternalCall(java.lang.String p0) throws android.os.RemoteException {}
        public void sendCallEvent(java.lang.String p0, java.lang.String p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void putExtras(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void removeExtras(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public void sendRttRequest(java.lang.String p0) throws android.os.RemoteException {}
        public void respondToRttRequest(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void stopRtt(java.lang.String p0) throws android.os.RemoteException {}
        public void setRttMode(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void handoverTo(java.lang.String p0, android.telecom.PhoneAccountHandle p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
