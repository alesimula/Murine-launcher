package android.hardware;

public abstract class SensorManager {
    protected static final java.lang.String TAG = "SensorManager";
    private static final float[] sTempMatrix = null;
    private final android.util.SparseArray<java.util.List<android.hardware.Sensor>> mSensorListByType = null;
    private android.hardware.LegacySensorManager mLegacySensorManager;
    @java.lang.Deprecated
    public static final int SENSOR_ORIENTATION = 1;
    @java.lang.Deprecated
    public static final int SENSOR_ACCELEROMETER = 2;
    @java.lang.Deprecated
    public static final int SENSOR_TEMPERATURE = 4;
    @java.lang.Deprecated
    public static final int SENSOR_MAGNETIC_FIELD = 8;
    @java.lang.Deprecated
    public static final int SENSOR_LIGHT = 16;
    @java.lang.Deprecated
    public static final int SENSOR_PROXIMITY = 32;
    @java.lang.Deprecated
    public static final int SENSOR_TRICORDER = 64;
    @java.lang.Deprecated
    public static final int SENSOR_ORIENTATION_RAW = 128;
    @java.lang.Deprecated
    public static final int SENSOR_ALL = 127;
    @java.lang.Deprecated
    public static final int SENSOR_MIN = 1;
    @java.lang.Deprecated
    public static final int SENSOR_MAX = 64;
    @java.lang.Deprecated
    public static final int DATA_X = 0;
    @java.lang.Deprecated
    public static final int DATA_Y = 1;
    @java.lang.Deprecated
    public static final int DATA_Z = 2;
    @java.lang.Deprecated
    public static final int RAW_DATA_INDEX = 3;
    @java.lang.Deprecated
    public static final int RAW_DATA_X = 3;
    @java.lang.Deprecated
    public static final int RAW_DATA_Y = 4;
    @java.lang.Deprecated
    public static final int RAW_DATA_Z = 5;
    public static final float STANDARD_GRAVITY = 9.806650161743164f;
    public static final float GRAVITY_SUN = 275.0f;
    public static final float GRAVITY_MERCURY = 3.700000047683716f;
    public static final float GRAVITY_VENUS = 8.869999885559082f;
    public static final float GRAVITY_EARTH = 9.806650161743164f;
    public static final float GRAVITY_MOON = 1.600000023841858f;
    public static final float GRAVITY_MARS = 3.7100000381469727f;
    public static final float GRAVITY_JUPITER = 23.1200008392334f;
    public static final float GRAVITY_SATURN = 8.960000038146973f;
    public static final float GRAVITY_URANUS = 8.6899995803833f;
    public static final float GRAVITY_NEPTUNE = 11.0f;
    public static final float GRAVITY_PLUTO = 0.6000000238418579f;
    public static final float GRAVITY_DEATH_STAR_I = 3.5303614254189597e-07f;
    public static final float GRAVITY_THE_ISLAND = 4.815162181854248f;
    public static final float MAGNETIC_FIELD_EARTH_MAX = 60.0f;
    public static final float MAGNETIC_FIELD_EARTH_MIN = 30.0f;
    public static final float PRESSURE_STANDARD_ATMOSPHERE = 1013.25f;
    public static final float LIGHT_SUNLIGHT_MAX = 120000.0f;
    public static final float LIGHT_SUNLIGHT = 110000.0f;
    public static final float LIGHT_SHADE = 20000.0f;
    public static final float LIGHT_OVERCAST = 10000.0f;
    public static final float LIGHT_SUNRISE = 400.0f;
    public static final float LIGHT_CLOUDY = 100.0f;
    public static final float LIGHT_FULLMOON = 0.25f;
    public static final float LIGHT_NO_MOON = 0.0010000000474974513f;
    public static final int SENSOR_DELAY_FASTEST = 0;
    public static final int SENSOR_DELAY_GAME = 1;
    public static final int SENSOR_DELAY_UI = 2;
    public static final int SENSOR_DELAY_NORMAL = 3;
    public static final int SENSOR_STATUS_NO_CONTACT = -1;
    public static final int SENSOR_STATUS_UNRELIABLE = 0;
    public static final int SENSOR_STATUS_ACCURACY_LOW = 1;
    public static final int SENSOR_STATUS_ACCURACY_MEDIUM = 2;
    public static final int SENSOR_STATUS_ACCURACY_HIGH = 3;
    public static final int AXIS_X = 1;
    public static final int AXIS_Y = 2;
    public static final int AXIS_Z = 3;
    public static final int AXIS_MINUS_X = 129;
    public static final int AXIS_MINUS_Y = 130;
    public static final int AXIS_MINUS_Z = 131;
    @android.annotation.UnsupportedAppUsage
    public SensorManager() {}
    protected abstract java.util.List<android.hardware.Sensor> getFullSensorList();
    protected abstract java.util.List<android.hardware.Sensor> getFullDynamicSensorList();
    @java.lang.Deprecated
    public int getSensors() { return 0; }
    public java.util.List<android.hardware.Sensor> getSensorList(int p0) { return null; }
    public java.util.List<android.hardware.Sensor> getDynamicSensorList(int p0) { return null; }
    public android.hardware.Sensor getDefaultSensor(int p0) { return null; }
    public android.hardware.Sensor getDefaultSensor(int p0, boolean p1) { return null; }
    @java.lang.Deprecated
    public boolean registerListener(android.hardware.SensorListener p0, int p1) { return false; }
    @java.lang.Deprecated
    public boolean registerListener(android.hardware.SensorListener p0, int p1, int p2) { return false; }
    @java.lang.Deprecated
    public void unregisterListener(android.hardware.SensorListener p0) {}
    @java.lang.Deprecated
    public void unregisterListener(android.hardware.SensorListener p0, int p1) {}
    public void unregisterListener(android.hardware.SensorEventListener p0, android.hardware.Sensor p1) {}
    public void unregisterListener(android.hardware.SensorEventListener p0) {}
    protected abstract void unregisterListenerImpl(android.hardware.SensorEventListener p0, android.hardware.Sensor p1);
    public boolean registerListener(android.hardware.SensorEventListener p0, android.hardware.Sensor p1, int p2) { return false; }
    public boolean registerListener(android.hardware.SensorEventListener p0, android.hardware.Sensor p1, int p2, int p3) { return false; }
    public boolean registerListener(android.hardware.SensorEventListener p0, android.hardware.Sensor p1, int p2, android.os.Handler p3) { return false; }
    public boolean registerListener(android.hardware.SensorEventListener p0, android.hardware.Sensor p1, int p2, int p3, android.os.Handler p4) { return false; }
    protected abstract boolean registerListenerImpl(android.hardware.SensorEventListener p0, android.hardware.Sensor p1, int p2, android.os.Handler p3, int p4, int p5);
    public boolean flush(android.hardware.SensorEventListener p0) { return false; }
    protected abstract boolean flushImpl(android.hardware.SensorEventListener p0);
    public android.hardware.SensorDirectChannel createDirectChannel(android.os.MemoryFile p0) { return null; }
    public android.hardware.SensorDirectChannel createDirectChannel(android.hardware.HardwareBuffer p0) { return null; }
    protected abstract android.hardware.SensorDirectChannel createDirectChannelImpl(android.os.MemoryFile p0, android.hardware.HardwareBuffer p1);
    void destroyDirectChannel(android.hardware.SensorDirectChannel p0) {}
    protected abstract void destroyDirectChannelImpl(android.hardware.SensorDirectChannel p0);
    @java.lang.Deprecated
    public int configureDirectChannel(android.hardware.SensorDirectChannel p0, android.hardware.Sensor p1, int p2) { return 0; }
    protected abstract int configureDirectChannelImpl(android.hardware.SensorDirectChannel p0, android.hardware.Sensor p1, int p2);
    public void registerDynamicSensorCallback(android.hardware.SensorManager.DynamicSensorCallback p0) {}
    public void registerDynamicSensorCallback(android.hardware.SensorManager.DynamicSensorCallback p0, android.os.Handler p1) {}
    public void unregisterDynamicSensorCallback(android.hardware.SensorManager.DynamicSensorCallback p0) {}
    public boolean isDynamicSensorDiscoverySupported() { return false; }
    protected abstract void registerDynamicSensorCallbackImpl(android.hardware.SensorManager.DynamicSensorCallback p0, android.os.Handler p1);
    protected abstract void unregisterDynamicSensorCallbackImpl(android.hardware.SensorManager.DynamicSensorCallback p0);
    public static boolean getRotationMatrix(float[] p0, float[] p1, float[] p2, float[] p3) { return false; }
    public static float getInclination(float[] p0) { return 0.0f; }
    public static boolean remapCoordinateSystem(float[] p0, int p1, int p2, float[] p3) { return false; }
    private static boolean remapCoordinateSystemImpl(float[] p0, int p1, int p2, float[] p3) { return false; }
    public static float[] getOrientation(float[] p0, float[] p1) { return null; }
    public static float getAltitude(float p0, float p1) { return 0.0f; }
    public static void getAngleChange(float[] p0, float[] p1, float[] p2) {}
    public static void getRotationMatrixFromVector(float[] p0, float[] p1) {}
    public static void getQuaternionFromVector(float[] p0, float[] p1) {}
    public boolean requestTriggerSensor(android.hardware.TriggerEventListener p0, android.hardware.Sensor p1) { return false; }
    protected abstract boolean requestTriggerSensorImpl(android.hardware.TriggerEventListener p0, android.hardware.Sensor p1);
    public boolean cancelTriggerSensor(android.hardware.TriggerEventListener p0, android.hardware.Sensor p1) { return false; }
    protected abstract boolean cancelTriggerSensorImpl(android.hardware.TriggerEventListener p0, android.hardware.Sensor p1, boolean p2);
    @android.annotation.SystemApi
    public boolean initDataInjection(boolean p0) { return false; }
    protected abstract boolean initDataInjectionImpl(boolean p0);
    @android.annotation.SystemApi
    public boolean injectSensorData(android.hardware.Sensor p0, float[] p1, int p2, long p3) { return false; }
    protected abstract boolean injectSensorDataImpl(android.hardware.Sensor p0, float[] p1, int p2, long p3);
    private android.hardware.LegacySensorManager getLegacySensorManager() { return null; }
    private static int getDelay(int p0) { return 0; }
    public boolean setOperationParameter(android.hardware.SensorAdditionalInfo p0) { return false; }
    protected abstract boolean setOperationParameterImpl(android.hardware.SensorAdditionalInfo p0);

    public static abstract class DynamicSensorCallback {
        public DynamicSensorCallback() {}
        public void onDynamicSensorConnected(android.hardware.Sensor p0) {}
        public void onDynamicSensorDisconnected(android.hardware.Sensor p0) {}
    }
}
