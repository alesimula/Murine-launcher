package android.media;

public interface INativeSpatializerCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.INativeSpatializerCallback";
    public void onLevelChanged(byte p0) throws android.os.RemoteException;
    public void onOutputChanged(int p0) throws android.os.RemoteException;

    public static class Default implements android.media.INativeSpatializerCallback {
        public Default() {}
        public void onLevelChanged(byte p0) throws android.os.RemoteException {}
        public void onOutputChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.INativeSpatializerCallback {
        static final int TRANSACTION_onLevelChanged = 1;
        static final int TRANSACTION_onOutputChanged = 2;
        public Stub() { super(); }
        public static android.media.INativeSpatializerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.INativeSpatializerCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onLevelChanged(byte p0) throws android.os.RemoteException {}
            public void onOutputChanged(int p0) throws android.os.RemoteException {}
        }
    }
}
