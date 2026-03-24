package android.media;

public class AudioGain {
    public static final int MODE_JOINT = 1;
    public static final int MODE_CHANNELS = 2;
    public static final int MODE_RAMP = 4;
    AudioGain(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {}
    public int mode() { return 0; }
    public int channelMask() { return 0; }
    public int minValue() { return 0; }
    public int maxValue() { return 0; }
    public int defaultValue() { return 0; }
    public int stepValue() { return 0; }
    public int rampDurationMinMs() { return 0; }
    public int rampDurationMaxMs() { return 0; }
    public android.media.AudioGainConfig buildConfig(int p0, int p1, int[] p2, int p3) { return null; }
}
