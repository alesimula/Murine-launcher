package android.webkit;

@java.lang.Deprecated
public class Plugin {
    private java.lang.String mName;
    private java.lang.String mPath;
    private java.lang.String mFileName;
    private java.lang.String mDescription;
    private android.webkit.Plugin.PreferencesClickHandler mHandler;
    @java.lang.Deprecated
    public Plugin(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    @java.lang.Deprecated
    public java.lang.String toString() { return null; }
    @java.lang.Deprecated
    public java.lang.String getName() { return null; }
    @java.lang.Deprecated
    public java.lang.String getPath() { return null; }
    @java.lang.Deprecated
    public java.lang.String getFileName() { return null; }
    @java.lang.Deprecated
    public java.lang.String getDescription() { return null; }
    @java.lang.Deprecated
    public void setName(java.lang.String p0) {}
    @java.lang.Deprecated
    public void setPath(java.lang.String p0) {}
    @java.lang.Deprecated
    public void setFileName(java.lang.String p0) {}
    @java.lang.Deprecated
    public void setDescription(java.lang.String p0) {}
    @java.lang.Deprecated
    public void setClickHandler(android.webkit.Plugin.PreferencesClickHandler p0) {}
    @java.lang.Deprecated
    public void dispatchClickEvent(android.content.Context p0) {}

    @java.lang.Deprecated
    private class DefaultClickHandler implements android.webkit.Plugin.PreferencesClickHandler, android.content.DialogInterface.OnClickListener {
        private android.app.AlertDialog mDialog;
        private DefaultClickHandler(android.webkit.Plugin p0) {}
        @java.lang.Deprecated
        public void handleClickEvent(android.content.Context p0) {}
        @java.lang.Deprecated
        public void onClick(android.content.DialogInterface p0, int p1) {}
    }

    public static interface PreferencesClickHandler {
        public void handleClickEvent(android.content.Context p0);
    }
}
