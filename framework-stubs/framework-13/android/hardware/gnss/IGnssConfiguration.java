package android.hardware.gnss;

public interface IGnssConfiguration extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int SUPL_MODE_MSB = 1;
    public static final int SUPL_MODE_MSA = 2;
    public static final int LPP_PROFILE_USER_PLANE = 1;
    public static final int LPP_PROFILE_CONTROL_PLANE = 2;
    public static final int GLONASS_POS_PROTOCOL_RRC_CPLANE = 1;
    public static final int GLONASS_POS_PROTOCOL_RRLP_UPLANE = 2;
    public static final int GLONASS_POS_PROTOCOL_LPP_UPLANE = 4;
    public void setSuplVersion(int p0) throws android.os.RemoteException;
    public void setSuplMode(int p0) throws android.os.RemoteException;
    public void setLppProfile(int p0) throws android.os.RemoteException;
    public void setGlonassPositioningProtocol(int p0) throws android.os.RemoteException;
    public void setEmergencySuplPdn(boolean p0) throws android.os.RemoteException;
    public void setEsExtensionSec(int p0) throws android.os.RemoteException;
    public void setBlocklist(android.hardware.gnss.BlocklistedSource[] p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.gnss.IGnssConfiguration {
        public Default() {}
        public void setSuplVersion(int p0) throws android.os.RemoteException {}
        public void setSuplMode(int p0) throws android.os.RemoteException {}
        public void setLppProfile(int p0) throws android.os.RemoteException {}
        public void setGlonassPositioningProtocol(int p0) throws android.os.RemoteException {}
        public void setEmergencySuplPdn(boolean p0) throws android.os.RemoteException {}
        public void setEsExtensionSec(int p0) throws android.os.RemoteException {}
        public void setBlocklist(android.hardware.gnss.BlocklistedSource[] p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssConfiguration {
        static final int TRANSACTION_setSuplVersion = 1;
        static final int TRANSACTION_setSuplMode = 2;
        static final int TRANSACTION_setLppProfile = 3;
        static final int TRANSACTION_setGlonassPositioningProtocol = 4;
        static final int TRANSACTION_setEmergencySuplPdn = 5;
        static final int TRANSACTION_setEsExtensionSec = 6;
        static final int TRANSACTION_setBlocklist = 7;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.gnss.IGnssConfiguration asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.gnss.IGnssConfiguration {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setSuplVersion(int p0) throws android.os.RemoteException {}
            public void setSuplMode(int p0) throws android.os.RemoteException {}
            public void setLppProfile(int p0) throws android.os.RemoteException {}
            public void setGlonassPositioningProtocol(int p0) throws android.os.RemoteException {}
            public void setEmergencySuplPdn(boolean p0) throws android.os.RemoteException {}
            public void setEsExtensionSec(int p0) throws android.os.RemoteException {}
            public void setBlocklist(android.hardware.gnss.BlocklistedSource[] p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
