package android.adservices.common;

public final class AdData implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.common.AdData> CREATOR = null;
    AdData() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.net.Uri getRenderUri() { return null; }
    @android.annotation.NonNull
    public java.lang.String getMetadata() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.common.AdData.Builder setRenderUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.AdData.Builder setMetadata(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.AdData build() { return null; }
    }
}
