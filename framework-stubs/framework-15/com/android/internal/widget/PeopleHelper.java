package com.android.internal.widget;

public class PeopleHelper {
    public PeopleHelper() {}
    public void init(android.content.Context p0) {}
    public void animateViewForceHidden(com.android.internal.widget.CachingIconView p0, boolean p1) {}
    @android.annotation.NonNull
    public android.graphics.drawable.Icon createAvatarSymbol(java.lang.CharSequence p0, java.lang.String p1, int p2) { return null; }
    public java.lang.String findNamePrefix(java.lang.CharSequence p0, java.lang.String p1) { return null; }
    public java.lang.String findNameSplit(java.lang.CharSequence p0) { return null; }
    public java.util.Map<java.lang.CharSequence, java.lang.String> mapUniqueNamesToPrefix(java.util.List<com.android.internal.widget.MessagingGroup> p0) { return null; }
    public com.android.internal.widget.PeopleHelper.NameToPrefixMap mapUniqueNamesToPrefixWithGroupList(java.util.List<java.util.List<android.app.Notification.MessagingStyle.Message>> p0) { return null; }
    public void maybeHideFirstSenderName(java.util.List<com.android.internal.widget.MessagingGroup> p0, boolean p1, java.lang.CharSequence p2) {}

    public class NameToPrefixMap {
        java.util.Map<java.lang.String, java.lang.String> mMap;
        NameToPrefixMap(java.util.Map<java.lang.String, java.lang.String> p0) {}
        public java.lang.String getPrefix(java.lang.CharSequence p0) { return null; }
    }
}
