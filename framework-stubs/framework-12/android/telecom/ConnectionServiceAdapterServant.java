package android.telecom;

final class ConnectionServiceAdapterServant {
    private static final int MSG_HANDLE_CREATE_CONNECTION_COMPLETE = 1;
    private static final int MSG_SET_ACTIVE = 2;
    private static final int MSG_SET_RINGING = 3;
    private static final int MSG_SET_DIALING = 4;
    private static final int MSG_SET_DISCONNECTED = 5;
    private static final int MSG_SET_ON_HOLD = 6;
    private static final int MSG_SET_RINGBACK_REQUESTED = 7;
    private static final int MSG_SET_CONNECTION_CAPABILITIES = 8;
    private static final int MSG_SET_IS_CONFERENCED = 9;
    private static final int MSG_ADD_CONFERENCE_CALL = 10;
    private static final int MSG_REMOVE_CALL = 11;
    private static final int MSG_ON_POST_DIAL_WAIT = 12;
    private static final int MSG_QUERY_REMOTE_CALL_SERVICES = 13;
    private static final int MSG_SET_VIDEO_STATE = 14;
    private static final int MSG_SET_VIDEO_CALL_PROVIDER = 15;
    private static final int MSG_SET_IS_VOIP_AUDIO_MODE = 16;
    private static final int MSG_SET_STATUS_HINTS = 17;
    private static final int MSG_SET_ADDRESS = 18;
    private static final int MSG_SET_CALLER_DISPLAY_NAME = 19;
    private static final int MSG_SET_CONFERENCEABLE_CONNECTIONS = 20;
    private static final int MSG_ADD_EXISTING_CONNECTION = 21;
    private static final int MSG_ON_POST_DIAL_CHAR = 22;
    private static final int MSG_SET_CONFERENCE_MERGE_FAILED = 23;
    private static final int MSG_PUT_EXTRAS = 24;
    private static final int MSG_REMOVE_EXTRAS = 25;
    private static final int MSG_ON_CONNECTION_EVENT = 26;
    private static final int MSG_SET_CONNECTION_PROPERTIES = 27;
    private static final int MSG_SET_PULLING = 28;
    private static final int MSG_SET_AUDIO_ROUTE = 29;
    private static final int MSG_ON_RTT_INITIATION_SUCCESS = 30;
    private static final int MSG_ON_RTT_INITIATION_FAILURE = 31;
    private static final int MSG_ON_RTT_REMOTELY_TERMINATED = 32;
    private static final int MSG_ON_RTT_UPGRADE_REQUEST = 33;
    private static final int MSG_SET_PHONE_ACCOUNT_CHANGED = 34;
    private static final int MSG_CONNECTION_SERVICE_FOCUS_RELEASED = 35;
    private static final int MSG_SET_CONFERENCE_STATE = 36;
    private static final int MSG_HANDLE_CREATE_CONFERENCE_COMPLETE = 37;
    private static final int MSG_SET_CALL_DIRECTION = 38;
    private final com.android.internal.telecom.IConnectionServiceAdapter mDelegate = null;
    private final android.os.Handler mHandler = null;
    private final com.android.internal.telecom.IConnectionServiceAdapter mStub = null;
    public ConnectionServiceAdapterServant(com.android.internal.telecom.IConnectionServiceAdapter p0) {}
    public com.android.internal.telecom.IConnectionServiceAdapter getStub() { return null; }
}
