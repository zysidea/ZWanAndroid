package com.zysidea.zwanandroid.widget

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.zysidea.zwanandroid.model.response.HomeTabInfo

class HomeTabBar : LinearLayout {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )



    fun addHomeTab(homeTabInfo: HomeTabInfo?){
        if (homeTabInfo == null) {
            return
        }
        val index = childCount


    }

}