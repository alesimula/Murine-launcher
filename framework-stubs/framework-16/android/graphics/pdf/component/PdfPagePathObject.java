package android.graphics.pdf.component;

@android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_page_objects")
public final class PdfPagePathObject extends android.graphics.pdf.component.PdfPageObject {
    public static final int RENDER_MODE_FILL = 0;
    public static final int RENDER_MODE_FILL_STROKE = 2;
    public static final int RENDER_MODE_STROKE = 1;
    public static final int RENDER_MODE_UNKNOWN = -1;
    public PdfPagePathObject(android.graphics.Path p0) { super(); }
    public int getFillColor() { return 0; }
    public int getRenderMode() { return 0; }
    public int getStrokeColor() { return 0; }
    public float getStrokeWidth() { return 0.0f; }
    public void setFillColor(int p0) {}
    public void setRenderMode(int p0) {}
    public void setStrokeColor(int p0) {}
    public void setStrokeWidth(float p0) {}
    @android.annotation.NonNull
    public android.graphics.Path toPath() { return null; }
}
