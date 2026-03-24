package android.text.style;

public class BulletSpan implements android.text.style.LeadingMarginSpan, android.text.ParcelableSpan {
    public static final int STANDARD_GAP_WIDTH = 2;
    public BulletSpan() {}
    public BulletSpan(int p0) {}
    public BulletSpan(int p0, int p1) {}
    public BulletSpan(int p0, int p1, int p2) {}
    public BulletSpan(int p0, int p1, boolean p2, int p3) {}
    public BulletSpan(android.os.Parcel p0) {}
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    public int getLeadingMargin(boolean p0) { return 0; }
    public int getGapWidth() { return 0; }
    public int getBulletRadius() { return 0; }
    public int getColor() { return 0; }
    public boolean getWantColor() { return false; }
    public void drawLeadingMargin(android.graphics.Canvas p0, android.graphics.Paint p1, int p2, int p3, int p4, int p5, int p6, java.lang.CharSequence p7, int p8, int p9, boolean p10, android.text.Layout p11) {}
    public java.lang.String toString() { return null; }
}
