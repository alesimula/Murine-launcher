package android.preference;

@java.lang.Deprecated
class PreferenceInflater extends android.preference.GenericInflater<android.preference.Preference, android.preference.PreferenceGroup> {
    public PreferenceInflater(android.content.Context p0, android.preference.PreferenceManager p1) { super((android.content.Context)null); }
    PreferenceInflater(android.preference.GenericInflater<android.preference.Preference, android.preference.PreferenceGroup> p0, android.preference.PreferenceManager p1, android.content.Context p2) { super((android.content.Context)null); }
    public android.preference.GenericInflater<android.preference.Preference, android.preference.PreferenceGroup> cloneInContext(android.content.Context p0) { return null; }
    protected boolean onCreateCustomFromTag(org.xmlpull.v1.XmlPullParser p0, android.preference.Preference p1, android.util.AttributeSet p2) throws org.xmlpull.v1.XmlPullParserException { return false; }
    protected android.preference.PreferenceGroup onMergeRoots(android.preference.PreferenceGroup p0, boolean p1, android.preference.PreferenceGroup p2) { return null; }
}
