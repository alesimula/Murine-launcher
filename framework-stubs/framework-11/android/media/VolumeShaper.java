package android.media;

public final class VolumeShaper implements java.lang.AutoCloseable {
    private int mId;
    private final java.lang.ref.WeakReference<android.media.PlayerBase> mWeakPlayerBase = null;
    VolumeShaper(android.media.VolumeShaper.Configuration p0, android.media.PlayerBase p1) {}
    int getId() { return 0; }
    public void apply(android.media.VolumeShaper.Operation p0) {}
    public void replace(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1, boolean p2) {}
    public float getVolume() { return 0.0f; }
    public void close() {}
    protected void finalize() {}
    private int applyPlayer(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1) { return 0; }
    private android.media.VolumeShaper.State getStatePlayer(int p0) { return null; }

    public static final class Configuration implements android.os.Parcelable {
        private static final int MAXIMUM_CURVE_POINTS = 16;
        static final int TYPE_ID = 0;
        static final int TYPE_SCALE = 1;
        public static final int INTERPOLATOR_TYPE_STEP = 0;
        public static final int INTERPOLATOR_TYPE_LINEAR = 1;
        public static final int INTERPOLATOR_TYPE_CUBIC = 2;
        public static final int INTERPOLATOR_TYPE_CUBIC_MONOTONIC = 3;
        public static final int OPTION_FLAG_VOLUME_IN_DBFS = 1;
        public static final int OPTION_FLAG_CLOCK_TIME = 2;
        private static final int OPTION_FLAG_PUBLIC_ALL = 3;
        public static final android.media.VolumeShaper.Configuration LINEAR_RAMP = null;
        public static final android.media.VolumeShaper.Configuration CUBIC_RAMP = null;
        public static final android.media.VolumeShaper.Configuration SINE_RAMP = null;
        public static final android.media.VolumeShaper.Configuration SCURVE_RAMP = null;
        private final int mType = 0;
        private final int mId = 0;
        private final int mOptionFlags = 0;
        private final double mDurationMs = 0.0;
        private final int mInterpolatorType = 0;
        private final float[] mTimes = null;
        private final float[] mVolumes = null;
        public static final android.os.Parcelable.Creator<android.media.VolumeShaper.Configuration> CREATOR = null;
        public static int getMaximumCurvePoints() { return 0; }
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public Configuration(int p0) {}
        private Configuration(int p0, int p1, int p2, double p3, int p4, float[] p5, float[] p6) {}
        public int getType() { return 0; }
        public int getId() { return 0; }
        public int getInterpolatorType() { return 0; }
        public int getOptionFlags() { return 0; }
        int getAllOptionFlags() { return 0; }
        public long getDuration() { return 0L; }
        public float[] getTimes() { return null; }
        public float[] getVolumes() { return null; }
        private static java.lang.String checkCurveForErrors(float[] p0, float[] p1, boolean p2) { return null; }
        private static void checkCurveForErrorsAndThrowException(float[] p0, float[] p1, boolean p2, boolean p3) {}
        private static void checkValidVolumeAndThrowException(float p0, boolean p1) {}
        private static void clampVolume(float[] p0, boolean p1) {}

        public static final class Builder {
            private int mType;
            private int mId;
            private int mInterpolatorType;
            private int mOptionFlags;
            private double mDurationMs;
            private float[] mTimes;
            private float[] mVolumes;
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
        private static final int FLAG_NONE = 0;
        private static final int FLAG_REVERSE = 1;
        private static final int FLAG_TERMINATE = 2;
        private static final int FLAG_JOIN = 4;
        private static final int FLAG_DEFER = 8;
        private static final int FLAG_CREATE_IF_NEEDED = 16;
        private static final int FLAG_PUBLIC_ALL = 3;
        private final int mFlags = 0;
        private final int mReplaceId = 0;
        private final float mXOffset = 0.0f;
        public static final android.os.Parcelable.Creator<android.media.VolumeShaper.Operation> CREATOR = null;
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private Operation(int p0, int p1, float p2) {}

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
            private android.media.VolumeShaper.Operation.Builder setFlags(int p0) { return null; }
            public android.media.VolumeShaper.Operation build() { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Flag {
        }
    }

    public static final class State implements android.os.Parcelable {
        private float mVolume;
        private float mXOffset;
        public static final android.os.Parcelable.Creator<android.media.VolumeShaper.State> CREATOR = null;
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        State(float p0, float p1) {}
        public float getVolume() { return 0.0f; }
        public float getXOffset() { return 0.0f; }
    }
}
