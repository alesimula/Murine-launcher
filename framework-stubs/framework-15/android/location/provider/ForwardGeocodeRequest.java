package android.location.provider;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.new_geocoder")
public final class ForwardGeocodeRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.provider.ForwardGeocodeRequest> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String getLocationName() { return null; }
    public double getLowerLeftLatitude() { return 0.0; }
    public double getLowerLeftLongitude() { return 0.0; }
    public double getUpperRightLatitude() { return 0.0; }
    public double getUpperRightLongitude() { return 0.0; }
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
        public Builder(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, java.util.Locale p6, int p7, java.lang.String p8) {}
        @android.annotation.NonNull
        public android.location.provider.ForwardGeocodeRequest.Builder setCallingAttributionTag(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.location.provider.ForwardGeocodeRequest build() { return null; }
    }
}
