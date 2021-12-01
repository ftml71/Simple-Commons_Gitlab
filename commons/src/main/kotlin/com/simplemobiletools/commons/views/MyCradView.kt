package com.simplemobiletools.commons.views

import android.content.Context
import android.util.AttributeSet
import android.widget.EditText
import androidx.cardview.widget.CardView
import com.simplemobiletools.commons.extensions.adjustAlpha
import com.simplemobiletools.commons.extensions.applyColorFilter
import com.simplemobiletools.commons.helpers.MEDIUM_ALPHA

class MyCradView : CardView {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    fun setColors( backgroundColor: Int) {
//        background?.setTint(textColor)
        setCardBackgroundColor(backgroundColor)
        setRadius(100f)
        setPadding(55, 55, 55, 55)
                // requires android:textCursorDrawable="@null" in xml to color the cursor too
    }






}
