package android.media.audiofx;

public class BassBoost extends android.media.audiofx.AudioEffect {
    public static final int PARAM_STRENGTH_SUPPORTED = 0;
    public static final int PARAM_STRENGTH = 1;
    public BassBoost(int p0, int p1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { super((java.util.UUID)null, (android.media.AudioDeviceAttributes)null); }
    public boolean getStrengthSupported() { return false; }
    public void setStrength(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public short getRoundedStrength() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public void setParameterListener(android.media.audiofx.BassBoost.OnParameterChangeListener p0) {}
    public android.media.audiofx.BassBoost.Settings getProperties() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return null; }
    public void setProperties(android.media.audiofx.BassBoost.Settings p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}

    public static class Settings {
        public short strength;
        public Settings() {}
        public Settings(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
    }

    public static interface OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.BassBoost p0, int p1, int p2, short p3);
    }

    private class BaseParameterListener implements android.media.audiofx.AudioEffect.OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.AudioEffect p0, int p1, byte[] p2, byte[] p3) {}
    }
}
