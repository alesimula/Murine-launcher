package android.icu.text;

public final class Normalizer implements java.lang.Cloneable {
    public static final int COMPARE_CODE_POINT_ORDER = 32768;
    public static final int COMPARE_IGNORE_CASE = 65536;
    public static final int FOLD_CASE_DEFAULT = 0;
    public static final int FOLD_CASE_EXCLUDE_SPECIAL_I = 1;
    public static final int INPUT_IS_FCD = 131072;
    public static final android.icu.text.Normalizer.QuickCheckResult MAYBE = null;
    public static final android.icu.text.Normalizer.QuickCheckResult NO = null;
    public static final android.icu.text.Normalizer.QuickCheckResult YES = null;
    Normalizer() {}
    @java.lang.Deprecated
    public java.lang.Object clone() { return null; }
    public static int compare(char[] p0, int p1, int p2, char[] p3, int p4, int p5, int p6) { return 0; }
    public static int compare(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    public static int compare(char[] p0, char[] p1, int p2) { return 0; }
    public static int compare(int p0, int p1, int p2) { return 0; }
    public static int compare(int p0, java.lang.String p1, int p2) { return 0; }

    public static final class QuickCheckResult {
        private QuickCheckResult() {}
    }
}
