package android.media.tv.tunerresourcemanager;

public interface IResourcesReclaimListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.tunerresourcemanager.IResourcesReclaimListener";
    public void onReclaimResources() throws android.os.RemoteException;

    public static class Default implements android.media.tv.tunerresourcemanager.IResourcesReclaimListener {
        public Default() {}
        public void onReclaimResources() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.tunerresourcemanager.IResourcesReclaimListener {
        static final int TRANSACTION_onReclaimResources = 1;
        public Stub() { super(); }
        public static android.media.tv.tunerresourcemanager.IResourcesReclaimListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.tv.tunerresourcemanager.IResourcesReclaimListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onReclaimResources() throws android.os.RemoteException {}
        }
    }
}
