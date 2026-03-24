package android.media.midi;

public final class MidiDeviceStatus implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.midi.MidiDeviceStatus> CREATOR = null;
    public MidiDeviceStatus(android.media.midi.MidiDeviceInfo p0, boolean[] p1, int[] p2) {}
    public MidiDeviceStatus(android.media.midi.MidiDeviceInfo p0) {}
    public android.media.midi.MidiDeviceInfo getDeviceInfo() { return null; }
    public boolean isInputPortOpen(int p0) { return false; }
    public int getOutputPortOpenCount(int p0) { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
