package com.android.internal.inputmethod;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface SoftInputShowHideReason {
    public static final int SHOW_SOFT_INPUT = 1;
    public static final int ATTACH_NEW_INPUT = 2;
    public static final int SHOW_SOFT_INPUT_FROM_IME = 3;
    public static final int HIDE_SOFT_INPUT = 4;
    public static final int HIDE_SOFT_INPUT_FROM_IME = 5;
    public static final int SHOW_AUTO_EDITOR_FORWARD_NAV = 6;
    public static final int SHOW_STATE_VISIBLE_FORWARD_NAV = 7;
    public static final int SHOW_STATE_ALWAYS_VISIBLE = 8;
    public static final int SHOW_SETTINGS_ON_CHANGE = 9;
    public static final int HIDE_SWITCH_USER = 10;
    public static final int HIDE_INVALID_USER = 11;
    public static final int HIDE_UNSPECIFIED_WINDOW = 12;
    public static final int HIDE_STATE_HIDDEN_FORWARD_NAV = 13;
    public static final int HIDE_ALWAYS_HIDDEN_STATE = 14;
    public static final int HIDE_RESET_SHELL_COMMAND = 15;
    public static final int HIDE_SETTINGS_ON_CHANGE = 16;
    public static final int HIDE_POWER_BUTTON_GO_HOME = 17;
    public static final int HIDE_DOCKED_STACK_ATTACHED = 18;
    public static final int HIDE_RECENTS_ANIMATION = 19;
    public static final int HIDE_BUBBLES = 20;
    public static final int HIDE_SAME_WINDOW_FOCUSED_WITHOUT_EDITOR = 21;
    public static final int HIDE_REMOVE_CLIENT = 22;
    public static final int SHOW_RESTORE_IME_VISIBILITY = 23;
    public static final int SHOW_TOGGLE_SOFT_INPUT = 24;
    public static final int HIDE_TOGGLE_SOFT_INPUT = 25;
    public static final int SHOW_SOFT_INPUT_BY_INSETS_API = 26;
    public static final int HIDE_DISPLAY_IME_POLICY_HIDE = 27;
    public static final int HIDE_SOFT_INPUT_BY_INSETS_API = 28;
    public static final int HIDE_SOFT_INPUT_BY_BACK_KEY = 29;
    public static final int HIDE_SOFT_INPUT_IME_TOGGLE_SOFT_INPUT = 30;
    public static final int HIDE_SOFT_INPUT_EXTRACT_INPUT_CHANGED = 31;
    public static final int HIDE_SOFT_INPUT_IMM_DEPRECATION = 32;
    public static final int HIDE_WINDOW_GAINED_FOCUS_WITHOUT_EDITOR = 33;
    public static final int SHOW_IME_SCREENSHOT_FROM_IMMS = 34;
    public static final int REMOVE_IME_SCREENSHOT_FROM_IMMS = 35;
    public static final int HIDE_WHEN_INPUT_TARGET_INVISIBLE = 37;
}
