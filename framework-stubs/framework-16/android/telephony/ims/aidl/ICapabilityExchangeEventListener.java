package android.telephony.ims.aidl;

public interface ICapabilityExchangeEventListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.ICapabilityExchangeEventListener";
    public void onRequestPublishCapabilities(int p0) throws android.os.RemoteException;
    public void onUnpublish() throws android.os.RemoteException;
    public void onPublishUpdated(android.telephony.ims.SipDetails p0) throws android.os.RemoteException;
    public void onRemoteCapabilityRequest(android.net.Uri p0, java.util.List<java.lang.String> p1, android.telephony.ims.aidl.IOptionsRequestCallback p2) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.ICapabilityExchangeEventListener {
        public Default() {}
        public void onRequestPublishCapabilities(int p0) throws android.os.RemoteException {}
        public void onUnpublish() throws android.os.RemoteException {}
        public void onPublishUpdated(android.telephony.ims.SipDetails p0) throws android.os.RemoteException {}
        public void onRemoteCapabilityRequest(android.net.Uri p0, java.util.List<java.lang.String> p1, android.telephony.ims.aidl.IOptionsRequestCallback p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.ICapabilityExchangeEventListener {
        static final int TRANSACTION_onRequestPublishCapabilities = 1;
        static final int TRANSACTION_onUnpublish = 2;
        static final int TRANSACTION_onPublishUpdated = 3;
        static final int TRANSACTION_onRemoteCapabilityRequest = 4;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.ICapabilityExchangeEventListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.ims.aidl.ICapabilityExchangeEventListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRequestPublishCapabilities(int p0) throws android.os.RemoteException {}
            public void onUnpublish() throws android.os.RemoteException {}
            public void onPublishUpdated(android.telephony.ims.SipDetails p0) throws android.os.RemoteException {}
            public void onRemoteCapabilityRequest(android.net.Uri p0, java.util.List<java.lang.String> p1, android.telephony.ims.aidl.IOptionsRequestCallback p2) throws android.os.RemoteException {}
        }
    }
}
