package com.android.internal.telecom;

public interface RemoteServiceCallback extends android.os.IInterface {
    public void onError() throws android.os.RemoteException;
    public void onResult(java.util.List<android.content.ComponentName> p0, java.util.List<android.os.IBinder> p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.RemoteServiceCallback {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.RemoteServiceCallback";
        static final int TRANSACTION_onError = 1;
        static final int TRANSACTION_onResult = 2;
        public Stub() { super(); }
        public static com.android.internal.telecom.RemoteServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telecom.RemoteServiceCallback p0) { return false; }
        public static com.android.internal.telecom.RemoteServiceCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telecom.RemoteServiceCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.telecom.RemoteServiceCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onError() throws android.os.RemoteException {}
            public void onResult(java.util.List<android.content.ComponentName> p0, java.util.List<android.os.IBinder> p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.telecom.RemoteServiceCallback {
        public Default() {}
        public void onError() throws android.os.RemoteException {}
        public void onResult(java.util.List<android.content.ComponentName> p0, java.util.List<android.os.IBinder> p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
