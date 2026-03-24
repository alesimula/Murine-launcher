package android.hardware.camera2.utils;

public class TaskDrainer<T extends java.lang.Object> {
    public TaskDrainer(java.util.concurrent.Executor p0, android.hardware.camera2.utils.TaskDrainer.DrainListener p1) {}
    public TaskDrainer(java.util.concurrent.Executor p0, android.hardware.camera2.utils.TaskDrainer.DrainListener p1, java.lang.String p2) {}
    public void taskStarted(T p0) {}
    public void taskFinished(T p0) {}
    public void beginDrain() {}

    public static interface DrainListener {
        public void onDrained();
    }
}
