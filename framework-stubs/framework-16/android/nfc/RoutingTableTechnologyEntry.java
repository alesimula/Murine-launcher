package android.nfc;

@android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
public class RoutingTableTechnologyEntry extends android.nfc.NfcRoutingTableEntry {
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int TECHNOLOGY_A = 0;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int TECHNOLOGY_B = 1;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int TECHNOLOGY_F = 2;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int TECHNOLOGY_UNSUPPORTED = -1;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int TECHNOLOGY_V = 3;
    RoutingTableTechnologyEntry() { super(); }
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public int getTechnology() { return 0; }
}
