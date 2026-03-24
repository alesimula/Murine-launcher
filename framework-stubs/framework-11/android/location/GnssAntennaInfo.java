package android.location;

public final class GnssAntennaInfo implements android.os.Parcelable {
    private final double mCarrierFrequencyMHz = 0.0;
    private final android.location.GnssAntennaInfo.PhaseCenterOffset mPhaseCenterOffset = null;
    private final android.location.GnssAntennaInfo.SphericalCorrections mPhaseCenterVariationCorrections = null;
    private final android.location.GnssAntennaInfo.SphericalCorrections mSignalGainCorrections = null;
    public static final android.os.Parcelable.Creator<android.location.GnssAntennaInfo> CREATOR = null;
    private GnssAntennaInfo(double p0, android.location.GnssAntennaInfo.PhaseCenterOffset p1, android.location.GnssAntennaInfo.SphericalCorrections p2, android.location.GnssAntennaInfo.SphericalCorrections p3) {}
    public double getCarrierFrequencyMHz() { return 0.0; }
    public android.location.GnssAntennaInfo.PhaseCenterOffset getPhaseCenterOffset() { return null; }
    public android.location.GnssAntennaInfo.SphericalCorrections getPhaseCenterVariationCorrections() { return null; }
    public android.location.GnssAntennaInfo.SphericalCorrections getSignalGainCorrections() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static class Builder {
        private double mCarrierFrequencyMHz;
        private android.location.GnssAntennaInfo.PhaseCenterOffset mPhaseCenterOffset;
        private android.location.GnssAntennaInfo.SphericalCorrections mPhaseCenterVariationCorrections;
        private android.location.GnssAntennaInfo.SphericalCorrections mSignalGainCorrections;
        public Builder() {}
        public android.location.GnssAntennaInfo.Builder setCarrierFrequencyMHz(double p0) { return null; }
        public android.location.GnssAntennaInfo.Builder setPhaseCenterOffset(android.location.GnssAntennaInfo.PhaseCenterOffset p0) { return null; }
        public android.location.GnssAntennaInfo.Builder setPhaseCenterVariationCorrections(android.location.GnssAntennaInfo.SphericalCorrections p0) { return null; }
        public android.location.GnssAntennaInfo.Builder setSignalGainCorrections(android.location.GnssAntennaInfo.SphericalCorrections p0) { return null; }
        public android.location.GnssAntennaInfo build() { return null; }
    }

    public static interface Listener {
        public void onGnssAntennaInfoReceived(java.util.List<android.location.GnssAntennaInfo> p0);
    }

    public static final class PhaseCenterOffset implements android.os.Parcelable {
        private final double mOffsetXMm = 0.0;
        private final double mOffsetXUncertaintyMm = 0.0;
        private final double mOffsetYMm = 0.0;
        private final double mOffsetYUncertaintyMm = 0.0;
        private final double mOffsetZMm = 0.0;
        private final double mOffsetZUncertaintyMm = 0.0;
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
    }

    public static final class SphericalCorrections implements android.os.Parcelable {
        private final double[][] mCorrections = null;
        private final double[][] mCorrectionUncertainties = null;
        private final double mDeltaTheta = 0.0;
        private final double mDeltaPhi = 0.0;
        private final int mNumRows = 0;
        private final int mNumColumns = 0;
        public static final android.os.Parcelable.Creator<android.location.GnssAntennaInfo.SphericalCorrections> CREATOR = null;
        public SphericalCorrections(double[][] p0, double[][] p1) {}
        SphericalCorrections(android.os.Parcel p0) {}
        public double[][] getCorrectionsArray() { return null; }
        public double[][] getCorrectionUncertaintiesArray() { return null; }
        public double getDeltaTheta() { return 0.0; }
        public double getDeltaPhi() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }
}
