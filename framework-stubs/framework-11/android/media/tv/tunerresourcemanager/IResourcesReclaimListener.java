package android.media.tv.tunerresourcemanager;

public interface IResourcesReclaimListener extends android.os.IInterface {
    public void onReclaimResources() throws android.os.RemoteException;

    public static class Default implements android.media.tv.tunerresourcemanager.IResourcesReclaimListener {
        public Default() {}
        public void onReclaimResources() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.tunerresourcemanager.IResourcesReclaimListener {
        private static final java.lang.String DESCRIPTOR = "android.media.tv.tunerresourcemanager.IResourcesReclaimListener";
        static final int TRANSACTION_onReclaimResources = 1;
        public Stub() { super(); }
        public static android.media.tv.tunerresourcemanager.IResourcesReclaimListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.tv.tunerresourcemanager.IResourcesReclaimListener p0) { return false; }
        public static android.media.tv.tunerresourcemanager.IResourcesReclaimListener getDefaultImpl() { return null; }

        private static class Proxy implements android.media.tv.tunerresourcemanager.IResourcesReclaimListener {
            private android.os.IBinder mRemote;
            public static android.media.tv.tunerresourcemanager.IResourcesReclaimListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onReclaimResources() throws android.os.RemoteException {}
        }
    }
}
