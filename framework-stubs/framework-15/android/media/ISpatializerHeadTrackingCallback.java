package android.media;

public interface ISpatializerHeadTrackingCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.ISpatializerHeadTrackingCallback";
    public void onHeadTrackingModeChanged(byte p0) throws android.os.RemoteException;
    public void onHeadToSoundStagePoseUpdated(float[] p0) throws android.os.RemoteException;

    public static class Default implements android.media.ISpatializerHeadTrackingCallback {
        public Default() {}
        public void onHeadTrackingModeChanged(byte p0) throws android.os.RemoteException {}
        public void onHeadToSoundStagePoseUpdated(float[] p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.ISpatializerHeadTrackingCallback {
        static final int TRANSACTION_onHeadTrackingModeChanged = 1;
        static final int TRANSACTION_onHeadToSoundStagePoseUpdated = 2;
        public Stub() { super(); }
        public static android.media.ISpatializerHeadTrackingCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.ISpatializerHeadTrackingCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onHeadTrackingModeChanged(byte p0) throws android.os.RemoteException {}
            public void onHeadToSoundStagePoseUpdated(float[] p0) throws android.os.RemoteException {}
        }
    }
}
