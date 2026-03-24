package android.hardware.gnss;

public interface IGnssPowerIndicationCallback extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int CAPABILITY_TOTAL = 1;
    public static final int CAPABILITY_SINGLEBAND_TRACKING = 2;
    public static final int CAPABILITY_MULTIBAND_TRACKING = 4;
    public static final int CAPABILITY_SINGLEBAND_ACQUISITION = 8;
    public static final int CAPABILITY_MULTIBAND_ACQUISITION = 16;
    public static final int CAPABILITY_OTHER_MODES = 32;
    public void setCapabilitiesCb(int p0) throws android.os.RemoteException;
    public void gnssPowerStatsCb(android.hardware.gnss.GnssPowerStats p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.gnss.IGnssPowerIndicationCallback {
        public Default() {}
        public void setCapabilitiesCb(int p0) throws android.os.RemoteException {}
        public void gnssPowerStatsCb(android.hardware.gnss.GnssPowerStats p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssPowerIndicationCallback {
        static final int TRANSACTION_setCapabilitiesCb = 1;
        static final int TRANSACTION_gnssPowerStatsCb = 2;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.gnss.IGnssPowerIndicationCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.gnss.IGnssPowerIndicationCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setCapabilitiesCb(int p0) throws android.os.RemoteException {}
            public void gnssPowerStatsCb(android.hardware.gnss.GnssPowerStats p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
