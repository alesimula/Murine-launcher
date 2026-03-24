package android.window;

@android.annotation.SystemApi
public abstract class TaskFpsCallback {
    public TaskFpsCallback() {}
    public abstract void onFpsReported(float p0);
}
