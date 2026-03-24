package android.media.audiofx;

public class Visualizer {
    private static final java.lang.String TAG = "Visualizer-JAVA";
    public static final int STATE_UNINITIALIZED = 0;
    public static final int STATE_INITIALIZED = 1;
    public static final int STATE_ENABLED = 2;
    public static final int SCALING_MODE_NORMALIZED = 0;
    public static final int SCALING_MODE_AS_PLAYED = 1;
    public static final int MEASUREMENT_MODE_NONE = 0;
    public static final int MEASUREMENT_MODE_PEAK_RMS = 1;
    private static final int NATIVE_EVENT_PCM_CAPTURE = 0;
    private static final int NATIVE_EVENT_FFT_CAPTURE = 1;
    private static final int NATIVE_EVENT_SERVER_DIED = 2;
    public static final int SUCCESS = 0;
    public static final int ERROR = -1;
    public static final int ALREADY_EXISTS = -2;
    public static final int ERROR_NO_INIT = -3;
    public static final int ERROR_BAD_VALUE = -4;
    public static final int ERROR_INVALID_OPERATION = -5;
    public static final int ERROR_NO_MEMORY = -6;
    public static final int ERROR_DEAD_OBJECT = -7;
    private int mState;
    private final java.lang.Object mStateLock = null;
    private int mId;
    private final java.lang.Object mListenerLock = null;
    private android.os.Handler mNativeEventHandler;
    private android.media.audiofx.Visualizer.OnDataCaptureListener mCaptureListener;
    private android.media.audiofx.Visualizer.OnServerDiedListener mServerDiedListener;
    private long mNativeVisualizer;
    private long mJniData;
    public Visualizer(int p0) throws java.lang.UnsupportedOperationException, java.lang.RuntimeException {}
    public void release() {}
    protected void finalize() {}
    public int setEnabled(boolean p0) throws java.lang.IllegalStateException { return 0; }
    public boolean getEnabled() { return false; }
    public static native int[] getCaptureSizeRange();
    public static native int getMaxCaptureRate();
    public int setCaptureSize(int p0) throws java.lang.IllegalStateException { return 0; }
    public int getCaptureSize() throws java.lang.IllegalStateException { return 0; }
    public int setScalingMode(int p0) throws java.lang.IllegalStateException { return 0; }
    public int getScalingMode() throws java.lang.IllegalStateException { return 0; }
    public int setMeasurementMode(int p0) throws java.lang.IllegalStateException { return 0; }
    public int getMeasurementMode() throws java.lang.IllegalStateException { return 0; }
    public int getSamplingRate() throws java.lang.IllegalStateException { return 0; }
    public int getWaveForm(byte[] p0) throws java.lang.IllegalStateException { return 0; }
    public int getFft(byte[] p0) throws java.lang.IllegalStateException { return 0; }
    public int getMeasurementPeakRms(android.media.audiofx.Visualizer.MeasurementPeakRms p0) { return 0; }
    public int setDataCaptureListener(android.media.audiofx.Visualizer.OnDataCaptureListener p0, int p1, boolean p2, boolean p3) { return 0; }
    public int setServerDiedListener(android.media.audiofx.Visualizer.OnServerDiedListener p0) { return 0; }
    private static final native void native_init();
    private final native int native_setup(java.lang.Object p0, int p1, int[] p2, java.lang.String p3);
    private final native void native_finalize();
    private final native void native_release();
    private final native int native_setEnabled(boolean p0);
    private final native boolean native_getEnabled();
    private final native int native_setCaptureSize(int p0);
    private final native int native_getCaptureSize();
    private final native int native_setScalingMode(int p0);
    private final native int native_getScalingMode();
    private final native int native_setMeasurementMode(int p0);
    private final native int native_getMeasurementMode();
    private final native int native_getSamplingRate();
    private final native int native_getWaveForm(byte[] p0);
    private final native int native_getFft(byte[] p0);
    private final native int native_getPeakRms(android.media.audiofx.Visualizer.MeasurementPeakRms p0);
    private final native int native_setPeriodicCapture(int p0, boolean p1, boolean p2);
    private static void postEventFromNative(java.lang.Object p0, int p1, int p2, byte[] p3) {}

    public static final class MeasurementPeakRms {
        public int mPeak;
        public int mRms;
        public MeasurementPeakRms() {}
    }

    public static interface OnDataCaptureListener {
        public void onWaveFormDataCapture(android.media.audiofx.Visualizer p0, byte[] p1, int p2);
        public void onFftDataCapture(android.media.audiofx.Visualizer p0, byte[] p1, int p2);
    }

    public static interface OnServerDiedListener {
        public void onServerDied();
    }
}
