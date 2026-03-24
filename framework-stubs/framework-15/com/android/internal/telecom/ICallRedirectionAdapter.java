package com.android.internal.telecom;

public interface ICallRedirectionAdapter extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.ICallRedirectionAdapter";
    public void cancelCall() throws android.os.RemoteException;
    public void placeCallUnmodified() throws android.os.RemoteException;
    public void redirectCall(android.net.Uri p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.ICallRedirectionAdapter {
        public Default() {}
        public void cancelCall() throws android.os.RemoteException {}
        public void placeCallUnmodified() throws android.os.RemoteException {}
        public void redirectCall(android.net.Uri p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.ICallRedirectionAdapter {
        static final int TRANSACTION_cancelCall = 1;
        static final int TRANSACTION_placeCallUnmodified = 2;
        static final int TRANSACTION_redirectCall = 3;
        public Stub() { super(); }
        public static com.android.internal.telecom.ICallRedirectionAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telecom.ICallRedirectionAdapter {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void cancelCall() throws android.os.RemoteException {}
            public void placeCallUnmodified() throws android.os.RemoteException {}
            public void redirectCall(android.net.Uri p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException {}
        }
    }
}
