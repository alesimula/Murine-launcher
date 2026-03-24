package android.telephony.ims.compat;

public class ImsService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.ims.compat.ImsService";
    protected final android.os.IBinder mImsServiceController = null;
    public ImsService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public android.util.SparseArray<android.telephony.ims.compat.feature.ImsFeature> getFeatures(int p0) { return null; }
    @android.annotation.Nullable
    public android.telephony.ims.compat.feature.MMTelFeature onCreateEmergencyMMTelImsFeature(int p0) { return null; }
    @android.annotation.Nullable
    public android.telephony.ims.compat.feature.MMTelFeature onCreateMMTelImsFeature(int p0) { return null; }
    @android.annotation.Nullable
    public android.telephony.ims.compat.feature.RcsFeature onCreateRcsFeature(int p0) { return null; }
}
