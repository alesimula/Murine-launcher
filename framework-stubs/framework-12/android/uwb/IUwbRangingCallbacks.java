package android.uwb;

public interface IUwbRangingCallbacks extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.uwb.IUwbRangingCallbacks";
    public void onRangingOpened(android.uwb.SessionHandle p0) throws android.os.RemoteException;
    public void onRangingOpenFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public void onRangingStarted(android.uwb.SessionHandle p0, android.os.PersistableBundle p1) throws android.os.RemoteException;
    public void onRangingStartFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public void onRangingReconfigured(android.uwb.SessionHandle p0, android.os.PersistableBundle p1) throws android.os.RemoteException;
    public void onRangingReconfigureFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public void onRangingStopped(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public void onRangingStopFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public void onRangingClosed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public void onRangingResult(android.uwb.SessionHandle p0, android.uwb.RangingReport p1) throws android.os.RemoteException;

    public static class Default implements android.uwb.IUwbRangingCallbacks {
        public Default() {}
        public void onRangingOpened(android.uwb.SessionHandle p0) throws android.os.RemoteException {}
        public void onRangingOpenFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public void onRangingStarted(android.uwb.SessionHandle p0, android.os.PersistableBundle p1) throws android.os.RemoteException {}
        public void onRangingStartFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public void onRangingReconfigured(android.uwb.SessionHandle p0, android.os.PersistableBundle p1) throws android.os.RemoteException {}
        public void onRangingReconfigureFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public void onRangingStopped(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public void onRangingStopFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public void onRangingClosed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public void onRangingResult(android.uwb.SessionHandle p0, android.uwb.RangingReport p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.uwb.IUwbRangingCallbacks {
        static final int TRANSACTION_onRangingOpened = 1;
        static final int TRANSACTION_onRangingOpenFailed = 2;
        static final int TRANSACTION_onRangingStarted = 3;
        static final int TRANSACTION_onRangingStartFailed = 4;
        static final int TRANSACTION_onRangingReconfigured = 5;
        static final int TRANSACTION_onRangingReconfigureFailed = 6;
        static final int TRANSACTION_onRangingStopped = 7;
        static final int TRANSACTION_onRangingStopFailed = 8;
        static final int TRANSACTION_onRangingClosed = 9;
        static final int TRANSACTION_onRangingResult = 10;
        public Stub() { super(); }
        public static android.uwb.IUwbRangingCallbacks asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.uwb.IUwbRangingCallbacks p0) { return false; }
        public static android.uwb.IUwbRangingCallbacks getDefaultImpl() { return null; }

        private static class Proxy implements android.uwb.IUwbRangingCallbacks {
            private android.os.IBinder mRemote;
            public static android.uwb.IUwbRangingCallbacks sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRangingOpened(android.uwb.SessionHandle p0) throws android.os.RemoteException {}
            public void onRangingOpenFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public void onRangingStarted(android.uwb.SessionHandle p0, android.os.PersistableBundle p1) throws android.os.RemoteException {}
            public void onRangingStartFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public void onRangingReconfigured(android.uwb.SessionHandle p0, android.os.PersistableBundle p1) throws android.os.RemoteException {}
            public void onRangingReconfigureFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public void onRangingStopped(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public void onRangingStopFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public void onRangingClosed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public void onRangingResult(android.uwb.SessionHandle p0, android.uwb.RangingReport p1) throws android.os.RemoteException {}
        }
    }
}
