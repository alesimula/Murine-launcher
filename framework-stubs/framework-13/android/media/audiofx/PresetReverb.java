package android.media.audiofx;

public class PresetReverb extends android.media.audiofx.AudioEffect {
    public static final int PARAM_PRESET = 0;
    public static final short PRESET_NONE = 0;
    public static final short PRESET_SMALLROOM = 1;
    public static final short PRESET_MEDIUMROOM = 2;
    public static final short PRESET_LARGEROOM = 3;
    public static final short PRESET_MEDIUMHALL = 4;
    public static final short PRESET_LARGEHALL = 5;
    public static final short PRESET_PLATE = 6;
    public PresetReverb(int p0, int p1) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { super((java.util.UUID)null, (android.media.AudioDeviceAttributes)null); }
    public void setPreset(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public short getPreset() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public void setParameterListener(android.media.audiofx.PresetReverb.OnParameterChangeListener p0) {}
    public android.media.audiofx.PresetReverb.Settings getProperties() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return null; }
    public void setProperties(android.media.audiofx.PresetReverb.Settings p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}

    private class BaseParameterListener implements android.media.audiofx.AudioEffect.OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.AudioEffect p0, int p1, byte[] p2, byte[] p3) {}
    }

    public static interface OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.PresetReverb p0, int p1, int p2, short p3);
    }

    public static class Settings {
        public short preset;
        public Settings() {}
        public Settings(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
    }
}
