package android.media.projection;

@android.annotation.FlaggedApi("com.android.media.projection.flags.app_content_sharing")
public final class AppContentRequest {
    public AppContentRequest(android.util.Size p0, java.util.function.Consumer<android.media.projection.MediaProjectionAppContent[]> p1) {}
    public void provideContent(java.util.List<android.media.projection.MediaProjectionAppContent> p0) {}
    public android.util.Size getThumbnailSize() { return null; }
}
