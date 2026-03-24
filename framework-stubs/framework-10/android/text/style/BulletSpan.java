package android.text.style;

public class BulletSpan implements android.text.style.LeadingMarginSpan, android.text.ParcelableSpan {
    private static final int STANDARD_BULLET_RADIUS = 4;
    public static final int STANDARD_GAP_WIDTH = 2;
    private static final int STANDARD_COLOR = 0;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private final int mGapWidth = 0;
    private final int mBulletRadius = 0;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private final int mColor = 0;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private final boolean mWantColor = false;
    public BulletSpan() {}
    public BulletSpan(int p0) {}
    public BulletSpan(int p0, int p1) {}
    public BulletSpan(int p0, int p1, int p2) {}
    private BulletSpan(int p0, int p1, boolean p2, int p3) {}
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
    public void drawLeadingMargin(android.graphics.Canvas p0, android.graphics.Paint p1, int p2, int p3, int p4, int p5, int p6, java.lang.CharSequence p7, int p8, int p9, boolean p10, android.text.Layout p11) {}
}
