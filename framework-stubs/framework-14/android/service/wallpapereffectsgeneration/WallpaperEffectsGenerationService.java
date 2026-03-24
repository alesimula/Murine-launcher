package android.service.wallpapereffectsgeneration;

@android.annotation.SystemApi
public abstract class WallpaperEffectsGenerationService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.wallpapereffectsgeneration.WallpaperEffectsGenerationService";
    public WallpaperEffectsGenerationService() { super(); }
    public abstract void onGenerateCinematicEffect(android.app.wallpapereffectsgeneration.CinematicEffectRequest p0);
    public final void returnCinematicEffectResponse(android.app.wallpapereffectsgeneration.CinematicEffectResponse p0) {}
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
}
