package android.media;

public final class AudioFocusRequest {
    private static final android.media.AudioAttributes FOCUS_DEFAULT_ATTR = null;
    public static final java.lang.String KEY_ACCESSIBILITY_FORCE_FOCUS_DUCKING = "a11y_force_ducking";
    private final android.media.AudioManager.OnAudioFocusChangeListener mFocusListener = null;
    private final android.os.Handler mListenerHandler = null;
    private final android.media.AudioAttributes mAttr = null;
    private final int mFocusGain = 0;
    private final int mFlags = 0;
    private AudioFocusRequest(android.media.AudioManager.OnAudioFocusChangeListener p0, android.os.Handler p1, android.media.AudioAttributes p2, int p3, int p4) {}
    static final boolean isValidFocusGain(int p0) { return false; }
    public android.media.AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() { return null; }
    public android.os.Handler getOnAudioFocusChangeListenerHandler() { return null; }
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public int getFocusGain() { return 0; }
    public boolean willPauseWhenDucked() { return false; }
    public boolean acceptsDelayedFocusGain() { return false; }
    @android.annotation.SystemApi
    public boolean locksFocus() { return false; }
    int getFlags() { return 0; }

    public static final class Builder {
        private android.media.AudioManager.OnAudioFocusChangeListener mFocusListener;
        private android.os.Handler mListenerHandler;
        private android.media.AudioAttributes mAttr;
        private int mFocusGain;
        private boolean mPausesOnDuck;
        private boolean mDelayedFocus;
        private boolean mFocusLocked;
        private boolean mA11yForceDucking;
        public Builder(int p0) {}
        public Builder(android.media.AudioFocusRequest p0) {}
        public android.media.AudioFocusRequest.Builder setFocusGain(int p0) { return null; }
        public android.media.AudioFocusRequest.Builder setOnAudioFocusChangeListener(android.media.AudioManager.OnAudioFocusChangeListener p0) { return null; }
        android.media.AudioFocusRequest.Builder setOnAudioFocusChangeListenerInt(android.media.AudioManager.OnAudioFocusChangeListener p0, android.os.Handler p1) { return null; }
        public android.media.AudioFocusRequest.Builder setOnAudioFocusChangeListener(android.media.AudioManager.OnAudioFocusChangeListener p0, android.os.Handler p1) { return null; }
        public android.media.AudioFocusRequest.Builder setAudioAttributes(android.media.AudioAttributes p0) { return null; }
        public android.media.AudioFocusRequest.Builder setWillPauseWhenDucked(boolean p0) { return null; }
        public android.media.AudioFocusRequest.Builder setAcceptsDelayedFocusGain(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioFocusRequest.Builder setLocksFocus(boolean p0) { return null; }
        public android.media.AudioFocusRequest.Builder setForceDucking(boolean p0) { return null; }
        public android.media.AudioFocusRequest build() { return null; }
    }
}
