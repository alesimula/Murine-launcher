package android.content;

public class ClipboardManager extends android.text.ClipboardManager {
    public static final java.lang.String DEVICE_CONFIG_SHOW_ACCESS_NOTIFICATIONS = "show_access_notifications";
    public static final boolean DEVICE_CONFIG_DEFAULT_SHOW_ACCESS_NOTIFICATIONS = true;
    public static final java.lang.String DEVICE_CONFIG_ALLOW_VIRTUALDEVICE_SILOS = "allow_virtualdevice_silos";
    public static final boolean DEVICE_CONFIG_DEFAULT_ALLOW_VIRTUALDEVICE_SILOS = true;
    public ClipboardManager(android.content.Context p0, android.os.Handler p1) throws android.os.ServiceManager.ServiceNotFoundException { super(); }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_CLIPBOARD_ACCESS_NOTIFICATION")
    public boolean areClipboardAccessNotificationsEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_CLIPBOARD_ACCESS_NOTIFICATION")
    public void setClipboardAccessNotificationsEnabled(boolean p0) {}
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
