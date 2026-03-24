package android.view.contentcapture;

public interface IContentCaptureManager extends android.os.IInterface {
    public void startSession(android.os.IBinder p0, android.content.ComponentName p1, int p2, int p3, com.android.internal.os.IResultReceiver p4) throws android.os.RemoteException;
    public void finishSession(int p0) throws android.os.RemoteException;
    public void getServiceComponentName(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException;
    public void removeData(android.view.contentcapture.DataRemovalRequest p0) throws android.os.RemoteException;
    public void shareData(android.view.contentcapture.DataShareRequest p0, android.view.contentcapture.IDataShareWriteAdapter p1) throws android.os.RemoteException;
    public void isContentCaptureFeatureEnabled(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException;
    public void getServiceSettingsActivity(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException;
    public void getContentCaptureConditions(java.lang.String p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException;

    public static class Default implements android.view.contentcapture.IContentCaptureManager {
        public Default() {}
        public void startSession(android.os.IBinder p0, android.content.ComponentName p1, int p2, int p3, com.android.internal.os.IResultReceiver p4) throws android.os.RemoteException {}
        public void finishSession(int p0) throws android.os.RemoteException {}
        public void getServiceComponentName(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
        public void removeData(android.view.contentcapture.DataRemovalRequest p0) throws android.os.RemoteException {}
        public void shareData(android.view.contentcapture.DataShareRequest p0, android.view.contentcapture.IDataShareWriteAdapter p1) throws android.os.RemoteException {}
        public void isContentCaptureFeatureEnabled(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
        public void getServiceSettingsActivity(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
        public void getContentCaptureConditions(java.lang.String p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.contentcapture.IContentCaptureManager {
        private static final java.lang.String DESCRIPTOR = "android.view.contentcapture.IContentCaptureManager";
        static final int TRANSACTION_startSession = 1;
        static final int TRANSACTION_finishSession = 2;
        static final int TRANSACTION_getServiceComponentName = 3;
        static final int TRANSACTION_removeData = 4;
        static final int TRANSACTION_shareData = 5;
        static final int TRANSACTION_isContentCaptureFeatureEnabled = 6;
        static final int TRANSACTION_getServiceSettingsActivity = 7;
        static final int TRANSACTION_getContentCaptureConditions = 8;
        public Stub() { super(); }
        public static android.view.contentcapture.IContentCaptureManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.contentcapture.IContentCaptureManager p0) { return false; }
        public static android.view.contentcapture.IContentCaptureManager getDefaultImpl() { return null; }

        private static class Proxy implements android.view.contentcapture.IContentCaptureManager {
            private android.os.IBinder mRemote;
            public static android.view.contentcapture.IContentCaptureManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startSession(android.os.IBinder p0, android.content.ComponentName p1, int p2, int p3, com.android.internal.os.IResultReceiver p4) throws android.os.RemoteException {}
            public void finishSession(int p0) throws android.os.RemoteException {}
            public void getServiceComponentName(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
            public void removeData(android.view.contentcapture.DataRemovalRequest p0) throws android.os.RemoteException {}
            public void shareData(android.view.contentcapture.DataShareRequest p0, android.view.contentcapture.IDataShareWriteAdapter p1) throws android.os.RemoteException {}
            public void isContentCaptureFeatureEnabled(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
            public void getServiceSettingsActivity(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
            public void getContentCaptureConditions(java.lang.String p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException {}
        }
    }
}
