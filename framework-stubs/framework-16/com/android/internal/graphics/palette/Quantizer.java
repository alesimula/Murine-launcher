package com.android.internal.graphics.palette;

public interface Quantizer {
    public void quantize(int[] p0, int p1);
    public java.util.List<com.android.internal.graphics.palette.Palette.Swatch> getQuantizedColors();
}
