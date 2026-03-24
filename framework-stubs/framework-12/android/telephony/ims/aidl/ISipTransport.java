package android.telephony.ims.aidl;

public interface ISipTransport extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.ISipTransport";
    public void createSipDelegate(int p0, android.telephony.ims.DelegateRequest p1, android.telephony.ims.aidl.ISipDelegateStateCallback p2, android.telephony.ims.aidl.ISipDelegateMessageCallback p3) throws android.os.RemoteException;
    public void destroySipDelegate(android.telephony.ims.aidl.ISipDelegate p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.ISipTransport {
        public Default() {}
        public void createSipDelegate(int p0, android.telephony.ims.DelegateRequest p1, android.telephony.ims.aidl.ISipDelegateStateCallback p2, android.telephony.ims.aidl.ISipDelegateMessageCallback p3) throws android.os.RemoteException {}
        public void destroySipDelegate(android.telephony.ims.aidl.ISipDelegate p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.ISipTransport {
        static final int TRANSACTION_createSipDelegate = 1;
        static final int TRANSACTION_destroySipDelegate = 2;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.ISipTransport asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.ISipTransport p0) { return false; }
        public static android.telephony.ims.aidl.ISipTransport getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.ISipTransport {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.ISipTransport sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void createSipDelegate(int p0, android.telephony.ims.DelegateRequest p1, android.telephony.ims.aidl.ISipDelegateStateCallback p2, android.telephony.ims.aidl.ISipDelegateMessageCallback p3) throws android.os.RemoteException {}
            public void destroySipDelegate(android.telephony.ims.aidl.ISipDelegate p0, int p1) throws android.os.RemoteException {}
        }
    }
}
