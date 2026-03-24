package android.media.soundtrigger;

@android.annotation.SystemApi
public final class SoundTriggerManager {
    private static final boolean DBG = false;
    private static final java.lang.String TAG = "SoundTriggerManager";
    private final android.content.Context mContext = null;
    private final com.android.internal.app.ISoundTriggerSession mSoundTriggerSession = null;
    private final android.os.IBinder mBinderToken = null;
    private final java.util.HashMap<java.util.UUID, android.media.soundtrigger.SoundTriggerDetector> mReceiverInstanceMap = null;
    public static final int FLAG_MESSAGE_TYPE_UNKNOWN = -1;
    public static final int FLAG_MESSAGE_TYPE_RECOGNITION_EVENT = 0;
    public static final int FLAG_MESSAGE_TYPE_RECOGNITION_ERROR = 1;
    public static final int FLAG_MESSAGE_TYPE_RECOGNITION_PAUSED = 2;
    public static final int FLAG_MESSAGE_TYPE_RECOGNITION_RESUMED = 3;
    public static final java.lang.String EXTRA_MESSAGE_TYPE = "android.media.soundtrigger.MESSAGE_TYPE";
    public static final java.lang.String EXTRA_RECOGNITION_EVENT = "android.media.soundtrigger.RECOGNITION_EVENT";
    public static final java.lang.String EXTRA_STATUS = "android.media.soundtrigger.STATUS";
    public SoundTriggerManager(android.content.Context p0, com.android.internal.app.ISoundTriggerService p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public void updateModel(android.media.soundtrigger.SoundTriggerManager.Model p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public android.media.soundtrigger.SoundTriggerManager.Model getModel(java.util.UUID p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public void deleteModel(java.util.UUID p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public android.media.soundtrigger.SoundTriggerDetector createSoundTriggerDetector(java.util.UUID p0, android.media.soundtrigger.SoundTriggerDetector.Callback p1, android.os.Handler p2) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public int loadSoundModel(android.hardware.soundtrigger.SoundTrigger.SoundModel p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public int startRecognition(java.util.UUID p0, android.os.Bundle p1, android.content.ComponentName p2, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p3) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public int stopRecognition(java.util.UUID p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public int unloadSoundModel(java.util.UUID p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public boolean isRecognitionActive(java.util.UUID p0) { return false; }
    public int getDetectionServiceOperationsTimeout() { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public int getModelState(java.util.UUID p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public android.hardware.soundtrigger.SoundTrigger.ModuleProperties getModuleProperties() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public int setParameter(java.util.UUID p0, int p1, int p2) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public int getParameter(java.util.UUID p0, int p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public android.hardware.soundtrigger.SoundTrigger.ModelParamRange queryParameter(java.util.UUID p0, int p1) { return null; }

    public static class Model {
        private android.hardware.soundtrigger.SoundTrigger.GenericSoundModel mGenericSoundModel;
        Model(android.hardware.soundtrigger.SoundTrigger.GenericSoundModel p0) {}
        public static android.media.soundtrigger.SoundTriggerManager.Model create(java.util.UUID p0, java.util.UUID p1, byte[] p2, int p3) { return null; }
        public static android.media.soundtrigger.SoundTriggerManager.Model create(java.util.UUID p0, java.util.UUID p1, byte[] p2) { return null; }
        public java.util.UUID getModelUuid() { return null; }
        public java.util.UUID getVendorUuid() { return null; }
        public int getVersion() { return 0; }
        public byte[] getModelData() { return null; }
        android.hardware.soundtrigger.SoundTrigger.GenericSoundModel getGenericSoundModel() { return null; }
    }
}
