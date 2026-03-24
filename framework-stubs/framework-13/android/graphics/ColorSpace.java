package android.graphics;

public abstract class ColorSpace {
    public static final float[] ILLUMINANT_A = null;
    public static final float[] ILLUMINANT_B = null;
    public static final float[] ILLUMINANT_C = null;
    public static final float[] ILLUMINANT_D50 = null;
    public static final float[] ILLUMINANT_D55 = null;
    public static final float[] ILLUMINANT_D60 = null;
    public static final float[] ILLUMINANT_D65 = null;
    public static final float[] ILLUMINANT_D75 = null;
    public static final float[] ILLUMINANT_E = null;
    public static final int MIN_ID = -1;
    public static final int MAX_ID = 63;
    ColorSpace(java.lang.String p0, android.graphics.ColorSpace.Model p1, int p2) {}
    public java.lang.String getName() { return null; }
    public int getId() { return 0; }
    public android.graphics.ColorSpace.Model getModel() { return null; }
    public int getComponentCount() { return 0; }
    public abstract boolean isWideGamut();
    public boolean isSrgb() { return false; }
    public abstract float getMinValue(int p0);
    public abstract float getMaxValue(int p0);
    public float[] toXyz(float p0, float p1, float p2) { return null; }
    public abstract float[] toXyz(float[] p0);
    public float[] fromXyz(float p0, float p1, float p2) { return null; }
    public abstract float[] fromXyz(float[] p0);
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public static android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace p0, android.graphics.ColorSpace p1) { return null; }
    public static android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace p0, android.graphics.ColorSpace p1, android.graphics.ColorSpace.RenderIntent p2) { return null; }
    public static android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace p0) { return null; }
    public static android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace p0, android.graphics.ColorSpace.RenderIntent p1) { return null; }
    public static android.graphics.ColorSpace adapt(android.graphics.ColorSpace p0, float[] p1) { return null; }
    public static android.graphics.ColorSpace adapt(android.graphics.ColorSpace p0, float[] p1, android.graphics.ColorSpace.Adaptation p2) { return null; }
    static android.graphics.ColorSpace get(int p0) { return null; }
    @android.annotation.SuppressLint("MethodNameUnits")
    public static android.graphics.ColorSpace getFromDataSpace(int p0) { return null; }
    @android.annotation.SuppressLint("MethodNameUnits")
    public int getDataSpace() { return 0; }
    public static android.graphics.ColorSpace get(android.graphics.ColorSpace.Named p0) { return null; }
    public static android.graphics.ColorSpace match(float[] p0, android.graphics.ColorSpace.Rgb.TransferParameters p1) { return null; }
    public static float[] cctToXyz(int p0) { return null; }
    public static float[] chromaticAdaptation(android.graphics.ColorSpace.Adaptation p0, float[] p1, float[] p2) { return null; }
    long getNativeInstance() { return 0L; }

    public static enum Adaptation {
        BRADFORD,
        VON_KRIES,
        CIECAT02;
        final float[] mTransform = null;
    }

    public static class Connector {
        Connector(android.graphics.ColorSpace p0, android.graphics.ColorSpace p1, android.graphics.ColorSpace.RenderIntent p2) {}
        public android.graphics.ColorSpace getSource() { return null; }
        public android.graphics.ColorSpace getDestination() { return null; }
        public android.graphics.ColorSpace.RenderIntent getRenderIntent() { return null; }
        public float[] transform(float p0, float p1, float p2) { return null; }
        public float[] transform(float[] p0) { return null; }
        static android.graphics.ColorSpace.Connector identity(android.graphics.ColorSpace p0) { return null; }

        private static class Rgb extends android.graphics.ColorSpace.Connector {
            Rgb(android.graphics.ColorSpace.Rgb p0, android.graphics.ColorSpace.Rgb p1, android.graphics.ColorSpace.RenderIntent p2) { super(null, null, null); }
            public float[] transform(float[] p0) { return null; }
        }
    }

    private static final class Lab extends android.graphics.ColorSpace {
        Lab() { super(null, null, 0); }
        public boolean isWideGamut() { return false; }
        public float getMinValue(int p0) { return 0.0f; }
        public float getMaxValue(int p0) { return 0.0f; }
        public float[] toXyz(float[] p0) { return null; }
        public float[] fromXyz(float[] p0) { return null; }
    }

    public static enum Model {
        RGB,
        XYZ,
        LAB,
        CMYK;
        public int getComponentCount() { return 0; }
    }

    public static enum Named {
        SRGB,
        LINEAR_SRGB,
        EXTENDED_SRGB,
        LINEAR_EXTENDED_SRGB,
        BT709,
        BT2020,
        DCI_P3,
        DISPLAY_P3,
        NTSC_1953,
        SMPTE_C,
        ADOBE_RGB,
        PRO_PHOTO_RGB,
        ACES,
        ACESCG,
        CIE_XYZ,
        CIE_LAB;
    }

    public static enum RenderIntent {
        PERCEPTUAL,
        RELATIVE,
        SATURATION,
        ABSOLUTE;
    }

    public static class Rgb extends android.graphics.ColorSpace {
        long getNativeInstance() { return 0L; }
        public Rgb(java.lang.String p0, float[] p1, java.util.function.DoubleUnaryOperator p2, java.util.function.DoubleUnaryOperator p3) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, float[] p2, java.util.function.DoubleUnaryOperator p3, java.util.function.DoubleUnaryOperator p4, float p5, float p6) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, android.graphics.ColorSpace.Rgb.TransferParameters p2) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, float[] p2, android.graphics.ColorSpace.Rgb.TransferParameters p3) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, double p2) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, float[] p2, double p3) { super(null, null, 0); }
        public float[] getWhitePoint(float[] p0) { return null; }
        public float[] getWhitePoint() { return null; }
        public float[] getPrimaries(float[] p0) { return null; }
        public float[] getPrimaries() { return null; }
        public float[] getTransform(float[] p0) { return null; }
        public float[] getTransform() { return null; }
        public float[] getInverseTransform(float[] p0) { return null; }
        public float[] getInverseTransform() { return null; }
        public java.util.function.DoubleUnaryOperator getOetf() { return null; }
        public java.util.function.DoubleUnaryOperator getEotf() { return null; }
        public android.graphics.ColorSpace.Rgb.TransferParameters getTransferParameters() { return null; }
        public boolean isSrgb() { return false; }
        public boolean isWideGamut() { return false; }
        public float getMinValue(int p0) { return 0.0f; }
        public float getMaxValue(int p0) { return 0.0f; }
        public float[] toLinear(float p0, float p1, float p2) { return null; }
        public float[] toLinear(float[] p0) { return null; }
        public float[] fromLinear(float p0, float p1, float p2) { return null; }
        public float[] fromLinear(float[] p0) { return null; }
        public float[] toXyz(float[] p0) { return null; }
        public float[] fromXyz(float[] p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }

        private static class NoImagePreloadHolder {
        }

        public static class TransferParameters {
            public final double a = 0.0;
            public final double b = 0.0;
            public final double c = 0.0;
            public final double d = 0.0;
            public final double e = 0.0;
            public final double f = 0.0;
            public final double g = 0.0;
            public TransferParameters(double p0, double p1, double p2, double p3, double p4) {}
            public TransferParameters(double p0, double p1, double p2, double p3, double p4, double p5, double p6) {}
            public boolean equals(java.lang.Object p0) { return false; }
            public int hashCode() { return 0; }
        }
    }

    private static final class Xyz extends android.graphics.ColorSpace {
        Xyz() { super(null, null, 0); }
        public boolean isWideGamut() { return false; }
        public float getMinValue(int p0) { return 0.0f; }
        public float getMaxValue(int p0) { return 0.0f; }
        public float[] toXyz(float[] p0) { return null; }
        public float[] fromXyz(float[] p0) { return null; }
    }
}
