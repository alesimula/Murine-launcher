package android.app;

@java.lang.Deprecated
public abstract class FragmentContainer {
    public FragmentContainer() {}
    public abstract <T extends android.view.View> T onFindViewById(int p0);
    public abstract boolean onHasView();
    public android.app.Fragment instantiate(android.content.Context p0, java.lang.String p1, android.os.Bundle p2) { return null; }
}
