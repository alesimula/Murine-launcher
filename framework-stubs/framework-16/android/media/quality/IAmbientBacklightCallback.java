package android.media.quality;

public interface IAmbientBacklightCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.quality.IAmbientBacklightCallback";
    public void onAmbientBacklightEvent(android.media.quality.AmbientBacklightEvent p0) throws android.os.RemoteException;

    public static class Default implements android.media.quality.IAmbientBacklightCallback {
        public Default() {}
        public void onAmbientBacklightEvent(android.media.quality.AmbientBacklightEvent p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.quality.IAmbientBacklightCallback {
        static final int TRANSACTION_onAmbientBacklightEvent = 1;
        public Stub() { super(); }
        public static android.media.quality.IAmbientBacklightCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.quality.IAmbientBacklightCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAmbientBacklightEvent(android.media.quality.AmbientBacklightEvent p0) throws android.os.RemoteException {}
        }
    }
}
