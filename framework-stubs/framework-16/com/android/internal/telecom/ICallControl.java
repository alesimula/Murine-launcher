package com.android.internal.telecom;

public interface ICallControl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.ICallControl";
    public void setActive(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void answer(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public void setInactive(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void disconnect(java.lang.String p0, android.telecom.DisconnectCause p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public void startCallStreaming(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void requestCallEndpointChange(android.telecom.CallEndpoint p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void setMuteState(boolean p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void sendEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void requestVideoState(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.ICallControl {
        public Default() {}
        public void setActive(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void answer(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public void setInactive(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void disconnect(java.lang.String p0, android.telecom.DisconnectCause p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public void startCallStreaming(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void requestCallEndpointChange(android.telecom.CallEndpoint p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void setMuteState(boolean p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void sendEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void requestVideoState(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.ICallControl {
        static final int TRANSACTION_setActive = 1;
        static final int TRANSACTION_answer = 2;
        static final int TRANSACTION_setInactive = 3;
        static final int TRANSACTION_disconnect = 4;
        static final int TRANSACTION_startCallStreaming = 5;
        static final int TRANSACTION_requestCallEndpointChange = 6;
        static final int TRANSACTION_setMuteState = 7;
        static final int TRANSACTION_sendEvent = 8;
        static final int TRANSACTION_requestVideoState = 9;
        public Stub() { super(); }
        public static com.android.internal.telecom.ICallControl asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telecom.ICallControl {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setActive(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void answer(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public void setInactive(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void disconnect(java.lang.String p0, android.telecom.DisconnectCause p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public void startCallStreaming(java.lang.String p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void requestCallEndpointChange(android.telecom.CallEndpoint p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void setMuteState(boolean p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void sendEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void requestVideoState(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        }
    }
}
