package android.media.tv.tunerresourcemanager;

public class TunerResourceManager {
    public static final long INVALID_RESOURCE_HANDLE = -1L;
    public static final int INVALID_OWNER_ID = -1;
    public static final int TUNER_RESOURCE_TYPE_FRONTEND = 0;
    public static final int TUNER_RESOURCE_TYPE_DEMUX = 1;
    public static final int TUNER_RESOURCE_TYPE_DESCRAMBLER = 2;
    public static final int TUNER_RESOURCE_TYPE_LNB = 3;
    public static final int TUNER_RESOURCE_TYPE_CAS_SESSION = 4;
    public static final int TUNER_RESOURCE_TYPE_FRONTEND_CICAM = 5;
    public static final int TUNER_RESOURCE_TYPE_MAX = 6;
    public TunerResourceManager(android.media.tv.tunerresourcemanager.ITunerResourceManager p0, int p1) {}
    public void registerClientProfile(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, java.util.concurrent.Executor p1, android.media.tv.tunerresourcemanager.TunerResourceManager.ResourcesReclaimListener p2, int[] p3) {}
    public void unregisterClientProfile(int p0) {}
    public boolean updateClientPriority(int p0, int p1, int p2) { return false; }
    public boolean hasUnusedFrontend(int p0) { return false; }
    public boolean isLowestPriority(int p0, int p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.TUNER_RESOURCE_ACCESS")
    public void setResourceOwnershipRetention(int p0, boolean p1) {}
    public void storeResourceMap(int p0) {}
    public void clearResourceMap(int p0) {}
    public void restoreResourceMap(int p0) {}
    public void setFrontendInfoList(android.media.tv.tunerresourcemanager.TunerFrontendInfo[] p0) {}
    public void setDemuxInfoList(android.media.tv.tunerresourcemanager.TunerDemuxInfo[] p0) {}
    public void updateCasInfo(int p0, int p1) {}
    public void setLnbInfoList(long[] p0) {}
    public boolean acquireLock(int p0) { return false; }
    public boolean releaseLock(int p0) { return false; }
    public boolean requestFrontend(android.media.tv.tunerresourcemanager.TunerFrontendRequest p0, long[] p1) { return false; }
    public boolean setMaxNumberOfFrontends(int p0, int p1) { return false; }
    public int getMaxNumberOfFrontends(int p0) { return 0; }
    public void shareFrontend(int p0, int p1) {}
    public boolean transferOwner(int p0, int p1, int p2) { return false; }
    public boolean requestDemux(android.media.tv.tunerresourcemanager.TunerDemuxRequest p0, long[] p1) { return false; }
    public boolean requestDescrambler(android.media.tv.tunerresourcemanager.TunerDescramblerRequest p0, long[] p1) { return false; }
    public boolean requestCasSession(android.media.tv.tunerresourcemanager.CasSessionRequest p0, long[] p1) { return false; }
    public boolean requestCiCam(android.media.tv.tunerresourcemanager.TunerCiCamRequest p0, long[] p1) { return false; }
    public boolean requestLnb(android.media.tv.tunerresourcemanager.TunerLnbRequest p0, long[] p1) { return false; }
    public void releaseFrontend(long p0, int p1) {}
    public void releaseDemux(long p0, int p1) {}
    public void releaseDescrambler(long p0, int p1) {}
    public void releaseCasSession(long p0, int p1) {}
    public void releaseCiCam(long p0, int p1) {}
    public void releaseLnb(long p0, int p1) {}
    public boolean isHigherPriority(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, android.media.tv.tunerresourcemanager.ResourceClientProfile p1) { return false; }
    public int getClientPriority(int p0, int p1) { return 0; }
    @android.annotation.SuppressLint("ShowingMemberInHiddenClass")
    public int getConfigPriority(int p0, boolean p1) { return 0; }

    public static abstract class ResourcesReclaimListener {
        public ResourcesReclaimListener() {}
        public abstract void onReclaimResources();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TunerResourceType {
    }
}
