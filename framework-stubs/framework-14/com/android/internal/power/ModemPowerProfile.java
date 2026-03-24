package com.android.internal.power;

public class ModemPowerProfile {
    public static final int MODEM_DRAIN_TYPE_SLEEP = 0;
    public static final int MODEM_DRAIN_TYPE_IDLE = 268435456;
    public static final int MODEM_DRAIN_TYPE_RX = 536870912;
    public static final int MODEM_DRAIN_TYPE_TX = 805306368;
    public static final int MODEM_TX_LEVEL_0 = 0;
    public static final int MODEM_TX_LEVEL_1 = 16777216;
    public static final int MODEM_TX_LEVEL_2 = 33554432;
    public static final int MODEM_TX_LEVEL_3 = 50331648;
    public static final int MODEM_TX_LEVEL_4 = 67108864;
    public static final int MODEM_RAT_TYPE_DEFAULT = 0;
    public static final int MODEM_RAT_TYPE_LTE = 1048576;
    public static final int MODEM_RAT_TYPE_NR = 2097152;
    public static final int MODEM_NR_FREQUENCY_RANGE_DEFAULT = 0;
    public static final int MODEM_NR_FREQUENCY_RANGE_LOW = 65536;
    public static final int MODEM_NR_FREQUENCY_RANGE_MID = 131072;
    public static final int MODEM_NR_FREQUENCY_RANGE_HIGH = 196608;
    public static final int MODEM_NR_FREQUENCY_RANGE_MMWAVE = 262144;
    public ModemPowerProfile() {}
    public void parseFromXml(android.content.res.XmlResourceParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public void setPowerConstant(int p0, java.lang.String p1) {}
    public double getAverageBatteryDrainMa(int p0) { return 0.0; }
    public static java.lang.String keyToString(int p0) { return null; }
    public void clear() {}
    public void dump(java.io.PrintWriter p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModemDrainType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModemNrFrequencyRange {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModemRatType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModemTxLevel {
    }
}
