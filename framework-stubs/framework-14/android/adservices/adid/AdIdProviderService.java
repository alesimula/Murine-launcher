package android.adservices.adid;

public abstract class AdIdProviderService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.adservices.adid.AdIdProviderService";
    public AdIdProviderService() { super(); }
    @android.annotation.NonNull
    public abstract android.adservices.adid.AdId onGetAdId(int p0, java.lang.String p1) throws java.io.IOException;
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
}
