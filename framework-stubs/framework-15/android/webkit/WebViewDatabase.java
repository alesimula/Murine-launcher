package android.webkit;

public abstract class WebViewDatabase {
    protected static final java.lang.String LOGTAG = "webviewdatabase";
    @java.lang.Deprecated
    public WebViewDatabase() {}
    public static android.webkit.WebViewDatabase getInstance(android.content.Context p0) { return null; }
    @java.lang.Deprecated
    public abstract boolean hasUsernamePassword();
    @java.lang.Deprecated
    public abstract void clearUsernamePassword();
    public abstract boolean hasHttpAuthUsernamePassword();
    public abstract void clearHttpAuthUsernamePassword();
    public abstract void setHttpAuthUsernamePassword(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3);
    @android.annotation.Nullable
    public abstract java.lang.String[] getHttpAuthUsernamePassword(java.lang.String p0, java.lang.String p1);
    @java.lang.Deprecated
    public abstract boolean hasFormData();
    @java.lang.Deprecated
    public abstract void clearFormData();
}
