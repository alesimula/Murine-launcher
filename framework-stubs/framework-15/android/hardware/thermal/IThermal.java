package android.hardware.thermal;

public interface IThermal extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "2f49c78011338b42b43d5d0e250d9b520850cc1f";
    public static final java.lang.String DESCRIPTOR = null;
    public android.hardware.thermal.CoolingDevice[] getCoolingDevices() throws android.os.RemoteException;
    public android.hardware.thermal.CoolingDevice[] getCoolingDevicesWithType(int p0) throws android.os.RemoteException;
    public android.hardware.thermal.Temperature[] getTemperatures() throws android.os.RemoteException;
    public android.hardware.thermal.Temperature[] getTemperaturesWithType(int p0) throws android.os.RemoteException;
    public android.hardware.thermal.TemperatureThreshold[] getTemperatureThresholds() throws android.os.RemoteException;
    public android.hardware.thermal.TemperatureThreshold[] getTemperatureThresholdsWithType(int p0) throws android.os.RemoteException;
    public void registerThermalChangedCallback(android.hardware.thermal.IThermalChangedCallback p0) throws android.os.RemoteException;
    public void registerThermalChangedCallbackWithType(android.hardware.thermal.IThermalChangedCallback p0, int p1) throws android.os.RemoteException;
    public void unregisterThermalChangedCallback(android.hardware.thermal.IThermalChangedCallback p0) throws android.os.RemoteException;
    public void registerCoolingDeviceChangedCallbackWithType(android.hardware.thermal.ICoolingDeviceChangedCallback p0, int p1) throws android.os.RemoteException;
    public void unregisterCoolingDeviceChangedCallback(android.hardware.thermal.ICoolingDeviceChangedCallback p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.thermal.IThermal {
        public Default() {}
        public android.hardware.thermal.CoolingDevice[] getCoolingDevices() throws android.os.RemoteException { return null; }
        public android.hardware.thermal.CoolingDevice[] getCoolingDevicesWithType(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.thermal.Temperature[] getTemperatures() throws android.os.RemoteException { return null; }
        public android.hardware.thermal.Temperature[] getTemperaturesWithType(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.thermal.TemperatureThreshold[] getTemperatureThresholds() throws android.os.RemoteException { return null; }
        public android.hardware.thermal.TemperatureThreshold[] getTemperatureThresholdsWithType(int p0) throws android.os.RemoteException { return null; }
        public void registerThermalChangedCallback(android.hardware.thermal.IThermalChangedCallback p0) throws android.os.RemoteException {}
        public void registerThermalChangedCallbackWithType(android.hardware.thermal.IThermalChangedCallback p0, int p1) throws android.os.RemoteException {}
        public void unregisterThermalChangedCallback(android.hardware.thermal.IThermalChangedCallback p0) throws android.os.RemoteException {}
        public void registerCoolingDeviceChangedCallbackWithType(android.hardware.thermal.ICoolingDeviceChangedCallback p0, int p1) throws android.os.RemoteException {}
        public void unregisterCoolingDeviceChangedCallback(android.hardware.thermal.ICoolingDeviceChangedCallback p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.thermal.IThermal {
        static final int TRANSACTION_getCoolingDevices = 1;
        static final int TRANSACTION_getCoolingDevicesWithType = 2;
        static final int TRANSACTION_getTemperatures = 3;
        static final int TRANSACTION_getTemperaturesWithType = 4;
        static final int TRANSACTION_getTemperatureThresholds = 5;
        static final int TRANSACTION_getTemperatureThresholdsWithType = 6;
        static final int TRANSACTION_registerThermalChangedCallback = 7;
        static final int TRANSACTION_registerThermalChangedCallbackWithType = 8;
        static final int TRANSACTION_unregisterThermalChangedCallback = 9;
        static final int TRANSACTION_registerCoolingDeviceChangedCallbackWithType = 10;
        static final int TRANSACTION_unregisterCoolingDeviceChangedCallback = 11;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.thermal.IThermal asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.thermal.IThermal {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.thermal.CoolingDevice[] getCoolingDevices() throws android.os.RemoteException { return null; }
            public android.hardware.thermal.CoolingDevice[] getCoolingDevicesWithType(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.thermal.Temperature[] getTemperatures() throws android.os.RemoteException { return null; }
            public android.hardware.thermal.Temperature[] getTemperaturesWithType(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.thermal.TemperatureThreshold[] getTemperatureThresholds() throws android.os.RemoteException { return null; }
            public android.hardware.thermal.TemperatureThreshold[] getTemperatureThresholdsWithType(int p0) throws android.os.RemoteException { return null; }
            public void registerThermalChangedCallback(android.hardware.thermal.IThermalChangedCallback p0) throws android.os.RemoteException {}
            public void registerThermalChangedCallbackWithType(android.hardware.thermal.IThermalChangedCallback p0, int p1) throws android.os.RemoteException {}
            public void unregisterThermalChangedCallback(android.hardware.thermal.IThermalChangedCallback p0) throws android.os.RemoteException {}
            public void registerCoolingDeviceChangedCallbackWithType(android.hardware.thermal.ICoolingDeviceChangedCallback p0, int p1) throws android.os.RemoteException {}
            public void unregisterCoolingDeviceChangedCallback(android.hardware.thermal.ICoolingDeviceChangedCallback p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
