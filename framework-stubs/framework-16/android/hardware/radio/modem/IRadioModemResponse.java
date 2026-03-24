package android.hardware.radio.modem;

public interface IRadioModemResponse extends android.os.IInterface {
    public static final int VERSION = 4;
    public static final java.lang.String HASH = "787419262f7c39ea36c0fbe22681bada95d1f97b";
    public static final java.lang.String DESCRIPTOR = null;
    public void acknowledgeRequest(int p0) throws android.os.RemoteException;
    public void enableModemResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void getBasebandVersionResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void getDeviceIdentityResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void getHardwareConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.HardwareConfig[] p1) throws android.os.RemoteException;
    public void getModemActivityInfoResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.ActivityStatsInfo p1) throws android.os.RemoteException;
    public void getModemStackStatusResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException;
    public void getRadioCapabilityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.RadioCapability p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void nvReadItemResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException;
    public void nvResetConfigResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void nvWriteCdmaPrlResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void nvWriteItemResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void requestShutdownResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void sendDeviceStateResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setRadioCapabilityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.RadioCapability p1) throws android.os.RemoteException;
    public void setRadioPowerResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void getImeiResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.ImeiInfo p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.modem.IRadioModemResponse {
        public Default() {}
        public void acknowledgeRequest(int p0) throws android.os.RemoteException {}
        public void enableModemResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getBasebandVersionResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
        public void getDeviceIdentityResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void getHardwareConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.HardwareConfig[] p1) throws android.os.RemoteException {}
        public void getModemActivityInfoResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.ActivityStatsInfo p1) throws android.os.RemoteException {}
        public void getModemStackStatusResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
        public void getRadioCapabilityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.RadioCapability p1) throws android.os.RemoteException {}
        public void nvReadItemResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
        public void nvResetConfigResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void nvWriteCdmaPrlResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void nvWriteItemResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void requestShutdownResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void sendDeviceStateResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setRadioCapabilityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.RadioCapability p1) throws android.os.RemoteException {}
        public void setRadioPowerResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getImeiResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.ImeiInfo p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.modem.IRadioModemResponse {
        static final int TRANSACTION_acknowledgeRequest = 1;
        static final int TRANSACTION_enableModemResponse = 2;
        static final int TRANSACTION_getBasebandVersionResponse = 3;
        static final int TRANSACTION_getDeviceIdentityResponse = 4;
        static final int TRANSACTION_getHardwareConfigResponse = 5;
        static final int TRANSACTION_getModemActivityInfoResponse = 6;
        static final int TRANSACTION_getModemStackStatusResponse = 7;
        static final int TRANSACTION_getRadioCapabilityResponse = 8;
        static final int TRANSACTION_nvReadItemResponse = 9;
        static final int TRANSACTION_nvResetConfigResponse = 10;
        static final int TRANSACTION_nvWriteCdmaPrlResponse = 11;
        static final int TRANSACTION_nvWriteItemResponse = 12;
        static final int TRANSACTION_requestShutdownResponse = 13;
        static final int TRANSACTION_sendDeviceStateResponse = 14;
        static final int TRANSACTION_setRadioCapabilityResponse = 15;
        static final int TRANSACTION_setRadioPowerResponse = 16;
        static final int TRANSACTION_getImeiResponse = 17;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.modem.IRadioModemResponse asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.modem.IRadioModemResponse {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void acknowledgeRequest(int p0) throws android.os.RemoteException {}
            public void enableModemResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void getBasebandVersionResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
            public void getDeviceIdentityResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void getHardwareConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.HardwareConfig[] p1) throws android.os.RemoteException {}
            public void getModemActivityInfoResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.ActivityStatsInfo p1) throws android.os.RemoteException {}
            public void getModemStackStatusResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
            public void getRadioCapabilityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.RadioCapability p1) throws android.os.RemoteException {}
            public void nvReadItemResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
            public void nvResetConfigResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void nvWriteCdmaPrlResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void nvWriteItemResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void requestShutdownResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void sendDeviceStateResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setRadioCapabilityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.RadioCapability p1) throws android.os.RemoteException {}
            public void setRadioPowerResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void getImeiResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.ImeiInfo p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
