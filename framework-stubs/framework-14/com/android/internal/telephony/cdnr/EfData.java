package com.android.internal.telephony.cdnr;

public interface EfData {
    public static final int EF_SOURCE_CARRIER_CONFIG = 1;
    public static final int EF_SOURCE_CARRIER_API = 2;
    public static final int EF_SOURCE_USIM = 3;
    public static final int EF_SOURCE_SIM = 4;
    public static final int EF_SOURCE_CSIM = 5;
    public static final int EF_SOURCE_RUIM = 6;
    public static final int EF_SOURCE_VOICE_OPERATOR_SIGNALLING = 7;
    public static final int EF_SOURCE_DATA_OPERATOR_SIGNALLING = 8;
    public static final int EF_SOURCE_MODEM_CONFIG = 9;
    public static final int EF_SOURCE_ERI = 10;
    default public java.lang.String getServiceProviderName() { return null; }
    default public int getServiceProviderNameDisplayCondition(boolean p0) { return 0; }
    default public java.util.List<java.lang.String> getServiceProviderDisplayInformation() { return null; }
    default public java.util.List<com.android.internal.telephony.uicc.IccRecords.PlmnNetworkName> getPlmnNetworkNameList() { return null; }
    default public java.util.List<java.lang.String> getEhplmnList() { return null; }
    default public java.util.List<com.android.internal.telephony.uicc.IccRecords.OperatorPlmnInfo> getOperatorPlmnList() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EFSource {
    }
}
