package com.android.internal.telephony.cat;

public interface AppInterface {
    public static final java.lang.String CAT_CMD_ACTION = "com.android.internal.stk.command";
    public static final java.lang.String CAT_SESSION_END_ACTION = "com.android.internal.stk.session_end";
    public static final java.lang.String CAT_ALPHA_NOTIFY_ACTION = "com.android.internal.stk.alpha_notify";
    public static final java.lang.String ALPHA_STRING = "alpha_string";
    public static final java.lang.String REFRESH_RESULT = "refresh_result";
    public static final java.lang.String CARD_STATUS = "card_status";
    public static final java.lang.String CAT_ICC_STATUS_CHANGE = "com.android.internal.stk.icc_status_change";
    public static final java.lang.String STK_PERMISSION = "android.permission.RECEIVE_STK_COMMANDS";
    public static android.content.ComponentName getDefaultSTKApplication() { return null; }
    public void onCmdResponse(com.android.internal.telephony.cat.CatResponseMessage p0);
    public void dispose();

    public static enum CommandType {
        DISPLAY_TEXT,
        GET_INKEY,
        GET_INPUT,
        LAUNCH_BROWSER,
        PLAY_TONE,
        REFRESH,
        SELECT_ITEM,
        SEND_SS,
        SEND_USSD,
        SEND_SMS,
        RUN_AT,
        SEND_DTMF,
        SET_UP_EVENT_LIST,
        SET_UP_IDLE_MODE_TEXT,
        SET_UP_MENU,
        SET_UP_CALL,
        PROVIDE_LOCAL_INFORMATION,
        LANGUAGE_NOTIFICATION,
        OPEN_CHANNEL,
        CLOSE_CHANNEL,
        RECEIVE_DATA,
        SEND_DATA,
        GET_CHANNEL_STATUS;
        public int value() { return 0; }
        public static com.android.internal.telephony.cat.AppInterface.CommandType fromInt(int p0) { return null; }
    }
}
