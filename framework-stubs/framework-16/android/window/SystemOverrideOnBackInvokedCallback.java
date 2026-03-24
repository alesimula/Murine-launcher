package android.window;

public interface SystemOverrideOnBackInvokedCallback extends android.window.OnBackInvokedCallback {
    public static final int OVERRIDE_UNDEFINED = 0;
    public static final int OVERRIDE_MOVE_TASK_TO_BACK = 1;
    public static final int OVERRIDE_FINISH_AND_REMOVE_TASK = 2;
    default public int overrideBehavior() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OverrideBehavior {
    }
}
