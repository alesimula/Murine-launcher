package android.content.pm.dependencyinstaller;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.content.pm.sdk_dependency_installer")
public final class DependencyInstallerCallback implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.dependencyinstaller.DependencyInstallerCallback> CREATOR = null;
    public DependencyInstallerCallback(android.os.IBinder p0) {}
    public void onAllDependenciesResolved(int[] p0) {}
    public void onFailureToResolveAllDependencies() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
