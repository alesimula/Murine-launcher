package com.android.internal.telephony;

public abstract class SmsAddress {
    public static final int TON_UNKNOWN = 0;
    public static final int TON_INTERNATIONAL = 1;
    public static final int TON_NATIONAL = 2;
    public static final int TON_NETWORK = 3;
    public static final int TON_SUBSCRIBER = 4;
    public static final int TON_ALPHANUMERIC = 5;
    public static final int TON_ABBREVIATED = 6;
    public int ton;
    public java.lang.String address;
    @android.annotation.UnsupportedAppUsage
    public byte[] origBytes;
    public SmsAddress() {}
    public java.lang.String getAddressString() { return null; }
    public boolean isAlphanumeric() { return false; }
    public boolean isNetworkSpecific() { return false; }
    public boolean couldBeEmailGateway() { return false; }
}
