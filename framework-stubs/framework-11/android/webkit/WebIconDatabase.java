package android.webkit;

@java.lang.Deprecated
public abstract class WebIconDatabase {
    public WebIconDatabase() {}
    public abstract void open(java.lang.String p0);
    public abstract void close();
    public abstract void removeAllIcons();
    public abstract void requestIconForPageUrl(java.lang.String p0, android.webkit.WebIconDatabase.IconListener p1);
    @android.annotation.SystemApi
    public abstract void bulkRequestIconForPageUrl(android.content.ContentResolver p0, java.lang.String p1, android.webkit.WebIconDatabase.IconListener p2);
    public abstract void retainIconForPageUrl(java.lang.String p0);
    public abstract void releaseIconForPageUrl(java.lang.String p0);
    public static android.webkit.WebIconDatabase getInstance() { return null; }

    @java.lang.Deprecated
    public static interface IconListener {
        public void onReceivedIcon(java.lang.String p0, android.graphics.Bitmap p1);
    }
}
