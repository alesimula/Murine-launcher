package android.companion.virtual.sensor;

public interface IVirtualSensorCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.sensor.IVirtualSensorCallback";
    public void onConfigurationChanged(android.companion.virtual.sensor.VirtualSensor p0, boolean p1, int p2, int p3) throws android.os.RemoteException;
    public void onDirectChannelCreated(int p0, android.os.SharedMemory p1) throws android.os.RemoteException;
    public void onDirectChannelDestroyed(int p0) throws android.os.RemoteException;
    public void onDirectChannelConfigured(int p0, android.companion.virtual.sensor.VirtualSensor p1, int p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.sensor.IVirtualSensorCallback {
        public Default() {}
        public void onConfigurationChanged(android.companion.virtual.sensor.VirtualSensor p0, boolean p1, int p2, int p3) throws android.os.RemoteException {}
        public void onDirectChannelCreated(int p0, android.os.SharedMemory p1) throws android.os.RemoteException {}
        public void onDirectChannelDestroyed(int p0) throws android.os.RemoteException {}
        public void onDirectChannelConfigured(int p0, android.companion.virtual.sensor.VirtualSensor p1, int p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.sensor.IVirtualSensorCallback {
        static final int TRANSACTION_onConfigurationChanged = 1;
        static final int TRANSACTION_onDirectChannelCreated = 2;
        static final int TRANSACTION_onDirectChannelDestroyed = 3;
        static final int TRANSACTION_onDirectChannelConfigured = 4;
        public Stub() { super(); }
        public static android.companion.virtual.sensor.IVirtualSensorCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.virtual.sensor.IVirtualSensorCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConfigurationChanged(android.companion.virtual.sensor.VirtualSensor p0, boolean p1, int p2, int p3) throws android.os.RemoteException {}
            public void onDirectChannelCreated(int p0, android.os.SharedMemory p1) throws android.os.RemoteException {}
            public void onDirectChannelDestroyed(int p0) throws android.os.RemoteException {}
            public void onDirectChannelConfigured(int p0, android.companion.virtual.sensor.VirtualSensor p1, int p2, int p3) throws android.os.RemoteException {}
        }
    }
}
