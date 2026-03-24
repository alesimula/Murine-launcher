package android.nfc;

@android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
public final class T4tNdefNfceeCcFileInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nfc.T4tNdefNfceeCcFileInfo> CREATOR = null;
    public static final int VERSION_2_0 = 32;
    public static final int VERSION_3_0 = 48;
    T4tNdefNfceeCcFileInfo() {}
    public int describeContents() { return 0; }
    public int getCcFileLength() { return 0; }
    public int getFileId() { return 0; }
    public int getMaxSize() { return 0; }
    public int getVersion() { return 0; }
    public boolean isReadAllowed() { return false; }
    public boolean isWriteAllowed() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
