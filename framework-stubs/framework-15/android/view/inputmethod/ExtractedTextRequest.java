package android.view.inputmethod;

public class ExtractedTextRequest implements android.os.Parcelable {
    public int token;
    public int flags;
    public int hintMaxLines;
    public int hintMaxChars;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.inputmethod.ExtractedTextRequest> CREATOR = null;
    public ExtractedTextRequest() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
