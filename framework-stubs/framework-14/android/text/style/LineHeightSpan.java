package android.text.style;

public interface LineHeightSpan extends android.text.style.ParagraphStyle, android.text.style.WrapTogetherSpan {
    public void chooseHeight(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, android.graphics.Paint.FontMetricsInt p5);

    public static interface WithDensity extends android.text.style.LineHeightSpan {
        public void chooseHeight(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, android.graphics.Paint.FontMetricsInt p5, android.text.TextPaint p6);
    }

    public static class Standard implements android.text.style.LineHeightSpan, android.text.ParcelableSpan {
        public Standard(int p0) {}
        public Standard(android.os.Parcel p0) {}
        public int getHeight() { return 0; }
        public int getSpanTypeId() { return 0; }
        public int getSpanTypeIdInternal() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
        public void chooseHeight(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, android.graphics.Paint.FontMetricsInt p5) {}
    }
}
