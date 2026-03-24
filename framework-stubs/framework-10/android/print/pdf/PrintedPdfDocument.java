package android.print.pdf;

public class PrintedPdfDocument extends android.graphics.pdf.PdfDocument {
    private static final int MILS_PER_INCH = 1000;
    private static final int POINTS_IN_INCH = 72;
    private final int mPageWidth = 0;
    private final int mPageHeight = 0;
    private final android.graphics.Rect mContentRect = null;
    public PrintedPdfDocument(android.content.Context p0, android.print.PrintAttributes p1) { super(); }
    public android.graphics.pdf.PdfDocument.Page startPage(int p0) { return null; }
    public int getPageWidth() { return 0; }
    public int getPageHeight() { return 0; }
    public android.graphics.Rect getPageContentRect() { return null; }
}
