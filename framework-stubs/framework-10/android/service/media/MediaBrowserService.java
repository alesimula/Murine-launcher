package android.service.media;

public abstract class MediaBrowserService extends android.app.Service {
    private static final java.lang.String TAG = "MediaBrowserService";
    private static final boolean DBG = false;
    public static final java.lang.String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String KEY_MEDIA_ITEM = "media_item";
    private static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
    private static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    private static final int RESULT_ERROR = -1;
    private static final int RESULT_OK = 0;
    private final android.util.ArrayMap<android.os.IBinder, android.service.media.MediaBrowserService.ConnectionRecord> mConnections = null;
    private android.service.media.MediaBrowserService.ConnectionRecord mCurConnection;
    private final android.os.Handler mHandler = null;
    private android.service.media.MediaBrowserService.ServiceBinder mBinder;
    android.media.session.MediaSession.Token mSession;
    public MediaBrowserService() { super(); }
    public void onCreate() {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public abstract android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String p0, int p1, android.os.Bundle p2);
    public abstract void onLoadChildren(java.lang.String p0, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> p1);
    public void onLoadChildren(java.lang.String p0, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> p1, android.os.Bundle p2) {}
    public void onLoadItem(java.lang.String p0, android.service.media.MediaBrowserService.Result<android.media.browse.MediaBrowser.MediaItem> p1) {}
    public void setSessionToken(android.media.session.MediaSession.Token p0) {}
    public android.media.session.MediaSession.Token getSessionToken() { return null; }
    public final android.os.Bundle getBrowserRootHints() { return null; }
    public final android.media.session.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() { return null; }
    public void notifyChildrenChanged(java.lang.String p0) {}
    public void notifyChildrenChanged(java.lang.String p0, android.os.Bundle p1) {}
    private void notifyChildrenChangedInternal(java.lang.String p0, android.os.Bundle p1) {}
    private boolean isValidPackage(java.lang.String p0, int p1) { return false; }
    private void addSubscription(java.lang.String p0, android.service.media.MediaBrowserService.ConnectionRecord p1, android.os.IBinder p2, android.os.Bundle p3) {}
    private boolean removeSubscription(java.lang.String p0, android.service.media.MediaBrowserService.ConnectionRecord p1, android.os.IBinder p2) { return false; }
    private void performLoadChildren(java.lang.String p0, android.service.media.MediaBrowserService.ConnectionRecord p1, android.os.Bundle p2) {}
    private java.util.List<android.media.browse.MediaBrowser.MediaItem> applyOptions(java.util.List<android.media.browse.MediaBrowser.MediaItem> p0, android.os.Bundle p1) { return null; }
    private void performLoadItem(java.lang.String p0, android.service.media.MediaBrowserService.ConnectionRecord p1, android.os.ResultReceiver p2) {}

    private class ServiceBinder extends android.service.media.IMediaBrowserService.Stub {
        private ServiceBinder(android.service.media.MediaBrowserService p0) { super(); }
        public void connect(java.lang.String p0, android.os.Bundle p1, android.service.media.IMediaBrowserServiceCallbacks p2) {}
        public void disconnect(android.service.media.IMediaBrowserServiceCallbacks p0) {}
        public void addSubscriptionDeprecated(java.lang.String p0, android.service.media.IMediaBrowserServiceCallbacks p1) {}
        public void addSubscription(java.lang.String p0, android.os.IBinder p1, android.os.Bundle p2, android.service.media.IMediaBrowserServiceCallbacks p3) {}
        public void removeSubscriptionDeprecated(java.lang.String p0, android.service.media.IMediaBrowserServiceCallbacks p1) {}
        public void removeSubscription(java.lang.String p0, android.os.IBinder p1, android.service.media.IMediaBrowserServiceCallbacks p2) {}
        public void getMediaItem(java.lang.String p0, android.os.ResultReceiver p1, android.service.media.IMediaBrowserServiceCallbacks p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ResultFlags {
    }

    public class Result<T extends java.lang.Object> {
        private java.lang.Object mDebug;
        private boolean mDetachCalled;
        private boolean mSendResultCalled;
        @android.annotation.UnsupportedAppUsage
        private int mFlags;
        Result(android.service.media.MediaBrowserService p0, java.lang.Object p1) {}
        public void sendResult(T p0) {}
        public void detach() {}
        boolean isDone() { return false; }
        void setFlags(int p0) {}
        void onResultSent(T p0, int p1) {}
    }

    private class ConnectionRecord implements android.os.IBinder.DeathRecipient {
        java.lang.String pkg;
        int uid;
        int pid;
        android.os.Bundle rootHints;
        android.service.media.IMediaBrowserServiceCallbacks callbacks;
        android.service.media.MediaBrowserService.BrowserRoot root;
        java.util.HashMap<java.lang.String, java.util.List<android.util.Pair<android.os.IBinder, android.os.Bundle>>> subscriptions;
        private ConnectionRecord(android.service.media.MediaBrowserService p0) {}
        public void binderDied() {}
    }

    public static final class BrowserRoot {
        public static final java.lang.String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final java.lang.String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final java.lang.String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";
        private final java.lang.String mRootId = null;
        private final android.os.Bundle mExtras = null;
        public BrowserRoot(java.lang.String p0, android.os.Bundle p1) {}
        public java.lang.String getRootId() { return null; }
        public android.os.Bundle getExtras() { return null; }
    }
}
