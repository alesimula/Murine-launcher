package com.android.internal.app;

public class NetInitiatedActivity extends com.android.internal.app.AlertActivity implements android.content.DialogInterface.OnClickListener {
    private static final java.lang.String TAG = "NetInitiatedActivity";
    private static final boolean DEBUG = true;
    private static final boolean VERBOSE = false;
    private static final int POSITIVE_BUTTON = -1;
    private static final int NEGATIVE_BUTTON = -2;
    private static final int GPS_NO_RESPONSE_TIME_OUT = 1;
    private int notificationId;
    private int timeout;
    private int default_response;
    private int default_response_timeout;
    private android.content.BroadcastReceiver mNetInitiatedReceiver;
    private final android.os.Handler mHandler = null;
    public NetInitiatedActivity() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    protected void onResume() {}
    protected void onPause() {}
    public void onClick(android.content.DialogInterface p0, int p1) {}
    private void sendUserResponse(int p0) {}
    private void handleNIVerify(android.content.Intent p0) {}
    private void showNIError() {}
}
