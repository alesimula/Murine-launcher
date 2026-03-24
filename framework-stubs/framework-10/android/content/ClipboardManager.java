package android.content;

public class ClipboardManager extends android.text.ClipboardManager {
    private final android.content.Context mContext = null;
    private final android.os.Handler mHandler = null;
    private final android.content.IClipboard mService = null;
    private final java.util.ArrayList<android.content.ClipboardManager.OnPrimaryClipChangedListener> mPrimaryClipChangedListeners = null;
    private final android.content.IOnPrimaryClipChangedListener.Stub mPrimaryClipChangedServiceListener = null;
    @android.annotation.UnsupportedAppUsage
    public ClipboardManager(android.content.Context p0, android.os.Handler p1) throws android.os.ServiceManager.ServiceNotFoundException { super(); }
    public void setPrimaryClip(android.content.ClipData p0) {}
    public void clearPrimaryClip() {}
    public android.content.ClipData getPrimaryClip() { return null; }
    public android.content.ClipDescription getPrimaryClipDescription() { return null; }
    public boolean hasPrimaryClip() { return false; }
    public void addPrimaryClipChangedListener(android.content.ClipboardManager.OnPrimaryClipChangedListener p0) {}
    public void removePrimaryClipChangedListener(android.content.ClipboardManager.OnPrimaryClipChangedListener p0) {}
    @java.lang.Deprecated
    public java.lang.CharSequence getText() { return null; }
    @java.lang.Deprecated
    public void setText(java.lang.CharSequence p0) {}
    @java.lang.Deprecated
    public boolean hasText() { return false; }
    @android.annotation.UnsupportedAppUsage
    void reportPrimaryClipChanged() {}

    public static interface OnPrimaryClipChangedListener {
        public void onPrimaryClipChanged();
    }
}
