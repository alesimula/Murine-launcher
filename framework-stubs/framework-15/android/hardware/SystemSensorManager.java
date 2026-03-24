package android.hardware;

public class SystemSensorManager extends android.hardware.SensorManager {
    static final long CHANGE_ID_SAMPLING_RATE_SENSORS_PERMISSION = 136069189L;
    public SystemSensorManager(android.content.Context p0, android.os.Looper p1) { super(); }
    public java.util.List<android.hardware.Sensor> getSensorList(int p0) { return null; }
    protected java.util.List<android.hardware.Sensor> getFullSensorList() { return null; }
    public android.hardware.Sensor getSensorByHandle(int p0) { return null; }
    protected java.util.List<android.hardware.Sensor> getFullDynamicSensorList() { return null; }
    protected boolean registerListenerImpl(android.hardware.SensorEventListener p0, android.hardware.Sensor p1, int p2, android.os.Handler p3, int p4, int p5) { return false; }
    protected void unregisterListenerImpl(android.hardware.SensorEventListener p0, android.hardware.Sensor p1) {}
    protected boolean requestTriggerSensorImpl(android.hardware.TriggerEventListener p0, android.hardware.Sensor p1) { return false; }
    protected boolean cancelTriggerSensorImpl(android.hardware.TriggerEventListener p0, android.hardware.Sensor p1, boolean p2) { return false; }
    protected boolean flushImpl(android.hardware.SensorEventListener p0) { return false; }
    protected boolean initDataInjectionImpl(boolean p0, int p1) { return false; }
    protected boolean injectSensorDataImpl(android.hardware.Sensor p0, float[] p1, int p2, long p3) { return false; }
    protected void registerDynamicSensorCallbackImpl(android.hardware.SensorManager.DynamicSensorCallback p0, android.os.Handler p1) {}
    protected void unregisterDynamicSensorCallbackImpl(android.hardware.SensorManager.DynamicSensorCallback p0) {}
    protected int configureDirectChannelImpl(android.hardware.SensorDirectChannel p0, android.hardware.Sensor p1, int p2) { return 0; }
    protected android.hardware.SensorDirectChannel createDirectChannelImpl(android.os.MemoryFile p0, android.hardware.HardwareBuffer p1) { return null; }
    protected void destroyDirectChannelImpl(android.hardware.SensorDirectChannel p0) {}
    protected boolean setOperationParameterImpl(android.hardware.SensorAdditionalInfo p0) { return false; }

    private static abstract class BaseEventQueue {
        protected final android.util.SparseIntArray mSensorAccuracies = null;
        protected final android.util.SparseIntArray mSensorDiscontinuityCounts = null;
        protected final android.hardware.SystemSensorManager mManager = null;
        protected static final int OPERATING_MODE_NORMAL = 0;
        protected static final int OPERATING_MODE_DATA_INJECTION = 1;
        protected static final int OPERATING_MODE_REPLAY_DATA_INJECTION = 3;
        protected static final int OPERATING_MODE_HAL_BYPASS_REPLAY_DATA_INJECTION = 4;
        BaseEventQueue(android.os.Looper p0, android.hardware.SystemSensorManager p1, int p2, java.lang.String p3) {}
        public void dispose() {}
        public boolean addSensor(android.hardware.Sensor p0, int p1, int p2) { return false; }
        public boolean removeAllSensors() { return false; }
        public boolean removeSensor(android.hardware.Sensor p0, boolean p1) { return false; }
        public int flush() { return 0; }
        public boolean hasSensors() { return false; }
        protected void finalize() throws java.lang.Throwable {}
        protected int injectSensorDataBase(int p0, float[] p1, int p2, long p3) { return 0; }
        protected abstract void dispatchSensorEvent(int p0, float[] p1, int p2, long p3);
        protected abstract void dispatchFlushCompleteEvent(int p0);
        protected void dispatchAdditionalInfoEvent(int p0, int p1, int p2, float[] p3, int[] p4) {}
        protected abstract void addSensorEvent(android.hardware.Sensor p0);
        protected abstract void removeSensorEvent(android.hardware.Sensor p0);
    }

    final class InjectEventQueue extends android.hardware.SystemSensorManager.BaseEventQueue {
        public InjectEventQueue(android.hardware.SystemSensorManager p0, android.os.Looper p1, android.hardware.SystemSensorManager p2, int p3, java.lang.String p4) { super(null, null, 0, null); }
        int injectSensorData(int p0, float[] p1, int p2, long p3) { return 0; }
        protected void dispatchSensorEvent(int p0, float[] p1, int p2, long p3) {}
        protected void dispatchFlushCompleteEvent(int p0) {}
        protected void addSensorEvent(android.hardware.Sensor p0) {}
        protected void removeSensorEvent(android.hardware.Sensor p0) {}
        int getDataInjectionMode() { return 0; }
    }

    static final class SensorEventQueue extends android.hardware.SystemSensorManager.BaseEventQueue {
        public SensorEventQueue(android.hardware.SensorEventListener p0, android.os.Looper p1, android.hardware.SystemSensorManager p2, java.lang.String p3) { super(null, null, 0, null); }
        public void addSensorEvent(android.hardware.Sensor p0) {}
        public void removeSensorEvent(android.hardware.Sensor p0) {}
        protected void dispatchSensorEvent(int p0, float[] p1, int p2, long p3) {}
        protected void dispatchFlushCompleteEvent(int p0) {}
        protected void dispatchAdditionalInfoEvent(int p0, int p1, int p2, float[] p3, int[] p4) {}
    }

    static final class TriggerEventQueue extends android.hardware.SystemSensorManager.BaseEventQueue {
        public TriggerEventQueue(android.hardware.TriggerEventListener p0, android.os.Looper p1, android.hardware.SystemSensorManager p2, java.lang.String p3) { super(null, null, 0, null); }
        public void addSensorEvent(android.hardware.Sensor p0) {}
        public void removeSensorEvent(android.hardware.Sensor p0) {}
        protected void dispatchSensorEvent(int p0, float[] p1, int p2, long p3) {}
        protected void dispatchFlushCompleteEvent(int p0) {}
    }
}
