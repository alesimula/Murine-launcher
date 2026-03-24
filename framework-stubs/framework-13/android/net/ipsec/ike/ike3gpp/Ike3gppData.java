package android.net.ipsec.ike.ike3gpp;

public abstract class Ike3gppData {
    public static final int DATA_TYPE_NOTIFY_BACKOFF_TIMER = 2;
    public static final int DATA_TYPE_NOTIFY_N1_MODE_INFORMATION = 1;
    Ike3gppData() {}
    public abstract int getDataType();
}
