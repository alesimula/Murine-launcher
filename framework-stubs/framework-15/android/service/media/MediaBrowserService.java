package android.service.media;

public abstract class MediaBrowserService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    public static final java.lang.String KEY_MEDIA_ITEM = "media_item";
    public MediaBrowserService() { super(); }
    public void onCreate() {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    @android.annotation.Nullable
    public abstract android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String p0, int p1, android.os.Bundle p2);
    public abstract void onLoadChildren(java.lang.String p0, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> p1);
    public void onLoadChildren(java.lang.String p0, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> p1, android.os.Bundle p2) {}
    public void onLoadItem(java.lang.String p0, android.service.media.MediaBrowserService.Result<android.media.browse.MediaBrowser.MediaItem> p1) {}
    public void setSessionToken(android.media.session.MediaSession.Token p0) {}
    @android.annotation.Nullable
    public android.media.session.MediaSession.Token getSessionToken() { return null; }
    public final android.os.Bundle getBrowserRootHints() { return null; }
    public final android.media.session.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() { return null; }
    public void notifyChildrenChanged(java.lang.String p0) {}
    public void notifyChildrenChanged(java.lang.String p0, android.os.Bundle p1) {}

    public static final class BrowserRoot {
        public static final java.lang.String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final java.lang.String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final java.lang.String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";
        public BrowserRoot(java.lang.String p0, android.os.Bundle p1) {}
        public java.lang.String getRootId() { return null; }
        public android.os.Bundle getExtras() { return null; }
    }

    private static class ConnectionRecord implements android.os.IBinder.DeathRecipient {
        public final android.service.media.MediaBrowserService.ServiceState serviceState = null;
        public final java.lang.String pkg = null;
        public final int pid = 0;
        public final int uid = 0;
        public final android.os.Bundle rootHints = null;
        public final android.service.media.IMediaBrowserServiceCallbacks callbacks = null;
        public final android.service.media.MediaBrowserService.BrowserRoot root = null;
        public final java.util.HashMap<java.lang.String, java.util.List<android.util.Pair<android.os.IBinder, android.os.Bundle>>> subscriptions = null;
        ConnectionRecord(android.service.media.MediaBrowserService.ServiceState p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4, android.service.media.IMediaBrowserServiceCallbacks p5, android.service.media.MediaBrowserService.BrowserRoot p6) {}
        public void binderDied() {}
    }

    public class Result<T extends java.lang.Object> {
        Result(android.service.media.MediaBrowserService p0, java.lang.Object p1) {}
        public void sendResult(T p0) {}
        public void detach() {}
        boolean isDone() { return false; }
        void setFlags(int p0) {}
        void onResultSent(T p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ResultFlags {
    }

    private static class ServiceBinder extends android.service.media.IMediaBrowserService.Stub {
        public void setServiceState(android.service.media.MediaBrowserService.ServiceState p0) {}
        public void connect(java.lang.String p0, android.os.Bundle p1, android.service.media.IMediaBrowserServiceCallbacks p2) {}
        public void disconnect(android.service.media.IMediaBrowserServiceCallbacks p0) {}
        public void addSubscriptionDeprecated(java.lang.String p0, android.service.media.IMediaBrowserServiceCallbacks p1) {}
        public void addSubscription(java.lang.String p0, android.os.IBinder p1, android.os.Bundle p2, android.service.media.IMediaBrowserServiceCallbacks p3) {}
        public void removeSubscriptionDeprecated(java.lang.String p0, android.service.media.IMediaBrowserServiceCallbacks p1) {}
        public void removeSubscription(java.lang.String p0, android.os.IBinder p1, android.service.media.IMediaBrowserServiceCallbacks p2) {}
        public void getMediaItem(java.lang.String p0, android.os.ResultReceiver p1, android.service.media.IMediaBrowserServiceCallbacks p2) {}
    }

    private class ServiceState {
        public android.service.media.MediaBrowserService.ServiceBinder getBinder() { return null; }
        public void postOnHandler(java.lang.Runnable p0) {}
        public void release() {}
        public void removeConnectionRecordOnHandler(android.service.media.IMediaBrowserServiceCallbacks p0) {}
        public void notifySessionTokenInitializedOnHandler(android.media.session.MediaSession.Token p0) {}
        public void notifyChildrenChangeOnHandler(java.lang.String p0, android.os.Bundle p1) {}
        public void addSubscriptionOnHandler(java.lang.String p0, android.service.media.IMediaBrowserServiceCallbacks p1, android.os.IBinder p2, android.os.Bundle p3) {}
        public void connectOnHandler(java.lang.String p0, int p1, int p2, android.os.Bundle p3, android.service.media.IMediaBrowserServiceCallbacks p4) {}
        public boolean removeSubscriptionOnHandler(java.lang.String p0, android.service.media.IMediaBrowserServiceCallbacks p1, android.os.IBinder p2) { return false; }
        public void performLoadChildrenOnHandler(java.lang.String p0, android.service.media.MediaBrowserService.ConnectionRecord p1, android.os.Bundle p2) {}
        public void performLoadItemOnHandler(java.lang.String p0, android.service.media.IMediaBrowserServiceCallbacks p1, android.os.ResultReceiver p2) {}
        public boolean isValidPackage(java.lang.String p0, int p1) { return false; }
    }
}
