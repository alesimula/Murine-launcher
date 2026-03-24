package android.location;

@android.annotation.SystemApi
public final class GnssExcessPathInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GnssExcessPathInfo> CREATOR = null;
    public int getFlags() { return 0; }
    public boolean hasExcessPathLength() { return false; }
    public float getExcessPathLengthMeters() { return 0.0f; }
    public boolean hasExcessPathLengthUncertainty() { return false; }
    public float getExcessPathLengthUncertaintyMeters() { return 0.0f; }
    public boolean hasReflectingPlane() { return false; }
    @android.annotation.NonNull
    public android.location.GnssReflectingPlane getReflectingPlane() { return null; }
    public boolean hasAttenuation() { return false; }
    public float getAttenuationDb() { return 0.0f; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.GnssExcessPathInfo.Builder setExcessPathLengthMeters(float p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssExcessPathInfo.Builder clearExcessPathLengthMeters() { return null; }
        @android.annotation.NonNull
        public android.location.GnssExcessPathInfo.Builder setExcessPathLengthUncertaintyMeters(float p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssExcessPathInfo.Builder clearExcessPathLengthUncertaintyMeters() { return null; }
        @android.annotation.NonNull
        public android.location.GnssExcessPathInfo.Builder setReflectingPlane(android.location.GnssReflectingPlane p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssExcessPathInfo.Builder setAttenuationDb(float p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssExcessPathInfo.Builder clearAttenuationDb() { return null; }
        @android.annotation.NonNull
        public android.location.GnssExcessPathInfo build() { return null; }
    }
}
