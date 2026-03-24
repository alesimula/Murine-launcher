package android.proximity;

public final class RangingParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.proximity.RangingParams> CREATOR = null;
    public double getDefaultThresholdMeters() { return 0.0; }
    public int getDefaultTimeoutMillis() { return 0; }
    public double getThresholdMeters() { return 0.0; }
    public int getTimeoutMillis() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.proximity.RangingParams p0) {}
        @android.annotation.NonNull
        public android.proximity.RangingParams.Builder setThresholdMeters(double p0) { return null; }
        @android.annotation.NonNull
        public android.proximity.RangingParams.Builder setTimeoutMillis(int p0) { return null; }
        @android.annotation.NonNull
        public android.proximity.RangingParams build() { return null; }
    }
}
