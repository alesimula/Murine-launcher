package android.media;

public interface ISoundDoseCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public void onMomentaryExposure(float p0, int p1) throws android.os.RemoteException;
    public void onNewCsdValue(float p0, android.media.SoundDoseRecord[] p1) throws android.os.RemoteException;

    public static class Default implements android.media.ISoundDoseCallback {
        public Default() {}
        public void onMomentaryExposure(float p0, int p1) throws android.os.RemoteException {}
        public void onNewCsdValue(float p0, android.media.SoundDoseRecord[] p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.ISoundDoseCallback {
        static final int TRANSACTION_onMomentaryExposure = 1;
        static final int TRANSACTION_onNewCsdValue = 2;
        public Stub() { super(); }
        public static android.media.ISoundDoseCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.ISoundDoseCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onMomentaryExposure(float p0, int p1) throws android.os.RemoteException {}
            public void onNewCsdValue(float p0, android.media.SoundDoseRecord[] p1) throws android.os.RemoteException {}
        }
    }
}
