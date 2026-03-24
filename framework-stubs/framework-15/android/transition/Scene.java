package android.transition;

public final class Scene {
    java.lang.Runnable mEnterAction;
    java.lang.Runnable mExitAction;
    public static android.transition.Scene getSceneForLayout(android.view.ViewGroup p0, int p1, android.content.Context p2) { return null; }
    public Scene(android.view.ViewGroup p0) {}
    public Scene(android.view.ViewGroup p0, android.view.View p1) {}
    @java.lang.Deprecated
    public Scene(android.view.ViewGroup p0, android.view.ViewGroup p1) {}
    public android.view.ViewGroup getSceneRoot() { return null; }
    public void exit() {}
    public void enter() {}
    static void setCurrentScene(android.view.ViewGroup p0, android.transition.Scene p1) {}
    @android.annotation.Nullable
    public static android.transition.Scene getCurrentScene(android.view.ViewGroup p0) { return null; }
    public void setEnterAction(java.lang.Runnable p0) {}
    public void setExitAction(java.lang.Runnable p0) {}
    boolean isCreatedFromLayoutResource() { return false; }
}
