package android.media.tv.extension.cam;

public interface ICamHostControlService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.cam.ICamHostControlService";
    public void addCamHostcontrolInfoListener(android.media.tv.extension.cam.ICamHostControlInfoListener p0) throws android.os.RemoteException;
    public void removeCamHostcontrolInfoListener(android.media.tv.extension.cam.ICamHostControlInfoListener p0) throws android.os.RemoteException;
    public int sendCamHostControlAskRelease(java.lang.String p0, android.media.tv.extension.cam.ICamHostControlAskReleaseReplyCallback p1) throws android.os.RemoteException;
    public void setHostControlMode(java.lang.String p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.cam.ICamHostControlService {
        public Default() {}
        public void addCamHostcontrolInfoListener(android.media.tv.extension.cam.ICamHostControlInfoListener p0) throws android.os.RemoteException {}
        public void removeCamHostcontrolInfoListener(android.media.tv.extension.cam.ICamHostControlInfoListener p0) throws android.os.RemoteException {}
        public int sendCamHostControlAskRelease(java.lang.String p0, android.media.tv.extension.cam.ICamHostControlAskReleaseReplyCallback p1) throws android.os.RemoteException { return 0; }
        public void setHostControlMode(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.cam.ICamHostControlService {
        static final int TRANSACTION_addCamHostcontrolInfoListener = 1;
        static final int TRANSACTION_removeCamHostcontrolInfoListener = 2;
        static final int TRANSACTION_sendCamHostControlAskRelease = 3;
        static final int TRANSACTION_setHostControlMode = 4;
        public Stub() { super(); }
        public static android.media.tv.extension.cam.ICamHostControlService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.cam.ICamHostControlService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addCamHostcontrolInfoListener(android.media.tv.extension.cam.ICamHostControlInfoListener p0) throws android.os.RemoteException {}
            public void removeCamHostcontrolInfoListener(android.media.tv.extension.cam.ICamHostControlInfoListener p0) throws android.os.RemoteException {}
            public int sendCamHostControlAskRelease(java.lang.String p0, android.media.tv.extension.cam.ICamHostControlAskReleaseReplyCallback p1) throws android.os.RemoteException { return 0; }
            public void setHostControlMode(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
