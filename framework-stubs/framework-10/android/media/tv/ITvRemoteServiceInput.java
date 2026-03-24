package android.media.tv;

public interface ITvRemoteServiceInput extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public void openInputBridge(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void closeInputBridge(android.os.IBinder p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void clearInputBridge(android.os.IBinder p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void sendTimestamp(android.os.IBinder p0, long p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void sendKeyDown(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void sendKeyUp(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void sendPointerDown(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void sendPointerUp(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void sendPointerSync(android.os.IBinder p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvRemoteServiceInput {
        private static final java.lang.String DESCRIPTOR = "android.media.tv.ITvRemoteServiceInput";
        static final int TRANSACTION_openInputBridge = 1;
        static final int TRANSACTION_closeInputBridge = 2;
        static final int TRANSACTION_clearInputBridge = 3;
        static final int TRANSACTION_sendTimestamp = 4;
        static final int TRANSACTION_sendKeyDown = 5;
        static final int TRANSACTION_sendKeyUp = 6;
        static final int TRANSACTION_sendPointerDown = 7;
        static final int TRANSACTION_sendPointerUp = 8;
        static final int TRANSACTION_sendPointerSync = 9;
        public Stub() { super(); }
        public static android.media.tv.ITvRemoteServiceInput asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.tv.ITvRemoteServiceInput p0) { return false; }
        public static android.media.tv.ITvRemoteServiceInput getDefaultImpl() { return null; }

        private static class Proxy implements android.media.tv.ITvRemoteServiceInput {
            private android.os.IBinder mRemote;
            public static android.media.tv.ITvRemoteServiceInput sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void openInputBridge(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void closeInputBridge(android.os.IBinder p0) throws android.os.RemoteException {}
            public void clearInputBridge(android.os.IBinder p0) throws android.os.RemoteException {}
            public void sendTimestamp(android.os.IBinder p0, long p1) throws android.os.RemoteException {}
            public void sendKeyDown(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void sendKeyUp(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void sendPointerDown(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void sendPointerUp(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void sendPointerSync(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.media.tv.ITvRemoteServiceInput {
        public Default() {}
        public void openInputBridge(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void closeInputBridge(android.os.IBinder p0) throws android.os.RemoteException {}
        public void clearInputBridge(android.os.IBinder p0) throws android.os.RemoteException {}
        public void sendTimestamp(android.os.IBinder p0, long p1) throws android.os.RemoteException {}
        public void sendKeyDown(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void sendKeyUp(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void sendPointerDown(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void sendPointerUp(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void sendPointerSync(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
