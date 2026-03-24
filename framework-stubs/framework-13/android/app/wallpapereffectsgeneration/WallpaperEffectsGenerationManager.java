package android.app.wallpapereffectsgeneration;

@android.annotation.SystemApi
public final class WallpaperEffectsGenerationManager {
    public WallpaperEffectsGenerationManager(android.app.wallpapereffectsgeneration.IWallpaperEffectsGenerationManager p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_WALLPAPER_EFFECTS_GENERATION")
    public void generateCinematicEffect(android.app.wallpapereffectsgeneration.CinematicEffectRequest p0, java.util.concurrent.Executor p1, android.app.wallpapereffectsgeneration.WallpaperEffectsGenerationManager.CinematicEffectListener p2) {}

    public static interface CinematicEffectListener {
        public void onCinematicEffectGenerated(android.app.wallpapereffectsgeneration.CinematicEffectResponse p0);
    }

    private static final class CinematicEffectListenerWrapper extends android.app.wallpapereffectsgeneration.ICinematicEffectListener.Stub {
        CinematicEffectListenerWrapper(android.app.wallpapereffectsgeneration.WallpaperEffectsGenerationManager.CinematicEffectListener p0, java.util.concurrent.Executor p1) { super(); }
        public void onCinematicEffectGenerated(android.app.wallpapereffectsgeneration.CinematicEffectResponse p0) {}
    }
}
