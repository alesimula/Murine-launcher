package android.companion.datatransfer;

public abstract class SystemDataTransferRequest {
    public static final int DATA_TYPE_PERMISSION_SYNC = 1;
    final int mAssociationId = 0;
    final int mDataType = 0;
    int mUserId;
    boolean mUserConsented;
    SystemDataTransferRequest(int p0, int p1) {}
    public int getAssociationId() { return 0; }
    public int getDataType() { return 0; }
    public int getUserId() { return 0; }
    public boolean isUserConsented() { return false; }
    public void setUserId(int p0) {}
    public void setUserConsented(boolean p0) {}
    SystemDataTransferRequest(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public abstract android.companion.datatransfer.SystemDataTransferRequest copyWithNewId(int p0);
}
