package android.telephony.ims.aidl;

public interface IImsConfig extends android.os.IInterface {
    public void addImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException;
    public void removeImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException;
    public int getConfigInt(int p0) throws android.os.RemoteException;
    public java.lang.String getConfigString(int p0) throws android.os.RemoteException;
    public int setConfigInt(int p0, int p1) throws android.os.RemoteException;
    public int setConfigString(int p0, java.lang.String p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsConfig {
        private static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsConfig";
        static final int TRANSACTION_addImsConfigCallback = 1;
        static final int TRANSACTION_removeImsConfigCallback = 2;
        static final int TRANSACTION_getConfigInt = 3;
        static final int TRANSACTION_getConfigString = 4;
        static final int TRANSACTION_setConfigInt = 5;
        static final int TRANSACTION_setConfigString = 6;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsConfig asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IImsConfig p0) { return false; }
        public static android.telephony.ims.aidl.IImsConfig getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IImsConfig {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IImsConfig sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException {}
            public void removeImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException {}
            public int getConfigInt(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getConfigString(int p0) throws android.os.RemoteException { return null; }
            public int setConfigInt(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int setConfigString(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        }
    }

    public static class Default implements android.telephony.ims.aidl.IImsConfig {
        public Default() {}
        public void addImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException {}
        public void removeImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException {}
        public int getConfigInt(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getConfigString(int p0) throws android.os.RemoteException { return null; }
        public int setConfigInt(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int setConfigString(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }
}
