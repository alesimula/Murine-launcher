package android.location;

public final class GnssAutomaticGainControl implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GnssAutomaticGainControl> CREATOR = null;
    public double getLevelDb() { return 0.0; }
    public int getConstellationType() { return 0; }
    public long getCarrierFrequencyHz() { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.location.GnssAutomaticGainControl p0) {}
        @android.annotation.NonNull
        public android.location.GnssAutomaticGainControl.Builder setLevelDb(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAutomaticGainControl.Builder setConstellationType(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAutomaticGainControl.Builder setCarrierFrequencyHz(long p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAutomaticGainControl build() { return null; }
    }
}
