package android.content.pm;

public class ComponentInfo extends android.content.pm.PackageItemInfo {
    public android.content.pm.ApplicationInfo applicationInfo;
    public java.lang.String processName;
    public java.lang.String splitName;
    public int descriptionRes;
    public boolean enabled;
    public boolean exported;
    public boolean directBootAware;
    @java.lang.Deprecated
    public boolean encryptionAware;
    public ComponentInfo() { super(); }
    public ComponentInfo(android.content.pm.ComponentInfo p0) { super(); }
    public java.lang.CharSequence loadUnsafeLabel(android.content.pm.PackageManager p0) { return null; }
    public boolean isEnabled() { return false; }
    public final int getIconResource() { return 0; }
    public final int getLogoResource() { return 0; }
    public final int getBannerResource() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public android.content.ComponentName getComponentName() { return null; }
    protected void dumpFront(android.util.Printer p0, java.lang.String p1) {}
    protected void dumpBack(android.util.Printer p0, java.lang.String p1) {}
    void dumpBack(android.util.Printer p0, java.lang.String p1, int p2) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected ComponentInfo(android.os.Parcel p0) { super(); }
    public android.graphics.drawable.Drawable loadDefaultIcon(android.content.pm.PackageManager p0) { return null; }
    protected android.graphics.drawable.Drawable loadDefaultBanner(android.content.pm.PackageManager p0) { return null; }
    protected android.graphics.drawable.Drawable loadDefaultLogo(android.content.pm.PackageManager p0) { return null; }
    protected android.content.pm.ApplicationInfo getApplicationInfo() { return null; }
}
