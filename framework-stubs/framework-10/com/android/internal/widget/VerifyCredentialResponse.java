package com.android.internal.widget;

public final class VerifyCredentialResponse implements android.os.Parcelable {
    public static final int RESPONSE_ERROR = -1;
    public static final int RESPONSE_OK = 0;
    public static final int RESPONSE_RETRY = 1;
    public static final com.android.internal.widget.VerifyCredentialResponse OK = null;
    public static final com.android.internal.widget.VerifyCredentialResponse ERROR = null;
    private static final java.lang.String TAG = "VerifyCredentialResponse";
    private int mResponseCode;
    private byte[] mPayload;
    private int mTimeout;
    public static final android.os.Parcelable.Creator<com.android.internal.widget.VerifyCredentialResponse> CREATOR = null;
    public VerifyCredentialResponse() {}
    public VerifyCredentialResponse(byte[] p0) {}
    public VerifyCredentialResponse(int p0) {}
    private VerifyCredentialResponse(int p0, int p1, byte[] p2) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public byte[] getPayload() { return null; }
    public int getTimeout() { return 0; }
    public int getResponseCode() { return 0; }
    private void setTimeout(int p0) {}
    private void setPayload(byte[] p0) {}
    public com.android.internal.widget.VerifyCredentialResponse stripPayload() { return null; }
    public static com.android.internal.widget.VerifyCredentialResponse fromGateKeeperResponse(android.service.gatekeeper.GateKeeperResponse p0) { return null; }
}
