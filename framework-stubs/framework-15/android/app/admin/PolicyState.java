package android.app.admin;

@android.annotation.SystemApi
public final class PolicyState<V extends java.lang.Object> implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.admin.PolicyState<?>> CREATOR = null;
    public PolicyState(java.util.LinkedHashMap<android.app.admin.EnforcingAdmin, android.app.admin.PolicyValue<V>> p0, android.app.admin.PolicyValue<V> p1, android.app.admin.ResolutionMechanism<V> p2) {}
    @android.annotation.NonNull
    public java.util.LinkedHashMap<android.app.admin.EnforcingAdmin, V> getPoliciesSetByAdmins() { return null; }
    @android.annotation.Nullable
    public V getCurrentResolvedPolicy() { return null; }
    @android.annotation.NonNull
    public android.app.admin.ResolutionMechanism<V> getResolutionMechanism() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
