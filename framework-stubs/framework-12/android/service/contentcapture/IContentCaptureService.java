package android.service.contentcapture;

public interface IContentCaptureService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.contentcapture.IContentCaptureService";
    public void onConnected(android.os.IBinder p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public void onDisconnected() throws android.os.RemoteException;
    public void onSessionStarted(android.view.contentcapture.ContentCaptureContext p0, int p1, int p2, com.android.internal.os.IResultReceiver p3, int p4) throws android.os.RemoteException;
    public void onSessionFinished(int p0) throws android.os.RemoteException;
    public void onActivitySnapshot(int p0, android.service.contentcapture.SnapshotData p1) throws android.os.RemoteException;
    public void onDataRemovalRequest(android.view.contentcapture.DataRemovalRequest p0) throws android.os.RemoteException;
    public void onDataShared(android.view.contentcapture.DataShareRequest p0, android.service.contentcapture.IDataShareCallback p1) throws android.os.RemoteException;
    public void onActivityEvent(android.service.contentcapture.ActivityEvent p0) throws android.os.RemoteException;

    public static class Default implements android.service.contentcapture.IContentCaptureService {
        public Default() {}
        public void onConnected(android.os.IBinder p0, boolean p1, boolean p2) throws android.os.RemoteException {}
        public void onDisconnected() throws android.os.RemoteException {}
        public void onSessionStarted(android.view.contentcapture.ContentCaptureContext p0, int p1, int p2, com.android.internal.os.IResultReceiver p3, int p4) throws android.os.RemoteException {}
        public void onSessionFinished(int p0) throws android.os.RemoteException {}
        public void onActivitySnapshot(int p0, android.service.contentcapture.SnapshotData p1) throws android.os.RemoteException {}
        public void onDataRemovalRequest(android.view.contentcapture.DataRemovalRequest p0) throws android.os.RemoteException {}
        public void onDataShared(android.view.contentcapture.DataShareRequest p0, android.service.contentcapture.IDataShareCallback p1) throws android.os.RemoteException {}
        public void onActivityEvent(android.service.contentcapture.ActivityEvent p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.contentcapture.IContentCaptureService {
        static final int TRANSACTION_onConnected = 1;
        static final int TRANSACTION_onDisconnected = 2;
        static final int TRANSACTION_onSessionStarted = 3;
        static final int TRANSACTION_onSessionFinished = 4;
        static final int TRANSACTION_onActivitySnapshot = 5;
        static final int TRANSACTION_onDataRemovalRequest = 6;
        static final int TRANSACTION_onDataShared = 7;
        static final int TRANSACTION_onActivityEvent = 8;
        public Stub() { super(); }
        public static android.service.contentcapture.IContentCaptureService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.contentcapture.IContentCaptureService p0) { return false; }
        public static android.service.contentcapture.IContentCaptureService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.contentcapture.IContentCaptureService {
            private android.os.IBinder mRemote;
            public static android.service.contentcapture.IContentCaptureService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConnected(android.os.IBinder p0, boolean p1, boolean p2) throws android.os.RemoteException {}
            public void onDisconnected() throws android.os.RemoteException {}
            public void onSessionStarted(android.view.contentcapture.ContentCaptureContext p0, int p1, int p2, com.android.internal.os.IResultReceiver p3, int p4) throws android.os.RemoteException {}
            public void onSessionFinished(int p0) throws android.os.RemoteException {}
            public void onActivitySnapshot(int p0, android.service.contentcapture.SnapshotData p1) throws android.os.RemoteException {}
            public void onDataRemovalRequest(android.view.contentcapture.DataRemovalRequest p0) throws android.os.RemoteException {}
            public void onDataShared(android.view.contentcapture.DataShareRequest p0, android.service.contentcapture.IDataShareCallback p1) throws android.os.RemoteException {}
            public void onActivityEvent(android.service.contentcapture.ActivityEvent p0) throws android.os.RemoteException {}
        }
    }
}
