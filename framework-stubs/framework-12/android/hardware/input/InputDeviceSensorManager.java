package android.hardware.input;

public class InputDeviceSensorManager implements android.hardware.input.InputManager.InputDeviceListener {
    private static final java.lang.String TAG = "InputDeviceSensorManager";
    private static final boolean DEBUG = false;
    private static final int MSG_SENSOR_ACCURACY_CHANGED = 1;
    private static final int MSG_SENSOR_CHANGED = 2;
    private android.hardware.input.InputManager mInputManager;
    private final java.util.Map<java.lang.Integer, java.util.List<android.hardware.Sensor>> mSensors = null;
    private final java.lang.Object mInputSensorLock = null;
    private android.hardware.input.InputDeviceSensorManager.InputSensorEventListener mInputServiceSensorListener;
    private final java.util.ArrayList<android.hardware.input.InputDeviceSensorManager.InputSensorEventListenerDelegate> mInputSensorEventListeners = null;
    private final android.os.HandlerThread mSensorThread = null;
    private final android.os.Handler mSensorHandler = null;
    public InputDeviceSensorManager(android.hardware.input.InputManager p0) {}
    android.hardware.SensorManager getSensorManager(int p0) { return null; }
    private void updateInputDeviceSensorInfoLocked(int p0) {}
    public void onInputDeviceAdded(int p0) {}
    public void onInputDeviceRemoved(int p0) {}
    public void onInputDeviceChanged(int p0) {}
    private static boolean sensorEquals(android.hardware.Sensor p0, android.hardware.Sensor p1) { return false; }
    private void populateSensorsForInputDeviceLocked(int p0, android.hardware.input.InputSensorInfo[] p1) {}
    private void initializeSensors() {}
    private android.hardware.Sensor getInputDeviceSensorLocked(int p0, int p1) { return null; }
    private int findSensorEventListenerLocked(android.hardware.SensorEventListener p0) { return 0; }
    private void onInputSensorChanged(int p0, int p1, int p2, long p3, float[] p4) {}
    private void onInputSensorAccuracyChanged(int p0, int p1, int p2) {}
    private android.hardware.Sensor getSensorForInputDevice(int p0, int p1) { return null; }
    private java.util.List<android.hardware.Sensor> getFullSensorListForDevice(int p0) { return null; }
    private boolean registerListenerInternal(android.hardware.SensorEventListener p0, android.hardware.Sensor p1, int p2, int p3, android.os.Handler p4) { return false; }
    private void unregisterListenerInternal(android.hardware.SensorEventListener p0, android.hardware.Sensor p1) {}
    private boolean flush(android.hardware.SensorEventListener p0) { return false; }

    private final class InputSensorEventListener extends android.hardware.input.IInputSensorEventListener.Stub {
        private InputSensorEventListener(android.hardware.input.InputDeviceSensorManager p0) { super(); }
        public void onInputSensorChanged(int p0, int p1, int p2, long p3, float[] p4) throws android.os.RemoteException {}
        public void onInputSensorAccuracyChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
    }

    private static final class InputSensorEventListenerDelegate extends android.os.Handler {
        private final android.hardware.SensorEventListener mListener = null;
        private final int mDelayUs = 0;
        private final int mMaxBatchReportLatencyUs = 0;
        private java.util.List<android.hardware.Sensor> mSensors;
        private final android.util.SparseArray<android.hardware.SensorEvent> mSensorEvents = null;
        InputSensorEventListenerDelegate(android.hardware.SensorEventListener p0, android.hardware.Sensor p1, int p2, int p3, android.os.Handler p4) { super(); }
        public java.util.List<android.hardware.Sensor> getSensors() { return null; }
        public boolean isEmpty() { return false; }
        public void removeSensor(android.hardware.Sensor p0) {}
        public void addSensor(android.hardware.Sensor p0) {}
        public boolean hasSensorRegistered(int p0, int p1) { return false; }
        public android.hardware.SensorEventListener getListener() { return null; }
        private android.hardware.SensorEvent getSensorEvent(android.hardware.Sensor p0) { return null; }
        public void sendSensorChanged(android.hardware.SensorEvent p0) {}
        public void sendSensorAccuracyChanged(int p0, int p1, int p2) {}
        public void handleMessage(android.os.Message p0) {}
    }

    public class InputSensorManager extends android.hardware.SensorManager {
        final int mId = 0;
        InputSensorManager(android.hardware.input.InputDeviceSensorManager p0, int p1) { super(); }
        public android.hardware.Sensor getDefaultSensor(int p0) { return null; }
        protected java.util.List<android.hardware.Sensor> getFullSensorList() { return null; }
        protected java.util.List<android.hardware.Sensor> getFullDynamicSensorList() { return null; }
        protected boolean registerListenerImpl(android.hardware.SensorEventListener p0, android.hardware.Sensor p1, int p2, android.os.Handler p3, int p4, int p5) { return false; }
        protected void unregisterListenerImpl(android.hardware.SensorEventListener p0, android.hardware.Sensor p1) {}
        protected boolean flushImpl(android.hardware.SensorEventListener p0) { return false; }
        protected android.hardware.SensorDirectChannel createDirectChannelImpl(android.os.MemoryFile p0, android.hardware.HardwareBuffer p1) { return null; }
        protected void destroyDirectChannelImpl(android.hardware.SensorDirectChannel p0) {}
        protected int configureDirectChannelImpl(android.hardware.SensorDirectChannel p0, android.hardware.Sensor p1, int p2) { return 0; }
        protected void registerDynamicSensorCallbackImpl(android.hardware.SensorManager.DynamicSensorCallback p0, android.os.Handler p1) {}
        protected void unregisterDynamicSensorCallbackImpl(android.hardware.SensorManager.DynamicSensorCallback p0) {}
        protected boolean requestTriggerSensorImpl(android.hardware.TriggerEventListener p0, android.hardware.Sensor p1) { return false; }
        protected boolean cancelTriggerSensorImpl(android.hardware.TriggerEventListener p0, android.hardware.Sensor p1, boolean p2) { return false; }
        protected boolean initDataInjectionImpl(boolean p0) { return false; }
        protected boolean injectSensorDataImpl(android.hardware.Sensor p0, float[] p1, int p2, long p3) { return false; }
        protected boolean setOperationParameterImpl(android.hardware.SensorAdditionalInfo p0) { return false; }
    }
}
