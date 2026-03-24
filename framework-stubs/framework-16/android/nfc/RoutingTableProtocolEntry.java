package android.nfc;

@android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
public class RoutingTableProtocolEntry extends android.nfc.NfcRoutingTableEntry {
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int PROTOCOL_ISO_DEP = 4;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int PROTOCOL_NDEF = 7;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int PROTOCOL_NFC_DEP = 5;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int PROTOCOL_T1T = 1;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int PROTOCOL_T2T = 2;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int PROTOCOL_T3T = 3;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int PROTOCOL_T5T = 6;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int PROTOCOL_UNDETERMINED = 0;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int PROTOCOL_UNSUPPORTED = -1;
    RoutingTableProtocolEntry() { super(); }
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public int getProtocol() { return 0; }
}
