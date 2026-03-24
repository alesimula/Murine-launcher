package android.telephony.mbms;

public interface GroupCallCallback {
    public static final int SIGNAL_STRENGTH_UNAVAILABLE = -1;
    default public void onError(int p0, java.lang.String p1) {}
    default public void onGroupCallStateChanged(int p0, int p1) {}
    default public void onBroadcastSignalStrengthUpdated(int p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GroupCallError {
    }
}
