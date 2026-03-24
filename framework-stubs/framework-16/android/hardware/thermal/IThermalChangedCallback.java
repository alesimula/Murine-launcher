package android.hardware.thermal;

public interface IThermalChangedCallback extends android.os.IInterface {
    public static final int VERSION = 3;
    public static final java.lang.String HASH = "4c4fc474c40b64963eb8d78b713b1095fecd72f0";
    public static final java.lang.String DESCRIPTOR = null;
    public void notifyThrottling(android.hardware.thermal.Temperature p0) throws android.os.RemoteException;
    public void notifyThresholdChanged(android.hardware.thermal.TemperatureThreshold p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.thermal.IThermalChangedCallback {
        public Default() {}
        public void notifyThrottling(android.hardware.thermal.Temperature p0) throws android.os.RemoteException {}
        public void notifyThresholdChanged(android.hardware.thermal.TemperatureThreshold p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.thermal.IThermalChangedCallback {
        static final int TRANSACTION_notifyThrottling = 1;
        static final int TRANSACTION_notifyThresholdChanged = 2;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.thermal.IThermalChangedCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.thermal.IThermalChangedCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyThrottling(android.hardware.thermal.Temperature p0) throws android.os.RemoteException {}
            public void notifyThresholdChanged(android.hardware.thermal.TemperatureThreshold p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
