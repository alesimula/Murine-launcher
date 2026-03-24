package android.text.style;

public class AccessibilityURLSpan extends android.text.style.URLSpan implements android.os.Parcelable {
    final android.text.style.AccessibilityClickableSpan mAccessibilityClickableSpan = null;
    public AccessibilityURLSpan(android.text.style.URLSpan p0) { super((java.lang.String)null); }
    public AccessibilityURLSpan(android.os.Parcel p0) { super((java.lang.String)null); }
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    public void onClick(android.view.View p0) {}
    public void copyConnectionDataFrom(android.view.accessibility.AccessibilityNodeInfo p0) {}
}
