package android.net.http;

public abstract class BidirectionalStream {
    public static final int STREAM_PRIORITY_HIGHEST = 4;
    public static final int STREAM_PRIORITY_IDLE = 0;
    public static final int STREAM_PRIORITY_LOW = 2;
    public static final int STREAM_PRIORITY_LOWEST = 1;
    public static final int STREAM_PRIORITY_MEDIUM = 3;
    public BidirectionalStream() {}
    @android.annotation.NonNull
    public abstract java.lang.String getHttpMethod();
    public abstract boolean hasTrafficStatsTag();
    public abstract int getTrafficStatsTag();
    public abstract boolean hasTrafficStatsUid();
    public abstract int getTrafficStatsUid();
    @android.annotation.NonNull
    public abstract android.net.http.HeaderBlock getHeaders();
    public abstract int getPriority();
    public abstract boolean isDelayRequestHeadersUntilFirstFlushEnabled();
    public abstract void start();
    public abstract void read(java.nio.ByteBuffer p0);
    public abstract void write(java.nio.ByteBuffer p0, boolean p1);
    public abstract void flush();
    public abstract void cancel();
    public abstract boolean isDone();

    public static abstract class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public abstract android.net.http.BidirectionalStream.Builder setHttpMethod(java.lang.String p0);
        @android.annotation.NonNull
        public abstract android.net.http.BidirectionalStream.Builder addHeader(java.lang.String p0, java.lang.String p1);
        @android.annotation.NonNull
        public abstract android.net.http.BidirectionalStream.Builder setPriority(int p0);
        @android.annotation.NonNull
        public abstract android.net.http.BidirectionalStream.Builder setDelayRequestHeadersUntilFirstFlushEnabled(boolean p0);
        @android.annotation.NonNull
        public abstract android.net.http.BidirectionalStream.Builder setTrafficStatsTag(int p0);
        @android.annotation.NonNull
        public abstract android.net.http.BidirectionalStream.Builder setTrafficStatsUid(int p0);
        @android.annotation.NonNull
        public abstract android.net.http.BidirectionalStream build();
    }

    public static interface Callback {
        public void onStreamReady(android.net.http.BidirectionalStream p0);
        public void onResponseHeadersReceived(android.net.http.BidirectionalStream p0, android.net.http.UrlResponseInfo p1);
        public void onReadCompleted(android.net.http.BidirectionalStream p0, android.net.http.UrlResponseInfo p1, java.nio.ByteBuffer p2, boolean p3);
        public void onWriteCompleted(android.net.http.BidirectionalStream p0, android.net.http.UrlResponseInfo p1, java.nio.ByteBuffer p2, boolean p3);
        public void onResponseTrailersReceived(android.net.http.BidirectionalStream p0, android.net.http.UrlResponseInfo p1, android.net.http.HeaderBlock p2);
        public void onSucceeded(android.net.http.BidirectionalStream p0, android.net.http.UrlResponseInfo p1);
        public void onFailed(android.net.http.BidirectionalStream p0, android.net.http.UrlResponseInfo p1, android.net.http.HttpException p2);
        public void onCanceled(android.net.http.BidirectionalStream p0, android.net.http.UrlResponseInfo p1);
    }
}
