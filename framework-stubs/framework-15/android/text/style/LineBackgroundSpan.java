package android.text.style;

public interface LineBackgroundSpan extends android.text.style.ParagraphStyle {
    public void drawBackground(android.graphics.Canvas p0, android.graphics.Paint p1, int p2, int p3, int p4, int p5, int p6, java.lang.CharSequence p7, int p8, int p9, int p10);

    public static class Standard implements android.text.style.LineBackgroundSpan, android.text.ParcelableSpan {
        public Standard(int p0) {}
        public Standard(android.os.Parcel p0) {}
        public int getSpanTypeId() { return 0; }
        public int getSpanTypeIdInternal() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
        public final int getColor() { return 0; }
        public void drawBackground(android.graphics.Canvas p0, android.graphics.Paint p1, int p2, int p3, int p4, int p5, int p6, java.lang.CharSequence p7, int p8, int p9, int p10) {}
    }
}
