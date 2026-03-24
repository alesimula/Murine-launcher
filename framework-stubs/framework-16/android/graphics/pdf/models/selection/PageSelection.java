package android.graphics.pdf.models.selection;

@android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_pdf_viewer")
public final class PageSelection implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.graphics.pdf.models.selection.PageSelection> CREATOR = null;
    public PageSelection(int p0, android.graphics.pdf.models.selection.SelectionBoundary p1, android.graphics.pdf.models.selection.SelectionBoundary p2, java.util.List<android.graphics.pdf.content.PdfPageTextContent> p3) {}
    public int describeContents() { return 0; }
    public int getPage() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.graphics.pdf.content.PdfPageTextContent> getSelectedTextContents() { return null; }
    @android.annotation.NonNull
    public android.graphics.pdf.models.selection.SelectionBoundary getStart() { return null; }
    @android.annotation.NonNull
    public android.graphics.pdf.models.selection.SelectionBoundary getStop() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
