package android.media.tv.extension.cam;

public interface ICamMonitoringService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.cam.ICamMonitoringService";
    public void addCamInfoListener(android.media.tv.extension.cam.ICamInfoListener p0) throws android.os.RemoteException;
    public void removeCamInfoListener(android.media.tv.extension.cam.ICamInfoListener p0) throws android.os.RemoteException;
    public android.os.Bundle getCamInfo(int p0) throws android.os.RemoteException;
    public android.os.Bundle getSlotInfo(int p0) throws android.os.RemoteException;
    public int[] getSlotIds() throws android.os.RemoteException;
    public boolean isCamSupported() throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.cam.ICamMonitoringService {
        public Default() {}
        public void addCamInfoListener(android.media.tv.extension.cam.ICamInfoListener p0) throws android.os.RemoteException {}
        public void removeCamInfoListener(android.media.tv.extension.cam.ICamInfoListener p0) throws android.os.RemoteException {}
        public android.os.Bundle getCamInfo(int p0) throws android.os.RemoteException { return null; }
        public android.os.Bundle getSlotInfo(int p0) throws android.os.RemoteException { return null; }
        public int[] getSlotIds() throws android.os.RemoteException { return null; }
        public boolean isCamSupported() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.cam.ICamMonitoringService {
        static final int TRANSACTION_addCamInfoListener = 1;
        static final int TRANSACTION_removeCamInfoListener = 2;
        static final int TRANSACTION_getCamInfo = 3;
        static final int TRANSACTION_getSlotInfo = 4;
        static final int TRANSACTION_getSlotIds = 5;
        static final int TRANSACTION_isCamSupported = 6;
        public Stub() { super(); }
        public static android.media.tv.extension.cam.ICamMonitoringService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.cam.ICamMonitoringService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addCamInfoListener(android.media.tv.extension.cam.ICamInfoListener p0) throws android.os.RemoteException {}
            public void removeCamInfoListener(android.media.tv.extension.cam.ICamInfoListener p0) throws android.os.RemoteException {}
            public android.os.Bundle getCamInfo(int p0) throws android.os.RemoteException { return null; }
            public android.os.Bundle getSlotInfo(int p0) throws android.os.RemoteException { return null; }
            public int[] getSlotIds() throws android.os.RemoteException { return null; }
            public boolean isCamSupported() throws android.os.RemoteException { return false; }
        }
    }
}
