package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public interface OnTuneEventListener {
    public static final int SIGNAL_LOCKED = 0;
    public static final int SIGNAL_NO_SIGNAL = 1;
    public static final int SIGNAL_LOST_LOCK = 2;
    public void onTuneEvent(int p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TuneEvent {
    }
}
