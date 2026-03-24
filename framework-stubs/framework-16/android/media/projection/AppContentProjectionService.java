package android.media.projection;

@android.annotation.FlaggedApi("com.android.media.projection.flags.app_content_sharing")
public abstract class AppContentProjectionService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.media.projection.AppContentProjectionService";
    public static final java.lang.String EXTRA_APP_CONTENT = "extra_app_content";
    public AppContentProjectionService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onContentRequest(android.media.projection.AppContentRequest p0);
    public abstract boolean onLoopbackProjectionStarted(android.media.projection.AppContentProjectionSession p0, int p1);
    public abstract void onSessionStopped(android.media.projection.AppContentProjectionSession p0);
    public abstract void onContentRequestCanceled();

    private class AppContentProjectionCallbackInternal extends android.media.projection.IAppContentProjectionCallback.Stub {
        @android.annotation.EnforcePermission(allOf="MANAGE_MEDIA_PROJECTION")
        public void onContentRequest(android.os.RemoteCallback p0, int p1, int p2) {}
        @android.annotation.EnforcePermission(allOf="MANAGE_MEDIA_PROJECTION")
        public void onLoopbackProjectionStarted(android.media.projection.IAppContentProjectionSession p0, int p1) {}
        @android.annotation.EnforcePermission(allOf="MANAGE_MEDIA_PROJECTION")
        public void onSessionStopped() {}
        @android.annotation.EnforcePermission(allOf="MANAGE_MEDIA_PROJECTION")
        public void onContentRequestCanceled() {}
    }
}
