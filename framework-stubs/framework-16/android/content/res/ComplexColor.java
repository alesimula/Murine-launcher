package android.content.res;

public abstract class ComplexColor {
    public ComplexColor() {}
    public boolean isStateful() { return false; }
    public abstract int getDefaultColor();
    public abstract android.content.res.ConstantState<android.content.res.ComplexColor> getConstantState();
    public abstract boolean canApplyTheme();
    public abstract android.content.res.ComplexColor obtainForTheme(android.content.res.Resources.Theme p0);
    final void setBaseChangingConfigurations(int p0) {}
    public int getChangingConfigurations() { return 0; }
}
