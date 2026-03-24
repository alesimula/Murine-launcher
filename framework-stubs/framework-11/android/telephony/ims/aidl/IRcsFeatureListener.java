package android.telephony.ims.aidl;

public interface IRcsFeatureListener extends android.os.IInterface {
    public void onCommandUpdate(int p0, int p1) throws android.os.RemoteException;
    public void onNetworkResponse(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void onCapabilityRequestResponsePresence(java.util.List<android.telephony.ims.RcsContactUceCapability> p0, int p1) throws android.os.RemoteException;
    public void onNotifyUpdateCapabilities(int p0) throws android.os.RemoteException;
    public void onUnpublish() throws android.os.RemoteException;
    public void onCapabilityRequestResponseOptions(int p0, java.lang.String p1, android.telephony.ims.RcsContactUceCapability p2, int p3) throws android.os.RemoteException;
    public void onRemoteCapabilityRequest(android.net.Uri p0, android.telephony.ims.RcsContactUceCapability p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IRcsFeatureListener {
        public Default() {}
        public void onCommandUpdate(int p0, int p1) throws android.os.RemoteException {}
        public void onNetworkResponse(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void onCapabilityRequestResponsePresence(java.util.List<android.telephony.ims.RcsContactUceCapability> p0, int p1) throws android.os.RemoteException {}
        public void onNotifyUpdateCapabilities(int p0) throws android.os.RemoteException {}
        public void onUnpublish() throws android.os.RemoteException {}
        public void onCapabilityRequestResponseOptions(int p0, java.lang.String p1, android.telephony.ims.RcsContactUceCapability p2, int p3) throws android.os.RemoteException {}
        public void onRemoteCapabilityRequest(android.net.Uri p0, android.telephony.ims.RcsContactUceCapability p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IRcsFeatureListener {
        private static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IRcsFeatureListener";
        static final int TRANSACTION_onCommandUpdate = 1;
        static final int TRANSACTION_onNetworkResponse = 2;
        static final int TRANSACTION_onCapabilityRequestResponsePresence = 3;
        static final int TRANSACTION_onNotifyUpdateCapabilities = 4;
        static final int TRANSACTION_onUnpublish = 5;
        static final int TRANSACTION_onCapabilityRequestResponseOptions = 6;
        static final int TRANSACTION_onRemoteCapabilityRequest = 7;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IRcsFeatureListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IRcsFeatureListener p0) { return false; }
        public static android.telephony.ims.aidl.IRcsFeatureListener getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IRcsFeatureListener {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IRcsFeatureListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCommandUpdate(int p0, int p1) throws android.os.RemoteException {}
            public void onNetworkResponse(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void onCapabilityRequestResponsePresence(java.util.List<android.telephony.ims.RcsContactUceCapability> p0, int p1) throws android.os.RemoteException {}
            public void onNotifyUpdateCapabilities(int p0) throws android.os.RemoteException {}
            public void onUnpublish() throws android.os.RemoteException {}
            public void onCapabilityRequestResponseOptions(int p0, java.lang.String p1, android.telephony.ims.RcsContactUceCapability p2, int p3) throws android.os.RemoteException {}
            public void onRemoteCapabilityRequest(android.net.Uri p0, android.telephony.ims.RcsContactUceCapability p1, int p2) throws android.os.RemoteException {}
        }
    }
}
