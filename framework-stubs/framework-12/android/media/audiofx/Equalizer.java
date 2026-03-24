package android.media.audiofx;

public class Equalizer extends android.media.audiofx.AudioEffect {
    private static final java.lang.String TAG = "Equalizer";
    public static final int PARAM_NUM_BANDS = 0;
    public static final int PARAM_LEVEL_RANGE = 1;
    public static final int PARAM_BAND_LEVEL = 2;
    public static final int PARAM_CENTER_FREQ = 3;
    public static final int PARAM_BAND_FREQ_RANGE = 4;
    public static final int PARAM_GET_BAND = 5;
    public static final int PARAM_CURRENT_PRESET = 6;
    public static final int PARAM_GET_NUM_OF_PRESETS = 7;
    public static final int PARAM_GET_PRESET_NAME = 8;
    private static final int PARAM_PROPERTIES = 9;
    public static final int PARAM_STRING_SIZE_MAX = 32;
    private short mNumBands;
    private int mNumPresets;
    private java.lang.String[] mPresetNames;
    private android.media.audiofx.Equalizer.OnParameterChangeListener mParamListener;
    private android.media.audiofx.Equalizer.BaseParameterListener mBaseParamListener;
    private final java.lang.Object mParamListenerLock = null;
    public Equalizer(int p0, int p1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { super((java.util.UUID)null, (android.media.AudioDeviceAttributes)null); }
    public short getNumberOfBands() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public short[] getBandLevelRange() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return null; }
    public void setBandLevel(short p0, short p1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public short getBandLevel(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public int getCenterFreq(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public int[] getBandFreqRange(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return null; }
    public short getBand(int p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public short getCurrentPreset() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public void usePreset(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public short getNumberOfPresets() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public java.lang.String getPresetName(short p0) { return null; }
    public void setParameterListener(android.media.audiofx.Equalizer.OnParameterChangeListener p0) {}
    public android.media.audiofx.Equalizer.Settings getProperties() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return null; }
    public void setProperties(android.media.audiofx.Equalizer.Settings p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}

    private class BaseParameterListener implements android.media.audiofx.AudioEffect.OnParameterChangeListener {
        private BaseParameterListener(android.media.audiofx.Equalizer p0) {}
        public void onParameterChange(android.media.audiofx.AudioEffect p0, int p1, byte[] p2, byte[] p3) {}
    }

    public static interface OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.Equalizer p0, int p1, int p2, int p3, int p4);
    }

    public static class Settings {
        public short curPreset;
        public short numBands;
        public short[] bandLevels;
        public Settings() {}
        public Settings(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
    }
}
