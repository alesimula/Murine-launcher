package com.android.internal.telephony.uicc;

public final class IsimServiceTable extends com.android.internal.telephony.uicc.IccServiceTable {
    public IsimServiceTable(byte[] p0) { super(null); }
    public boolean isAvailable(com.android.internal.telephony.uicc.IsimServiceTable.IsimService p0) { return false; }
    protected java.lang.String getTag() { return null; }
    protected java.lang.Object[] getValues() { return null; }
    public byte[] getISIMServiceTable() { return null; }

    public static enum IsimService {
        PCSCF_ADDRESS,
        GBA,
        HTTP_DIGEST,
        GBA_LOCALKEY_ESTABLISHMENT,
        PCSCF_DISCOVERY_FOR_IMS,
        SMS,
        SMSR,
        SM_OVERIP_AND_DATA_DL_VIA_SMS_PP,
        COMMUNICATION_CONTROL_FOR_IMS_BY_ISIM,
        UICC_ACCESS_TO_IMS;
    }
}
