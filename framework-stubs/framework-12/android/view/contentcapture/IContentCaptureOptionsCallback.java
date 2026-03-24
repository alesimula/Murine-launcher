package android.view.contentcapture;

public interface IContentCaptureOptionsCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.contentcapture.IContentCaptureOptionsCallback";
    public void setContentCaptureOptions(android.content.ContentCaptureOptions p0) throws android.os.RemoteException;

    public static class Default implements android.view.contentcapture.IContentCaptureOptionsCallback {
        public Default() {}
        public void setContentCaptureOptions(android.content.ContentCaptureOptions p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.contentcapture.IContentCaptureOptionsCallback {
        static final int TRANSACTION_setContentCaptureOptions = 1;
        public Stub() { super(); }
        public static android.view.contentcapture.IContentCaptureOptionsCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.contentcapture.IContentCaptureOptionsCallback p0) { return false; }
        public static android.view.contentcapture.IContentCaptureOptionsCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.view.contentcapture.IContentCaptureOptionsCallback {
            private android.os.IBinder mRemote;
            public static android.view.contentcapture.IContentCaptureOptionsCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setContentCaptureOptions(android.content.ContentCaptureOptions p0) throws android.os.RemoteException {}
        }
    }
}
