package android.media.tv;

public interface ITvInputHardwareCallback extends android.os.IInterface {
    public void onReleased() throws android.os.RemoteException;
    public void onStreamConfigChanged(android.media.tv.TvStreamConfig[] p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.ITvInputHardwareCallback {
        public Default() {}
        public void onReleased() throws android.os.RemoteException {}
        public void onStreamConfigChanged(android.media.tv.TvStreamConfig[] p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvInputHardwareCallback {
        private static final java.lang.String DESCRIPTOR = "android.media.tv.ITvInputHardwareCallback";
        static final int TRANSACTION_onReleased = 1;
        static final int TRANSACTION_onStreamConfigChanged = 2;
        public Stub() { super(); }
        public static android.media.tv.ITvInputHardwareCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.tv.ITvInputHardwareCallback p0) { return false; }
        public static android.media.tv.ITvInputHardwareCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.tv.ITvInputHardwareCallback {
            private android.os.IBinder mRemote;
            public static android.media.tv.ITvInputHardwareCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onReleased() throws android.os.RemoteException {}
            public void onStreamConfigChanged(android.media.tv.TvStreamConfig[] p0) throws android.os.RemoteException {}
        }
    }
}
