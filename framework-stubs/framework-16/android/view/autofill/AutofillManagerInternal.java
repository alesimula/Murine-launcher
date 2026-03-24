package android.view.autofill;

public abstract class AutofillManagerInternal {
    public AutofillManagerInternal() {}
    public abstract void onBackKeyPressed();
    @android.annotation.Nullable
    public abstract android.content.AutofillOptions getAutofillOptions(java.lang.String p0, long p1, int p2);
    public abstract boolean isAugmentedAutofillServiceForUser(int p0, int p1);
}
