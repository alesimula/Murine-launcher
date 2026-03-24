package android.media.soundtrigger_middleware;

public class SoundTriggerModuleProperties implements android.os.Parcelable {
    public java.lang.String implementor;
    public java.lang.String description;
    public int version;
    public java.lang.String uuid;
    public java.lang.String supportedModelArch;
    public int maxSoundModels;
    public int maxKeyPhrases;
    public int maxUsers;
    public int recognitionModes;
    public boolean captureTransition;
    public int maxBufferMs;
    public boolean concurrentCapture;
    public boolean triggerInEvent;
    public int powerConsumptionMw;
    public int audioCapabilities;
    public static final android.os.Parcelable.Creator<android.media.soundtrigger_middleware.SoundTriggerModuleProperties> CREATOR = null;
    public SoundTriggerModuleProperties() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
