package android.media.tv.tunerresourcemanager;

public interface ITunerResourceManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.tunerresourcemanager.ITunerResourceManager";
    public void registerClientProfile(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, android.media.tv.tunerresourcemanager.IResourcesReclaimListener p1, int[] p2) throws android.os.RemoteException;
    public void unregisterClientProfile(int p0) throws android.os.RemoteException;
    public boolean updateClientPriority(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean hasUnusedFrontend(int p0) throws android.os.RemoteException;
    public boolean isLowestPriority(int p0, int p1) throws android.os.RemoteException;
    public void setFrontendInfoList(android.media.tv.tunerresourcemanager.TunerFrontendInfo[] p0) throws android.os.RemoteException;
    public void updateCasInfo(int p0, int p1) throws android.os.RemoteException;
    public void setDemuxInfoList(android.media.tv.tunerresourcemanager.TunerDemuxInfo[] p0) throws android.os.RemoteException;
    public void setLnbInfoList(long[] p0) throws android.os.RemoteException;
    public void setResourceOwnershipRetention(int p0, boolean p1) throws android.os.RemoteException;
    public boolean requestFrontend(android.media.tv.tunerresourcemanager.TunerFrontendRequest p0, long[] p1) throws android.os.RemoteException;
    public boolean setMaxNumberOfFrontends(int p0, int p1) throws android.os.RemoteException;
    public int getMaxNumberOfFrontends(int p0) throws android.os.RemoteException;
    public void shareFrontend(int p0, int p1) throws android.os.RemoteException;
    public boolean transferOwner(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean requestDemux(android.media.tv.tunerresourcemanager.TunerDemuxRequest p0, long[] p1) throws android.os.RemoteException;
    public boolean requestDescrambler(android.media.tv.tunerresourcemanager.TunerDescramblerRequest p0, long[] p1) throws android.os.RemoteException;
    public boolean requestCasSession(android.media.tv.tunerresourcemanager.CasSessionRequest p0, long[] p1) throws android.os.RemoteException;
    public boolean requestCiCam(android.media.tv.tunerresourcemanager.TunerCiCamRequest p0, long[] p1) throws android.os.RemoteException;
    public boolean requestLnb(android.media.tv.tunerresourcemanager.TunerLnbRequest p0, long[] p1) throws android.os.RemoteException;
    public void releaseFrontend(long p0, int p1) throws android.os.RemoteException;
    public void releaseDemux(long p0, int p1) throws android.os.RemoteException;
    public void releaseDescrambler(long p0, int p1) throws android.os.RemoteException;
    public void releaseCasSession(long p0, int p1) throws android.os.RemoteException;
    public void releaseCiCam(long p0, int p1) throws android.os.RemoteException;
    public void releaseLnb(long p0, int p1) throws android.os.RemoteException;
    public boolean isHigherPriority(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, android.media.tv.tunerresourcemanager.ResourceClientProfile p1) throws android.os.RemoteException;
    public void storeResourceMap(int p0) throws android.os.RemoteException;
    public void clearResourceMap(int p0) throws android.os.RemoteException;
    public void restoreResourceMap(int p0) throws android.os.RemoteException;
    public boolean acquireLock(int p0, long p1) throws android.os.RemoteException;
    public boolean releaseLock(int p0) throws android.os.RemoteException;
    public int getClientPriority(int p0, int p1) throws android.os.RemoteException;
    public int getConfigPriority(int p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.tunerresourcemanager.ITunerResourceManager {
        public Default() {}
        public void registerClientProfile(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, android.media.tv.tunerresourcemanager.IResourcesReclaimListener p1, int[] p2) throws android.os.RemoteException {}
        public void unregisterClientProfile(int p0) throws android.os.RemoteException {}
        public boolean updateClientPriority(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean hasUnusedFrontend(int p0) throws android.os.RemoteException { return false; }
        public boolean isLowestPriority(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setFrontendInfoList(android.media.tv.tunerresourcemanager.TunerFrontendInfo[] p0) throws android.os.RemoteException {}
        public void updateCasInfo(int p0, int p1) throws android.os.RemoteException {}
        public void setDemuxInfoList(android.media.tv.tunerresourcemanager.TunerDemuxInfo[] p0) throws android.os.RemoteException {}
        public void setLnbInfoList(long[] p0) throws android.os.RemoteException {}
        public void setResourceOwnershipRetention(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean requestFrontend(android.media.tv.tunerresourcemanager.TunerFrontendRequest p0, long[] p1) throws android.os.RemoteException { return false; }
        public boolean setMaxNumberOfFrontends(int p0, int p1) throws android.os.RemoteException { return false; }
        public int getMaxNumberOfFrontends(int p0) throws android.os.RemoteException { return 0; }
        public void shareFrontend(int p0, int p1) throws android.os.RemoteException {}
        public boolean transferOwner(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean requestDemux(android.media.tv.tunerresourcemanager.TunerDemuxRequest p0, long[] p1) throws android.os.RemoteException { return false; }
        public boolean requestDescrambler(android.media.tv.tunerresourcemanager.TunerDescramblerRequest p0, long[] p1) throws android.os.RemoteException { return false; }
        public boolean requestCasSession(android.media.tv.tunerresourcemanager.CasSessionRequest p0, long[] p1) throws android.os.RemoteException { return false; }
        public boolean requestCiCam(android.media.tv.tunerresourcemanager.TunerCiCamRequest p0, long[] p1) throws android.os.RemoteException { return false; }
        public boolean requestLnb(android.media.tv.tunerresourcemanager.TunerLnbRequest p0, long[] p1) throws android.os.RemoteException { return false; }
        public void releaseFrontend(long p0, int p1) throws android.os.RemoteException {}
        public void releaseDemux(long p0, int p1) throws android.os.RemoteException {}
        public void releaseDescrambler(long p0, int p1) throws android.os.RemoteException {}
        public void releaseCasSession(long p0, int p1) throws android.os.RemoteException {}
        public void releaseCiCam(long p0, int p1) throws android.os.RemoteException {}
        public void releaseLnb(long p0, int p1) throws android.os.RemoteException {}
        public boolean isHigherPriority(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, android.media.tv.tunerresourcemanager.ResourceClientProfile p1) throws android.os.RemoteException { return false; }
        public void storeResourceMap(int p0) throws android.os.RemoteException {}
        public void clearResourceMap(int p0) throws android.os.RemoteException {}
        public void restoreResourceMap(int p0) throws android.os.RemoteException {}
        public boolean acquireLock(int p0, long p1) throws android.os.RemoteException { return false; }
        public boolean releaseLock(int p0) throws android.os.RemoteException { return false; }
        public int getClientPriority(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int getConfigPriority(int p0, boolean p1) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.tunerresourcemanager.ITunerResourceManager {
        static final int TRANSACTION_registerClientProfile = 1;
        static final int TRANSACTION_unregisterClientProfile = 2;
        static final int TRANSACTION_updateClientPriority = 3;
        static final int TRANSACTION_hasUnusedFrontend = 4;
        static final int TRANSACTION_isLowestPriority = 5;
        static final int TRANSACTION_setFrontendInfoList = 6;
        static final int TRANSACTION_updateCasInfo = 7;
        static final int TRANSACTION_setDemuxInfoList = 8;
        static final int TRANSACTION_setLnbInfoList = 9;
        static final int TRANSACTION_setResourceOwnershipRetention = 10;
        static final int TRANSACTION_requestFrontend = 11;
        static final int TRANSACTION_setMaxNumberOfFrontends = 12;
        static final int TRANSACTION_getMaxNumberOfFrontends = 13;
        static final int TRANSACTION_shareFrontend = 14;
        static final int TRANSACTION_transferOwner = 15;
        static final int TRANSACTION_requestDemux = 16;
        static final int TRANSACTION_requestDescrambler = 17;
        static final int TRANSACTION_requestCasSession = 18;
        static final int TRANSACTION_requestCiCam = 19;
        static final int TRANSACTION_requestLnb = 20;
        static final int TRANSACTION_releaseFrontend = 21;
        static final int TRANSACTION_releaseDemux = 22;
        static final int TRANSACTION_releaseDescrambler = 23;
        static final int TRANSACTION_releaseCasSession = 24;
        static final int TRANSACTION_releaseCiCam = 25;
        static final int TRANSACTION_releaseLnb = 26;
        static final int TRANSACTION_isHigherPriority = 27;
        static final int TRANSACTION_storeResourceMap = 28;
        static final int TRANSACTION_clearResourceMap = 29;
        static final int TRANSACTION_restoreResourceMap = 30;
        static final int TRANSACTION_acquireLock = 31;
        static final int TRANSACTION_releaseLock = 32;
        static final int TRANSACTION_getClientPriority = 33;
        static final int TRANSACTION_getConfigPriority = 34;
        public Stub() { super(); }
        public static android.media.tv.tunerresourcemanager.ITunerResourceManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.tv.tunerresourcemanager.ITunerResourceManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerClientProfile(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, android.media.tv.tunerresourcemanager.IResourcesReclaimListener p1, int[] p2) throws android.os.RemoteException {}
            public void unregisterClientProfile(int p0) throws android.os.RemoteException {}
            public boolean updateClientPriority(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean hasUnusedFrontend(int p0) throws android.os.RemoteException { return false; }
            public boolean isLowestPriority(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setFrontendInfoList(android.media.tv.tunerresourcemanager.TunerFrontendInfo[] p0) throws android.os.RemoteException {}
            public void updateCasInfo(int p0, int p1) throws android.os.RemoteException {}
            public void setDemuxInfoList(android.media.tv.tunerresourcemanager.TunerDemuxInfo[] p0) throws android.os.RemoteException {}
            public void setLnbInfoList(long[] p0) throws android.os.RemoteException {}
            public void setResourceOwnershipRetention(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean requestFrontend(android.media.tv.tunerresourcemanager.TunerFrontendRequest p0, long[] p1) throws android.os.RemoteException { return false; }
            public boolean setMaxNumberOfFrontends(int p0, int p1) throws android.os.RemoteException { return false; }
            public int getMaxNumberOfFrontends(int p0) throws android.os.RemoteException { return 0; }
            public void shareFrontend(int p0, int p1) throws android.os.RemoteException {}
            public boolean transferOwner(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean requestDemux(android.media.tv.tunerresourcemanager.TunerDemuxRequest p0, long[] p1) throws android.os.RemoteException { return false; }
            public boolean requestDescrambler(android.media.tv.tunerresourcemanager.TunerDescramblerRequest p0, long[] p1) throws android.os.RemoteException { return false; }
            public boolean requestCasSession(android.media.tv.tunerresourcemanager.CasSessionRequest p0, long[] p1) throws android.os.RemoteException { return false; }
            public boolean requestCiCam(android.media.tv.tunerresourcemanager.TunerCiCamRequest p0, long[] p1) throws android.os.RemoteException { return false; }
            public boolean requestLnb(android.media.tv.tunerresourcemanager.TunerLnbRequest p0, long[] p1) throws android.os.RemoteException { return false; }
            public void releaseFrontend(long p0, int p1) throws android.os.RemoteException {}
            public void releaseDemux(long p0, int p1) throws android.os.RemoteException {}
            public void releaseDescrambler(long p0, int p1) throws android.os.RemoteException {}
            public void releaseCasSession(long p0, int p1) throws android.os.RemoteException {}
            public void releaseCiCam(long p0, int p1) throws android.os.RemoteException {}
            public void releaseLnb(long p0, int p1) throws android.os.RemoteException {}
            public boolean isHigherPriority(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, android.media.tv.tunerresourcemanager.ResourceClientProfile p1) throws android.os.RemoteException { return false; }
            public void storeResourceMap(int p0) throws android.os.RemoteException {}
            public void clearResourceMap(int p0) throws android.os.RemoteException {}
            public void restoreResourceMap(int p0) throws android.os.RemoteException {}
            public boolean acquireLock(int p0, long p1) throws android.os.RemoteException { return false; }
            public boolean releaseLock(int p0) throws android.os.RemoteException { return false; }
            public int getClientPriority(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int getConfigPriority(int p0, boolean p1) throws android.os.RemoteException { return 0; }
        }
    }
}
