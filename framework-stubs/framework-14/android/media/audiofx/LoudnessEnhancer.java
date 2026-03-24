package android.media.audiofx;

public class LoudnessEnhancer extends android.media.audiofx.AudioEffect {
    public static final int PARAM_TARGET_GAIN_MB = 0;
    public LoudnessEnhancer(int p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { super((java.util.UUID)null, (android.media.AudioDeviceAttributes)null); }
    public LoudnessEnhancer(int p0, int p1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { super((java.util.UUID)null, (android.media.AudioDeviceAttributes)null); }
    public void setTargetGain(int p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public float getTargetGain() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0.0f; }
    public void setParameterListener(android.media.audiofx.LoudnessEnhancer.OnParameterChangeListener p0) {}
    public android.media.audiofx.LoudnessEnhancer.Settings getProperties() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return null; }
    public void setProperties(android.media.audiofx.LoudnessEnhancer.Settings p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}

    private class BaseParameterListener implements android.media.audiofx.AudioEffect.OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.AudioEffect p0, int p1, byte[] p2, byte[] p3) {}
    }

    public static interface OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.LoudnessEnhancer p0, int p1, int p2);
    }

    public static class Settings {
        public int targetGainmB;
        public Settings() {}
        public Settings(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
    }
}
