package android.graphics.fonts;

public class FontFileUtil {
    private static final int SFNT_VERSION_1 = 65536;
    private static final int SFNT_VERSION_OTTO = 1330926671;
    private static final int TTC_TAG = 1953784678;
    private static final int OS2_TABLE_TAG = 1330851634;
    private static final int ANALYZE_ERROR = -1;
    private FontFileUtil() {}
    public static int unpackWeight(int p0) { return 0; }
    public static boolean unpackItalic(int p0) { return false; }
    public static boolean isSuccess(int p0) { return false; }
    private static int pack(int p0, boolean p1) { return 0; }
    public static final int analyzeStyle(java.nio.ByteBuffer p0, int p1, android.graphics.fonts.FontVariationAxis[] p2) { return 0; }
    public static long getRevision(java.nio.ByteBuffer p0, int p1) { return 0L; }
    public static java.lang.String getPostScriptName(java.nio.ByteBuffer p0, int p1) { return null; }
    public static int isPostScriptType1Font(java.nio.ByteBuffer p0, int p1) { return 0; }
    public static int isCollectionFont(java.nio.ByteBuffer p0) { return 0; }
    private static native long nGetFontRevision(java.nio.ByteBuffer p0, int p1);
    private static native java.lang.String nGetFontPostScriptName(java.nio.ByteBuffer p0, int p1);
    private static native int nIsPostScriptType1Font(java.nio.ByteBuffer p0, int p1);
}
