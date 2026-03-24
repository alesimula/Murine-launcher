package android.content;

public class ClipboardManager extends android.text.ClipboardManager {
    public static final java.lang.String DEVICE_CONFIG_SHOW_ACCESS_NOTIFICATIONS = "show_access_notifications";
    public static final boolean DEVICE_CONFIG_DEFAULT_SHOW_ACCESS_NOTIFICATIONS = true;
    private final android.content.Context mContext = null;
    private final android.os.Handler mHandler = null;
    private final android.content.IClipboard mService = null;
    private final java.util.ArrayList<android.content.ClipboardManager.OnPrimaryClipChangedListener> mPrimaryClipChangedListeners = null;
    private final android.content.IOnPrimaryClipChangedListener.Stub mPrimaryClipChangedServiceListener = null;
    public ClipboardManager(android.content.Context p0, android.os.Handler p1) throws android.os.ServiceManager.ServiceNotFoundException { super(); }
    public void setPrimaryClip(android.content.ClipData p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_CLIP_SOURCE")
    public void setPrimaryClipAsPackage(android.content.ClipData p0, java.lang.String p1) {}
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
    @android.annotation.RequiresPermission("android.permission.SET_CLIP_SOURCE")
    public java.lang.String getPrimaryClipSource() { return null; }
    void reportPrimaryClipChanged() {}

    public static interface OnPrimaryClipChangedListener {
        public void onPrimaryClipChanged();
    }
}
