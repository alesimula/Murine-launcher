package android.security;

public final class UrisToAliases implements android.os.Parcelable {
    private static final java.lang.String KEY_AUTHENTICATION_POLICY_URI_TO_ALIAS = "authentication_policy_uri_to_alias";
    private static final java.lang.String KEY_AUTHENTICATION_POLICY_URI = "policy_uri";
    private static final java.lang.String KEY_AUTHENTICATION_POLICY_ALIAS = "policy_alias";
    private final java.util.Map<android.net.Uri, java.lang.String> mUrisToAliases = null;
    public static final android.os.Parcelable.Creator<android.security.UrisToAliases> CREATOR = null;
    public UrisToAliases() {}
    private UrisToAliases(java.util.Map<android.net.Uri, java.lang.String> p0) {}
    public java.util.Map<android.net.Uri, java.lang.String> getUrisToAliases() { return null; }
    public void addUriToAlias(android.net.Uri p0, java.lang.String p1) {}
    public static android.security.UrisToAliases readFromXml(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public void writeToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
