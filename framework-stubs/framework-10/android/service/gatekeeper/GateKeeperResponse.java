package android.service.gatekeeper;

public final class GateKeeperResponse implements android.os.Parcelable {
    public static final int RESPONSE_ERROR = -1;
    public static final int RESPONSE_OK = 0;
    public static final int RESPONSE_RETRY = 1;
    private final int mResponseCode = 0;
    private int mTimeout;
    private byte[] mPayload;
    private boolean mShouldReEnroll;
    public static final android.os.Parcelable.Creator<android.service.gatekeeper.GateKeeperResponse> CREATOR = null;
    private GateKeeperResponse(int p0) {}
    public static android.service.gatekeeper.GateKeeperResponse createGenericResponse(int p0) { return null; }
    private static android.service.gatekeeper.GateKeeperResponse createRetryResponse(int p0) { return null; }
    public static android.service.gatekeeper.GateKeeperResponse createOkResponse(byte[] p0, boolean p1) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public byte[] getPayload() { return null; }
    public int getTimeout() { return 0; }
    public boolean getShouldReEnroll() { return false; }
    public int getResponseCode() { return 0; }
}
