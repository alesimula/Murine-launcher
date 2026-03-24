package android.webkit;

public abstract class WebResourceError {
    public abstract int getErrorCode();
    public abstract java.lang.CharSequence getDescription();
    @android.annotation.SystemApi
    public WebResourceError() {}
}
