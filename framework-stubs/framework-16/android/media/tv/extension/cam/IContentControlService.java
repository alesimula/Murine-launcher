package android.media.tv.extension.cam;

public interface IContentControlService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.cam.IContentControlService";
    public void addCamDrmInfoListener(android.media.tv.extension.cam.ICamDrmInfoListener p0) throws android.os.RemoteException;
    public void removeCamDrmInfoListener(android.media.tv.extension.cam.ICamDrmInfoListener p0) throws android.os.RemoteException;
    public int getCamDrmInfo(int p0, android.os.Bundle p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.cam.IContentControlService {
        public Default() {}
        public void addCamDrmInfoListener(android.media.tv.extension.cam.ICamDrmInfoListener p0) throws android.os.RemoteException {}
        public void removeCamDrmInfoListener(android.media.tv.extension.cam.ICamDrmInfoListener p0) throws android.os.RemoteException {}
        public int getCamDrmInfo(int p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.cam.IContentControlService {
        static final int TRANSACTION_addCamDrmInfoListener = 1;
        static final int TRANSACTION_removeCamDrmInfoListener = 2;
        static final int TRANSACTION_getCamDrmInfo = 3;
        public Stub() { super(); }
        public static android.media.tv.extension.cam.IContentControlService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.cam.IContentControlService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addCamDrmInfoListener(android.media.tv.extension.cam.ICamDrmInfoListener p0) throws android.os.RemoteException {}
            public void removeCamDrmInfoListener(android.media.tv.extension.cam.ICamDrmInfoListener p0) throws android.os.RemoteException {}
            public int getCamDrmInfo(int p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
        }
    }
}
