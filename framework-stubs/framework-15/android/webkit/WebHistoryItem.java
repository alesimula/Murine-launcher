package android.webkit;

public abstract class WebHistoryItem implements java.lang.Cloneable {
    public WebHistoryItem() {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract int getId();
    public abstract java.lang.String getUrl();
    public abstract java.lang.String getOriginalUrl();
    public abstract java.lang.String getTitle();
    @android.annotation.Nullable
    public abstract android.graphics.Bitmap getFavicon();
    protected abstract android.webkit.WebHistoryItem clone();
}
