package android.media.browse;

public final class MediaBrowser {
    public static final java.lang.String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final java.lang.String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    public MediaBrowser(android.content.Context p0, android.content.ComponentName p1, android.media.browse.MediaBrowser.ConnectionCallback p2, android.os.Bundle p3) {}
    public void connect() {}
    public void disconnect() {}
    public boolean isConnected() { return false; }
    @android.annotation.NonNull
    public android.content.ComponentName getServiceComponent() { return null; }
    @android.annotation.NonNull
    public java.lang.String getRoot() { return null; }
    @android.annotation.Nullable
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.NonNull
    public android.media.session.MediaSession.Token getSessionToken() { return null; }
    public void subscribe(java.lang.String p0, android.media.browse.MediaBrowser.SubscriptionCallback p1) {}
    public void subscribe(java.lang.String p0, android.os.Bundle p1, android.media.browse.MediaBrowser.SubscriptionCallback p2) {}
    public void unsubscribe(java.lang.String p0) {}
    public void unsubscribe(java.lang.String p0, android.media.browse.MediaBrowser.SubscriptionCallback p1) {}
    public void getItem(java.lang.String p0, android.media.browse.MediaBrowser.ItemCallback p1) {}
    void dump() {}

    public static class ConnectionCallback {
        public ConnectionCallback() {}
        public void onConnected() {}
        public void onConnectionSuspended() {}
        public void onConnectionFailed() {}
        public void onDisconnected() {}
    }

    public static abstract class ItemCallback {
        public ItemCallback() {}
        public void onItemLoaded(android.media.browse.MediaBrowser.MediaItem p0) {}
        public void onError(java.lang.String p0) {}
    }

    public static class MediaItem implements android.os.Parcelable {
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.media.browse.MediaBrowser.MediaItem> CREATOR = null;
        public MediaItem(android.media.MediaDescription p0, int p1) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        public int getFlags() { return 0; }
        public boolean isBrowsable() { return false; }
        public boolean isPlayable() { return false; }
        @android.annotation.NonNull
        public android.media.MediaDescription getDescription() { return null; }
        @android.annotation.Nullable
        public java.lang.String getMediaId() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Flags {
        }
    }

    private class MediaServiceConnection implements android.content.ServiceConnection {
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
    }

    private static class ServiceCallbacks extends android.service.media.IMediaBrowserServiceCallbacks.Stub {
        ServiceCallbacks(android.media.browse.MediaBrowser p0) { super(); }
        public void onConnect(java.lang.String p0, android.media.session.MediaSession.Token p1, android.os.Bundle p2) {}
        public void onConnectFailed() {}
        public void onLoadChildren(java.lang.String p0, android.content.pm.ParceledListSlice p1, android.os.Bundle p2) {}
        public void onDisconnect() {}
    }

    private static class Subscription {
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
