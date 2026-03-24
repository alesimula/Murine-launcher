package com.android.internal.telephony.phonenumbers;

public class ShortNumberInfo {
    public static com.android.internal.telephony.phonenumbers.ShortNumberInfo getInstance() { return null; }
    ShortNumberInfo(com.android.internal.telephony.phonenumbers.internal.MatcherApi p0, com.android.internal.telephony.phonenumbers.metadata.source.RegionMetadataSource p1) {}
    public boolean isPossibleShortNumberForRegion(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.String p1) { return false; }
    public boolean isPossibleShortNumber(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return false; }
    public boolean isValidShortNumberForRegion(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.String p1) { return false; }
    public boolean isValidShortNumber(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return false; }
    public com.android.internal.telephony.phonenumbers.ShortNumberInfo.ShortNumberCost getExpectedCostForRegion(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.String p1) { return null; }
    public com.android.internal.telephony.phonenumbers.ShortNumberInfo.ShortNumberCost getExpectedCost(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return null; }
    java.lang.String getExampleShortNumber(java.lang.String p0) { return null; }
    java.lang.String getExampleShortNumberForCost(java.lang.String p0, com.android.internal.telephony.phonenumbers.ShortNumberInfo.ShortNumberCost p1) { return null; }
    public boolean connectsToEmergencyNumber(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean isEmergencyNumber(java.lang.CharSequence p0, java.lang.String p1) { return false; }
    public boolean isCarrierSpecific(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return false; }
    public boolean isCarrierSpecificForRegion(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.String p1) { return false; }
    public boolean isSmsServiceForRegion(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.String p1) { return false; }

    public static enum ShortNumberCost {
        TOLL_FREE,
        STANDARD_RATE,
        PREMIUM_RATE,
        UNKNOWN_COST;
    }
}
