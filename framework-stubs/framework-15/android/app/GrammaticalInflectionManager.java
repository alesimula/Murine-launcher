package android.app;

public class GrammaticalInflectionManager {
    @android.annotation.NonNull
    public static final java.util.Set<java.lang.Integer> VALID_GRAMMATICAL_GENDER_VALUES = null;
    public GrammaticalInflectionManager(android.content.Context p0, android.app.IGrammaticalInflectionManager p1) {}
    public int getApplicationGrammaticalGender() { return 0; }
    public void setRequestedApplicationGrammaticalGender(int p0) {}
    public void setSystemWideGrammaticalGender(int p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_SYSTEM_GRAMMATICAL_GENDER")
    @android.annotation.FlaggedApi("android.app.system_terms_of_address_enabled")
    public int getSystemGrammaticalGender() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_SYSTEM_GRAMMATICAL_GENDER")
    @android.annotation.FlaggedApi("android.app.system_terms_of_address_enabled")
    public int peekSystemGrammaticalGenderByUserId(int p0) { return 0; }
}
