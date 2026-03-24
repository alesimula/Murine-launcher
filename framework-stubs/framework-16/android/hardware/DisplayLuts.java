package android.hardware;

@android.annotation.FlaggedApi("android.hardware.flags.luts_api")
public final class DisplayLuts {
    @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
    public DisplayLuts() {}
    public java.lang.String toString() { return null; }
    @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
    public void set(android.hardware.DisplayLuts.Entry p0) {}
    @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
    public void set(android.hardware.DisplayLuts.Entry p0, android.hardware.DisplayLuts.Entry p1) {}
    public boolean valid() { return false; }
    public float[] getLutBuffers() { return null; }
    public int[] getOffsets() { return null; }
    public int[] getLutSizes() { return null; }
    public int[] getLutDimensions() { return null; }
    public int[] getLutSamplingKeys() { return null; }

    @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
    public static class Entry {
        @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
        public Entry(float[] p0, int p1, int p2) {}
        @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
        public int getDimension() { return 0; }
        public int getSize() { return 0; }
        @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
        @android.annotation.NonNull
        public float[] getBuffer() { return null; }
        @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
        public int getSamplingKey() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
