package android.window;

public class TaskConstants {
    public static final int TASK_CHILD_LAYER_REGION_SIZE = 10000;
    public static final int TASK_CHILD_LAYER_TASK_BACKGROUND = -30000;
    public static final int TASK_CHILD_LAYER_LETTERBOX_BACKGROUND = -20000;
    public static final int TASK_CHILD_LAYER_COMPAT_UI = 10000;
    public static final int TASK_CHILD_LAYER_WINDOW_DECORATIONS = 20000;
    public static final int TASK_CHILD_LAYER_RECENTS_ANIMATION_PIP_OVERLAY = 30000;
    public static final int TASK_CHILD_LAYER_TASK_OVERLAY = 40000;
    public static final int TASK_CHILD_LAYER_RESIZE_VEIL = 60000;
    public TaskConstants() {}

    public static @interface TaskChildLayer {
    }
}
