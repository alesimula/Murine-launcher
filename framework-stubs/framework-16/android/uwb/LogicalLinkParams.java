package android.uwb;

@android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
public final class LogicalLinkParams implements android.os.Parcelable {
    public static final int CONNECT_ID_UNSPECIFIED = -1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.uwb.LogicalLinkParams> CREATOR = null;
    public static final int LINK_LAYER_MODE_CONNECTION_LESS_NON_SECURE = 0;
    public static final int LINK_LAYER_MODE_CONNECTION_LESS_SECURE = 1;
    public static final int LINK_LAYER_MODE_CONNECTION_LESS_UWBS_UWBS = 4;
    public static final int LINK_LAYER_MODE_CONNECTION_ORIENTED_NON_SECURE = 2;
    public static final int LINK_LAYER_MODE_CONNECTION_ORIENTED_SECURE = 3;
    public static final int LINK_LAYER_MODE_CONNECTION_ORIENTED_UWBS_UWBS = 5;
    public static final int LOGICAL_LINK_CLOSE_REASON_HOST_INITIATED = 5;
    public static final int LOGICAL_LINK_CLOSE_REASON_REMOTE = 0;
    public static final int LOGICAL_LINK_CLOSE_REASON_SECURE_COMPONENT = 3;
    public static final int LOGICAL_LINK_CLOSE_REASON_TIMEOUT = 1;
    public static final int LOGICAL_LINK_CLOSE_REASON_TRANSMISSION_ERROR = 2;
    public static final int LOGICAL_LINK_CLOSE_REASON_UNKNOWN_REASON = 4;
    public static final int LOGICAL_LINK_STATUS_ACCEPTED = 0;
    public static final int LOGICAL_LINK_STATUS_CO_CONNECTED = 2;
    public static final int LOGICAL_LINK_STATUS_ERROR = 3;
    public static final int LOGICAL_LINK_STATUS_FAILED = 1;
    public static final int LOGICAL_LINK_STATUS_OK = 0;
    public static final int LOGICAL_LINK_STATUS_REJECTED = 1;
    LogicalLinkParams() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public byte[] getDestinationAddress() { return null; }
    @android.annotation.NonNull
    public int getLinkLayerModeSelector() { return 0; }
    @android.annotation.NonNull
    public int getLogicalLinkClassLength() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0, android.uwb.UwbAddress p1) {}
        @android.annotation.NonNull
        public android.uwb.LogicalLinkParams build() { return null; }
        @android.annotation.NonNull
        public android.uwb.LogicalLinkParams.Builder setLogicalLinkClassLength(int p0) { return null; }
    }
}
