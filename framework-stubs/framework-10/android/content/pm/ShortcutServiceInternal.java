package android.content.pm;

public abstract class ShortcutServiceInternal {
    public ShortcutServiceInternal() {}
    public abstract java.util.List<android.content.pm.ShortcutInfo> getShortcuts(int p0, java.lang.String p1, long p2, java.lang.String p3, java.util.List<java.lang.String> p4, android.content.ComponentName p5, int p6, int p7, int p8, int p9);
    public abstract boolean isPinnedByCaller(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4);
    public abstract void pinShortcuts(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4);
    public abstract android.content.Intent[] createShortcutIntents(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6);
    public abstract void addListener(android.content.pm.ShortcutServiceInternal.ShortcutChangeListener p0);
    public abstract int getShortcutIconResId(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4);
    public abstract android.os.ParcelFileDescriptor getShortcutIconFd(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4);
    public abstract boolean hasShortcutHostPermission(int p0, java.lang.String p1, int p2, int p3);
    public abstract void setShortcutHostPackage(java.lang.String p0, java.lang.String p1, int p2);
    public abstract boolean requestPinAppWidget(java.lang.String p0, android.appwidget.AppWidgetProviderInfo p1, android.os.Bundle p2, android.content.IntentSender p3, int p4);
    public abstract boolean isRequestPinItemSupported(int p0, int p1);
    public abstract boolean isForegroundDefaultLauncher(java.lang.String p0, int p1);

    public static interface ShortcutChangeListener {
        public void onShortcutChanged(java.lang.String p0, int p1);
    }
}
