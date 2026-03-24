package android.content.pm.dependencyinstaller;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.content.pm.sdk_dependency_installer")
public abstract class DependencyInstallerService extends android.app.Service {
    public DependencyInstallerService() { super(); }
    @android.annotation.NonNull
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onDependenciesRequired(java.util.List<android.content.pm.SharedLibraryInfo> p0, android.content.pm.dependencyinstaller.DependencyInstallerCallback p1);
}
