package android.media.tv.tunerresourcemanager;

public class TunerResourceManager {
    private static final java.lang.String TAG = "TunerResourceManager";
    private static final boolean DEBUG = Boolean.valueOf(false);
    public static final int INVALID_RESOURCE_HANDLE = -1;
    public static final int INVALID_OWNER_ID = -1;
    public static final int TUNER_RESOURCE_TYPE_FRONTEND = 0;
    public static final int TUNER_RESOURCE_TYPE_DEMUX = 1;
    public static final int TUNER_RESOURCE_TYPE_DESCRAMBLER = 2;
    public static final int TUNER_RESOURCE_TYPE_LNB = 3;
    public static final int TUNER_RESOURCE_TYPE_CAS_SESSION = 4;
    public static final int TUNER_RESOURCE_TYPE_FRONTEND_CICAM = 5;
    public static final int TUNER_RESOURCE_TYPE_MAX = 6;
    private final android.media.tv.tunerresourcemanager.ITunerResourceManager mService = null;
    private final int mUserId = 0;
    public TunerResourceManager(android.media.tv.tunerresourcemanager.ITunerResourceManager p0, int p1) {}
    public void registerClientProfile(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, java.util.concurrent.Executor p1, android.media.tv.tunerresourcemanager.TunerResourceManager.ResourcesReclaimListener p2, int[] p3) {}
    public void unregisterClientProfile(int p0) {}
    public boolean updateClientPriority(int p0, int p1, int p2) { return false; }
    public void setFrontendInfoList(android.media.tv.tuner.TunerFrontendInfo[] p0) {}
    public void updateCasInfo(int p0, int p1) {}
    public void setLnbInfoList(int[] p0) {}
    public boolean requestFrontend(android.media.tv.tunerresourcemanager.TunerFrontendRequest p0, int[] p1) { return false; }
    public void shareFrontend(int p0, int p1) {}
    public boolean requestDemux(android.media.tv.tunerresourcemanager.TunerDemuxRequest p0, int[] p1) { return false; }
    public boolean requestDescrambler(android.media.tv.tunerresourcemanager.TunerDescramblerRequest p0, int[] p1) { return false; }
    public boolean requestCasSession(android.media.tv.tunerresourcemanager.CasSessionRequest p0, int[] p1) { return false; }
    public boolean requestCiCam(android.media.tv.tunerresourcemanager.TunerCiCamRequest p0, int[] p1) { return false; }
    public boolean requestLnb(android.media.tv.tunerresourcemanager.TunerLnbRequest p0, int[] p1) { return false; }
    public void releaseFrontend(int p0, int p1) {}
    public void releaseDemux(int p0, int p1) {}
    public void releaseDescrambler(int p0, int p1) {}
    public void releaseCasSession(int p0, int p1) {}
    public void releaseCiCam(int p0, int p1) {}
    public void releaseLnb(int p0, int p1) {}
    public boolean isHigherPriority(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, android.media.tv.tunerresourcemanager.ResourceClientProfile p1) { return false; }

    public static abstract class ResourcesReclaimListener {
        public ResourcesReclaimListener() {}
        public abstract void onReclaimResources();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TunerResourceType {
    }
}
