package android.app.servertransaction;

public class PendingTransactionActions {
    public PendingTransactionActions() {}
    public void clear() {}
    public boolean shouldRestoreInstanceState() { return false; }
    public void setRestoreInstanceState(boolean p0) {}
    public boolean shouldCallOnPostCreate() { return false; }
    public void setCallOnPostCreate(boolean p0) {}
    public android.os.Bundle getOldState() { return null; }
    public void setOldState(android.os.Bundle p0) {}
    public android.app.servertransaction.PendingTransactionActions.StopInfo getStopInfo() { return null; }
    public void setStopInfo(android.app.servertransaction.PendingTransactionActions.StopInfo p0) {}

    public static class StopInfo implements java.lang.Runnable {
        public StopInfo() {}
        public void setActivity(android.app.ActivityThread.ActivityClientRecord p0) {}
        public void setState(android.os.Bundle p0) {}
        public void setPersistentState(android.os.PersistableBundle p0) {}
        public void setDescription(java.lang.CharSequence p0) {}
        public void run() {}
    }
}
