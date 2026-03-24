package android.hardware.radio.data;

public interface IRadioDataIndication extends android.os.IInterface {
    public static final int VERSION = 4;
    public static final java.lang.String HASH = "70713939dbe39fdbd3a294b3a3e3d2842b3bf4eb";
    public static final java.lang.String DESCRIPTOR = null;
    public void dataCallListChanged(int p0, android.hardware.radio.data.SetupDataCallResult[] p1) throws android.os.RemoteException;
    public void keepaliveStatus(int p0, android.hardware.radio.data.KeepaliveStatus p1) throws android.os.RemoteException;
    public void pcoData(int p0, android.hardware.radio.data.PcoDataInfo p1) throws android.os.RemoteException;
    public void unthrottleApn(int p0, android.hardware.radio.data.DataProfileInfo p1) throws android.os.RemoteException;
    public void slicingConfigChanged(int p0, android.hardware.radio.data.SlicingConfig p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.data.IRadioDataIndication {
        public Default() {}
        public void dataCallListChanged(int p0, android.hardware.radio.data.SetupDataCallResult[] p1) throws android.os.RemoteException {}
        public void keepaliveStatus(int p0, android.hardware.radio.data.KeepaliveStatus p1) throws android.os.RemoteException {}
        public void pcoData(int p0, android.hardware.radio.data.PcoDataInfo p1) throws android.os.RemoteException {}
        public void unthrottleApn(int p0, android.hardware.radio.data.DataProfileInfo p1) throws android.os.RemoteException {}
        public void slicingConfigChanged(int p0, android.hardware.radio.data.SlicingConfig p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.data.IRadioDataIndication {
        static final int TRANSACTION_dataCallListChanged = 1;
        static final int TRANSACTION_keepaliveStatus = 2;
        static final int TRANSACTION_pcoData = 3;
        static final int TRANSACTION_unthrottleApn = 4;
        static final int TRANSACTION_slicingConfigChanged = 5;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.data.IRadioDataIndication asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.data.IRadioDataIndication {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void dataCallListChanged(int p0, android.hardware.radio.data.SetupDataCallResult[] p1) throws android.os.RemoteException {}
            public void keepaliveStatus(int p0, android.hardware.radio.data.KeepaliveStatus p1) throws android.os.RemoteException {}
            public void pcoData(int p0, android.hardware.radio.data.PcoDataInfo p1) throws android.os.RemoteException {}
            public void unthrottleApn(int p0, android.hardware.radio.data.DataProfileInfo p1) throws android.os.RemoteException {}
            public void slicingConfigChanged(int p0, android.hardware.radio.data.SlicingConfig p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
