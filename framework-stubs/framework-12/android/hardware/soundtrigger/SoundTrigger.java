package android.hardware.soundtrigger;

@android.annotation.SystemApi
public class SoundTrigger {
    private static final java.lang.String TAG = "SoundTrigger";
    public static final int STATUS_OK = 0;
    public static final int STATUS_ERROR = -2147483648;
    public static final int STATUS_PERMISSION_DENIED = Integer.valueOf(0);
    public static final int STATUS_NO_INIT = Integer.valueOf(0);
    public static final int STATUS_BAD_VALUE = Integer.valueOf(0);
    public static final int STATUS_DEAD_OBJECT = Integer.valueOf(0);
    public static final int STATUS_INVALID_OPERATION = Integer.valueOf(0);
    public static final int RECOGNITION_MODE_VOICE_TRIGGER = 1;
    public static final int RECOGNITION_MODE_USER_IDENTIFICATION = 2;
    public static final int RECOGNITION_MODE_USER_AUTHENTICATION = 4;
    public static final int RECOGNITION_MODE_GENERIC = 8;
    public static final int RECOGNITION_STATUS_SUCCESS = 0;
    public static final int RECOGNITION_STATUS_ABORT = 1;
    public static final int RECOGNITION_STATUS_FAILURE = 2;
    public static final int RECOGNITION_STATUS_GET_STATE_RESPONSE = 3;
    public static final int SOUNDMODEL_STATUS_UPDATED = 0;
    public static final int SERVICE_STATE_ENABLED = 0;
    public static final int SERVICE_STATE_DISABLED = 1;
    private static java.lang.Object mServiceLock;
    private static android.media.soundtrigger_middleware.ISoundTriggerMiddlewareService mService;
    private SoundTrigger() {}
    static int handleException(java.lang.Exception p0) { return 0; }
    public static int listModules(java.util.ArrayList<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> p0) { return 0; }
    @android.annotation.RequiresPermission(allOf={"android.permission.RECORD_AUDIO", "android.permission.CAPTURE_AUDIO_HOTWORD"})
    public static int listModulesAsOriginator(java.util.ArrayList<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> p0, android.media.permission.Identity p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.SOUNDTRIGGER_DELEGATE_IDENTITY")
    public static int listModulesAsMiddleman(java.util.ArrayList<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> p0, android.media.permission.Identity p1, android.media.permission.Identity p2) { return 0; }
    private static void convertDescriptorsToModuleProperties(android.media.soundtrigger_middleware.SoundTriggerModuleDescriptor[] p0, java.util.ArrayList<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> p1) {}
    private static android.hardware.soundtrigger.SoundTriggerModule attachModule(int p0, android.hardware.soundtrigger.SoundTrigger.StatusListener p1, android.os.Handler p2) { return null; }
    @android.annotation.RequiresPermission("android.permission.SOUNDTRIGGER_DELEGATE_IDENTITY")
    public static android.hardware.soundtrigger.SoundTriggerModule attachModuleAsMiddleman(int p0, android.hardware.soundtrigger.SoundTrigger.StatusListener p1, android.os.Handler p2, android.media.permission.Identity p3, android.media.permission.Identity p4) { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.RECORD_AUDIO", "android.permission.CAPTURE_AUDIO_HOTWORD"})
    public static android.hardware.soundtrigger.SoundTriggerModule attachModuleAsOriginator(int p0, android.hardware.soundtrigger.SoundTrigger.StatusListener p1, android.os.Handler p2, android.media.permission.Identity p3) { return null; }
    private static android.media.soundtrigger_middleware.ISoundTriggerMiddlewareService getService() { return null; }

    public static class ConfidenceLevel implements android.os.Parcelable {
        public final int userId = 0;
        public final int confidenceLevel = 0;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel> CREATOR = null;
        public ConfidenceLevel(int p0, int p1) {}
        private static android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel fromParcel(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class GenericRecognitionEvent extends android.hardware.soundtrigger.SoundTrigger.RecognitionEvent implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent> CREATOR = null;
        public GenericRecognitionEvent(int p0, int p1, boolean p2, int p3, int p4, int p5, boolean p6, android.media.AudioFormat p7, byte[] p8) { super(0, 0, false, 0, 0, 0, false, null, null); }
        private static android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent fromParcelForGeneric(android.os.Parcel p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class GenericSoundModel extends android.hardware.soundtrigger.SoundTrigger.SoundModel implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.GenericSoundModel> CREATOR = null;
        public GenericSoundModel(java.util.UUID p0, java.util.UUID p1, byte[] p2, int p3) { super(null, null, 0, null, 0); }
        public GenericSoundModel(java.util.UUID p0, java.util.UUID p1, byte[] p2) { super(null, null, 0, null, 0); }
        public int describeContents() { return 0; }
        private static android.hardware.soundtrigger.SoundTrigger.GenericSoundModel fromParcel(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public static final class Keyphrase implements android.os.Parcelable {
        private final int mId = 0;
        private final int mRecognitionModes = 0;
        private final java.util.Locale mLocale = null;
        private final java.lang.String mText = null;
        private final int[] mUsers = null;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.Keyphrase> CREATOR = null;
        public Keyphrase(int p0, int p1, java.util.Locale p2, java.lang.String p3, int[] p4) {}
        public int getId() { return 0; }
        public int getRecognitionModes() { return 0; }
        public java.util.Locale getLocale() { return null; }
        public java.lang.String getText() { return null; }
        public int[] getUsers() { return null; }
        public static android.hardware.soundtrigger.SoundTrigger.Keyphrase readFromParcel(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class KeyphraseRecognitionEvent extends android.hardware.soundtrigger.SoundTrigger.RecognitionEvent implements android.os.Parcelable {
        public final android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] keyphraseExtras = null;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent> CREATOR = null;
        public KeyphraseRecognitionEvent(int p0, int p1, boolean p2, int p3, int p4, int p5, boolean p6, android.media.AudioFormat p7, byte[] p8, android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] p9) { super(0, 0, false, 0, 0, 0, false, null, null); }
        private static android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent fromParcelForKeyphrase(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class KeyphraseRecognitionExtra implements android.os.Parcelable {
        public final int id = 0;
        public final int recognitionModes = 0;
        public final int coarseConfidenceLevel = 0;
        public final android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel[] confidenceLevels = null;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra> CREATOR = null;
        public KeyphraseRecognitionExtra(int p0, int p1, int p2, android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel[] p3) {}
        private static android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra fromParcel(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static final class KeyphraseSoundModel extends android.hardware.soundtrigger.SoundTrigger.SoundModel implements android.os.Parcelable {
        private final android.hardware.soundtrigger.SoundTrigger.Keyphrase[] mKeyphrases = null;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel> CREATOR = null;
        public KeyphraseSoundModel(java.util.UUID p0, java.util.UUID p1, byte[] p2, android.hardware.soundtrigger.SoundTrigger.Keyphrase[] p3, int p4) { super(null, null, 0, null, 0); }
        public KeyphraseSoundModel(java.util.UUID p0, java.util.UUID p1, byte[] p2, android.hardware.soundtrigger.SoundTrigger.Keyphrase[] p3) { super(null, null, 0, null, 0); }
        public android.hardware.soundtrigger.SoundTrigger.Keyphrase[] getKeyphrases() { return null; }
        public static android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel readFromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    public static final class ModelParamRange implements android.os.Parcelable {
        private final int mStart = 0;
        private final int mEnd = 0;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.ModelParamRange> CREATOR = null;
        public ModelParamRange(int p0, int p1) {}
        private ModelParamRange(android.os.Parcel p0) {}
        public int getStart() { return 0; }
        public int getEnd() { return 0; }
        public int describeContents() { return 0; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public static final class ModuleProperties implements android.os.Parcelable {
        public static final int AUDIO_CAPABILITY_ECHO_CANCELLATION = 1;
        public static final int AUDIO_CAPABILITY_NOISE_SUPPRESSION = 2;
        private final int mId = 0;
        private final java.lang.String mImplementor = null;
        private final java.lang.String mDescription = null;
        private final java.util.UUID mUuid = null;
        private final int mVersion = 0;
        private final java.lang.String mSupportedModelArch = null;
        private final int mMaxSoundModels = 0;
        private final int mMaxKeyphrases = 0;
        private final int mMaxUsers = 0;
        private final int mRecognitionModes = 0;
        private final boolean mSupportsCaptureTransition = false;
        private final int mMaxBufferMillis = 0;
        private final boolean mSupportsConcurrentCapture = false;
        private final int mPowerConsumptionMw = 0;
        private final boolean mReturnsTriggerInEvent = false;
        private final int mAudioCapabilities = 0;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> CREATOR = null;
        public ModuleProperties(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5, int p6, int p7, int p8, int p9, boolean p10, int p11, boolean p12, int p13, boolean p14, int p15) {}
        public int getId() { return 0; }
        public java.lang.String getImplementor() { return null; }
        public java.lang.String getDescription() { return null; }
        public java.util.UUID getUuid() { return null; }
        public int getVersion() { return 0; }
        public java.lang.String getSupportedModelArch() { return null; }
        public int getMaxSoundModels() { return 0; }
        public int getMaxKeyphrases() { return 0; }
        public int getMaxUsers() { return 0; }
        public int getRecognitionModes() { return 0; }
        public boolean isCaptureTransitionSupported() { return false; }
        public int getMaxBufferMillis() { return 0; }
        public boolean isConcurrentCaptureSupported() { return false; }
        public int getPowerConsumptionMw() { return 0; }
        public boolean isTriggerReturnedInEvent() { return false; }
        public int getAudioCapabilities() { return 0; }
        private static android.hardware.soundtrigger.SoundTrigger.ModuleProperties fromParcel(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface AudioCapabilities {
        }
    }

    public static class RecognitionConfig implements android.os.Parcelable {
        public final boolean captureRequested = false;
        public final boolean allowMultipleTriggers = false;
        public final android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] keyphrases = null;
        public final byte[] data = null;
        public final int audioCapabilities = 0;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.RecognitionConfig> CREATOR = null;
        public RecognitionConfig(boolean p0, boolean p1, android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] p2, byte[] p3, int p4) {}
        public RecognitionConfig(boolean p0, boolean p1, android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] p2, byte[] p3) {}
        private static android.hardware.soundtrigger.SoundTrigger.RecognitionConfig fromParcel(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class RecognitionEvent {
        public final int status = 0;
        public final int soundModelHandle = 0;
        public final boolean captureAvailable = false;
        public final int captureSession = 0;
        public final int captureDelayMs = 0;
        public final int capturePreambleMs = 0;
        public final boolean triggerInData = false;
        public final android.media.AudioFormat captureFormat = null;
        public final byte[] data = null;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.RecognitionEvent> CREATOR = null;
        public RecognitionEvent(int p0, int p1, boolean p2, int p3, int p4, int p5, boolean p6, android.media.AudioFormat p7, byte[] p8) {}
        public boolean isCaptureAvailable() { return false; }
        public android.media.AudioFormat getCaptureFormat() { return null; }
        public int getCaptureSession() { return 0; }
        @android.annotation.SuppressLint("MissingNullability")
        public byte[] getData() { return null; }
        protected static android.hardware.soundtrigger.SoundTrigger.RecognitionEvent fromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecognitionModes {
    }

    public static class SoundModel {
        public static final int TYPE_UNKNOWN = -1;
        public static final int TYPE_KEYPHRASE = 0;
        public static final int TYPE_GENERIC_SOUND = 1;
        private final java.util.UUID mUuid = null;
        private final int mType = 0;
        private final java.util.UUID mVendorUuid = null;
        private final int mVersion = 0;
        private final byte[] mData = null;
        public SoundModel(java.util.UUID p0, java.util.UUID p1, int p2, byte[] p3, int p4) {}
        public java.util.UUID getUuid() { return null; }
        public int getType() { return 0; }
        public java.util.UUID getVendorUuid() { return null; }
        public int getVersion() { return 0; }
        public byte[] getData() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SoundModelType {
        }
    }

    public static class SoundModelEvent implements android.os.Parcelable {
        public final int status = 0;
        public final int soundModelHandle = 0;
        public final byte[] data = null;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.SoundModelEvent> CREATOR = null;
        SoundModelEvent(int p0, int p1, byte[] p2) {}
        private static android.hardware.soundtrigger.SoundTrigger.SoundModelEvent fromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static interface StatusListener {
        public void onRecognition(android.hardware.soundtrigger.SoundTrigger.RecognitionEvent p0);
        public void onSoundModelUpdate(android.hardware.soundtrigger.SoundTrigger.SoundModelEvent p0);
        public void onServiceStateChange(int p0);
        public void onServiceDied();
    }
}
