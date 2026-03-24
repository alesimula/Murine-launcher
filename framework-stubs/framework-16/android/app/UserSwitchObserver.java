package android.app;

public class UserSwitchObserver extends android.app.IUserSwitchObserver.Stub {
    public UserSwitchObserver() { super(); }
    public void onBeforeUserSwitching(int p0, android.os.IRemoteCallback p1) throws android.os.RemoteException {}
    public void onUserSwitching(int p0, android.os.IRemoteCallback p1) throws android.os.RemoteException {}
    public void onUserSwitchComplete(int p0) throws android.os.RemoteException {}
    public void onForegroundProfileSwitch(int p0) throws android.os.RemoteException {}
    public void onLockedBootComplete(int p0) throws android.os.RemoteException {}
}
