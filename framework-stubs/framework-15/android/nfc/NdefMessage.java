package android.nfc;

public final class NdefMessage implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nfc.NdefMessage> CREATOR = null;
    public NdefMessage(byte[] p0) throws android.nfc.FormatException {}
    public NdefMessage(android.nfc.NdefRecord p0, android.nfc.NdefRecord... p1) {}
    public NdefMessage(android.nfc.NdefRecord[] p0) {}
    public int describeContents() { return 0; }
    public int getByteArrayLength() { return 0; }
    public android.nfc.NdefRecord[] getRecords() { return null; }
    public byte[] toByteArray() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
