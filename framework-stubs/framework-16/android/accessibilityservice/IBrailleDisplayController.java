package android.accessibilityservice;

public interface IBrailleDisplayController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.accessibilityservice.IBrailleDisplayController";
    public void onConnected(android.accessibilityservice.IBrailleDisplayConnection p0, byte[] p1) throws android.os.RemoteException;
    public void onConnectionFailed(int p0) throws android.os.RemoteException;
    public void onInput(byte[] p0) throws android.os.RemoteException;
    public void onDisconnected() throws android.os.RemoteException;

    public static class Default implements android.accessibilityservice.IBrailleDisplayController {
        public Default() {}
        public void onConnected(android.accessibilityservice.IBrailleDisplayConnection p0, byte[] p1) throws android.os.RemoteException {}
        public void onConnectionFailed(int p0) throws android.os.RemoteException {}
        public void onInput(byte[] p0) throws android.os.RemoteException {}
        public void onDisconnected() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.accessibilityservice.IBrailleDisplayController {
        static final int TRANSACTION_onConnected = 1;
        static final int TRANSACTION_onConnectionFailed = 2;
        static final int TRANSACTION_onInput = 3;
        static final int TRANSACTION_onDisconnected = 4;
        public Stub() { super(); }
        public static android.accessibilityservice.IBrailleDisplayController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.accessibilityservice.IBrailleDisplayController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConnected(android.accessibilityservice.IBrailleDisplayConnection p0, byte[] p1) throws android.os.RemoteException {}
            public void onConnectionFailed(int p0) throws android.os.RemoteException {}
            public void onInput(byte[] p0) throws android.os.RemoteException {}
            public void onDisconnected() throws android.os.RemoteException {}
        }
    }
}
