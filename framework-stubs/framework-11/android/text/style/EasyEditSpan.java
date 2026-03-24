package android.text.style;

public class EasyEditSpan implements android.text.ParcelableSpan {
    public static final java.lang.String EXTRA_TEXT_CHANGED_TYPE = "android.text.style.EXTRA_TEXT_CHANGED_TYPE";
    public static final int TEXT_DELETED = 1;
    public static final int TEXT_MODIFIED = 2;
    private final android.app.PendingIntent mPendingIntent = null;
    private boolean mDeleteEnabled;
    public EasyEditSpan() {}
    public EasyEditSpan(android.app.PendingIntent p0) {}
    public EasyEditSpan(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
    public boolean isDeleteEnabled() { return false; }
    public void setDeleteEnabled(boolean p0) {}
    public android.app.PendingIntent getPendingIntent() { return null; }
}
