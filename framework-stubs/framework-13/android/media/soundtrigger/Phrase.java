package android.media.soundtrigger;

public class Phrase implements android.os.Parcelable {
    public int id;
    public int recognitionModes;
    public int[] users;
    public java.lang.String locale;
    public java.lang.String text;
    public static final android.os.Parcelable.Creator<android.media.soundtrigger.Phrase> CREATOR = null;
    public Phrase() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
