package android.service.autofill;

public final class AutofillServiceInfo {
    public AutofillServiceInfo(android.content.Context p0, android.content.ComponentName p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException {}
    public AutofillServiceInfo(android.content.Context p0, android.content.pm.ServiceInfo p1) {}
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public java.lang.String getSettingsActivity() { return null; }
    public java.lang.String getPasswordsActivity() { return null; }
    public android.util.ArrayMap<java.lang.String, java.lang.Long> getCompatibilityPackages() { return null; }
    public boolean isInlineSuggestionsEnabled() { return false; }
    public static java.util.List<android.service.autofill.AutofillServiceInfo> getAvailableServices(android.content.Context p0, int p1) { return null; }
    public java.lang.String toString() { return null; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}

    public static final class TestDataBuilder {
        public TestDataBuilder() {}
        public android.service.autofill.AutofillServiceInfo.TestDataBuilder setPasswordsActivity(java.lang.String p0) { return null; }
        public android.service.autofill.AutofillServiceInfo build() { return null; }
    }
}
