package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class KeplerianOrbitModel implements android.os.Parcelable {
    android.location.KeplerianOrbitModel.SecondOrderHarmonicPerturbation mSecondOrderHarmonicPerturbation;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.KeplerianOrbitModel> CREATOR = null;
    public double getRootA() { return 0.0; }
    public double getEccentricity() { return 0.0; }
    public double getI0() { return 0.0; }
    public double getIDot() { return 0.0; }
    public double getOmega() { return 0.0; }
    public double getOmega0() { return 0.0; }
    public double getOmegaDot() { return 0.0; }
    public double getM0() { return 0.0; }
    public double getDeltaN() { return 0.0; }
    @android.annotation.NonNull
    public android.location.KeplerianOrbitModel.SecondOrderHarmonicPerturbation getSecondOrderHarmonicPerturbation() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.KeplerianOrbitModel.Builder setRootA(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KeplerianOrbitModel.Builder setEccentricity(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KeplerianOrbitModel.Builder setI0(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KeplerianOrbitModel.Builder setIDot(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KeplerianOrbitModel.Builder setOmega(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KeplerianOrbitModel.Builder setOmega0(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KeplerianOrbitModel.Builder setOmegaDot(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KeplerianOrbitModel.Builder setM0(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KeplerianOrbitModel.Builder setDeltaN(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.KeplerianOrbitModel.Builder setSecondOrderHarmonicPerturbation(android.location.KeplerianOrbitModel.SecondOrderHarmonicPerturbation p0) { return null; }
        @android.annotation.NonNull
        public android.location.KeplerianOrbitModel build() { return null; }
    }

    public static final class SecondOrderHarmonicPerturbation implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.KeplerianOrbitModel.SecondOrderHarmonicPerturbation> CREATOR = null;
        public double getCic() { return 0.0; }
        public double getCis() { return 0.0; }
        public double getCrc() { return 0.0; }
        public double getCrs() { return 0.0; }
        public double getCuc() { return 0.0; }
        public double getCus() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.location.KeplerianOrbitModel.SecondOrderHarmonicPerturbation.Builder setCic(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.KeplerianOrbitModel.SecondOrderHarmonicPerturbation.Builder setCis(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.KeplerianOrbitModel.SecondOrderHarmonicPerturbation.Builder setCrc(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.KeplerianOrbitModel.SecondOrderHarmonicPerturbation.Builder setCrs(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.KeplerianOrbitModel.SecondOrderHarmonicPerturbation.Builder setCuc(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.KeplerianOrbitModel.SecondOrderHarmonicPerturbation.Builder setCus(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.KeplerianOrbitModel.SecondOrderHarmonicPerturbation build() { return null; }
        }
    }
}
