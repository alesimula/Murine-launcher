package android.content.pm;

public interface IPackageManagerNative extends android.os.IInterface {
    public static final int LOCATION_SYSTEM = 1;
    public static final int LOCATION_VENDOR = 2;
    public static final int LOCATION_PRODUCT = 4;
    public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException;
    public int getPackageUid(java.lang.String p0, long p1, int p2) throws android.os.RemoteException;
    public java.lang.String getInstallerForPackage(java.lang.String p0) throws android.os.RemoteException;
    public long getVersionCodeForPackage(java.lang.String p0) throws android.os.RemoteException;
    public boolean[] isAudioPlaybackCaptureAllowed(java.lang.String[] p0) throws android.os.RemoteException;
    public int getLocationFlags(java.lang.String p0) throws android.os.RemoteException;
    public int getTargetSdkVersionForPackage(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getModuleMetadataPackageName() throws android.os.RemoteException;
    public boolean hasSha256SigningCertificate(java.lang.String p0, byte[] p1) throws android.os.RemoteException;
    public boolean isPackageDebuggable(java.lang.String p0) throws android.os.RemoteException;
    public boolean hasSystemFeature(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void registerStagedApexObserver(android.content.pm.IStagedApexObserver p0) throws android.os.RemoteException;
    public void unregisterStagedApexObserver(android.content.pm.IStagedApexObserver p0) throws android.os.RemoteException;
    public java.lang.String[] getStagedApexModuleNames() throws android.os.RemoteException;
    public android.content.pm.StagedApexInfo getStagedApexInfo(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IPackageManagerNative {
        public Default() {}
        public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException { return null; }
        public int getPackageUid(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return 0; }
        public java.lang.String getInstallerForPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
        public long getVersionCodeForPackage(java.lang.String p0) throws android.os.RemoteException { return 0L; }
        public boolean[] isAudioPlaybackCaptureAllowed(java.lang.String[] p0) throws android.os.RemoteException { return null; }
        public int getLocationFlags(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getTargetSdkVersionForPackage(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getModuleMetadataPackageName() throws android.os.RemoteException { return null; }
        public boolean hasSha256SigningCertificate(java.lang.String p0, byte[] p1) throws android.os.RemoteException { return false; }
        public boolean isPackageDebuggable(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean hasSystemFeature(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void registerStagedApexObserver(android.content.pm.IStagedApexObserver p0) throws android.os.RemoteException {}
        public void unregisterStagedApexObserver(android.content.pm.IStagedApexObserver p0) throws android.os.RemoteException {}
        public java.lang.String[] getStagedApexModuleNames() throws android.os.RemoteException { return null; }
        public android.content.pm.StagedApexInfo getStagedApexInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageManagerNative {
        public static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageManagerNative";
        static final int TRANSACTION_getNamesForUids = 1;
        static final int TRANSACTION_getPackageUid = 2;
        static final int TRANSACTION_getInstallerForPackage = 3;
        static final int TRANSACTION_getVersionCodeForPackage = 4;
        static final int TRANSACTION_isAudioPlaybackCaptureAllowed = 5;
        static final int TRANSACTION_getLocationFlags = 6;
        static final int TRANSACTION_getTargetSdkVersionForPackage = 7;
        static final int TRANSACTION_getModuleMetadataPackageName = 8;
        static final int TRANSACTION_hasSha256SigningCertificate = 9;
        static final int TRANSACTION_isPackageDebuggable = 10;
        static final int TRANSACTION_hasSystemFeature = 11;
        static final int TRANSACTION_registerStagedApexObserver = 12;
        static final int TRANSACTION_unregisterStagedApexObserver = 13;
        static final int TRANSACTION_getStagedApexModuleNames = 14;
        static final int TRANSACTION_getStagedApexInfo = 15;
        public Stub() { super(); }
        public static android.content.pm.IPackageManagerNative asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.content.pm.IPackageManagerNative {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException { return null; }
            public int getPackageUid(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return 0; }
            public java.lang.String getInstallerForPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
            public long getVersionCodeForPackage(java.lang.String p0) throws android.os.RemoteException { return 0L; }
            public boolean[] isAudioPlaybackCaptureAllowed(java.lang.String[] p0) throws android.os.RemoteException { return null; }
            public int getLocationFlags(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getTargetSdkVersionForPackage(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getModuleMetadataPackageName() throws android.os.RemoteException { return null; }
            public boolean hasSha256SigningCertificate(java.lang.String p0, byte[] p1) throws android.os.RemoteException { return false; }
            public boolean isPackageDebuggable(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean hasSystemFeature(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void registerStagedApexObserver(android.content.pm.IStagedApexObserver p0) throws android.os.RemoteException {}
            public void unregisterStagedApexObserver(android.content.pm.IStagedApexObserver p0) throws android.os.RemoteException {}
            public java.lang.String[] getStagedApexModuleNames() throws android.os.RemoteException { return null; }
            public android.content.pm.StagedApexInfo getStagedApexInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }
}
