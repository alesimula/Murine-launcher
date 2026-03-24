package android.hardware.usb.gadget;

public class GadgetFunction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.usb.gadget.GadgetFunction> CREATOR = null;
    public static final long NONE = 0L;
    public static final long ADB = 1L;
    public static final long ACCESSORY = 2L;
    public static final long MTP = 4L;
    public static final long MIDI = 8L;
    public static final long PTP = 16L;
    public static final long RNDIS = 32L;
    public static final long AUDIO_SOURCE = 64L;
    public static final long UVC = 128L;
    public static final long NCM = 1024L;
    public GadgetFunction() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
