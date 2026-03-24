package android.telephony.ims.aidl;

public interface IImsConfigCallback extends android.os.IInterface {
    public void onIntConfigChanged(int p0, int p1) throws android.os.RemoteException;
    public void onStringConfigChanged(int p0, java.lang.String p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsConfigCallback {
        private static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsConfigCallback";
        static final int TRANSACTION_onIntConfigChanged = 1;
        static final int TRANSACTION_onStringConfigChanged = 2;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsConfigCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IImsConfigCallback p0) { return false; }
        public static android.telephony.ims.aidl.IImsConfigCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IImsConfigCallback {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IImsConfigCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onIntConfigChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onStringConfigChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.telephony.ims.aidl.IImsConfigCallback {
        public Default() {}
        public void onIntConfigChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onStringConfigChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
