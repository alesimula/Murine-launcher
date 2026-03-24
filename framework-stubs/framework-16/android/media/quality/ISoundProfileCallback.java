package android.media.quality;

public interface ISoundProfileCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.quality.ISoundProfileCallback";
    public void onSoundProfileAdded(java.lang.String p0, android.media.quality.SoundProfile p1) throws android.os.RemoteException;
    public void onSoundProfileUpdated(java.lang.String p0, android.media.quality.SoundProfile p1) throws android.os.RemoteException;
    public void onSoundProfileRemoved(java.lang.String p0, android.media.quality.SoundProfile p1) throws android.os.RemoteException;
    public void onParameterCapabilitiesChanged(java.lang.String p0, java.util.List<android.media.quality.ParameterCapability> p1) throws android.os.RemoteException;
    public void onError(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.quality.ISoundProfileCallback {
        public Default() {}
        public void onSoundProfileAdded(java.lang.String p0, android.media.quality.SoundProfile p1) throws android.os.RemoteException {}
        public void onSoundProfileUpdated(java.lang.String p0, android.media.quality.SoundProfile p1) throws android.os.RemoteException {}
        public void onSoundProfileRemoved(java.lang.String p0, android.media.quality.SoundProfile p1) throws android.os.RemoteException {}
        public void onParameterCapabilitiesChanged(java.lang.String p0, java.util.List<android.media.quality.ParameterCapability> p1) throws android.os.RemoteException {}
        public void onError(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.quality.ISoundProfileCallback {
        static final int TRANSACTION_onSoundProfileAdded = 1;
        static final int TRANSACTION_onSoundProfileUpdated = 2;
        static final int TRANSACTION_onSoundProfileRemoved = 3;
        static final int TRANSACTION_onParameterCapabilitiesChanged = 4;
        static final int TRANSACTION_onError = 5;
        public Stub() { super(); }
        public static android.media.quality.ISoundProfileCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.quality.ISoundProfileCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSoundProfileAdded(java.lang.String p0, android.media.quality.SoundProfile p1) throws android.os.RemoteException {}
            public void onSoundProfileUpdated(java.lang.String p0, android.media.quality.SoundProfile p1) throws android.os.RemoteException {}
            public void onSoundProfileRemoved(java.lang.String p0, android.media.quality.SoundProfile p1) throws android.os.RemoteException {}
            public void onParameterCapabilitiesChanged(java.lang.String p0, java.util.List<android.media.quality.ParameterCapability> p1) throws android.os.RemoteException {}
            public void onError(java.lang.String p0, int p1) throws android.os.RemoteException {}
        }
    }
}
