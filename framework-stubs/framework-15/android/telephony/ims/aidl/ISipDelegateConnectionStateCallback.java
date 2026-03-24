package android.telephony.ims.aidl;

public interface ISipDelegateConnectionStateCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.ISipDelegateConnectionStateCallback";
    public void onCreated(android.telephony.ims.aidl.ISipDelegate p0) throws android.os.RemoteException;
    public void onFeatureTagStatusChanged(android.telephony.ims.DelegateRegistrationState p0, java.util.List<android.telephony.ims.FeatureTagState> p1) throws android.os.RemoteException;
    public void onImsConfigurationChanged(android.telephony.ims.SipDelegateImsConfiguration p0) throws android.os.RemoteException;
    public void onConfigurationChanged(android.telephony.ims.SipDelegateConfiguration p0) throws android.os.RemoteException;
    public void onDestroyed(int p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.ISipDelegateConnectionStateCallback {
        public Default() {}
        public void onCreated(android.telephony.ims.aidl.ISipDelegate p0) throws android.os.RemoteException {}
        public void onFeatureTagStatusChanged(android.telephony.ims.DelegateRegistrationState p0, java.util.List<android.telephony.ims.FeatureTagState> p1) throws android.os.RemoteException {}
        public void onImsConfigurationChanged(android.telephony.ims.SipDelegateImsConfiguration p0) throws android.os.RemoteException {}
        public void onConfigurationChanged(android.telephony.ims.SipDelegateConfiguration p0) throws android.os.RemoteException {}
        public void onDestroyed(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.ISipDelegateConnectionStateCallback {
        static final int TRANSACTION_onCreated = 1;
        static final int TRANSACTION_onFeatureTagStatusChanged = 2;
        static final int TRANSACTION_onImsConfigurationChanged = 3;
        static final int TRANSACTION_onConfigurationChanged = 4;
        static final int TRANSACTION_onDestroyed = 5;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.ISipDelegateConnectionStateCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.ims.aidl.ISipDelegateConnectionStateCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCreated(android.telephony.ims.aidl.ISipDelegate p0) throws android.os.RemoteException {}
            public void onFeatureTagStatusChanged(android.telephony.ims.DelegateRegistrationState p0, java.util.List<android.telephony.ims.FeatureTagState> p1) throws android.os.RemoteException {}
            public void onImsConfigurationChanged(android.telephony.ims.SipDelegateImsConfiguration p0) throws android.os.RemoteException {}
            public void onConfigurationChanged(android.telephony.ims.SipDelegateConfiguration p0) throws android.os.RemoteException {}
            public void onDestroyed(int p0) throws android.os.RemoteException {}
        }
    }
}
