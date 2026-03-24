package android.preference;

@java.lang.Deprecated
public class SwitchPreference extends android.preference.TwoStatePreference {
    public SwitchPreference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public SwitchPreference(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SwitchPreference(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SwitchPreference(android.content.Context p0) { super((android.content.Context)null); }
    protected void onBindView(android.view.View p0) {}
    public void setSwitchTextOn(java.lang.CharSequence p0) {}
    public void setSwitchTextOff(java.lang.CharSequence p0) {}
    public void setSwitchTextOn(int p0) {}
    public void setSwitchTextOff(int p0) {}
    public java.lang.CharSequence getSwitchTextOn() { return null; }
    public java.lang.CharSequence getSwitchTextOff() { return null; }

    private class Listener implements android.widget.CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(android.widget.CompoundButton p0, boolean p1) {}
    }
}
