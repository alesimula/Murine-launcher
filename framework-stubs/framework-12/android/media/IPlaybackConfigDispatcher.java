package android.media;

public interface IPlaybackConfigDispatcher extends android.os.IInterface {
    public void dispatchPlaybackConfigChange(java.util.List<android.media.AudioPlaybackConfiguration> p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.media.IPlaybackConfigDispatcher {
        public Default() {}
        public void dispatchPlaybackConfigChange(java.util.List<android.media.AudioPlaybackConfiguration> p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IPlaybackConfigDispatcher {
        public static final java.lang.String DESCRIPTOR = "android.media.IPlaybackConfigDispatcher";
        static final int TRANSACTION_dispatchPlaybackConfigChange = 1;
        public Stub() { super(); }
        public static android.media.IPlaybackConfigDispatcher asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IPlaybackConfigDispatcher p0) { return false; }
        public static android.media.IPlaybackConfigDispatcher getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IPlaybackConfigDispatcher {
            private android.os.IBinder mRemote;
            public static android.media.IPlaybackConfigDispatcher sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void dispatchPlaybackConfigChange(java.util.List<android.media.AudioPlaybackConfiguration> p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
