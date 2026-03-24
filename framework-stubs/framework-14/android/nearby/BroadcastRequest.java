package android.nearby;

public abstract class BroadcastRequest {
    public static final int BROADCAST_TYPE_NEARBY_PRESENCE = 3;
    public static final int BROADCAST_TYPE_UNKNOWN = -1;
    public static final int MEDIUM_BLE = 1;
    public static final int PRESENCE_VERSION_UNKNOWN = -1;
    public static final int PRESENCE_VERSION_V0 = 0;
    public static final int PRESENCE_VERSION_V1 = 1;
    public static final int UNKNOWN_TX_POWER = -127;
    BroadcastRequest() {}
    public int getType() { return 0; }
    public int getVersion() { return 0; }
    public int getTxPower() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getMediums() { return null; }
}
