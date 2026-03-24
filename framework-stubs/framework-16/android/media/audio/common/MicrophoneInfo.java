package android.media.audio.common;

public class MicrophoneInfo implements android.os.Parcelable {
    public java.lang.String id;
    public android.media.audio.common.AudioDevice device;
    public int location;
    public int group;
    public int indexInTheGroup;
    public android.media.audio.common.MicrophoneInfo.Sensitivity sensitivity;
    public int directionality;
    public android.media.audio.common.MicrophoneInfo.FrequencyResponsePoint[] frequencyResponse;
    public android.media.audio.common.MicrophoneInfo.Coordinate position;
    public android.media.audio.common.MicrophoneInfo.Coordinate orientation;
    public static final android.os.Parcelable.Creator<android.media.audio.common.MicrophoneInfo> CREATOR = null;
    public static final int GROUP_UNKNOWN = -1;
    public static final int INDEX_IN_THE_GROUP_UNKNOWN = -1;
    public MicrophoneInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    public static class Coordinate implements android.os.Parcelable {
        public float x;
        public float y;
        public float z;
        public static final android.os.Parcelable.Creator<android.media.audio.common.MicrophoneInfo.Coordinate> CREATOR = null;
        public Coordinate() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static @interface Directionality {
        public static final int UNKNOWN = 0;
        public static final int OMNI = 1;
        public static final int BI_DIRECTIONAL = 2;
        public static final int CARDIOID = 3;
        public static final int HYPER_CARDIOID = 4;
        public static final int SUPER_CARDIOID = 5;
    }

    public static class FrequencyResponsePoint implements android.os.Parcelable {
        public float frequencyHz;
        public float leveldB;
        public static final android.os.Parcelable.Creator<android.media.audio.common.MicrophoneInfo.FrequencyResponsePoint> CREATOR = null;
        public FrequencyResponsePoint() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static @interface Location {
        public static final int UNKNOWN = 0;
        public static final int MAINBODY = 1;
        public static final int MAINBODY_MOVABLE = 2;
        public static final int PERIPHERAL = 3;
    }

    public static class Sensitivity implements android.os.Parcelable {
        public float leveldBFS;
        public float maxSpldB;
        public float minSpldB;
        public static final android.os.Parcelable.Creator<android.media.audio.common.MicrophoneInfo.Sensitivity> CREATOR = null;
        public Sensitivity() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }
}
