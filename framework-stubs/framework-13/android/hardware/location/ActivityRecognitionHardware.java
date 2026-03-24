package android.hardware.location;

public class ActivityRecognitionHardware extends android.hardware.location.IActivityRecognitionHardware.Stub {
    public static android.hardware.location.ActivityRecognitionHardware getInstance(android.content.Context p0) { return null; }
    public static boolean isSupported() { return false; }
    public java.lang.String[] getSupportedActivities() { return null; }
    public boolean isActivitySupported(java.lang.String p0) { return false; }
    public boolean registerSink(android.hardware.location.IActivityRecognitionHardwareSink p0) { return false; }
    public boolean unregisterSink(android.hardware.location.IActivityRecognitionHardwareSink p0) { return false; }
    public boolean enableActivityEvent(java.lang.String p0, int p1, long p2) { return false; }
    public boolean disableActivityEvent(java.lang.String p0, int p1) { return false; }
    public boolean flush() { return false; }

    private static class Event {
        public int activity;
        public int type;
        public long timestamp;
    }

    private class SinkList extends android.os.RemoteCallbackList<android.hardware.location.IActivityRecognitionHardwareSink> {
        public void onCallbackDied(android.hardware.location.IActivityRecognitionHardwareSink p0) {}
    }
}
