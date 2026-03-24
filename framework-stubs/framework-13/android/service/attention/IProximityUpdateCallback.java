package android.service.attention;

public interface IProximityUpdateCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.attention.IProximityUpdateCallback";
    public void onProximityUpdate(double p0) throws android.os.RemoteException;

    public static class Default implements android.service.attention.IProximityUpdateCallback {
        public Default() {}
        public void onProximityUpdate(double p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.attention.IProximityUpdateCallback {
        static final int TRANSACTION_onProximityUpdate = 1;
        public Stub() { super(); }
        public static android.service.attention.IProximityUpdateCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.attention.IProximityUpdateCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onProximityUpdate(double p0) throws android.os.RemoteException {}
        }
    }
}
