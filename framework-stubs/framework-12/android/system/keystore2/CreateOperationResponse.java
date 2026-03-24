package android.system.keystore2;

public class CreateOperationResponse implements android.os.Parcelable {
    public android.system.keystore2.IKeystoreOperation iOperation;
    public android.system.keystore2.OperationChallenge operationChallenge;
    public android.system.keystore2.KeyParameters parameters;
    public byte[] upgradedBlob;
    public static final android.os.Parcelable.Creator<android.system.keystore2.CreateOperationResponse> CREATOR = null;
    public CreateOperationResponse() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    private int describeContents(java.lang.Object p0) { return 0; }
}
