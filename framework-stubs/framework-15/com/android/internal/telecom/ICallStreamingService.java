package com.android.internal.telecom;

public interface ICallStreamingService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.ICallStreamingService";
    public void setStreamingCallAdapter(com.android.internal.telecom.IStreamingCallAdapter p0) throws android.os.RemoteException;
    public void onCallStreamingStarted(android.telecom.StreamingCall p0) throws android.os.RemoteException;
    public void onCallStreamingStopped() throws android.os.RemoteException;
    public void onCallStreamingStateChanged(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.ICallStreamingService {
        public Default() {}
        public void setStreamingCallAdapter(com.android.internal.telecom.IStreamingCallAdapter p0) throws android.os.RemoteException {}
        public void onCallStreamingStarted(android.telecom.StreamingCall p0) throws android.os.RemoteException {}
        public void onCallStreamingStopped() throws android.os.RemoteException {}
        public void onCallStreamingStateChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.ICallStreamingService {
        static final int TRANSACTION_setStreamingCallAdapter = 1;
        static final int TRANSACTION_onCallStreamingStarted = 2;
        static final int TRANSACTION_onCallStreamingStopped = 3;
        static final int TRANSACTION_onCallStreamingStateChanged = 4;
        public Stub() { super(); }
        public static com.android.internal.telecom.ICallStreamingService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telecom.ICallStreamingService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setStreamingCallAdapter(com.android.internal.telecom.IStreamingCallAdapter p0) throws android.os.RemoteException {}
            public void onCallStreamingStarted(android.telecom.StreamingCall p0) throws android.os.RemoteException {}
            public void onCallStreamingStopped() throws android.os.RemoteException {}
            public void onCallStreamingStateChanged(int p0) throws android.os.RemoteException {}
        }
    }
}
