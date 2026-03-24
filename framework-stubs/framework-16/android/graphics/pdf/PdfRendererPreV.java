package android.graphics.pdf;

@android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_pdf_viewer")
public final class PdfRendererPreV implements java.lang.AutoCloseable {
    public static final int DOCUMENT_LINEARIZED_TYPE_LINEARIZED = 1;
    public static final int DOCUMENT_LINEARIZED_TYPE_NON_LINEARIZED = 0;
    @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_form_filling")
    public static final int PDF_FORM_TYPE_ACRO_FORM = 1;
    @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_form_filling")
    public static final int PDF_FORM_TYPE_NONE = 0;
    @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_form_filling")
    public static final int PDF_FORM_TYPE_XFA_FOREGROUND = 3;
    @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_form_filling")
    public static final int PDF_FORM_TYPE_XFA_FULL = 2;
    public PdfRendererPreV(android.os.ParcelFileDescriptor p0) throws java.io.IOException {}
    public PdfRendererPreV(android.os.ParcelFileDescriptor p0, android.graphics.pdf.LoadParams p1) throws java.io.IOException {}
    public void close() {}
    public int getDocumentLinearizationType() { return 0; }
    public int getPageCount() { return 0; }
    @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_form_filling")
    public int getPdfFormType() { return 0; }
    @android.annotation.NonNull
    public android.graphics.pdf.PdfRendererPreV.Page openPage(int p0) { return null; }
    public void write(android.os.ParcelFileDescriptor p0, boolean p1) throws java.io.IOException {}

    public final class Page implements java.lang.AutoCloseable {
        Page(android.graphics.pdf.PdfRendererPreV p0) {}
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_annotations")
        public int addPageAnnotation(android.graphics.pdf.component.PdfAnnotation p0) { return 0; }
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_page_objects")
        public int addPageObject(android.graphics.pdf.component.PdfPageObject p0) { return 0; }
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_form_filling")
        @android.annotation.NonNull
        public java.util.List<android.graphics.Rect> applyEdit(android.graphics.pdf.models.FormEditRecord p0) { return null; }
        public void close() {}
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_form_filling")
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormWidgetInfo getFormWidgetInfoAtIndex(int p0) { return null; }
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_form_filling")
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormWidgetInfo getFormWidgetInfoAtPosition(int p0, int p1) { return null; }
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_form_filling")
        @android.annotation.NonNull
        public java.util.List<android.graphics.pdf.models.FormWidgetInfo> getFormWidgetInfos() { return null; }
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_form_filling")
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
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_annotations")
        @android.annotation.NonNull
        public java.util.List<android.util.Pair<java.lang.Integer, android.graphics.pdf.component.PdfAnnotation>> getPageAnnotations() { return null; }
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_page_objects")
        @android.annotation.NonNull
        public java.util.List<android.util.Pair<java.lang.Integer, android.graphics.pdf.component.PdfPageObject>> getPageObjects() { return null; }
        @android.annotation.NonNull
        public java.util.List<android.graphics.pdf.content.PdfPageTextContent> getTextContents() { return null; }
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_get_top_pdf_page_object_at_position")
        @android.annotation.Nullable
        public android.util.Pair<java.lang.Integer, android.graphics.pdf.component.PdfPageObject> getTopPageObjectAtPosition(android.graphics.PointF p0, int[] p1) { return null; }
        public int getWidth() { return 0; }
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_annotations")
        public void removePageAnnotation(int p0) {}
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_page_objects")
        public void removePageObject(int p0) {}
        public void render(android.graphics.Bitmap p0, android.graphics.Rect p1, android.graphics.Matrix p2, android.graphics.pdf.RenderParams p3) {}
        @android.annotation.NonNull
        public java.util.List<android.graphics.pdf.models.PageMatchBounds> searchText(java.lang.String p0) { return null; }
        @android.annotation.Nullable
        public android.graphics.pdf.models.selection.PageSelection selectContent(android.graphics.pdf.models.selection.SelectionBoundary p0, android.graphics.pdf.models.selection.SelectionBoundary p1) { return null; }
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_annotations")
        public boolean updatePageAnnotation(int p0, android.graphics.pdf.component.PdfAnnotation p1) { return false; }
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_page_objects")
        public boolean updatePageObject(int p0, android.graphics.pdf.component.PdfPageObject p1) { return false; }
    }
}
