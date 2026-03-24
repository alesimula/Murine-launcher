package android.graphics.pdf.content;

@android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_pdf_viewer")
public final class PdfPageGotoLinkContent implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.graphics.pdf.content.PdfPageGotoLinkContent> CREATOR = null;
    public PdfPageGotoLinkContent(java.util.List<android.graphics.RectF> p0, android.graphics.pdf.content.PdfPageGotoLinkContent.Destination p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.graphics.RectF> getBounds() { return null; }
    @android.annotation.NonNull
    public android.graphics.pdf.content.PdfPageGotoLinkContent.Destination getDestination() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Destination implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.graphics.pdf.content.PdfPageGotoLinkContent.Destination> CREATOR = null;
        public Destination(int p0, float p1, float p2, float p3) {}
        public int describeContents() { return 0; }
        public int getPageNumber() { return 0; }
        public float getXCoordinate() { return 0.0f; }
        public float getYCoordinate() { return 0.0f; }
        public float getZoom() { return 0.0f; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
