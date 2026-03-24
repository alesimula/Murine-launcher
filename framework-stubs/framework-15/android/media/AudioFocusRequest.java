package android.media;

public final class AudioFocusRequest {
    public static final java.lang.String KEY_ACCESSIBILITY_FORCE_FOCUS_DUCKING = "a11y_force_ducking";
    static final boolean isValidFocusGain(int p0) { return false; }
    @android.annotation.Nullable
    public android.media.AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() { return null; }
    @android.annotation.Nullable
    public android.os.Handler getOnAudioFocusChangeListenerHandler() { return null; }
    @android.annotation.NonNull
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public int getFocusGain() { return 0; }
    public boolean willPauseWhenDucked() { return false; }
    public boolean acceptsDelayedFocusGain() { return false; }
    @android.annotation.SystemApi
    public boolean locksFocus() { return false; }
    int getFlags() { return 0; }

    public static final class Builder {
        public Builder(int p0) {}
        public Builder(android.media.AudioFocusRequest p0) {}
        @android.annotation.NonNull
        public android.media.AudioFocusRequest.Builder setFocusGain(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioFocusRequest.Builder setOnAudioFocusChangeListener(android.media.AudioManager.OnAudioFocusChangeListener p0) { return null; }
        @android.annotation.NonNull
        android.media.AudioFocusRequest.Builder setOnAudioFocusChangeListenerInt(android.media.AudioManager.OnAudioFocusChangeListener p0, android.os.Handler p1) { return null; }
        @android.annotation.NonNull
        public android.media.AudioFocusRequest.Builder setOnAudioFocusChangeListener(android.media.AudioManager.OnAudioFocusChangeListener p0, android.os.Handler p1) { return null; }
        @android.annotation.NonNull
        public android.media.AudioFocusRequest.Builder setAudioAttributes(android.media.AudioAttributes p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioFocusRequest.Builder setWillPauseWhenDucked(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioFocusRequest.Builder setAcceptsDelayedFocusGain(boolean p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.NonNull
        public android.media.AudioFocusRequest.Builder setLocksFocus(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioFocusRequest.Builder setForceDucking(boolean p0) { return null; }
        public android.media.AudioFocusRequest build() { return null; }
    }
}
