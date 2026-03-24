package com.google.android.apps.wearable.settings;

public final class Enums {
    public static final int REQUEST_TYPE_UNSPECIFIED = 0;
    public static final int REQUEST_TYPE_POLL = 1;
    public static final int REQUEST_TYPE_EVALUATE = 2;
    public static final int REQUEST_TYPE_COMPANION = 3;
    public static final int SOURCE_TYPE_UNSPECIFIED = 0;
    public static final int SOURCE_TYPE_BOOT = 1;
    public static final int SOURCE_TYPE_OOBE = 2;
    public static final int SOURCE_TYPE_COMPANION_CONNECTION = 3;
    public static final int SOURCE_TYPE_TOGGLE = 4;
    public static final int SOURCE_TYPE_PERIODIC_JOB = 5;
    public static final int ORIGIN_TYPE_UNSPECIFIED = 0;
    public static final int ORIGIN_TYPE_COMPANION = 1;
    public static final int ORIGIN_TYPE_NETWORK = 2;
    public static final int ORIGIN_TYPE_NITZ = 3;
    public static final int ORIGIN_TYPE_GNSS = 4;
    public static final int ORIGIN_TYPE_MANUAL = 5;
    public static final int FAILURE_REASON_UNSPECIFIED = 0;
    public static final int FAILURE_REASON_TIMEOUT = 1;
    public static final int FAILURE_REASON_LATENCY = 2;
    public static final int FAILURE_REASON_COMPANION_INVALID_RESPONSE = 3;
    public static final int FAILURE_REASON_DISCONNECTED = 4;
    public Enums() {}
}
