package android.provider;

public abstract class CloudMediaProvider extends android.content.ContentProvider {
    public CloudMediaProvider() { super(); }
    public final void attachInfo(android.content.Context p0, android.content.pm.ProviderInfo p1) {}
    @android.annotation.NonNull
    public final android.os.Bundle call(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) { return null; }
    @android.annotation.NonNull
    public final android.net.Uri canonicalize(android.net.Uri p0) { return null; }
    public final int delete(android.net.Uri p0, java.lang.String p1, java.lang.String[] p2) { return 0; }
    @android.annotation.NonNull
    public final java.lang.String getType(android.net.Uri p0) { return null; }
    @android.annotation.NonNull
    public final android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1) { return null; }
    @android.annotation.Nullable
    public android.provider.CloudMediaProvider.CloudMediaSurfaceController onCreateCloudMediaSurfaceController(android.os.Bundle p0, android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback p1) { return null; }
    @android.annotation.FlaggedApi("com.android.providers.media.flags.enable_cloud_media_provider_capabilities")
    @android.annotation.NonNull
    public android.provider.CloudMediaProviderContract.Capabilities onGetCapabilities() { return null; }
    @android.annotation.NonNull
    public abstract android.os.Bundle onGetMediaCollectionInfo(android.os.Bundle p0);
    @android.annotation.NonNull
    public abstract android.os.ParcelFileDescriptor onOpenMedia(java.lang.String p0, android.os.Bundle p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException;
    @android.annotation.NonNull
    public abstract android.content.res.AssetFileDescriptor onOpenPreview(java.lang.String p0, android.graphics.Point p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws java.io.FileNotFoundException;
    @android.annotation.NonNull
    public android.database.Cursor onQueryAlbums(android.os.Bundle p0) { return null; }
    @android.annotation.NonNull
    public abstract android.database.Cursor onQueryDeletedMedia(android.os.Bundle p0);
    @android.annotation.NonNull
    public abstract android.database.Cursor onQueryMedia(android.os.Bundle p0);
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    @android.annotation.NonNull
    public android.database.Cursor onQueryMediaCategories(java.lang.String p0, android.os.Bundle p1, android.os.CancellationSignal p2) { return null; }
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    @android.annotation.NonNull
    public android.database.Cursor onQueryMediaInMediaSet(java.lang.String p0, android.os.Bundle p1, android.os.CancellationSignal p2) { return null; }
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    @android.annotation.NonNull
    public android.database.Cursor onQueryMediaSets(java.lang.String p0, android.os.Bundle p1, android.os.CancellationSignal p2) { return null; }
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    @android.annotation.NonNull
    public android.database.Cursor onQuerySearchSuggestions(java.lang.String p0, android.os.Bundle p1, android.os.CancellationSignal p2) { return null; }
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    @android.annotation.NonNull
    public android.database.Cursor onSearchMedia(java.lang.String p0, android.os.Bundle p1, android.os.CancellationSignal p2) { return null; }
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    @android.annotation.NonNull
    public android.database.Cursor onSearchMedia(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) { return null; }
    @android.annotation.NonNull
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    @android.annotation.NonNull
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException { return null; }
    @android.annotation.NonNull
    public final android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2) throws java.io.FileNotFoundException { return null; }
    @android.annotation.NonNull
    public final android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws java.io.FileNotFoundException { return null; }
    @android.annotation.NonNull
    public final android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, android.os.Bundle p2, android.os.CancellationSignal p3) { return null; }
    @android.annotation.NonNull
    public final android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) { return null; }
    @android.annotation.NonNull
    public final android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, android.os.CancellationSignal p5) { return null; }
    public final int update(android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) { return 0; }

    public static abstract class CloudMediaSurfaceController {
        public CloudMediaSurfaceController() {}
        public abstract void onConfigChange(android.os.Bundle p0);
        public abstract void onDestroy();
        public abstract void onMediaPause(int p0);
        public abstract void onMediaPlay(int p0);
        public abstract void onMediaSeekTo(int p0, long p1);
        public abstract void onPlayerCreate();
        public abstract void onPlayerRelease();
        public abstract void onSurfaceChanged(int p0, int p1, int p2, int p3);
        public abstract void onSurfaceCreated(int p0, android.view.Surface p1, java.lang.String p2);
        public abstract void onSurfaceDestroyed(int p0);
    }

    public static final class CloudMediaSurfaceStateChangedCallback {
        public static final int PLAYBACK_STATE_BUFFERING = 1;
        public static final int PLAYBACK_STATE_COMPLETED = 5;
        public static final int PLAYBACK_STATE_ERROR_PERMANENT_FAILURE = 7;
        public static final int PLAYBACK_STATE_ERROR_RETRIABLE_FAILURE = 6;
        public static final int PLAYBACK_STATE_MEDIA_SIZE_CHANGED = 8;
        public static final int PLAYBACK_STATE_PAUSED = 4;
        public static final int PLAYBACK_STATE_READY = 2;
        public static final int PLAYBACK_STATE_STARTED = 3;
        CloudMediaSurfaceStateChangedCallback() {}
        public void setPlaybackState(int p0, int p1, android.os.Bundle p2) {}
    }
}
