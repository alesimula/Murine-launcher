package com.android.internal.inputmethod;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface SoftInputShowHideReason {
    public static final int SHOW_SOFT_INPUT = 0;
    public static final int ATTACH_NEW_INPUT = 1;
    public static final int SHOW_MY_SOFT_INPUT = 2;
    public static final int HIDE_SOFT_INPUT = 3;
    public static final int HIDE_MY_SOFT_INPUT = 4;
    public static final int SHOW_AUTO_EDITOR_FORWARD_NAV = 5;
    public static final int SHOW_STATE_VISIBLE_FORWARD_NAV = 6;
    public static final int SHOW_STATE_ALWAYS_VISIBLE = 7;
    public static final int SHOW_SETTINGS_ON_CHANGE = 8;
    public static final int HIDE_SWITCH_USER = 9;
    public static final int HIDE_INVALID_USER = 10;
    public static final int HIDE_UNSPECIFIED_WINDOW = 11;
    public static final int HIDE_STATE_HIDDEN_FORWARD_NAV = 12;
    public static final int HIDE_ALWAYS_HIDDEN_STATE = 13;
    public static final int HIDE_RESET_SHELL_COMMAND = 14;
    public static final int HIDE_SETTINGS_ON_CHANGE = 15;
    public static final int HIDE_POWER_BUTTON_GO_HOME = 16;
    public static final int HIDE_DOCKED_STACK_ATTACHED = 17;
    public static final int HIDE_RECENTS_ANIMATION = 18;
    public static final int HIDE_BUBBLES = 19;
    public static final int HIDE_SAME_WINDOW_FOCUSED_WITHOUT_EDITOR = 20;
    public static final int HIDE_REMOVE_CLIENT = 21;
    public static final int SHOW_RESTORE_IME_VISIBILITY = 22;
    public static final int SHOW_TOGGLE_SOFT_INPUT = 23;
    public static final int HIDE_TOGGLE_SOFT_INPUT = 24;
    public static final int SHOW_SOFT_INPUT_BY_INSETS_API = 25;
}
