package android.renderscript;

@java.lang.Deprecated
public final class ScriptIntrinsicBLAS extends android.renderscript.ScriptIntrinsic {
    public static final int NO_TRANSPOSE = 111;
    public static final int TRANSPOSE = 112;
    public static final int CONJ_TRANSPOSE = 113;
    public static final int UPPER = 121;
    public static final int LOWER = 122;
    public static final int NON_UNIT = 131;
    public static final int UNIT = 132;
    public static final int LEFT = 141;
    public static final int RIGHT = 142;
    ScriptIntrinsicBLAS() { super(0L, null); }
    public static android.renderscript.ScriptIntrinsicBLAS create(android.renderscript.RenderScript p0) { return null; }
    static void validateSide(int p0) {}
    static void validateTranspose(int p0) {}
    static void validateConjTranspose(int p0) {}
    static void validateDiag(int p0) {}
    static void validateUplo(int p0) {}
    static void validateGEMV(android.renderscript.Element p0, int p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, int p4, android.renderscript.Allocation p5, int p6) {}
    public void SGEMV(int p0, float p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, int p4, float p5, android.renderscript.Allocation p6, int p7) {}
    public void DGEMV(int p0, double p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, int p4, double p5, android.renderscript.Allocation p6, int p7) {}
    public void CGEMV(int p0, android.renderscript.Float2 p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, int p4, android.renderscript.Float2 p5, android.renderscript.Allocation p6, int p7) {}
    public void ZGEMV(int p0, android.renderscript.Double2 p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, int p4, android.renderscript.Double2 p5, android.renderscript.Allocation p6, int p7) {}
    public void SGBMV(int p0, int p1, int p2, float p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, int p6, float p7, android.renderscript.Allocation p8, int p9) {}
    public void DGBMV(int p0, int p1, int p2, double p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, int p6, double p7, android.renderscript.Allocation p8, int p9) {}
    public void CGBMV(int p0, int p1, int p2, android.renderscript.Float2 p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, int p6, android.renderscript.Float2 p7, android.renderscript.Allocation p8, int p9) {}
    public void ZGBMV(int p0, int p1, int p2, android.renderscript.Double2 p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, int p6, android.renderscript.Double2 p7, android.renderscript.Allocation p8, int p9) {}
    static void validateTRMV(android.renderscript.Element p0, int p1, int p2, int p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, int p6) {}
    static int validateTPMV(android.renderscript.Element p0, int p1, int p2, int p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, int p6) { return 0; }
    public void STRMV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void DTRMV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void CTRMV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void ZTRMV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void STBMV(int p0, int p1, int p2, int p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, int p6) {}
    public void DTBMV(int p0, int p1, int p2, int p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, int p6) {}
    public void CTBMV(int p0, int p1, int p2, int p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, int p6) {}
    public void ZTBMV(int p0, int p1, int p2, int p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, int p6) {}
    public void STPMV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void DTPMV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void CTPMV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void ZTPMV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void STRSV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void DTRSV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void CTRSV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void ZTRSV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void STBSV(int p0, int p1, int p2, int p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, int p6) {}
    public void DTBSV(int p0, int p1, int p2, int p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, int p6) {}
    public void CTBSV(int p0, int p1, int p2, int p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, int p6) {}
    public void ZTBSV(int p0, int p1, int p2, int p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, int p6) {}
    public void STPSV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void DTPSV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void CTPSV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    public void ZTPSV(int p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5) {}
    static int validateSYMV(android.renderscript.Element p0, int p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5, int p6) { return 0; }
    static int validateSPMV(android.renderscript.Element p0, int p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, int p4, android.renderscript.Allocation p5, int p6) { return 0; }
    static void validateGER(android.renderscript.Element p0, android.renderscript.Allocation p1, int p2, android.renderscript.Allocation p3, int p4, android.renderscript.Allocation p5) {}
    static int validateSYR(android.renderscript.Element p0, int p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4) { return 0; }
    static int validateSPR(android.renderscript.Element p0, int p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4) { return 0; }
    static int validateSYR2(android.renderscript.Element p0, int p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4, int p5, android.renderscript.Allocation p6) { return 0; }
    static int validateSPR2(android.renderscript.Element p0, int p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4, int p5, android.renderscript.Allocation p6) { return 0; }
    public void SSYMV(int p0, float p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, int p4, float p5, android.renderscript.Allocation p6, int p7) {}
    public void SSBMV(int p0, int p1, float p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5, float p6, android.renderscript.Allocation p7, int p8) {}
    public void SSPMV(int p0, float p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, int p4, float p5, android.renderscript.Allocation p6, int p7) {}
    public void SGER(float p0, android.renderscript.Allocation p1, int p2, android.renderscript.Allocation p3, int p4, android.renderscript.Allocation p5) {}
    public void SSYR(int p0, float p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4) {}
    public void SSPR(int p0, float p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4) {}
    public void SSYR2(int p0, float p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4, int p5, android.renderscript.Allocation p6) {}
    public void SSPR2(int p0, float p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4, int p5, android.renderscript.Allocation p6) {}
    public void DSYMV(int p0, double p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, int p4, double p5, android.renderscript.Allocation p6, int p7) {}
    public void DSBMV(int p0, int p1, double p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5, double p6, android.renderscript.Allocation p7, int p8) {}
    public void DSPMV(int p0, double p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, int p4, double p5, android.renderscript.Allocation p6, int p7) {}
    public void DGER(double p0, android.renderscript.Allocation p1, int p2, android.renderscript.Allocation p3, int p4, android.renderscript.Allocation p5) {}
    public void DSYR(int p0, double p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4) {}
    public void DSPR(int p0, double p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4) {}
    public void DSYR2(int p0, double p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4, int p5, android.renderscript.Allocation p6) {}
    public void DSPR2(int p0, double p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4, int p5, android.renderscript.Allocation p6) {}
    static void validateGERU(android.renderscript.Element p0, android.renderscript.Allocation p1, int p2, android.renderscript.Allocation p3, int p4, android.renderscript.Allocation p5) {}
    public void CHEMV(int p0, android.renderscript.Float2 p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, int p4, android.renderscript.Float2 p5, android.renderscript.Allocation p6, int p7) {}
    public void CHBMV(int p0, int p1, android.renderscript.Float2 p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5, android.renderscript.Float2 p6, android.renderscript.Allocation p7, int p8) {}
    public void CHPMV(int p0, android.renderscript.Float2 p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, int p4, android.renderscript.Float2 p5, android.renderscript.Allocation p6, int p7) {}
    public void CGERU(android.renderscript.Float2 p0, android.renderscript.Allocation p1, int p2, android.renderscript.Allocation p3, int p4, android.renderscript.Allocation p5) {}
    public void CGERC(android.renderscript.Float2 p0, android.renderscript.Allocation p1, int p2, android.renderscript.Allocation p3, int p4, android.renderscript.Allocation p5) {}
    public void CHER(int p0, float p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4) {}
    public void CHPR(int p0, float p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4) {}
    public void CHER2(int p0, android.renderscript.Float2 p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4, int p5, android.renderscript.Allocation p6) {}
    public void CHPR2(int p0, android.renderscript.Float2 p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4, int p5, android.renderscript.Allocation p6) {}
    public void ZHEMV(int p0, android.renderscript.Double2 p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, int p4, android.renderscript.Double2 p5, android.renderscript.Allocation p6, int p7) {}
    public void ZHBMV(int p0, int p1, android.renderscript.Double2 p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, int p5, android.renderscript.Double2 p6, android.renderscript.Allocation p7, int p8) {}
    public void ZHPMV(int p0, android.renderscript.Double2 p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, int p4, android.renderscript.Double2 p5, android.renderscript.Allocation p6, int p7) {}
    public void ZGERU(android.renderscript.Double2 p0, android.renderscript.Allocation p1, int p2, android.renderscript.Allocation p3, int p4, android.renderscript.Allocation p5) {}
    public void ZGERC(android.renderscript.Double2 p0, android.renderscript.Allocation p1, int p2, android.renderscript.Allocation p3, int p4, android.renderscript.Allocation p5) {}
    public void ZHER(int p0, double p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4) {}
    public void ZHPR(int p0, double p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4) {}
    public void ZHER2(int p0, android.renderscript.Double2 p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4, int p5, android.renderscript.Allocation p6) {}
    public void ZHPR2(int p0, android.renderscript.Double2 p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4, int p5, android.renderscript.Allocation p6) {}
    static void validateL3(android.renderscript.Element p0, int p1, int p2, int p3, android.renderscript.Allocation p4, android.renderscript.Allocation p5, android.renderscript.Allocation p6) {}
    public void SGEMM(int p0, int p1, float p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, float p5, android.renderscript.Allocation p6) {}
    public void DGEMM(int p0, int p1, double p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, double p5, android.renderscript.Allocation p6) {}
    public void CGEMM(int p0, int p1, android.renderscript.Float2 p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, android.renderscript.Float2 p5, android.renderscript.Allocation p6) {}
    public void ZGEMM(int p0, int p1, android.renderscript.Double2 p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, android.renderscript.Double2 p5, android.renderscript.Allocation p6) {}
    public void SSYMM(int p0, int p1, float p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, float p5, android.renderscript.Allocation p6) {}
    public void DSYMM(int p0, int p1, double p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, double p5, android.renderscript.Allocation p6) {}
    public void CSYMM(int p0, int p1, android.renderscript.Float2 p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, android.renderscript.Float2 p5, android.renderscript.Allocation p6) {}
    public void ZSYMM(int p0, int p1, android.renderscript.Double2 p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, android.renderscript.Double2 p5, android.renderscript.Allocation p6) {}
    public void SSYRK(int p0, int p1, float p2, android.renderscript.Allocation p3, float p4, android.renderscript.Allocation p5) {}
    public void DSYRK(int p0, int p1, double p2, android.renderscript.Allocation p3, double p4, android.renderscript.Allocation p5) {}
    public void CSYRK(int p0, int p1, android.renderscript.Float2 p2, android.renderscript.Allocation p3, android.renderscript.Float2 p4, android.renderscript.Allocation p5) {}
    public void ZSYRK(int p0, int p1, android.renderscript.Double2 p2, android.renderscript.Allocation p3, android.renderscript.Double2 p4, android.renderscript.Allocation p5) {}
    static void validateSYR2K(android.renderscript.Element p0, int p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4) {}
    public void SSYR2K(int p0, int p1, float p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, float p5, android.renderscript.Allocation p6) {}
    public void DSYR2K(int p0, int p1, double p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, double p5, android.renderscript.Allocation p6) {}
    public void CSYR2K(int p0, int p1, android.renderscript.Float2 p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, android.renderscript.Float2 p5, android.renderscript.Allocation p6) {}
    public void ZSYR2K(int p0, int p1, android.renderscript.Double2 p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, android.renderscript.Double2 p5, android.renderscript.Allocation p6) {}
    static void validateTRMM(android.renderscript.Element p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4) {}
    public void STRMM(int p0, int p1, int p2, int p3, float p4, android.renderscript.Allocation p5, android.renderscript.Allocation p6) {}
    public void DTRMM(int p0, int p1, int p2, int p3, double p4, android.renderscript.Allocation p5, android.renderscript.Allocation p6) {}
    public void CTRMM(int p0, int p1, int p2, int p3, android.renderscript.Float2 p4, android.renderscript.Allocation p5, android.renderscript.Allocation p6) {}
    public void ZTRMM(int p0, int p1, int p2, int p3, android.renderscript.Double2 p4, android.renderscript.Allocation p5, android.renderscript.Allocation p6) {}
    static void validateTRSM(android.renderscript.Element p0, int p1, int p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4) {}
    public void STRSM(int p0, int p1, int p2, int p3, float p4, android.renderscript.Allocation p5, android.renderscript.Allocation p6) {}
    public void DTRSM(int p0, int p1, int p2, int p3, double p4, android.renderscript.Allocation p5, android.renderscript.Allocation p6) {}
    public void CTRSM(int p0, int p1, int p2, int p3, android.renderscript.Float2 p4, android.renderscript.Allocation p5, android.renderscript.Allocation p6) {}
    public void ZTRSM(int p0, int p1, int p2, int p3, android.renderscript.Double2 p4, android.renderscript.Allocation p5, android.renderscript.Allocation p6) {}
    static void validateHEMM(android.renderscript.Element p0, int p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4) {}
    public void CHEMM(int p0, int p1, android.renderscript.Float2 p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, android.renderscript.Float2 p5, android.renderscript.Allocation p6) {}
    public void ZHEMM(int p0, int p1, android.renderscript.Double2 p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, android.renderscript.Double2 p5, android.renderscript.Allocation p6) {}
    static void validateHERK(android.renderscript.Element p0, int p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3) {}
    public void CHERK(int p0, int p1, float p2, android.renderscript.Allocation p3, float p4, android.renderscript.Allocation p5) {}
    public void ZHERK(int p0, int p1, double p2, android.renderscript.Allocation p3, double p4, android.renderscript.Allocation p5) {}
    static void validateHER2K(android.renderscript.Element p0, int p1, android.renderscript.Allocation p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4) {}
    public void CHER2K(int p0, int p1, android.renderscript.Float2 p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, float p5, android.renderscript.Allocation p6) {}
    public void ZHER2K(int p0, int p1, android.renderscript.Double2 p2, android.renderscript.Allocation p3, android.renderscript.Allocation p4, double p5, android.renderscript.Allocation p6) {}
    public void BNNM(android.renderscript.Allocation p0, int p1, android.renderscript.Allocation p2, int p3, android.renderscript.Allocation p4, int p5, int p6) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Diag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Side {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Transpose {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Uplo {
    }
}
