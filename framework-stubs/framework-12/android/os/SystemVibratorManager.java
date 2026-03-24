package android.os;

public class SystemVibratorManager extends android.os.VibratorManager {
    private static final java.lang.String TAG = "VibratorManager";
    private final android.os.IVibratorManagerService mService = null;
    private final android.content.Context mContext = null;
    private final android.os.Binder mToken = null;
    private final java.lang.Object mLock = null;
    private int[] mVibratorIds;
    private final android.util.SparseArray<android.os.Vibrator> mVibrators = null;
    private final android.util.ArrayMap<android.os.Vibrator.OnVibratorStateChangedListener, android.os.SystemVibratorManager.OnVibratorStateChangedListenerDelegate> mListeners = null;
    public SystemVibratorManager(android.content.Context p0) { super(); }
    public int[] getVibratorIds() { return null; }
    public android.os.Vibrator getVibrator(int p0) { return null; }
    public android.os.Vibrator getDefaultVibrator() { return null; }
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4) { return false; }
    public void vibrate(int p0, java.lang.String p1, android.os.CombinedVibration p2, java.lang.String p3, android.os.VibrationAttributes p4) {}
    public void cancel() {}
    public void cancel(int p0) {}
    private void cancelVibration(int p0) {}

    private static class OnVibratorStateChangedListenerDelegate extends android.os.IVibratorStateListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.os.Vibrator.OnVibratorStateChangedListener mListener = null;
        OnVibratorStateChangedListenerDelegate(android.os.Vibrator.OnVibratorStateChangedListener p0, java.util.concurrent.Executor p1) { super(); }
        public void onVibrating(boolean p0) {}
    }

    private final class SingleVibrator extends android.os.Vibrator {
        private final android.os.VibratorInfo mVibratorInfo = null;
        SingleVibrator(android.os.SystemVibratorManager p0, android.os.VibratorInfo p1) { super(); }
        protected android.os.VibratorInfo getInfo() { return null; }
        public boolean hasVibrator() { return false; }
        public boolean hasAmplitudeControl() { return false; }
        public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.VibrationEffect p3, android.media.AudioAttributes p4) { return false; }
        public void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, java.lang.String p3, android.os.VibrationAttributes p4) {}
        public void cancel() {}
        public void cancel(int p0) {}
        public boolean isVibrating() { return false; }
        public void addVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
        public void addVibratorStateListener(java.util.concurrent.Executor p0, android.os.Vibrator.OnVibratorStateChangedListener p1) {}
        public void removeVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    }
}
