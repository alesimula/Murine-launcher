package android.hardware.fingerprint;

public class FingerprintSensorProperties extends android.hardware.biometrics.SensorProperties {
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_REAR = 1;
    public static final int TYPE_UDFPS_ULTRASONIC = 2;
    public static final int TYPE_UDFPS_OPTICAL = 3;
    public static final int TYPE_POWER_BUTTON = 4;
    public static final int TYPE_HOME_BUTTON = 5;
    final int mSensorType = 0;
    public static android.hardware.fingerprint.FingerprintSensorProperties from(android.hardware.fingerprint.FingerprintSensorPropertiesInternal p0) { return null; }
    public FingerprintSensorProperties(int p0, int p1, java.util.List<android.hardware.biometrics.SensorProperties.ComponentInfo> p2, int p3) { super(0, 0, null); }
    public int getSensorType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SensorType {
    }
}
