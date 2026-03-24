package android.app.wearable;

public interface IWearableSensingManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.wearable.IWearableSensingManager";
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void provideDataStream(android.os.ParcelFileDescriptor p0, android.os.RemoteCallback p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void provideData(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.RemoteCallback p2) throws android.os.RemoteException;

    public static class Default implements android.app.wearable.IWearableSensingManager {
        public Default() {}
        public void provideDataStream(android.os.ParcelFileDescriptor p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void provideData(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.wearable.IWearableSensingManager {
        static final int TRANSACTION_provideDataStream = 1;
        static final int TRANSACTION_provideData = 2;
        public Stub() { super(); }
        public static android.app.wearable.IWearableSensingManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.wearable.IWearableSensingManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void provideDataStream(android.os.ParcelFileDescriptor p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
            public void provideData(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        }
    }
}
