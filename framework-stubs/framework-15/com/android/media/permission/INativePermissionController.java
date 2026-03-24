package com.android.media.permission;

public interface INativePermissionController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.media.permission.INativePermissionController";
    public void populatePackagesForUids(java.util.List<com.android.media.permission.UidPackageState> p0) throws android.os.RemoteException;
    public void updatePackagesForUid(com.android.media.permission.UidPackageState p0) throws android.os.RemoteException;
    public void populatePermissionState(byte p0, int[] p1) throws android.os.RemoteException;

    public static class Default implements com.android.media.permission.INativePermissionController {
        public Default() {}
        public void populatePackagesForUids(java.util.List<com.android.media.permission.UidPackageState> p0) throws android.os.RemoteException {}
        public void updatePackagesForUid(com.android.media.permission.UidPackageState p0) throws android.os.RemoteException {}
        public void populatePermissionState(byte p0, int[] p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.media.permission.INativePermissionController {
        static final int TRANSACTION_populatePackagesForUids = 1;
        static final int TRANSACTION_updatePackagesForUid = 2;
        static final int TRANSACTION_populatePermissionState = 3;
        public Stub() { super(); }
        public static com.android.media.permission.INativePermissionController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements com.android.media.permission.INativePermissionController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void populatePackagesForUids(java.util.List<com.android.media.permission.UidPackageState> p0) throws android.os.RemoteException {}
            public void updatePackagesForUid(com.android.media.permission.UidPackageState p0) throws android.os.RemoteException {}
            public void populatePermissionState(byte p0, int[] p1) throws android.os.RemoteException {}
        }
    }
}
