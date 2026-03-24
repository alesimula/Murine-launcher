package android.content.pm;

public class ResolveInfo implements android.os.Parcelable {
    public android.content.pm.ActivityInfo activityInfo;
    public android.content.pm.ServiceInfo serviceInfo;
    public android.content.pm.ProviderInfo providerInfo;
    public android.content.pm.AuxiliaryResolveInfo auxiliaryInfo;
    public boolean isInstantAppAvailable;
    public android.content.IntentFilter filter;
    public int priority;
    public int preferredOrder;
    public int match;
    public android.os.UserHandle userHandle;
    public int specificIndex;
    public boolean isDefault;
    public int labelRes;
    public java.lang.CharSequence nonLocalizedLabel;
    public int icon;
    public java.lang.String resolvePackageName;
    public int targetUserId;
    public boolean noResourceId;
    public int iconResourceId;
    public boolean system;
    @android.annotation.SystemApi
    public boolean handleAllWebDataURI;
    public static final android.os.Parcelable.Creator<android.content.pm.ResolveInfo> CREATOR = null;
    public android.content.pm.ComponentInfo getComponentInfo() { return null; }
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public int resolveLabelResId() { return 0; }
    public int resolveIconResId() { return 0; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    final int getIconResourceInternal() { return 0; }
    public final int getIconResource() { return 0; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public void dump(android.util.Printer p0, java.lang.String p1, int p2) {}
    public boolean isCrossProfileIntentForwarderActivity() { return false; }
    public boolean isAutoResolutionAllowed() { return false; }
    public ResolveInfo() {}
    public ResolveInfo(boolean p0) {}
    public ResolveInfo(android.content.pm.ResolveInfo p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static abstract class DisplayNameComparator implements java.util.Comparator<android.content.pm.ResolveInfo> {
        public DisplayNameComparator(android.content.pm.PackageManager p0) {}
        public final int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return 0; }
    }
}
