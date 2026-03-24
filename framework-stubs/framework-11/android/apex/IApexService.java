package android.apex;

public interface IApexService extends android.os.IInterface {
    public void submitStagedSession(android.apex.ApexSessionParams p0, android.apex.ApexInfoList p1) throws android.os.RemoteException;
    public void markStagedSessionReady(int p0) throws android.os.RemoteException;
    public void markStagedSessionSuccessful(int p0) throws android.os.RemoteException;
    public android.apex.ApexSessionInfo[] getSessions() throws android.os.RemoteException;
    public android.apex.ApexSessionInfo getStagedSessionInfo(int p0) throws android.os.RemoteException;
    public android.apex.ApexInfo[] getActivePackages() throws android.os.RemoteException;
    public android.apex.ApexInfo[] getAllPackages() throws android.os.RemoteException;
    public void abortStagedSession(int p0) throws android.os.RemoteException;
    public void revertActiveSessions() throws android.os.RemoteException;
    public long snapshotCeData(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void restoreCeData(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void destroyDeSnapshots(int p0) throws android.os.RemoteException;
    public void destroyCeSnapshotsNotSpecified(int p0, int[] p1) throws android.os.RemoteException;
    public void unstagePackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public android.apex.ApexInfo getActivePackage(java.lang.String p0) throws android.os.RemoteException;
    public void activatePackage(java.lang.String p0) throws android.os.RemoteException;
    public void deactivatePackage(java.lang.String p0) throws android.os.RemoteException;
    public void preinstallPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void postinstallPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void stagePackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void resumeRevertIfNeeded() throws android.os.RemoteException;
    public void remountPackages() throws android.os.RemoteException;

    public static class Default implements android.apex.IApexService {
        public Default() {}
        public void submitStagedSession(android.apex.ApexSessionParams p0, android.apex.ApexInfoList p1) throws android.os.RemoteException {}
        public void markStagedSessionReady(int p0) throws android.os.RemoteException {}
        public void markStagedSessionSuccessful(int p0) throws android.os.RemoteException {}
        public android.apex.ApexSessionInfo[] getSessions() throws android.os.RemoteException { return null; }
        public android.apex.ApexSessionInfo getStagedSessionInfo(int p0) throws android.os.RemoteException { return null; }
        public android.apex.ApexInfo[] getActivePackages() throws android.os.RemoteException { return null; }
        public android.apex.ApexInfo[] getAllPackages() throws android.os.RemoteException { return null; }
        public void abortStagedSession(int p0) throws android.os.RemoteException {}
        public void revertActiveSessions() throws android.os.RemoteException {}
        public long snapshotCeData(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
        public void restoreCeData(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void destroyDeSnapshots(int p0) throws android.os.RemoteException {}
        public void destroyCeSnapshotsNotSpecified(int p0, int[] p1) throws android.os.RemoteException {}
        public void unstagePackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public android.apex.ApexInfo getActivePackage(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void activatePackage(java.lang.String p0) throws android.os.RemoteException {}
        public void deactivatePackage(java.lang.String p0) throws android.os.RemoteException {}
        public void preinstallPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public void postinstallPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public void stagePackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public void resumeRevertIfNeeded() throws android.os.RemoteException {}
        public void remountPackages() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.apex.IApexService {
        private static final java.lang.String DESCRIPTOR = null;
        static final int TRANSACTION_submitStagedSession = 1;
        static final int TRANSACTION_markStagedSessionReady = 2;
        static final int TRANSACTION_markStagedSessionSuccessful = 3;
        static final int TRANSACTION_getSessions = 4;
        static final int TRANSACTION_getStagedSessionInfo = 5;
        static final int TRANSACTION_getActivePackages = 6;
        static final int TRANSACTION_getAllPackages = 7;
        static final int TRANSACTION_abortStagedSession = 8;
        static final int TRANSACTION_revertActiveSessions = 9;
        static final int TRANSACTION_snapshotCeData = 10;
        static final int TRANSACTION_restoreCeData = 11;
        static final int TRANSACTION_destroyDeSnapshots = 12;
        static final int TRANSACTION_destroyCeSnapshotsNotSpecified = 13;
        static final int TRANSACTION_unstagePackages = 14;
        static final int TRANSACTION_getActivePackage = 15;
        static final int TRANSACTION_activatePackage = 16;
        static final int TRANSACTION_deactivatePackage = 17;
        static final int TRANSACTION_preinstallPackages = 18;
        static final int TRANSACTION_postinstallPackages = 19;
        static final int TRANSACTION_stagePackages = 20;
        static final int TRANSACTION_resumeRevertIfNeeded = 21;
        static final int TRANSACTION_remountPackages = 22;
        public Stub() { super(); }
        public static android.apex.IApexService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.apex.IApexService p0) { return false; }
        public static android.apex.IApexService getDefaultImpl() { return null; }

        private static class Proxy implements android.apex.IApexService {
            private android.os.IBinder mRemote;
            public static android.apex.IApexService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void submitStagedSession(android.apex.ApexSessionParams p0, android.apex.ApexInfoList p1) throws android.os.RemoteException {}
            public void markStagedSessionReady(int p0) throws android.os.RemoteException {}
            public void markStagedSessionSuccessful(int p0) throws android.os.RemoteException {}
            public android.apex.ApexSessionInfo[] getSessions() throws android.os.RemoteException { return null; }
            public android.apex.ApexSessionInfo getStagedSessionInfo(int p0) throws android.os.RemoteException { return null; }
            public android.apex.ApexInfo[] getActivePackages() throws android.os.RemoteException { return null; }
            public android.apex.ApexInfo[] getAllPackages() throws android.os.RemoteException { return null; }
            public void abortStagedSession(int p0) throws android.os.RemoteException {}
            public void revertActiveSessions() throws android.os.RemoteException {}
            public long snapshotCeData(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
            public void restoreCeData(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void destroyDeSnapshots(int p0) throws android.os.RemoteException {}
            public void destroyCeSnapshotsNotSpecified(int p0, int[] p1) throws android.os.RemoteException {}
            public void unstagePackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public android.apex.ApexInfo getActivePackage(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void activatePackage(java.lang.String p0) throws android.os.RemoteException {}
            public void deactivatePackage(java.lang.String p0) throws android.os.RemoteException {}
            public void preinstallPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public void postinstallPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public void stagePackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public void resumeRevertIfNeeded() throws android.os.RemoteException {}
            public void remountPackages() throws android.os.RemoteException {}
        }
    }
}
