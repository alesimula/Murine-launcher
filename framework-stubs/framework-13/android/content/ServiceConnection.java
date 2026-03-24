package android.content;

public interface ServiceConnection {
    public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1);
    public void onServiceDisconnected(android.content.ComponentName p0);
    default public void onBindingDied(android.content.ComponentName p0) {}
    default public void onNullBinding(android.content.ComponentName p0) {}
}
