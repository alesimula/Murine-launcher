package com.android.internal.app;

public interface IMediaContainerService extends android.os.IInterface {
    public int copyPackage(java.lang.String p0, com.android.internal.os.IParcelFileDescriptorFactory p1) throws android.os.RemoteException;
    public android.content.pm.PackageInfoLite getMinimalPackageInfo(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.content.res.ObbInfo getObbInfo(java.lang.String p0) throws android.os.RemoteException;
    public long calculateInstalledSize(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IMediaContainerService {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IMediaContainerService";
        static final int TRANSACTION_copyPackage = 1;
        static final int TRANSACTION_getMinimalPackageInfo = 2;
        static final int TRANSACTION_getObbInfo = 3;
        static final int TRANSACTION_calculateInstalledSize = 4;
        public Stub() { super(); }
        public static com.android.internal.app.IMediaContainerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.app.IMediaContainerService p0) { return false; }
        public static com.android.internal.app.IMediaContainerService getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.app.IMediaContainerService {
            private android.os.IBinder mRemote;
            public static com.android.internal.app.IMediaContainerService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int copyPackage(java.lang.String p0, com.android.internal.os.IParcelFileDescriptorFactory p1) throws android.os.RemoteException { return 0; }
            public android.content.pm.PackageInfoLite getMinimalPackageInfo(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.content.res.ObbInfo getObbInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public long calculateInstalledSize(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
        }
    }

    public static class Default implements com.android.internal.app.IMediaContainerService {
        public Default() {}
        public int copyPackage(java.lang.String p0, com.android.internal.os.IParcelFileDescriptorFactory p1) throws android.os.RemoteException { return 0; }
        public android.content.pm.PackageInfoLite getMinimalPackageInfo(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.content.res.ObbInfo getObbInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public long calculateInstalledSize(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
        public android.os.IBinder asBinder() { return null; }
    }
}
