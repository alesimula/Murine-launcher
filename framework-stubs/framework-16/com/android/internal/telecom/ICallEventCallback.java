package com.android.internal.telecom;

public interface ICallEventCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.ICallEventCallback";
    public void onAddCallControl(java.lang.String p0, int p1, com.android.internal.telecom.ICallControl p2, android.telecom.CallException p3) throws android.os.RemoteException;
    public void onSetActive(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void onSetInactive(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void onAnswer(java.lang.String p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public void onDisconnect(java.lang.String p0, android.telecom.DisconnectCause p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public void onCallStreamingStarted(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void onCallStreamingFailed(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onCallEndpointChanged(java.lang.String p0, android.telecom.CallEndpoint p1) throws android.os.RemoteException;
    public void onAvailableCallEndpointsChanged(java.lang.String p0, java.util.List<android.telecom.CallEndpoint> p1) throws android.os.RemoteException;
    public void onMuteStateChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void onVideoStateChanged(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void removeCallFromTransactionalServiceWrapper(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.ICallEventCallback {
        public Default() {}
        public void onAddCallControl(java.lang.String p0, int p1, com.android.internal.telecom.ICallControl p2, android.telecom.CallException p3) throws android.os.RemoteException {}
        public void onSetActive(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void onSetInactive(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void onAnswer(java.lang.String p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public void onDisconnect(java.lang.String p0, android.telecom.DisconnectCause p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public void onCallStreamingStarted(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void onCallStreamingFailed(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onCallEndpointChanged(java.lang.String p0, android.telecom.CallEndpoint p1) throws android.os.RemoteException {}
        public void onAvailableCallEndpointsChanged(java.lang.String p0, java.util.List<android.telecom.CallEndpoint> p1) throws android.os.RemoteException {}
        public void onMuteStateChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void onVideoStateChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void removeCallFromTransactionalServiceWrapper(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.ICallEventCallback {
        static final int TRANSACTION_onAddCallControl = 1;
        static final int TRANSACTION_onSetActive = 2;
        static final int TRANSACTION_onSetInactive = 3;
        static final int TRANSACTION_onAnswer = 4;
        static final int TRANSACTION_onDisconnect = 5;
        static final int TRANSACTION_onCallStreamingStarted = 6;
        static final int TRANSACTION_onCallStreamingFailed = 7;
        static final int TRANSACTION_onCallEndpointChanged = 8;
        static final int TRANSACTION_onAvailableCallEndpointsChanged = 9;
        static final int TRANSACTION_onMuteStateChanged = 10;
        static final int TRANSACTION_onVideoStateChanged = 11;
        static final int TRANSACTION_onEvent = 12;
        static final int TRANSACTION_removeCallFromTransactionalServiceWrapper = 13;
        public Stub() { super(); }
        public static com.android.internal.telecom.ICallEventCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telecom.ICallEventCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAddCallControl(java.lang.String p0, int p1, com.android.internal.telecom.ICallControl p2, android.telecom.CallException p3) throws android.os.RemoteException {}
            public void onSetActive(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void onSetInactive(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void onAnswer(java.lang.String p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public void onDisconnect(java.lang.String p0, android.telecom.DisconnectCause p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public void onCallStreamingStarted(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void onCallStreamingFailed(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onCallEndpointChanged(java.lang.String p0, android.telecom.CallEndpoint p1) throws android.os.RemoteException {}
            public void onAvailableCallEndpointsChanged(java.lang.String p0, java.util.List<android.telecom.CallEndpoint> p1) throws android.os.RemoteException {}
            public void onMuteStateChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void onVideoStateChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void removeCallFromTransactionalServiceWrapper(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
