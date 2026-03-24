package android.adservices.common;

public final class AdData implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.common.AdData> CREATOR = null;
    AdData() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getAdCounterKeys() { return null; }
    @android.annotation.Nullable
    public android.adservices.common.AdFilters getAdFilters() { return null; }
    @android.annotation.Nullable
    public java.lang.String getAdRenderId() { return null; }
    @android.annotation.NonNull
    public java.lang.String getMetadata() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getRenderUri() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.common.AdData build() { return null; }
        @android.annotation.NonNull
        public android.adservices.common.AdData.Builder setAdCounterKeys(java.util.Set<java.lang.Integer> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.AdData.Builder setAdFilters(android.adservices.common.AdFilters p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.AdData.Builder setAdRenderId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.AdData.Builder setMetadata(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.AdData.Builder setRenderUri(android.net.Uri p0) { return null; }
    }
}
