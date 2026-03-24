package android.media.tv.tuner;

@android.annotation.SystemApi
public class Lnb implements java.lang.AutoCloseable {
    public static final int VOLTAGE_NONE = 0;
    public static final int VOLTAGE_5V = 1;
    public static final int VOLTAGE_11V = 2;
    public static final int VOLTAGE_12V = 3;
    public static final int VOLTAGE_13V = 4;
    public static final int VOLTAGE_14V = 5;
    public static final int VOLTAGE_15V = 6;
    public static final int VOLTAGE_18V = 7;
    public static final int VOLTAGE_19V = 8;
    public static final int TONE_NONE = 0;
    public static final int TONE_CONTINUOUS = 1;
    public static final int POSITION_UNDEFINED = 0;
    public static final int POSITION_A = 1;
    public static final int POSITION_B = 2;
    public static final int EVENT_TYPE_DISEQC_RX_OVERFLOW = 0;
    public static final int EVENT_TYPE_DISEQC_RX_TIMEOUT = 1;
    public static final int EVENT_TYPE_DISEQC_RX_PARITY_ERROR = 2;
    public static final int EVENT_TYPE_LNB_OVERLOAD = 3;
    java.util.Map<android.media.tv.tuner.LnbCallback, java.util.concurrent.Executor> mCallbackMap;
    android.media.tv.tuner.Tuner mOwner;
    void setCallbackAndOwner(android.media.tv.tuner.Tuner p0, java.util.concurrent.Executor p1, android.media.tv.tuner.LnbCallback p2) {}
    public void addCallback(java.util.concurrent.Executor p0, android.media.tv.tuner.LnbCallback p1) {}
    public boolean removeCallback(android.media.tv.tuner.LnbCallback p0) { return false; }
    void setOwner(android.media.tv.tuner.Tuner p0) {}
    boolean isClosed() { return false; }
    public int setVoltage(int p0) { return 0; }
    public int setTone(int p0) { return 0; }
    public int setSatellitePosition(int p0) { return 0; }
    public int sendDiseqcMessage(byte[] p0) { return 0; }
    public void close() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Position {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Tone {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Voltage {
    }
}
