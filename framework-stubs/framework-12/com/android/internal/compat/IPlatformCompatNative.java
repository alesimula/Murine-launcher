package com.android.internal.compat;

public interface IPlatformCompatNative extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.compat.IPlatformCompatNative";
    public void reportChangeByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void reportChangeByUid(long p0, int p1) throws android.os.RemoteException;
    public boolean isChangeEnabledByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean isChangeEnabledByUid(long p0, int p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.compat.IPlatformCompatNative {
        public Default() {}
        public void reportChangeByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void reportChangeByUid(long p0, int p1) throws android.os.RemoteException {}
        public boolean isChangeEnabledByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isChangeEnabledByUid(long p0, int p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.compat.IPlatformCompatNative {
        static final int TRANSACTION_reportChangeByPackageName = 1;
        static final int TRANSACTION_reportChangeByUid = 2;
        static final int TRANSACTION_isChangeEnabledByPackageName = 3;
        static final int TRANSACTION_isChangeEnabledByUid = 4;
        public Stub() { super(); }
        public static com.android.internal.compat.IPlatformCompatNative asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.compat.IPlatformCompatNative p0) { return false; }
        public static com.android.internal.compat.IPlatformCompatNative getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.compat.IPlatformCompatNative {
            private android.os.IBinder mRemote;
            public static com.android.internal.compat.IPlatformCompatNative sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void reportChangeByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void reportChangeByUid(long p0, int p1) throws android.os.RemoteException {}
            public boolean isChangeEnabledByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isChangeEnabledByUid(long p0, int p1) throws android.os.RemoteException { return false; }
        }
    }
}
