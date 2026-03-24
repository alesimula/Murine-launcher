package android.os;

public interface IUpdateEngine extends android.os.IInterface {
    public void applyPayload(java.lang.String p0, long p1, long p2, java.lang.String[] p3) throws android.os.RemoteException;
    public boolean bind(android.os.IUpdateEngineCallback p0) throws android.os.RemoteException;
    public boolean unbind(android.os.IUpdateEngineCallback p0) throws android.os.RemoteException;
    public void suspend() throws android.os.RemoteException;
    public void resume() throws android.os.RemoteException;
    public void cancel() throws android.os.RemoteException;
    public void resetStatus() throws android.os.RemoteException;
    public boolean verifyPayloadApplicable(java.lang.String p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.IUpdateEngine {
        private static final java.lang.String DESCRIPTOR = "android.os.IUpdateEngine";
        static final int TRANSACTION_applyPayload = 1;
        static final int TRANSACTION_bind = 2;
        static final int TRANSACTION_unbind = 3;
        static final int TRANSACTION_suspend = 4;
        static final int TRANSACTION_resume = 5;
        static final int TRANSACTION_cancel = 6;
        static final int TRANSACTION_resetStatus = 7;
        static final int TRANSACTION_verifyPayloadApplicable = 8;
        public Stub() { super(); }
        public static android.os.IUpdateEngine asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IUpdateEngine p0) { return false; }
        public static android.os.IUpdateEngine getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IUpdateEngine {
            private android.os.IBinder mRemote;
            public static android.os.IUpdateEngine sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void applyPayload(java.lang.String p0, long p1, long p2, java.lang.String[] p3) throws android.os.RemoteException {}
            public boolean bind(android.os.IUpdateEngineCallback p0) throws android.os.RemoteException { return false; }
            public boolean unbind(android.os.IUpdateEngineCallback p0) throws android.os.RemoteException { return false; }
            public void suspend() throws android.os.RemoteException {}
            public void resume() throws android.os.RemoteException {}
            public void cancel() throws android.os.RemoteException {}
            public void resetStatus() throws android.os.RemoteException {}
            public boolean verifyPayloadApplicable(java.lang.String p0) throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.os.IUpdateEngine {
        public Default() {}
        public void applyPayload(java.lang.String p0, long p1, long p2, java.lang.String[] p3) throws android.os.RemoteException {}
        public boolean bind(android.os.IUpdateEngineCallback p0) throws android.os.RemoteException { return false; }
        public boolean unbind(android.os.IUpdateEngineCallback p0) throws android.os.RemoteException { return false; }
        public void suspend() throws android.os.RemoteException {}
        public void resume() throws android.os.RemoteException {}
        public void cancel() throws android.os.RemoteException {}
        public void resetStatus() throws android.os.RemoteException {}
        public boolean verifyPayloadApplicable(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
