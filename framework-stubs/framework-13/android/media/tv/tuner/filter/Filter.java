package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class Filter implements java.lang.AutoCloseable {
    public static final int TYPE_UNDEFINED = 0;
    public static final int TYPE_TS = 1;
    public static final int TYPE_MMTP = 2;
    public static final int TYPE_IP = 4;
    public static final int TYPE_TLV = 8;
    public static final int TYPE_ALP = 16;
    public static final int SUBTYPE_UNDEFINED = 0;
    public static final int SUBTYPE_SECTION = 1;
    public static final int SUBTYPE_PES = 2;
    public static final int SUBTYPE_AUDIO = 3;
    public static final int SUBTYPE_VIDEO = 4;
    public static final int SUBTYPE_DOWNLOAD = 5;
    public static final int SUBTYPE_RECORD = 6;
    public static final int SUBTYPE_TS = 7;
    public static final int SUBTYPE_PCR = 8;
    public static final int SUBTYPE_TEMI = 9;
    public static final int SUBTYPE_MMTP = 10;
    public static final int SUBTYPE_NTP = 11;
    public static final int SUBTYPE_IP_PAYLOAD = 12;
    public static final int SUBTYPE_IP = 13;
    public static final int SUBTYPE_PAYLOAD_THROUGH = 14;
    public static final int SUBTYPE_TLV = 15;
    public static final int SUBTYPE_PTP = 16;
    public static final int STATUS_DATA_READY = 1;
    public static final int STATUS_LOW_WATER = 2;
    public static final int STATUS_HIGH_WATER = 4;
    public static final int STATUS_OVERFLOW = 8;
    public static final int SCRAMBLING_STATUS_UNKNOWN = 1;
    public static final int SCRAMBLING_STATUS_NOT_SCRAMBLED = 2;
    public static final int SCRAMBLING_STATUS_SCRAMBLED = 4;
    public static final int MONITOR_EVENT_SCRAMBLING_STATUS = 1;
    public static final int MONITOR_EVENT_IP_CID_CHANGE = 2;
    public void setType(int p0, int p1) {}
    public void setCallback(android.media.tv.tuner.filter.FilterCallback p0, java.util.concurrent.Executor p1) {}
    public android.media.tv.tuner.filter.FilterCallback getCallback() { return null; }
    public int configure(android.media.tv.tuner.filter.FilterConfiguration p0) { return 0; }
    public int getId() { return 0; }
    public long getIdLong() { return 0L; }
    public int setMonitorEventMask(int p0) { return 0; }
    public int setDataSource(android.media.tv.tuner.filter.Filter p0) { return 0; }
    public int start() { return 0; }
    public int stop() { return 0; }
    public int flush() { return 0; }
    public int read(byte[] p0, long p1, long p2) { return 0; }
    public void close() {}
    public java.lang.String acquireSharedFilterToken() { return null; }
    public void freeSharedFilterToken(java.lang.String p0) {}
    public int delayCallbackForDurationMillis(long p0) { return 0; }
    public int delayCallbackUntilBytesAccumulated(int p0) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MonitorEventMask {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScramblingStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Subtype {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
