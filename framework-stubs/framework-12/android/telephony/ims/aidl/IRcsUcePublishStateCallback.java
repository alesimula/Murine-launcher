package android.telephony.ims.aidl;

public interface IRcsUcePublishStateCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IRcsUcePublishStateCallback";
    public void onPublishStateChanged(int p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IRcsUcePublishStateCallback {
        public Default() {}
        public void onPublishStateChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IRcsUcePublishStateCallback {
        static final int TRANSACTION_onPublishStateChanged = 1;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IRcsUcePublishStateCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IRcsUcePublishStateCallback p0) { return false; }
        public static android.telephony.ims.aidl.IRcsUcePublishStateCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IRcsUcePublishStateCallback {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IRcsUcePublishStateCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onPublishStateChanged(int p0) throws android.os.RemoteException {}
        }
    }
}
