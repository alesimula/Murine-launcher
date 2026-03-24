package android.hardware.tv.tuner;

public interface IFrontend extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "f8d74c149f04e76b6d622db2bd8e465dae24b08c";
    public static final java.lang.String DESCRIPTOR = null;
    public void setCallback(android.hardware.tv.tuner.IFrontendCallback p0) throws android.os.RemoteException;
    public void tune(android.hardware.tv.tuner.FrontendSettings p0) throws android.os.RemoteException;
    public void stopTune() throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public void scan(android.hardware.tv.tuner.FrontendSettings p0, int p1) throws android.os.RemoteException;
    public void stopScan() throws android.os.RemoteException;
    public android.hardware.tv.tuner.FrontendStatus[] getStatus(int[] p0) throws android.os.RemoteException;
    public void setLnb(int p0) throws android.os.RemoteException;
    public int linkCiCam(int p0) throws android.os.RemoteException;
    public void unlinkCiCam(int p0) throws android.os.RemoteException;
    public java.lang.String getHardwareInfo() throws android.os.RemoteException;
    public void removeOutputPid(int p0) throws android.os.RemoteException;
    public int[] getFrontendStatusReadiness(int[] p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.tv.tuner.IFrontend {
        public Default() {}
        public void setCallback(android.hardware.tv.tuner.IFrontendCallback p0) throws android.os.RemoteException {}
        public void tune(android.hardware.tv.tuner.FrontendSettings p0) throws android.os.RemoteException {}
        public void stopTune() throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public void scan(android.hardware.tv.tuner.FrontendSettings p0, int p1) throws android.os.RemoteException {}
        public void stopScan() throws android.os.RemoteException {}
        public android.hardware.tv.tuner.FrontendStatus[] getStatus(int[] p0) throws android.os.RemoteException { return null; }
        public void setLnb(int p0) throws android.os.RemoteException {}
        public int linkCiCam(int p0) throws android.os.RemoteException { return 0; }
        public void unlinkCiCam(int p0) throws android.os.RemoteException {}
        public java.lang.String getHardwareInfo() throws android.os.RemoteException { return null; }
        public void removeOutputPid(int p0) throws android.os.RemoteException {}
        public int[] getFrontendStatusReadiness(int[] p0) throws android.os.RemoteException { return null; }
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.tv.tuner.IFrontend {
        static final int TRANSACTION_setCallback = 1;
        static final int TRANSACTION_tune = 2;
        static final int TRANSACTION_stopTune = 3;
        static final int TRANSACTION_close = 4;
        static final int TRANSACTION_scan = 5;
        static final int TRANSACTION_stopScan = 6;
        static final int TRANSACTION_getStatus = 7;
        static final int TRANSACTION_setLnb = 8;
        static final int TRANSACTION_linkCiCam = 9;
        static final int TRANSACTION_unlinkCiCam = 10;
        static final int TRANSACTION_getHardwareInfo = 11;
        static final int TRANSACTION_removeOutputPid = 12;
        static final int TRANSACTION_getFrontendStatusReadiness = 13;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.tv.tuner.IFrontend asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.tv.tuner.IFrontend {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setCallback(android.hardware.tv.tuner.IFrontendCallback p0) throws android.os.RemoteException {}
            public void tune(android.hardware.tv.tuner.FrontendSettings p0) throws android.os.RemoteException {}
            public void stopTune() throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
            public void scan(android.hardware.tv.tuner.FrontendSettings p0, int p1) throws android.os.RemoteException {}
            public void stopScan() throws android.os.RemoteException {}
            public android.hardware.tv.tuner.FrontendStatus[] getStatus(int[] p0) throws android.os.RemoteException { return null; }
            public void setLnb(int p0) throws android.os.RemoteException {}
            public int linkCiCam(int p0) throws android.os.RemoteException { return 0; }
            public void unlinkCiCam(int p0) throws android.os.RemoteException {}
            public java.lang.String getHardwareInfo() throws android.os.RemoteException { return null; }
            public void removeOutputPid(int p0) throws android.os.RemoteException {}
            public int[] getFrontendStatusReadiness(int[] p0) throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
