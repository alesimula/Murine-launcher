package android.graphics.pdf;

public final class PdfRenderer implements java.lang.AutoCloseable {
    static final java.lang.Object sPdfiumLock = null;
    public PdfRenderer(android.os.ParcelFileDescriptor p0) throws java.io.IOException {}
    public void close() {}
    public int getPageCount() { return 0; }
    public boolean shouldScaleForPrinting() { return false; }
    public android.graphics.pdf.PdfRenderer.Page openPage(int p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}

    public final class Page implements java.lang.AutoCloseable {
        public static final int RENDER_MODE_FOR_DISPLAY = 1;
        public static final int RENDER_MODE_FOR_PRINT = 2;
        public int getIndex() { return 0; }
        public int getWidth() { return 0; }
        public int getHeight() { return 0; }
        public void render(android.graphics.Bitmap p0, android.graphics.Rect p1, android.graphics.Matrix p2, int p3) {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RenderMode {
    }
}
