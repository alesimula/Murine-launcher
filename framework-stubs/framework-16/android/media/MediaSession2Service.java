package android.media;

public abstract class MediaSession2Service extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.media.MediaSession2Service";
    public MediaSession2Service() { super(); }
    public final void addSession(android.media.MediaSession2 p0) {}
    @android.annotation.NonNull
    public final java.util.List<android.media.MediaSession2> getSessions() { return null; }
    @android.annotation.Nullable
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.Nullable
    public abstract android.media.MediaSession2 onGetSession(android.media.MediaSession2.ControllerInfo p0);
    @android.annotation.Nullable
    public abstract android.media.MediaSession2Service.MediaNotification onUpdateNotification(android.media.MediaSession2 p0);
    public final void removeSession(android.media.MediaSession2 p0) {}

    public static class MediaNotification {
        public MediaNotification(int p0, android.app.Notification p1) {}
        @android.annotation.NonNull
        public android.app.Notification getNotification() { return null; }
        public int getNotificationId() { return 0; }
    }
}
