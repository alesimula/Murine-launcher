package android.uwb;

@android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
public final class LogicalLinkConnectionRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.uwb.LogicalLinkConnectionRequest> CREATOR = null;
    LogicalLinkConnectionRequest() {}
    public int describeContents() { return 0; }
    public int getConnectId() { return 0; }
    public int getLinkLayerModeSelector() { return 0; }
    @android.annotation.NonNull
    public android.uwb.UwbAddress getSourceAddress() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0, int p1, android.uwb.UwbAddress p2) {}
        @android.annotation.NonNull
        public android.uwb.LogicalLinkConnectionRequest build() { return null; }
    }
}
