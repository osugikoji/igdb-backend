package br.com.steam.config

import org.springframework.context.annotation.Scope
import org.springframework.context.i18n.LocaleContextHolder
import org.springframework.context.support.ReloadableResourceBundleMessageSource
import org.springframework.stereotype.Component

@Component
class Translator constructor(messageSource: ReloadableResourceBundleMessageSource) {

    init {
        Translator.messageSource = messageSource
    }

    companion object {

        var messageSource: ReloadableResourceBundleMessageSource? = null

        fun toLocale(msgCode: String): String {
            val locale = LocaleContextHolder.getLocale()
            return messageSource!!.getMessage(msgCode, null, locale)
        }
    }
}

