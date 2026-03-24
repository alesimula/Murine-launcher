package android.hardware.radio.network;

public class BarringInfo implements android.os.Parcelable {
    public int serviceType;
    public int barringType;
    public android.hardware.radio.network.BarringTypeSpecificInfo barringTypeSpecificInfo;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.BarringInfo> CREATOR = null;
    public static final int BARRING_TYPE_NONE = 0;
    public static final int BARRING_TYPE_CONDITIONAL = 1;
    public static final int BARRING_TYPE_UNCONDITIONAL = 2;
    public static final int SERVICE_TYPE_CS_SERVICE = 0;
    public static final int SERVICE_TYPE_PS_SERVICE = 1;
    public static final int SERVICE_TYPE_CS_VOICE = 2;
    public static final int SERVICE_TYPE_MO_SIGNALLING = 3;
    public static final int SERVICE_TYPE_MO_DATA = 4;
    public static final int SERVICE_TYPE_CS_FALLBACK = 5;
    public static final int SERVICE_TYPE_MMTEL_VOICE = 6;
    public static final int SERVICE_TYPE_MMTEL_VIDEO = 7;
    public static final int SERVICE_TYPE_EMERGENCY = 8;
    public static final int SERVICE_TYPE_SMS = 9;
    public static final int SERVICE_TYPE_OPERATOR_1 = 1001;
    public static final int SERVICE_TYPE_OPERATOR_2 = 1002;
    public static final int SERVICE_TYPE_OPERATOR_3 = 1003;
    public static final int SERVICE_TYPE_OPERATOR_4 = 1004;
    public static final int SERVICE_TYPE_OPERATOR_5 = 1005;
    public static final int SERVICE_TYPE_OPERATOR_6 = 1006;
    public static final int SERVICE_TYPE_OPERATOR_7 = 1007;
    public static final int SERVICE_TYPE_OPERATOR_8 = 1008;
    public static final int SERVICE_TYPE_OPERATOR_9 = 1009;
    public static final int SERVICE_TYPE_OPERATOR_10 = 1010;
    public static final int SERVICE_TYPE_OPERATOR_11 = 1011;
    public static final int SERVICE_TYPE_OPERATOR_12 = 1012;
    public static final int SERVICE_TYPE_OPERATOR_13 = 1013;
    public static final int SERVICE_TYPE_OPERATOR_14 = 1014;
    public static final int SERVICE_TYPE_OPERATOR_15 = 1015;
    public static final int SERVICE_TYPE_OPERATOR_16 = 1016;
    public static final int SERVICE_TYPE_OPERATOR_17 = 1017;
    public static final int SERVICE_TYPE_OPERATOR_18 = 1018;
    public static final int SERVICE_TYPE_OPERATOR_19 = 1019;
    public static final int SERVICE_TYPE_OPERATOR_20 = 1020;
    public static final int SERVICE_TYPE_OPERATOR_21 = 1021;
    public static final int SERVICE_TYPE_OPERATOR_22 = 1022;
    public static final int SERVICE_TYPE_OPERATOR_23 = 1023;
    public static final int SERVICE_TYPE_OPERATOR_24 = 1024;
    public static final int SERVICE_TYPE_OPERATOR_25 = 1025;
    public static final int SERVICE_TYPE_OPERATOR_26 = 1026;
    public static final int SERVICE_TYPE_OPERATOR_27 = 1027;
    public static final int SERVICE_TYPE_OPERATOR_28 = 1028;
    public static final int SERVICE_TYPE_OPERATOR_29 = 1029;
    public static final int SERVICE_TYPE_OPERATOR_30 = 1030;
    public static final int SERVICE_TYPE_OPERATOR_31 = 1031;
    public static final int SERVICE_TYPE_OPERATOR_32 = 1032;
    public BarringInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
