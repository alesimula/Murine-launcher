package android.hardware.display;

public interface IDeviceProductInfoConstants extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.display.IDeviceProductInfoConstants";
    public static final int CONNECTION_TO_SINK_UNKNOWN = 0;
    public static final int CONNECTION_TO_SINK_BUILT_IN = 1;
    public static final int CONNECTION_TO_SINK_DIRECT = 2;
    public static final int CONNECTION_TO_SINK_TRANSITIVE = 3;

    public static class Default implements android.hardware.display.IDeviceProductInfoConstants {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.display.IDeviceProductInfoConstants {
        public Stub() { super(); }
        public static android.hardware.display.IDeviceProductInfoConstants asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.display.IDeviceProductInfoConstants {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
