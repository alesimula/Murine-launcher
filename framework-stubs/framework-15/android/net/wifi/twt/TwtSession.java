package android.net.wifi.twt;

public interface TwtSession {
    public static final java.lang.String TWT_STATS_KEY_INT_AVERAGE_EOSP_DURATION_MICROS = "key_avg_eosp_dur";
    public static final java.lang.String TWT_STATS_KEY_INT_AVERAGE_RX_PACKET_COUNT = "key_avg_rx_pkt_count";
    public static final java.lang.String TWT_STATS_KEY_INT_AVERAGE_RX_PACKET_SIZE = "key_avg_rx_pkt_size";
    public static final java.lang.String TWT_STATS_KEY_INT_AVERAGE_TX_PACKET_COUNT = "key_avg_tx_pkt_count";
    public static final java.lang.String TWT_STATS_KEY_INT_AVERAGE_TX_PACKET_SIZE = "key_avg_tx_pkt_size";
    public static final java.lang.String TWT_STATS_KEY_INT_EOSP_COUNT = "key_eosp_count";
    public int getMloLinkId();
    public void getStats(java.util.concurrent.Executor p0, java.util.function.Consumer<android.os.Bundle> p1);
    public int getWakeDurationMicros();
    public long getWakeIntervalMicros();
    public void teardown();
}
