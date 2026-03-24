package com.android.server.biometrics;

public final class BiometricServiceStateProto {
    public static final int STATE_AUTH_IDLE = 0;
    public static final int STATE_AUTH_CALLED = 1;
    public static final int STATE_AUTH_STARTED = 2;
    public static final int STATE_AUTH_STARTED_UI_SHOWING = 3;
    public static final int STATE_AUTH_PAUSED = 4;
    public static final int STATE_AUTH_PAUSED_RESUMING = 5;
    public static final int STATE_AUTH_PENDING_CONFIRM = 6;
    public static final int STATE_AUTHENTICATED_PENDING_SYSUI = 7;
    public static final int STATE_ERROR_PENDING_SYSUI = 8;
    public static final int STATE_SHOWING_DEVICE_CREDENTIAL = 9;
    public static final int STATE_CLIENT_DIED_CANCELLING = 10;
    public static final int MULTI_SENSOR_STATE_UNKNOWN = 0;
    public static final int MULTI_SENSOR_STATE_SWITCHING = 1;
    public static final int MULTI_SENSOR_STATE_FACE_SCANNING = 2;
    public static final int MULTI_SENSOR_STATE_FP_SCANNING = 3;
    public static final long SENSOR_SERVICE_STATES = 2246267895809L;
    public static final long AUTH_SESSION_STATE = 1159641169922L;
    public static final long AUTH_SESSION_MULTI_SENSOR_STATE = 1159641169923L;
    public BiometricServiceStateProto() {}
}
