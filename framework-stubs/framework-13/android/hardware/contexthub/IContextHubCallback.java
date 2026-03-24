package android.hardware.contexthub;

public interface IContextHubCallback extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "10abe2e5202d9b80ccebf5f6376d711a9a212b27";
    public static final java.lang.String DESCRIPTOR = null;
    public void handleNanoappInfo(android.hardware.contexthub.NanoappInfo[] p0) throws android.os.RemoteException;
    public void handleContextHubMessage(android.hardware.contexthub.ContextHubMessage p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void handleContextHubAsyncEvent(int p0) throws android.os.RemoteException;
    public void handleTransactionResult(int p0, boolean p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.contexthub.IContextHubCallback {
        public Default() {}
        public void handleNanoappInfo(android.hardware.contexthub.NanoappInfo[] p0) throws android.os.RemoteException {}
        public void handleContextHubMessage(android.hardware.contexthub.ContextHubMessage p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void handleContextHubAsyncEvent(int p0) throws android.os.RemoteException {}
        public void handleTransactionResult(int p0, boolean p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.contexthub.IContextHubCallback {
        static final int TRANSACTION_handleNanoappInfo = 1;
        static final int TRANSACTION_handleContextHubMessage = 2;
        static final int TRANSACTION_handleContextHubAsyncEvent = 3;
        static final int TRANSACTION_handleTransactionResult = 4;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.contexthub.IContextHubCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.contexthub.IContextHubCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void handleNanoappInfo(android.hardware.contexthub.NanoappInfo[] p0) throws android.os.RemoteException {}
            public void handleContextHubMessage(android.hardware.contexthub.ContextHubMessage p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void handleContextHubAsyncEvent(int p0) throws android.os.RemoteException {}
            public void handleTransactionResult(int p0, boolean p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
