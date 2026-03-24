package com.android.internal.statusbar;

public interface ISessionListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.statusbar.ISessionListener";
    public void onSessionStarted(int p0, com.android.internal.logging.InstanceId p1) throws android.os.RemoteException;
    public void onSessionEnded(int p0, com.android.internal.logging.InstanceId p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.statusbar.ISessionListener {
        public Default() {}
        public void onSessionStarted(int p0, com.android.internal.logging.InstanceId p1) throws android.os.RemoteException {}
        public void onSessionEnded(int p0, com.android.internal.logging.InstanceId p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.statusbar.ISessionListener {
        static final int TRANSACTION_onSessionStarted = 1;
        static final int TRANSACTION_onSessionEnded = 2;
        public Stub() { super(); }
        public static com.android.internal.statusbar.ISessionListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.statusbar.ISessionListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSessionStarted(int p0, com.android.internal.logging.InstanceId p1) throws android.os.RemoteException {}
            public void onSessionEnded(int p0, com.android.internal.logging.InstanceId p1) throws android.os.RemoteException {}
        }
    }
}
