package android.hardware;

public class SensorAdditionalInfo {
    public final android.hardware.Sensor sensor = null;
    public final int type = 0;
    public final int serial = 0;
    public final float[] floatValues = null;
    public final int[] intValues = null;
    public static final int TYPE_FRAME_BEGIN = 0;
    public static final int TYPE_FRAME_END = 1;
    public static final int TYPE_UNTRACKED_DELAY = 65536;
    public static final int TYPE_INTERNAL_TEMPERATURE = 65537;
    public static final int TYPE_VEC3_CALIBRATION = 65538;
    public static final int TYPE_SENSOR_PLACEMENT = 65539;
    public static final int TYPE_SAMPLING = 65540;
    public static final int TYPE_LOCAL_GEOMAGNETIC_FIELD = 196608;
    public static final int TYPE_LOCAL_GRAVITY = 196609;
    public static final int TYPE_DOCK_STATE = 196610;
    public static final int TYPE_HIGH_PERFORMANCE_MODE = 196611;
    public static final int TYPE_MAGNETIC_FIELD_CALIBRATION = 196612;
    public static final int TYPE_CUSTOM_INFO = 268435456;
    public static final int TYPE_DEBUG_INFO = 1073741824;
    SensorAdditionalInfo(android.hardware.Sensor p0, int p1, int p2, int[] p3, float[] p4) {}
    public static android.hardware.SensorAdditionalInfo createLocalGeomagneticField(float p0, float p1, float p2) { return null; }
    public static android.hardware.SensorAdditionalInfo createCustomInfo(android.hardware.Sensor p0, int p1, float[] p2) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AdditionalInfoType {
    }
}
