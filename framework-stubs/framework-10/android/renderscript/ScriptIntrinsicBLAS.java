package android.renderscript;

public final class ScriptIntrinsicBLAS extends android.renderscript.ScriptIntrinsic {
    private android.renderscript.Allocation mLUT;
    private static final int RsBlas_sdsdot = 1;
    private static final int RsBlas_dsdot = 2;
    private static final int RsBlas_sdot = 3;
    private static final int RsBlas_ddot = 4;
    private static final int RsBlas_cdotu_sub = 5;
    private static final int RsBlas_cdotc_sub = 6;
    private static final int RsBlas_zdotu_sub = 7;
    private static final int RsBlas_zdotc_sub = 8;
    private static final int RsBlas_snrm2 = 9;
    private static final int RsBlas_sasum = 10;
    private static final int RsBlas_dnrm2 = 11;
    private static final int RsBlas_dasum = 12;
    private static final int RsBlas_scnrm2 = 13;
    private static final int RsBlas_scasum = 14;
    private static final int RsBlas_dznrm2 = 15;
    private static final int RsBlas_dzasum = 16;
    private static final int RsBlas_isamax = 17;
    private static final int RsBlas_idamax = 18;
    private static final int RsBlas_icamax = 19;
    private static final int RsBlas_izamax = 20;
    private static final int RsBlas_sswap = 21;
    private static final int RsBlas_scopy = 22;
    private static final int RsBlas_saxpy = 23;
    private static final int RsBlas_dswap = 24;
    private static final int RsBlas_dcopy = 25;
    private static final int RsBlas_daxpy = 26;
    private static final int RsBlas_cswap = 27;
    private static final int RsBlas_ccopy = 28;
    private static final int RsBlas_caxpy = 29;
    private static final int RsBlas_zswap = 30;
    private static final int RsBlas_zcopy = 31;
    private static final int RsBlas_zaxpy = 32;
    private static final int RsBlas_srotg = 33;
    private static final int RsBlas_srotmg = 34;
    private static final int RsBlas_srot = 35;
    private static final int RsBlas_srotm = 36;
    private static final int RsBlas_drotg = 37;
    private static final int RsBlas_drotmg = 38;
    private static final int RsBlas_drot = 39;
    private static final int RsBlas_drotm = 40;
    private static final int RsBlas_sscal = 41;
    private static final int RsBlas_dscal = 42;
    private static final int RsBlas_cscal = 43;
    private static final int RsBlas_zscal = 44;
    private static final int RsBlas_csscal = 45;
    private static final int RsBlas_zdscal = 46;
    private static final int RsBlas_sgemv = 47;
    private static final int RsBlas_sgbmv = 48;
    private static final int RsBlas_strmv = 49;
    private static final int RsBlas_stbmv = 50;
    private static final int RsBlas_stpmv = 51;
    private static final int RsBlas_strsv = 52;
    private static final int RsBlas_stbsv = 53;
    private static final int RsBlas_stpsv = 54;
    private static final int RsBlas_dgemv = 55;
    private static final int RsBlas_dgbmv = 56;
    private static final int RsBlas_dtrmv = 57;
    private static final int RsBlas_dtbmv = 58;
    private static final int RsBlas_dtpmv = 59;
    private static final int RsBlas_dtrsv = 60;
    private static final int RsBlas_dtbsv = 61;
    private static final int RsBlas_dtpsv = 62;
    private static final int RsBlas_cgemv = 63;
    private static final int RsBlas_cgbmv = 64;
    private static final int RsBlas_ctrmv = 65;
    private static final int RsBlas_ctbmv = 66;
    private static final int RsBlas_ctpmv = 67;
    private static final int RsBlas_ctrsv = 68;
    private static final int RsBlas_ctbsv = 69;
    private static final int RsBlas_ctpsv = 70;
    private static final int RsBlas_zgemv = 71;
    private static final int RsBlas_zgbmv = 72;
    private static final int RsBlas_ztrmv = 73;
    private static final int RsBlas_ztbmv = 74;
    private static final int RsBlas_ztpmv = 75;
    private static final int RsBlas_ztrsv = 76;
    private static final int RsBlas_ztbsv = 77;
    private static final int RsBlas_ztpsv = 78;
    private static final int RsBlas_ssymv = 79;
    private static final int RsBlas_ssbmv = 80;
    private static final int RsBlas_sspmv = 81;
    private static final int RsBlas_sger = 82;
    private static final int RsBlas_ssyr = 83;
    private static final int RsBlas_sspr = 84;
    private static final int RsBlas_ssyr2 = 85;
    private static final int RsBlas_sspr2 = 86;
    private static final int RsBlas_dsymv = 87;
    private static final int RsBlas_dsbmv = 88;
    private static final int RsBlas_dspmv = 89;
    private static final int RsBlas_dger = 90;
    private static final int RsBlas_dsyr = 91;
    private static final int RsBlas_dspr = 92;
    private static final int RsBlas_dsyr2 = 93;
    private static final int RsBlas_dspr2 = 94;
    private static final int RsBlas_chemv = 95;
    private static final int RsBlas_chbmv = 96;
    private static final int RsBlas_chpmv = 97;
    private static final int RsBlas_cgeru = 98;
    private static final int RsBlas_cgerc = 99;
    private static final int RsBlas_cher = 100;
    private static final int RsBlas_chpr = 101;
    private static final int RsBlas_cher2 = 102;
    private static final int RsBlas_chpr2 = 103;
    private static final int RsBlas_zhemv = 104;
    private static final int RsBlas_zhbmv = 105;
    private static final int RsBlas_zhpmv = 106;
    private static final int RsBlas_zgeru = 107;
    private static final int RsBlas_zgerc = 108;
    private static final int RsBlas_zher = 109;
    private static final int RsBlas_zhpr = 110;
    private static final int RsBlas_zher2 = 111;
    private static final int RsBlas_zhpr2 = 112;
    private static final int RsBlas_sgemm = 113;
    private static final int RsBlas_ssymm = 114;
    private static final int RsBlas_ssyrk = 115;
    private static final int RsBlas_ssyr2k = 116;
    private static final int RsBlas_strmm = 117;
    private static final int RsBlas_strsm = 118;
    private static final int RsBlas_dgemm = 119;
    private static final int RsBlas_dsymm = 120;
    private static final int RsBlas_dsyrk = 121;
    private static final int RsBlas_dsyr2k = 122;
    private static final int RsBlas_dtrmm = 123;
    private static final int RsBlas_dtrsm = 124;
    private static final int RsBlas_cgemm = 125;
    private static final int RsBlas_csymm = 126;
    private static final int RsBlas_csyrk = 127;
    private static final int RsBlas_csyr2k = 128;
    private static final int RsBlas_ctrmm = 129;
    private static final int RsBlas_ctrsm = 130;
    private static final int RsBlas_zgemm = 131;
    private static final int RsBlas_zsymm = 132;
    private static final int RsBlas_zsyrk = 133;
    private static final int RsBlas_zsyr2k = 134;
    private static final int RsBlas_ztrmm = 135;
    private static final int RsBlas_ztrsm = 136;
    private static final int RsBlas_chemm = 137;
    private static final int RsBlas_cherk = 138;
    private static final int RsBlas_cher2k = 139;
    private static final int RsBlas_zhemm = 140;
    private static final int RsBlas_zherk = 141;
    private static final int RsBlas_zher2k = 142;
    private static final int RsBlas_bnnm = 1000;
    public static final int NO_TRANSPOSE = 111;
    public static final int TRANSPOSE = 112;
    public static final int CONJ_TRANSPOSE = 113;
    public static final int UPPER = 121;
    public static final int LOWER = 122;
    public static final int NON_UNIT = 131;
    public static final int UNIT = 132;
    public static final int LEFT = 141;
    public static final int RIGHT = 142;
    private ScriptIntrinsicBLAS(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
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
    public static @interface Uplo {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Transpose {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Side {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Diag {
    }
}
