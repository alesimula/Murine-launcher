package android.view.inputmethod;

public final class InputContentInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InputContentInfo> CREATOR = null;
    public InputContentInfo(android.net.Uri p0, android.content.ClipDescription p1) {}
    public InputContentInfo(android.net.Uri p0, android.content.ClipDescription p1, android.net.Uri p2) {}
    public boolean validate() { return false; }
    @android.annotation.NonNull
    public android.net.Uri getContentUri() { return null; }
    @android.annotation.NonNull
    public android.content.ClipDescription getDescription() { return null; }
    @android.annotation.Nullable
    public android.net.Uri getLinkUri() { return null; }
    public void setUriToken(com.android.internal.inputmethod.IInputContentUriToken p0) {}
    public void requestPermission() {}
    public void releasePermission() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
