package android.apex;

public interface IApexService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.apex.IApexService";
    public void submitStagedSession(android.apex.ApexSessionParams p0, android.apex.ApexInfoList p1) throws android.os.RemoteException;
    public void markStagedSessionReady(int p0) throws android.os.RemoteException;
    public void markStagedSessionSuccessful(int p0) throws android.os.RemoteException;
    public android.apex.ApexSessionInfo[] getSessions() throws android.os.RemoteException;
    public android.apex.ApexSessionInfo getStagedSessionInfo(int p0) throws android.os.RemoteException;
    public android.apex.ApexInfo[] getStagedApexInfos(android.apex.ApexSessionParams p0) throws android.os.RemoteException;
    public android.apex.ApexInfo[] getActivePackages() throws android.os.RemoteException;
    public android.apex.ApexInfo[] getAllPackages() throws android.os.RemoteException;
    public void abortStagedSession(int p0) throws android.os.RemoteException;
    public void revertActiveSessions() throws android.os.RemoteException;
    public void snapshotCeData(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void restoreCeData(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void destroyDeSnapshots(int p0) throws android.os.RemoteException;
    public void destroyCeSnapshots(int p0, int p1) throws android.os.RemoteException;
    public void destroyCeSnapshotsNotSpecified(int p0, int[] p1) throws android.os.RemoteException;
    public void unstagePackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void stagePackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void resumeRevertIfNeeded() throws android.os.RemoteException;
    public void recollectPreinstalledData() throws android.os.RemoteException;
    public void markBootCompleted() throws android.os.RemoteException;
    public long calculateSizeForCompressedApex(android.apex.CompressedApexInfoList p0) throws android.os.RemoteException;
    public void reserveSpaceForCompressedApex(android.apex.CompressedApexInfoList p0) throws android.os.RemoteException;
    public android.apex.ApexInfo installAndActivatePackage(java.lang.String p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.apex.IApexService {
        public Default() {}
        public void submitStagedSession(android.apex.ApexSessionParams p0, android.apex.ApexInfoList p1) throws android.os.RemoteException {}
        public void markStagedSessionReady(int p0) throws android.os.RemoteException {}
        public void markStagedSessionSuccessful(int p0) throws android.os.RemoteException {}
        public android.apex.ApexSessionInfo[] getSessions() throws android.os.RemoteException { return null; }
        public android.apex.ApexSessionInfo getStagedSessionInfo(int p0) throws android.os.RemoteException { return null; }
        public android.apex.ApexInfo[] getStagedApexInfos(android.apex.ApexSessionParams p0) throws android.os.RemoteException { return null; }
        public android.apex.ApexInfo[] getActivePackages() throws android.os.RemoteException { return null; }
        public android.apex.ApexInfo[] getAllPackages() throws android.os.RemoteException { return null; }
        public void abortStagedSession(int p0) throws android.os.RemoteException {}
        public void revertActiveSessions() throws android.os.RemoteException {}
        public void snapshotCeData(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void restoreCeData(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void destroyDeSnapshots(int p0) throws android.os.RemoteException {}
        public void destroyCeSnapshots(int p0, int p1) throws android.os.RemoteException {}
        public void destroyCeSnapshotsNotSpecified(int p0, int[] p1) throws android.os.RemoteException {}
        public void unstagePackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public void stagePackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public void resumeRevertIfNeeded() throws android.os.RemoteException {}
        public void recollectPreinstalledData() throws android.os.RemoteException {}
        public void markBootCompleted() throws android.os.RemoteException {}
        public long calculateSizeForCompressedApex(android.apex.CompressedApexInfoList p0) throws android.os.RemoteException { return 0L; }
        public void reserveSpaceForCompressedApex(android.apex.CompressedApexInfoList p0) throws android.os.RemoteException {}
        public android.apex.ApexInfo installAndActivatePackage(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.apex.IApexService {
        static final int TRANSACTION_submitStagedSession = 1;
        static final int TRANSACTION_markStagedSessionReady = 2;
        static final int TRANSACTION_markStagedSessionSuccessful = 3;
        static final int TRANSACTION_getSessions = 4;
        static final int TRANSACTION_getStagedSessionInfo = 5;
        static final int TRANSACTION_getStagedApexInfos = 6;
        static final int TRANSACTION_getActivePackages = 7;
        static final int TRANSACTION_getAllPackages = 8;
        static final int TRANSACTION_abortStagedSession = 9;
        static final int TRANSACTION_revertActiveSessions = 10;
        static final int TRANSACTION_snapshotCeData = 11;
        static final int TRANSACTION_restoreCeData = 12;
        static final int TRANSACTION_destroyDeSnapshots = 13;
        static final int TRANSACTION_destroyCeSnapshots = 14;
        static final int TRANSACTION_destroyCeSnapshotsNotSpecified = 15;
        static final int TRANSACTION_unstagePackages = 16;
        static final int TRANSACTION_stagePackages = 17;
        static final int TRANSACTION_resumeRevertIfNeeded = 18;
        static final int TRANSACTION_recollectPreinstalledData = 19;
        static final int TRANSACTION_markBootCompleted = 20;
        static final int TRANSACTION_calculateSizeForCompressedApex = 21;
        static final int TRANSACTION_reserveSpaceForCompressedApex = 22;
        static final int TRANSACTION_installAndActivatePackage = 23;
        public Stub() { super(); }
        public static android.apex.IApexService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.apex.IApexService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void submitStagedSession(android.apex.ApexSessionParams p0, android.apex.ApexInfoList p1) throws android.os.RemoteException {}
            public void markStagedSessionReady(int p0) throws android.os.RemoteException {}
            public void markStagedSessionSuccessful(int p0) throws android.os.RemoteException {}
            public android.apex.ApexSessionInfo[] getSessions() throws android.os.RemoteException { return null; }
            public android.apex.ApexSessionInfo getStagedSessionInfo(int p0) throws android.os.RemoteException { return null; }
            public android.apex.ApexInfo[] getStagedApexInfos(android.apex.ApexSessionParams p0) throws android.os.RemoteException { return null; }
            public android.apex.ApexInfo[] getActivePackages() throws android.os.RemoteException { return null; }
            public android.apex.ApexInfo[] getAllPackages() throws android.os.RemoteException { return null; }
            public void abortStagedSession(int p0) throws android.os.RemoteException {}
            public void revertActiveSessions() throws android.os.RemoteException {}
            public void snapshotCeData(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void restoreCeData(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void destroyDeSnapshots(int p0) throws android.os.RemoteException {}
            public void destroyCeSnapshots(int p0, int p1) throws android.os.RemoteException {}
            public void destroyCeSnapshotsNotSpecified(int p0, int[] p1) throws android.os.RemoteException {}
            public void unstagePackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public void stagePackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public void resumeRevertIfNeeded() throws android.os.RemoteException {}
            public void recollectPreinstalledData() throws android.os.RemoteException {}
            public void markBootCompleted() throws android.os.RemoteException {}
            public long calculateSizeForCompressedApex(android.apex.CompressedApexInfoList p0) throws android.os.RemoteException { return 0L; }
            public void reserveSpaceForCompressedApex(android.apex.CompressedApexInfoList p0) throws android.os.RemoteException {}
            public android.apex.ApexInfo installAndActivatePackage(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
        }
    }
}
