package android.provider;

@java.lang.Deprecated
public class FontsContract {
    private static final java.lang.String TAG = "FontsContract";
    private static final java.lang.Object sLock = null;
    private static android.os.Handler sHandler;
    private static android.os.HandlerThread sThread;
    private static java.util.Set<java.lang.String> sInQueueSet;
    private static volatile android.content.Context sContext;
    private static final android.util.LruCache<java.lang.String, android.graphics.Typeface> sTypefaceCache = null;
    private static final int THREAD_RENEWAL_THRESHOLD_MS = 10000;
    private static final long SYNC_FONT_FETCH_TIMEOUT_MS = 500L;
    private static final java.lang.Runnable sReplaceDispatcherThreadRunnable = null;
    private static final java.util.Comparator<byte[]> sByteArrayComparator = null;
    private FontsContract() {}
    public static void setApplicationContextForResources(android.content.Context p0) {}
    public static android.graphics.Typeface getFontSync(android.provider.FontRequest p0) { return null; }
    public static void requestFonts(android.content.Context p0, android.provider.FontRequest p1, android.os.Handler p2, android.os.CancellationSignal p3, android.provider.FontsContract.FontRequestCallback p4) {}
    public static android.provider.FontsContract.FontFamilyResult fetchFonts(android.content.Context p0, android.os.CancellationSignal p1, android.provider.FontRequest p2) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public static android.graphics.Typeface buildTypeface(android.content.Context p0, android.os.CancellationSignal p1, android.provider.FontsContract.FontInfo[] p2) { return null; }
    private static java.util.Map<android.net.Uri, java.nio.ByteBuffer> prepareFontData(android.content.Context p0, android.provider.FontsContract.FontInfo[] p1, android.os.CancellationSignal p2) { return null; }
    public static android.content.pm.ProviderInfo getProvider(android.content.pm.PackageManager p0, android.provider.FontRequest p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    private static boolean equalsByteArrayList(java.util.List<byte[]> p0, java.util.List<byte[]> p1) { return false; }
    private static java.util.List<byte[]> convertToByteArrayList(android.content.pm.Signature[] p0) { return null; }
    public static android.provider.FontsContract.FontInfo[] getFontFromProvider(android.content.Context p0, android.provider.FontRequest p1, java.lang.String p2, android.os.CancellationSignal p3) { return null; }

    @java.lang.Deprecated
    public static final class Columns implements android.provider.BaseColumns {
        public static final java.lang.String FILE_ID = "file_id";
        public static final java.lang.String TTC_INDEX = "font_ttc_index";
        public static final java.lang.String VARIATION_SETTINGS = "font_variation_settings";
        public static final java.lang.String WEIGHT = "font_weight";
        public static final java.lang.String ITALIC = "font_italic";
        public static final java.lang.String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_OK = 0;
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        private Columns() {}
    }

    @java.lang.Deprecated
    public static class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_REJECTED = 3;
        private final int mStatusCode = 0;
        private final android.provider.FontsContract.FontInfo[] mFonts = null;
        public FontFamilyResult(int p0, android.provider.FontsContract.FontInfo[] p1) {}
        public int getStatusCode() { return 0; }
        public android.provider.FontsContract.FontInfo[] getFonts() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface FontResultStatus {
        }
    }

    @java.lang.Deprecated
    public static class FontInfo {
        private final android.net.Uri mUri = null;
        private final int mTtcIndex = 0;
        private final android.graphics.fonts.FontVariationAxis[] mAxes = null;
        private final int mWeight = 0;
        private final boolean mItalic = false;
        private final int mResultCode = 0;
        public FontInfo(android.net.Uri p0, int p1, android.graphics.fonts.FontVariationAxis[] p2, int p3, boolean p4, int p5) {}
        public android.net.Uri getUri() { return null; }
        public int getTtcIndex() { return 0; }
        public android.graphics.fonts.FontVariationAxis[] getAxes() { return null; }
        public int getWeight() { return 0; }
        public boolean isItalic() { return false; }
        public int getResultCode() { return 0; }
    }

    @java.lang.Deprecated
    public static class FontRequestCallback {
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public FontRequestCallback() {}
        public void onTypefaceRetrieved(android.graphics.Typeface p0) {}
        public void onTypefaceRequestFailed(int p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface FontRequestFailReason {
        }
    }
}
