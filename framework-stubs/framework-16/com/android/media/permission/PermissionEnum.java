package com.android.media.permission;

public @interface PermissionEnum {
    public static final byte RECORD_AUDIO = 0;
    public static final byte MODIFY_AUDIO_ROUTING = 1;
    public static final byte MODIFY_AUDIO_SETTINGS = 2;
    public static final byte MODIFY_PHONE_STATE = 3;
    public static final byte MODIFY_DEFAULT_AUDIO_EFFECTS = 4;
    public static final byte WRITE_SECURE_SETTINGS = 5;
    public static final byte CALL_AUDIO_INTERCEPTION = 6;
    public static final byte ACCESS_ULTRASOUND = 7;
    public static final byte CAPTURE_AUDIO_OUTPUT = 8;
    public static final byte CAPTURE_MEDIA_OUTPUT = 9;
    public static final byte CAPTURE_AUDIO_HOTWORD = 10;
    public static final byte CAPTURE_TUNER_AUDIO_INPUT = 11;
    public static final byte CAPTURE_VOICE_COMMUNICATION_OUTPUT = 12;
    public static final byte BLUETOOTH_CONNECT = 13;
    public static final byte BYPASS_CONCURRENT_RECORD_AUDIO_RESTRICTION = 14;
    public static final byte MODIFY_AUDIO_SETTINGS_PRIVILEGED = 15;
    public static final byte ENUM_SIZE = 16;
}
