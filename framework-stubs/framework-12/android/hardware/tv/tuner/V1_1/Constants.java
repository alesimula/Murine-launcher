package android.hardware.tv.tuner.V1_1;

public class Constants {
    public Constants() {}

    public final class AudioStreamType {
        public static final int UNDEFINED = 0;
        public static final int PCM = 1;
        public static final int MP3 = 2;
        public static final int MPEG1 = 3;
        public static final int MPEG2 = 4;
        public static final int MPEGH = 5;
        public static final int AAC = 6;
        public static final int AC3 = 7;
        public static final int EAC3 = 8;
        public static final int AC4 = 9;
        public static final int DTS = 10;
        public static final int DTS_HD = 11;
        public static final int WMA = 12;
        public static final int OPUS = 13;
        public static final int VORBIS = 14;
        public static final int DRA = 15;
        public AudioStreamType(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class Constant {
        public static final int INVALID_TS_PID = 65535;
        public static final int INVALID_STREAM_ID = 65535;
        public static final int INVALID_FILTER_ID = -1;
        public static final int INVALID_AV_SYNC_ID = -1;
        public static final int INVALID_MMTP_RECORD_EVENT_MPT_SEQUENCE_NUM = -1;
        public static final int INVALID_FIRST_MACROBLOCK_IN_SLICE = -1;
        public static final int INVALID_FRONTEND_SETTING_FREQUENCY = -1;
        public static final int INVALID_IP_FILTER_CONTEXT_ID = -1;
        public static final int INVALID_LTS_ID = -1;
        public static final int INVALID_FRONTEND_ID = -1;
        public static final int INVALID_LNB_ID = -1;
        public static final int INVALID_KEYTOKEN = 0;
        public Constant(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class Constant64Bit {
        public static final long INVALID_FILTER_ID_64BIT = -1L;
        public static final long INVALID_AV_SYNC_ID_64BIT = -1L;
        public static final long INVALID_PRESENTATION_TIME_STAMP = -1L;
        public Constant64Bit(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class DemuxFilterMonitorEventType {
        public static final int SCRAMBLING_STATUS = 1;
        public static final int IP_CID_CHANGE = 2;
        public DemuxFilterMonitorEventType(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class DemuxScIndex {
        public static final int I_FRAME = 1;
        public static final int P_FRAME = 2;
        public static final int B_FRAME = 4;
        public static final int SEQUENCE = 8;
        public static final int I_SLICE = 16;
        public static final int P_SLICE = 32;
        public static final int B_SLICE = 64;
        public static final int SI_SLICE = 128;
        public static final int SP_SLICE = 256;
        public DemuxScIndex(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class DemuxTsIndex {
        public static final int FIRST_PACKET = 1;
        public static final int PAYLOAD_UNIT_START_INDICATOR = 2;
        public static final int CHANGE_TO_NOT_SCRAMBLED = 4;
        public static final int CHANGE_TO_EVEN_SCRAMBLED = 8;
        public static final int CHANGE_TO_ODD_SCRAMBLED = 16;
        public static final int DISCONTINUITY_INDICATOR = 32;
        public static final int RANDOM_ACCESS_INDICATOR = 64;
        public static final int PRIORITY_INDICATOR = 128;
        public static final int PCR_FLAG = 256;
        public static final int OPCR_FLAG = 512;
        public static final int SPLICING_POINT_FLAG = 1024;
        public static final int PRIVATE_DATA = 2048;
        public static final int ADAPTATION_EXTENSION_FLAG = 4096;
        public static final int MPT_INDEX_MPT = 65536;
        public static final int MPT_INDEX_VIDEO = 131072;
        public static final int MPT_INDEX_AUDIO = 262144;
        public static final int MPT_INDEX_TIMESTAMP_TARGET_VIDEO = 524288;
        public static final int MPT_INDEX_TIMESTAMP_TARGET_AUDIO = 1048576;
        public DemuxTsIndex(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendAnalogAftFlag {
        public static final int UNDEFINED = 0;
        public static final int AFT_TRUE = 1;
        public static final int AFT_FALSE = 2;
        public FrontendAnalogAftFlag(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendCableTimeInterleaveMode {
        public static final int UNDEFINED = 0;
        public static final int AUTO = 1;
        public static final int INTERLEAVING_128_1_0 = 2;
        public static final int INTERLEAVING_128_1_1 = 4;
        public static final int INTERLEAVING_64_2 = 8;
        public static final int INTERLEAVING_32_4 = 16;
        public static final int INTERLEAVING_16_8 = 32;
        public static final int INTERLEAVING_8_16 = 64;
        public static final int INTERLEAVING_128_2 = 128;
        public static final int INTERLEAVING_128_3 = 256;
        public static final int INTERLEAVING_128_4 = 512;
        public FrontendCableTimeInterleaveMode(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendDtmbBandwidth {
        public static final int UNDEFINED = 0;
        public static final int AUTO = 1;
        public static final int BANDWIDTH_8MHZ = 2;
        public static final int BANDWIDTH_6MHZ = 4;
        public FrontendDtmbBandwidth(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendDtmbCodeRate {
        public static final int UNDEFINED = 0;
        public static final int AUTO = 1;
        public static final int CODERATE_2_5 = 2;
        public static final int CODERATE_3_5 = 4;
        public static final int CODERATE_4_5 = 8;
        public FrontendDtmbCodeRate(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendDtmbGuardInterval {
        public static final int UNDEFINED = 0;
        public static final int AUTO = 1;
        public static final int PN_420_VARIOUS = 2;
        public static final int PN_595_CONST = 4;
        public static final int PN_945_VARIOUS = 8;
        public static final int PN_420_CONST = 16;
        public static final int PN_945_CONST = 32;
        public static final int PN_RESERVED = 64;
        public FrontendDtmbGuardInterval(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendDtmbModulation {
        public static final int UNDEFINED = 0;
        public static final int AUTO = 1;
        public static final int CONSTELLATION_4QAM = 2;
        public static final int CONSTELLATION_4QAM_NR = 4;
        public static final int CONSTELLATION_16QAM = 8;
        public static final int CONSTELLATION_32QAM = 16;
        public static final int CONSTELLATION_64QAM = 32;
        public FrontendDtmbModulation(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendDtmbTimeInterleaveMode {
        public static final int UNDEFINED = 0;
        public static final int AUTO = 1;
        public static final int TIMER_INT_240 = 2;
        public static final int TIMER_INT_720 = 4;
        public FrontendDtmbTimeInterleaveMode(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendDtmbTransmissionMode {
        public static final int UNDEFINED = 0;
        public static final int AUTO = 1;
        public static final int C1 = 2;
        public static final int C3780 = 4;
        public FrontendDtmbTransmissionMode(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendDvbcBandwidth {
        public static final int UNDEFINED = 0;
        public static final int BANDWIDTH_5MHZ = 1;
        public static final int BANDWIDTH_6MHZ = 2;
        public static final int BANDWIDTH_7MHZ = 4;
        public static final int BANDWIDTH_8MHZ = 8;
        public FrontendDvbcBandwidth(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendDvbsScanType {
        public static final int UNDEFINED = 0;
        public static final int DIRECT = 1;
        public static final int DISEQC = 2;
        public static final int UNICABLE = 3;
        public static final int JESS = 4;
        public FrontendDvbsScanType(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendDvbtConstellation {
        public static final int UNDEFINED = 0;
        public static final int AUTO = 1;
        public static final int CONSTELLATION_QPSK = 2;
        public static final int CONSTELLATION_16QAM = 4;
        public static final int CONSTELLATION_64QAM = 8;
        public static final int CONSTELLATION_256QAM = 16;
        public static final int CONSTELLATION_QPSK_R = 32;
        public static final int CONSTELLATION_16QAM_R = 64;
        public static final int CONSTELLATION_64QAM_R = 128;
        public static final int CONSTELLATION_256QAM_R = 256;
        public FrontendDvbtConstellation(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendDvbtTransmissionMode {
        public static final int UNDEFINED = 0;
        public static final int AUTO = 1;
        public static final int MODE_2K = 2;
        public static final int MODE_8K = 4;
        public static final int MODE_4K = 8;
        public static final int MODE_1K = 16;
        public static final int MODE_16K = 32;
        public static final int MODE_32K = 64;
        public static final int MODE_8K_E = 128;
        public static final int MODE_16K_E = 256;
        public static final int MODE_32K_E = 512;
        public FrontendDvbtTransmissionMode(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendInnerFec {
        public static final long FEC_UNDEFINED = 0L;
        public static final long AUTO = 1L;
        public static final long FEC_1_2 = 2L;
        public static final long FEC_1_3 = 4L;
        public static final long FEC_1_4 = 8L;
        public static final long FEC_1_5 = 16L;
        public static final long FEC_2_3 = 32L;
        public static final long FEC_2_5 = 64L;
        public static final long FEC_2_9 = 128L;
        public static final long FEC_3_4 = 256L;
        public static final long FEC_3_5 = 512L;
        public static final long FEC_4_5 = 1024L;
        public static final long FEC_4_15 = 2048L;
        public static final long FEC_5_6 = 4096L;
        public static final long FEC_5_9 = 8192L;
        public static final long FEC_6_7 = 16384L;
        public static final long FEC_7_8 = 32768L;
        public static final long FEC_7_9 = 65536L;
        public static final long FEC_7_15 = 131072L;
        public static final long FEC_8_9 = 262144L;
        public static final long FEC_8_15 = 524288L;
        public static final long FEC_9_10 = 1048576L;
        public static final long FEC_9_20 = 2097152L;
        public static final long FEC_11_15 = 4194304L;
        public static final long FEC_11_20 = 8388608L;
        public static final long FEC_11_45 = 16777216L;
        public static final long FEC_13_18 = 33554432L;
        public static final long FEC_13_45 = 67108864L;
        public static final long FEC_14_45 = 134217728L;
        public static final long FEC_23_36 = 268435456L;
        public static final long FEC_25_36 = 536870912L;
        public static final long FEC_26_45 = 1073741824L;
        public static final long FEC_28_45 = -2147483648L;
        public static final long FEC_29_45 = 1L;
        public static final long FEC_31_45 = 2L;
        public static final long FEC_32_45 = 4L;
        public static final long FEC_77_90 = 8L;
        public static final long FEC_2_15 = 16L;
        public static final long FEC_3_15 = 32L;
        public static final long FEC_5_15 = 64L;
        public static final long FEC_6_15 = 128L;
        public static final long FEC_9_15 = 256L;
        public static final long FEC_10_15 = 512L;
        public static final long FEC_12_15 = 1024L;
        public static final long FEC_13_15 = 2048L;
        public static final long FEC_18_30 = 4096L;
        public static final long FEC_20_30 = 8192L;
        public static final long FEC_90_180 = 16384L;
        public static final long FEC_96_180 = 32768L;
        public static final long FEC_104_180 = 65536L;
        public static final long FEC_128_180 = 131072L;
        public static final long FEC_132_180 = 262144L;
        public static final long FEC_135_180 = 524288L;
        public static final long FEC_140_180 = 1048576L;
        public FrontendInnerFec(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendStatusTypeExt1_1 {
        public static final int MODULATIONS = 22;
        public static final int BERS = 23;
        public static final int CODERATES = 24;
        public static final int BANDWIDTH = 25;
        public static final int GUARD_INTERVAL = 26;
        public static final int TRANSMISSION_MODE = 27;
        public static final int UEC = 28;
        public static final int T2_SYSTEM_ID = 29;
        public static final int INTERLEAVINGS = 30;
        public static final int ISDBT_SEGMENTS = 31;
        public static final int TS_DATA_RATES = 32;
        public static final int ROLL_OFF = 33;
        public static final int IS_MISO = 34;
        public static final int IS_LINEAR = 35;
        public static final int IS_SHORT_FRAMES = 36;
        public FrontendStatusTypeExt1_1(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class FrontendType {
        public static final int UNDEFINED = 0;
        public static final int ANALOG = 1;
        public static final int ATSC = 2;
        public static final int ATSC3 = 3;
        public static final int DVBC = 4;
        public static final int DVBS = 5;
        public static final int DVBT = 6;
        public static final int ISDBS = 7;
        public static final int ISDBS3 = 8;
        public static final int ISDBT = 9;
        public static final int DTMB = 10;
        public FrontendType(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class ScramblingStatus {
        public static final int UNKNOWN = 1;
        public static final int NOT_SCRAMBLED = 2;
        public static final int SCRAMBLED = 4;
        public ScramblingStatus(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }

    public final class VideoStreamType {
        public static final int UNDEFINED = 0;
        public static final int RESERVED = 1;
        public static final int MPEG1 = 2;
        public static final int MPEG2 = 3;
        public static final int MPEG4P2 = 4;
        public static final int AVC = 5;
        public static final int HEVC = 6;
        public static final int VC1 = 7;
        public static final int VP8 = 8;
        public static final int VP9 = 9;
        public static final int AV1 = 10;
        public static final int AVS = 11;
        public static final int AVS2 = 12;
        public VideoStreamType(android.hardware.tv.tuner.V1_1.Constants p0) {}
    }
}
