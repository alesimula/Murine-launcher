package com.android.internal.protolog;

public enum ProtoLogGroup implements com.android.internal.protolog.common.IProtoLogGroup {
    WM_ERROR(false, (java.lang.String)null),
    WM_DEBUG_ORIENTATION(false, (java.lang.String)null),
    WM_DEBUG_FOCUS_LIGHT(false, (java.lang.String)null),
    WM_DEBUG_BOOT(false, (java.lang.String)null),
    WM_DEBUG_RESIZE(false, (java.lang.String)null),
    WM_DEBUG_ADD_REMOVE(false, (java.lang.String)null),
    WM_DEBUG_CONFIGURATION(false, (java.lang.String)null),
    WM_DEBUG_SWITCH(false, (java.lang.String)null),
    WM_DEBUG_CONTAINERS(false, (java.lang.String)null),
    WM_DEBUG_FOCUS(false, (java.lang.String)null),
    WM_DEBUG_IMMERSIVE(false, (java.lang.String)null),
    WM_DEBUG_LOCKTASK(false, (java.lang.String)null),
    WM_DEBUG_STATES(false, (java.lang.String)null),
    WM_DEBUG_TASKS(false, (java.lang.String)null),
    WM_DEBUG_STARTING_WINDOW(false, (java.lang.String)null),
    WM_SHOW_TRANSACTIONS(false, (java.lang.String)null),
    WM_SHOW_SURFACE_ALLOC(false, (java.lang.String)null),
    WM_DEBUG_APP_TRANSITIONS(false, (java.lang.String)null),
    WM_DEBUG_APP_TRANSITIONS_ANIM(false, (java.lang.String)null),
    WM_DEBUG_RECENTS_ANIMATIONS(false, (java.lang.String)null),
    WM_DEBUG_DRAW(false, (java.lang.String)null),
    WM_DEBUG_REMOTE_ANIMATIONS(false, (java.lang.String)null),
    WM_DEBUG_SCREEN_ON(false, (java.lang.String)null),
    WM_DEBUG_KEEP_SCREEN_ON(false, (java.lang.String)null),
    WM_DEBUG_WINDOW_MOVEMENT(false, (java.lang.String)null),
    WM_DEBUG_IME(false, (java.lang.String)null),
    WM_DEBUG_WINDOW_ORGANIZER(false, (java.lang.String)null),
    WM_DEBUG_SYNC_ENGINE(false, (java.lang.String)null),
    WM_DEBUG_WINDOW_TRANSITIONS(false, (java.lang.String)null),
    TEST_GROUP(false, (java.lang.String)null);
    private final boolean mEnabled = false;
    private volatile boolean mLogToProto;
    private volatile boolean mLogToLogcat;
    private final java.lang.String mTag = null;
    private ProtoLogGroup(boolean p0, java.lang.String p1) {}
    public boolean isEnabled() { return false; }
    public boolean isLogToProto() { return false; }
    public boolean isLogToLogcat() { return false; }
    public boolean isLogToAny() { return false; }
    public java.lang.String getTag() { return null; }
    public void setLogToProto(boolean p0) {}
    public void setLogToLogcat(boolean p0) {}

    private static class Consts {
        private static final java.lang.String TAG_WM = "WindowManager";
        private static final boolean ENABLE_DEBUG = true;
        private static final boolean ENABLE_LOG_TO_PROTO_DEBUG = true;
        private Consts() {}
    }
}
