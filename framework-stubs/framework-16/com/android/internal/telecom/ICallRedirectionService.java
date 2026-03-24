package com.android.internal.telecom;

public interface ICallRedirectionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.ICallRedirectionService";
    public void placeCall(com.android.internal.telecom.ICallRedirectionAdapter p0, android.net.Uri p1, android.telecom.PhoneAccountHandle p2, boolean p3) throws android.os.RemoteException;
    public void notifyTimeout() throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.ICallRedirectionService {
        public Default() {}
        public void placeCall(com.android.internal.telecom.ICallRedirectionAdapter p0, android.net.Uri p1, android.telecom.PhoneAccountHandle p2, boolean p3) throws android.os.RemoteException {}
        public void notifyTimeout() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.ICallRedirectionService {
        static final int TRANSACTION_placeCall = 1;
        static final int TRANSACTION_notifyTimeout = 2;
        public Stub() { super(); }
        public static com.android.internal.telecom.ICallRedirectionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telecom.ICallRedirectionService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void placeCall(com.android.internal.telecom.ICallRedirectionAdapter p0, android.net.Uri p1, android.telecom.PhoneAccountHandle p2, boolean p3) throws android.os.RemoteException {}
            public void notifyTimeout() throws android.os.RemoteException {}
        }
    }
}
