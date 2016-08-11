package tech.thdev.webviewjavascriptinterface.view.main.presenter

import tech.thdev.kotlin_example_01.base.presenter.BasePresenter
import tech.thdev.kotlin_example_01.base.presenter.BaseView
import tech.thdev.webviewjavascriptinterface.webkit.listener.OnCustomJavaScriptListener

/**
 * Created by Tae-hwan on 8/11/16.
 */
interface KotlinContract {

    interface View : BaseView<Presenter> {

        /**
         * WebView keyword event
         */
        fun updateKeyword(keyword: String?)
    }

    interface Presenter : BasePresenter<View>, OnCustomJavaScriptListener {

        fun getOnCustomJavaScriptListener(): OnCustomJavaScriptListener?
    }
}