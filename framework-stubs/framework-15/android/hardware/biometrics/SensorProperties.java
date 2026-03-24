package android.hardware.biometrics;

public class SensorProperties {
    public static final int STRENGTH_CONVENIENCE = 0;
    public static final int STRENGTH_WEAK = 1;
    public static final int STRENGTH_STRONG = 2;
    public SensorProperties(int p0, int p1, java.util.List<android.hardware.biometrics.SensorProperties.ComponentInfo> p2) {}
    public int getSensorId() { return 0; }
    public int getSensorStrength() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.hardware.biometrics.SensorProperties.ComponentInfo> getComponentInfo() { return null; }
    public static android.hardware.biometrics.SensorProperties from(android.hardware.biometrics.SensorPropertiesInternal p0) { return null; }

    public static final class ComponentInfo {
        public ComponentInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
        @android.annotation.NonNull
        public java.lang.String getComponentId() { return null; }
        @android.annotation.NonNull
        public java.lang.String getHardwareVersion() { return null; }
        @android.annotation.NonNull
        public java.lang.String getFirmwareVersion() { return null; }
        @android.annotation.NonNull
        public java.lang.String getSerialNumber() { return null; }
        @android.annotation.NonNull
        public java.lang.String getSoftwareVersion() { return null; }
        public static android.hardware.biometrics.SensorProperties.ComponentInfo from(android.hardware.biometrics.ComponentInfoInternal p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Strength {
    }
}
