package android.telephony.ims.aidl;

public interface ISipDelegateMessageCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.ISipDelegateMessageCallback";
    public void onMessageReceived(android.telephony.ims.SipMessage p0) throws android.os.RemoteException;
    public void onMessageSent(java.lang.String p0) throws android.os.RemoteException;
    public void onMessageSendFailure(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.ISipDelegateMessageCallback {
        public Default() {}
        public void onMessageReceived(android.telephony.ims.SipMessage p0) throws android.os.RemoteException {}
        public void onMessageSent(java.lang.String p0) throws android.os.RemoteException {}
        public void onMessageSendFailure(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.ISipDelegateMessageCallback {
        static final int TRANSACTION_onMessageReceived = 1;
        static final int TRANSACTION_onMessageSent = 2;
        static final int TRANSACTION_onMessageSendFailure = 3;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.ISipDelegateMessageCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.ISipDelegateMessageCallback p0) { return false; }
        public static android.telephony.ims.aidl.ISipDelegateMessageCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.ISipDelegateMessageCallback {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.ISipDelegateMessageCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onMessageReceived(android.telephony.ims.SipMessage p0) throws android.os.RemoteException {}
            public void onMessageSent(java.lang.String p0) throws android.os.RemoteException {}
            public void onMessageSendFailure(java.lang.String p0, int p1) throws android.os.RemoteException {}
        }
    }
}
