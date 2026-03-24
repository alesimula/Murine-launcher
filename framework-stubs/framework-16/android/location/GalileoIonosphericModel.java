package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class GalileoIonosphericModel implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GalileoIonosphericModel> CREATOR = null;
    public double getAi0() { return 0.0; }
    public double getAi1() { return 0.0; }
    public double getAi2() { return 0.0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.GalileoIonosphericModel.Builder setAi0(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoIonosphericModel.Builder setAi1(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoIonosphericModel.Builder setAi2(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoIonosphericModel build() { return null; }
    }
}
