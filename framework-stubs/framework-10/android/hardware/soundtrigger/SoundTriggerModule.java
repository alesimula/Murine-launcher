package android.hardware.soundtrigger;

public class SoundTriggerModule {
    @android.annotation.UnsupportedAppUsage
    private long mNativeContext;
    @android.annotation.UnsupportedAppUsage
    private int mId;
    private android.hardware.soundtrigger.SoundTriggerModule.NativeEventHandlerDelegate mEventHandlerDelegate;
    private static final int EVENT_RECOGNITION = 1;
    private static final int EVENT_SERVICE_DIED = 2;
    private static final int EVENT_SOUNDMODEL = 3;
    private static final int EVENT_SERVICE_STATE_CHANGE = 4;
    SoundTriggerModule(int p0, android.hardware.soundtrigger.SoundTrigger.StatusListener p1, android.os.Handler p2) {}
    private native void native_setup(java.lang.String p0, java.lang.Object p1);
    protected void finalize() {}
    private native void native_finalize();
    @android.annotation.UnsupportedAppUsage
    public native void detach();
    @android.annotation.UnsupportedAppUsage
    public native int loadSoundModel(android.hardware.soundtrigger.SoundTrigger.SoundModel p0, int[] p1);
    @android.annotation.UnsupportedAppUsage
    public native int unloadSoundModel(int p0);
    @android.annotation.UnsupportedAppUsage
    public native int startRecognition(int p0, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p1);
    @android.annotation.UnsupportedAppUsage
    public native int stopRecognition(int p0);
    public native int getModelState(int p0);
    @android.annotation.UnsupportedAppUsage
    private static void postEventFromNative(java.lang.Object p0, int p1, int p2, int p3, java.lang.Object p4) {}

    private class NativeEventHandlerDelegate {
        private final android.os.Handler mHandler = null;
        NativeEventHandlerDelegate(android.hardware.soundtrigger.SoundTriggerModule p0, android.hardware.soundtrigger.SoundTrigger.StatusListener p1, android.os.Handler p2) {}
        android.os.Handler handler() { return null; }
    }
}
