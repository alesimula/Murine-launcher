package android.hardware.radio.sim;

public class PhonebookCapacity implements android.os.Parcelable {
    public int maxAdnRecords;
    public int usedAdnRecords;
    public int maxEmailRecords;
    public int usedEmailRecords;
    public int maxAdditionalNumberRecords;
    public int usedAdditionalNumberRecords;
    public int maxNameLen;
    public int maxNumberLen;
    public int maxEmailLen;
    public int maxAdditionalNumberLen;
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.PhonebookCapacity> CREATOR = null;
    public PhonebookCapacity() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
