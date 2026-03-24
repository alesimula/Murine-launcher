package android.media;

public final class MediaCodecInfo {
    @android.annotation.FlaggedApi("android.media.codec.in_process_sw_audio_codec")
    public static final int SECURITY_MODEL_SANDBOXED = 0;
    @android.annotation.FlaggedApi("android.media.codec.in_process_sw_audio_codec")
    public static final int SECURITY_MODEL_MEMORY_SAFE = 1;
    @android.annotation.FlaggedApi("android.media.codec.in_process_sw_audio_codec")
    public static final int SECURITY_MODEL_TRUSTED_CONTENT_ONLY = 2;
    MediaCodecInfo(java.lang.String p0, java.lang.String p1, int p2, android.media.MediaCodecInfo.CodecCapabilities[] p3) {}
    @android.annotation.NonNull
    public final java.lang.String getName() { return null; }
    @android.annotation.NonNull
    public final java.lang.String getCanonicalName() { return null; }
    public final boolean isAlias() { return false; }
    public final boolean isEncoder() { return false; }
    public final boolean isVendor() { return false; }
    public final boolean isSoftwareOnly() { return false; }
    public final boolean isHardwareAccelerated() { return false; }
    public final java.lang.String[] getSupportedTypes() { return null; }
    @android.annotation.FlaggedApi("android.media.codec.in_process_sw_audio_codec")
    public int getSecurityModel() { return 0; }
    public final android.media.MediaCodecInfo.CodecCapabilities getCapabilitiesForType(java.lang.String p0) { return null; }
    public android.media.MediaCodecInfo makeRegular() { return null; }

    public static final class AudioCapabilities {
        public static android.media.MediaCodecInfo.AudioCapabilities create(android.media.MediaFormat p0, android.media.MediaCodecInfo.CodecCapabilities.CodecCapsLegacyImpl p1) { return null; }
        AudioCapabilities(android.media.MediaCodecInfo.AudioCapabilities.AudioCapsIntf p0) {}
        public android.util.Range<java.lang.Integer> getBitrateRange() { return null; }
        public int[] getSupportedSampleRates() { return null; }
        public android.util.Range<java.lang.Integer>[] getSupportedSampleRateRanges() { return null; }
        @android.annotation.SuppressLint("ArrayReturn")
        @android.annotation.NonNull
        public android.util.Range<java.lang.Integer>[] getInputChannelCountRanges() { return null; }
        public int getMaxInputChannelCount() { return 0; }
        public int getMinInputChannelCount() { return 0; }
        public boolean isSampleRateSupported(int p0) { return false; }
        public void getDefaultFormat(android.media.MediaFormat p0) {}
        public boolean supportsFormat(android.media.MediaFormat p0) { return false; }

        static interface AudioCapsIntf {
            public android.util.Range<java.lang.Integer> getBitrateRange();
            public int[] getSupportedSampleRates();
            public android.util.Range<java.lang.Integer>[] getSupportedSampleRateRanges();
            public int getMaxInputChannelCount();
            public int getMinInputChannelCount();
            public android.util.Range<java.lang.Integer>[] getInputChannelCountRanges();
            public boolean isSampleRateSupported(int p0);
            public void getDefaultFormat(android.media.MediaFormat p0);
            public boolean supportsFormat(android.media.MediaFormat p0);
        }

        static final class AudioCapsLegacyImpl implements android.media.MediaCodecInfo.AudioCapabilities.AudioCapsIntf {
            static final java.util.Set<java.lang.String> AUDIO_LEVEL_CRITICAL_FORMAT_KEYS = null;
            public android.util.Range<java.lang.Integer> getBitrateRange() { return null; }
            public int[] getSupportedSampleRates() { return null; }
            public android.util.Range<java.lang.Integer>[] getSupportedSampleRateRanges() { return null; }
            public int getMaxInputChannelCount() { return 0; }
            public int getMinInputChannelCount() { return 0; }
            public android.util.Range<java.lang.Integer>[] getInputChannelCountRanges() { return null; }
            public static android.media.MediaCodecInfo.AudioCapabilities.AudioCapsLegacyImpl create(android.media.MediaFormat p0, android.media.MediaCodecInfo.CodecCapabilities.CodecCapsLegacyImpl p1) { return null; }
            public boolean isSampleRateSupported(int p0) { return false; }
            public void getDefaultFormat(android.media.MediaFormat p0) {}
            public boolean supportsFormat(android.media.MediaFormat p0) { return false; }
        }

        static final class AudioCapsNativeImpl implements android.media.MediaCodecInfo.AudioCapabilities.AudioCapsIntf {
            AudioCapsNativeImpl(android.util.Range<java.lang.Integer> p0, int[] p1, android.util.Range<java.lang.Integer>[] p2, android.util.Range<java.lang.Integer>[] p3) {}
            public android.util.Range<java.lang.Integer> getBitrateRange() { return null; }
            public int[] getSupportedSampleRates() { return null; }
            public android.util.Range<java.lang.Integer>[] getSupportedSampleRateRanges() { return null; }
            public android.util.Range<java.lang.Integer>[] getInputChannelCountRanges() { return null; }
            public int getMaxInputChannelCount() { return 0; }
            public int getMinInputChannelCount() { return 0; }
            public boolean isSampleRateSupported(int p0) { return false; }
            public void getDefaultFormat(android.media.MediaFormat p0) {}
            public boolean supportsFormat(android.media.MediaFormat p0) { return false; }
        }
    }

    public static final class CodecCapabilities {
        public android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels;
        public static final int COLOR_FormatMonochrome = 1;
        public static final int COLOR_Format8bitRGB332 = 2;
        public static final int COLOR_Format12bitRGB444 = 3;
        public static final int COLOR_Format16bitARGB4444 = 4;
        public static final int COLOR_Format16bitARGB1555 = 5;
        public static final int COLOR_Format16bitRGB565 = 6;
        public static final int COLOR_Format16bitBGR565 = 7;
        public static final int COLOR_Format18bitRGB666 = 8;
        public static final int COLOR_Format18bitARGB1665 = 9;
        public static final int COLOR_Format19bitARGB1666 = 10;
        public static final int COLOR_Format24bitRGB888 = 11;
        public static final int COLOR_Format24bitBGR888 = 12;
        public static final int COLOR_Format24bitARGB1887 = 13;
        public static final int COLOR_Format25bitARGB1888 = 14;
        public static final int COLOR_Format32bitBGRA8888 = 15;
        public static final int COLOR_Format32bitARGB8888 = 16;
        public static final int COLOR_FormatYUV411Planar = 17;
        public static final int COLOR_FormatYUV411PackedPlanar = 18;
        public static final int COLOR_FormatYUV420Planar = 19;
        public static final int COLOR_FormatYUV420PackedPlanar = 20;
        public static final int COLOR_FormatYUV420SemiPlanar = 21;
        public static final int COLOR_FormatYUV422Planar = 22;
        public static final int COLOR_FormatYUV422PackedPlanar = 23;
        public static final int COLOR_FormatYUV422SemiPlanar = 24;
        public static final int COLOR_FormatYCbYCr = 25;
        public static final int COLOR_FormatYCrYCb = 26;
        public static final int COLOR_FormatCbYCrY = 27;
        public static final int COLOR_FormatCrYCbY = 28;
        public static final int COLOR_FormatYUV444Interleaved = 29;
        public static final int COLOR_FormatRawBayer8bit = 30;
        public static final int COLOR_FormatRawBayer10bit = 31;
        public static final int COLOR_FormatRawBayer8bitcompressed = 32;
        public static final int COLOR_FormatL2 = 33;
        public static final int COLOR_FormatL4 = 34;
        public static final int COLOR_FormatL8 = 35;
        public static final int COLOR_FormatL16 = 36;
        public static final int COLOR_FormatL24 = 37;
        public static final int COLOR_FormatL32 = 38;
        public static final int COLOR_FormatYUV420PackedSemiPlanar = 39;
        public static final int COLOR_FormatYUV422PackedSemiPlanar = 40;
        public static final int COLOR_Format18BitBGR666 = 41;
        public static final int COLOR_Format24BitARGB6666 = 42;
        public static final int COLOR_Format24BitABGR6666 = 43;
        @android.annotation.SuppressLint("AllUpper")
        public static final int COLOR_FormatYUVP010 = 54;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.p210_format_support")
        public static final int COLOR_FormatYUVP210 = 60;
        public static final int COLOR_TI_FormatYUV420PackedSemiPlanar = 2130706688;
        public static final int COLOR_FormatSurface = 2130708361;
        @android.annotation.SuppressLint("AllUpper")
        public static final int COLOR_Format64bitABGRFloat = 2130710294;
        public static final int COLOR_Format32bitABGR8888 = 2130747392;
        @android.annotation.SuppressLint("AllUpper")
        public static final int COLOR_Format32bitABGR2101010 = 2130750114;
        public static final int COLOR_FormatYUV420Flexible = 2135033992;
        public static final int COLOR_FormatYUV422Flexible = 2135042184;
        public static final int COLOR_FormatYUV444Flexible = 2135181448;
        public static final int COLOR_FormatRGBFlexible = 2134292616;
        public static final int COLOR_FormatRGBAFlexible = 2134288520;
        public static final int COLOR_QCOM_FormatYUV420SemiPlanar = 2141391872;
        public int[] colorFormats;
        public static final java.lang.String FEATURE_AdaptivePlayback = "adaptive-playback";
        public static final java.lang.String FEATURE_SecurePlayback = "secure-playback";
        public static final java.lang.String FEATURE_TunneledPlayback = "tunneled-playback";
        public static final java.lang.String FEATURE_DynamicTimestamp = "dynamic-timestamp";
        public static final java.lang.String FEATURE_FrameParsing = "frame-parsing";
        public static final java.lang.String FEATURE_MultipleFrames = "multiple-frames";
        public static final java.lang.String FEATURE_PartialFrame = "partial-frame";
        public static final java.lang.String FEATURE_IntraRefresh = "intra-refresh";
        public static final java.lang.String FEATURE_LowLatency = "low-latency";
        @android.annotation.SuppressLint("AllUpper")
        public static final java.lang.String FEATURE_QpBounds = "qp-bounds";
        @android.annotation.SuppressLint("AllUpper")
        public static final java.lang.String FEATURE_EncodingStatistics = "encoding-statistics";
        @android.annotation.SuppressLint("AllUpper")
        public static final java.lang.String FEATURE_HdrEditing = "hdr-editing";
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.hlg_editing")
        public static final java.lang.String FEATURE_HlgEditing = "hlg-editing";
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.dynamic_color_aspects")
        public static final java.lang.String FEATURE_DynamicColorAspects = "dynamic-color-aspects";
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.region_of_interest")
        public static final java.lang.String FEATURE_Roi = "region-of-interest";
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.null_output_surface")
        public static final java.lang.String FEATURE_DetachedSurface = "detached-surface";
        public static android.media.MediaCodecInfo.CodecCapabilities createFromProfileLevel(java.lang.String p0, int p1, int p2) { return null; }
        public CodecCapabilities() {}
        CodecCapabilities(android.media.MediaCodecInfo.CodecCapabilities.CodecCapsIntf p0) {}
        public android.media.MediaCodecInfo.CodecCapabilities dup() { return null; }
        public final boolean isFeatureSupported(java.lang.String p0) { return false; }
        public final boolean isFeatureRequired(java.lang.String p0) { return false; }
        public java.lang.String[] validFeatures() { return null; }
        public boolean isRegular() { return false; }
        public final boolean isFormatSupported(android.media.MediaFormat p0) { return false; }
        public android.media.MediaFormat getDefaultFormat() { return null; }
        public java.lang.String getMimeType() { return null; }
        public int getMaxSupportedInstances() { return 0; }
        @android.annotation.Nullable
        public android.media.MediaCodecInfo.AudioCapabilities getAudioCapabilities() { return null; }
        @android.annotation.Nullable
        public android.media.MediaCodecInfo.EncoderCapabilities getEncoderCapabilities() { return null; }
        @android.annotation.Nullable
        public android.media.MediaCodecInfo.VideoCapabilities getVideoCapabilities() { return null; }

        static interface CodecCapsIntf {
            public android.media.MediaCodecInfo.CodecCapabilities.CodecCapsIntf dup();
            public boolean isFeatureSupported(java.lang.String p0);
            public boolean isFeatureRequired(java.lang.String p0);
            public boolean isFormatSupported(android.media.MediaFormat p0);
            public android.media.MediaFormat getDefaultFormat();
            public java.lang.String getMimeType();
            public int getMaxSupportedInstances();
            public android.media.MediaCodecInfo.AudioCapabilities getAudioCapabilities();
            public android.media.MediaCodecInfo.VideoCapabilities getVideoCapabilities();
            public android.media.MediaCodecInfo.EncoderCapabilities getEncoderCapabilities();
            public boolean isRegular();
            public java.lang.String[] validFeatures();
            public android.media.MediaCodecInfo.CodecProfileLevel[] getProfileLevels();
            public int[] getColorFormats();
        }

        static final class CodecCapsLegacyImpl implements android.media.MediaCodecInfo.CodecCapabilities.CodecCapsIntf {
            int mError;
            public android.media.MediaCodecInfo.CodecProfileLevel[] getProfileLevels() { return null; }
            public int[] getColorFormats() { return null; }
            public CodecCapsLegacyImpl() {}
            public android.media.MediaCodecInfo.CodecCapabilities.CodecCapsLegacyImpl dup() { return null; }
            public boolean isFeatureSupported(java.lang.String p0) { return false; }
            public boolean isFeatureRequired(java.lang.String p0) { return false; }
            public java.lang.String[] validFeatures() { return null; }
            public boolean isRegular() { return false; }
            public boolean isFormatSupported(android.media.MediaFormat p0) { return false; }
            public android.media.MediaFormat getDefaultFormat() { return null; }
            public java.lang.String getMimeType() { return null; }
            public int getMaxSupportedInstances() { return 0; }
            public android.media.MediaCodecInfo.AudioCapabilities getAudioCapabilities() { return null; }
            public android.media.MediaCodecInfo.EncoderCapabilities getEncoderCapabilities() { return null; }
            public android.media.MediaCodecInfo.VideoCapabilities getVideoCapabilities() { return null; }
            public static android.media.MediaCodecInfo.CodecCapabilities.CodecCapsLegacyImpl createFromProfileLevel(java.lang.String p0, int p1, int p2) { return null; }
            CodecCapsLegacyImpl(android.media.MediaCodecInfo.CodecProfileLevel[] p0, int[] p1, boolean p2, java.util.Map<java.lang.String, java.lang.Object> p3, java.util.Map<java.lang.String, java.lang.Object> p4) {}
            CodecCapsLegacyImpl(android.media.MediaCodecInfo.CodecProfileLevel[] p0, int[] p1, boolean p2, android.media.MediaFormat p3, android.media.MediaFormat p4) {}

            private static class FeatureList {
                public static android.media.MediaCodecInfo.Feature[] getFeatures(boolean p0) { return null; }
            }
        }

        static final class CodecCapsNativeImpl implements android.media.MediaCodecInfo.CodecCapabilities.CodecCapsIntf {
            public static android.media.MediaCodecInfo.CodecCapabilities.CodecCapsNativeImpl createFromProfileLevel(java.lang.String p0, int p1, int p2) { return null; }
            CodecCapsNativeImpl(android.media.MediaCodecInfo.CodecProfileLevel[] p0, int[] p1, android.media.MediaFormat p2, android.media.MediaCodecInfo.AudioCapabilities p3, android.media.MediaCodecInfo.VideoCapabilities p4, android.media.MediaCodecInfo.EncoderCapabilities p5) {}
            public android.media.MediaCodecInfo.CodecCapabilities.CodecCapsNativeImpl dup() { return null; }
            protected void finalize() {}
            public android.media.MediaCodecInfo.CodecProfileLevel[] getProfileLevels() { return null; }
            public int[] getColorFormats() { return null; }
            public boolean isFeatureSupported(java.lang.String p0) { return false; }
            public boolean isFeatureRequired(java.lang.String p0) { return false; }
            public java.lang.String[] validFeatures() { return null; }
            public boolean isRegular() { return false; }
            public boolean isFormatSupported(android.media.MediaFormat p0) { return false; }
            public android.media.MediaFormat getDefaultFormat() { return null; }
            public java.lang.String getMimeType() { return null; }
            public int getMaxSupportedInstances() { return 0; }
            public android.media.MediaCodecInfo.AudioCapabilities getAudioCapabilities() { return null; }
            public android.media.MediaCodecInfo.EncoderCapabilities getEncoderCapabilities() { return null; }
            public android.media.MediaCodecInfo.VideoCapabilities getVideoCapabilities() { return null; }
        }
    }

    public static final class CodecProfileLevel {
        public static final int AVCProfileBaseline = 1;
        public static final int AVCProfileMain = 2;
        public static final int AVCProfileExtended = 4;
        public static final int AVCProfileHigh = 8;
        public static final int AVCProfileHigh10 = 16;
        public static final int AVCProfileHigh422 = 32;
        public static final int AVCProfileHigh444 = 64;
        public static final int AVCProfileConstrainedBaseline = 65536;
        public static final int AVCProfileConstrainedHigh = 524288;
        public static final int AVCLevel1 = 1;
        public static final int AVCLevel1b = 2;
        public static final int AVCLevel11 = 4;
        public static final int AVCLevel12 = 8;
        public static final int AVCLevel13 = 16;
        public static final int AVCLevel2 = 32;
        public static final int AVCLevel21 = 64;
        public static final int AVCLevel22 = 128;
        public static final int AVCLevel3 = 256;
        public static final int AVCLevel31 = 512;
        public static final int AVCLevel32 = 1024;
        public static final int AVCLevel4 = 2048;
        public static final int AVCLevel41 = 4096;
        public static final int AVCLevel42 = 8192;
        public static final int AVCLevel5 = 16384;
        public static final int AVCLevel51 = 32768;
        public static final int AVCLevel52 = 65536;
        public static final int AVCLevel6 = 131072;
        public static final int AVCLevel61 = 262144;
        public static final int AVCLevel62 = 524288;
        public static final int H263ProfileBaseline = 1;
        public static final int H263ProfileH320Coding = 2;
        public static final int H263ProfileBackwardCompatible = 4;
        public static final int H263ProfileISWV2 = 8;
        public static final int H263ProfileISWV3 = 16;
        public static final int H263ProfileHighCompression = 32;
        public static final int H263ProfileInternet = 64;
        public static final int H263ProfileInterlace = 128;
        public static final int H263ProfileHighLatency = 256;
        public static final int H263Level10 = 1;
        public static final int H263Level20 = 2;
        public static final int H263Level30 = 4;
        public static final int H263Level40 = 8;
        public static final int H263Level45 = 16;
        public static final int H263Level50 = 32;
        public static final int H263Level60 = 64;
        public static final int H263Level70 = 128;
        public static final int MPEG4ProfileSimple = 1;
        public static final int MPEG4ProfileSimpleScalable = 2;
        public static final int MPEG4ProfileCore = 4;
        public static final int MPEG4ProfileMain = 8;
        public static final int MPEG4ProfileNbit = 16;
        public static final int MPEG4ProfileScalableTexture = 32;
        public static final int MPEG4ProfileSimpleFace = 64;
        public static final int MPEG4ProfileSimpleFBA = 128;
        public static final int MPEG4ProfileBasicAnimated = 256;
        public static final int MPEG4ProfileHybrid = 512;
        public static final int MPEG4ProfileAdvancedRealTime = 1024;
        public static final int MPEG4ProfileCoreScalable = 2048;
        public static final int MPEG4ProfileAdvancedCoding = 4096;
        public static final int MPEG4ProfileAdvancedCore = 8192;
        public static final int MPEG4ProfileAdvancedScalable = 16384;
        public static final int MPEG4ProfileAdvancedSimple = 32768;
        public static final int MPEG4Level0 = 1;
        public static final int MPEG4Level0b = 2;
        public static final int MPEG4Level1 = 4;
        public static final int MPEG4Level2 = 8;
        public static final int MPEG4Level3 = 16;
        public static final int MPEG4Level3b = 24;
        public static final int MPEG4Level4 = 32;
        public static final int MPEG4Level4a = 64;
        public static final int MPEG4Level5 = 128;
        public static final int MPEG4Level6 = 256;
        public static final int MPEG2ProfileSimple = 0;
        public static final int MPEG2ProfileMain = 1;
        public static final int MPEG2Profile422 = 2;
        public static final int MPEG2ProfileSNR = 3;
        public static final int MPEG2ProfileSpatial = 4;
        public static final int MPEG2ProfileHigh = 5;
        public static final int MPEG2LevelLL = 0;
        public static final int MPEG2LevelML = 1;
        public static final int MPEG2LevelH14 = 2;
        public static final int MPEG2LevelHL = 3;
        public static final int MPEG2LevelHP = 4;
        public static final int AACObjectMain = 1;
        public static final int AACObjectLC = 2;
        public static final int AACObjectSSR = 3;
        public static final int AACObjectLTP = 4;
        public static final int AACObjectHE = 5;
        public static final int AACObjectScalable = 6;
        public static final int AACObjectERLC = 17;
        public static final int AACObjectERScalable = 20;
        public static final int AACObjectLD = 23;
        public static final int AACObjectHE_PS = 29;
        public static final int AACObjectELD = 39;
        public static final int AACObjectXHE = 42;
        public static final int VP8Level_Version0 = 1;
        public static final int VP8Level_Version1 = 2;
        public static final int VP8Level_Version2 = 4;
        public static final int VP8Level_Version3 = 8;
        public static final int VP8ProfileMain = 1;
        public static final int VP9Profile0 = 1;
        public static final int VP9Profile1 = 2;
        public static final int VP9Profile2 = 4;
        public static final int VP9Profile3 = 8;
        public static final int VP9Profile2HDR = 4096;
        public static final int VP9Profile3HDR = 8192;
        public static final int VP9Profile2HDR10Plus = 16384;
        public static final int VP9Profile3HDR10Plus = 32768;
        public static final int VP9Level1 = 1;
        public static final int VP9Level11 = 2;
        public static final int VP9Level2 = 4;
        public static final int VP9Level21 = 8;
        public static final int VP9Level3 = 16;
        public static final int VP9Level31 = 32;
        public static final int VP9Level4 = 64;
        public static final int VP9Level41 = 128;
        public static final int VP9Level5 = 256;
        public static final int VP9Level51 = 512;
        public static final int VP9Level52 = 1024;
        public static final int VP9Level6 = 2048;
        public static final int VP9Level61 = 4096;
        public static final int VP9Level62 = 8192;
        public static final int HEVCProfileMain = 1;
        public static final int HEVCProfileMain10 = 2;
        public static final int HEVCProfileMainStill = 4;
        public static final int HEVCProfileMain10HDR10 = 4096;
        public static final int HEVCProfileMain10HDR10Plus = 8192;
        public static final int HEVCMainTierLevel1 = 1;
        public static final int HEVCHighTierLevel1 = 2;
        public static final int HEVCMainTierLevel2 = 4;
        public static final int HEVCHighTierLevel2 = 8;
        public static final int HEVCMainTierLevel21 = 16;
        public static final int HEVCHighTierLevel21 = 32;
        public static final int HEVCMainTierLevel3 = 64;
        public static final int HEVCHighTierLevel3 = 128;
        public static final int HEVCMainTierLevel31 = 256;
        public static final int HEVCHighTierLevel31 = 512;
        public static final int HEVCMainTierLevel4 = 1024;
        public static final int HEVCHighTierLevel4 = 2048;
        public static final int HEVCMainTierLevel41 = 4096;
        public static final int HEVCHighTierLevel41 = 8192;
        public static final int HEVCMainTierLevel5 = 16384;
        public static final int HEVCHighTierLevel5 = 32768;
        public static final int HEVCMainTierLevel51 = 65536;
        public static final int HEVCHighTierLevel51 = 131072;
        public static final int HEVCMainTierLevel52 = 262144;
        public static final int HEVCHighTierLevel52 = 524288;
        public static final int HEVCMainTierLevel6 = 1048576;
        public static final int HEVCHighTierLevel6 = 2097152;
        public static final int HEVCMainTierLevel61 = 4194304;
        public static final int HEVCHighTierLevel61 = 8388608;
        public static final int HEVCMainTierLevel62 = 16777216;
        public static final int HEVCHighTierLevel62 = 33554432;
        public static final int DolbyVisionProfileDvavPer = 1;
        public static final int DolbyVisionProfileDvavPen = 2;
        public static final int DolbyVisionProfileDvheDer = 4;
        public static final int DolbyVisionProfileDvheDen = 8;
        public static final int DolbyVisionProfileDvheDtr = 16;
        public static final int DolbyVisionProfileDvheStn = 32;
        public static final int DolbyVisionProfileDvheDth = 64;
        public static final int DolbyVisionProfileDvheDtb = 128;
        public static final int DolbyVisionProfileDvheSt = 256;
        public static final int DolbyVisionProfileDvavSe = 512;
        @android.annotation.SuppressLint("AllUpper")
        public static final int DolbyVisionProfileDvav110 = 1024;
        public static final int DolbyVisionLevelHd24 = 1;
        public static final int DolbyVisionLevelHd30 = 2;
        public static final int DolbyVisionLevelFhd24 = 4;
        public static final int DolbyVisionLevelFhd30 = 8;
        public static final int DolbyVisionLevelFhd60 = 16;
        public static final int DolbyVisionLevelUhd24 = 32;
        public static final int DolbyVisionLevelUhd30 = 64;
        public static final int DolbyVisionLevelUhd48 = 128;
        public static final int DolbyVisionLevelUhd60 = 256;
        @android.annotation.SuppressLint("AllUpper")
        public static final int DolbyVisionLevelUhd120 = 512;
        @android.annotation.SuppressLint("AllUpper")
        public static final int DolbyVisionLevel8k30 = 1024;
        @android.annotation.SuppressLint("AllUpper")
        public static final int DolbyVisionLevel8k60 = 2048;
        public static final int AV1ProfileMain8 = 1;
        public static final int AV1ProfileMain10 = 2;
        public static final int AV1ProfileMain10HDR10 = 4096;
        public static final int AV1ProfileMain10HDR10Plus = 8192;
        public static final int AV1Level2 = 1;
        public static final int AV1Level21 = 2;
        public static final int AV1Level22 = 4;
        public static final int AV1Level23 = 8;
        public static final int AV1Level3 = 16;
        public static final int AV1Level31 = 32;
        public static final int AV1Level32 = 64;
        public static final int AV1Level33 = 128;
        public static final int AV1Level4 = 256;
        public static final int AV1Level41 = 512;
        public static final int AV1Level42 = 1024;
        public static final int AV1Level43 = 2048;
        public static final int AV1Level5 = 4096;
        public static final int AV1Level51 = 8192;
        public static final int AV1Level52 = 16384;
        public static final int AV1Level53 = 32768;
        public static final int AV1Level6 = 65536;
        public static final int AV1Level61 = 131072;
        public static final int AV1Level62 = 262144;
        public static final int AV1Level63 = 524288;
        public static final int AV1Level7 = 1048576;
        public static final int AV1Level71 = 2097152;
        public static final int AV1Level72 = 4194304;
        public static final int AV1Level73 = 8388608;
        @android.annotation.SuppressLint("AllUpper")
        public static final int DTS_HDProfileHRA = 1;
        @android.annotation.SuppressLint("AllUpper")
        public static final int DTS_HDProfileLBR = 2;
        @android.annotation.SuppressLint("AllUpper")
        public static final int DTS_HDProfileMA = 4;
        @android.annotation.SuppressLint("AllUpper")
        public static final int DTS_UHDProfileP1 = 1;
        @android.annotation.SuppressLint("AllUpper")
        public static final int DTS_UHDProfileP2 = 2;
        @android.annotation.SuppressLint("AllUpper")
        public static final int AC4Profile00 = 257;
        @android.annotation.SuppressLint("AllUpper")
        public static final int AC4Profile10 = 513;
        @android.annotation.SuppressLint("AllUpper")
        public static final int AC4Profile11 = 514;
        @android.annotation.SuppressLint("AllUpper")
        public static final int AC4Profile21 = 1026;
        @android.annotation.SuppressLint("AllUpper")
        public static final int AC4Profile22 = 1028;
        @android.annotation.SuppressLint("AllUpper")
        public static final int AC4Level0 = 1;
        @android.annotation.SuppressLint("AllUpper")
        public static final int AC4Level1 = 2;
        @android.annotation.SuppressLint("AllUpper")
        public static final int AC4Level2 = 4;
        @android.annotation.SuppressLint("AllUpper")
        public static final int AC4Level3 = 8;
        @android.annotation.SuppressLint("AllUpper")
        public static final int AC4Level4 = 16;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVProfile422_10 = 1;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVProfile422_10HDR10 = 4096;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVProfile422_10HDR10Plus = 8192;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel1Band0 = 257;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel1Band1 = 258;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel1Band2 = 260;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel1Band3 = 264;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel11Band0 = 513;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel11Band1 = 514;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel11Band2 = 516;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel11Band3 = 520;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel2Band0 = 1025;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel2Band1 = 1026;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel2Band2 = 1028;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel2Band3 = 1032;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel21Band0 = 2049;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel21Band1 = 2050;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel21Band2 = 2052;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel21Band3 = 2056;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel3Band0 = 4097;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel3Band1 = 4098;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel3Band2 = 4100;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel3Band3 = 4104;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel31Band0 = 8193;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel31Band1 = 8194;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel31Band2 = 8196;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel31Band3 = 8200;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel4Band0 = 16385;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel4Band1 = 16386;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel4Band2 = 16388;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel4Band3 = 16392;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel41Band0 = 32769;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel41Band1 = 32770;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel41Band2 = 32772;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel41Band3 = 32776;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel5Band0 = 65537;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel5Band1 = 65538;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel5Band2 = 65540;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel5Band3 = 65544;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel51Band0 = 131073;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel51Band1 = 131074;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel51Band2 = 131076;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel51Band3 = 131080;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel6Band0 = 262145;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel6Band1 = 262146;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel6Band2 = 262148;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel6Band3 = 262152;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel61Band0 = 524289;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel61Band1 = 524290;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel61Band2 = 524292;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel61Band3 = 524296;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel7Band0 = 1048577;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel7Band1 = 1048578;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel7Band2 = 1048580;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel7Band3 = 1048584;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel71Band0 = 2097153;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel71Band1 = 2097154;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel71Band2 = 2097156;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.codec.apv_support")
        public static final int APVLevel71Band3 = 2097160;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
        public static final int IAMFProfileSimpleOpus = 16842753;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
        public static final int IAMFProfileSimpleAac = 16842754;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
        public static final int IAMFProfileSimpleFlac = 16842756;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
        public static final int IAMFProfileSimplePcm = 16842760;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
        public static final int IAMFProfileBaseOpus = 16908289;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
        public static final int IAMFProfileBaseAac = 16908290;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
        public static final int IAMFProfileBaseFlac = 16908292;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
        public static final int IAMFProfileBasePcm = 16908296;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
        public static final int IAMFProfileBaseEnhancedOpus = 17039361;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
        public static final int IAMFProfileBaseEnhancedAac = 17039362;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
        public static final int IAMFProfileBaseEnhancedFlac = 17039364;
        @android.annotation.SuppressLint("AllUpper")
        @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
        public static final int IAMFProfileBaseEnhancedPcm = 17039368;
        public int profile;
        public int level;
        public CodecProfileLevel() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static final class EncoderCapabilities {
        public static final int BITRATE_MODE_CQ = 0;
        public static final int BITRATE_MODE_VBR = 1;
        public static final int BITRATE_MODE_CBR = 2;
        public static final int BITRATE_MODE_CBR_FD = 3;
        public static android.media.MediaCodecInfo.EncoderCapabilities create(android.media.MediaFormat p0, android.media.MediaCodecInfo.CodecCapabilities.CodecCapsLegacyImpl p1) { return null; }
        EncoderCapabilities(android.media.MediaCodecInfo.EncoderCapabilities.EncoderCapsIntf p0) {}
        public android.util.Range<java.lang.Integer> getQualityRange() { return null; }
        public android.util.Range<java.lang.Integer> getComplexityRange() { return null; }
        public boolean isBitrateModeSupported(int p0) { return false; }
        public void getDefaultFormat(android.media.MediaFormat p0) {}
        public boolean supportsFormat(android.media.MediaFormat p0) { return false; }

        static interface EncoderCapsIntf {
            public android.util.Range<java.lang.Integer> getQualityRange();
            public android.util.Range<java.lang.Integer> getComplexityRange();
            public boolean isBitrateModeSupported(int p0);
            public void getDefaultFormat(android.media.MediaFormat p0);
            public boolean supportsFormat(android.media.MediaFormat p0);
        }

        static final class EncoderCapsLegacyImpl implements android.media.MediaCodecInfo.EncoderCapabilities.EncoderCapsIntf {
            public android.util.Range<java.lang.Integer> getQualityRange() { return null; }
            public android.util.Range<java.lang.Integer> getComplexityRange() { return null; }
            public boolean isBitrateModeSupported(int p0) { return false; }
            public static android.media.MediaCodecInfo.EncoderCapabilities.EncoderCapsLegacyImpl create(android.media.MediaFormat p0, android.media.MediaCodecInfo.CodecCapabilities.CodecCapsLegacyImpl p1) { return null; }
            public void getDefaultFormat(android.media.MediaFormat p0) {}
            public boolean supportsFormat(android.media.MediaFormat p0) { return false; }
        }

        static final class EncoderCapsNativeImpl implements android.media.MediaCodecInfo.EncoderCapabilities.EncoderCapsIntf {
            EncoderCapsNativeImpl(android.util.Range<java.lang.Integer> p0, android.util.Range<java.lang.Integer> p1) {}
            public android.util.Range<java.lang.Integer> getQualityRange() { return null; }
            public android.util.Range<java.lang.Integer> getComplexityRange() { return null; }
            public boolean isBitrateModeSupported(int p0) { return false; }
            public void getDefaultFormat(android.media.MediaFormat p0) {}
            public boolean supportsFormat(android.media.MediaFormat p0) { return false; }
        }
    }

    private static class Feature {
        public java.lang.String mName;
        public int mValue;
        public boolean mDefault;
        public boolean mInternal;
        public Feature(java.lang.String p0, int p1, boolean p2) {}
        public Feature(java.lang.String p0, int p1, boolean p2, boolean p3) {}
    }

    class GenericHelper {
        GenericHelper(android.media.MediaCodecInfo p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SecurityModel {
    }

    public static final class VideoCapabilities {
        public static android.media.MediaCodecInfo.VideoCapabilities create(android.media.MediaFormat p0, android.media.MediaCodecInfo.CodecCapabilities.CodecCapsLegacyImpl p1) { return null; }
        VideoCapabilities(android.media.MediaCodecInfo.VideoCapabilities.VideoCapsIntf p0) {}
        public android.util.Range<java.lang.Integer> getBitrateRange() { return null; }
        public android.util.Range<java.lang.Integer> getSupportedWidths() { return null; }
        public android.util.Range<java.lang.Integer> getSupportedHeights() { return null; }
        public int getWidthAlignment() { return 0; }
        public int getHeightAlignment() { return 0; }
        public int getSmallerDimensionUpperLimit() { return 0; }
        public android.util.Range<java.lang.Integer> getSupportedFrameRates() { return null; }
        public android.util.Range<java.lang.Integer> getSupportedWidthsFor(int p0) { return null; }
        public android.util.Range<java.lang.Integer> getSupportedHeightsFor(int p0) { return null; }
        public android.util.Range<java.lang.Double> getSupportedFrameRatesFor(int p0, int p1) { return null; }
        @android.annotation.Nullable
        public android.util.Range<java.lang.Double> getAchievableFrameRatesFor(int p0, int p1) { return null; }
        @android.annotation.Nullable
        public java.util.List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> getSupportedPerformancePoints() { return null; }
        public boolean areSizeAndRateSupported(int p0, int p1, double p2) { return false; }
        public boolean isSizeSupported(int p0, int p1) { return false; }
        public boolean supportsFormat(android.media.MediaFormat p0) { return false; }

        public static final class PerformancePoint {
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint SD_24 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint SD_25 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint SD_30 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint SD_48 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint SD_50 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint SD_60 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_24 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_25 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_30 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_50 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_60 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_100 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_120 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_200 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_240 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_24 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_25 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_30 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_50 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_60 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_100 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_120 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_200 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_240 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_24 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_25 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_30 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_50 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_60 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_100 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_120 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_200 = null;
            @android.annotation.NonNull
            public static final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_240 = null;
            public int getMaxMacroBlocks() { return 0; }
            int getWidth() { return 0; }
            int getHeight() { return 0; }
            public int getMaxFrameRate() { return 0; }
            public long getMaxMacroBlockRate() { return 0L; }
            int getBlockWidth() { return 0; }
            int getBlockHeight() { return 0; }
            public java.lang.String toString() { return null; }
            public int hashCode() { return 0; }
            public PerformancePoint(int p0, int p1, int p2, int p3, android.util.Size p4) {}
            public PerformancePoint(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint p0, android.util.Size p1) {}
            public PerformancePoint(int p0, int p1, int p2) {}
            PerformancePoint(int p0, int p1, int p2, long p3, int p4, int p5) {}
            public boolean covers(android.media.MediaFormat p0) { return false; }
            public boolean covers(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint p0) { return false; }
            public boolean equals(java.lang.Object p0) { return false; }
        }

        static interface VideoCapsIntf {
            public android.util.Range<java.lang.Integer> getBitrateRange();
            public android.util.Range<java.lang.Integer> getSupportedWidths();
            public android.util.Range<java.lang.Integer> getSupportedHeights();
            public int getWidthAlignment();
            public int getHeightAlignment();
            public int getSmallerDimensionUpperLimit();
            public android.util.Range<java.lang.Integer> getSupportedFrameRates();
            public android.util.Range<java.lang.Integer> getSupportedWidthsFor(int p0);
            public android.util.Range<java.lang.Integer> getSupportedHeightsFor(int p0);
            public android.util.Range<java.lang.Double> getSupportedFrameRatesFor(int p0, int p1);
            public android.util.Range<java.lang.Double> getAchievableFrameRatesFor(int p0, int p1);
            public boolean areSizeAndRateSupported(int p0, int p1, double p2);
            public boolean isSizeSupported(int p0, int p1);
            public boolean supportsFormat(android.media.MediaFormat p0);
            public java.util.List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> getSupportedPerformancePoints();
        }

        static final class VideoCapsLegacyImpl implements android.media.MediaCodecInfo.VideoCapabilities.VideoCapsIntf {
            static final java.util.Set<java.lang.String> VIDEO_LEVEL_CRITICAL_FORMAT_KEYS = null;
            public static android.media.MediaCodecInfo.VideoCapabilities.VideoCapsLegacyImpl create(android.media.MediaFormat p0, android.media.MediaCodecInfo.CodecCapabilities.CodecCapsLegacyImpl p1) { return null; }
            public android.util.Range<java.lang.Integer> getBitrateRange() { return null; }
            public android.util.Range<java.lang.Integer> getSupportedWidths() { return null; }
            public android.util.Range<java.lang.Integer> getSupportedHeights() { return null; }
            public int getWidthAlignment() { return 0; }
            public int getHeightAlignment() { return 0; }
            public int getSmallerDimensionUpperLimit() { return 0; }
            public android.util.Range<java.lang.Integer> getSupportedFrameRates() { return null; }
            public android.util.Range<java.lang.Integer> getSupportedWidthsFor(int p0) { return null; }
            public android.util.Range<java.lang.Integer> getSupportedHeightsFor(int p0) { return null; }
            public android.util.Range<java.lang.Double> getSupportedFrameRatesFor(int p0, int p1) { return null; }
            @android.annotation.Nullable
            public android.util.Range<java.lang.Double> getAchievableFrameRatesFor(int p0, int p1) { return null; }
            @android.annotation.Nullable
            public java.util.List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> getSupportedPerformancePoints() { return null; }
            public boolean areSizeAndRateSupported(int p0, int p1, double p2) { return false; }
            public boolean isSizeSupported(int p0, int p1) { return false; }
            public boolean supportsFormat(android.media.MediaFormat p0) { return false; }
            public android.util.Size getBlockSize() { return null; }
            public android.util.Range<java.lang.Integer> getBlockCountRange() { return null; }
            public android.util.Range<java.lang.Long> getBlocksPerSecondRange() { return null; }
            public android.util.Range<android.util.Rational> getAspectRatioRange(boolean p0) { return null; }
            public static int equivalentVP9Level(android.media.MediaFormat p0) { return 0; }
        }

        static final class VideoCapsNativeImpl implements android.media.MediaCodecInfo.VideoCapabilities.VideoCapsIntf {
            VideoCapsNativeImpl(android.util.Range<java.lang.Integer> p0, android.util.Range<java.lang.Integer> p1, android.util.Range<java.lang.Integer> p2, android.util.Range<java.lang.Integer> p3, java.util.List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> p4, int p5, int p6) {}
            public android.util.Range<java.lang.Integer> getBitrateRange() { return null; }
            public android.util.Range<java.lang.Integer> getSupportedWidths() { return null; }
            public android.util.Range<java.lang.Integer> getSupportedHeights() { return null; }
            public int getWidthAlignment() { return 0; }
            public int getHeightAlignment() { return 0; }
            public int getSmallerDimensionUpperLimit() { return 0; }
            public android.util.Range<java.lang.Integer> getSupportedFrameRates() { return null; }
            @android.annotation.Nullable
            public java.util.List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> getSupportedPerformancePoints() { return null; }
            public android.util.Range<java.lang.Integer> getSupportedWidthsFor(int p0) { return null; }
            public android.util.Range<java.lang.Integer> getSupportedHeightsFor(int p0) { return null; }
            public android.util.Range<java.lang.Double> getSupportedFrameRatesFor(int p0, int p1) { return null; }
            @android.annotation.Nullable
            public android.util.Range<java.lang.Double> getAchievableFrameRatesFor(int p0, int p1) { return null; }
            public boolean areSizeAndRateSupported(int p0, int p1, double p2) { return false; }
            public boolean isSizeSupported(int p0, int p1) { return false; }
            public boolean supportsFormat(android.media.MediaFormat p0) { return false; }
        }
    }
}
