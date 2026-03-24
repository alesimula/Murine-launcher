package com.android.server.vibrator;

public final class VibrationProto {
    public static final int UNKNOWN = 0;
    public static final int RUNNING = 1;
    public static final int FINISHED = 2;
    public static final int FINISHED_UNEXPECTED = 3;
    public static final int FORWARDED_TO_INPUT_DEVICES = 4;
    public static final int CANCELLED_BINDER_DIED = 5;
    public static final int CANCELLED_BY_SCREEN_OFF = 6;
    public static final int CANCELLED_BY_SETTINGS_UPDATE = 7;
    public static final int CANCELLED_BY_USER = 8;
    public static final int CANCELLED_BY_UNKNOWN_REASON = 9;
    public static final int CANCELLED_SUPERSEDED = 10;
    public static final int IGNORED_ERROR_APP_OPS = 11;
    public static final int IGNORED_ERROR_CANCELLING = 12;
    public static final int IGNORED_ERROR_SCHEDULING = 13;
    public static final int IGNORED_ERROR_TOKEN = 14;
    public static final int IGNORED_APP_OPS = 15;
    public static final int IGNORED_BACKGROUND = 16;
    public static final int IGNORED_UNSUPPORTED = 18;
    public static final int IGNORED_FOR_EXTERNAL = 19;
    public static final int IGNORED_FOR_HIGHER_IMPORTANCE = 20;
    public static final int IGNORED_FOR_ONGOING = 21;
    public static final int IGNORED_FOR_POWER = 22;
    public static final int IGNORED_FOR_RINGER_MODE = 23;
    public static final int IGNORED_FOR_SETTINGS = 24;
    public static final int IGNORED_SUPERSEDED = 25;
    public static final int IGNORED_FROM_VIRTUAL_DEVICE = 26;
    public static final int IGNORED_ON_WIRELESS_CHARGER = 27;
    public static final int IGNORED_MISSING_PERMISSION = 28;
    public static final long START_TIME = 1112396529665L;
    public static final long END_TIME = 1112396529666L;
    public static final long PLAYED_EFFECT = 1146756268035L;
    public static final long ORIGINAL_EFFECT = 1146756268036L;
    public static final long ATTRIBUTES = 1146756268037L;
    public static final long DURATION_MS = 1112396529671L;
    public static final long STATUS = 1159641169928L;
    public VibrationProto() {}
}
