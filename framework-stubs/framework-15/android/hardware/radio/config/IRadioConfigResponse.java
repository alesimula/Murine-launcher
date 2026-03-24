package android.hardware.radio.config;

public interface IRadioConfigResponse extends android.os.IInterface {
    public static final int VERSION = 3;
    public static final java.lang.String HASH = "1e3dcfffc1e90fc886cf5a22ecaa94601b115710";
    public static final java.lang.String DESCRIPTOR = null;
    public void getHalDeviceCapabilitiesResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException;
    public void getNumOfLiveModemsResponse(android.hardware.radio.RadioResponseInfo p0, byte p1) throws android.os.RemoteException;
    public void getPhoneCapabilityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.config.PhoneCapability p1) throws android.os.RemoteException;
    public void getSimSlotsStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.config.SimSlotStatus[] p1) throws android.os.RemoteException;
    public void setNumOfLiveModemsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setPreferredDataModemResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setSimSlotsMappingResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void getSimultaneousCallingSupportResponse(android.hardware.radio.RadioResponseInfo p0, int[] p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.config.IRadioConfigResponse {
        public Default() {}
        public void getHalDeviceCapabilitiesResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
        public void getNumOfLiveModemsResponse(android.hardware.radio.RadioResponseInfo p0, byte p1) throws android.os.RemoteException {}
        public void getPhoneCapabilityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.config.PhoneCapability p1) throws android.os.RemoteException {}
        public void getSimSlotsStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.config.SimSlotStatus[] p1) throws android.os.RemoteException {}
        public void setNumOfLiveModemsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setPreferredDataModemResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setSimSlotsMappingResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getSimultaneousCallingSupportResponse(android.hardware.radio.RadioResponseInfo p0, int[] p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.config.IRadioConfigResponse {
        static final int TRANSACTION_getHalDeviceCapabilitiesResponse = 1;
        static final int TRANSACTION_getNumOfLiveModemsResponse = 2;
        static final int TRANSACTION_getPhoneCapabilityResponse = 3;
        static final int TRANSACTION_getSimSlotsStatusResponse = 4;
        static final int TRANSACTION_setNumOfLiveModemsResponse = 5;
        static final int TRANSACTION_setPreferredDataModemResponse = 6;
        static final int TRANSACTION_setSimSlotsMappingResponse = 7;
        static final int TRANSACTION_getSimultaneousCallingSupportResponse = 8;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.config.IRadioConfigResponse asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.config.IRadioConfigResponse {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getHalDeviceCapabilitiesResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
            public void getNumOfLiveModemsResponse(android.hardware.radio.RadioResponseInfo p0, byte p1) throws android.os.RemoteException {}
            public void getPhoneCapabilityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.config.PhoneCapability p1) throws android.os.RemoteException {}
            public void getSimSlotsStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.config.SimSlotStatus[] p1) throws android.os.RemoteException {}
            public void setNumOfLiveModemsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setPreferredDataModemResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setSimSlotsMappingResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void getSimultaneousCallingSupportResponse(android.hardware.radio.RadioResponseInfo p0, int[] p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
