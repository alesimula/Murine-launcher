package android.os;

public class HardwarePropertiesManager {
    private static final java.lang.String TAG = null;
    private final android.os.IHardwarePropertiesManager mService = null;
    public static final int DEVICE_TEMPERATURE_CPU = 0;
    public static final int DEVICE_TEMPERATURE_GPU = 1;
    public static final int DEVICE_TEMPERATURE_BATTERY = 2;
    public static final int DEVICE_TEMPERATURE_SKIN = 3;
    public static final int TEMPERATURE_CURRENT = 0;
    public static final int TEMPERATURE_THROTTLING = 1;
    public static final int TEMPERATURE_SHUTDOWN = 2;
    public static final int TEMPERATURE_THROTTLING_BELOW_VR_MIN = 3;
    public static final float UNDEFINED_TEMPERATURE = -3.4028234663852886e+38f;
    private final android.content.Context mContext = null;
    public HardwarePropertiesManager(android.content.Context p0, android.os.IHardwarePropertiesManager p1) {}
    public float[] getDeviceTemperatures(int p0, int p1) { return null; }
    public android.os.CpuUsageInfo[] getCpuUsages() { return null; }
    public float[] getFanSpeeds() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceTemperatureType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TemperatureSource {
    }
}
