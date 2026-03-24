package android.hardware.tv.tuner;

public interface IFrontendCallback extends android.os.IInterface {
    public static final int VERSION = 3;
    public static final java.lang.String HASH = "b0d0067a930514438d7772c2e02069c7370f3620";
    public static final java.lang.String DESCRIPTOR = null;
    public void onEvent(int p0) throws android.os.RemoteException;
    public void onScanMessage(int p0, android.hardware.tv.tuner.FrontendScanMessage p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.tv.tuner.IFrontendCallback {
        public Default() {}
        public void onEvent(int p0) throws android.os.RemoteException {}
        public void onScanMessage(int p0, android.hardware.tv.tuner.FrontendScanMessage p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.tv.tuner.IFrontendCallback {
        static final int TRANSACTION_onEvent = 1;
        static final int TRANSACTION_onScanMessage = 2;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.tv.tuner.IFrontendCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.tv.tuner.IFrontendCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onEvent(int p0) throws android.os.RemoteException {}
            public void onScanMessage(int p0, android.hardware.tv.tuner.FrontendScanMessage p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
