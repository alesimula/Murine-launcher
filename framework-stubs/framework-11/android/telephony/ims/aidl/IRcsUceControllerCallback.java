package android.telephony.ims.aidl;

public interface IRcsUceControllerCallback extends android.os.IInterface {
    public void onCapabilitiesReceived(java.util.List<android.telephony.ims.RcsContactUceCapability> p0) throws android.os.RemoteException;
    public void onError(int p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IRcsUceControllerCallback {
        public Default() {}
        public void onCapabilitiesReceived(java.util.List<android.telephony.ims.RcsContactUceCapability> p0) throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IRcsUceControllerCallback {
        private static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IRcsUceControllerCallback";
        static final int TRANSACTION_onCapabilitiesReceived = 1;
        static final int TRANSACTION_onError = 2;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IRcsUceControllerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IRcsUceControllerCallback p0) { return false; }
        public static android.telephony.ims.aidl.IRcsUceControllerCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IRcsUceControllerCallback {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IRcsUceControllerCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCapabilitiesReceived(java.util.List<android.telephony.ims.RcsContactUceCapability> p0) throws android.os.RemoteException {}
            public void onError(int p0) throws android.os.RemoteException {}
        }
    }
}
