package android.service.contentcapture;

public interface IContentCaptureServiceCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.contentcapture.IContentCaptureServiceCallback";
    public void setContentCaptureWhitelist(java.util.List<java.lang.String> p0, java.util.List<android.content.ComponentName> p1) throws android.os.RemoteException;
    public void setContentCaptureConditions(java.lang.String p0, java.util.List<android.view.contentcapture.ContentCaptureCondition> p1) throws android.os.RemoteException;
    public void disableSelf() throws android.os.RemoteException;
    public void writeSessionFlush(int p0, android.content.ComponentName p1, android.service.contentcapture.FlushMetrics p2, android.content.ContentCaptureOptions p3, int p4) throws android.os.RemoteException;

    public static class Default implements android.service.contentcapture.IContentCaptureServiceCallback {
        public Default() {}
        public void setContentCaptureWhitelist(java.util.List<java.lang.String> p0, java.util.List<android.content.ComponentName> p1) throws android.os.RemoteException {}
        public void setContentCaptureConditions(java.lang.String p0, java.util.List<android.view.contentcapture.ContentCaptureCondition> p1) throws android.os.RemoteException {}
        public void disableSelf() throws android.os.RemoteException {}
        public void writeSessionFlush(int p0, android.content.ComponentName p1, android.service.contentcapture.FlushMetrics p2, android.content.ContentCaptureOptions p3, int p4) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.contentcapture.IContentCaptureServiceCallback {
        static final int TRANSACTION_setContentCaptureWhitelist = 1;
        static final int TRANSACTION_setContentCaptureConditions = 2;
        static final int TRANSACTION_disableSelf = 3;
        static final int TRANSACTION_writeSessionFlush = 4;
        public Stub() { super(); }
        public static android.service.contentcapture.IContentCaptureServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.contentcapture.IContentCaptureServiceCallback p0) { return false; }
        public static android.service.contentcapture.IContentCaptureServiceCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.service.contentcapture.IContentCaptureServiceCallback {
            private android.os.IBinder mRemote;
            public static android.service.contentcapture.IContentCaptureServiceCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setContentCaptureWhitelist(java.util.List<java.lang.String> p0, java.util.List<android.content.ComponentName> p1) throws android.os.RemoteException {}
            public void setContentCaptureConditions(java.lang.String p0, java.util.List<android.view.contentcapture.ContentCaptureCondition> p1) throws android.os.RemoteException {}
            public void disableSelf() throws android.os.RemoteException {}
            public void writeSessionFlush(int p0, android.content.ComponentName p1, android.service.contentcapture.FlushMetrics p2, android.content.ContentCaptureOptions p3, int p4) throws android.os.RemoteException {}
        }
    }
}
