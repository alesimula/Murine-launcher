package android.hardware.biometrics.face;

public class Cell implements android.os.Parcelable {
    public int x;
    public int y;
    public int z;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.face.Cell> CREATOR = null;
    public Cell() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
