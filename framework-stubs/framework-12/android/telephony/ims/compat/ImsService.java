package android.telephony.ims.compat;

public class ImsService extends android.app.Service {
    private static final java.lang.String LOG_TAG = "ImsService(Compat)";
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.ims.compat.ImsService";
    private final android.util.SparseArray<android.util.SparseArray<android.telephony.ims.compat.feature.ImsFeature>> mFeaturesBySlot = null;
    protected final android.os.IBinder mImsServiceController = null;
    public ImsService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public android.util.SparseArray<android.telephony.ims.compat.feature.ImsFeature> getFeatures(int p0) { return null; }
    private com.android.ims.internal.IImsMMTelFeature createEmergencyMMTelFeatureInternal(int p0) { return null; }
    private com.android.ims.internal.IImsMMTelFeature createMMTelFeatureInternal(int p0) { return null; }
    private com.android.ims.internal.IImsRcsFeature createRcsFeatureInternal(int p0) { return null; }
    private void setupFeature(android.telephony.ims.compat.feature.ImsFeature p0, int p1, int p2) {}
    private void addImsFeature(int p0, int p1, android.telephony.ims.compat.feature.ImsFeature p2) {}
    private void addImsFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) {}
    private void removeImsFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) {}
    private void removeImsFeature(int p0, int p1) {}
    public android.telephony.ims.compat.feature.MMTelFeature onCreateEmergencyMMTelImsFeature(int p0) { return null; }
    public android.telephony.ims.compat.feature.MMTelFeature onCreateMMTelImsFeature(int p0) { return null; }
    public android.telephony.ims.compat.feature.RcsFeature onCreateRcsFeature(int p0) { return null; }
}
