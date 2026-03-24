package android.net.wifi.twt;

@android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
public interface TwtSession {
    public static final java.lang.String TWT_STATS_KEY_INT_AVERAGE_EOSP_DURATION_MICROS = "key_avg_eosp_dur";
    public static final java.lang.String TWT_STATS_KEY_INT_AVERAGE_RX_PACKET_COUNT = "key_avg_rx_pkt_count";
    public static final java.lang.String TWT_STATS_KEY_INT_AVERAGE_RX_PACKET_SIZE = "key_avg_rx_pkt_size";
    public static final java.lang.String TWT_STATS_KEY_INT_AVERAGE_TX_PACKET_COUNT = "key_avg_tx_pkt_count";
    public static final java.lang.String TWT_STATS_KEY_INT_AVERAGE_TX_PACKET_SIZE = "key_avg_tx_pkt_size";
    public static final java.lang.String TWT_STATS_KEY_INT_EOSP_COUNT = "key_eosp_count";
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getMloLinkId();
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void getStats(java.util.concurrent.Executor p0, java.util.function.Consumer<android.os.Bundle> p1);
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getWakeDurationMicros();
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public long getWakeIntervalMicros();
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void teardown();
}
