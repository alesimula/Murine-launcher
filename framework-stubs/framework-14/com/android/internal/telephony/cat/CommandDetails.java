package com.android.internal.telephony.cat;

public class CommandDetails extends com.android.internal.telephony.cat.ValueObject implements android.os.Parcelable {
    public boolean compRequired;
    public int commandNumber;
    public int typeOfCommand;
    public int commandQualifier;
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.cat.CommandDetails> CREATOR = null;
    public com.android.internal.telephony.cat.ComprehensionTlvTag getTag() { return null; }
    CommandDetails() { super(); }
    public boolean compareTo(com.android.internal.telephony.cat.CommandDetails p0) { return false; }
    public CommandDetails(android.os.Parcel p0) { super(); }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
}
