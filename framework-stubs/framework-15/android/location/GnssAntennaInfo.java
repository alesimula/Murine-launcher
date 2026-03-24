package android.location;

public final class GnssAntennaInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GnssAntennaInfo> CREATOR = null;
    public double getCarrierFrequencyMHz() { return 0.0; }
    @android.annotation.NonNull
    public android.location.GnssAntennaInfo.PhaseCenterOffset getPhaseCenterOffset() { return null; }
    @android.annotation.Nullable
    public android.location.GnssAntennaInfo.SphericalCorrections getPhaseCenterVariationCorrections() { return null; }
    @android.annotation.Nullable
    public android.location.GnssAntennaInfo.SphericalCorrections getSignalGainCorrections() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static class Builder {
        @java.lang.Deprecated
        public Builder() {}
        public Builder(double p0, android.location.GnssAntennaInfo.PhaseCenterOffset p1) {}
        public Builder(android.location.GnssAntennaInfo p0) {}
        @android.annotation.NonNull
        public android.location.GnssAntennaInfo.Builder setCarrierFrequencyMHz(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAntennaInfo.Builder setPhaseCenterOffset(android.location.GnssAntennaInfo.PhaseCenterOffset p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAntennaInfo.Builder setPhaseCenterVariationCorrections(android.location.GnssAntennaInfo.SphericalCorrections p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAntennaInfo.Builder setSignalGainCorrections(android.location.GnssAntennaInfo.SphericalCorrections p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAntennaInfo build() { return null; }
    }

    public static interface Listener {
        public void onGnssAntennaInfoReceived(java.util.List<android.location.GnssAntennaInfo> p0);
    }

    public static final class PhaseCenterOffset implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.GnssAntennaInfo.PhaseCenterOffset> CREATOR = null;
        public PhaseCenterOffset(double p0, double p1, double p2, double p3, double p4, double p5) {}
        public double getXOffsetMm() { return 0.0; }
        public double getXOffsetUncertaintyMm() { return 0.0; }
        public double getYOffsetMm() { return 0.0; }
        public double getYOffsetUncertaintyMm() { return 0.0; }
        public double getZOffsetMm() { return 0.0; }
        public double getZOffsetUncertaintyMm() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static final class SphericalCorrections implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.GnssAntennaInfo.SphericalCorrections> CREATOR = null;
        public SphericalCorrections(double[][] p0, double[][] p1) {}
        @android.annotation.NonNull
        public double[][] getCorrectionsArray() { return null; }
        @android.annotation.NonNull
        public double[][] getCorrectionUncertaintiesArray() { return null; }
        public double getDeltaTheta() { return 0.0; }
        public double getDeltaPhi() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
