package android.hardware.radio.messaging;

public class CdmaSmsAddress implements android.os.Parcelable {
    public int digitMode;
    public boolean isNumberModeDataNetwork;
    public int numberType;
    public int numberPlan;
    public byte[] digits;
    public static final android.os.Parcelable.Creator<android.hardware.radio.messaging.CdmaSmsAddress> CREATOR = null;
    public static final int DIGIT_MODE_FOUR_BIT = 0;
    public static final int DIGIT_MODE_EIGHT_BIT = 1;
    public static final int NUMBER_PLAN_UNKNOWN = 0;
    public static final int NUMBER_PLAN_TELEPHONY = 1;
    public static final int NUMBER_PLAN_RESERVED_2 = 2;
    public static final int NUMBER_PLAN_DATA = 3;
    public static final int NUMBER_PLAN_TELEX = 4;
    public static final int NUMBER_PLAN_RESERVED_5 = 5;
    public static final int NUMBER_PLAN_RESERVED_6 = 6;
    public static final int NUMBER_PLAN_RESERVED_7 = 7;
    public static final int NUMBER_PLAN_RESERVED_8 = 8;
    public static final int NUMBER_PLAN_PRIVATE = 9;
    public static final int NUMBER_PLAN_RESERVED_10 = 10;
    public static final int NUMBER_PLAN_RESERVED_11 = 11;
    public static final int NUMBER_PLAN_RESERVED_12 = 12;
    public static final int NUMBER_PLAN_RESERVED_13 = 13;
    public static final int NUMBER_PLAN_RESERVED_14 = 14;
    public static final int NUMBER_PLAN_RESERVED_15 = 15;
    public static final int NUMBER_TYPE_UNKNOWN = 0;
    public static final int NUMBER_TYPE_INTERNATIONAL_OR_DATA_IP = 1;
    public static final int NUMBER_TYPE_NATIONAL_OR_INTERNET_MAIL = 2;
    public static final int NUMBER_TYPE_NETWORK = 3;
    public static final int NUMBER_TYPE_SUBSCRIBER = 4;
    public static final int NUMBER_TYPE_ALPHANUMERIC = 5;
    public static final int NUMBER_TYPE_ABBREVIATED = 6;
    public static final int NUMBER_TYPE_RESERVED_7 = 7;
    public CdmaSmsAddress() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
