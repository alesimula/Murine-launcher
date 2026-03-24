package android.content.pm;

public class AppSearchPerson extends android.app.appsearch.GenericDocument {
    public static final java.lang.String SCHEMA_TYPE = "Person";
    public static final java.lang.String KEY_NAME = "name";
    public static final java.lang.String KEY_KEY = "key";
    public static final java.lang.String KEY_IS_BOT = "isBot";
    public static final java.lang.String KEY_IS_IMPORTANT = "isImportant";
    public static final android.app.appsearch.AppSearchSchema SCHEMA = null;
    public AppSearchPerson(android.app.appsearch.GenericDocument p0) { super((android.os.Bundle)null); }
    public static android.content.pm.AppSearchPerson instance(android.app.Person p0) { return null; }
    public android.app.Person toPerson() { return null; }

    public static class Builder extends android.app.appsearch.GenericDocument.Builder<android.content.pm.AppSearchPerson.Builder> {
        public Builder(java.lang.String p0) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null); }
        public android.content.pm.AppSearchPerson.Builder setName(java.lang.CharSequence p0) { return null; }
        public android.content.pm.AppSearchPerson.Builder setKey(java.lang.String p0) { return null; }
        public android.content.pm.AppSearchPerson.Builder setIsBot(boolean p0) { return null; }
        public android.content.pm.AppSearchPerson.Builder setIsImportant(boolean p0) { return null; }
        public android.content.pm.AppSearchPerson build() { return null; }
    }
}
