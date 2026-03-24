package android.media;

public interface IAudioManagerNative extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IAudioManagerNative";
    public void playbackHardeningEvent(int p0, byte p1, boolean p2) throws android.os.RemoteException;
    public void permissionUpdateBarrier() throws android.os.RemoteException;
    public void portMuteEvent(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.IAudioManagerNative {
        public Default() {}
        public void playbackHardeningEvent(int p0, byte p1, boolean p2) throws android.os.RemoteException {}
        public void permissionUpdateBarrier() throws android.os.RemoteException {}
        public void portMuteEvent(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static @interface HardeningType {
        public static final byte PARTIAL = 0;
        public static final byte FULL = 1;
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IAudioManagerNative {
        static final int TRANSACTION_playbackHardeningEvent = 1;
        static final int TRANSACTION_permissionUpdateBarrier = 2;
        static final int TRANSACTION_portMuteEvent = 3;
        public Stub() { super(); }
        public static android.media.IAudioManagerNative asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.IAudioManagerNative {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void playbackHardeningEvent(int p0, byte p1, boolean p2) throws android.os.RemoteException {}
            public void permissionUpdateBarrier() throws android.os.RemoteException {}
            public void portMuteEvent(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
