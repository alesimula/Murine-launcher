package android.os;

public interface IRecoverySystemProgressListener extends android.os.IInterface {
    public void onProgress(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.IRecoverySystemProgressListener {
        private static final java.lang.String DESCRIPTOR = "android.os.IRecoverySystemProgressListener";
        static final int TRANSACTION_onProgress = 1;
        public Stub() { super(); }
        public static android.os.IRecoverySystemProgressListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IRecoverySystemProgressListener p0) { return false; }
        public static android.os.IRecoverySystemProgressListener getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IRecoverySystemProgressListener {
            private android.os.IBinder mRemote;
            public static android.os.IRecoverySystemProgressListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onProgress(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.os.IRecoverySystemProgressListener {
        public Default() {}
        public void onProgress(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
