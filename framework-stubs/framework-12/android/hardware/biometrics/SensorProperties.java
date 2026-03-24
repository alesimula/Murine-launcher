package android.hardware.biometrics;

public class SensorProperties {
    public static final int STRENGTH_CONVENIENCE = 0;
    public static final int STRENGTH_WEAK = 1;
    public static final int STRENGTH_STRONG = 2;
    private final int mSensorId = 0;
    private final int mSensorStrength = 0;
    private final java.util.List<android.hardware.biometrics.SensorProperties.ComponentInfo> mComponentInfo = null;
    public SensorProperties(int p0, int p1, java.util.List<android.hardware.biometrics.SensorProperties.ComponentInfo> p2) {}
    public int getSensorId() { return 0; }
    public int getSensorStrength() { return 0; }
    public java.util.List<android.hardware.biometrics.SensorProperties.ComponentInfo> getComponentInfo() { return null; }
    public static android.hardware.biometrics.SensorProperties from(android.hardware.biometrics.SensorPropertiesInternal p0) { return null; }

    public static final class ComponentInfo {
        private final java.lang.String mComponentId = null;
        private final java.lang.String mHardwareVersion = null;
        private final java.lang.String mFirmwareVersion = null;
        private final java.lang.String mSerialNumber = null;
        private final java.lang.String mSoftwareVersion = null;
        public ComponentInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
        public java.lang.String getComponentId() { return null; }
        public java.lang.String getHardwareVersion() { return null; }
        public java.lang.String getFirmwareVersion() { return null; }
        public java.lang.String getSerialNumber() { return null; }
        public java.lang.String getSoftwareVersion() { return null; }
        public static android.hardware.biometrics.SensorProperties.ComponentInfo from(android.hardware.biometrics.ComponentInfoInternal p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Strength {
    }
}
