package android.media;

public interface ISpatializerHeadTrackingModeCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.ISpatializerHeadTrackingModeCallback";
    public void dispatchSpatializerActualHeadTrackingModeChanged(int p0) throws android.os.RemoteException;
    public void dispatchSpatializerDesiredHeadTrackingModeChanged(int p0) throws android.os.RemoteException;

    public static class Default implements android.media.ISpatializerHeadTrackingModeCallback {
        public Default() {}
        public void dispatchSpatializerActualHeadTrackingModeChanged(int p0) throws android.os.RemoteException {}
        public void dispatchSpatializerDesiredHeadTrackingModeChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.ISpatializerHeadTrackingModeCallback {
        static final int TRANSACTION_dispatchSpatializerActualHeadTrackingModeChanged = 1;
        static final int TRANSACTION_dispatchSpatializerDesiredHeadTrackingModeChanged = 2;
        public Stub() { super(); }
        public static android.media.ISpatializerHeadTrackingModeCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.ISpatializerHeadTrackingModeCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void dispatchSpatializerActualHeadTrackingModeChanged(int p0) throws android.os.RemoteException {}
            public void dispatchSpatializerDesiredHeadTrackingModeChanged(int p0) throws android.os.RemoteException {}
        }
    }
}
