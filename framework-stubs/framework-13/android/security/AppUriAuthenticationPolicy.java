package android.security;

public final class AppUriAuthenticationPolicy implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.AppUriAuthenticationPolicy> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public java.util.Map<java.lang.String, java.util.Map<android.net.Uri, java.lang.String>> getAppAndUriMappings() { return null; }
    public static android.security.AppUriAuthenticationPolicy readFromXml(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public void writeToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    public java.util.Set<java.lang.String> getAliases() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        public android.security.AppUriAuthenticationPolicy.Builder addAppAndUriMapping(java.lang.String p0, android.net.Uri p1, java.lang.String p2) { return null; }
        public android.security.AppUriAuthenticationPolicy.Builder addAppAndUriMapping(java.lang.String p0, android.security.UrisToAliases p1) { return null; }
        public android.security.AppUriAuthenticationPolicy build() { return null; }
    }
}
