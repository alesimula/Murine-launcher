package android.app.admin;

@android.annotation.SystemApi
public final class DevicePolicyState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.admin.DevicePolicyState> CREATOR = null;
    public DevicePolicyState(java.util.Map<android.os.UserHandle, java.util.Map<android.app.admin.PolicyKey, android.app.admin.PolicyState<?>>> p0) {}
    public java.util.Map<android.os.UserHandle, java.util.Map<android.app.admin.PolicyKey, android.app.admin.PolicyState<?>>> getPoliciesForAllUsers() { return null; }
    public java.util.Map<android.app.admin.PolicyKey, android.app.admin.PolicyState<?>> getPoliciesForUser(android.os.UserHandle p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
