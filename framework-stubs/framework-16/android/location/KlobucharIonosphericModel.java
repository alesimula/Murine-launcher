package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class KlobucharIonosphericModel implements android.os.Parcelable {
    double mAlpha0;
    double mAlpha1;
    double mAlpha2;
    double mAlpha3;
    double mBeta0;
    double mBeta1;
    double mBeta2;
    double mBeta3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.KlobucharIonosphericModel> CREATOR = null;
    public double getAlpha0() { return 0.0; }
    public double getAlpha1() { return 0.0; }
    public double getAlpha2() { return 0.0; }
    public double getAlpha3() { return 0.0; }
    public double getBeta0() { return 0.0; }
    public double getBeta1() { return 0.0; }
    public double getBeta2() { return 0.0; }
    public double getBeta3() { return 0.0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.KlobucharIonosphericModel.Builder setAlpha0(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KlobucharIonosphericModel.Builder setAlpha1(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KlobucharIonosphericModel.Builder setAlpha2(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KlobucharIonosphericModel.Builder setAlpha3(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KlobucharIonosphericModel.Builder setBeta0(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KlobucharIonosphericModel.Builder setBeta1(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KlobucharIonosphericModel.Builder setBeta2(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KlobucharIonosphericModel.Builder setBeta3(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KlobucharIonosphericModel build() { return null; }
    }
}
