package android.service.autofill;

public final class AutofillServiceInfo {
    private static final java.lang.String TAG = "AutofillServiceInfo";
    private static final java.lang.String TAG_AUTOFILL_SERVICE = "autofill-service";
    private static final java.lang.String TAG_COMPATIBILITY_PACKAGE = "compatibility-package";
    private final android.content.pm.ServiceInfo mServiceInfo = null;
    private final java.lang.String mSettingsActivity = null;
    private final android.util.ArrayMap<java.lang.String, java.lang.Long> mCompatibilityPackages = null;
    private static android.content.pm.ServiceInfo getServiceInfoOrThrow(android.content.ComponentName p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public AutofillServiceInfo(android.content.Context p0, android.content.ComponentName p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException {}
    public AutofillServiceInfo(android.content.Context p0, android.content.pm.ServiceInfo p1) {}
    private android.util.ArrayMap<java.lang.String, java.lang.Long> parseCompatibilityPackages(org.xmlpull.v1.XmlPullParser p0, android.content.res.Resources p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public java.lang.String getSettingsActivity() { return null; }
    public android.util.ArrayMap<java.lang.String, java.lang.Long> getCompatibilityPackages() { return null; }
    public java.lang.String toString() { return null; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
}
