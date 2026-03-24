package android.os;

public interface IMaintenanceActivityListener extends android.os.IInterface {
    public void onMaintenanceActivityChanged(boolean p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.IMaintenanceActivityListener {
        private static final java.lang.String DESCRIPTOR = "android.os.IMaintenanceActivityListener";
        static final int TRANSACTION_onMaintenanceActivityChanged = 1;
        public Stub() { super(); }
        public static android.os.IMaintenanceActivityListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IMaintenanceActivityListener p0) { return false; }
        public static android.os.IMaintenanceActivityListener getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IMaintenanceActivityListener {
            private android.os.IBinder mRemote;
            public static android.os.IMaintenanceActivityListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onMaintenanceActivityChanged(boolean p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.os.IMaintenanceActivityListener {
        public Default() {}
        public void onMaintenanceActivityChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
