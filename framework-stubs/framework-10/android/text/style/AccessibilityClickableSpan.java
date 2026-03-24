package android.text.style;

public class AccessibilityClickableSpan extends android.text.style.ClickableSpan implements android.text.ParcelableSpan {
    private final int mOriginalClickableSpanId = 0;
    private int mWindowId;
    private long mSourceNodeId;
    private int mConnectionId;
    public static final android.os.Parcelable.Creator<android.text.style.AccessibilityClickableSpan> CREATOR = null;
    public AccessibilityClickableSpan(int p0) { super(); }
    public AccessibilityClickableSpan(android.os.Parcel p0) { super(); }
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    public android.text.style.ClickableSpan findClickableSpan(java.lang.CharSequence p0) { return null; }
    public void copyConnectionDataFrom(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void onClick(android.view.View p0) {}
}
