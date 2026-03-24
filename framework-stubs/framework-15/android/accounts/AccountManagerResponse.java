package android.accounts;

public class AccountManagerResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.accounts.AccountManagerResponse> CREATOR = null;
    public AccountManagerResponse(android.accounts.IAccountManagerResponse p0) {}
    public AccountManagerResponse(android.os.Parcel p0) {}
    public void onResult(android.os.Bundle p0) {}
    public void onError(int p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
