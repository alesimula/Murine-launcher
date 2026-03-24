package android.app.servertransaction;

public abstract class ActivityLifecycleItem extends android.app.servertransaction.ActivityTransactionItem {
    public static final int UNDEFINED = -1;
    public static final int PRE_ON_CREATE = 0;
    public static final int ON_CREATE = 1;
    public static final int ON_START = 2;
    public static final int ON_RESUME = 3;
    public static final int ON_PAUSE = 4;
    public static final int ON_STOP = 5;
    public static final int ON_DESTROY = 6;
    public static final int ON_RESTART = 7;
    ActivityLifecycleItem(android.os.IBinder p0) { super((android.os.IBinder)null); }
    ActivityLifecycleItem(android.os.Parcel p0) { super((android.os.IBinder)null); }
    public boolean isActivityLifecycleItem() { return false; }
    public abstract int getTargetState();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LifecycleState {
    }
}
