package android.app.admin;

public final class PreferentialNetworkServiceConfig implements android.os.Parcelable {
    final boolean mIsEnabled = false;
    final int mNetworkId = 0;
    final boolean mAllowFallbackToDefaultConnection = false;
    final int[] mIncludedUids = null;
    final int[] mExcludedUids = null;
    public static final android.app.admin.PreferentialNetworkServiceConfig DEFAULT = null;
    public static final int PREFERENTIAL_NETWORK_ID_1 = 1;
    public static final int PREFERENTIAL_NETWORK_ID_2 = 2;
    public static final int PREFERENTIAL_NETWORK_ID_3 = 3;
    public static final int PREFERENTIAL_NETWORK_ID_4 = 4;
    public static final int PREFERENTIAL_NETWORK_ID_5 = 5;
    public static final android.os.Parcelable.Creator<android.app.admin.PreferentialNetworkServiceConfig> CREATOR = null;
    public boolean isEnabled() { return false; }
    public boolean isFallbackToDefaultConnectionAllowed() { return false; }
    public int[] getIncludedUids() { return null; }
    public int[] getExcludedUids() { return null; }
    public int getNetworkId() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.app.admin.PreferentialNetworkServiceConfig getPreferentialNetworkServiceConfig(android.util.TypedXmlPullParser p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public void writeToXml(android.util.TypedXmlSerializer p0) throws java.io.IOException {}
    public void dump(android.util.IndentingPrintWriter p0) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        boolean mIsEnabled;
        int mNetworkId;
        boolean mAllowFallbackToDefaultConnection;
        int[] mIncludedUids;
        int[] mExcludedUids;
        public Builder() {}
        public android.app.admin.PreferentialNetworkServiceConfig.Builder setEnabled(boolean p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.app.admin.PreferentialNetworkServiceConfig.Builder setFallbackToDefaultConnectionAllowed(boolean p0) { return null; }
        public android.app.admin.PreferentialNetworkServiceConfig.Builder setIncludedUids(int[] p0) { return null; }
        public android.app.admin.PreferentialNetworkServiceConfig.Builder setExcludedUids(int[] p0) { return null; }
        public android.app.admin.PreferentialNetworkServiceConfig build() { return null; }
        public android.app.admin.PreferentialNetworkServiceConfig.Builder setNetworkId(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PreferentialNetworkPreferenceId {
    }
}
