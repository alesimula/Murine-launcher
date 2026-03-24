package android.media;

public interface IAudioServerStateDispatcher extends android.os.IInterface {
    public void dispatchAudioServerStateChange(boolean p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.media.IAudioServerStateDispatcher {
        private static final java.lang.String DESCRIPTOR = "android.media.IAudioServerStateDispatcher";
        static final int TRANSACTION_dispatchAudioServerStateChange = 1;
        public Stub() { super(); }
        public static android.media.IAudioServerStateDispatcher asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IAudioServerStateDispatcher p0) { return false; }
        public static android.media.IAudioServerStateDispatcher getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IAudioServerStateDispatcher {
            private android.os.IBinder mRemote;
            public static android.media.IAudioServerStateDispatcher sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void dispatchAudioServerStateChange(boolean p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.media.IAudioServerStateDispatcher {
        public Default() {}
        public void dispatchAudioServerStateChange(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
