package android.telephony.ims.aidl;

public interface IRcsUceControllerCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IRcsUceControllerCallback";
    public void onCapabilitiesReceived(java.util.List<android.telephony.ims.RcsContactUceCapability> p0) throws android.os.RemoteException;
    public void onComplete() throws android.os.RemoteException;
    public void onError(int p0, long p1) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IRcsUceControllerCallback {
        public Default() {}
        public void onCapabilitiesReceived(java.util.List<android.telephony.ims.RcsContactUceCapability> p0) throws android.os.RemoteException {}
        public void onComplete() throws android.os.RemoteException {}
        public void onError(int p0, long p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IRcsUceControllerCallback {
        static final int TRANSACTION_onCapabilitiesReceived = 1;
        static final int TRANSACTION_onComplete = 2;
        static final int TRANSACTION_onError = 3;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IRcsUceControllerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.ims.aidl.IRcsUceControllerCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCapabilitiesReceived(java.util.List<android.telephony.ims.RcsContactUceCapability> p0) throws android.os.RemoteException {}
            public void onComplete() throws android.os.RemoteException {}
            public void onError(int p0, long p1) throws android.os.RemoteException {}
        }
    }
}
