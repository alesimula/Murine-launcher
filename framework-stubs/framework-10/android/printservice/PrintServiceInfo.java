package android.printservice;

@android.annotation.SystemApi
public final class PrintServiceInfo implements android.os.Parcelable {
    private static final java.lang.String LOG_TAG = null;
    private static final java.lang.String TAG_PRINT_SERVICE = "print-service";
    private final java.lang.String mId = null;
    private boolean mIsEnabled;
    private final android.content.pm.ResolveInfo mResolveInfo = null;
    private final java.lang.String mSettingsActivityName = null;
    private final java.lang.String mAddPrintersActivityName = null;
    private final java.lang.String mAdvancedPrintOptionsActivityName = null;
    public static final android.os.Parcelable.Creator<android.printservice.PrintServiceInfo> CREATOR = null;
    public PrintServiceInfo(android.os.Parcel p0) {}
    public PrintServiceInfo(android.content.pm.ResolveInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    public android.content.ComponentName getComponentName() { return null; }
    public static android.printservice.PrintServiceInfo create(android.content.Context p0, android.content.pm.ResolveInfo p1) { return null; }
    public java.lang.String getId() { return null; }
    public boolean isEnabled() { return false; }
    public void setIsEnabled(boolean p0) {}
    public android.content.pm.ResolveInfo getResolveInfo() { return null; }
    public java.lang.String getSettingsActivityName() { return null; }
    public java.lang.String getAddPrintersActivityName() { return null; }
    public java.lang.String getAdvancedOptionsActivityName() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
}
