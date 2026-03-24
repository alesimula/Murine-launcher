package android.bluetooth;

@android.annotation.FlaggedApi("com.android.bluetooth.flags.aics_api")
public class AudioInputControl {
    public static final int AUDIO_INPUT_STATUS_ACTIVE = 1;
    public static final int AUDIO_INPUT_STATUS_INACTIVE = 0;
    public static final int AUDIO_INPUT_STATUS_UNKNOWN = -1;
    public static final int AUDIO_INPUT_TYPE_AMBIENT = 7;
    public static final int AUDIO_INPUT_TYPE_ANALOG = 3;
    public static final int AUDIO_INPUT_TYPE_BLUETOOTH = 1;
    public static final int AUDIO_INPUT_TYPE_DIGITAL = 4;
    public static final int AUDIO_INPUT_TYPE_MICROPHONE = 2;
    public static final int AUDIO_INPUT_TYPE_RADIO = 5;
    public static final int AUDIO_INPUT_TYPE_STREAMING = 6;
    public static final int AUDIO_INPUT_TYPE_UNSPECIFIED = 0;
    public static final int GAIN_MODE_AUTOMATIC = 3;
    public static final int GAIN_MODE_AUTOMATIC_ONLY = 1;
    public static final int GAIN_MODE_MANUAL = 2;
    public static final int GAIN_MODE_MANUAL_ONLY = 0;
    public static final int MUTE_DISABLED = 2;
    public static final int MUTE_MUTED = 1;
    public static final int MUTE_NOT_MUTED = 0;
    AudioInputControl() {}
    public int getAudioInputStatus() { return 0; }
    public int getAudioInputType() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getDescription() { return null; }
    public int getGainMode() { return 0; }
    public int getGainSetting() { return 0; }
    public int getGainSettingMax() { return 0; }
    public int getGainSettingMin() { return 0; }
    public int getGainSettingUnit() { return 0; }
    public int getMute() { return 0; }
    public boolean isDescriptionWritable() { return false; }
    public void registerCallback(java.util.concurrent.Executor p0, android.bluetooth.AudioInputControl.AudioInputCallback p1) {}
    public boolean setDescription(java.lang.String p0) { return false; }
    public boolean setGainMode(int p0) { return false; }
    public boolean setGainSetting(int p0) { return false; }
    public boolean setMute(int p0) { return false; }
    public void unregisterCallback(android.bluetooth.AudioInputControl.AudioInputCallback p0) {}

    public static interface AudioInputCallback {
        default public void onAudioInputStatusChanged(int p0) {}
        default public void onDescriptionChanged(java.lang.String p0) {}
        default public void onGainModeChanged(int p0) {}
        default public void onGainSettingChanged(int p0) {}
        default public void onMuteChanged(int p0) {}
        default public void onSetGainModeFailed() {}
        default public void onSetGainSettingFailed() {}
        default public void onSetMuteFailed() {}
    }
}
