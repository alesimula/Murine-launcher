package android.media.tv;

public interface ITvRemoteServiceInput extends android.os.IInterface {
    public void openInputBridge(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void closeInputBridge(android.os.IBinder p0) throws android.os.RemoteException;
    public void clearInputBridge(android.os.IBinder p0) throws android.os.RemoteException;
    public void sendTimestamp(android.os.IBinder p0, long p1) throws android.os.RemoteException;
    public void sendKeyDown(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void sendKeyUp(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void sendPointerDown(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void sendPointerUp(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void sendPointerSync(android.os.IBinder p0) throws android.os.RemoteException;
    public void openGamepadBridge(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public void sendGamepadKeyDown(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void sendGamepadKeyUp(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void sendGamepadAxisValue(android.os.IBinder p0, int p1, float p2) throws android.os.RemoteException;

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
        public void openGamepadBridge(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
        public void sendGamepadKeyDown(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void sendGamepadKeyUp(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void sendGamepadAxisValue(android.os.IBinder p0, int p1, float p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvRemoteServiceInput {
        public static final java.lang.String DESCRIPTOR = "android.media.tv.ITvRemoteServiceInput";
        static final int TRANSACTION_openInputBridge = 1;
        static final int TRANSACTION_closeInputBridge = 2;
        static final int TRANSACTION_clearInputBridge = 3;
        static final int TRANSACTION_sendTimestamp = 4;
        static final int TRANSACTION_sendKeyDown = 5;
        static final int TRANSACTION_sendKeyUp = 6;
        static final int TRANSACTION_sendPointerDown = 7;
        static final int TRANSACTION_sendPointerUp = 8;
        static final int TRANSACTION_sendPointerSync = 9;
        static final int TRANSACTION_openGamepadBridge = 10;
        static final int TRANSACTION_sendGamepadKeyDown = 11;
        static final int TRANSACTION_sendGamepadKeyUp = 12;
        static final int TRANSACTION_sendGamepadAxisValue = 13;
        public Stub() { super(); }
        public static android.media.tv.ITvRemoteServiceInput asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.ITvRemoteServiceInput {
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
            public void openGamepadBridge(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
            public void sendGamepadKeyDown(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void sendGamepadKeyUp(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void sendGamepadAxisValue(android.os.IBinder p0, int p1, float p2) throws android.os.RemoteException {}
        }
    }
}
