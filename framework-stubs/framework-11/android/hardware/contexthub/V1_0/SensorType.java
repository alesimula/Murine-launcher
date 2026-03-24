package android.hardware.contexthub.V1_0;

public final class SensorType {
    public static final int RESERVED = 0;
    public static final int ACCELEROMETER = 1;
    public static final int GYROSCOPE = 2;
    public static final int MAGNETOMETER = 3;
    public static final int BAROMETER = 4;
    public static final int PROXIMITY_SENSOR = 5;
    public static final int AMBIENT_LIGHT_SENSOR = 6;
    public static final int STATIONARY_DETECT = 7;
    public static final int INSTANT_MOTION_DETECT = 8;
    public static final int GPS = 256;
    public static final int WIFI = 512;
    public static final int AUDIO = 768;
    public static final int CAMERA = 1024;
    public static final int BLE = 1280;
    public static final int WWAN = 1536;
    public static final int PRIVATE_SENSOR_BASE = 65536;
    public SensorType() {}
    public static final java.lang.String toString(int p0) { return null; }
    public static final java.lang.String dumpBitfield(int p0) { return null; }
}
