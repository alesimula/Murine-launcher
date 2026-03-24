package com.android.internal.telephony;

public interface IApnSourceService extends android.os.IInterface {
    public android.content.ContentValues[] getApns(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.IApnSourceService {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.IApnSourceService";
        static final int TRANSACTION_getApns = 1;
        public Stub() { super(); }
        public static com.android.internal.telephony.IApnSourceService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telephony.IApnSourceService p0) { return false; }
        public static com.android.internal.telephony.IApnSourceService getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telephony.IApnSourceService {
            private android.os.IBinder mRemote;
            public static com.android.internal.telephony.IApnSourceService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.content.ContentValues[] getApns(int p0) throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements com.android.internal.telephony.IApnSourceService {
        public Default() {}
        public android.content.ContentValues[] getApns(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
