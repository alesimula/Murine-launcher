package android.location;

@android.annotation.SystemApi
public final class CorrelationVector implements android.os.Parcelable {
    private final double mSamplingWidthMeters = 0.0;
    private final double mSamplingStartMeters = 0.0;
    private final double mFrequencyOffsetMetersPerSecond = 0.0;
    private final int[] mMagnitude = null;
    public static final android.os.Parcelable.Creator<android.location.CorrelationVector> CREATOR = null;
    public double getSamplingWidthMeters() { return 0.0; }
    public double getSamplingStartMeters() { return 0.0; }
    public double getFrequencyOffsetMetersPerSecond() { return 0.0; }
    public int[] getMagnitude() { return null; }
    private CorrelationVector(android.location.CorrelationVector.Builder p0) {}
    private CorrelationVector(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        private double mSamplingWidthMeters;
        private double mSamplingStartMeters;
        private double mFrequencyOffsetMetersPerSecond;
        private int[] mMagnitude;
        public Builder() {}
        public android.location.CorrelationVector.Builder setSamplingWidthMeters(double p0) { return null; }
        public android.location.CorrelationVector.Builder setSamplingStartMeters(double p0) { return null; }
        public android.location.CorrelationVector.Builder setFrequencyOffsetMetersPerSecond(double p0) { return null; }
        public android.location.CorrelationVector.Builder setMagnitude(int[] p0) { return null; }
        public android.location.CorrelationVector build() { return null; }
    }
}
