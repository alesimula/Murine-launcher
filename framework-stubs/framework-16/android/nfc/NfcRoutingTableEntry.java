package android.nfc;

@android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
public abstract class NfcRoutingTableEntry {
    public static final int TYPE_AID = 0;
    public static final int TYPE_PROTOCOL = 1;
    public static final int TYPE_SYSTEM_CODE = 3;
    public static final int TYPE_TECHNOLOGY = 2;
    NfcRoutingTableEntry() {}
    public int getNfceeId() { return 0; }
    public int getRouteType() { return 0; }
    public int getType() { return 0; }
}
