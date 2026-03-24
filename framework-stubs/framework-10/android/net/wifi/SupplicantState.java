package android.net.wifi;

public enum SupplicantState implements android.os.Parcelable {
    DISCONNECTED,
    INTERFACE_DISABLED,
    INACTIVE,
    SCANNING,
    AUTHENTICATING,
    ASSOCIATING,
    ASSOCIATED,
    FOUR_WAY_HANDSHAKE,
    GROUP_HANDSHAKE,
    COMPLETED,
    DORMANT,
    UNINITIALIZED,
    INVALID;
    public static final android.os.Parcelable.Creator<android.net.wifi.SupplicantState> CREATOR = null;
    private SupplicantState() {}
    public static boolean isValidState(android.net.wifi.SupplicantState p0) { return false; }
    public static boolean isHandshakeState(android.net.wifi.SupplicantState p0) { return false; }
    public static boolean isConnecting(android.net.wifi.SupplicantState p0) { return false; }
    public static boolean isDriverActive(android.net.wifi.SupplicantState p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
