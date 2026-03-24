package android.hardware.tv.tuner;

public interface ITuner extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "f8d74c149f04e76b6d622db2bd8e465dae24b08c";
    public static final java.lang.String DESCRIPTOR = null;
    public int[] getFrontendIds() throws android.os.RemoteException;
    public android.hardware.tv.tuner.IFrontend openFrontendById(int p0) throws android.os.RemoteException;
    public android.hardware.tv.tuner.IDemux openDemux(int[] p0) throws android.os.RemoteException;
    public android.hardware.tv.tuner.DemuxCapabilities getDemuxCaps() throws android.os.RemoteException;
    public android.hardware.tv.tuner.IDescrambler openDescrambler() throws android.os.RemoteException;
    public android.hardware.tv.tuner.FrontendInfo getFrontendInfo(int p0) throws android.os.RemoteException;
    public int[] getLnbIds() throws android.os.RemoteException;
    public android.hardware.tv.tuner.ILnb openLnbById(int p0) throws android.os.RemoteException;
    public android.hardware.tv.tuner.ILnb openLnbByName(java.lang.String p0, int[] p1) throws android.os.RemoteException;
    public void setLna(boolean p0) throws android.os.RemoteException;
    public void setMaxNumberOfFrontends(int p0, int p1) throws android.os.RemoteException;
    public int getMaxNumberOfFrontends(int p0) throws android.os.RemoteException;
    public boolean isLnaSupported() throws android.os.RemoteException;
    public int[] getDemuxIds() throws android.os.RemoteException;
    public android.hardware.tv.tuner.IDemux openDemuxById(int p0) throws android.os.RemoteException;
    public android.hardware.tv.tuner.DemuxInfo getDemuxInfo(int p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.tv.tuner.ITuner {
        public Default() {}
        public int[] getFrontendIds() throws android.os.RemoteException { return null; }
        public android.hardware.tv.tuner.IFrontend openFrontendById(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.tv.tuner.IDemux openDemux(int[] p0) throws android.os.RemoteException { return null; }
        public android.hardware.tv.tuner.DemuxCapabilities getDemuxCaps() throws android.os.RemoteException { return null; }
        public android.hardware.tv.tuner.IDescrambler openDescrambler() throws android.os.RemoteException { return null; }
        public android.hardware.tv.tuner.FrontendInfo getFrontendInfo(int p0) throws android.os.RemoteException { return null; }
        public int[] getLnbIds() throws android.os.RemoteException { return null; }
        public android.hardware.tv.tuner.ILnb openLnbById(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.tv.tuner.ILnb openLnbByName(java.lang.String p0, int[] p1) throws android.os.RemoteException { return null; }
        public void setLna(boolean p0) throws android.os.RemoteException {}
        public void setMaxNumberOfFrontends(int p0, int p1) throws android.os.RemoteException {}
        public int getMaxNumberOfFrontends(int p0) throws android.os.RemoteException { return 0; }
        public boolean isLnaSupported() throws android.os.RemoteException { return false; }
        public int[] getDemuxIds() throws android.os.RemoteException { return null; }
        public android.hardware.tv.tuner.IDemux openDemuxById(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.tv.tuner.DemuxInfo getDemuxInfo(int p0) throws android.os.RemoteException { return null; }
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.tv.tuner.ITuner {
        static final int TRANSACTION_getFrontendIds = 1;
        static final int TRANSACTION_openFrontendById = 2;
        static final int TRANSACTION_openDemux = 3;
        static final int TRANSACTION_getDemuxCaps = 4;
        static final int TRANSACTION_openDescrambler = 5;
        static final int TRANSACTION_getFrontendInfo = 6;
        static final int TRANSACTION_getLnbIds = 7;
        static final int TRANSACTION_openLnbById = 8;
        static final int TRANSACTION_openLnbByName = 9;
        static final int TRANSACTION_setLna = 10;
        static final int TRANSACTION_setMaxNumberOfFrontends = 11;
        static final int TRANSACTION_getMaxNumberOfFrontends = 12;
        static final int TRANSACTION_isLnaSupported = 13;
        static final int TRANSACTION_getDemuxIds = 14;
        static final int TRANSACTION_openDemuxById = 15;
        static final int TRANSACTION_getDemuxInfo = 16;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.tv.tuner.ITuner asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.tv.tuner.ITuner {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int[] getFrontendIds() throws android.os.RemoteException { return null; }
            public android.hardware.tv.tuner.IFrontend openFrontendById(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.tv.tuner.IDemux openDemux(int[] p0) throws android.os.RemoteException { return null; }
            public android.hardware.tv.tuner.DemuxCapabilities getDemuxCaps() throws android.os.RemoteException { return null; }
            public android.hardware.tv.tuner.IDescrambler openDescrambler() throws android.os.RemoteException { return null; }
            public android.hardware.tv.tuner.FrontendInfo getFrontendInfo(int p0) throws android.os.RemoteException { return null; }
            public int[] getLnbIds() throws android.os.RemoteException { return null; }
            public android.hardware.tv.tuner.ILnb openLnbById(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.tv.tuner.ILnb openLnbByName(java.lang.String p0, int[] p1) throws android.os.RemoteException { return null; }
            public void setLna(boolean p0) throws android.os.RemoteException {}
            public void setMaxNumberOfFrontends(int p0, int p1) throws android.os.RemoteException {}
            public int getMaxNumberOfFrontends(int p0) throws android.os.RemoteException { return 0; }
            public boolean isLnaSupported() throws android.os.RemoteException { return false; }
            public int[] getDemuxIds() throws android.os.RemoteException { return null; }
            public android.hardware.tv.tuner.IDemux openDemuxById(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.tv.tuner.DemuxInfo getDemuxInfo(int p0) throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
