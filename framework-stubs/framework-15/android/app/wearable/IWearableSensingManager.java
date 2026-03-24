package android.app.wearable;

public interface IWearableSensingManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.wearable.IWearableSensingManager";
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void provideConnection(android.os.ParcelFileDescriptor p0, android.app.wearable.IWearableSensingCallback p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void provideDataStream(android.os.ParcelFileDescriptor p0, android.app.wearable.IWearableSensingCallback p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void provideData(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void registerDataRequestObserver(int p0, android.app.PendingIntent p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void unregisterDataRequestObserver(int p0, android.app.PendingIntent p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void startHotwordRecognition(android.content.ComponentName p0, android.os.RemoteCallback p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void stopHotwordRecognition(android.os.RemoteCallback p0) throws android.os.RemoteException;

    public static class Default implements android.app.wearable.IWearableSensingManager {
        public Default() {}
        public void provideConnection(android.os.ParcelFileDescriptor p0, android.app.wearable.IWearableSensingCallback p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void provideDataStream(android.os.ParcelFileDescriptor p0, android.app.wearable.IWearableSensingCallback p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void provideData(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void registerDataRequestObserver(int p0, android.app.PendingIntent p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void unregisterDataRequestObserver(int p0, android.app.PendingIntent p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void startHotwordRecognition(android.content.ComponentName p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void stopHotwordRecognition(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.wearable.IWearableSensingManager {
        static final int TRANSACTION_provideConnection = 1;
        static final int TRANSACTION_provideDataStream = 2;
        static final int TRANSACTION_provideData = 3;
        static final int TRANSACTION_registerDataRequestObserver = 4;
        static final int TRANSACTION_unregisterDataRequestObserver = 5;
        static final int TRANSACTION_startHotwordRecognition = 6;
        static final int TRANSACTION_stopHotwordRecognition = 7;
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
            public void provideConnection(android.os.ParcelFileDescriptor p0, android.app.wearable.IWearableSensingCallback p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void provideDataStream(android.os.ParcelFileDescriptor p0, android.app.wearable.IWearableSensingCallback p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void provideData(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void registerDataRequestObserver(int p0, android.app.PendingIntent p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void unregisterDataRequestObserver(int p0, android.app.PendingIntent p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void startHotwordRecognition(android.content.ComponentName p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
            public void stopHotwordRecognition(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        }
    }
}
