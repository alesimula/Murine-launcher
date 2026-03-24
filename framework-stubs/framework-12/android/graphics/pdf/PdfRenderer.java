package android.graphics.pdf;

public final class PdfRenderer implements java.lang.AutoCloseable {
    static final java.lang.Object sPdfiumLock = null;
    private final android.graphics.Point mTempPoint = null;
    private long mNativeDocument;
    private final int mPageCount = 0;
    private android.os.ParcelFileDescriptor mInput;
    private android.graphics.pdf.PdfRenderer.Page mCurrentPage;
    public PdfRenderer(android.os.ParcelFileDescriptor p0) throws java.io.IOException {}
    public void close() {}
    public int getPageCount() { return 0; }
    public boolean shouldScaleForPrinting() { return false; }
    public android.graphics.pdf.PdfRenderer.Page openPage(int p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    private void doClose() {}
    private void throwIfClosed() {}
    private void throwIfPageOpened() {}
    private void throwIfPageNotInDocument(int p0) {}
    private static native long nativeCreate(int p0, long p1);
    private static native void nativeClose(long p0);
    private static native int nativeGetPageCount(long p0);
    private static native boolean nativeScaleForPrinting(long p0);
    private static native void nativeRenderPage(long p0, long p1, long p2, int p3, int p4, int p5, int p6, long p7, int p8);
    private static native long nativeOpenPageAndGetSize(long p0, int p1, android.graphics.Point p2);
    private static native void nativeClosePage(long p0);

    public final class Page implements java.lang.AutoCloseable {
        public static final int RENDER_MODE_FOR_DISPLAY = 1;
        public static final int RENDER_MODE_FOR_PRINT = 2;
        private final int mIndex = 0;
        private final int mWidth = 0;
        private final int mHeight = 0;
        private long mNativePage;
        private Page(android.graphics.pdf.PdfRenderer p0, int p1) {}
        public int getIndex() { return 0; }
        public int getWidth() { return 0; }
        public int getHeight() { return 0; }
        public void render(android.graphics.Bitmap p0, android.graphics.Rect p1, android.graphics.Matrix p2, int p3) {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
        private void doClose() {}
        private void throwIfClosed() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RenderMode {
    }
}
