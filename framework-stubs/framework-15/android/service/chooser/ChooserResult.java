package android.service.chooser;

@android.annotation.FlaggedApi("android.service.chooser.enable_chooser_result")
public final class ChooserResult implements android.os.Parcelable {
    public static final long SEND_CHOOSER_RESULT = 263474465L;
    public static final int CHOOSER_RESULT_UNKNOWN = -1;
    public static final int CHOOSER_RESULT_SELECTED_COMPONENT = 0;
    public static final int CHOOSER_RESULT_COPY = 1;
    public static final int CHOOSER_RESULT_EDIT = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.chooser.ChooserResult> CREATOR = null;
    public ChooserResult(int p0, android.content.ComponentName p1, boolean p2) {}
    public int getType() { return 0; }
    @android.annotation.Nullable
    public android.content.ComponentName getSelectedComponent() { return null; }
    public boolean isShortcut() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultType {
    }
}
