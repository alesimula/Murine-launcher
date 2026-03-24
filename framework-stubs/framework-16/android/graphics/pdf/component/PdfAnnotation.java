package android.graphics.pdf.component;

@android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_annotations")
public abstract class PdfAnnotation {
    PdfAnnotation() {}
    public int getPdfAnnotationType() { return 0; }
}
