package android.hardware.radio.messaging;

public class CdmaSmsAddress implements android.os.Parcelable {
    @java.lang.Deprecated
    public int digitMode;
    @java.lang.Deprecated
    public boolean isNumberModeDataNetwork;
    @java.lang.Deprecated
    public int numberType;
    @java.lang.Deprecated
    public int numberPlan;
    @java.lang.Deprecated
    public byte[] digits;
    public static final android.os.Parcelable.Creator<android.hardware.radio.messaging.CdmaSmsAddress> CREATOR = null;
    @java.lang.Deprecated
    public static final int DIGIT_MODE_FOUR_BIT = 0;
    @java.lang.Deprecated
    public static final int DIGIT_MODE_EIGHT_BIT = 1;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_UNKNOWN = 0;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_TELEPHONY = 1;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_RESERVED_2 = 2;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_DATA = 3;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_TELEX = 4;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_RESERVED_5 = 5;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_RESERVED_6 = 6;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_RESERVED_7 = 7;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_RESERVED_8 = 8;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_PRIVATE = 9;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_RESERVED_10 = 10;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_RESERVED_11 = 11;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_RESERVED_12 = 12;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_RESERVED_13 = 13;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_RESERVED_14 = 14;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_RESERVED_15 = 15;
    @java.lang.Deprecated
    public static final int NUMBER_TYPE_UNKNOWN = 0;
    @java.lang.Deprecated
    public static final int NUMBER_TYPE_INTERNATIONAL_OR_DATA_IP = 1;
    @java.lang.Deprecated
    public static final int NUMBER_TYPE_NATIONAL_OR_INTERNET_MAIL = 2;
    @java.lang.Deprecated
    public static final int NUMBER_TYPE_NETWORK = 3;
    @java.lang.Deprecated
    public static final int NUMBER_TYPE_SUBSCRIBER = 4;
    @java.lang.Deprecated
    public static final int NUMBER_TYPE_ALPHANUMERIC = 5;
    @java.lang.Deprecated
    public static final int NUMBER_TYPE_ABBREVIATED = 6;
    @java.lang.Deprecated
    public static final int NUMBER_TYPE_RESERVED_7 = 7;
    public CdmaSmsAddress() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
