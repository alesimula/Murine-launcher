package android.media.router;

public final class Enums {
    public static final int RESULT_UNSPECIFIED = 0;
    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_UNKNOWN_ERROR = 2;
    public static final int RESULT_REJECTED = 3;
    public static final int RESULT_NETWORK_ERROR = 4;
    public static final int RESULT_ROUTE_NOT_AVAILABLE = 5;
    public static final int RESULT_INVALID_COMMAND = 6;
    public static final int RESULT_UNIMPLEMENTED = 7;
    public static final int RESULT_FAILED_TO_REROUTE_SYSTEM_MEDIA = 8;
    public static final int RESULT_PERMISSION_DENIED = 9;
    public static final int RESULT_INVALID_ROUTE_ID = 10;
    public static final int RESULT_INVALID_SESSION_ID = 11;
    public static final int RESULT_DUPLICATE_SESSION_ID = 12;
    public static final int RESULT_PROVIDER_CALLBACK_ERROR = 13;
    public static final int RESULT_SYSTEM_SERVICE_ERROR = 14;
    public static final int RESULT_MEDIA_STREAM_CREATION_FAILED = 15;
    public static final int RESULT_MANAGER_RECORD_NOT_FOUND = 16;
    public static final int RESULT_ROUTER_RECORD_NOT_FOUND = 17;
    public static final int EVENT_TYPE_UNSPECIFIED = 0;
    public static final int EVENT_TYPE_CREATE_SESSION = 1;
    public static final int EVENT_TYPE_CREATE_SYSTEM_ROUTING_SESSION = 2;
    public static final int EVENT_TYPE_RELEASE_SESSION = 3;
    public static final int EVENT_TYPE_SELECT_ROUTE = 4;
    public static final int EVENT_TYPE_DESELECT_ROUTE = 5;
    public static final int EVENT_TYPE_TRANSFER_TO_ROUTE = 6;
    public static final int EVENT_TYPE_SCANNING_STARTED = 7;
    public static final int EVENT_TYPE_SCANNING_STOPPED = 8;
    public Enums() {}
}
