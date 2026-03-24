package android.os;

public interface IProgressListener extends android.os.IInterface {
    public void onStarted(int p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onProgress(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void onFinished(int p0, android.os.Bundle p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.IProgressListener {
        private static final java.lang.String DESCRIPTOR = "android.os.IProgressListener";
        static final int TRANSACTION_onStarted = 1;
        static final int TRANSACTION_onProgress = 2;
        static final int TRANSACTION_onFinished = 3;
        public Stub() { super(); }
        public static android.os.IProgressListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IProgressListener p0) { return false; }
        public static android.os.IProgressListener getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IProgressListener {
            private android.os.IBinder mRemote;
            public static android.os.IProgressListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStarted(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void onProgress(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void onFinished(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.os.IProgressListener {
        public Default() {}
        public void onStarted(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void onProgress(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void onFinished(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
