package android.media;

public final class ApplicationMediaCapabilities implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.ApplicationMediaCapabilities> CREATOR = null;
    public boolean isVideoMimeTypeSupported(java.lang.String p0) { return false; }
    public boolean isHdrTypeSupported(java.lang.String p0) { return false; }
    public boolean isFormatSpecified(java.lang.String p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSupportedVideoMimeTypes() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUnsupportedVideoMimeTypes() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSupportedHdrTypes() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUnsupportedHdrTypes() { return null; }
    @android.annotation.NonNull
    public static android.media.ApplicationMediaCapabilities createFromXml(org.xmlpull.v1.XmlPullParser p0) { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.media.ApplicationMediaCapabilities build() { return null; }
        @android.annotation.NonNull
        public android.media.ApplicationMediaCapabilities.Builder addSupportedVideoMimeType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.ApplicationMediaCapabilities.Builder addUnsupportedVideoMimeType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.ApplicationMediaCapabilities.Builder addSupportedHdrType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.ApplicationMediaCapabilities.Builder addUnsupportedHdrType(java.lang.String p0) { return null; }
    }
}
