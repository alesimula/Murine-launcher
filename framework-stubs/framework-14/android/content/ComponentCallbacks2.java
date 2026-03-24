package android.content;

public interface ComponentCallbacks2 extends android.content.ComponentCallbacks {
    public static final int TRIM_MEMORY_COMPLETE = 80;
    public static final int TRIM_MEMORY_MODERATE = 60;
    public static final int TRIM_MEMORY_BACKGROUND = 40;
    public static final int TRIM_MEMORY_UI_HIDDEN = 20;
    public static final int TRIM_MEMORY_RUNNING_CRITICAL = 15;
    public static final int TRIM_MEMORY_RUNNING_LOW = 10;
    public static final int TRIM_MEMORY_RUNNING_MODERATE = 5;
    public void onTrimMemory(int p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TrimMemoryLevel {
    }
}
