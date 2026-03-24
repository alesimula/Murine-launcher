package android.hardware.usb.gadget.V1_2;

public final class GadgetFunction {
    public static final long NONE = 0L;
    public static final long ADB = 1L;
    public static final long ACCESSORY = 2L;
    public static final long MTP = 4L;
    public static final long MIDI = 8L;
    public static final long PTP = 16L;
    public static final long RNDIS = 32L;
    public static final long AUDIO_SOURCE = 64L;
    public static final long NCM = 1024L;
    public GadgetFunction() {}
    public static final java.lang.String toString(long p0) { return null; }
    public static final java.lang.String dumpBitfield(long p0) { return null; }
}
