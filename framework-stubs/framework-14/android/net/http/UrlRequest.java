package android.net.http;

public abstract class UrlRequest {
    public static final int REQUEST_PRIORITY_HIGHEST = 4;
    public static final int REQUEST_PRIORITY_IDLE = 0;
    public static final int REQUEST_PRIORITY_LOW = 2;
    public static final int REQUEST_PRIORITY_LOWEST = 1;
    public static final int REQUEST_PRIORITY_MEDIUM = 3;
    UrlRequest() {}
    @android.annotation.Nullable
    public abstract java.lang.String getHttpMethod();
    @android.annotation.NonNull
    public abstract android.net.http.HeaderBlock getHeaders();
    public abstract boolean isCacheDisabled();
    public abstract boolean isDirectExecutorAllowed();
    public abstract int getPriority();
    public abstract boolean hasTrafficStatsTag();
    public abstract int getTrafficStatsTag();
    public abstract boolean hasTrafficStatsUid();
    public abstract int getTrafficStatsUid();
    public abstract void start();
    public abstract void followRedirect();
    public abstract void read(java.nio.ByteBuffer p0);
    public abstract void cancel();
    public abstract boolean isDone();
    public abstract void getStatus(android.net.http.UrlRequest.StatusListener p0);

    public static abstract class Builder {
        Builder() {}
        @android.annotation.NonNull
        public abstract android.net.http.UrlRequest.Builder setHttpMethod(java.lang.String p0);
        @android.annotation.NonNull
        public abstract android.net.http.UrlRequest.Builder addHeader(java.lang.String p0, java.lang.String p1);
        @android.annotation.NonNull
        public abstract android.net.http.UrlRequest.Builder setCacheDisabled(boolean p0);
        @android.annotation.NonNull
        public abstract android.net.http.UrlRequest.Builder setPriority(int p0);
        @android.annotation.NonNull
        public abstract android.net.http.UrlRequest.Builder setUploadDataProvider(android.net.http.UploadDataProvider p0, java.util.concurrent.Executor p1);
        @android.annotation.NonNull
        public abstract android.net.http.UrlRequest.Builder setDirectExecutorAllowed(boolean p0);
        @android.annotation.NonNull
        public abstract android.net.http.UrlRequest.Builder bindToNetwork(android.net.Network p0);
        @android.annotation.NonNull
        public abstract android.net.http.UrlRequest.Builder setTrafficStatsTag(int p0);
        @android.annotation.NonNull
        public abstract android.net.http.UrlRequest.Builder setTrafficStatsUid(int p0);
        @android.annotation.NonNull
        public abstract android.net.http.UrlRequest build();
    }

    public static interface Callback {
        public void onRedirectReceived(android.net.http.UrlRequest p0, android.net.http.UrlResponseInfo p1, java.lang.String p2) throws java.lang.Exception;
        public void onResponseStarted(android.net.http.UrlRequest p0, android.net.http.UrlResponseInfo p1) throws java.lang.Exception;
        public void onReadCompleted(android.net.http.UrlRequest p0, android.net.http.UrlResponseInfo p1, java.nio.ByteBuffer p2) throws java.lang.Exception;
        public void onSucceeded(android.net.http.UrlRequest p0, android.net.http.UrlResponseInfo p1);
        public void onFailed(android.net.http.UrlRequest p0, android.net.http.UrlResponseInfo p1, android.net.http.HttpException p2);
        public void onCanceled(android.net.http.UrlRequest p0, android.net.http.UrlResponseInfo p1);
    }

    public static interface StatusListener {
        public void onStatus(int p0);
    }

    public static class Status {
        public static final int CONNECTING = 10;
        public static final int DOWNLOADING_PAC_FILE = 5;
        public static final int ESTABLISHING_PROXY_TUNNEL = 8;
        public static final int IDLE = 0;
        public static final int INVALID = -1;
        public static final int READING_RESPONSE = 14;
        public static final int RESOLVING_HOST = 9;
        public static final int RESOLVING_HOST_IN_PAC_FILE = 7;
        public static final int RESOLVING_PROXY_FOR_URL = 6;
        public static final int SENDING_REQUEST = 12;
        public static final int SSL_HANDSHAKE = 11;
        public static final int WAITING_FOR_AVAILABLE_SOCKET = 2;
        public static final int WAITING_FOR_CACHE = 4;
        public static final int WAITING_FOR_DELEGATE = 3;
        public static final int WAITING_FOR_RESPONSE = 13;
        public static final int WAITING_FOR_STALLED_SOCKET_POOL = 1;
        Status() {}
    }
}
