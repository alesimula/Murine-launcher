package android.content.pm;

public interface IPackageManagerNative extends android.os.IInterface {
    public static final int LOCATION_SYSTEM = 1;
    public static final int LOCATION_VENDOR = 2;
    public static final int LOCATION_PRODUCT = 4;
    public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException;
    public java.lang.String getInstallerForPackage(java.lang.String p0) throws android.os.RemoteException;
    public long getVersionCodeForPackage(java.lang.String p0) throws android.os.RemoteException;
    public boolean[] isAudioPlaybackCaptureAllowed(java.lang.String[] p0) throws android.os.RemoteException;
    public int getLocationFlags(java.lang.String p0) throws android.os.RemoteException;
    public int getTargetSdkVersionForPackage(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getModuleMetadataPackageName() throws android.os.RemoteException;
    public java.lang.String[] getAllPackages() throws android.os.RemoteException;
    public void registerPackageChangeObserver(android.content.pm.IPackageChangeObserver p0) throws android.os.RemoteException;
    public void unregisterPackageChangeObserver(android.content.pm.IPackageChangeObserver p0) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IPackageManagerNative {
        public Default() {}
        public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException { return null; }
        public java.lang.String getInstallerForPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
        public long getVersionCodeForPackage(java.lang.String p0) throws android.os.RemoteException { return 0L; }
        public boolean[] isAudioPlaybackCaptureAllowed(java.lang.String[] p0) throws android.os.RemoteException { return null; }
        public int getLocationFlags(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getTargetSdkVersionForPackage(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getModuleMetadataPackageName() throws android.os.RemoteException { return null; }
        public java.lang.String[] getAllPackages() throws android.os.RemoteException { return null; }
        public void registerPackageChangeObserver(android.content.pm.IPackageChangeObserver p0) throws android.os.RemoteException {}
        public void unregisterPackageChangeObserver(android.content.pm.IPackageChangeObserver p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageManagerNative {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageManagerNative";
        static final int TRANSACTION_getNamesForUids = 1;
        static final int TRANSACTION_getInstallerForPackage = 2;
        static final int TRANSACTION_getVersionCodeForPackage = 3;
        static final int TRANSACTION_isAudioPlaybackCaptureAllowed = 4;
        static final int TRANSACTION_getLocationFlags = 5;
        static final int TRANSACTION_getTargetSdkVersionForPackage = 6;
        static final int TRANSACTION_getModuleMetadataPackageName = 7;
        static final int TRANSACTION_getAllPackages = 8;
        static final int TRANSACTION_registerPackageChangeObserver = 9;
        static final int TRANSACTION_unregisterPackageChangeObserver = 10;
        public Stub() { super(); }
        public static android.content.pm.IPackageManagerNative asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IPackageManagerNative p0) { return false; }
        public static android.content.pm.IPackageManagerNative getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IPackageManagerNative {
            private android.os.IBinder mRemote;
            public static android.content.pm.IPackageManagerNative sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException { return null; }
            public java.lang.String getInstallerForPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
            public long getVersionCodeForPackage(java.lang.String p0) throws android.os.RemoteException { return 0L; }
            public boolean[] isAudioPlaybackCaptureAllowed(java.lang.String[] p0) throws android.os.RemoteException { return null; }
            public int getLocationFlags(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getTargetSdkVersionForPackage(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getModuleMetadataPackageName() throws android.os.RemoteException { return null; }
            public java.lang.String[] getAllPackages() throws android.os.RemoteException { return null; }
            public void registerPackageChangeObserver(android.content.pm.IPackageChangeObserver p0) throws android.os.RemoteException {}
            public void unregisterPackageChangeObserver(android.content.pm.IPackageChangeObserver p0) throws android.os.RemoteException {}
        }
    }
}
