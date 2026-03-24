package android.app.admin;

public final class FactoryResetProtectionPolicy implements android.os.Parcelable {
    private static final java.lang.String LOG_TAG = "FactoryResetProtectionPolicy";
    private static final java.lang.String KEY_FACTORY_RESET_PROTECTION_ACCOUNT = "factory_reset_protection_account";
    private static final java.lang.String KEY_FACTORY_RESET_PROTECTION_ENABLED = "factory_reset_protection_enabled";
    private static final java.lang.String ATTR_VALUE = "value";
    private final java.util.List<java.lang.String> mFactoryResetProtectionAccounts = null;
    private final boolean mFactoryResetProtectionEnabled = false;
    public static final android.os.Parcelable.Creator<android.app.admin.FactoryResetProtectionPolicy> CREATOR = null;
    private FactoryResetProtectionPolicy(java.util.List<java.lang.String> p0, boolean p1) {}
    public java.util.List<java.lang.String> getFactoryResetProtectionAccounts() { return null; }
    public boolean isFactoryResetProtectionEnabled() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public static android.app.admin.FactoryResetProtectionPolicy readFromXml(android.util.TypedXmlPullParser p0) { return null; }
    public void writeToXml(android.util.TypedXmlSerializer p0) throws java.io.IOException {}
    public boolean isNotEmpty() { return false; }

    public static class Builder {
        private java.util.List<java.lang.String> mFactoryResetProtectionAccounts;
        private boolean mFactoryResetProtectionEnabled;
        public Builder() {}
        public android.app.admin.FactoryResetProtectionPolicy.Builder setFactoryResetProtectionAccounts(java.util.List<java.lang.String> p0) { return null; }
        public android.app.admin.FactoryResetProtectionPolicy.Builder setFactoryResetProtectionEnabled(boolean p0) { return null; }
        public android.app.admin.FactoryResetProtectionPolicy build() { return null; }
    }
}
