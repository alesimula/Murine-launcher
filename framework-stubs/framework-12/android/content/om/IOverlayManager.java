package android.content.om;

public interface IOverlayManager extends android.os.IInterface {
    public java.util.Map getAllOverlays(int p0) throws android.os.RemoteException;
    public java.util.List getOverlayInfosForTarget(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.om.OverlayInfo getOverlayInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.om.OverlayInfo getOverlayInfoByIdentifier(android.content.om.OverlayIdentifier p0, int p1) throws android.os.RemoteException;
    public boolean setEnabled(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean setEnabledExclusive(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean setEnabledExclusiveInCategory(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setPriority(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean setHighestPriority(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setLowestPriority(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.lang.String[] getDefaultOverlayPackages() throws android.os.RemoteException;
    public void invalidateCachesForOverlay(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void commit(android.content.om.OverlayManagerTransaction p0) throws android.os.RemoteException;

    public static class Default implements android.content.om.IOverlayManager {
        public Default() {}
        public java.util.Map getAllOverlays(int p0) throws android.os.RemoteException { return null; }
        public java.util.List getOverlayInfosForTarget(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.om.OverlayInfo getOverlayInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.om.OverlayInfo getOverlayInfoByIdentifier(android.content.om.OverlayIdentifier p0, int p1) throws android.os.RemoteException { return null; }
        public boolean setEnabled(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
        public boolean setEnabledExclusive(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
        public boolean setEnabledExclusiveInCategory(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean setPriority(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean setHighestPriority(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean setLowestPriority(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public java.lang.String[] getDefaultOverlayPackages() throws android.os.RemoteException { return null; }
        public void invalidateCachesForOverlay(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void commit(android.content.om.OverlayManagerTransaction p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.om.IOverlayManager {
        public static final java.lang.String DESCRIPTOR = "android.content.om.IOverlayManager";
        static final int TRANSACTION_getAllOverlays = 1;
        static final int TRANSACTION_getOverlayInfosForTarget = 2;
        static final int TRANSACTION_getOverlayInfo = 3;
        static final int TRANSACTION_getOverlayInfoByIdentifier = 4;
        static final int TRANSACTION_setEnabled = 5;
        static final int TRANSACTION_setEnabledExclusive = 6;
        static final int TRANSACTION_setEnabledExclusiveInCategory = 7;
        static final int TRANSACTION_setPriority = 8;
        static final int TRANSACTION_setHighestPriority = 9;
        static final int TRANSACTION_setLowestPriority = 10;
        static final int TRANSACTION_getDefaultOverlayPackages = 11;
        static final int TRANSACTION_invalidateCachesForOverlay = 12;
        static final int TRANSACTION_commit = 13;
        public Stub() { super(); }
        public static android.content.om.IOverlayManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.om.IOverlayManager p0) { return false; }
        public static android.content.om.IOverlayManager getDefaultImpl() { return null; }

        private static class Proxy implements android.content.om.IOverlayManager {
            private android.os.IBinder mRemote;
            public static android.content.om.IOverlayManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.Map getAllOverlays(int p0) throws android.os.RemoteException { return null; }
            public java.util.List getOverlayInfosForTarget(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.om.OverlayInfo getOverlayInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.om.OverlayInfo getOverlayInfoByIdentifier(android.content.om.OverlayIdentifier p0, int p1) throws android.os.RemoteException { return null; }
            public boolean setEnabled(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
            public boolean setEnabledExclusive(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
            public boolean setEnabledExclusiveInCategory(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean setPriority(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean setHighestPriority(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean setLowestPriority(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public java.lang.String[] getDefaultOverlayPackages() throws android.os.RemoteException { return null; }
            public void invalidateCachesForOverlay(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void commit(android.content.om.OverlayManagerTransaction p0) throws android.os.RemoteException {}
        }
    }
}
