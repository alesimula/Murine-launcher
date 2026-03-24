package com.android.server.biometrics;

public final class BiometricsProto {
    public static final int CM_NONE = 0;
    public static final int CM_UPDATE_ACTIVE_USER = 1;
    public static final int CM_ENROLL = 2;
    public static final int CM_AUTHENTICATE = 3;
    public static final int CM_REMOVE = 4;
    public static final int CM_GET_AUTHENTICATOR_ID = 5;
    public static final int CM_ENUMERATE = 6;
    public static final int CM_INTERNAL_CLEANUP = 7;
    public static final int CM_SET_FEATURE = 8;
    public static final int CM_GET_FEATURE = 9;
    public static final int CM_GENERATE_CHALLENGE = 10;
    public static final int CM_REVOKE_CHALLENGE = 11;
    public static final int CM_RESET_LOCKOUT = 12;
    public static final int CM_DETECT_INTERACTION = 13;
    public static final int CM_INVALIDATION_REQUESTER = 14;
    public static final int CM_INVALIDATE = 15;
    public static final int CM_STOP_USER = 16;
    public static final int CM_START_USER = 17;
    public BiometricsProto() {}
}
