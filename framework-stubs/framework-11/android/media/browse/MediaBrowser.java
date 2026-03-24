package android.media.browse;

public final class MediaBrowser {
    private static final java.lang.String TAG = "MediaBrowser";
    private static final boolean DBG = false;
    public static final java.lang.String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final java.lang.String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    private static final int CONNECT_STATE_DISCONNECTING = 0;
    private static final int CONNECT_STATE_DISCONNECTED = 1;
    private static final int CONNECT_STATE_CONNECTING = 2;
    private static final int CONNECT_STATE_CONNECTED = 3;
    private static final int CONNECT_STATE_SUSPENDED = 4;
    private final android.content.Context mContext = null;
    private final android.content.ComponentName mServiceComponent = null;
    private final android.media.browse.MediaBrowser.ConnectionCallback mCallback = null;
    private final android.os.Bundle mRootHints = null;
    private final android.os.Handler mHandler = null;
    private final android.util.ArrayMap<java.lang.String, android.media.browse.MediaBrowser.Subscription> mSubscriptions = null;
    private volatile int mState;
    private volatile java.lang.String mRootId;
    private volatile android.media.session.MediaSession.Token mMediaSessionToken;
    private volatile android.os.Bundle mExtras;
    private android.media.browse.MediaBrowser.MediaServiceConnection mServiceConnection;
    private android.service.media.IMediaBrowserService mServiceBinder;
    private android.service.media.IMediaBrowserServiceCallbacks mServiceCallbacks;
    public MediaBrowser(android.content.Context p0, android.content.ComponentName p1, android.media.browse.MediaBrowser.ConnectionCallback p2, android.os.Bundle p3) {}
    public void connect() {}
    public void disconnect() {}
    private void forceCloseConnection() {}
    public boolean isConnected() { return false; }
    public android.content.ComponentName getServiceComponent() { return null; }
    public java.lang.String getRoot() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public android.media.session.MediaSession.Token getSessionToken() { return null; }
    public void subscribe(java.lang.String p0, android.media.browse.MediaBrowser.SubscriptionCallback p1) {}
    public void subscribe(java.lang.String p0, android.os.Bundle p1, android.media.browse.MediaBrowser.SubscriptionCallback p2) {}
    public void unsubscribe(java.lang.String p0) {}
    public void unsubscribe(java.lang.String p0, android.media.browse.MediaBrowser.SubscriptionCallback p1) {}
    public void getItem(java.lang.String p0, android.media.browse.MediaBrowser.ItemCallback p1) {}
    private void subscribeInternal(java.lang.String p0, android.os.Bundle p1, android.media.browse.MediaBrowser.SubscriptionCallback p2) {}
    private void unsubscribeInternal(java.lang.String p0, android.media.browse.MediaBrowser.SubscriptionCallback p1) {}
    private static java.lang.String getStateLabel(int p0) { return null; }
    private void onServiceConnected(android.service.media.IMediaBrowserServiceCallbacks p0, java.lang.String p1, android.media.session.MediaSession.Token p2, android.os.Bundle p3) {}
    private void onConnectionFailed(android.service.media.IMediaBrowserServiceCallbacks p0) {}
    private void onLoadChildren(android.service.media.IMediaBrowserServiceCallbacks p0, java.lang.String p1, android.content.pm.ParceledListSlice p2, android.os.Bundle p3) {}
    private boolean isCurrent(android.service.media.IMediaBrowserServiceCallbacks p0, java.lang.String p1) { return false; }
    private android.media.browse.MediaBrowser.ServiceCallbacks getNewServiceCallbacks() { return null; }
    void dump() {}

    public static class ConnectionCallback {
        public ConnectionCallback() {}
        public void onConnected() {}
        public void onConnectionSuspended() {}
        public void onConnectionFailed() {}
    }

    public static abstract class ItemCallback {
        public ItemCallback() {}
        public void onItemLoaded(android.media.browse.MediaBrowser.MediaItem p0) {}
        public void onError(java.lang.String p0) {}
    }

    public static class MediaItem implements android.os.Parcelable {
        private final int mFlags = 0;
        private final android.media.MediaDescription mDescription = null;
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        public static final android.os.Parcelable.Creator<android.media.browse.MediaBrowser.MediaItem> CREATOR = null;
        public MediaItem(android.media.MediaDescription p0, int p1) {}
        private MediaItem(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        public int getFlags() { return 0; }
        public boolean isBrowsable() { return false; }
        public boolean isPlayable() { return false; }
        public android.media.MediaDescription getDescription() { return null; }
        public java.lang.String getMediaId() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Flags {
        }
    }

    private class MediaServiceConnection implements android.content.ServiceConnection {
        private MediaServiceConnection(android.media.browse.MediaBrowser p0) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        private void postOrRun(java.lang.Runnable p0) {}
        private boolean isCurrent(java.lang.String p0) { return false; }
    }

    private static class ServiceCallbacks extends android.service.media.IMediaBrowserServiceCallbacks.Stub {
        private java.lang.ref.WeakReference<android.media.browse.MediaBrowser> mMediaBrowser;
        ServiceCallbacks(android.media.browse.MediaBrowser p0) { super(); }
        public void onConnect(java.lang.String p0, android.media.session.MediaSession.Token p1, android.os.Bundle p2) {}
        public void onConnectFailed() {}
        public void onLoadChildren(java.lang.String p0, android.content.pm.ParceledListSlice p1) {}
        public void onLoadChildrenWithOptions(java.lang.String p0, android.content.pm.ParceledListSlice p1, android.os.Bundle p2) {}
    }

    private static class Subscription {
        private final java.util.List<android.media.browse.MediaBrowser.SubscriptionCallback> mCallbacks = null;
        private final java.util.List<android.os.Bundle> mOptionsList = null;
        Subscription() {}
        public boolean isEmpty() { return false; }
        public java.util.List<android.os.Bundle> getOptionsList() { return null; }
        public java.util.List<android.media.browse.MediaBrowser.SubscriptionCallback> getCallbacks() { return null; }
        public android.media.browse.MediaBrowser.SubscriptionCallback getCallback(android.content.Context p0, android.os.Bundle p1) { return null; }
        public void putCallback(android.content.Context p0, android.os.Bundle p1, android.media.browse.MediaBrowser.SubscriptionCallback p2) {}
    }

    public static abstract class SubscriptionCallback {
        android.os.Binder mToken;
        public SubscriptionCallback() {}
        public void onChildrenLoaded(java.lang.String p0, java.util.List<android.media.browse.MediaBrowser.MediaItem> p1) {}
        public void onChildrenLoaded(java.lang.String p0, java.util.List<android.media.browse.MediaBrowser.MediaItem> p1, android.os.Bundle p2) {}
        public void onError(java.lang.String p0) {}
        public void onError(java.lang.String p0, android.os.Bundle p1) {}
    }
}
