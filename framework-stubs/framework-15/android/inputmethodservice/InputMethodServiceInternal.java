package android.inputmethodservice;

interface InputMethodServiceInternal {
    @android.annotation.NonNull
    public android.content.Context getContext();
    default public void exposeContent(android.view.inputmethod.InputContentInfo p0, android.view.inputmethod.InputConnection p1) {}
    default public void notifyUserActionIfNecessary() {}
    default public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    default public void triggerServiceDump(java.lang.String p0, byte[] p1) {}
    default public boolean isServiceDestroyed() { return false; }
}
