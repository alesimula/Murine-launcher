package android.text.method;

public class CharacterPickerDialog extends android.app.Dialog implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener {
    public CharacterPickerDialog(android.content.Context p0, android.view.View p1, android.text.Editable p2, java.lang.String p3, boolean p4) { super((android.content.Context)null); }
    protected void onCreate(android.os.Bundle p0) {}
    public void onItemClick(android.widget.AdapterView p0, android.view.View p1, int p2, long p3) {}
    public void onClick(android.view.View p0) {}

    private class OptionsAdapter extends android.widget.BaseAdapter {
        public OptionsAdapter(android.text.method.CharacterPickerDialog p0, android.content.Context p1) { super(); }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public final int getCount() { return 0; }
        public final java.lang.Object getItem(int p0) { return null; }
        public final long getItemId(int p0) { return 0L; }
    }
}
