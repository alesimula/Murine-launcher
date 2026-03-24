package com.android.internal.telephony;

public interface ICallForwardingInfoCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ICallForwardingInfoCallback";
    public void onCallForwardingInfoAvailable(android.telephony.CallForwardingInfo p0) throws android.os.RemoteException;
    public void onError(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.ICallForwardingInfoCallback {
        public Default() {}
        public void onCallForwardingInfoAvailable(android.telephony.CallForwardingInfo p0) throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ICallForwardingInfoCallback {
        static final int TRANSACTION_onCallForwardingInfoAvailable = 1;
        static final int TRANSACTION_onError = 2;
        public Stub() { super(); }
        public static com.android.internal.telephony.ICallForwardingInfoCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telephony.ICallForwardingInfoCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCallForwardingInfoAvailable(android.telephony.CallForwardingInfo p0) throws android.os.RemoteException {}
            public void onError(int p0) throws android.os.RemoteException {}
        }
    }
}
