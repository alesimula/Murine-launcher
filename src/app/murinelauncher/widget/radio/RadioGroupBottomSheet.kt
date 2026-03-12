package app.murinelauncher.widget.radio

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Configuration
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.graphics.ColorUtils
import androidx.preference.PreferenceViewHolder
import com.android.launcher3.R
import com.android.settingslib.widget.SelectorWithWidgetPreference
import com.android.settingslib.widget.SettingsBasePreferenceFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.shape.MaterialShapeDrawable

class RadioGroupBottomSheet : BottomSheetDialogFragment() {

    fun interface OnItemSelectedListener {
        fun onItemSelected(index: Int)
    }

    enum class IconPosition { START, END }

    private var listener: OnItemSelectedListener? = null
    private var sheetTitle: CharSequence? = null
    private var entryCount: Int = 0
    private var iconPosition: IconPosition = IconPosition.START
    private var currentIndex: Int = -1
    private var textProvider: ((Int) -> CharSequence)? = null
    private var iconProvider: ((Int) -> Drawable?)? = null
    private var sheetIconTint: Int? = null

    fun configure(
        title: CharSequence?,
        entryCount: Int,
        iconPosition: IconPosition,
        currentIndex: Int,
        textProvider: (Int) -> CharSequence,
        iconProvider: ((Int) -> Drawable?)?,
        iconTint: Int? = null,
        listener: OnItemSelectedListener
    ) {
        this.sheetTitle = title
        this.entryCount = entryCount
        this.iconPosition = iconPosition
        this.currentIndex = currentIndex
        this.textProvider = textProvider
        this.iconProvider = iconProvider
        this.sheetIconTint = iconTint
        this.listener = listener
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.radio_group_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.sheet_title)?.text = sheetTitle ?: ""
        dialog?.setOnShowListener {
            val bottomSheet = dialog?.findViewById<View>(
                com.google.android.material.R.id.design_bottom_sheet
            ) ?: return@setOnShowListener
            val background = bottomSheet.background as? MaterialShapeDrawable
                ?: return@setOnShowListener
            val isDarkTheme = (bottomSheet.resources.configuration.uiMode and
                    Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
            val tintColor = adjustDialogColor(background.resolvedTintColor, isDarkTheme)
            background.tintList = ColorStateList(arrayOf(intArrayOf()), intArrayOf(tintColor))
        }
        if (savedInstanceState == null && textProvider != null) {
            childFragmentManager.beginTransaction()
                .replace(R.id.prefs_container, RadioPreferenceFragment())
                .commit()
        }
    }

    /**
     * Makes very dark (e.g. AMOLED) dialog background colors ligher to increase visibility.
     * Makes very light (e.g. pure white) dialog background colors darker to increase visibility.
     */
    private fun adjustDialogColor(color: Int, isDarkTheme: Boolean): Int {
        val hsl = FloatArray(3)
        ColorUtils.colorToHSL(color, hsl)
        val currentLightness = hsl[2]
        val maxShift = 0.05f
        val power = 20.0
        if (isDarkTheme) {
            val factor = Math.pow((1.0f - currentLightness).toDouble(), power).toFloat()
            hsl[2] = Math.min(1.0f, currentLightness + (maxShift * factor))
        } else {
            val factor = Math.pow(currentLightness.toDouble(), power).toFloat()
            hsl[2] = Math.max(0.0f, currentLightness - (maxShift * factor))
        }
        return ColorUtils.HSLToColor(hsl)
    }

    class RadioPreferenceFragment : SettingsBasePreferenceFragment(),
        SelectorWithWidgetPreference.OnClickListener {

        private val parentSheet get() = parentFragment as? RadioGroupBottomSheet

        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            val sheet = parentSheet ?: return
            val ctx = requireContext()
            val screen = preferenceManager.createPreferenceScreen(ctx)
            val textProv = sheet.textProvider ?: return
            val iconProv = sheet.iconProvider
            for (i in 0 until sheet.entryCount) {
                val icon = iconProv?.invoke(i)
                if (icon != null && sheet.sheetIconTint != null) {
                    icon.colorFilter = PorterDuffColorFilter(sheet.sheetIconTint!!, PorterDuff.Mode.SRC_IN)
                }
                screen.addPreference(
                    createEntryPref(ctx, i, textProv(i), icon,
                        i == sheet.currentIndex, sheet.iconPosition)
                )
            }
            preferenceScreen = screen
        }

        private fun createEntryPref(
            ctx: Context,
            index: Int,
            text: CharSequence,
            icon: Drawable?,
            isChecked: Boolean,
            iconPosition: IconPosition
        ): RadioItemPreference {
            val pref = RadioItemPreference(ctx, iconPosition)
            pref.key = "$PREF_PREFIX$index"
            pref.title = text
            pref.isChecked = isChecked
            if (icon != null) {
                pref.entryIcon = icon
            }
            pref.setOnClickListener(this)
            return pref
        }

        override fun onRadioButtonClicked(emitter: SelectorWithWidgetPreference) {
            for (i in 0 until preferenceScreen.preferenceCount)
                (preferenceScreen.getPreference(i) as? SelectorWithWidgetPreference)?.isChecked =
                    false
            emitter.isChecked = true

            val index = emitter.key.removePrefix(PREF_PREFIX).toIntOrNull() ?: return
            parentSheet?.let {
                it.listener?.onItemSelected(index)
                it.dismiss()
            }
        }
    }

    class RadioItemPreference(
        context: Context,
        private val iconPosition: IconPosition = IconPosition.START
    ) : SelectorWithWidgetPreference(context) {
        var entryIcon: Drawable? = null
            set(value) {
                field = value
                icon = value
            }

        init {
            isPersistent = false
            isIconSpaceReserved = true
        }

        override fun onBindViewHolder(holder: PreferenceViewHolder) {
            super.onBindViewHolder(holder)
            if (iconPosition == IconPosition.END) {
                val iconFrame =
                    holder.findViewById(com.android.settingslib.widget.theme.R.id.icon_frame)
                        ?: holder.findViewById(android.R.id.icon_frame)
                if (iconFrame != null) {
                    val parent = iconFrame.parent as? ViewGroup
                    if (parent != null) {
                        val idx = parent.indexOfChild(iconFrame)
                        val textIdx = parent.childCount - 2
                        if (idx >= 0 && idx < textIdx) {
                            parent.removeView(iconFrame)
                            parent.addView(iconFrame, textIdx)
                        }
                    }
                }
            }
        }
    }

    companion object {
        const val TAG = "RadioGroupBottomSheet"
        const val PREF_PREFIX = "radio_item_"
    }
}
