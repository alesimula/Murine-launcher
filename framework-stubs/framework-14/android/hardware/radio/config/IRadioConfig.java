package android.hardware.radio.config;

public interface IRadioConfig extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "0be135cf3de9586d6aabb58cb6af0ba425431743";
    public static final java.lang.String DESCRIPTOR = null;
    public void getHalDeviceCapabilities(int p0) throws android.os.RemoteException;
    public void getNumOfLiveModems(int p0) throws android.os.RemoteException;
    public void getPhoneCapability(int p0) throws android.os.RemoteException;
    public void getSimSlotsStatus(int p0) throws android.os.RemoteException;
    public void setNumOfLiveModems(int p0, byte p1) throws android.os.RemoteException;
    public void setPreferredDataModem(int p0, byte p1) throws android.os.RemoteException;
    public void setResponseFunctions(android.hardware.radio.config.IRadioConfigResponse p0, android.hardware.radio.config.IRadioConfigIndication p1) throws android.os.RemoteException;
    public void setSimSlotsMapping(int p0, android.hardware.radio.config.SlotPortMapping[] p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.config.IRadioConfig {
        public Default() {}
        public void getHalDeviceCapabilities(int p0) throws android.os.RemoteException {}
        public void getNumOfLiveModems(int p0) throws android.os.RemoteException {}
        public void getPhoneCapability(int p0) throws android.os.RemoteException {}
        public void getSimSlotsStatus(int p0) throws android.os.RemoteException {}
        public void setNumOfLiveModems(int p0, byte p1) throws android.os.RemoteException {}
        public void setPreferredDataModem(int p0, byte p1) throws android.os.RemoteException {}
        public void setResponseFunctions(android.hardware.radio.config.IRadioConfigResponse p0, android.hardware.radio.config.IRadioConfigIndication p1) throws android.os.RemoteException {}
        public void setSimSlotsMapping(int p0, android.hardware.radio.config.SlotPortMapping[] p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.config.IRadioConfig {
        static final int TRANSACTION_getHalDeviceCapabilities = 1;
        static final int TRANSACTION_getNumOfLiveModems = 2;
        static final int TRANSACTION_getPhoneCapability = 3;
        static final int TRANSACTION_getSimSlotsStatus = 4;
        static final int TRANSACTION_setNumOfLiveModems = 5;
        static final int TRANSACTION_setPreferredDataModem = 6;
        static final int TRANSACTION_setResponseFunctions = 7;
        static final int TRANSACTION_setSimSlotsMapping = 8;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.config.IRadioConfig asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.config.IRadioConfig {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getHalDeviceCapabilities(int p0) throws android.os.RemoteException {}
            public void getNumOfLiveModems(int p0) throws android.os.RemoteException {}
            public void getPhoneCapability(int p0) throws android.os.RemoteException {}
            public void getSimSlotsStatus(int p0) throws android.os.RemoteException {}
            public void setNumOfLiveModems(int p0, byte p1) throws android.os.RemoteException {}
            public void setPreferredDataModem(int p0, byte p1) throws android.os.RemoteException {}
            public void setResponseFunctions(android.hardware.radio.config.IRadioConfigResponse p0, android.hardware.radio.config.IRadioConfigIndication p1) throws android.os.RemoteException {}
            public void setSimSlotsMapping(int p0, android.hardware.radio.config.SlotPortMapping[] p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
