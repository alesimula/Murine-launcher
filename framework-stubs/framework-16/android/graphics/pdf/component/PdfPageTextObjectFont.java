package android.graphics.pdf.component;

@android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_text_objects")
public class PdfPageTextObjectFont {
    public static final int FONT_FAMILY_COURIER = 0;
    public static final int FONT_FAMILY_HELVETICA = 1;
    public static final int FONT_FAMILY_SYMBOL = 2;
    public static final int FONT_FAMILY_TIMES_NEW_ROMAN = 3;
    public PdfPageTextObjectFont(android.graphics.pdf.component.PdfPageTextObjectFont p0) {}
    public PdfPageTextObjectFont(int p0, boolean p1, boolean p2) {}
    public int getFontFamily() { return 0; }
    public boolean isBold() { return false; }
    public boolean isItalic() { return false; }
    public void setBold(boolean p0) {}
    public void setFontFamily(int p0) {}
    public void setItalic(boolean p0) {}
}
