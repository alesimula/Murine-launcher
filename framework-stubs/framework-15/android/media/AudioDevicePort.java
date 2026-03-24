package android.media;

public class AudioDevicePort extends android.media.AudioPort {
    public static android.media.AudioDevicePort createForTesting(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    AudioDevicePort(android.media.AudioHandle p0, java.lang.String p1, int[] p2, int[] p3, int[] p4, int[] p5, android.media.AudioGain[] p6, int p7, java.lang.String p8, int[] p9, int[] p10) { super((android.media.AudioHandle)null, 0, (java.lang.String)null, (java.util.List)null, (android.media.AudioGain[])null, (java.util.List)null); }
    AudioDevicePort(android.media.AudioHandle p0, java.lang.String p1, java.util.List<android.media.AudioProfile> p2, android.media.AudioGain[] p3, int p4, java.lang.String p5, int[] p6, int[] p7, java.util.List<android.media.AudioDescriptor> p8) { super((android.media.AudioHandle)null, 0, (java.lang.String)null, (java.util.List)null, (android.media.AudioGain[])null, (java.util.List)null); }
    public int type() { return 0; }
    public java.lang.String address() { return null; }
    @android.annotation.NonNull
    public int[] encapsulationModes() { return null; }
    @android.annotation.NonNull
    public int[] encapsulationMetadataTypes() { return null; }
    public android.media.AudioDevicePortConfig buildConfig(int p0, int p1, int p2, android.media.AudioGainConfig p3) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
}
