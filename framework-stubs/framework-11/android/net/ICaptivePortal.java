package android.net;

public interface ICaptivePortal extends android.os.IInterface {
    public void appRequest(int p0) throws android.os.RemoteException;
    public void appResponse(int p0) throws android.os.RemoteException;
    public void logEvent(int p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.net.ICaptivePortal {
        public Default() {}
        public void appRequest(int p0) throws android.os.RemoteException {}
        public void appResponse(int p0) throws android.os.RemoteException {}
        public void logEvent(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.ICaptivePortal {
        private static final java.lang.String DESCRIPTOR = "android.net.ICaptivePortal";
        static final int TRANSACTION_appRequest = 1;
        static final int TRANSACTION_appResponse = 2;
        static final int TRANSACTION_logEvent = 3;
        public Stub() { super(); }
        public static android.net.ICaptivePortal asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.ICaptivePortal p0) { return false; }
        public static android.net.ICaptivePortal getDefaultImpl() { return null; }

        private static class Proxy implements android.net.ICaptivePortal {
            private android.os.IBinder mRemote;
            public static android.net.ICaptivePortal sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void appRequest(int p0) throws android.os.RemoteException {}
            public void appResponse(int p0) throws android.os.RemoteException {}
            public void logEvent(int p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
