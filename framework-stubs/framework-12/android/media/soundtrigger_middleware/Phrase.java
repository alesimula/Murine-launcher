package android.media.soundtrigger_middleware;

public class Phrase implements android.os.Parcelable {
    public int id;
    public int recognitionModes;
    public int[] users;
    public java.lang.String locale;
    public java.lang.String text;
    public static final android.os.Parcelable.Creator<android.media.soundtrigger_middleware.Phrase> CREATOR = null;
    public Phrase() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
