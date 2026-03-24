package android.net;

public interface INetworkScoreService extends android.os.IInterface {
    public boolean updateScores(android.net.ScoredNetwork[] p0) throws android.os.RemoteException;
    public boolean clearScores() throws android.os.RemoteException;
    public boolean setActiveScorer(java.lang.String p0) throws android.os.RemoteException;
    public void disableScoring() throws android.os.RemoteException;
    public void registerNetworkScoreCache(int p0, android.net.INetworkScoreCache p1, int p2) throws android.os.RemoteException;
    public void unregisterNetworkScoreCache(int p0, android.net.INetworkScoreCache p1) throws android.os.RemoteException;
    public boolean requestScores(android.net.NetworkKey[] p0) throws android.os.RemoteException;
    public boolean isCallerActiveScorer(int p0) throws android.os.RemoteException;
    public java.lang.String getActiveScorerPackage() throws android.os.RemoteException;
    public android.net.NetworkScorerAppData getActiveScorer() throws android.os.RemoteException;
    public java.util.List<android.net.NetworkScorerAppData> getAllValidScorers() throws android.os.RemoteException;

    public static class Default implements android.net.INetworkScoreService {
        public Default() {}
        public boolean updateScores(android.net.ScoredNetwork[] p0) throws android.os.RemoteException { return false; }
        public boolean clearScores() throws android.os.RemoteException { return false; }
        public boolean setActiveScorer(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void disableScoring() throws android.os.RemoteException {}
        public void registerNetworkScoreCache(int p0, android.net.INetworkScoreCache p1, int p2) throws android.os.RemoteException {}
        public void unregisterNetworkScoreCache(int p0, android.net.INetworkScoreCache p1) throws android.os.RemoteException {}
        public boolean requestScores(android.net.NetworkKey[] p0) throws android.os.RemoteException { return false; }
        public boolean isCallerActiveScorer(int p0) throws android.os.RemoteException { return false; }
        public java.lang.String getActiveScorerPackage() throws android.os.RemoteException { return null; }
        public android.net.NetworkScorerAppData getActiveScorer() throws android.os.RemoteException { return null; }
        public java.util.List<android.net.NetworkScorerAppData> getAllValidScorers() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.INetworkScoreService {
        public static final java.lang.String DESCRIPTOR = "android.net.INetworkScoreService";
        static final int TRANSACTION_updateScores = 1;
        static final int TRANSACTION_clearScores = 2;
        static final int TRANSACTION_setActiveScorer = 3;
        static final int TRANSACTION_disableScoring = 4;
        static final int TRANSACTION_registerNetworkScoreCache = 5;
        static final int TRANSACTION_unregisterNetworkScoreCache = 6;
        static final int TRANSACTION_requestScores = 7;
        static final int TRANSACTION_isCallerActiveScorer = 8;
        static final int TRANSACTION_getActiveScorerPackage = 9;
        static final int TRANSACTION_getActiveScorer = 10;
        static final int TRANSACTION_getAllValidScorers = 11;
        public Stub() { super(); }
        public static android.net.INetworkScoreService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.net.INetworkScoreService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean updateScores(android.net.ScoredNetwork[] p0) throws android.os.RemoteException { return false; }
            public boolean clearScores() throws android.os.RemoteException { return false; }
            public boolean setActiveScorer(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void disableScoring() throws android.os.RemoteException {}
            public void registerNetworkScoreCache(int p0, android.net.INetworkScoreCache p1, int p2) throws android.os.RemoteException {}
            public void unregisterNetworkScoreCache(int p0, android.net.INetworkScoreCache p1) throws android.os.RemoteException {}
            public boolean requestScores(android.net.NetworkKey[] p0) throws android.os.RemoteException { return false; }
            public boolean isCallerActiveScorer(int p0) throws android.os.RemoteException { return false; }
            public java.lang.String getActiveScorerPackage() throws android.os.RemoteException { return null; }
            public android.net.NetworkScorerAppData getActiveScorer() throws android.os.RemoteException { return null; }
            public java.util.List<android.net.NetworkScorerAppData> getAllValidScorers() throws android.os.RemoteException { return null; }
        }
    }
}
