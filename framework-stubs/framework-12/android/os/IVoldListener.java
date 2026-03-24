package android.os;

public interface IVoldListener extends android.os.IInterface {
    public void onDiskCreated(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onDiskScanned(java.lang.String p0) throws android.os.RemoteException;
    public void onDiskMetadataChanged(java.lang.String p0, long p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void onDiskDestroyed(java.lang.String p0) throws android.os.RemoteException;
    public void onVolumeCreated(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public void onVolumeStateChanged(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onVolumeMetadataChanged(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void onVolumePathChanged(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void onVolumeInternalPathChanged(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void onVolumeDestroyed(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.os.IVoldListener {
        public Default() {}
        public void onDiskCreated(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onDiskScanned(java.lang.String p0) throws android.os.RemoteException {}
        public void onDiskMetadataChanged(java.lang.String p0, long p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void onDiskDestroyed(java.lang.String p0) throws android.os.RemoteException {}
        public void onVolumeCreated(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
        public void onVolumeStateChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onVolumeMetadataChanged(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void onVolumePathChanged(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onVolumeInternalPathChanged(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onVolumeDestroyed(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IVoldListener {
        public static final java.lang.String DESCRIPTOR = "android.os.IVoldListener";
        static final int TRANSACTION_onDiskCreated = 1;
        static final int TRANSACTION_onDiskScanned = 2;
        static final int TRANSACTION_onDiskMetadataChanged = 3;
        static final int TRANSACTION_onDiskDestroyed = 4;
        static final int TRANSACTION_onVolumeCreated = 5;
        static final int TRANSACTION_onVolumeStateChanged = 6;
        static final int TRANSACTION_onVolumeMetadataChanged = 7;
        static final int TRANSACTION_onVolumePathChanged = 8;
        static final int TRANSACTION_onVolumeInternalPathChanged = 9;
        static final int TRANSACTION_onVolumeDestroyed = 10;
        public Stub() { super(); }
        public static android.os.IVoldListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IVoldListener p0) { return false; }
        public static android.os.IVoldListener getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IVoldListener {
            private android.os.IBinder mRemote;
            public static android.os.IVoldListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDiskCreated(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onDiskScanned(java.lang.String p0) throws android.os.RemoteException {}
            public void onDiskMetadataChanged(java.lang.String p0, long p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void onDiskDestroyed(java.lang.String p0) throws android.os.RemoteException {}
            public void onVolumeCreated(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
            public void onVolumeStateChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onVolumeMetadataChanged(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void onVolumePathChanged(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onVolumeInternalPathChanged(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onVolumeDestroyed(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
