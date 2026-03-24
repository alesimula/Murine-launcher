package android.net.wifi.nl80211;

public interface ISendMgmtFrameEvent extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.wifi.nl80211.ISendMgmtFrameEvent";
    public static final int SEND_MGMT_FRAME_ERROR_UNKNOWN = 1;
    public static final int SEND_MGMT_FRAME_ERROR_MCS_UNSUPPORTED = 2;
    public static final int SEND_MGMT_FRAME_ERROR_NO_ACK = 3;
    public static final int SEND_MGMT_FRAME_ERROR_TIMEOUT = 4;
    public static final int SEND_MGMT_FRAME_ERROR_ALREADY_STARTED = 5;
    public void OnAck(int p0) throws android.os.RemoteException;
    public void OnFailure(int p0) throws android.os.RemoteException;

    public static class Default implements android.net.wifi.nl80211.ISendMgmtFrameEvent {
        public Default() {}
        public void OnAck(int p0) throws android.os.RemoteException {}
        public void OnFailure(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.nl80211.ISendMgmtFrameEvent {
        static final int TRANSACTION_OnAck = 1;
        static final int TRANSACTION_OnFailure = 2;
        public Stub() { super(); }
        public static android.net.wifi.nl80211.ISendMgmtFrameEvent asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.nl80211.ISendMgmtFrameEvent p0) { return false; }
        public static android.net.wifi.nl80211.ISendMgmtFrameEvent getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.nl80211.ISendMgmtFrameEvent {
            private android.os.IBinder mRemote;
            public static android.net.wifi.nl80211.ISendMgmtFrameEvent sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void OnAck(int p0) throws android.os.RemoteException {}
            public void OnFailure(int p0) throws android.os.RemoteException {}
        }
    }
}
