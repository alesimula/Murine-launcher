package android.media.tv.extension.signal;

public interface IHdmiSignalInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.signal.IHdmiSignalInterface";
    public void addHdmiSignalInfoListener(java.lang.String p0, android.media.tv.extension.signal.IHdmiSignalInfoListener p1) throws android.os.RemoteException;
    public void removeHdmiSignalInfoListener(java.lang.String p0, android.media.tv.extension.signal.IHdmiSignalInfoListener p1) throws android.os.RemoteException;
    public android.os.Bundle getHdmiSignalInfo(java.lang.String p0) throws android.os.RemoteException;
    public void setLowLatency(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setForceVrr(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.signal.IHdmiSignalInterface {
        public Default() {}
        public void addHdmiSignalInfoListener(java.lang.String p0, android.media.tv.extension.signal.IHdmiSignalInfoListener p1) throws android.os.RemoteException {}
        public void removeHdmiSignalInfoListener(java.lang.String p0, android.media.tv.extension.signal.IHdmiSignalInfoListener p1) throws android.os.RemoteException {}
        public android.os.Bundle getHdmiSignalInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void setLowLatency(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setForceVrr(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.signal.IHdmiSignalInterface {
        static final int TRANSACTION_addHdmiSignalInfoListener = 1;
        static final int TRANSACTION_removeHdmiSignalInfoListener = 2;
        static final int TRANSACTION_getHdmiSignalInfo = 3;
        static final int TRANSACTION_setLowLatency = 4;
        static final int TRANSACTION_setForceVrr = 5;
        public Stub() { super(); }
        public static android.media.tv.extension.signal.IHdmiSignalInterface asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.signal.IHdmiSignalInterface {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addHdmiSignalInfoListener(java.lang.String p0, android.media.tv.extension.signal.IHdmiSignalInfoListener p1) throws android.os.RemoteException {}
            public void removeHdmiSignalInfoListener(java.lang.String p0, android.media.tv.extension.signal.IHdmiSignalInfoListener p1) throws android.os.RemoteException {}
            public android.os.Bundle getHdmiSignalInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void setLowLatency(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setForceVrr(java.lang.String p0, int p1) throws android.os.RemoteException {}
        }
    }
}
