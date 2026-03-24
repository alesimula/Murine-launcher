package android.telecom;

final class VideoCallbackServant {
    private static final int MSG_RECEIVE_SESSION_MODIFY_REQUEST = 0;
    private static final int MSG_RECEIVE_SESSION_MODIFY_RESPONSE = 1;
    private static final int MSG_HANDLE_CALL_SESSION_EVENT = 2;
    private static final int MSG_CHANGE_PEER_DIMENSIONS = 3;
    private static final int MSG_CHANGE_CALL_DATA_USAGE = 4;
    private static final int MSG_CHANGE_CAMERA_CAPABILITIES = 5;
    private static final int MSG_CHANGE_VIDEO_QUALITY = 6;
    private final com.android.internal.telecom.IVideoCallback mDelegate = null;
    private final android.os.Handler mHandler = null;
    private final com.android.internal.telecom.IVideoCallback mStub = null;
    public VideoCallbackServant(com.android.internal.telecom.IVideoCallback p0) {}
    public com.android.internal.telecom.IVideoCallback getStub() { return null; }
}
