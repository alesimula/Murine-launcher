package android.hardware.soundtrigger;

@android.annotation.SystemApi
public class SoundTrigger {
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
    public static final int RECOGNITION_STATUS_SUCCESS = 0;
    public static final int RECOGNITION_STATUS_ABORT = 1;
    public static final int RECOGNITION_STATUS_FAILURE = 2;
    public static final int RECOGNITION_STATUS_GET_STATE_RESPONSE = 3;
    public static final int SOUNDMODEL_STATUS_UPDATED = 0;
    public static final int SERVICE_STATE_ENABLED = 0;
    public static final int SERVICE_STATE_DISABLED = 1;
    private SoundTrigger() {}
    static java.lang.String getCurrentOpPackageName() { return null; }
    @android.annotation.UnsupportedAppUsage
    public static int listModules(java.util.ArrayList<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> p0) { return 0; }
    private static native int listModules(java.lang.String p0, java.util.ArrayList<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> p1);
    @android.annotation.UnsupportedAppUsage
    public static android.hardware.soundtrigger.SoundTriggerModule attachModule(int p0, android.hardware.soundtrigger.SoundTrigger.StatusListener p1, android.os.Handler p2) { return null; }

    public static interface StatusListener {
        public void onRecognition(android.hardware.soundtrigger.SoundTrigger.RecognitionEvent p0);
        public void onSoundModelUpdate(android.hardware.soundtrigger.SoundTrigger.SoundModelEvent p0);
        public void onServiceStateChange(int p0);
        public void onServiceDied();
    }

    public static class SoundModelEvent implements android.os.Parcelable {
        public final int status = 0;
        public final int soundModelHandle = 0;
        public final byte[] data = null;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.SoundModelEvent> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        SoundModelEvent(int p0, int p1, byte[] p2) {}
        private static android.hardware.soundtrigger.SoundTrigger.SoundModelEvent fromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class SoundModel {
        public static final int TYPE_UNKNOWN = -1;
        public static final int TYPE_KEYPHRASE = 0;
        public static final int TYPE_GENERIC_SOUND = 1;
        @android.annotation.UnsupportedAppUsage
        public final java.util.UUID uuid = null;
        public final int type = 0;
        @android.annotation.UnsupportedAppUsage
        public final java.util.UUID vendorUuid = null;
        @android.annotation.UnsupportedAppUsage
        public final byte[] data = null;
        public SoundModel(java.util.UUID p0, java.util.UUID p1, int p2, byte[] p3) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    public static class RecognitionEvent {
        @android.annotation.UnsupportedAppUsage
        public final int status = 0;
        @android.annotation.UnsupportedAppUsage
        public final int soundModelHandle = 0;
        @android.annotation.UnsupportedAppUsage
        public final boolean captureAvailable = false;
        @android.annotation.UnsupportedAppUsage
        public final int captureSession = 0;
        public final int captureDelayMs = 0;
        public final int capturePreambleMs = 0;
        public final boolean triggerInData = false;
        public final android.media.AudioFormat captureFormat = null;
        @android.annotation.UnsupportedAppUsage
        public final byte[] data = null;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.RecognitionEvent> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        public RecognitionEvent(int p0, int p1, boolean p2, int p3, int p4, int p5, boolean p6, android.media.AudioFormat p7, byte[] p8) {}
        public boolean isCaptureAvailable() { return false; }
        public android.media.AudioFormat getCaptureFormat() { return null; }
        public int getCaptureSession() { return 0; }
        public byte[] getData() { return null; }
        protected static android.hardware.soundtrigger.SoundTrigger.RecognitionEvent fromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class RecognitionConfig implements android.os.Parcelable {
        @android.annotation.UnsupportedAppUsage
        public final boolean captureRequested = false;
        public final boolean allowMultipleTriggers = false;
        @android.annotation.UnsupportedAppUsage
        public final android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] keyphrases = null;
        @android.annotation.UnsupportedAppUsage
        public final byte[] data = null;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.RecognitionConfig> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        public RecognitionConfig(boolean p0, boolean p1, android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] p2, byte[] p3) {}
        private static android.hardware.soundtrigger.SoundTrigger.RecognitionConfig fromParcel(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class ModuleProperties implements android.os.Parcelable {
        @android.annotation.UnsupportedAppUsage
        public final int id = 0;
        public final java.lang.String implementor = null;
        public final java.lang.String description = null;
        @android.annotation.UnsupportedAppUsage
        public final java.util.UUID uuid = null;
        public final int version = 0;
        @android.annotation.UnsupportedAppUsage
        public final int maxSoundModels = 0;
        public final int maxKeyphrases = 0;
        public final int maxUsers = 0;
        public final int recognitionModes = 0;
        public final boolean supportsCaptureTransition = false;
        public final int maxBufferMs = 0;
        public final boolean supportsConcurrentCapture = false;
        public final int powerConsumptionMw = 0;
        public final boolean returnsTriggerInEvent = false;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        ModuleProperties(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6, int p7, int p8, boolean p9, int p10, boolean p11, int p12, boolean p13) {}
        private static android.hardware.soundtrigger.SoundTrigger.ModuleProperties fromParcel(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class KeyphraseSoundModel extends android.hardware.soundtrigger.SoundTrigger.SoundModel implements android.os.Parcelable {
        @android.annotation.UnsupportedAppUsage
        public final android.hardware.soundtrigger.SoundTrigger.Keyphrase[] keyphrases = null;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        public KeyphraseSoundModel(java.util.UUID p0, java.util.UUID p1, byte[] p2, android.hardware.soundtrigger.SoundTrigger.Keyphrase[] p3) { super(null, null, 0, null); }
        private static android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel fromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    public static class KeyphraseRecognitionExtra implements android.os.Parcelable {
        @android.annotation.UnsupportedAppUsage
        public final int id = 0;
        @android.annotation.UnsupportedAppUsage
        public final int recognitionModes = 0;
        @android.annotation.UnsupportedAppUsage
        public final int coarseConfidenceLevel = 0;
        @android.annotation.UnsupportedAppUsage
        public final android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel[] confidenceLevels = null;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        public KeyphraseRecognitionExtra(int p0, int p1, int p2, android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel[] p3) {}
        private static android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra fromParcel(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class KeyphraseRecognitionEvent extends android.hardware.soundtrigger.SoundTrigger.RecognitionEvent implements android.os.Parcelable {
        @android.annotation.UnsupportedAppUsage
        public final android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] keyphraseExtras = null;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        public KeyphraseRecognitionEvent(int p0, int p1, boolean p2, int p3, int p4, int p5, boolean p6, android.media.AudioFormat p7, byte[] p8, android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] p9) { super(0, 0, false, 0, 0, 0, false, null, null); }
        private static android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent fromParcelForKeyphrase(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class Keyphrase implements android.os.Parcelable {
        @android.annotation.UnsupportedAppUsage
        public final int id = 0;
        @android.annotation.UnsupportedAppUsage
        public final int recognitionModes = 0;
        @android.annotation.UnsupportedAppUsage
        public final java.lang.String locale = null;
        @android.annotation.UnsupportedAppUsage
        public final java.lang.String text = null;
        @android.annotation.UnsupportedAppUsage
        public final int[] users = null;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.Keyphrase> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        public Keyphrase(int p0, int p1, java.lang.String p2, java.lang.String p3, int[] p4) {}
        private static android.hardware.soundtrigger.SoundTrigger.Keyphrase fromParcel(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class GenericSoundModel extends android.hardware.soundtrigger.SoundTrigger.SoundModel implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.GenericSoundModel> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        public GenericSoundModel(java.util.UUID p0, java.util.UUID p1, byte[] p2) { super(null, null, 0, null); }
        public int describeContents() { return 0; }
        private static android.hardware.soundtrigger.SoundTrigger.GenericSoundModel fromParcel(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public static class GenericRecognitionEvent extends android.hardware.soundtrigger.SoundTrigger.RecognitionEvent implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        public GenericRecognitionEvent(int p0, int p1, boolean p2, int p3, int p4, int p5, boolean p6, android.media.AudioFormat p7, byte[] p8) { super(0, 0, false, 0, 0, 0, false, null, null); }
        private static android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent fromParcelForGeneric(android.os.Parcel p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class ConfidenceLevel implements android.os.Parcelable {
        @android.annotation.UnsupportedAppUsage
        public final int userId = 0;
        @android.annotation.UnsupportedAppUsage
        public final int confidenceLevel = 0;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        public ConfidenceLevel(int p0, int p1) {}
        private static android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel fromParcel(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }
}
