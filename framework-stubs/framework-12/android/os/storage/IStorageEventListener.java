package android.os.storage;

public interface IStorageEventListener extends android.os.IInterface {
    public void onUsbMassStorageConnectionChanged(boolean p0) throws android.os.RemoteException;
    public void onStorageStateChanged(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void onVolumeStateChanged(android.os.storage.VolumeInfo p0, int p1, int p2) throws android.os.RemoteException;
    public void onVolumeRecordChanged(android.os.storage.VolumeRecord p0) throws android.os.RemoteException;
    public void onVolumeForgotten(java.lang.String p0) throws android.os.RemoteException;
    public void onDiskScanned(android.os.storage.DiskInfo p0, int p1) throws android.os.RemoteException;
    public void onDiskDestroyed(android.os.storage.DiskInfo p0) throws android.os.RemoteException;

    public static class Default implements android.os.storage.IStorageEventListener {
        public Default() {}
        public void onUsbMassStorageConnectionChanged(boolean p0) throws android.os.RemoteException {}
        public void onStorageStateChanged(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void onVolumeStateChanged(android.os.storage.VolumeInfo p0, int p1, int p2) throws android.os.RemoteException {}
        public void onVolumeRecordChanged(android.os.storage.VolumeRecord p0) throws android.os.RemoteException {}
        public void onVolumeForgotten(java.lang.String p0) throws android.os.RemoteException {}
        public void onDiskScanned(android.os.storage.DiskInfo p0, int p1) throws android.os.RemoteException {}
        public void onDiskDestroyed(android.os.storage.DiskInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.storage.IStorageEventListener {
        public static final java.lang.String DESCRIPTOR = "android.os.storage.IStorageEventListener";
        static final int TRANSACTION_onUsbMassStorageConnectionChanged = 1;
        static final int TRANSACTION_onStorageStateChanged = 2;
        static final int TRANSACTION_onVolumeStateChanged = 3;
        static final int TRANSACTION_onVolumeRecordChanged = 4;
        static final int TRANSACTION_onVolumeForgotten = 5;
        static final int TRANSACTION_onDiskScanned = 6;
        static final int TRANSACTION_onDiskDestroyed = 7;
        public Stub() { super(); }
        public static android.os.storage.IStorageEventListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.storage.IStorageEventListener p0) { return false; }
        public static android.os.storage.IStorageEventListener getDefaultImpl() { return null; }

        private static class Proxy implements android.os.storage.IStorageEventListener {
            private android.os.IBinder mRemote;
            public static android.os.storage.IStorageEventListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUsbMassStorageConnectionChanged(boolean p0) throws android.os.RemoteException {}
            public void onStorageStateChanged(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void onVolumeStateChanged(android.os.storage.VolumeInfo p0, int p1, int p2) throws android.os.RemoteException {}
            public void onVolumeRecordChanged(android.os.storage.VolumeRecord p0) throws android.os.RemoteException {}
            public void onVolumeForgotten(java.lang.String p0) throws android.os.RemoteException {}
            public void onDiskScanned(android.os.storage.DiskInfo p0, int p1) throws android.os.RemoteException {}
            public void onDiskDestroyed(android.os.storage.DiskInfo p0) throws android.os.RemoteException {}
        }
    }
}
