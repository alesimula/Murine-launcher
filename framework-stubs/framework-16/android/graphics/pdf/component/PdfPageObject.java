package android.graphics.pdf.component;

@android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_page_objects")
public abstract class PdfPageObject {
    PdfPageObject() {}
    @android.annotation.NonNull
    public float[] getMatrix() { return null; }
    public int getPdfObjectType() { return 0; }
    public void setMatrix(android.graphics.Matrix p0) {}
    public void transform(float p0, float p1, float p2, float p3, float p4, float p5) {}
}
