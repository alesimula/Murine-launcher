package android.graphics.pdf;

public final class PdfRendererPreV implements java.lang.AutoCloseable {
    public static final int DOCUMENT_LINEARIZED_TYPE_LINEARIZED = 1;
    public static final int DOCUMENT_LINEARIZED_TYPE_NON_LINEARIZED = 0;
    public static final int PDF_FORM_TYPE_ACRO_FORM = 1;
    public static final int PDF_FORM_TYPE_NONE = 0;
    public static final int PDF_FORM_TYPE_XFA_FOREGROUND = 3;
    public static final int PDF_FORM_TYPE_XFA_FULL = 2;
    public PdfRendererPreV(android.os.ParcelFileDescriptor p0) throws java.io.IOException {}
    public PdfRendererPreV(android.os.ParcelFileDescriptor p0, android.graphics.pdf.LoadParams p1) throws java.io.IOException {}
    public void close() {}
    public int getDocumentLinearizationType() { return 0; }
    public int getPageCount() { return 0; }
    public int getPdfFormType() { return 0; }
    @android.annotation.NonNull
    public android.graphics.pdf.PdfRendererPreV.Page openPage(int p0) { return null; }
    public void write(android.os.ParcelFileDescriptor p0, boolean p1) throws java.io.IOException {}

    public final class Page implements java.lang.AutoCloseable {
        Page(android.graphics.pdf.PdfRendererPreV p0) {}
        @android.annotation.NonNull
        public java.util.List<android.graphics.Rect> applyEdit(android.graphics.pdf.models.FormEditRecord p0) { return null; }
        public void close() {}
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormWidgetInfo getFormWidgetInfoAtIndex(int p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormWidgetInfo getFormWidgetInfoAtPosition(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public java.util.List<android.graphics.pdf.models.FormWidgetInfo> getFormWidgetInfos() { return null; }
        @android.annotation.NonNull
        public java.util.List<android.graphics.pdf.models.FormWidgetInfo> getFormWidgetInfos(int[] p0) { return null; }
        @android.annotation.NonNull
        public java.util.List<android.graphics.pdf.content.PdfPageGotoLinkContent> getGotoLinks() { return null; }
        public int getHeight() { return 0; }
        @android.annotation.NonNull
        public java.util.List<android.graphics.pdf.content.PdfPageImageContent> getImageContents() { return null; }
        public int getIndex() { return 0; }
        @android.annotation.NonNull
        public java.util.List<android.graphics.pdf.content.PdfPageLinkContent> getLinkContents() { return null; }
        @android.annotation.NonNull
        public java.util.List<android.graphics.pdf.content.PdfPageTextContent> getTextContents() { return null; }
        public int getWidth() { return 0; }
        public void render(android.graphics.Bitmap p0, android.graphics.Rect p1, android.graphics.Matrix p2, android.graphics.pdf.RenderParams p3) {}
        @android.annotation.NonNull
        public java.util.List<android.graphics.pdf.models.PageMatchBounds> searchText(java.lang.String p0) { return null; }
        @android.annotation.Nullable
        public android.graphics.pdf.models.selection.PageSelection selectContent(android.graphics.pdf.models.selection.SelectionBoundary p0, android.graphics.pdf.models.selection.SelectionBoundary p1) { return null; }
    }
}
