package com.informatica.hiltdagger.data.routes

import com.google.gson.annotations.SerializedName

data class UserModel (

    @SerializedName("userId" ) var userId : Int?    = null,
    @SerializedName("id"     ) var id     : Int?    = null,
    @SerializedName("title"  ) var title  : String? = null,
    @SerializedName("body"   ) var body   : String? = null

)