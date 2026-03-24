package android.graphics.pdf;

public class PdfDocument {
    public PdfDocument() {}
    public android.graphics.pdf.PdfDocument.Page startPage(android.graphics.pdf.PdfDocument.PageInfo p0) { return null; }
    public void finishPage(android.graphics.pdf.PdfDocument.Page p0) {}
    public void writeTo(java.io.OutputStream p0) throws java.io.IOException {}
    public java.util.List<android.graphics.pdf.PdfDocument.PageInfo> getPages() { return null; }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}

    public static final class Page {
        public android.graphics.Canvas getCanvas() { return null; }
        public android.graphics.pdf.PdfDocument.PageInfo getInfo() { return null; }
        boolean isFinished() { return false; }
    }

    public static final class PageInfo {
        public int getPageWidth() { return 0; }
        public int getPageHeight() { return 0; }
        public android.graphics.Rect getContentRect() { return null; }
        public int getPageNumber() { return 0; }

        public static final class Builder {
            public Builder(int p0, int p1, int p2) {}
            public android.graphics.pdf.PdfDocument.PageInfo.Builder setContentRect(android.graphics.Rect p0) { return null; }
            public android.graphics.pdf.PdfDocument.PageInfo create() { return null; }
        }
    }

    private final class PdfCanvas extends android.graphics.Canvas {
        public PdfCanvas(android.graphics.pdf.PdfDocument p0, long p1) { super(); }
        public void setBitmap(android.graphics.Bitmap p0) {}
    }
}
