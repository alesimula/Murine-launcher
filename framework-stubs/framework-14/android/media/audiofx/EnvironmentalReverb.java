package android.media.audiofx;

public class EnvironmentalReverb extends android.media.audiofx.AudioEffect {
    public static final int PARAM_ROOM_LEVEL = 0;
    public static final int PARAM_ROOM_HF_LEVEL = 1;
    public static final int PARAM_DECAY_TIME = 2;
    public static final int PARAM_DECAY_HF_RATIO = 3;
    public static final int PARAM_REFLECTIONS_LEVEL = 4;
    public static final int PARAM_REFLECTIONS_DELAY = 5;
    public static final int PARAM_REVERB_LEVEL = 6;
    public static final int PARAM_REVERB_DELAY = 7;
    public static final int PARAM_DIFFUSION = 8;
    public static final int PARAM_DENSITY = 9;
    public EnvironmentalReverb(int p0, int p1) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { super((java.util.UUID)null, (android.media.AudioDeviceAttributes)null); }
    public void setRoomLevel(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public short getRoomLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public void setRoomHFLevel(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public short getRoomHFLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public void setDecayTime(int p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public int getDecayTime() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public void setDecayHFRatio(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public short getDecayHFRatio() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public void setReflectionsLevel(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public short getReflectionsLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public void setReflectionsDelay(int p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public int getReflectionsDelay() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public void setReverbLevel(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public short getReverbLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public void setReverbDelay(int p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public int getReverbDelay() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public void setDiffusion(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public short getDiffusion() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public void setDensity(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public short getDensity() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public void setParameterListener(android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener p0) {}
    public android.media.audiofx.EnvironmentalReverb.Settings getProperties() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return null; }
    public void setProperties(android.media.audiofx.EnvironmentalReverb.Settings p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}

    public static class Settings {
        public short roomLevel;
        public short roomHFLevel;
        public int decayTime;
        public short decayHFRatio;
        public short reflectionsLevel;
        public int reflectionsDelay;
        public short reverbLevel;
        public int reverbDelay;
        public short diffusion;
        public short density;
        public Settings() {}
        public Settings(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
    }

    public static interface OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.EnvironmentalReverb p0, int p1, int p2, int p3);
    }

    private class BaseParameterListener implements android.media.audiofx.AudioEffect.OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.AudioEffect p0, int p1, byte[] p2, byte[] p3) {}
    }
}
