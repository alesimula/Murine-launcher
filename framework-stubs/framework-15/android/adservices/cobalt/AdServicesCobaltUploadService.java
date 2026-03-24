package android.adservices.cobalt;

public abstract class AdServicesCobaltUploadService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.adservices.cobalt.AdServicesCobaltUploadService";
    public AdServicesCobaltUploadService() { super(); }
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onUploadEncryptedCobaltEnvelope(android.adservices.cobalt.EncryptedCobaltEnvelopeParams p0);
}
