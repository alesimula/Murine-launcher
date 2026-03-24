package android.net.http;

public abstract class UrlResponseInfo {
    public UrlResponseInfo() {}
    @android.annotation.NonNull
    public abstract java.lang.String getUrl();
    @android.annotation.NonNull
    public abstract java.util.List<java.lang.String> getUrlChain();
    public abstract int getHttpStatusCode();
    @android.annotation.NonNull
    public abstract java.lang.String getHttpStatusText();
    @android.annotation.NonNull
    public abstract android.net.http.HeaderBlock getHeaders();
    public abstract boolean wasCached();
    @android.annotation.NonNull
    public abstract java.lang.String getNegotiatedProtocol();
    public abstract long getReceivedByteCount();
}
