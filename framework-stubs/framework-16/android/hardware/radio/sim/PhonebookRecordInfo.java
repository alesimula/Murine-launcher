package android.hardware.radio.sim;

public class PhonebookRecordInfo implements android.os.Parcelable {
    public int recordId;
    public java.lang.String name;
    public java.lang.String number;
    public java.lang.String[] emails;
    public java.lang.String[] additionalNumbers;
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.PhonebookRecordInfo> CREATOR = null;
    public PhonebookRecordInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
