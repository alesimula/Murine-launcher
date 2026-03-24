package android.hardware.contexthub;

public interface IContextHubCallback extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "b0fd976b134e549e03726d3ebeeae848e520d3d3";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int CONTEXTHUB_NAN_TRANSACTION_TIMEOUT_MS = 10000;
    public void handleNanoappInfo(android.hardware.contexthub.NanoappInfo[] p0) throws android.os.RemoteException;
    public void handleContextHubMessage(android.hardware.contexthub.ContextHubMessage p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void handleContextHubAsyncEvent(int p0) throws android.os.RemoteException;
    public void handleTransactionResult(int p0, boolean p1) throws android.os.RemoteException;
    public void handleNanSessionRequest(android.hardware.contexthub.NanSessionRequest p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.contexthub.IContextHubCallback {
        public Default() {}
        public void handleNanoappInfo(android.hardware.contexthub.NanoappInfo[] p0) throws android.os.RemoteException {}
        public void handleContextHubMessage(android.hardware.contexthub.ContextHubMessage p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void handleContextHubAsyncEvent(int p0) throws android.os.RemoteException {}
        public void handleTransactionResult(int p0, boolean p1) throws android.os.RemoteException {}
        public void handleNanSessionRequest(android.hardware.contexthub.NanSessionRequest p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.contexthub.IContextHubCallback {
        static final int TRANSACTION_handleNanoappInfo = 1;
        static final int TRANSACTION_handleContextHubMessage = 2;
        static final int TRANSACTION_handleContextHubAsyncEvent = 3;
        static final int TRANSACTION_handleTransactionResult = 4;
        static final int TRANSACTION_handleNanSessionRequest = 5;
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
            public void handleNanSessionRequest(android.hardware.contexthub.NanSessionRequest p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
