package android.text.style;

public class QuoteSpan implements android.text.style.LeadingMarginSpan, android.text.ParcelableSpan {
    public static final int STANDARD_STRIPE_WIDTH_PX = 2;
    public static final int STANDARD_GAP_WIDTH_PX = 2;
    public static final int STANDARD_COLOR = -16776961;
    public QuoteSpan() {}
    public QuoteSpan(int p0) {}
    public QuoteSpan(int p0, int p1, int p2) {}
    public QuoteSpan(android.os.Parcel p0) {}
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    public int getColor() { return 0; }
    public int getStripeWidth() { return 0; }
    public int getGapWidth() { return 0; }
    public int getLeadingMargin(boolean p0) { return 0; }
    public void drawLeadingMargin(android.graphics.Canvas p0, android.graphics.Paint p1, int p2, int p3, int p4, int p5, int p6, java.lang.CharSequence p7, int p8, int p9, boolean p10, android.text.Layout p11) {}
    public java.lang.String toString() { return null; }
}
