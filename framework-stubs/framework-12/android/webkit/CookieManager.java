package android.webkit;

public abstract class CookieManager {
    @java.lang.Deprecated
    public CookieManager() {}
    protected java.lang.Object clone() throws java.lang.CloneNotSupportedException { return null; }
    public static android.webkit.CookieManager getInstance() { return null; }
    public abstract void setAcceptCookie(boolean p0);
    public abstract boolean acceptCookie();
    public abstract void setAcceptThirdPartyCookies(android.webkit.WebView p0, boolean p1);
    public abstract boolean acceptThirdPartyCookies(android.webkit.WebView p0);
    public abstract void setCookie(java.lang.String p0, java.lang.String p1);
    public abstract void setCookie(java.lang.String p0, java.lang.String p1, android.webkit.ValueCallback<java.lang.Boolean> p2);
    public abstract java.lang.String getCookie(java.lang.String p0);
    @android.annotation.SystemApi
    public abstract java.lang.String getCookie(java.lang.String p0, boolean p1);
    @android.annotation.SystemApi
    public synchronized java.lang.String getCookie(android.net.WebAddress p0) { return null; }
    @java.lang.Deprecated
    public abstract void removeSessionCookie();
    public abstract void removeSessionCookies(android.webkit.ValueCallback<java.lang.Boolean> p0);
    @java.lang.Deprecated
    public abstract void removeAllCookie();
    public abstract void removeAllCookies(android.webkit.ValueCallback<java.lang.Boolean> p0);
    public abstract boolean hasCookies();
    @android.annotation.SystemApi
    public abstract boolean hasCookies(boolean p0);
    @java.lang.Deprecated
    public abstract void removeExpiredCookie();
    public abstract void flush();
    public static boolean allowFileSchemeCookies() { return false; }
    @android.annotation.SystemApi
    protected abstract boolean allowFileSchemeCookiesImpl();
    @java.lang.Deprecated
    public static void setAcceptFileSchemeCookies(boolean p0) {}
    @android.annotation.SystemApi
    protected abstract void setAcceptFileSchemeCookiesImpl(boolean p0);
}
