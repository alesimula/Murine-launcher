package android.graphics.pdf;

public class PdfDocument {
    private final byte[] mChunk = null;
    private final java.util.List<android.graphics.pdf.PdfDocument.PageInfo> mPages = null;
    private long mNativeDocument;
    private android.graphics.pdf.PdfDocument.Page mCurrentPage;
    public PdfDocument() {}
    public android.graphics.pdf.PdfDocument.Page startPage(android.graphics.pdf.PdfDocument.PageInfo p0) { return null; }
    public void finishPage(android.graphics.pdf.PdfDocument.Page p0) {}
    public void writeTo(java.io.OutputStream p0) throws java.io.IOException {}
    public java.util.List<android.graphics.pdf.PdfDocument.PageInfo> getPages() { return null; }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    private void dispose() {}
    private void throwIfClosed() {}
    private void throwIfCurrentPageNotFinished() {}
    private native long nativeCreateDocument();
    private native void nativeClose(long p0);
    private native void nativeFinishPage(long p0);
    private native void nativeWriteTo(long p0, java.io.OutputStream p1, byte[] p2);
    private static native long nativeStartPage(long p0, int p1, int p2, int p3, int p4, int p5, int p6);

    private final class PdfCanvas extends android.graphics.Canvas {
        public PdfCanvas(android.graphics.pdf.PdfDocument p0, long p1) { super(); }
        public void setBitmap(android.graphics.Bitmap p0) {}
    }

    public static final class PageInfo {
        private int mPageWidth;
        private int mPageHeight;
        private android.graphics.Rect mContentRect;
        private int mPageNumber;
        private PageInfo() {}
        public int getPageWidth() { return 0; }
        public int getPageHeight() { return 0; }
        public android.graphics.Rect getContentRect() { return null; }
        public int getPageNumber() { return 0; }

        public static final class Builder {
            private final android.graphics.pdf.PdfDocument.PageInfo mPageInfo = null;
            public Builder(int p0, int p1, int p2) {}
            public android.graphics.pdf.PdfDocument.PageInfo.Builder setContentRect(android.graphics.Rect p0) { return null; }
            public android.graphics.pdf.PdfDocument.PageInfo create() { return null; }
        }
    }

    public static final class Page {
        private final android.graphics.pdf.PdfDocument.PageInfo mPageInfo = null;
        private android.graphics.Canvas mCanvas;
        private Page(android.graphics.Canvas p0, android.graphics.pdf.PdfDocument.PageInfo p1) {}
        public android.graphics.Canvas getCanvas() { return null; }
        public android.graphics.pdf.PdfDocument.PageInfo getInfo() { return null; }
        boolean isFinished() { return false; }
        private void finish() {}
    }
}
