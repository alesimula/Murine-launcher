package android.telephony;

public final class AccessNetworkConstants {
    @android.annotation.SystemApi
    public static final int TRANSPORT_TYPE_INVALID = -1;
    public static final int TRANSPORT_TYPE_WWAN = 1;
    public static final int TRANSPORT_TYPE_WLAN = 2;
    public static java.lang.String transportTypeToString(int p0) { return null; }

    public static final class UtranBand {
        public static final int BAND_1 = 1;
        public static final int BAND_2 = 2;
        public static final int BAND_3 = 3;
        public static final int BAND_4 = 4;
        public static final int BAND_5 = 5;
        public static final int BAND_6 = 6;
        public static final int BAND_7 = 7;
        public static final int BAND_8 = 8;
        public static final int BAND_9 = 9;
        public static final int BAND_10 = 10;
        public static final int BAND_11 = 11;
        public static final int BAND_12 = 12;
        public static final int BAND_13 = 13;
        public static final int BAND_14 = 14;
        public static final int BAND_19 = 19;
        public static final int BAND_20 = 20;
        public static final int BAND_21 = 21;
        public static final int BAND_22 = 22;
        public static final int BAND_25 = 25;
        public static final int BAND_26 = 26;
        public static final int BAND_A = 101;
        public static final int BAND_B = 102;
        public static final int BAND_C = 103;
        public static final int BAND_D = 104;
        public static final int BAND_E = 105;
        public static final int BAND_F = 106;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface UtranBands {
        }
    }

    public static final class AccessNetworkType {
        public static final int UNKNOWN = 0;
        public static final int GERAN = 1;
        public static final int UTRAN = 2;
        public static final int EUTRAN = 3;
        public static final int CDMA2000 = 4;
        public static final int IWLAN = 5;
        public static final int NGRAN = 6;
        public static java.lang.String toString(int p0) { return null; }
        public static int fromString(java.lang.String p0) { return 0; }
    }

    public static final class GeranBand {
        public static final int BAND_T380 = 1;
        public static final int BAND_T410 = 2;
        public static final int BAND_450 = 3;
        public static final int BAND_480 = 4;
        public static final int BAND_710 = 5;
        public static final int BAND_750 = 6;
        public static final int BAND_T810 = 7;
        public static final int BAND_850 = 8;
        public static final int BAND_P900 = 9;
        public static final int BAND_E900 = 10;
        public static final int BAND_R900 = 11;
        public static final int BAND_DCS1800 = 12;
        public static final int BAND_PCS1900 = 13;
        public static final int BAND_ER900 = 14;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface GeranBands {
        }
    }

    public static final class NgranBands {
        public static final int BAND_1 = 1;
        public static final int BAND_2 = 2;
        public static final int BAND_3 = 3;
        public static final int BAND_5 = 5;
        public static final int BAND_7 = 7;
        public static final int BAND_8 = 8;
        public static final int BAND_12 = 12;
        public static final int BAND_14 = 14;
        public static final int BAND_18 = 18;
        public static final int BAND_20 = 20;
        public static final int BAND_25 = 25;
        public static final int BAND_26 = 26;
        public static final int BAND_28 = 28;
        public static final int BAND_29 = 29;
        public static final int BAND_30 = 30;
        public static final int BAND_34 = 34;
        public static final int BAND_38 = 38;
        public static final int BAND_39 = 39;
        public static final int BAND_40 = 40;
        public static final int BAND_41 = 41;
        public static final int BAND_46 = 46;
        public static final int BAND_48 = 48;
        public static final int BAND_50 = 50;
        public static final int BAND_51 = 51;
        public static final int BAND_53 = 53;
        public static final int BAND_65 = 65;
        public static final int BAND_66 = 66;
        public static final int BAND_70 = 70;
        public static final int BAND_71 = 71;
        public static final int BAND_74 = 74;
        public static final int BAND_75 = 75;
        public static final int BAND_76 = 76;
        public static final int BAND_77 = 77;
        public static final int BAND_78 = 78;
        public static final int BAND_79 = 79;
        public static final int BAND_80 = 80;
        public static final int BAND_81 = 81;
        public static final int BAND_82 = 82;
        public static final int BAND_83 = 83;
        public static final int BAND_84 = 84;
        public static final int BAND_86 = 86;
        public static final int BAND_89 = 89;
        public static final int BAND_90 = 90;
        public static final int BAND_91 = 91;
        public static final int BAND_92 = 92;
        public static final int BAND_93 = 93;
        public static final int BAND_94 = 94;
        public static final int BAND_95 = 95;
        public static final int BAND_96 = 96;
        public static final int BAND_257 = 257;
        public static final int BAND_258 = 258;
        public static final int BAND_260 = 260;
        public static final int BAND_261 = 261;
        @android.annotation.SystemApi
        public static final int FREQUENCY_RANGE_GROUP_UNKNOWN = 0;
        @android.annotation.SystemApi
        public static final int FREQUENCY_RANGE_GROUP_1 = 1;
        @android.annotation.SystemApi
        public static final int FREQUENCY_RANGE_GROUP_2 = 2;
        @android.annotation.SystemApi
        public static int getFrequencyRangeGroup(int p0) { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface FrequencyRangeGroup {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface NgranBand {
        }
    }

    public static final class EutranBand {
        public static final int BAND_1 = 1;
        public static final int BAND_2 = 2;
        public static final int BAND_3 = 3;
        public static final int BAND_4 = 4;
        public static final int BAND_5 = 5;
        public static final int BAND_6 = 6;
        public static final int BAND_7 = 7;
        public static final int BAND_8 = 8;
        public static final int BAND_9 = 9;
        public static final int BAND_10 = 10;
        public static final int BAND_11 = 11;
        public static final int BAND_12 = 12;
        public static final int BAND_13 = 13;
        public static final int BAND_14 = 14;
        public static final int BAND_17 = 17;
        public static final int BAND_18 = 18;
        public static final int BAND_19 = 19;
        public static final int BAND_20 = 20;
        public static final int BAND_21 = 21;
        public static final int BAND_22 = 22;
        public static final int BAND_23 = 23;
        public static final int BAND_24 = 24;
        public static final int BAND_25 = 25;
        public static final int BAND_26 = 26;
        public static final int BAND_27 = 27;
        public static final int BAND_28 = 28;
        public static final int BAND_30 = 30;
        public static final int BAND_31 = 31;
        public static final int BAND_33 = 33;
        public static final int BAND_34 = 34;
        public static final int BAND_35 = 35;
        public static final int BAND_36 = 36;
        public static final int BAND_37 = 37;
        public static final int BAND_38 = 38;
        public static final int BAND_39 = 39;
        public static final int BAND_40 = 40;
        public static final int BAND_41 = 41;
        public static final int BAND_42 = 42;
        public static final int BAND_43 = 43;
        public static final int BAND_44 = 44;
        public static final int BAND_45 = 45;
        public static final int BAND_46 = 46;
        public static final int BAND_47 = 47;
        public static final int BAND_48 = 48;
        public static final int BAND_49 = 49;
        public static final int BAND_50 = 50;
        public static final int BAND_51 = 51;
        public static final int BAND_52 = 52;
        public static final int BAND_53 = 53;
        public static final int BAND_65 = 65;
        public static final int BAND_66 = 66;
        public static final int BAND_68 = 68;
        public static final int BAND_70 = 70;
        public static final int BAND_71 = 71;
        public static final int BAND_72 = 72;
        public static final int BAND_73 = 73;
        public static final int BAND_74 = 74;
        public static final int BAND_85 = 85;
        public static final int BAND_87 = 87;
        public static final int BAND_88 = 88;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface EutranBands {
        }
    }

    public static final class CdmaBands {
        public static final int BAND_0 = 1;
        public static final int BAND_1 = 2;
        public static final int BAND_2 = 3;
        public static final int BAND_3 = 4;
        public static final int BAND_4 = 5;
        public static final int BAND_5 = 6;
        public static final int BAND_6 = 7;
        public static final int BAND_7 = 8;
        public static final int BAND_8 = 9;
        public static final int BAND_9 = 10;
        public static final int BAND_10 = 11;
        public static final int BAND_11 = 12;
        public static final int BAND_12 = 13;
        public static final int BAND_13 = 14;
        public static final int BAND_14 = 15;
        public static final int BAND_15 = 16;
        public static final int BAND_16 = 17;
        public static final int BAND_17 = 18;
        public static final int BAND_18 = 19;
        public static final int BAND_19 = 20;
        public static final int BAND_20 = 21;
        public static final int BAND_21 = 22;
    }

    static enum EutranBandArfcnFrequency {
        EUTRAN_ARFCN_FREQUENCY_BAND_1,
        EUTRAN_ARFCN_FREQUENCY_BAND_2,
        EUTRAN_ARFCN_FREQUENCY_BAND_3,
        EUTRAN_ARFCN_FREQUENCY_BAND_4,
        EUTRAN_ARFCN_FREQUENCY_BAND_5,
        EUTRAN_ARFCN_FREQUENCY_BAND_6,
        EUTRAN_ARFCN_FREQUENCY_BAND_7,
        EUTRAN_ARFCN_FREQUENCY_BAND_8,
        EUTRAN_ARFCN_FREQUENCY_BAND_9,
        EUTRAN_ARFCN_FREQUENCY_BAND_10,
        EUTRAN_ARFCN_FREQUENCY_BAND_11,
        EUTRAN_ARFCN_FREQUENCY_BAND_12,
        EUTRAN_ARFCN_FREQUENCY_BAND_13,
        EUTRAN_ARFCN_FREQUENCY_BAND_14,
        EUTRAN_ARFCN_FREQUENCY_BAND_17,
        EUTRAN_ARFCN_FREQUENCY_BAND_18,
        EUTRAN_ARFCN_FREQUENCY_BAND_19,
        EUTRAN_ARFCN_FREQUENCY_BAND_20,
        EUTRAN_ARFCN_FREQUENCY_BAND_21,
        EUTRAN_ARFCN_FREQUENCY_BAND_22,
        EUTRAN_ARFCN_FREQUENCY_BAND_23,
        EUTRAN_ARFCN_FREQUENCY_BAND_24,
        EUTRAN_ARFCN_FREQUENCY_BAND_25,
        EUTRAN_ARFCN_FREQUENCY_BAND_26,
        EUTRAN_ARFCN_FREQUENCY_BAND_27,
        EUTRAN_ARFCN_FREQUENCY_BAND_28,
        EUTRAN_ARFCN_FREQUENCY_BAND_30,
        EUTRAN_ARFCN_FREQUENCY_BAND_31,
        EUTRAN_ARFCN_FREQUENCY_BAND_33,
        EUTRAN_ARFCN_FREQUENCY_BAND_34,
        EUTRAN_ARFCN_FREQUENCY_BAND_35,
        EUTRAN_ARFCN_FREQUENCY_BAND_36,
        EUTRAN_ARFCN_FREQUENCY_BAND_37,
        EUTRAN_ARFCN_FREQUENCY_BAND_38,
        EUTRAN_ARFCN_FREQUENCY_BAND_39,
        EUTRAN_ARFCN_FREQUENCY_BAND_40,
        EUTRAN_ARFCN_FREQUENCY_BAND_41,
        EUTRAN_ARFCN_FREQUENCY_BAND_42,
        EUTRAN_ARFCN_FREQUENCY_BAND_43,
        EUTRAN_ARFCN_FREQUENCY_BAND_44,
        EUTRAN_ARFCN_FREQUENCY_BAND_45,
        EUTRAN_ARFCN_FREQUENCY_BAND_46,
        EUTRAN_ARFCN_FREQUENCY_BAND_47,
        EUTRAN_ARFCN_FREQUENCY_BAND_48,
        EUTRAN_ARFCN_FREQUENCY_BAND_49,
        EUTRAN_ARFCN_FREQUENCY_BAND_50,
        EUTRAN_ARFCN_FREQUENCY_BAND_51,
        EUTRAN_ARFCN_FREQUENCY_BAND_52,
        EUTRAN_ARFCN_FREQUENCY_BAND_53,
        EUTRAN_ARFCN_FREQUENCY_BAND_65,
        EUTRAN_ARFCN_FREQUENCY_BAND_66,
        EUTRAN_ARFCN_FREQUENCY_BAND_68,
        EUTRAN_ARFCN_FREQUENCY_BAND_70,
        EUTRAN_ARFCN_FREQUENCY_BAND_71,
        EUTRAN_ARFCN_FREQUENCY_BAND_72,
        EUTRAN_ARFCN_FREQUENCY_BAND_73,
        EUTRAN_ARFCN_FREQUENCY_BAND_74,
        EUTRAN_ARFCN_FREQUENCY_BAND_85,
        EUTRAN_ARFCN_FREQUENCY_BAND_87,
        EUTRAN_ARFCN_FREQUENCY_BAND_88;
        int band;
        int downlinkLowKhz;
        int downlinkOffset;
        int downlinkRange;
        int uplinkLowKhz;
        int uplinkOffset;
        int uplinkRange;
    }

    static enum GeranBandArfcnFrequency {
        GERAN_ARFCN_FREQUENCY_BAND_450,
        GERAN_ARFCN_FREQUENCY_BAND_480,
        GERAN_ARFCN_FREQUENCY_BAND_850,
        GERAN_ARFCN_FREQUENCY_BAND_DCS1800,
        GERAN_ARFCN_FREQUENCY_BAND_PCS1900,
        GERAN_ARFCN_FREQUENCY_BAND_E900_1,
        GERAN_ARFCN_FREQUENCY_BAND_E900_2,
        GERAN_ARFCN_FREQUENCY_BAND_R900_1,
        GERAN_ARFCN_FREQUENCY_BAND_R900_2,
        GERAN_ARFCN_FREQUENCY_BAND_P900,
        GERAN_ARFCN_FREQUENCY_BAND_ER900_1,
        GERAN_ARFCN_FREQUENCY_BAND_ER900_2;
        int band;
        int uplinkFrequencyFirst;
        int arfcnOffset;
        int arfcnRangeFirst;
        int arfcnRangeLast;
        int downlinkOffset;
    }

    static enum NgranArfcnFrequency {
        NGRAN_ARFCN_FREQUENCY_RANGE_1,
        NGRAN_ARFCN_FREQUENCY_RANGE_2,
        NGRAN_ARFCN_FREQUENCY_RANGE_3;
        int globalKhz;
        int rangeOffset;
        int arfcnOffset;
        int rangeFirst;
        int rangeLast;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RadioAccessNetworkType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransportType {
    }

    static enum UtranBandArfcnFrequency {
        UTRAN_ARFCN_FREQUENCY_BAND_1,
        UTRAN_ARFCN_FREQUENCY_BAND_2,
        UTRAN_ARFCN_FREQUENCY_BAND_3,
        UTRAN_ARFCN_FREQUENCY_BAND_4,
        UTRAN_ARFCN_FREQUENCY_BAND_5,
        UTRAN_ARFCN_FREQUENCY_BAND_6,
        UTRAN_ARFCN_FREQUENCY_BAND_7,
        UTRAN_ARFCN_FREQUENCY_BAND_8,
        UTRAN_ARFCN_FREQUENCY_BAND_9,
        UTRAN_ARFCN_FREQUENCY_BAND_10,
        UTRAN_ARFCN_FREQUENCY_BAND_11,
        UTRAN_ARFCN_FREQUENCY_BAND_12,
        UTRAN_ARFCN_FREQUENCY_BAND_13,
        UTRAN_ARFCN_FREQUENCY_BAND_14,
        UTRAN_ARFCN_FREQUENCY_BAND_19,
        UTRAN_ARFCN_FREQUENCY_BAND_20,
        UTRAN_ARFCN_FREQUENCY_BAND_21,
        UTRAN_ARFCN_FREQUENCY_BAND_22,
        UTRAN_ARFCN_FREQUENCY_BAND_25,
        UTRAN_ARFCN_FREQUENCY_BAND_A,
        UTRAN_ARFCN_FREQUENCY_BAND_B,
        UTRAN_ARFCN_FREQUENCY_BAND_C,
        UTRAN_ARFCN_FREQUENCY_BAND_D,
        UTRAN_ARFCN_FREQUENCY_BAND_E,
        UTRAN_ARFCN_FREQUENCY_BAND_F;
        int band;
        int downlinkOffset;
        int downlinkRangeFirst;
        int downlinkRangeLast;
        int uplinkOffset;
        int uplinkRangeFirst;
        int uplinkRangeLast;
    }
}
