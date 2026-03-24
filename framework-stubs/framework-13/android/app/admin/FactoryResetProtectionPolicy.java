package android.app.admin;

public final class FactoryResetProtectionPolicy implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.admin.FactoryResetProtectionPolicy> CREATOR = null;
    public java.util.List<java.lang.String> getFactoryResetProtectionAccounts() { return null; }
    public boolean isFactoryResetProtectionEnabled() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public static android.app.admin.FactoryResetProtectionPolicy readFromXml(android.util.TypedXmlPullParser p0) { return null; }
    public void writeToXml(android.util.TypedXmlSerializer p0) throws java.io.IOException {}
    public boolean isNotEmpty() { return false; }
    public void dump(android.util.IndentingPrintWriter p0) {}

    public static class Builder {
        public Builder() {}
        public android.app.admin.FactoryResetProtectionPolicy.Builder setFactoryResetProtectionAccounts(java.util.List<java.lang.String> p0) { return null; }
        public android.app.admin.FactoryResetProtectionPolicy.Builder setFactoryResetProtectionEnabled(boolean p0) { return null; }
        public android.app.admin.FactoryResetProtectionPolicy build() { return null; }
    }
}
