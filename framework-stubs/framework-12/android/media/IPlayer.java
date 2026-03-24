package android.media;

public interface IPlayer extends android.os.IInterface {
    public void start() throws android.os.RemoteException;
    public void pause() throws android.os.RemoteException;
    public void stop() throws android.os.RemoteException;
    public void setVolume(float p0) throws android.os.RemoteException;
    public void setPan(float p0) throws android.os.RemoteException;
    public void setStartDelayMs(int p0) throws android.os.RemoteException;
    public void applyVolumeShaper(android.media.VolumeShaperConfiguration p0, android.media.VolumeShaperOperation p1) throws android.os.RemoteException;

    public static class Default implements android.media.IPlayer {
        public Default() {}
        public void start() throws android.os.RemoteException {}
        public void pause() throws android.os.RemoteException {}
        public void stop() throws android.os.RemoteException {}
        public void setVolume(float p0) throws android.os.RemoteException {}
        public void setPan(float p0) throws android.os.RemoteException {}
        public void setStartDelayMs(int p0) throws android.os.RemoteException {}
        public void applyVolumeShaper(android.media.VolumeShaperConfiguration p0, android.media.VolumeShaperOperation p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IPlayer {
        public static final java.lang.String DESCRIPTOR = "android.media.IPlayer";
        static final int TRANSACTION_start = 1;
        static final int TRANSACTION_pause = 2;
        static final int TRANSACTION_stop = 3;
        static final int TRANSACTION_setVolume = 4;
        static final int TRANSACTION_setPan = 5;
        static final int TRANSACTION_setStartDelayMs = 6;
        static final int TRANSACTION_applyVolumeShaper = 7;
        public Stub() { super(); }
        public static android.media.IPlayer asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IPlayer p0) { return false; }
        public static android.media.IPlayer getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IPlayer {
            private android.os.IBinder mRemote;
            public static android.media.IPlayer sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void start() throws android.os.RemoteException {}
            public void pause() throws android.os.RemoteException {}
            public void stop() throws android.os.RemoteException {}
            public void setVolume(float p0) throws android.os.RemoteException {}
            public void setPan(float p0) throws android.os.RemoteException {}
            public void setStartDelayMs(int p0) throws android.os.RemoteException {}
            public void applyVolumeShaper(android.media.VolumeShaperConfiguration p0, android.media.VolumeShaperOperation p1) throws android.os.RemoteException {}
        }
    }
}
