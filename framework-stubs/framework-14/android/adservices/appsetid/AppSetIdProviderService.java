package android.adservices.appsetid;

public abstract class AppSetIdProviderService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.adservices.appsetid.AppSetIdProviderService";
    public AppSetIdProviderService() { super(); }
    @android.annotation.NonNull
    public abstract android.adservices.appsetid.AppSetId onGetAppSetId(int p0, java.lang.String p1) throws java.io.IOException;
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
}
