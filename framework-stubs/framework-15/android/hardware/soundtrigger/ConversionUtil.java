package android.hardware.soundtrigger;

public class ConversionUtil {
    public ConversionUtil() {}
    public static android.hardware.soundtrigger.SoundTrigger.ModuleProperties aidl2apiModuleDescriptor(android.media.soundtrigger_middleware.SoundTriggerModuleDescriptor p0) { return null; }
    public static int aidl2apiRecognitionModes(int p0) { return 0; }
    public static int api2aidlRecognitionModes(int p0) { return 0; }
    public static android.media.soundtrigger.SoundModel api2aidlGenericSoundModel(android.hardware.soundtrigger.SoundTrigger.GenericSoundModel p0) { return null; }
    public static android.media.soundtrigger.SoundModel api2aidlSoundModel(android.hardware.soundtrigger.SoundTrigger.SoundModel p0) { return null; }
    public static java.lang.String api2aidlUuid(java.util.UUID p0) { return null; }
    public static android.media.soundtrigger.PhraseSoundModel api2aidlPhraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel p0) { return null; }
    public static android.media.soundtrigger.Phrase api2aidlPhrase(android.hardware.soundtrigger.SoundTrigger.Keyphrase p0) { return null; }
    public static android.hardware.soundtrigger.SoundTrigger.Keyphrase aidl2apiPhrase(android.media.soundtrigger.Phrase p0) { return null; }
    public static android.media.soundtrigger.RecognitionConfig api2aidlRecognitionConfig(android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p0) { return null; }
    public static android.hardware.soundtrigger.SoundTrigger.RecognitionConfig aidl2apiRecognitionConfig(android.media.soundtrigger.RecognitionConfig p0) { return null; }
    public static android.media.soundtrigger.PhraseRecognitionExtra api2aidlPhraseRecognitionExtra(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra p0) { return null; }
    public static android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra aidl2apiPhraseRecognitionExtra(android.media.soundtrigger.PhraseRecognitionExtra p0) { return null; }
    public static android.media.soundtrigger.ConfidenceLevel api2aidlConfidenceLevel(android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel p0) { return null; }
    public static android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel aidl2apiConfidenceLevel(android.media.soundtrigger.ConfidenceLevel p0) { return null; }
    public static android.hardware.soundtrigger.SoundTrigger.RecognitionEvent aidl2apiRecognitionEvent(int p0, int p1, android.media.soundtrigger_middleware.RecognitionEventSys p2) { return null; }
    public static android.hardware.soundtrigger.SoundTrigger.RecognitionEvent aidl2apiPhraseRecognitionEvent(int p0, int p1, android.media.soundtrigger_middleware.PhraseRecognitionEventSys p2) { return null; }
    public static android.media.AudioFormat aidl2apiAudioFormatWithDefault(android.media.audio.common.AudioConfig p0, boolean p1) { return null; }
    public static int api2aidlModelParameter(int p0) { return 0; }
    public static android.hardware.soundtrigger.SoundTrigger.ModelParamRange aidl2apiModelParameterRange(android.media.soundtrigger.ModelParameterRange p0) { return null; }
    public static int aidl2apiAudioCapabilities(int p0) { return 0; }
    public static int api2aidlAudioCapabilities(int p0) { return 0; }
    @android.annotation.Nullable
    public static android.os.ParcelFileDescriptor byteArrayToSharedMemory(byte[] p0, java.lang.String p1) { return null; }
    public static byte[] sharedMemoryToByteArray(android.os.ParcelFileDescriptor p0, int p1) { return null; }
}
