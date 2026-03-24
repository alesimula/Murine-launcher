package android.os;

public interface IBatteryPropertiesRegistrar extends android.os.IInterface {
    public int getProperty(int p0, android.os.BatteryProperty p1) throws android.os.RemoteException;
    public void scheduleUpdate() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.IBatteryPropertiesRegistrar {
        private static final java.lang.String DESCRIPTOR = "android.os.IBatteryPropertiesRegistrar";
        static final int TRANSACTION_getProperty = 1;
        static final int TRANSACTION_scheduleUpdate = 2;
        public Stub() { super(); }
        public static android.os.IBatteryPropertiesRegistrar asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IBatteryPropertiesRegistrar p0) { return false; }
        public static android.os.IBatteryPropertiesRegistrar getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IBatteryPropertiesRegistrar {
            private android.os.IBinder mRemote;
            public static android.os.IBatteryPropertiesRegistrar sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getProperty(int p0, android.os.BatteryProperty p1) throws android.os.RemoteException { return 0; }
            public void scheduleUpdate() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.os.IBatteryPropertiesRegistrar {
        public Default() {}
        public int getProperty(int p0, android.os.BatteryProperty p1) throws android.os.RemoteException { return 0; }
        public void scheduleUpdate() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
