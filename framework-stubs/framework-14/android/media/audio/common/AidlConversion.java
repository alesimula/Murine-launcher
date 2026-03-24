package android.media.audio.common;

public class AidlConversion {
    public AidlConversion() {}
    public static int aidl2legacy_AudioChannelLayout_audio_channel_mask_t(android.media.audio.common.AudioChannelLayout p0, boolean p1) { return 0; }
    public static android.media.audio.common.AudioChannelLayout legacy2aidl_audio_channel_mask_t_AudioChannelLayout(int p0, boolean p1) { return null; }
    public static int aidl2legacy_AudioFormatDescription_audio_format_t(android.media.audio.common.AudioFormatDescription p0) { return 0; }
    public static android.media.audio.common.AudioFormatDescription legacy2aidl_audio_format_t_AudioFormatDescription(int p0) { return null; }
    public static native int aidl2legacy_AudioEncapsulationMode_audio_encapsulation_mode_t(int p0);
    public static native int legacy2aidl_audio_encapsulation_mode_t_AudioEncapsulationMode(int p0);
    public static native int aidl2legacy_AudioStreamType_audio_stream_type_t(int p0);
    public static native int legacy2aidl_audio_stream_type_t_AudioStreamType(int p0);
    public static native int aidl2legacy_AudioUsage_audio_usage_t(int p0);
    public static native int legacy2aidl_audio_usage_t_AudioUsage(int p0);
    public static int aidl2api_AudioChannelLayout_AudioFormatChannelMask(android.media.audio.common.AudioChannelLayout p0, boolean p1) { return 0; }
    public static android.media.AudioFormat aidl2api_AudioConfig_AudioFormat(android.media.audio.common.AudioConfig p0, boolean p1) { return null; }
    public static android.media.AudioFormat aidl2api_AudioConfigBase_AudioFormat(android.media.audio.common.AudioConfigBase p0, boolean p1) { return null; }
    public static int aidl2api_AudioFormat_AudioFormatEncoding(android.media.audio.common.AudioFormatDescription p0) { return 0; }
    public static android.media.audio.common.AudioPort api2aidl_AudioDeviceAttributes_AudioPort(android.media.AudioDeviceAttributes p0) { return null; }
    public static android.media.audio.common.ExtraAudioDescriptor api2aidl_AudioDescriptor_ExtraAudioDescriptor(android.media.AudioDescriptor p0) { return null; }
    public static android.media.AudioDescriptor aidl2api_ExtraAudioDescriptor_AudioDescriptor(android.media.audio.common.ExtraAudioDescriptor p0) { return null; }
    @android.media.audio.common.AudioStandard
    public static int api2aidl_AudioDescriptorStandard_AudioStandard(int p0) { return 0; }
    public static int aidl2api_AudioStandard_AudioDescriptorStandard(int p0) { return 0; }
    @android.media.audio.common.AudioEncapsulationType
    public static int api2aidl_AudioProfileEncapsulationType_AudioEncapsulationType(int p0) { return 0; }
    public static int aidl2api_AudioEncapsulationType_AudioProfileEncapsulationType(int p0) { return 0; }
    public static android.media.audio.common.AudioDeviceDescription api2aidl_NativeType_AudioDeviceDescription(int p0) { return null; }
}
