package android.hardware.radio.modem;

public interface IRadioModem extends android.os.IInterface {
    public static final int VERSION = 3;
    public static final java.lang.String HASH = "8586a5528f0085c15cff4b6628f1b8153aca29ad";
    public static final java.lang.String DESCRIPTOR = null;
    public void enableModem(int p0, boolean p1) throws android.os.RemoteException;
    public void getBasebandVersion(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void getDeviceIdentity(int p0) throws android.os.RemoteException;
    public void getHardwareConfig(int p0) throws android.os.RemoteException;
    public void getModemActivityInfo(int p0) throws android.os.RemoteException;
    public void getModemStackStatus(int p0) throws android.os.RemoteException;
    public void getRadioCapability(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void nvReadItem(int p0, int p1) throws android.os.RemoteException;
    public void nvResetConfig(int p0, int p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void nvWriteCdmaPrl(int p0, byte[] p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void nvWriteItem(int p0, android.hardware.radio.modem.NvWriteItem p1) throws android.os.RemoteException;
    public void requestShutdown(int p0) throws android.os.RemoteException;
    public void responseAcknowledgement() throws android.os.RemoteException;
    public void sendDeviceState(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setRadioCapability(int p0, android.hardware.radio.modem.RadioCapability p1) throws android.os.RemoteException;
    public void setRadioPower(int p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException;
    public void setResponseFunctions(android.hardware.radio.modem.IRadioModemResponse p0, android.hardware.radio.modem.IRadioModemIndication p1) throws android.os.RemoteException;
    public void getImei(int p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.modem.IRadioModem {
        public Default() {}
        public void enableModem(int p0, boolean p1) throws android.os.RemoteException {}
        public void getBasebandVersion(int p0) throws android.os.RemoteException {}
        public void getDeviceIdentity(int p0) throws android.os.RemoteException {}
        public void getHardwareConfig(int p0) throws android.os.RemoteException {}
        public void getModemActivityInfo(int p0) throws android.os.RemoteException {}
        public void getModemStackStatus(int p0) throws android.os.RemoteException {}
        public void getRadioCapability(int p0) throws android.os.RemoteException {}
        public void nvReadItem(int p0, int p1) throws android.os.RemoteException {}
        public void nvResetConfig(int p0, int p1) throws android.os.RemoteException {}
        public void nvWriteCdmaPrl(int p0, byte[] p1) throws android.os.RemoteException {}
        public void nvWriteItem(int p0, android.hardware.radio.modem.NvWriteItem p1) throws android.os.RemoteException {}
        public void requestShutdown(int p0) throws android.os.RemoteException {}
        public void responseAcknowledgement() throws android.os.RemoteException {}
        public void sendDeviceState(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setRadioCapability(int p0, android.hardware.radio.modem.RadioCapability p1) throws android.os.RemoteException {}
        public void setRadioPower(int p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException {}
        public void setResponseFunctions(android.hardware.radio.modem.IRadioModemResponse p0, android.hardware.radio.modem.IRadioModemIndication p1) throws android.os.RemoteException {}
        public void getImei(int p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.modem.IRadioModem {
        static final int TRANSACTION_enableModem = 1;
        static final int TRANSACTION_getBasebandVersion = 2;
        static final int TRANSACTION_getDeviceIdentity = 3;
        static final int TRANSACTION_getHardwareConfig = 4;
        static final int TRANSACTION_getModemActivityInfo = 5;
        static final int TRANSACTION_getModemStackStatus = 6;
        static final int TRANSACTION_getRadioCapability = 7;
        static final int TRANSACTION_nvReadItem = 8;
        static final int TRANSACTION_nvResetConfig = 9;
        static final int TRANSACTION_nvWriteCdmaPrl = 10;
        static final int TRANSACTION_nvWriteItem = 11;
        static final int TRANSACTION_requestShutdown = 12;
        static final int TRANSACTION_responseAcknowledgement = 13;
        static final int TRANSACTION_sendDeviceState = 14;
        static final int TRANSACTION_setRadioCapability = 15;
        static final int TRANSACTION_setRadioPower = 16;
        static final int TRANSACTION_setResponseFunctions = 17;
        static final int TRANSACTION_getImei = 18;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.modem.IRadioModem asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.modem.IRadioModem {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void enableModem(int p0, boolean p1) throws android.os.RemoteException {}
            public void getBasebandVersion(int p0) throws android.os.RemoteException {}
            public void getDeviceIdentity(int p0) throws android.os.RemoteException {}
            public void getHardwareConfig(int p0) throws android.os.RemoteException {}
            public void getModemActivityInfo(int p0) throws android.os.RemoteException {}
            public void getModemStackStatus(int p0) throws android.os.RemoteException {}
            public void getRadioCapability(int p0) throws android.os.RemoteException {}
            public void nvReadItem(int p0, int p1) throws android.os.RemoteException {}
            public void nvResetConfig(int p0, int p1) throws android.os.RemoteException {}
            public void nvWriteCdmaPrl(int p0, byte[] p1) throws android.os.RemoteException {}
            public void nvWriteItem(int p0, android.hardware.radio.modem.NvWriteItem p1) throws android.os.RemoteException {}
            public void requestShutdown(int p0) throws android.os.RemoteException {}
            public void responseAcknowledgement() throws android.os.RemoteException {}
            public void sendDeviceState(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setRadioCapability(int p0, android.hardware.radio.modem.RadioCapability p1) throws android.os.RemoteException {}
            public void setRadioPower(int p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException {}
            public void setResponseFunctions(android.hardware.radio.modem.IRadioModemResponse p0, android.hardware.radio.modem.IRadioModemIndication p1) throws android.os.RemoteException {}
            public void getImei(int p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
