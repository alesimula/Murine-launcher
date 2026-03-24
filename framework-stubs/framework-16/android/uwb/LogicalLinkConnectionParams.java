package android.uwb;

@android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
public final class LogicalLinkConnectionParams implements android.os.Parcelable {
    public static final int CONTROL_FIELD_LINK_TIMEOUT = 32;
    public static final int CONTROL_FIELD_MAX_LL_PDU_SIZE = 2;
    public static final int CONTROL_FIELD_MAX_LL_SDU_SIZE = 1;
    public static final int CONTROL_FIELD_PORT = 64;
    public static final int CONTROL_FIELD_RECEIVE_WINDOW_SIZE = 8;
    public static final int CONTROL_FIELD_REPEAT_COUNT_MAX = 16;
    public static final int CONTROL_FIELD_TRANSMIT_WINDOW_SIZE = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.uwb.LogicalLinkConnectionParams> CREATOR = null;
    LogicalLinkConnectionParams() {}
    public int describeContents() { return 0; }
    public int getDestinationPort() { return 0; }
    public int getLinkTimeout() { return 0; }
    public int getMaxLinkLayerPduSize() { return 0; }
    public int getMaxLinkLayerSduSize() { return 0; }
    public int getReceiveWindowSize() { return 0; }
    public int getRepeatCountMax() { return 0; }
    public int getSourcePort() { return 0; }
    public int getStatus() { return 0; }
    public int getTransmitWindowSize() { return 0; }
    public boolean hasDestinationPort() { return false; }
    public boolean hasLinkTimeout() { return false; }
    public boolean hasMaxLinkLayerPduSize() { return false; }
    public boolean hasMaxLinkLayerSduSize() { return false; }
    public boolean hasReceiveWindowSize() { return false; }
    public boolean hasRepeatCountMax() { return false; }
    public boolean hasSourcePort() { return false; }
    public boolean hasTransmitWindowSize() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0, int p1) {}
        @android.annotation.NonNull
        public android.uwb.LogicalLinkConnectionParams build() { return null; }
        @android.annotation.NonNull
        public android.uwb.LogicalLinkConnectionParams.Builder setDestinationPort(int p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.LogicalLinkConnectionParams.Builder setLinkTimeout(int p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.LogicalLinkConnectionParams.Builder setMaxLinkLayerPduSize(int p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.LogicalLinkConnectionParams.Builder setMaxLinkLayerSduSize(int p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.LogicalLinkConnectionParams.Builder setReceiveWindowSize(int p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.LogicalLinkConnectionParams.Builder setRepeatCountMax(int p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.LogicalLinkConnectionParams.Builder setSourcePort(int p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.LogicalLinkConnectionParams.Builder setTransmitWindowSize(int p0) { return null; }
    }
}
