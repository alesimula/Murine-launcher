package android.media.soundtrigger;

public class Properties implements android.os.Parcelable {
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
    public static final android.os.Parcelable.Creator<android.media.soundtrigger.Properties> CREATOR = null;
    public Properties() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
