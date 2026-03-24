package com.android.internal.graphics.palette;

final class ColorCutQuantizer implements com.android.internal.graphics.palette.Quantizer {
    static final int COMPONENT_RED = -3;
    static final int COMPONENT_GREEN = -2;
    static final int COMPONENT_BLUE = -1;
    int[] mColors;
    int[] mHistogram;
    java.util.List<com.android.internal.graphics.palette.Palette.Swatch> mQuantizedColors;
    android.util.TimingLogger mTimingLogger;
    ColorCutQuantizer() {}
    public void quantize(int[] p0, int p1) {}
    public java.util.List<com.android.internal.graphics.palette.Palette.Swatch> getQuantizedColors() { return null; }
    static void modifySignificantOctet(int[] p0, int p1, int p2, int p3) {}
    static int approximateToRgb888(int p0, int p1, int p2) { return 0; }
    static int quantizedRed(int p0) { return 0; }
    static int quantizedGreen(int p0) { return 0; }
    static int quantizedBlue(int p0) { return 0; }

    private class Vbox {
        Vbox(com.android.internal.graphics.palette.ColorCutQuantizer p0, int p1, int p2) {}
        final int getVolume() { return 0; }
        final boolean canSplit() { return false; }
        final int getColorCount() { return 0; }
        final void fitBox() {}
        final com.android.internal.graphics.palette.ColorCutQuantizer.Vbox splitBox() { return null; }
        final int getLongestColorDimension() { return 0; }
        final int findSplitPoint() { return 0; }
        final com.android.internal.graphics.palette.Palette.Swatch getAverageColor() { return null; }
    }
}
