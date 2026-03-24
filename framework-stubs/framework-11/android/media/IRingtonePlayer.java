package android.media;

public interface IRingtonePlayer extends android.os.IInterface {
    public void play(android.os.IBinder p0, android.net.Uri p1, android.media.AudioAttributes p2, float p3, boolean p4) throws android.os.RemoteException;
    public void playWithVolumeShaping(android.os.IBinder p0, android.net.Uri p1, android.media.AudioAttributes p2, float p3, boolean p4, android.media.VolumeShaper.Configuration p5) throws android.os.RemoteException;
    public void stop(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean isPlaying(android.os.IBinder p0) throws android.os.RemoteException;
    public void setPlaybackProperties(android.os.IBinder p0, float p1, boolean p2) throws android.os.RemoteException;
    public void playAsync(android.net.Uri p0, android.os.UserHandle p1, boolean p2, android.media.AudioAttributes p3) throws android.os.RemoteException;
    public void stopAsync() throws android.os.RemoteException;
    public java.lang.String getTitle(android.net.Uri p0) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openRingtone(android.net.Uri p0) throws android.os.RemoteException;

    public static class Default implements android.media.IRingtonePlayer {
        public Default() {}
        public void play(android.os.IBinder p0, android.net.Uri p1, android.media.AudioAttributes p2, float p3, boolean p4) throws android.os.RemoteException {}
        public void playWithVolumeShaping(android.os.IBinder p0, android.net.Uri p1, android.media.AudioAttributes p2, float p3, boolean p4, android.media.VolumeShaper.Configuration p5) throws android.os.RemoteException {}
        public void stop(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean isPlaying(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void setPlaybackProperties(android.os.IBinder p0, float p1, boolean p2) throws android.os.RemoteException {}
        public void playAsync(android.net.Uri p0, android.os.UserHandle p1, boolean p2, android.media.AudioAttributes p3) throws android.os.RemoteException {}
        public void stopAsync() throws android.os.RemoteException {}
        public java.lang.String getTitle(android.net.Uri p0) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openRingtone(android.net.Uri p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IRingtonePlayer {
        private static final java.lang.String DESCRIPTOR = "android.media.IRingtonePlayer";
        static final int TRANSACTION_play = 1;
        static final int TRANSACTION_playWithVolumeShaping = 2;
        static final int TRANSACTION_stop = 3;
        static final int TRANSACTION_isPlaying = 4;
        static final int TRANSACTION_setPlaybackProperties = 5;
        static final int TRANSACTION_playAsync = 6;
        static final int TRANSACTION_stopAsync = 7;
        static final int TRANSACTION_getTitle = 8;
        static final int TRANSACTION_openRingtone = 9;
        public Stub() { super(); }
        public static android.media.IRingtonePlayer asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IRingtonePlayer p0) { return false; }
        public static android.media.IRingtonePlayer getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IRingtonePlayer {
            private android.os.IBinder mRemote;
            public static android.media.IRingtonePlayer sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void play(android.os.IBinder p0, android.net.Uri p1, android.media.AudioAttributes p2, float p3, boolean p4) throws android.os.RemoteException {}
            public void playWithVolumeShaping(android.os.IBinder p0, android.net.Uri p1, android.media.AudioAttributes p2, float p3, boolean p4, android.media.VolumeShaper.Configuration p5) throws android.os.RemoteException {}
            public void stop(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean isPlaying(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void setPlaybackProperties(android.os.IBinder p0, float p1, boolean p2) throws android.os.RemoteException {}
            public void playAsync(android.net.Uri p0, android.os.UserHandle p1, boolean p2, android.media.AudioAttributes p3) throws android.os.RemoteException {}
            public void stopAsync() throws android.os.RemoteException {}
            public java.lang.String getTitle(android.net.Uri p0) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openRingtone(android.net.Uri p0) throws android.os.RemoteException { return null; }
        }
    }
}
