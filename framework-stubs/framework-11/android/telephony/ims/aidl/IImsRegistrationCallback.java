package android.telephony.ims.aidl;

public interface IImsRegistrationCallback extends android.os.IInterface {
    public void onRegistered(int p0) throws android.os.RemoteException;
    public void onRegistering(int p0) throws android.os.RemoteException;
    public void onDeregistered(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;
    public void onSubscriberAssociatedUriChanged(android.net.Uri[] p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsRegistrationCallback {
        public Default() {}
        public void onRegistered(int p0) throws android.os.RemoteException {}
        public void onRegistering(int p0) throws android.os.RemoteException {}
        public void onDeregistered(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        public void onSubscriberAssociatedUriChanged(android.net.Uri[] p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsRegistrationCallback {
        private static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsRegistrationCallback";
        static final int TRANSACTION_onRegistered = 1;
        static final int TRANSACTION_onRegistering = 2;
        static final int TRANSACTION_onDeregistered = 3;
        static final int TRANSACTION_onTechnologyChangeFailed = 4;
        static final int TRANSACTION_onSubscriberAssociatedUriChanged = 5;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsRegistrationCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IImsRegistrationCallback p0) { return false; }
        public static android.telephony.ims.aidl.IImsRegistrationCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IImsRegistrationCallback {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IImsRegistrationCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRegistered(int p0) throws android.os.RemoteException {}
            public void onRegistering(int p0) throws android.os.RemoteException {}
            public void onDeregistered(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
            public void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
            public void onSubscriberAssociatedUriChanged(android.net.Uri[] p0) throws android.os.RemoteException {}
        }
    }
}
