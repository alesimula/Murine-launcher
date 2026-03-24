package android.telephony.ims.aidl;

public interface IImsConfig extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsConfig";
    public void addImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException;
    public void removeImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException;
    public int getConfigInt(int p0) throws android.os.RemoteException;
    public java.lang.String getConfigString(int p0) throws android.os.RemoteException;
    public int setConfigInt(int p0, int p1) throws android.os.RemoteException;
    public int setConfigString(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void updateImsCarrierConfigs(android.os.PersistableBundle p0) throws android.os.RemoteException;
    public void notifyRcsAutoConfigurationReceived(byte[] p0, boolean p1) throws android.os.RemoteException;
    public void notifyRcsAutoConfigurationRemoved() throws android.os.RemoteException;
    public void addRcsConfigCallback(android.telephony.ims.aidl.IRcsConfigCallback p0) throws android.os.RemoteException;
    public void removeRcsConfigCallback(android.telephony.ims.aidl.IRcsConfigCallback p0) throws android.os.RemoteException;
    public void triggerRcsReconfiguration() throws android.os.RemoteException;
    public void setRcsClientConfiguration(android.telephony.ims.RcsClientConfiguration p0) throws android.os.RemoteException;
    public void notifyIntImsConfigChanged(int p0, int p1) throws android.os.RemoteException;
    public void notifyStringImsConfigChanged(int p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsConfig {
        public Default() {}
        public void addImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException {}
        public void removeImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException {}
        public int getConfigInt(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getConfigString(int p0) throws android.os.RemoteException { return null; }
        public int setConfigInt(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int setConfigString(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void updateImsCarrierConfigs(android.os.PersistableBundle p0) throws android.os.RemoteException {}
        public void notifyRcsAutoConfigurationReceived(byte[] p0, boolean p1) throws android.os.RemoteException {}
        public void notifyRcsAutoConfigurationRemoved() throws android.os.RemoteException {}
        public void addRcsConfigCallback(android.telephony.ims.aidl.IRcsConfigCallback p0) throws android.os.RemoteException {}
        public void removeRcsConfigCallback(android.telephony.ims.aidl.IRcsConfigCallback p0) throws android.os.RemoteException {}
        public void triggerRcsReconfiguration() throws android.os.RemoteException {}
        public void setRcsClientConfiguration(android.telephony.ims.RcsClientConfiguration p0) throws android.os.RemoteException {}
        public void notifyIntImsConfigChanged(int p0, int p1) throws android.os.RemoteException {}
        public void notifyStringImsConfigChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsConfig {
        static final int TRANSACTION_addImsConfigCallback = 1;
        static final int TRANSACTION_removeImsConfigCallback = 2;
        static final int TRANSACTION_getConfigInt = 3;
        static final int TRANSACTION_getConfigString = 4;
        static final int TRANSACTION_setConfigInt = 5;
        static final int TRANSACTION_setConfigString = 6;
        static final int TRANSACTION_updateImsCarrierConfigs = 7;
        static final int TRANSACTION_notifyRcsAutoConfigurationReceived = 8;
        static final int TRANSACTION_notifyRcsAutoConfigurationRemoved = 9;
        static final int TRANSACTION_addRcsConfigCallback = 10;
        static final int TRANSACTION_removeRcsConfigCallback = 11;
        static final int TRANSACTION_triggerRcsReconfiguration = 12;
        static final int TRANSACTION_setRcsClientConfiguration = 13;
        static final int TRANSACTION_notifyIntImsConfigChanged = 14;
        static final int TRANSACTION_notifyStringImsConfigChanged = 15;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsConfig asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.ims.aidl.IImsConfig {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException {}
            public void removeImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException {}
            public int getConfigInt(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getConfigString(int p0) throws android.os.RemoteException { return null; }
            public int setConfigInt(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int setConfigString(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void updateImsCarrierConfigs(android.os.PersistableBundle p0) throws android.os.RemoteException {}
            public void notifyRcsAutoConfigurationReceived(byte[] p0, boolean p1) throws android.os.RemoteException {}
            public void notifyRcsAutoConfigurationRemoved() throws android.os.RemoteException {}
            public void addRcsConfigCallback(android.telephony.ims.aidl.IRcsConfigCallback p0) throws android.os.RemoteException {}
            public void removeRcsConfigCallback(android.telephony.ims.aidl.IRcsConfigCallback p0) throws android.os.RemoteException {}
            public void triggerRcsReconfiguration() throws android.os.RemoteException {}
            public void setRcsClientConfiguration(android.telephony.ims.RcsClientConfiguration p0) throws android.os.RemoteException {}
            public void notifyIntImsConfigChanged(int p0, int p1) throws android.os.RemoteException {}
            public void notifyStringImsConfigChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
