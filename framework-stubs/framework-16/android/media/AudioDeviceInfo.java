package android.media;

public final class AudioDeviceInfo {
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_BUILTIN_EARPIECE = 1;
    public static final int TYPE_BUILTIN_SPEAKER = 2;
    public static final int TYPE_WIRED_HEADSET = 3;
    public static final int TYPE_WIRED_HEADPHONES = 4;
    public static final int TYPE_LINE_ANALOG = 5;
    public static final int TYPE_LINE_DIGITAL = 6;
    public static final int TYPE_BLUETOOTH_SCO = 7;
    public static final int TYPE_BLUETOOTH_A2DP = 8;
    public static final int TYPE_HDMI = 9;
    public static final int TYPE_HDMI_ARC = 10;
    public static final int TYPE_USB_DEVICE = 11;
    public static final int TYPE_USB_ACCESSORY = 12;
    public static final int TYPE_DOCK = 13;
    public static final int TYPE_FM = 14;
    public static final int TYPE_BUILTIN_MIC = 15;
    public static final int TYPE_FM_TUNER = 16;
    public static final int TYPE_TV_TUNER = 17;
    public static final int TYPE_TELEPHONY = 18;
    public static final int TYPE_AUX_LINE = 19;
    public static final int TYPE_IP = 20;
    public static final int TYPE_BUS = 21;
    public static final int TYPE_USB_HEADSET = 22;
    public static final int TYPE_HEARING_AID = 23;
    public static final int TYPE_BUILTIN_SPEAKER_SAFE = 24;
    public static final int TYPE_REMOTE_SUBMIX = 25;
    public static final int TYPE_BLE_HEADSET = 26;
    public static final int TYPE_BLE_SPEAKER = 27;
    @android.annotation.RequiresPermission("android.permission.CAPTURE_AUDIO_OUTPUT")
    public static final int TYPE_ECHO_REFERENCE = 28;
    public static final int TYPE_HDMI_EARC = 29;
    public static final int TYPE_BLE_BROADCAST = 30;
    public static final int TYPE_DOCK_ANALOG = 31;
    @android.annotation.FlaggedApi("android.media.audio.enable_multichannel_group_device")
    public static final int TYPE_MULTICHANNEL_GROUP = 32;
    static boolean isValidAudioDeviceTypeOut(int p0) { return false; }
    static boolean isValidAudioDeviceTypeIn(int p0) { return false; }
    public static void enforceValidAudioDeviceTypeOut(int p0) {}
    public static void enforceValidAudioDeviceTypeIn(int p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public AudioDeviceInfo(android.media.AudioDevicePort p0) {}
    public android.media.AudioDevicePort getPort() { return null; }
    public int getInternalType() { return 0; }
    public int getId() { return 0; }
    public java.lang.CharSequence getProductName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getAddress() { return null; }
    public boolean isSource() { return false; }
    public boolean isSink() { return false; }
    @android.annotation.NonNull
    public int[] getSampleRates() { return null; }
    @android.annotation.NonNull
    public int[] getChannelMasks() { return null; }
    @android.annotation.NonNull
    public int[] getChannelIndexMasks() { return null; }
    @android.annotation.NonNull
    public int[] getChannelCounts() { return null; }
    @android.annotation.FlaggedApi("android.media.audio.speaker_layout_api")
    public int getSpeakerLayoutChannelMask() { return 0; }
    @android.annotation.NonNull
    public int[] getEncodings() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.media.AudioProfile> getAudioProfiles() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.media.AudioDescriptor> getAudioDescriptors() { return null; }
    @android.annotation.NonNull
    public int[] getEncapsulationModes() { return null; }
    @android.annotation.NonNull
    public int[] getEncapsulationMetadataTypes() { return null; }
    public int getType() { return 0; }
    public static int convertDeviceTypeToInternalDevice(int p0) { return 0; }
    public static int convertInternalDeviceToDeviceType(int p0) { return 0; }
    public static int convertDeviceTypeToInternalInputDevice(int p0) { return 0; }
    public static int convertDeviceTypeToInternalInputDevice(int p0, java.lang.String p1) { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioDeviceType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioDeviceTypeIn {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioDeviceTypeOut {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @android.annotation.FlaggedApi("android.media.audio.speaker_layout_api")
    public static @interface SpeakerLayoutChannelMask {
    }
}
