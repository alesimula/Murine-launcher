package android.net.wifi;

public enum SupplicantState implements android.os.Parcelable {
    ASSOCIATED,
    ASSOCIATING,
    AUTHENTICATING,
    COMPLETED,
    DISCONNECTED,
    DORMANT,
    FOUR_WAY_HANDSHAKE,
    GROUP_HANDSHAKE,
    INACTIVE,
    INTERFACE_DISABLED,
    INVALID,
    SCANNING,
    UNINITIALIZED;
    private SupplicantState() {}
    public int describeContents() { return 0; }
    public static boolean isValidState(android.net.wifi.SupplicantState p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
