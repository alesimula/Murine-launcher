package android.hardware.radio.modem;

public interface IRadioModemIndication extends android.os.IInterface {
    public static final int VERSION = 4;
    public static final java.lang.String HASH = "787419262f7c39ea36c0fbe22681bada95d1f97b";
    public static final java.lang.String DESCRIPTOR = null;
    public void hardwareConfigChanged(int p0, android.hardware.radio.modem.HardwareConfig[] p1) throws android.os.RemoteException;
    public void modemReset(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void radioCapabilityIndication(int p0, android.hardware.radio.modem.RadioCapability p1) throws android.os.RemoteException;
    public void radioStateChanged(int p0, int p1) throws android.os.RemoteException;
    public void rilConnected(int p0) throws android.os.RemoteException;
    public void onImeiMappingChanged(int p0, android.hardware.radio.modem.ImeiInfo p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.modem.IRadioModemIndication {
        public Default() {}
        public void hardwareConfigChanged(int p0, android.hardware.radio.modem.HardwareConfig[] p1) throws android.os.RemoteException {}
        public void modemReset(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void radioCapabilityIndication(int p0, android.hardware.radio.modem.RadioCapability p1) throws android.os.RemoteException {}
        public void radioStateChanged(int p0, int p1) throws android.os.RemoteException {}
        public void rilConnected(int p0) throws android.os.RemoteException {}
        public void onImeiMappingChanged(int p0, android.hardware.radio.modem.ImeiInfo p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.modem.IRadioModemIndication {
        static final int TRANSACTION_hardwareConfigChanged = 1;
        static final int TRANSACTION_modemReset = 2;
        static final int TRANSACTION_radioCapabilityIndication = 3;
        static final int TRANSACTION_radioStateChanged = 4;
        static final int TRANSACTION_rilConnected = 5;
        static final int TRANSACTION_onImeiMappingChanged = 6;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.modem.IRadioModemIndication asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.modem.IRadioModemIndication {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void hardwareConfigChanged(int p0, android.hardware.radio.modem.HardwareConfig[] p1) throws android.os.RemoteException {}
            public void modemReset(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void radioCapabilityIndication(int p0, android.hardware.radio.modem.RadioCapability p1) throws android.os.RemoteException {}
            public void radioStateChanged(int p0, int p1) throws android.os.RemoteException {}
            public void rilConnected(int p0) throws android.os.RemoteException {}
            public void onImeiMappingChanged(int p0, android.hardware.radio.modem.ImeiInfo p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
