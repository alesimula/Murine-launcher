package com.android.ims.internal.uce.options;

public interface IOptionsService extends android.os.IInterface {
    public com.android.ims.internal.uce.common.StatusCode getVersion(int p0) throws android.os.RemoteException;
    public com.android.ims.internal.uce.common.StatusCode addListener(int p0, com.android.ims.internal.uce.options.IOptionsListener p1, com.android.ims.internal.uce.common.UceLong p2) throws android.os.RemoteException;
    public com.android.ims.internal.uce.common.StatusCode removeListener(int p0, com.android.ims.internal.uce.common.UceLong p1) throws android.os.RemoteException;
    public com.android.ims.internal.uce.common.StatusCode setMyInfo(int p0, com.android.ims.internal.uce.common.CapInfo p1, int p2) throws android.os.RemoteException;
    public com.android.ims.internal.uce.common.StatusCode getMyInfo(int p0, int p1) throws android.os.RemoteException;
    public com.android.ims.internal.uce.common.StatusCode getContactCap(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public com.android.ims.internal.uce.common.StatusCode getContactListCap(int p0, java.lang.String[] p1, int p2) throws android.os.RemoteException;
    public com.android.ims.internal.uce.common.StatusCode responseIncomingOptions(int p0, int p1, int p2, java.lang.String p3, com.android.ims.internal.uce.options.OptionsCapInfo p4, boolean p5) throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.uce.options.IOptionsService {
        public Default() {}
        public com.android.ims.internal.uce.common.StatusCode getVersion(int p0) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.uce.common.StatusCode addListener(int p0, com.android.ims.internal.uce.options.IOptionsListener p1, com.android.ims.internal.uce.common.UceLong p2) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.uce.common.StatusCode removeListener(int p0, com.android.ims.internal.uce.common.UceLong p1) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.uce.common.StatusCode setMyInfo(int p0, com.android.ims.internal.uce.common.CapInfo p1, int p2) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.uce.common.StatusCode getMyInfo(int p0, int p1) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.uce.common.StatusCode getContactCap(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.uce.common.StatusCode getContactListCap(int p0, java.lang.String[] p1, int p2) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.uce.common.StatusCode responseIncomingOptions(int p0, int p1, int p2, java.lang.String p3, com.android.ims.internal.uce.options.OptionsCapInfo p4, boolean p5) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.uce.options.IOptionsService {
        private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.uce.options.IOptionsService";
        static final int TRANSACTION_getVersion = 1;
        static final int TRANSACTION_addListener = 2;
        static final int TRANSACTION_removeListener = 3;
        static final int TRANSACTION_setMyInfo = 4;
        static final int TRANSACTION_getMyInfo = 5;
        static final int TRANSACTION_getContactCap = 6;
        static final int TRANSACTION_getContactListCap = 7;
        static final int TRANSACTION_responseIncomingOptions = 8;
        public Stub() { super(); }
        public static com.android.ims.internal.uce.options.IOptionsService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.ims.internal.uce.options.IOptionsService p0) { return false; }
        public static com.android.ims.internal.uce.options.IOptionsService getDefaultImpl() { return null; }

        private static class Proxy implements com.android.ims.internal.uce.options.IOptionsService {
            private android.os.IBinder mRemote;
            public static com.android.ims.internal.uce.options.IOptionsService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public com.android.ims.internal.uce.common.StatusCode getVersion(int p0) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.uce.common.StatusCode addListener(int p0, com.android.ims.internal.uce.options.IOptionsListener p1, com.android.ims.internal.uce.common.UceLong p2) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.uce.common.StatusCode removeListener(int p0, com.android.ims.internal.uce.common.UceLong p1) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.uce.common.StatusCode setMyInfo(int p0, com.android.ims.internal.uce.common.CapInfo p1, int p2) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.uce.common.StatusCode getMyInfo(int p0, int p1) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.uce.common.StatusCode getContactCap(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.uce.common.StatusCode getContactListCap(int p0, java.lang.String[] p1, int p2) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.uce.common.StatusCode responseIncomingOptions(int p0, int p1, int p2, java.lang.String p3, com.android.ims.internal.uce.options.OptionsCapInfo p4, boolean p5) throws android.os.RemoteException { return null; }
        }
    }
}
