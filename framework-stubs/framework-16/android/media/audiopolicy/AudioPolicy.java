package android.media.audiopolicy;

@android.annotation.SystemApi
public class AudioPolicy {
    public static final int POLICY_STATUS_UNREGISTERED = 1;
    public static final int POLICY_STATUS_REGISTERED = 2;
    public static final int FOCUS_POLICY_DUCKING_IN_APP = 0;
    public static final int FOCUS_POLICY_DUCKING_DEFAULT = 0;
    public static final int FOCUS_POLICY_DUCKING_IN_POLICY = 1;
    public android.media.audiopolicy.AudioPolicyConfig getConfig() { return null; }
    public boolean hasFocusListener() { return false; }
    public boolean isFocusPolicy() { return false; }
    public boolean isTestFocusPolicy() { return false; }
    public boolean isVolumeController() { return false; }
    @android.annotation.Nullable
    public android.media.projection.MediaProjection getMediaProjection() { return null; }
    public android.content.AttributionSource getAttributionSource() { return null; }
    public int attachMixes(java.util.List<android.media.audiopolicy.AudioMix> p0) { return 0; }
    public int detachMixes(java.util.List<android.media.audiopolicy.AudioMix> p0) { return 0; }
    @android.annotation.FlaggedApi("android.media.audiopolicy.audio_policy_update_mixing_rules_api")
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int updateMixingRules(java.util.List<android.util.Pair<android.media.audiopolicy.AudioMix, android.media.audiopolicy.AudioMixingRule>> p0) { return 0; }
    @android.annotation.SystemApi
    public boolean setUidDeviceAffinity(int p0, java.util.List<android.media.AudioDeviceInfo> p1) { return false; }
    @android.annotation.SystemApi
    public boolean removeUidDeviceAffinity(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean removeUserIdDeviceAffinity(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean setUserIdDeviceAffinity(int p0, java.util.List<android.media.AudioDeviceInfo> p1) { return false; }
    public void reset() {}
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("android.media.audiopolicy.audio_mix_test_api")
    public java.util.List<android.media.audiopolicy.AudioMix> getMixes() { return null; }
    public void setRegistration(java.lang.String p0) {}
    public java.lang.String getRegistration() { return null; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.media.audiopolicy.enable_fade_manager_configuration")
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public int setFadeManagerConfigurationForFocusLoss(android.media.FadeManagerConfiguration p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.media.audiopolicy.enable_fade_manager_configuration")
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public int clearFadeManagerConfigurationForFocusLoss() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.media.audiopolicy.enable_fade_manager_configuration")
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    @android.annotation.NonNull
    public android.media.FadeManagerConfiguration getFadeManagerConfigurationForFocusLoss() { return null; }
    public int getFocusDuckingBehavior() { return 0; }
    public int setFocusDuckingBehavior(int p0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    @android.annotation.NonNull
    public java.util.List<android.media.AudioFocusInfo> getFocusStack() { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void sendFocusLossAndUpdate(android.media.AudioFocusInfo p0) throws java.lang.IllegalStateException {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public boolean sendFocusLoss(android.media.AudioFocusInfo p0) throws java.lang.IllegalStateException { return false; }
    public android.media.AudioRecord createAudioRecordSink(android.media.audiopolicy.AudioMix p0) throws java.lang.IllegalArgumentException { return null; }
    public android.media.AudioTrack createAudioTrackSource(android.media.audiopolicy.AudioMix p0) throws java.lang.IllegalArgumentException { return null; }
    public void invalidateCaptorsAndInjectors() {}
    public int getStatus() { return 0; }
    public android.media.audiopolicy.IAudioPolicyCallback cb() { return null; }
    public java.lang.String toLogFriendlyString() { return null; }

    public static abstract class AudioPolicyFocusListener {
        public AudioPolicyFocusListener() {}
        public void onAudioFocusGrant(android.media.AudioFocusInfo p0, int p1) {}
        public void onAudioFocusLoss(android.media.AudioFocusInfo p0, boolean p1) {}
        public void onAudioFocusRequest(android.media.AudioFocusInfo p0, int p1) {}
        public void onAudioFocusAbandon(android.media.AudioFocusInfo p0) {}
    }

    public static abstract class AudioPolicyStatusListener {
        public AudioPolicyStatusListener() {}
        public void onStatusChange() {}
        public void onMixStateUpdate(android.media.audiopolicy.AudioMix p0) {}
    }

    public static abstract class AudioPolicyVolumeCallback {
        public AudioPolicyVolumeCallback() {}
        public void onVolumeAdjustment(int p0) {}
    }

    public static class Builder {
        public Builder(android.content.Context p0) {}
        @android.annotation.NonNull
        public android.media.audiopolicy.AudioPolicy.Builder addMix(android.media.audiopolicy.AudioMix p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.NonNull
        public android.media.audiopolicy.AudioPolicy.Builder setLooper(android.os.Looper p0) throws java.lang.IllegalArgumentException { return null; }
        public void setAudioPolicyFocusListener(android.media.audiopolicy.AudioPolicy.AudioPolicyFocusListener p0) {}
        @android.annotation.NonNull
        public android.media.audiopolicy.AudioPolicy.Builder setIsAudioFocusPolicy(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.media.audiopolicy.AudioPolicy.Builder setIsTestFocusPolicy(boolean p0) { return null; }
        public void setAudioPolicyStatusListener(android.media.audiopolicy.AudioPolicy.AudioPolicyStatusListener p0) {}
        @android.annotation.NonNull
        public android.media.audiopolicy.AudioPolicy.Builder setAudioPolicyVolumeCallback(android.media.audiopolicy.AudioPolicy.AudioPolicyVolumeCallback p0) { return null; }
        @android.annotation.NonNull
        public android.media.audiopolicy.AudioPolicy.Builder setMediaProjection(android.media.projection.MediaProjection p0) { return null; }
        @android.annotation.NonNull
        public android.media.audiopolicy.AudioPolicy build() { return null; }
    }

    private class EventHandler extends android.os.Handler {
        public EventHandler(android.media.audiopolicy.AudioPolicy p0, android.media.audiopolicy.AudioPolicy p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PolicyStatus {
    }
}
