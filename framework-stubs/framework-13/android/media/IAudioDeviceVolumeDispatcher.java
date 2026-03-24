package android.media;

public interface IAudioDeviceVolumeDispatcher extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IAudioDeviceVolumeDispatcher";
    public void dispatchDeviceVolumeChanged(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1) throws android.os.RemoteException;
    public void dispatchDeviceVolumeAdjusted(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, int p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.media.IAudioDeviceVolumeDispatcher {
        public Default() {}
        public void dispatchDeviceVolumeChanged(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1) throws android.os.RemoteException {}
        public void dispatchDeviceVolumeAdjusted(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, int p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IAudioDeviceVolumeDispatcher {
        static final int TRANSACTION_dispatchDeviceVolumeChanged = 1;
        static final int TRANSACTION_dispatchDeviceVolumeAdjusted = 2;
        public Stub() { super(); }
        public static android.media.IAudioDeviceVolumeDispatcher asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.IAudioDeviceVolumeDispatcher {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void dispatchDeviceVolumeChanged(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1) throws android.os.RemoteException {}
            public void dispatchDeviceVolumeAdjusted(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, int p2, int p3) throws android.os.RemoteException {}
        }
    }
}
