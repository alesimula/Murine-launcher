package android.window;

public class TaskConstants {
    public static final int TASK_CHILD_LAYER_REGION_SIZE = 10000;
    public static final int TASK_CHILD_LAYER_TASK_BACKGROUND = -30000;
    public static final int TASK_CHILD_LAYER_LETTERBOX_BACKGROUND = -20000;
    public static final int TASK_CHILD_LAYER_SIZE_COMPAT_RESTART_BUTTON = 10000;
    public static final int TASK_CHILD_LAYER_LETTERBOX_EDUCATION = 20000;
    public static final int TASK_CHILD_LAYER_WINDOW_DECORATIONS = 30000;
    public static final int TASK_CHILD_LAYER_RECENTS_ANIMATION_PIP_OVERLAY = 40000;
    public static final int TASK_CHILD_LAYER_TASK_OVERLAY = 50000;
    public static final int TASK_CHILD_LAYER_TASK_OVERLAY_ACTIVITIES = 60000;
    public TaskConstants() {}

    public static @interface TaskChildLayer {
    }
}
