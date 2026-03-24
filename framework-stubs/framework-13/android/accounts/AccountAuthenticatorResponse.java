package android.accounts;

public class AccountAuthenticatorResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.accounts.AccountAuthenticatorResponse> CREATOR = null;
    public AccountAuthenticatorResponse(android.accounts.IAccountAuthenticatorResponse p0) {}
    public AccountAuthenticatorResponse(android.os.Parcel p0) {}
    public void onResult(android.os.Bundle p0) {}
    public void onRequestContinued() {}
    public void onError(int p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
