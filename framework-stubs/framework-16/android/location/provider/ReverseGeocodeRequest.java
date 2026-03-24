package android.location.provider;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.new_geocoder")
public final class ReverseGeocodeRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.provider.ReverseGeocodeRequest> CREATOR = null;
    public double getLatitude() { return 0.0; }
    public double getLongitude() { return 0.0; }
    public int getMaxResults() { return 0; }
    @android.annotation.NonNull
    public java.util.Locale getLocale() { return null; }
    public int getCallingUid() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getCallingPackage() { return null; }
    @android.annotation.Nullable
    public java.lang.String getCallingAttributionTag() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(double p0, double p1, int p2, java.util.Locale p3, int p4, java.lang.String p5) {}
        @android.annotation.NonNull
        public android.location.provider.ReverseGeocodeRequest.Builder setCallingAttributionTag(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.location.provider.ReverseGeocodeRequest build() { return null; }
    }
}
