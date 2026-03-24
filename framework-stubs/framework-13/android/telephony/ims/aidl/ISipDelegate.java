package android.telephony.ims.aidl;

public interface ISipDelegate extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.ISipDelegate";
    public void sendMessage(android.telephony.ims.SipMessage p0, long p1) throws android.os.RemoteException;
    public void notifyMessageReceived(java.lang.String p0) throws android.os.RemoteException;
    public void notifyMessageReceiveError(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void cleanupSession(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.ISipDelegate {
        public Default() {}
        public void sendMessage(android.telephony.ims.SipMessage p0, long p1) throws android.os.RemoteException {}
        public void notifyMessageReceived(java.lang.String p0) throws android.os.RemoteException {}
        public void notifyMessageReceiveError(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void cleanupSession(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.ISipDelegate {
        static final int TRANSACTION_sendMessage = 1;
        static final int TRANSACTION_notifyMessageReceived = 2;
        static final int TRANSACTION_notifyMessageReceiveError = 3;
        static final int TRANSACTION_cleanupSession = 4;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.ISipDelegate asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.ims.aidl.ISipDelegate {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void sendMessage(android.telephony.ims.SipMessage p0, long p1) throws android.os.RemoteException {}
            public void notifyMessageReceived(java.lang.String p0) throws android.os.RemoteException {}
            public void notifyMessageReceiveError(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void cleanupSession(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
