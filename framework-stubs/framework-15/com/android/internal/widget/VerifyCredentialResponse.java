package com.android.internal.widget;

public final class VerifyCredentialResponse implements android.os.Parcelable {
    public static final int RESPONSE_ERROR = -1;
    public static final int RESPONSE_OK = 0;
    public static final int RESPONSE_RETRY = 1;
    public static final com.android.internal.widget.VerifyCredentialResponse OK = null;
    public static final com.android.internal.widget.VerifyCredentialResponse ERROR = null;
    public static final android.os.Parcelable.Creator<com.android.internal.widget.VerifyCredentialResponse> CREATOR = null;
    public static com.android.internal.widget.VerifyCredentialResponse fromTimeout(int p0) { return null; }
    public static com.android.internal.widget.VerifyCredentialResponse fromError() { return null; }
    public com.android.internal.widget.VerifyCredentialResponse stripPayload() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public byte[] getGatekeeperHAT() { return null; }
    public long getGatekeeperPasswordHandle() { return 0L; }
    public boolean containsGatekeeperPasswordHandle() { return false; }
    public int getTimeout() { return 0; }
    public int getResponseCode() { return 0; }
    public boolean isMatched() { return false; }
    public java.lang.String toString() { return null; }
    public static com.android.internal.widget.VerifyCredentialResponse fromGateKeeperResponse(android.service.gatekeeper.GateKeeperResponse p0) { return null; }

    public static class Builder {
        public Builder() {}
        public com.android.internal.widget.VerifyCredentialResponse.Builder setGatekeeperHAT(byte[] p0) { return null; }
        public com.android.internal.widget.VerifyCredentialResponse.Builder setGatekeeperPasswordHandle(long p0) { return null; }
        public com.android.internal.widget.VerifyCredentialResponse build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ResponseCode {
    }
}
