package android.media;

public final class MicrophoneInfo {
    public static final int LOCATION_UNKNOWN = 0;
    public static final int LOCATION_MAINBODY = 1;
    public static final int LOCATION_MAINBODY_MOVABLE = 2;
    public static final int LOCATION_PERIPHERAL = 3;
    public static final int DIRECTIONALITY_UNKNOWN = 0;
    public static final int DIRECTIONALITY_OMNI = 1;
    public static final int DIRECTIONALITY_BI_DIRECTIONAL = 2;
    public static final int DIRECTIONALITY_CARDIOID = 3;
    public static final int DIRECTIONALITY_HYPER_CARDIOID = 4;
    public static final int DIRECTIONALITY_SUPER_CARDIOID = 5;
    public static final int CHANNEL_MAPPING_DIRECT = 1;
    public static final int CHANNEL_MAPPING_PROCESSED = 2;
    public static final int GROUP_UNKNOWN = -1;
    public static final int INDEX_IN_THE_GROUP_UNKNOWN = -1;
    public static final android.media.MicrophoneInfo.Coordinate3F POSITION_UNKNOWN = null;
    public static final android.media.MicrophoneInfo.Coordinate3F ORIENTATION_UNKNOWN = null;
    public static final float SENSITIVITY_UNKNOWN = -3.4028234663852886e+38f;
    public static final float SPL_UNKNOWN = -3.4028234663852886e+38f;
    MicrophoneInfo(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4, int p5, android.media.MicrophoneInfo.Coordinate3F p6, android.media.MicrophoneInfo.Coordinate3F p7, java.util.List<android.util.Pair<java.lang.Float, java.lang.Float>> p8, java.util.List<android.util.Pair<java.lang.Integer, java.lang.Integer>> p9, float p10, float p11, float p12, int p13) {}
    public java.lang.String getDescription() { return null; }
    public int getId() { return 0; }
    public int getInternalDeviceType() { return 0; }
    public int getType() { return 0; }
    public java.lang.String getAddress() { return null; }
    public int getLocation() { return 0; }
    public int getGroup() { return 0; }
    public int getIndexInTheGroup() { return 0; }
    public android.media.MicrophoneInfo.Coordinate3F getPosition() { return null; }
    public android.media.MicrophoneInfo.Coordinate3F getOrientation() { return null; }
    public java.util.List<android.util.Pair<java.lang.Float, java.lang.Float>> getFrequencyResponse() { return null; }
    public java.util.List<android.util.Pair<java.lang.Integer, java.lang.Integer>> getChannelMapping() { return null; }
    public float getSensitivity() { return 0.0f; }
    public float getMaxSpl() { return 0.0f; }
    public float getMinSpl() { return 0.0f; }
    public int getDirectionality() { return 0; }
    public void setId(int p0) {}
    public void setChannelMapping(java.util.List<android.util.Pair<java.lang.Integer, java.lang.Integer>> p0) {}

    public static final class Coordinate3F {
        public final float x = 0.0f;
        public final float y = 0.0f;
        public final float z = 0.0f;
        Coordinate3F(float p0, float p1, float p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MicrophoneDirectionality {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MicrophoneLocation {
    }
}
