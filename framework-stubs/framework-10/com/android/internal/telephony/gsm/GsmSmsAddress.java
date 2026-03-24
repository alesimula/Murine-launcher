package com.android.internal.telephony.gsm;

public class GsmSmsAddress extends com.android.internal.telephony.SmsAddress {
    static final int OFFSET_ADDRESS_LENGTH = 0;
    static final int OFFSET_TOA = 1;
    static final int OFFSET_ADDRESS_VALUE = 2;
    public GsmSmsAddress(byte[] p0, int p1, int p2) throws java.text.ParseException { super(); }
    public java.lang.String getAddressString() { return null; }
    public boolean isAlphanumeric() { return false; }
    public boolean isNetworkSpecific() { return false; }
    public boolean isCphsVoiceMessageIndicatorAddress() { return false; }
    public boolean isCphsVoiceMessageSet() { return false; }
    public boolean isCphsVoiceMessageClear() { return false; }
}
