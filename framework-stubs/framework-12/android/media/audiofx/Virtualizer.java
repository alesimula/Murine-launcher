package android.media.audiofx;

public class Virtualizer extends android.media.audiofx.AudioEffect {
    private static final java.lang.String TAG = "Virtualizer";
    private static final boolean DEBUG = false;
    public static final int PARAM_STRENGTH_SUPPORTED = 0;
    public static final int PARAM_STRENGTH = 1;
    public static final int PARAM_VIRTUAL_SPEAKER_ANGLES = 2;
    public static final int PARAM_FORCE_VIRTUALIZATION_MODE = 3;
    public static final int PARAM_VIRTUALIZATION_MODE = 4;
    private boolean mStrengthSupported;
    private android.media.audiofx.Virtualizer.OnParameterChangeListener mParamListener;
    private android.media.audiofx.Virtualizer.BaseParameterListener mBaseParamListener;
    private final java.lang.Object mParamListenerLock = null;
    public static final int VIRTUALIZATION_MODE_OFF = 0;
    public static final int VIRTUALIZATION_MODE_AUTO = 1;
    public static final int VIRTUALIZATION_MODE_BINAURAL = 2;
    public static final int VIRTUALIZATION_MODE_TRANSAURAL = 3;
    public Virtualizer(int p0, int p1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { super((java.util.UUID)null, (android.media.AudioDeviceAttributes)null); }
    public boolean getStrengthSupported() { return false; }
    public void setStrength(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public short getRoundedStrength() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    private boolean getAnglesInt(int p0, int p1, int[] p2) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return false; }
    private static int getDeviceForModeQuery(int p0) throws java.lang.IllegalArgumentException { return 0; }
    private static int getDeviceForModeForce(int p0) throws java.lang.IllegalArgumentException { return 0; }
    private static int deviceToMode(int p0) { return 0; }
    public boolean canVirtualize(int p0, int p1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return false; }
    public boolean getSpeakerAngles(int p0, int p1, int[] p2) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return false; }
    public boolean forceVirtualizationMode(int p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return false; }
    public int getVirtualizationMode() throws java.lang.IllegalStateException, java.lang.UnsupportedOperationException { return 0; }
    public void setParameterListener(android.media.audiofx.Virtualizer.OnParameterChangeListener p0) {}
    public android.media.audiofx.Virtualizer.Settings getProperties() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return null; }
    public void setProperties(android.media.audiofx.Virtualizer.Settings p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}

    private class BaseParameterListener implements android.media.audiofx.AudioEffect.OnParameterChangeListener {
        private BaseParameterListener(android.media.audiofx.Virtualizer p0) {}
        public void onParameterChange(android.media.audiofx.AudioEffect p0, int p1, byte[] p2, byte[] p3) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ForceVirtualizationMode {
    }

    public static interface OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.Virtualizer p0, int p1, int p2, short p3);
    }

    public static class Settings {
        public short strength;
        public Settings() {}
        public Settings(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VirtualizationMode {
    }
}
