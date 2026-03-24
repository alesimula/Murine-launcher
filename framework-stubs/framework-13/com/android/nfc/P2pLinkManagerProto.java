package com.android.nfc;

public final class P2pLinkManagerProto {
    public static final int LINK_STATE_UNKNOWN = 0;
    public static final int LINK_STATE_DOWN = 1;
    public static final int LINK_STATE_DEBOUNCE = 2;
    public static final int LINK_STATE_UP = 3;
    public static final int SEND_STATE_UNKNOWN = 0;
    public static final int SEND_STATE_NOTHING_TO_SEND = 1;
    public static final int SEND_STATE_NEED_CONFIRMATION = 2;
    public static final int SEND_STATE_SENDING = 3;
    public static final int SEND_STATE_COMPLETE = 4;
    public static final int SEND_STATE_CANCELED = 5;
    public static final long DEFAULT_MIU = 1120986464257L;
    public static final long DEFAULT_RW_SIZE = 1120986464258L;
    public static final long LINK_STATE = 1159641169923L;
    public static final long SEND_STATE = 1159641169924L;
    public static final long SEND_FLAGS = 1120986464261L;
    public static final long SEND_ENABLED = 1133871366150L;
    public static final long RECEIVE_ENABLED = 1133871366151L;
    public static final long CALLBACK_NDEF = 1138166333448L;
    public static final long MESSAGE_TO_SEND = 1146756268041L;
    public static final long URIS_TO_SEND = 2237677961226L;
    public P2pLinkManagerProto() {}
}
