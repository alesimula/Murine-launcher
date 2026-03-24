package android.graphics.pdf;

public final class PdfEditor {
    public PdfEditor(android.os.ParcelFileDescriptor p0) throws java.io.IOException {}
    public int getPageCount() { return 0; }
    public void removePage(int p0) {}
    public void setTransformAndClip(int p0, android.graphics.Matrix p1, android.graphics.Rect p2) {}
    public void getPageSize(int p0, android.graphics.Point p1) {}
    public boolean getPageMediaBox(int p0, android.graphics.Rect p1) { return false; }
    public void setPageMediaBox(int p0, android.graphics.Rect p1) {}
    public boolean getPageCropBox(int p0, android.graphics.Rect p1) { return false; }
    public void setPageCropBox(int p0, android.graphics.Rect p1) {}
    public boolean shouldScaleForPrinting() { return false; }
    public void write(android.os.ParcelFileDescriptor p0) throws java.io.IOException {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
}
