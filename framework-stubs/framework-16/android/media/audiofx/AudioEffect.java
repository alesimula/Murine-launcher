package android.media.audiofx;

public class AudioEffect {
    public static final java.util.UUID EFFECT_TYPE_ENV_REVERB = null;
    public static final java.util.UUID EFFECT_TYPE_PRESET_REVERB = null;
    public static final java.util.UUID EFFECT_TYPE_EQUALIZER = null;
    public static final java.util.UUID EFFECT_TYPE_BASS_BOOST = null;
    public static final java.util.UUID EFFECT_TYPE_VIRTUALIZER = null;
    public static final java.util.UUID EFFECT_TYPE_AGC = null;
    public static final java.util.UUID EFFECT_TYPE_AEC = null;
    public static final java.util.UUID EFFECT_TYPE_NS = null;
    public static final java.util.UUID EFFECT_TYPE_LOUDNESS_ENHANCER = null;
    public static final java.util.UUID EFFECT_TYPE_DYNAMICS_PROCESSING = null;
    @android.annotation.SuppressLint("UnflaggedApi")
    @android.annotation.NonNull
    public static final java.util.UUID EFFECT_TYPE_SPATIALIZER = null;
    @android.annotation.NonNull
    public static final java.util.UUID EFFECT_TYPE_HAPTIC_GENERATOR = null;
    public static final java.util.UUID EFFECT_TYPE_NULL = null;
    public static final int STATE_UNINITIALIZED = 0;
    public static final int STATE_INITIALIZED = 1;
    public static final int NATIVE_EVENT_CONTROL_STATUS = 0;
    public static final int NATIVE_EVENT_ENABLED_STATUS = 1;
    public static final int NATIVE_EVENT_PARAMETER_CHANGED = 2;
    public static final int SUCCESS = 0;
    public static final int ERROR = -1;
    public static final int ALREADY_EXISTS = -2;
    public static final int ERROR_NO_INIT = -3;
    public static final int ERROR_BAD_VALUE = -4;
    public static final int ERROR_INVALID_OPERATION = -5;
    public static final int ERROR_NO_MEMORY = -6;
    public static final int ERROR_DEAD_OBJECT = -7;
    public static final java.lang.String EFFECT_INSERT = "Insert";
    public static final java.lang.String EFFECT_AUXILIARY = "Auxiliary";
    public static final java.lang.String EFFECT_PRE_PROCESSING = "Pre Processing";
    public static final java.lang.String EFFECT_POST_PROCESSING = "Post Processing";
    public final java.lang.Object mListenerLock = null;
    public android.media.audiofx.AudioEffect.NativeEventHandler mNativeEventHandler;
    public static final java.lang.String ACTION_DISPLAY_AUDIO_EFFECT_CONTROL_PANEL = "android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL";
    public static final java.lang.String ACTION_OPEN_AUDIO_EFFECT_CONTROL_SESSION = "android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION";
    public static final java.lang.String ACTION_CLOSE_AUDIO_EFFECT_CONTROL_SESSION = "android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION";
    public static final java.lang.String EXTRA_AUDIO_SESSION = "android.media.extra.AUDIO_SESSION";
    public static final java.lang.String EXTRA_PACKAGE_NAME = "android.media.extra.PACKAGE_NAME";
    public static final java.lang.String EXTRA_CONTENT_TYPE = "android.media.extra.CONTENT_TYPE";
    public static final int CONTENT_TYPE_MUSIC = 0;
    public static final int CONTENT_TYPE_MOVIE = 1;
    public static final int CONTENT_TYPE_GAME = 2;
    public static final int CONTENT_TYPE_VOICE = 3;
    public AudioEffect(java.util.UUID p0, java.util.UUID p1, int p2, int p3) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public AudioEffect(java.util.UUID p0, android.media.AudioDeviceAttributes p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public static boolean isEffectSupportedForDevice(java.util.UUID p0, android.media.AudioDeviceAttributes p1) { return false; }
    public void release() {}
    protected void finalize() {}
    public android.media.audiofx.AudioEffect.Descriptor getDescriptor() throws java.lang.IllegalStateException { return null; }
    public static android.media.audiofx.AudioEffect.Descriptor[] queryEffects() { return null; }
    public static android.media.audiofx.AudioEffect.Descriptor[] queryPreProcessings(int p0) { return null; }
    public static boolean isEffectTypeAvailable(java.util.UUID p0) { return false; }
    public int setEnabled(boolean p0) throws java.lang.IllegalStateException { return 0; }
    public int setParameter(byte[] p0, byte[] p1) throws java.lang.IllegalStateException { return 0; }
    public int setParameter(int p0, int p1) throws java.lang.IllegalStateException { return 0; }
    public int setParameter(int p0, short p1) throws java.lang.IllegalStateException { return 0; }
    public int setParameter(int p0, byte[] p1) throws java.lang.IllegalStateException { return 0; }
    public int setParameter(int[] p0, int[] p1) throws java.lang.IllegalStateException { return 0; }
    public int setParameter(int[] p0, short[] p1) throws java.lang.IllegalStateException { return 0; }
    public int setParameter(int[] p0, byte[] p1) throws java.lang.IllegalStateException { return 0; }
    public int getParameter(byte[] p0, byte[] p1) throws java.lang.IllegalStateException { return 0; }
    public int getParameter(int p0, byte[] p1) throws java.lang.IllegalStateException { return 0; }
    public int getParameter(int p0, int[] p1) throws java.lang.IllegalStateException { return 0; }
    public int getParameter(int p0, short[] p1) throws java.lang.IllegalStateException { return 0; }
    public int getParameter(int[] p0, int[] p1) throws java.lang.IllegalStateException { return 0; }
    public int getParameter(int[] p0, short[] p1) throws java.lang.IllegalStateException { return 0; }
    public int getParameter(int[] p0, byte[] p1) throws java.lang.IllegalStateException { return 0; }
    public int command(int p0, byte[] p1, byte[] p2) throws java.lang.IllegalStateException { return 0; }
    public int getId() throws java.lang.IllegalStateException { return 0; }
    public boolean getEnabled() throws java.lang.IllegalStateException { return false; }
    public boolean hasControl() throws java.lang.IllegalStateException { return false; }
    public void setEnableStatusListener(android.media.audiofx.AudioEffect.OnEnableStatusChangeListener p0) {}
    public void setControlStatusListener(android.media.audiofx.AudioEffect.OnControlStatusChangeListener p0) {}
    public void setParameterListener(android.media.audiofx.AudioEffect.OnParameterChangeListener p0) {}
    public void checkState(java.lang.String p0) throws java.lang.IllegalStateException {}
    public void checkStatus(int p0) {}
    public static boolean isError(int p0) { return false; }
    public static int byteArrayToInt(byte[] p0) { return 0; }
    public static int byteArrayToInt(byte[] p0, int p1) { return 0; }
    public static byte[] intToByteArray(int p0) { return null; }
    public static short byteArrayToShort(byte[] p0) { return 0; }
    public static short byteArrayToShort(byte[] p0, int p1) { return 0; }
    public static byte[] shortToByteArray(short p0) { return null; }
    public static float byteArrayToFloat(byte[] p0) { return 0.0f; }
    public static float byteArrayToFloat(byte[] p0, int p1) { return 0.0f; }
    public static byte[] floatToByteArray(float p0) { return null; }
    public static byte[] concatArrays(byte[]... p0) { return null; }

    public static class Descriptor {
        public java.util.UUID type;
        public java.util.UUID uuid;
        public java.lang.String connectMode;
        public java.lang.String name;
        public java.lang.String implementor;
        public Descriptor() {}
        public Descriptor(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
        public Descriptor(android.os.Parcel p0) {}
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
    }

    private class NativeEventHandler extends android.os.Handler {
        public NativeEventHandler(android.media.audiofx.AudioEffect p0, android.media.audiofx.AudioEffect p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface OnControlStatusChangeListener {
        public void onControlStatusChange(android.media.audiofx.AudioEffect p0, boolean p1);
    }

    public static interface OnEnableStatusChangeListener {
        public void onEnableStatusChange(android.media.audiofx.AudioEffect p0, boolean p1);
    }

    public static interface OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.AudioEffect p0, int p1, byte[] p2, byte[] p3);
    }
}
