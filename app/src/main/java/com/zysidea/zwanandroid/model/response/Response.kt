package com.zysidea.zwanandroid.model.response

open class Response<T>(var code: Int,var msg :String, var data: T) {
}