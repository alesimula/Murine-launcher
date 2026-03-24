package android.companion.virtual.audio;

public interface IAudioConfigChangedCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.audio.IAudioConfigChangedCallback";
    public void onPlaybackConfigChanged(java.util.List<android.media.AudioPlaybackConfiguration> p0) throws android.os.RemoteException;
    public void onRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> p0) throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.audio.IAudioConfigChangedCallback {
        public Default() {}
        public void onPlaybackConfigChanged(java.util.List<android.media.AudioPlaybackConfiguration> p0) throws android.os.RemoteException {}
        public void onRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.audio.IAudioConfigChangedCallback {
        static final int TRANSACTION_onPlaybackConfigChanged = 1;
        static final int TRANSACTION_onRecordingConfigChanged = 2;
        public Stub() { super(); }
        public static android.companion.virtual.audio.IAudioConfigChangedCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.virtual.audio.IAudioConfigChangedCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onPlaybackConfigChanged(java.util.List<android.media.AudioPlaybackConfiguration> p0) throws android.os.RemoteException {}
            public void onRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> p0) throws android.os.RemoteException {}
        }
    }
}
