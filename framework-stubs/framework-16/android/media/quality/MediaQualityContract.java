package android.media.quality;

@android.annotation.FlaggedApi("android.media.tv.flags.media_quality_fw")
public class MediaQualityContract {
    public static final java.lang.String LEVEL_LOW = "level_low";
    public static final java.lang.String LEVEL_MEDIUM = "level_medium";
    public static final java.lang.String LEVEL_HIGH = "level_high";
    public static final java.lang.String LEVEL_OFF = "level_off";
    public static final java.lang.String COLOR_TEMP_USER = "color_temp_user";
    public static final java.lang.String COLOR_TEMP_COOL = "color_temp_cool";
    public static final java.lang.String COLOR_TEMP_STANDARD = "color_temp_standard";
    public static final java.lang.String COLOR_TEMP_WARM = "color_temp_warm";
    public static final java.lang.String COLOR_TEMP_USER_HDR10PLUS = "color_temp_user_hdr10plus";
    public static final java.lang.String COLOR_TEMP_COOL_HDR10PLUS = "color_temp_cool_hdr10plus";
    public static final java.lang.String COLOR_TEMP_STANDARD_HDR10PLUS = "color_temp_standard_hdr10plus";
    public static final java.lang.String COLOR_TEMP_WARM_HDR10PLUS = "color_temp_warm_hdr10plus";
    public static final java.lang.String COLOR_TEMP_FMMSDR = "color_temp_fmmsdr";
    public static final java.lang.String COLOR_TEMP_FMMHDR = "color_temp_fmmhdr";

    public static interface BaseParameters {
        public static final java.lang.String PARAMETER_ID = "_id";
        public static final java.lang.String PARAMETER_TYPE = "_type";
        public static final java.lang.String PARAMETER_NAME = "_name";
        public static final java.lang.String PARAMETER_PACKAGE = "_package";
        public static final java.lang.String PARAMETER_INPUT_ID = "_input_id";
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ColorTempValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Level {
    }

    public static final class PictureQuality {
        public static final java.lang.String PARAMETER_BRIGHTNESS = "brightness";
        public static final java.lang.String PARAMETER_CONTRAST = "contrast";
        public static final java.lang.String PARAMETER_SHARPNESS = "sharpness";
        public static final java.lang.String PARAMETER_SATURATION = "saturation";
        public static final java.lang.String PARAMETER_HUE = "hue";
        public static final java.lang.String PARAMETER_COLOR_TUNER_BRIGHTNESS = "color_tuner_brightness";
        public static final java.lang.String PARAMETER_COLOR_TUNER_SATURATION = "color_tuner_saturation";
        public static final java.lang.String PARAMETER_COLOR_TUNER_HUE = "color_tuner_hue";
        public static final java.lang.String PARAMETER_COLOR_TUNER_RED_OFFSET = "color_tuner_red_offset";
        public static final java.lang.String PARAMETER_COLOR_TUNER_GREEN_OFFSET = "color_tuner_green_offset";
        public static final java.lang.String PARAMETER_COLOR_TUNER_BLUE_OFFSET = "color_tuner_blue_offset";
        public static final java.lang.String PARAMETER_COLOR_TUNER_RED_GAIN = "color_tuner_red_gain";
        public static final java.lang.String PARAMETER_COLOR_TUNER_GREEN_GAIN = "color_tuner_green_gain";
        public static final java.lang.String PARAMETER_COLOR_TUNER_BLUE_GAIN = "color_tuner_blue_gain";
        public static final java.lang.String PARAMETER_NOISE_REDUCTION = "noise_reduction";
        public static final java.lang.String PARAMETER_MPEG_NOISE_REDUCTION = "mpeg_noise_reduction";
        public static final java.lang.String PARAMETER_FLESH_TONE = "flesh_tone";
        public static final java.lang.String PARAMETER_DECONTOUR = "decontour";
        public static final java.lang.String PARAMETER_DYNAMIC_LUMA_CONTROL = "dynamic_luma_control";
        public static final java.lang.String PARAMETER_FILM_MODE = "film_mode";
        public static final java.lang.String PARAMETER_BLACK_STRETCH = "black_stretch";
        public static final java.lang.String PARAMETER_BLUE_STRETCH = "blue_stretch";
        public static final java.lang.String PARAMETER_COLOR_TUNE = "color_tune";
        public static final java.lang.String PARAMETER_COLOR_TEMPERATURE = "color_temperature";
        public static final java.lang.String PARAMETER_GLOBAL_DIMMING = "global_dimming";
        public static final java.lang.String PARAMETER_AUTO_PICTURE_QUALITY_ENABLED = "auto_picture_quality_enabled";
        public static final java.lang.String PARAMETER_AUTO_SUPER_RESOLUTION_ENABLED = "auto_super_resolution_enabled";
        public static final java.lang.String PARAMETER_LEVEL_RANGE = "level_range";
        public static final java.lang.String PARAMETER_GAMUT_MAPPING = "gamut_mapping";
        public static final java.lang.String PARAMETER_PC_MODE = "pc_mode";
        public static final java.lang.String PARAMETER_LOW_LATENCY = "low_latency";
        public static final java.lang.String PARAMETER_VRR = "vrr";
        public static final java.lang.String PARAMETER_CVRR = "cvrr";
        public static final java.lang.String PARAMETER_HDMI_RGB_RANGE = "hdmi_rgb_range";
        public static final java.lang.String PARAMETER_COLOR_SPACE = "color_space";
        public static final java.lang.String PARAMETER_PANEL_INIT_MAX_LUMINCE_NITS = "panel_init_max_lumince_nits";
        public static final java.lang.String PARAMETER_PANEL_INIT_MAX_LUMINCE_VALID = "panel_init_max_lumince_valid";
        public static final java.lang.String PARAMETER_GAMMA = "gamma";
        public static final java.lang.String PARAMETER_COLOR_TEMPERATURE_RED_GAIN = "color_temperature_red_gain";
        public static final java.lang.String PARAMETER_COLOR_TEMPERATURE_GREEN_GAIN = "color_temperature_green_gain";
        public static final java.lang.String PARAMETER_COLOR_TEMPERATURE_BLUE_GAIN = "color_temperature_blue_gain";
        public static final java.lang.String PARAMETER_COLOR_TEMPERATURE_RED_OFFSET = "color_temperature_red_offset";
        public static final java.lang.String PARAMETER_COLOR_TEMPERATURE_GREEN_OFFSET = "color_temperature_green_offset";
        public static final java.lang.String PARAMETER_COLOR_TEMPERATURE_BLUE_OFFSET = "color_temperature_blue_offset";
        public static final java.lang.String PARAMETER_ELEVEN_POINT_RED = "eleven_point_red";
        public static final java.lang.String PARAMETER_ELEVEN_POINT_GREEN = "eleven_point_green";
        public static final java.lang.String PARAMETER_ELEVEN_POINT_BLUE = "eleven_point_blue";
        public static final java.lang.String PARAMETER_LOW_BLUE_LIGHT = "low_blue_light";
        public static final java.lang.String PARAMETER_LD_MODE = "ld_mode";
        public static final java.lang.String PARAMETER_OSD_RED_GAIN = "osd_red_gain";
        public static final java.lang.String PARAMETER_OSD_GREEN_GAIN = "osd_green_gain";
        public static final java.lang.String PARAMETER_OSD_BLUE_GAIN = "osd_blue_gain";
        public static final java.lang.String PARAMETER_OSD_RED_OFFSET = "osd_red_offset";
        public static final java.lang.String PARAMETER_OSD_GREEN_OFFSET = "osd_green_offset";
        public static final java.lang.String PARAMETER_OSD_BLUE_OFFSET = "osd_blue_offset";
        public static final java.lang.String PARAMETER_OSD_HUE = "osd_hue";
        public static final java.lang.String PARAMETER_OSD_SATURATION = "osd_saturation";
        public static final java.lang.String PARAMETER_OSD_CONTRAST = "osd_contrast";
        public static final java.lang.String PARAMETER_COLOR_TUNER_SWITCH = "color_tuner_switch";
        public static final java.lang.String PARAMETER_COLOR_TUNER_HUE_RED = "color_tuner_hue_red";
        public static final java.lang.String PARAMETER_COLOR_TUNER_HUE_GREEN = "color_tuner_hue_green";
        public static final java.lang.String PARAMETER_COLOR_TUNER_HUE_BLUE = "color_tuner_hue_blue";
        public static final java.lang.String PARAMETER_COLOR_TUNER_HUE_CYAN = "color_tuner_hue_cyan";
        public static final java.lang.String PARAMETER_COLOR_TUNER_HUE_MAGENTA = "color_tuner_hue_magenta";
        public static final java.lang.String PARAMETER_COLOR_TUNER_HUE_YELLOW = "color_tuner_hue_yellow";
        public static final java.lang.String PARAMETER_COLOR_TUNER_HUE_FLESH = "color_tuner_hue_flesh";
        public static final java.lang.String PARAMETER_COLOR_TUNER_SATURATION_RED = "color_tuner_saturation_red";
        public static final java.lang.String PARAMETER_COLOR_TUNER_SATURATION_GREEN = "color_tuner_saturation_green";
        public static final java.lang.String PARAMETER_COLOR_TUNER_SATURATION_BLUE = "color_tuner_saturation_blue";
        public static final java.lang.String PARAMETER_COLOR_TUNER_SATURATION_CYAN = "color_tuner_saturation_cyan";
        public static final java.lang.String PARAMETER_COLOR_TUNER_SATURATION_MAGENTA = "color_tuner_saturation_magenta";
        public static final java.lang.String PARAMETER_COLOR_TUNER_SATURATION_YELLOW = "color_tuner_saturation_yellow";
        public static final java.lang.String PARAMETER_COLOR_TUNER_SATURATION_FLESH = "color_tuner_saturation_flesh";
        public static final java.lang.String PARAMETER_COLOR_TUNER_LUMINANCE_RED = "color_tuner_luminance_red";
        public static final java.lang.String PARAMETER_COLOR_TUNER_LUMINANCE_GREEN = "color_tuner_luminance_green";
        public static final java.lang.String PARAMETER_COLOR_TUNER_LUMINANCE_BLUE = "color_tuner_luminance_blue";
        public static final java.lang.String PARAMETER_COLOR_TUNER_LUMINANCE_CYAN = "color_tuner_luminance_cyan";
        public static final java.lang.String PARAMETER_COLOR_TUNER_LUMINANCE_MAGENTA = "color_tuner_luminance_magenta";
        public static final java.lang.String PARAMETER_COLOR_TUNER_LUMINANCE_YELLOW = "color_tuner_luminance_yellow";
        public static final java.lang.String PARAMETER_COLOR_TUNER_LUMINANCE_FLESH = "color_tuner_luminance_flesh";
        public static final java.lang.String PARAMETER_PICTURE_QUALITY_EVENT_TYPE = "picture_quality_event_type";
    }

    public static final class SoundQuality {
        public static final java.lang.String PARAMETER_BALANCE = "balance";
        public static final java.lang.String PARAMETER_BASS = "bass";
        public static final java.lang.String PARAMETER_TREBLE = "treble";
        public static final java.lang.String PARAMETER_SURROUND_SOUND = "surround_sound";
        public static final java.lang.String PARAMETER_EQUALIZER_DETAIL = "equalizer_detail";
        public static final java.lang.String PARAMETER_SPEAKERS = "speakers";
        public static final java.lang.String PARAMETER_SPEAKERS_DELAY_MILLIS = "speakers_delay_millis";
        public static final java.lang.String PARAMETER_EARC = "earc";
        public static final java.lang.String PARAMETER_AUTO_VOLUME_CONTROL = "auto_volume_control";
        public static final java.lang.String PARAMETER_DOWN_MIX_MODE = "down_mix_mode";
        public static final java.lang.String PARAMETER_DTS_DRC = "dts_drc";
        public static final java.lang.String PARAMETER_DOLBY_AUDIO_PROCESSING = "dolby_audio_processing";
        public static final java.lang.String PARAMETER_DOLBY_AUDIO_PROCESSING_SOUND_MODE = "dolby_audio_processing_sound_mode";
        public static final java.lang.String PARAMETER_DOLBY_AUDIO_PROCESSING_VOLUME_LEVELER = "dolby_audio_processing_volume_leveler";
        public static final java.lang.String PARAMETER_DOLBY_AUDIO_PROCESSING_SURROUND_VIRTUALIZER = "dolby_audio_processing_surround_virtualizer";
        public static final java.lang.String PARAMETER_DOLBY_AUDIO_PROCESSING_DOLBY_ATMOS = "dolby_audio_processing_dolby_atmos";
        public static final java.lang.String PARAMETER_DIALOGUE_ENHANCER = "dialogue_enhancer";
        public static final java.lang.String PARAMETER_DTS_VIRTUAL_X = "dts_virtual_x";
        public static final java.lang.String PARAMETER_DTS_VIRTUAL_X_TBHDX = "dts_virtual_x_tbhdx";
        public static final java.lang.String PARAMETER_DTS_VIRTUAL_X_LIMITER = "dts_virtual_x_limiter";
        public static final java.lang.String PARAMETER_DTS_VIRTUAL_X_TRU_SURROUND_X = "dts_virtual_x_tru_surround_x";
        public static final java.lang.String PARAMETER_DTS_VIRTUAL_X_TRU_VOLUME_HD = "dts_virtual_x_tru_volume_hd";
        public static final java.lang.String PARAMETER_DTS_VIRTUAL_X_DIALOG_CLARITY = "dts_virtual_x_dialog_clarity";
        public static final java.lang.String PARAMETER_DTS_VIRTUAL_X_DEFINITION = "dts_virtual_x_definition";
        public static final java.lang.String PARAMETER_DTS_VIRTUAL_X_HEIGHT = "dts_virtual_x_height";
        public static final java.lang.String PARAMETER_DIGITAL_OUTPUT_DELAY_MILLIS = "digital_output_delay_millis";
        public static final java.lang.String PARAMETER_DIGITAL_OUTPUT_MODE = "digital_output_mode";
        public static final java.lang.String PARAMETER_SOUND_STYLE = "sound_style";
    }
}
