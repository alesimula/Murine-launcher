package android.location;

@android.annotation.SystemApi
public final class CorrelationVector implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.CorrelationVector> CREATOR = null;
    public double getSamplingWidthMeters() { return 0.0; }
    public double getSamplingStartMeters() { return 0.0; }
    public double getFrequencyOffsetMetersPerSecond() { return 0.0; }
    @android.annotation.NonNull
    public int[] getMagnitude() { return null; }
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.CorrelationVector.Builder setSamplingWidthMeters(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.CorrelationVector.Builder setSamplingStartMeters(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.CorrelationVector.Builder setFrequencyOffsetMetersPerSecond(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.CorrelationVector.Builder setMagnitude(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.location.CorrelationVector build() { return null; }
    }
}
