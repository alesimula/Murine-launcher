package android.os;

public class PowerSaveState implements android.os.Parcelable {
    public final boolean batterySaverEnabled = false;
    public final boolean globalBatterySaverEnabled = false;
    public final int locationMode = 0;
    public final int soundTriggerMode = 0;
    public final float brightnessFactor = 0.0f;
    public static final android.os.Parcelable.Creator<android.os.PowerSaveState> CREATOR = null;
    public PowerSaveState(android.os.PowerSaveState.Builder p0) {}
    public PowerSaveState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public android.os.PowerSaveState.Builder setBatterySaverEnabled(boolean p0) { return null; }
        public android.os.PowerSaveState.Builder setGlobalBatterySaverEnabled(boolean p0) { return null; }
        public android.os.PowerSaveState.Builder setSoundTriggerMode(int p0) { return null; }
        public android.os.PowerSaveState.Builder setLocationMode(int p0) { return null; }
        public android.os.PowerSaveState.Builder setBrightnessFactor(float p0) { return null; }
        public android.os.PowerSaveState build() { return null; }
    }
}
