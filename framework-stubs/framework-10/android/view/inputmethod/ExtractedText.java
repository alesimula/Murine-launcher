package android.view.inputmethod;

public class ExtractedText implements android.os.Parcelable {
    public java.lang.CharSequence text;
    public int startOffset;
    public int partialStartOffset;
    public int partialEndOffset;
    public int selectionStart;
    public int selectionEnd;
    public static final int FLAG_SINGLE_LINE = 1;
    public static final int FLAG_SELECTING = 2;
    public int flags;
    public java.lang.CharSequence hint;
    public static final android.os.Parcelable.Creator<android.view.inputmethod.ExtractedText> CREATOR = null;
    public ExtractedText() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
