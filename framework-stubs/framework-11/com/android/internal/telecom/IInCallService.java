package com.android.internal.telecom;

public interface IInCallService extends android.os.IInterface {
    public void setInCallAdapter(com.android.internal.telecom.IInCallAdapter p0) throws android.os.RemoteException;
    public void addCall(android.telecom.ParcelableCall p0) throws android.os.RemoteException;
    public void updateCall(android.telecom.ParcelableCall p0) throws android.os.RemoteException;
    public void setPostDial(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setPostDialWait(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void onCallAudioStateChanged(android.telecom.CallAudioState p0) throws android.os.RemoteException;
    public void bringToForeground(boolean p0) throws android.os.RemoteException;
    public void onCanAddCallChanged(boolean p0) throws android.os.RemoteException;
    public void silenceRinger() throws android.os.RemoteException;
    public void onConnectionEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void onRttUpgradeRequest(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onRttInitiationFailure(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onHandoverFailed(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onHandoverComplete(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.IInCallService {
        public Default() {}
        public void setInCallAdapter(com.android.internal.telecom.IInCallAdapter p0) throws android.os.RemoteException {}
        public void addCall(android.telecom.ParcelableCall p0) throws android.os.RemoteException {}
        public void updateCall(android.telecom.ParcelableCall p0) throws android.os.RemoteException {}
        public void setPostDial(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setPostDialWait(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onCallAudioStateChanged(android.telecom.CallAudioState p0) throws android.os.RemoteException {}
        public void bringToForeground(boolean p0) throws android.os.RemoteException {}
        public void onCanAddCallChanged(boolean p0) throws android.os.RemoteException {}
        public void silenceRinger() throws android.os.RemoteException {}
        public void onConnectionEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void onRttUpgradeRequest(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onRttInitiationFailure(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onHandoverFailed(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onHandoverComplete(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.IInCallService {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.IInCallService";
        static final int TRANSACTION_setInCallAdapter = 1;
        static final int TRANSACTION_addCall = 2;
        static final int TRANSACTION_updateCall = 3;
        static final int TRANSACTION_setPostDial = 4;
        static final int TRANSACTION_setPostDialWait = 5;
        static final int TRANSACTION_onCallAudioStateChanged = 6;
        static final int TRANSACTION_bringToForeground = 7;
        static final int TRANSACTION_onCanAddCallChanged = 8;
        static final int TRANSACTION_silenceRinger = 9;
        static final int TRANSACTION_onConnectionEvent = 10;
        static final int TRANSACTION_onRttUpgradeRequest = 11;
        static final int TRANSACTION_onRttInitiationFailure = 12;
        static final int TRANSACTION_onHandoverFailed = 13;
        static final int TRANSACTION_onHandoverComplete = 14;
        public Stub() { super(); }
        public static com.android.internal.telecom.IInCallService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telecom.IInCallService p0) { return false; }
        public static com.android.internal.telecom.IInCallService getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telecom.IInCallService {
            private android.os.IBinder mRemote;
            public static com.android.internal.telecom.IInCallService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setInCallAdapter(com.android.internal.telecom.IInCallAdapter p0) throws android.os.RemoteException {}
            public void addCall(android.telecom.ParcelableCall p0) throws android.os.RemoteException {}
            public void updateCall(android.telecom.ParcelableCall p0) throws android.os.RemoteException {}
            public void setPostDial(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setPostDialWait(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onCallAudioStateChanged(android.telecom.CallAudioState p0) throws android.os.RemoteException {}
            public void bringToForeground(boolean p0) throws android.os.RemoteException {}
            public void onCanAddCallChanged(boolean p0) throws android.os.RemoteException {}
            public void silenceRinger() throws android.os.RemoteException {}
            public void onConnectionEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void onRttUpgradeRequest(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onRttInitiationFailure(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onHandoverFailed(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onHandoverComplete(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
