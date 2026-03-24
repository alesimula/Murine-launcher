package android.media;

public final class VolumeShaper implements java.lang.AutoCloseable {
    VolumeShaper(android.media.VolumeShaper.Configuration p0, android.media.PlayerBase p1) {}
    int getId() { return 0; }
    public void apply(android.media.VolumeShaper.Operation p0) {}
    public void replace(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1, boolean p2) {}
    public float getVolume() { return 0.0f; }
    public void close() {}
    protected void finalize() {}

    public static final class Configuration implements android.os.Parcelable {
        static final int TYPE_ID = 0;
        static final int TYPE_SCALE = 1;
        public static final int INTERPOLATOR_TYPE_STEP = 0;
        public static final int INTERPOLATOR_TYPE_LINEAR = 1;
        public static final int INTERPOLATOR_TYPE_CUBIC = 2;
        public static final int INTERPOLATOR_TYPE_CUBIC_MONOTONIC = 3;
        public static final int OPTION_FLAG_VOLUME_IN_DBFS = 1;
        public static final int OPTION_FLAG_CLOCK_TIME = 2;
        public static final android.media.VolumeShaper.Configuration LINEAR_RAMP = null;
        public static final android.media.VolumeShaper.Configuration CUBIC_RAMP = null;
        public static final android.media.VolumeShaper.Configuration SINE_RAMP = null;
        public static final android.media.VolumeShaper.Configuration SCURVE_RAMP = null;
        public static final android.os.Parcelable.Creator<android.media.VolumeShaper.Configuration> CREATOR = null;
        public static int getMaximumCurvePoints() { return 0; }
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public android.media.VolumeShaperConfiguration toParcelable() { return null; }
        public static android.media.VolumeShaper.Configuration fromParcelable(android.media.VolumeShaperConfiguration p0) { return null; }
        public Configuration(int p0) {}
        public int getType() { return 0; }
        public int getId() { return 0; }
        public int getInterpolatorType() { return 0; }
        public int getOptionFlags() { return 0; }
        int getAllOptionFlags() { return 0; }
        public long getDuration() { return 0L; }
        public float[] getTimes() { return null; }
        public float[] getVolumes() { return null; }

        public static final class Builder {
            public Builder() {}
            public Builder(android.media.VolumeShaper.Configuration p0) {}
            public android.media.VolumeShaper.Configuration.Builder setId(int p0) { return null; }
            public android.media.VolumeShaper.Configuration.Builder setInterpolatorType(int p0) { return null; }
            public android.media.VolumeShaper.Configuration.Builder setOptionFlags(int p0) { return null; }
            public android.media.VolumeShaper.Configuration.Builder setDuration(long p0) { return null; }
            public android.media.VolumeShaper.Configuration.Builder setCurve(float[] p0, float[] p1) { return null; }
            public android.media.VolumeShaper.Configuration.Builder reflectTimes() { return null; }
            public android.media.VolumeShaper.Configuration.Builder invertVolumes() { return null; }
            public android.media.VolumeShaper.Configuration.Builder scaleToEndVolume(float p0) { return null; }
            public android.media.VolumeShaper.Configuration.Builder scaleToStartVolume(float p0) { return null; }
            public android.media.VolumeShaper.Configuration build() { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface InterpolatorType {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface OptionFlag {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Type {
        }
    }

    public static final class Operation implements android.os.Parcelable {
        public static final android.media.VolumeShaper.Operation PLAY = null;
        public static final android.media.VolumeShaper.Operation REVERSE = null;
        public static final android.os.Parcelable.Creator<android.media.VolumeShaper.Operation> CREATOR = null;
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public android.media.VolumeShaperOperation toParcelable() { return null; }
        public static android.media.VolumeShaper.Operation fromParcelable(android.media.VolumeShaperOperation p0) { return null; }

        public static final class Builder {
            int mFlags;
            int mReplaceId;
            float mXOffset;
            public Builder() {}
            public Builder(android.media.VolumeShaper.Operation p0) {}
            public android.media.VolumeShaper.Operation.Builder replace(int p0, boolean p1) { return null; }
            public android.media.VolumeShaper.Operation.Builder defer() { return null; }
            public android.media.VolumeShaper.Operation.Builder terminate() { return null; }
            public android.media.VolumeShaper.Operation.Builder reverse() { return null; }
            public android.media.VolumeShaper.Operation.Builder createIfNeeded() { return null; }
            public android.media.VolumeShaper.Operation.Builder setXOffset(float p0) { return null; }
            public android.media.VolumeShaper.Operation build() { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Flag {
        }
    }

    public static final class State implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.VolumeShaper.State> CREATOR = null;
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public android.media.VolumeShaperState toParcelable() { return null; }
        public static android.media.VolumeShaper.State fromParcelable(android.media.VolumeShaperState p0) { return null; }
        State(float p0, float p1) {}
        public float getVolume() { return 0.0f; }
        public float getXOffset() { return 0.0f; }
    }
}
