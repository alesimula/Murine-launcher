package android.graphics.pdf.component;

@android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_page_objects")
public final class PdfPageObjectType {
    public static final int IMAGE = 3;
    public static final int PATH = 2;
    @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_text_objects")
    public static final int TEXT = 1;
    public static final int UNKNOWN = 0;
    PdfPageObjectType() {}
    public static boolean isValidType(int p0) { return false; }
}
