package android.text.style;

public interface LeadingMarginSpan extends android.text.style.ParagraphStyle {
    public int getLeadingMargin(boolean p0);
    public void drawLeadingMargin(android.graphics.Canvas p0, android.graphics.Paint p1, int p2, int p3, int p4, int p5, int p6, java.lang.CharSequence p7, int p8, int p9, boolean p10, android.text.Layout p11);

    public static class Standard implements android.text.style.LeadingMarginSpan, android.text.ParcelableSpan {
        private final int mFirst = 0;
        private final int mRest = 0;
        public Standard(int p0, int p1) {}
        public Standard(int p0) {}
        public Standard(android.os.Parcel p0) {}
        public int getSpanTypeId() { return 0; }
        public int getSpanTypeIdInternal() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
        public int getLeadingMargin(boolean p0) { return 0; }
        public void drawLeadingMargin(android.graphics.Canvas p0, android.graphics.Paint p1, int p2, int p3, int p4, int p5, int p6, java.lang.CharSequence p7, int p8, int p9, boolean p10, android.text.Layout p11) {}
    }

    public static interface LeadingMarginSpan2 extends android.text.style.LeadingMarginSpan, android.text.style.WrapTogetherSpan {
        public int getLeadingMarginLineCount();
    }
}
