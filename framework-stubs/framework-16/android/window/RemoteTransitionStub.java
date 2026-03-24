package android.window;

public abstract class RemoteTransitionStub extends android.window.IRemoteTransition.Stub {
    public RemoteTransitionStub() { super(); }
    public void mergeAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.os.IBinder p3, android.window.IRemoteTransitionFinishedCallback p4) throws android.os.RemoteException {}
    public void takeOverAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.window.IRemoteTransitionFinishedCallback p3, android.window.WindowAnimationState[] p4) throws android.os.RemoteException {}
    public void onTransitionConsumed(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
}
