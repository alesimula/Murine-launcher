package android.media;

public final class MediaRoute2ProviderInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.MediaRoute2ProviderInfo> CREATOR = null;
    final java.lang.String mUniqueId = null;
    final android.util.ArrayMap<java.lang.String, android.media.MediaRoute2Info> mRoutes = null;
    MediaRoute2ProviderInfo(android.media.MediaRoute2ProviderInfo.Builder p0) {}
    MediaRoute2ProviderInfo(android.os.Parcel p0) {}
    public boolean isValid() { return false; }
    public java.lang.String getUniqueId() { return null; }
    public android.media.MediaRoute2Info getRoute(java.lang.String p0) { return null; }
    public java.util.Collection<android.media.MediaRoute2Info> getRoutes() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static final class Builder {
        final android.util.ArrayMap<java.lang.String, android.media.MediaRoute2Info> mRoutes = null;
        java.lang.String mUniqueId;
        public Builder() {}
        public Builder(android.media.MediaRoute2ProviderInfo p0) {}
        public android.media.MediaRoute2ProviderInfo.Builder setUniqueId(java.lang.String p0, java.lang.String p1) { return null; }
        public android.media.MediaRoute2ProviderInfo.Builder setSystemRouteProvider(boolean p0) { return null; }
        public android.media.MediaRoute2ProviderInfo.Builder addRoute(android.media.MediaRoute2Info p0) { return null; }
        public android.media.MediaRoute2ProviderInfo.Builder addRoutes(java.util.Collection<android.media.MediaRoute2Info> p0) { return null; }
        public android.media.MediaRoute2ProviderInfo build() { return null; }
    }
}
