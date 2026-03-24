package android.app;

public class TimePickerDialog extends android.app.AlertDialog implements android.content.DialogInterface.OnClickListener, android.widget.TimePicker.OnTimeChangedListener {
    public TimePickerDialog(android.content.Context p0, android.app.TimePickerDialog.OnTimeSetListener p1, int p2, int p3, boolean p4) { super((android.content.Context)null); }
    static int resolveDialogTheme(android.content.Context p0, int p1) { return 0; }
    public TimePickerDialog(android.content.Context p0, int p1, android.app.TimePickerDialog.OnTimeSetListener p2, int p3, int p4, boolean p5) { super((android.content.Context)null); }
    public android.widget.TimePicker getTimePicker() { return null; }
    public void onTimeChanged(android.widget.TimePicker p0, int p1, int p2) {}
    public void show() {}
    public void onClick(android.content.DialogInterface p0, int p1) {}
    public void updateTime(int p0, int p1) {}
    public android.os.Bundle onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Bundle p0) {}

    public static interface OnTimeSetListener {
        public void onTimeSet(android.widget.TimePicker p0, int p1, int p2);
    }
}
