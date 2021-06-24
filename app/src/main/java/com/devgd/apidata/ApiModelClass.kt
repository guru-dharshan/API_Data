package com.devgd.apidata

class ApiModelClass(title: String?, title1: String?, title2: String?,title3: String?,title4: String?) {
    private var title: String
    private  var title1: String
    private  var title2: String
    private  var title3: String
    private  var title4: String
    init {
        this.title = title!!
        this.title1=title1!!
        this.title2=title2!!
        this.title3=title3!!
        this.title4=title4!!
    }
    fun getTitle(): String? {
        return title
    }
    fun setTitle(name: String?) {
        title = name!!
    }

    fun getTitle1(): String? {
        return title1
    }
    fun setTitle1(name: String?) {
        title1 = name!!
    }

    fun getTitle2(): String? {
        return title2
    }
    fun setTitle2(name: String?) {
        title2 = name!!
    }

    fun getTitle3(): String? {
        return title3
    }
    fun setTitle3(name: String?) {
        title3 = name!!
    }

    fun getTitle4(): String? {
        return title4
    }
    fun setTitle4(name: String?) {
        title4 = name!!
    }
}