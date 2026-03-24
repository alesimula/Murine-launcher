package android.content.pm;

public interface IPackageInstallerSession extends android.os.IInterface {
    public void setClientProgress(float p0) throws android.os.RemoteException;
    public void addClientProgress(float p0) throws android.os.RemoteException;
    public java.lang.String[] getNames() throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openWrite(java.lang.String p0, long p1, long p2) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openRead(java.lang.String p0) throws android.os.RemoteException;
    public void write(java.lang.String p0, long p1, long p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException;
    public void removeSplit(java.lang.String p0) throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public void commit(android.content.IntentSender p0, boolean p1) throws android.os.RemoteException;
    public void transfer(java.lang.String p0) throws android.os.RemoteException;
    public void abandon() throws android.os.RemoteException;
    public android.content.pm.DataLoaderParamsParcel getDataLoaderParams() throws android.os.RemoteException;
    public void addFile(int p0, java.lang.String p1, long p2, byte[] p3, byte[] p4) throws android.os.RemoteException;
    public void removeFile(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isMultiPackage() throws android.os.RemoteException;
    public int[] getChildSessionIds() throws android.os.RemoteException;
    public void addChildSessionId(int p0) throws android.os.RemoteException;
    public void removeChildSessionId(int p0) throws android.os.RemoteException;
    public int getParentSessionId() throws android.os.RemoteException;
    public boolean isStaged() throws android.os.RemoteException;

    public static class Default implements android.content.pm.IPackageInstallerSession {
        public Default() {}
        public void setClientProgress(float p0) throws android.os.RemoteException {}
        public void addClientProgress(float p0) throws android.os.RemoteException {}
        public java.lang.String[] getNames() throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openWrite(java.lang.String p0, long p1, long p2) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openRead(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void write(java.lang.String p0, long p1, long p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
        public void removeSplit(java.lang.String p0) throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public void commit(android.content.IntentSender p0, boolean p1) throws android.os.RemoteException {}
        public void transfer(java.lang.String p0) throws android.os.RemoteException {}
        public void abandon() throws android.os.RemoteException {}
        public android.content.pm.DataLoaderParamsParcel getDataLoaderParams() throws android.os.RemoteException { return null; }
        public void addFile(int p0, java.lang.String p1, long p2, byte[] p3, byte[] p4) throws android.os.RemoteException {}
        public void removeFile(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean isMultiPackage() throws android.os.RemoteException { return false; }
        public int[] getChildSessionIds() throws android.os.RemoteException { return null; }
        public void addChildSessionId(int p0) throws android.os.RemoteException {}
        public void removeChildSessionId(int p0) throws android.os.RemoteException {}
        public int getParentSessionId() throws android.os.RemoteException { return 0; }
        public boolean isStaged() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageInstallerSession {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageInstallerSession";
        static final int TRANSACTION_setClientProgress = 1;
        static final int TRANSACTION_addClientProgress = 2;
        static final int TRANSACTION_getNames = 3;
        static final int TRANSACTION_openWrite = 4;
        static final int TRANSACTION_openRead = 5;
        static final int TRANSACTION_write = 6;
        static final int TRANSACTION_removeSplit = 7;
        static final int TRANSACTION_close = 8;
        static final int TRANSACTION_commit = 9;
        static final int TRANSACTION_transfer = 10;
        static final int TRANSACTION_abandon = 11;
        static final int TRANSACTION_getDataLoaderParams = 12;
        static final int TRANSACTION_addFile = 13;
        static final int TRANSACTION_removeFile = 14;
        static final int TRANSACTION_isMultiPackage = 15;
        static final int TRANSACTION_getChildSessionIds = 16;
        static final int TRANSACTION_addChildSessionId = 17;
        static final int TRANSACTION_removeChildSessionId = 18;
        static final int TRANSACTION_getParentSessionId = 19;
        static final int TRANSACTION_isStaged = 20;
        public Stub() { super(); }
        public static android.content.pm.IPackageInstallerSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IPackageInstallerSession p0) { return false; }
        public static android.content.pm.IPackageInstallerSession getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IPackageInstallerSession {
            private android.os.IBinder mRemote;
            public static android.content.pm.IPackageInstallerSession sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setClientProgress(float p0) throws android.os.RemoteException {}
            public void addClientProgress(float p0) throws android.os.RemoteException {}
            public java.lang.String[] getNames() throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openWrite(java.lang.String p0, long p1, long p2) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openRead(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void write(java.lang.String p0, long p1, long p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
            public void removeSplit(java.lang.String p0) throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
            public void commit(android.content.IntentSender p0, boolean p1) throws android.os.RemoteException {}
            public void transfer(java.lang.String p0) throws android.os.RemoteException {}
            public void abandon() throws android.os.RemoteException {}
            public android.content.pm.DataLoaderParamsParcel getDataLoaderParams() throws android.os.RemoteException { return null; }
            public void addFile(int p0, java.lang.String p1, long p2, byte[] p3, byte[] p4) throws android.os.RemoteException {}
            public void removeFile(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean isMultiPackage() throws android.os.RemoteException { return false; }
            public int[] getChildSessionIds() throws android.os.RemoteException { return null; }
            public void addChildSessionId(int p0) throws android.os.RemoteException {}
            public void removeChildSessionId(int p0) throws android.os.RemoteException {}
            public int getParentSessionId() throws android.os.RemoteException { return 0; }
            public boolean isStaged() throws android.os.RemoteException { return false; }
        }
    }
}
