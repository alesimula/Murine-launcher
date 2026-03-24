package android.media;

public class AudioMixPort extends android.media.AudioPort {
    private final int mIoHandle = 0;
    AudioMixPort(android.media.AudioHandle p0, int p1, int p2, java.lang.String p3, int[] p4, int[] p5, int[] p6, int[] p7, android.media.AudioGain[] p8) { super((android.media.AudioHandle)null, 0, (java.lang.String)null, (java.util.List)null, (android.media.AudioGain[])null, (java.util.List)null); }
    AudioMixPort(android.media.AudioHandle p0, int p1, int p2, java.lang.String p3, java.util.List<android.media.AudioProfile> p4, android.media.AudioGain[] p5) { super((android.media.AudioHandle)null, 0, (java.lang.String)null, (java.util.List)null, (android.media.AudioGain[])null, (java.util.List)null); }
    public android.media.AudioMixPortConfig buildConfig(int p0, int p1, int p2, android.media.AudioGainConfig p3) { return null; }
    public int ioHandle() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
}
