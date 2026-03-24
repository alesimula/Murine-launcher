package android.os;

public class SystemVibrator extends android.os.Vibrator {
    private static final java.lang.String TAG = "Vibrator";
    private final android.os.VibratorManager mVibratorManager = null;
    private final android.content.Context mContext = null;
    private final java.util.ArrayList<android.os.SystemVibrator.AllVibratorsStateListener> mBrokenListeners = null;
    private final android.util.ArrayMap<android.os.Vibrator.OnVibratorStateChangedListener, android.os.SystemVibrator.AllVibratorsStateListener> mRegisteredListeners = null;
    private final java.lang.Object mLock = null;
    private android.os.SystemVibrator.AllVibratorsInfo mVibratorInfo;
    public SystemVibrator(android.content.Context p0) { super(); }
    protected android.os.VibratorInfo getInfo() { return null; }
    public boolean hasVibrator() { return false; }
    public boolean isVibrating() { return false; }
    public void addVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    public void addVibratorStateListener(java.util.concurrent.Executor p0, android.os.Vibrator.OnVibratorStateChangedListener p1) {}
    public void removeVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    public boolean hasAmplitudeControl() { return false; }
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.VibrationEffect p3, android.media.AudioAttributes p4) { return false; }
    public void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, java.lang.String p3, android.os.VibrationAttributes p4) {}
    public void cancel() {}
    public void cancel(int p0) {}
    private void tryUnregisterBrokenListeners() {}

    public static class AllVibratorsInfo extends android.os.VibratorInfo {
        private final android.os.VibratorInfo[] mVibratorInfos = null;
        public AllVibratorsInfo(android.os.VibratorInfo[] p0) { super(0, 0, (android.os.VibratorInfo)null); }
        public int isEffectSupported(int p0) { return 0; }
        public boolean isPrimitiveSupported(int p0) { return false; }
        public int getPrimitiveDuration(int p0) { return 0; }
        private static int capabilitiesIntersection(android.os.VibratorInfo[] p0) { return 0; }
    }

    private static class AllVibratorsStateListener {
        private final java.lang.Object mLock = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.os.Vibrator.OnVibratorStateChangedListener mDelegate = null;
        private final android.util.SparseArray<android.os.SystemVibrator.SingleVibratorStateListener> mVibratorListeners = null;
        private int mInitializedMask;
        private int mVibratingMask;
        AllVibratorsStateListener(java.util.concurrent.Executor p0, android.os.Vibrator.OnVibratorStateChangedListener p1) {}
        boolean hasRegisteredListeners() { return false; }
        void register(android.os.VibratorManager p0) {}
        void unregister(android.os.VibratorManager p0) {}
        void onVibrating(int p0, boolean p1) {}
    }

    private static class SingleVibratorStateListener implements android.os.Vibrator.OnVibratorStateChangedListener {
        private final android.os.SystemVibrator.AllVibratorsStateListener mAllVibratorsListener = null;
        private final int mVibratorIdx = 0;
        SingleVibratorStateListener(android.os.SystemVibrator.AllVibratorsStateListener p0, int p1) {}
        public void onVibratorStateChanged(boolean p0) {}
    }
}
