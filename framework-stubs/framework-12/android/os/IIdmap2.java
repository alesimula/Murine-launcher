package android.os;

public interface IIdmap2 extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IIdmap2";
    public java.lang.String getIdmapPath(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean removeIdmap(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean verifyIdmap(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, int p5) throws android.os.RemoteException;
    public java.lang.String createIdmap(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, int p5) throws android.os.RemoteException;
    public android.os.FabricatedOverlayInfo createFabricatedOverlay(android.os.FabricatedOverlayInternal p0) throws android.os.RemoteException;
    public boolean deleteFabricatedOverlay(java.lang.String p0) throws android.os.RemoteException;
    public void acquireFabricatedOverlayIterator() throws android.os.RemoteException;
    public void releaseFabricatedOverlayIterator() throws android.os.RemoteException;
    public java.util.List<android.os.FabricatedOverlayInfo> nextFabricatedOverlayInfos() throws android.os.RemoteException;
    public java.lang.String dumpIdmap(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.os.IIdmap2 {
        public Default() {}
        public java.lang.String getIdmapPath(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public boolean removeIdmap(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean verifyIdmap(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, int p5) throws android.os.RemoteException { return false; }
        public java.lang.String createIdmap(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, int p5) throws android.os.RemoteException { return null; }
        public android.os.FabricatedOverlayInfo createFabricatedOverlay(android.os.FabricatedOverlayInternal p0) throws android.os.RemoteException { return null; }
        public boolean deleteFabricatedOverlay(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void acquireFabricatedOverlayIterator() throws android.os.RemoteException {}
        public void releaseFabricatedOverlayIterator() throws android.os.RemoteException {}
        public java.util.List<android.os.FabricatedOverlayInfo> nextFabricatedOverlayInfos() throws android.os.RemoteException { return null; }
        public java.lang.String dumpIdmap(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IIdmap2 {
        static final int TRANSACTION_getIdmapPath = 1;
        static final int TRANSACTION_removeIdmap = 2;
        static final int TRANSACTION_verifyIdmap = 3;
        static final int TRANSACTION_createIdmap = 4;
        static final int TRANSACTION_createFabricatedOverlay = 5;
        static final int TRANSACTION_deleteFabricatedOverlay = 6;
        static final int TRANSACTION_acquireFabricatedOverlayIterator = 7;
        static final int TRANSACTION_releaseFabricatedOverlayIterator = 8;
        static final int TRANSACTION_nextFabricatedOverlayInfos = 9;
        static final int TRANSACTION_dumpIdmap = 10;
        public Stub() { super(); }
        public static android.os.IIdmap2 asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IIdmap2 p0) { return false; }
        public static android.os.IIdmap2 getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IIdmap2 {
            private android.os.IBinder mRemote;
            public static android.os.IIdmap2 sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getIdmapPath(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public boolean removeIdmap(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean verifyIdmap(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, int p5) throws android.os.RemoteException { return false; }
            public java.lang.String createIdmap(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, int p5) throws android.os.RemoteException { return null; }
            public android.os.FabricatedOverlayInfo createFabricatedOverlay(android.os.FabricatedOverlayInternal p0) throws android.os.RemoteException { return null; }
            public boolean deleteFabricatedOverlay(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void acquireFabricatedOverlayIterator() throws android.os.RemoteException {}
            public void releaseFabricatedOverlayIterator() throws android.os.RemoteException {}
            public java.util.List<android.os.FabricatedOverlayInfo> nextFabricatedOverlayInfos() throws android.os.RemoteException { return null; }
            public java.lang.String dumpIdmap(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }
}
