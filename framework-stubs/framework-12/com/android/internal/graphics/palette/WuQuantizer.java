package com.android.internal.graphics.palette;

public final class WuQuantizer implements com.android.internal.graphics.palette.Quantizer {
    private static final int BITS = 5;
    private static final int MAX_INDEX = 32;
    private static final int SIDE_LENGTH = 33;
    private static final int TOTAL_SIZE = 35937;
    private int[] mWeights;
    private int[] mMomentsR;
    private int[] mMomentsG;
    private int[] mMomentsB;
    private double[] mMoments;
    private com.android.internal.graphics.palette.WuQuantizer.Box[] mCubes;
    private com.android.internal.graphics.palette.Palette mPalette;
    private int[] mColors;
    private java.util.Map<java.lang.Integer, java.lang.Integer> mInputPixelToCount;
    public WuQuantizer() {}
    public java.util.List<com.android.internal.graphics.palette.Palette.Swatch> getQuantizedColors() { return null; }
    public void quantize(int[] p0, int p1) {}
    public int[] getColors() { return null; }
    public java.util.Map<java.lang.Integer, java.lang.Integer> inputPixelToCount() { return null; }
    private static int getIndex(int p0, int p1, int p2) { return 0; }
    private void constructHistogram(java.util.Map<java.lang.Integer, java.lang.Integer> p0) {}
    private void createMoments() {}
    private com.android.internal.graphics.palette.WuQuantizer.CreateBoxesResult createBoxes(int p0) { return null; }
    private int[] createResult(int p0) { return null; }
    private double variance(com.android.internal.graphics.palette.WuQuantizer.Box p0) { return 0.0; }
    private boolean cut(com.android.internal.graphics.palette.WuQuantizer.Box p0, com.android.internal.graphics.palette.WuQuantizer.Box p1) { return false; }
    private com.android.internal.graphics.palette.WuQuantizer.MaximizeResult maximize(com.android.internal.graphics.palette.WuQuantizer.Box p0, com.android.internal.graphics.palette.WuQuantizer.Direction p1, int p2, int p3, int p4, int p5, int p6, int p7) { return null; }
    private static int volume(com.android.internal.graphics.palette.WuQuantizer.Box p0, int[] p1) { return 0; }
    private static int bottom(com.android.internal.graphics.palette.WuQuantizer.Box p0, com.android.internal.graphics.palette.WuQuantizer.Direction p1, int[] p2) { return 0; }
    private static int top(com.android.internal.graphics.palette.WuQuantizer.Box p0, com.android.internal.graphics.palette.WuQuantizer.Direction p1, int p2, int[] p3) { return 0; }

    private static class Box {
        public int r0;
        public int r1;
        public int g0;
        public int g1;
        public int b0;
        public int b1;
        public int vol;
        private Box() {}
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
        private Direction() {}
    }

    private static class MaximizeResult {
        final int mCutLocation = 0;
        final double mMaximum = 0.0;
        MaximizeResult(int p0, double p1) {}
    }
}
