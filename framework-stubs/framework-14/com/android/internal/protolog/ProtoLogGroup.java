package com.android.internal.protolog;

public enum ProtoLogGroup implements com.android.internal.protolog.common.IProtoLogGroup {
    WM_ERROR,
    WM_DEBUG_ORIENTATION,
    WM_DEBUG_FOCUS_LIGHT,
    WM_DEBUG_BOOT,
    WM_DEBUG_RESIZE,
    WM_DEBUG_ADD_REMOVE,
    WM_DEBUG_CONFIGURATION,
    WM_DEBUG_SWITCH,
    WM_DEBUG_CONTAINERS,
    WM_DEBUG_FOCUS,
    WM_DEBUG_IMMERSIVE,
    WM_DEBUG_LOCKTASK,
    WM_DEBUG_STATES,
    WM_DEBUG_TASKS,
    WM_DEBUG_STARTING_WINDOW,
    WM_SHOW_TRANSACTIONS,
    WM_SHOW_SURFACE_ALLOC,
    WM_DEBUG_APP_TRANSITIONS,
    WM_DEBUG_ANIM,
    WM_DEBUG_APP_TRANSITIONS_ANIM,
    WM_DEBUG_RECENTS_ANIMATIONS,
    WM_DEBUG_DRAW,
    WM_DEBUG_REMOTE_ANIMATIONS,
    WM_DEBUG_SCREEN_ON,
    WM_DEBUG_KEEP_SCREEN_ON,
    WM_DEBUG_WINDOW_MOVEMENT,
    WM_DEBUG_IME,
    WM_DEBUG_WINDOW_ORGANIZER,
    WM_DEBUG_SYNC_ENGINE,
    WM_DEBUG_WINDOW_TRANSITIONS,
    WM_DEBUG_WINDOW_TRANSITIONS_MIN,
    WM_DEBUG_WINDOW_INSETS,
    WM_DEBUG_CONTENT_RECORDING,
    WM_DEBUG_WALLPAPER,
    WM_DEBUG_BACK_PREVIEW,
    WM_DEBUG_DREAM,
    TEST_GROUP;
    public boolean isEnabled() { return false; }
    public boolean isLogToProto() { return false; }
    public boolean isLogToLogcat() { return false; }
    public boolean isLogToAny() { return false; }
    public java.lang.String getTag() { return null; }
    public void setLogToProto(boolean p0) {}
    public void setLogToLogcat(boolean p0) {}

    private static class Consts {
    }
}
