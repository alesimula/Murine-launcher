package android.media.audio.common;

public class HeadTracking implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.HeadTracking> CREATOR = null;
    public HeadTracking() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    public static @interface ConnectionMode {
        public static final byte FRAMEWORK_PROCESSED = 0;
        public static final byte DIRECT_TO_SENSOR_SW = 1;
        public static final byte DIRECT_TO_SENSOR_TUNNEL = 2;
    }

    public static @interface Mode {
        public static final byte OTHER = 0;
        public static final byte DISABLED = 1;
        public static final byte RELATIVE_WORLD = 2;
        public static final byte RELATIVE_SCREEN = 3;
    }

    public static final class SensorData implements android.os.Parcelable {
        public static final int headToStage = 0;
        public static final android.os.Parcelable.Creator<android.media.audio.common.HeadTracking.SensorData> CREATOR = null;
        public SensorData() {}
        public int getTag() { return 0; }
        public static android.media.audio.common.HeadTracking.SensorData headToStage(float[] p0) { return null; }
        public float[] getHeadToStage() { return null; }
        public void setHeadToStage(float[] p0) {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }

        public static @interface Tag {
            public static final int headToStage = 0;
        }
    }
}
