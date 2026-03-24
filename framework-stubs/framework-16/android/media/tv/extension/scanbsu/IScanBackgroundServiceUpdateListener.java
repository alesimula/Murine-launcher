package android.media.tv.extension.scanbsu;

public interface IScanBackgroundServiceUpdateListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.scanbsu.IScanBackgroundServiceUpdateListener";
    public void onChannelListUpdate(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException;
    public void onNetworkListUpdate(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException;
    public void onTransportStreamingListUpdate(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.scanbsu.IScanBackgroundServiceUpdateListener {
        public Default() {}
        public void onChannelListUpdate(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException {}
        public void onNetworkListUpdate(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException {}
        public void onTransportStreamingListUpdate(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.scanbsu.IScanBackgroundServiceUpdateListener {
        static final int TRANSACTION_onChannelListUpdate = 1;
        static final int TRANSACTION_onNetworkListUpdate = 2;
        static final int TRANSACTION_onTransportStreamingListUpdate = 3;
        public Stub() { super(); }
        public static android.media.tv.extension.scanbsu.IScanBackgroundServiceUpdateListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.scanbsu.IScanBackgroundServiceUpdateListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onChannelListUpdate(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException {}
            public void onNetworkListUpdate(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException {}
            public void onTransportStreamingListUpdate(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException {}
        }
    }
}
