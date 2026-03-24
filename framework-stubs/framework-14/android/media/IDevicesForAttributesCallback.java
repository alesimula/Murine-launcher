package android.media;

public interface IDevicesForAttributesCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IDevicesForAttributesCallback";
    public void onDevicesForAttributesChanged(android.media.AudioAttributes p0, boolean p1, java.util.List<android.media.AudioDeviceAttributes> p2) throws android.os.RemoteException;

    public static class Default implements android.media.IDevicesForAttributesCallback {
        public Default() {}
        public void onDevicesForAttributesChanged(android.media.AudioAttributes p0, boolean p1, java.util.List<android.media.AudioDeviceAttributes> p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IDevicesForAttributesCallback {
        static final int TRANSACTION_onDevicesForAttributesChanged = 1;
        public Stub() { super(); }
        public static android.media.IDevicesForAttributesCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.IDevicesForAttributesCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDevicesForAttributesChanged(android.media.AudioAttributes p0, boolean p1, java.util.List<android.media.AudioDeviceAttributes> p2) throws android.os.RemoteException {}
        }
    }
}
