package android.graphics.pdf.component;

@android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_annotations")
public final class PdfAnnotationType {
    @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_text_annotations")
    public static final int FREETEXT = 1;
    public static final int HIGHLIGHT = 2;
    public static final int STAMP = 3;
    public static final int UNKNOWN = 0;
    PdfAnnotationType() {}
}
