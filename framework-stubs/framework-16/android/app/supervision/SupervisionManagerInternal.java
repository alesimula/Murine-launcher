package android.app.supervision;

public abstract class SupervisionManagerInternal {
    public SupervisionManagerInternal() {}
    public abstract boolean isActiveSupervisionApp(int p0);
    public abstract boolean isSupervisionEnabledForUser(int p0);
    public abstract boolean isSupervisionLockscreenEnabledForUser(int p0);
    public abstract void setSupervisionEnabledForUser(int p0, boolean p1);
    public abstract void setSupervisionLockscreenEnabledForUser(int p0, boolean p1, android.os.PersistableBundle p2);
}
