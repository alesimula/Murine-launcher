package android.os;

public interface IThermalService extends android.os.IInterface {
    public boolean registerThermalEventListener(android.os.IThermalEventListener p0) throws android.os.RemoteException;
    public boolean registerThermalEventListenerWithType(android.os.IThermalEventListener p0, int p1) throws android.os.RemoteException;
    public boolean unregisterThermalEventListener(android.os.IThermalEventListener p0) throws android.os.RemoteException;
    public android.os.Temperature[] getCurrentTemperatures() throws android.os.RemoteException;
    public android.os.Temperature[] getCurrentTemperaturesWithType(int p0) throws android.os.RemoteException;
    public boolean registerThermalStatusListener(android.os.IThermalStatusListener p0) throws android.os.RemoteException;
    public boolean unregisterThermalStatusListener(android.os.IThermalStatusListener p0) throws android.os.RemoteException;
    public int getCurrentThermalStatus() throws android.os.RemoteException;
    public android.os.CoolingDevice[] getCurrentCoolingDevices() throws android.os.RemoteException;
    public android.os.CoolingDevice[] getCurrentCoolingDevicesWithType(int p0) throws android.os.RemoteException;
    public float getThermalHeadroom(int p0) throws android.os.RemoteException;
    public float[] getThermalHeadroomThresholds() throws android.os.RemoteException;

    public static class Default implements android.os.IThermalService {
        public Default() {}
        public boolean registerThermalEventListener(android.os.IThermalEventListener p0) throws android.os.RemoteException { return false; }
        public boolean registerThermalEventListenerWithType(android.os.IThermalEventListener p0, int p1) throws android.os.RemoteException { return false; }
        public boolean unregisterThermalEventListener(android.os.IThermalEventListener p0) throws android.os.RemoteException { return false; }
        public android.os.Temperature[] getCurrentTemperatures() throws android.os.RemoteException { return null; }
        public android.os.Temperature[] getCurrentTemperaturesWithType(int p0) throws android.os.RemoteException { return null; }
        public boolean registerThermalStatusListener(android.os.IThermalStatusListener p0) throws android.os.RemoteException { return false; }
        public boolean unregisterThermalStatusListener(android.os.IThermalStatusListener p0) throws android.os.RemoteException { return false; }
        public int getCurrentThermalStatus() throws android.os.RemoteException { return 0; }
        public android.os.CoolingDevice[] getCurrentCoolingDevices() throws android.os.RemoteException { return null; }
        public android.os.CoolingDevice[] getCurrentCoolingDevicesWithType(int p0) throws android.os.RemoteException { return null; }
        public float getThermalHeadroom(int p0) throws android.os.RemoteException { return 0.0f; }
        public float[] getThermalHeadroomThresholds() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IThermalService {
        public static final java.lang.String DESCRIPTOR = "android.os.IThermalService";
        static final int TRANSACTION_registerThermalEventListener = 1;
        static final int TRANSACTION_registerThermalEventListenerWithType = 2;
        static final int TRANSACTION_unregisterThermalEventListener = 3;
        static final int TRANSACTION_getCurrentTemperatures = 4;
        static final int TRANSACTION_getCurrentTemperaturesWithType = 5;
        static final int TRANSACTION_registerThermalStatusListener = 6;
        static final int TRANSACTION_unregisterThermalStatusListener = 7;
        static final int TRANSACTION_getCurrentThermalStatus = 8;
        static final int TRANSACTION_getCurrentCoolingDevices = 9;
        static final int TRANSACTION_getCurrentCoolingDevicesWithType = 10;
        static final int TRANSACTION_getThermalHeadroom = 11;
        static final int TRANSACTION_getThermalHeadroomThresholds = 12;
        public Stub() { super(); }
        public static android.os.IThermalService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IThermalService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean registerThermalEventListener(android.os.IThermalEventListener p0) throws android.os.RemoteException { return false; }
            public boolean registerThermalEventListenerWithType(android.os.IThermalEventListener p0, int p1) throws android.os.RemoteException { return false; }
            public boolean unregisterThermalEventListener(android.os.IThermalEventListener p0) throws android.os.RemoteException { return false; }
            public android.os.Temperature[] getCurrentTemperatures() throws android.os.RemoteException { return null; }
            public android.os.Temperature[] getCurrentTemperaturesWithType(int p0) throws android.os.RemoteException { return null; }
            public boolean registerThermalStatusListener(android.os.IThermalStatusListener p0) throws android.os.RemoteException { return false; }
            public boolean unregisterThermalStatusListener(android.os.IThermalStatusListener p0) throws android.os.RemoteException { return false; }
            public int getCurrentThermalStatus() throws android.os.RemoteException { return 0; }
            public android.os.CoolingDevice[] getCurrentCoolingDevices() throws android.os.RemoteException { return null; }
            public android.os.CoolingDevice[] getCurrentCoolingDevicesWithType(int p0) throws android.os.RemoteException { return null; }
            public float getThermalHeadroom(int p0) throws android.os.RemoteException { return 0.0f; }
            public float[] getThermalHeadroomThresholds() throws android.os.RemoteException { return null; }
        }
    }
}
