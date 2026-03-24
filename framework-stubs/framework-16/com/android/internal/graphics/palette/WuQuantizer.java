package com.android.internal.graphics.palette;

public final class WuQuantizer implements com.android.internal.graphics.palette.Quantizer {
    public WuQuantizer() {}
    public java.util.List<com.android.internal.graphics.palette.Palette.Swatch> getQuantizedColors() { return null; }
    public void quantize(int[] p0, int p1) {}
    @android.annotation.Nullable
    public int[] getColors() { return null; }
    @android.annotation.Nullable
    public java.util.Map<java.lang.Integer, java.lang.Integer> inputPixelToCount() { return null; }

    private static class Box {
        public int r0;
        public int r1;
        public int g0;
        public int g1;
        public int b0;
        public int b1;
        public int vol;
    }

    private static class CreateBoxesResult {
        final int mRequestedCount = 0;
        final int mResultCount = 0;
        CreateBoxesResult(int p0, int p1) {}
    }

    private static enum Direction {
        RED,
        GREEN,
        BLUE;
    }

    private static class MaximizeResult {
        final int mCutLocation = 0;
        final double mMaximum = 0.0;
        MaximizeResult(int p0, double p1) {}
    }
}
