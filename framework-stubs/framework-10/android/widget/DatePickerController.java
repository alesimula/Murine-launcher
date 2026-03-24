package android.widget;

interface DatePickerController {
    public void onYearSelected(int p0);
    public void registerOnDateChangedListener(android.widget.OnDateChangedListener p0);
    public java.util.Calendar getSelectedDay();
    public void tryVibrate();
}
