package android.graphics.pdf.component;

@android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_text_objects")
public final class PdfPageTextObject extends android.graphics.pdf.component.PdfPageObject {
    public static final int RENDER_MODE_FILL = 0;
    public static final int RENDER_MODE_FILL_STROKE = 2;
    public static final int RENDER_MODE_STROKE = 1;
    public static final int RENDER_MODE_UNKNOWN = -1;
    public PdfPageTextObject(java.lang.String p0, android.graphics.pdf.component.PdfPageTextObjectFont p1, float p2) { super(); }
    public int getFillColor() { return 0; }
    @android.annotation.NonNull
    public android.graphics.pdf.component.PdfPageTextObjectFont getFont() { return null; }
    public float getFontSize() { return 0.0f; }
    public int getRenderMode() { return 0; }
    public int getStrokeColor() { return 0; }
    public float getStrokeWidth() { return 0.0f; }
    @android.annotation.NonNull
    public java.lang.String getText() { return null; }
    public void setFillColor(int p0) {}
    public void setRenderMode(int p0) {}
    public void setStrokeColor(int p0) {}
    public void setStrokeWidth(float p0) {}
    public void setText(java.lang.String p0) {}
}
