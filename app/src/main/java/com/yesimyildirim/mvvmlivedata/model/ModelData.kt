package com.yesimyildirim.mvvmlivedata.model


import com.google.gson.annotations.SerializedName

data class ModelData(

    @SerializedName("avatar_url")
    var avatarUrl: String,
    @SerializedName("description")
    var description: String,
    @SerializedName("events_url")
    var eventsUrl: String,
    @SerializedName("hooks_url")
    var hooksUrl: String,
    @SerializedName("id")
    var id: Int,
    @SerializedName("issues_url")
    var issuesUrl: String,
    @SerializedName("login")
    var login: String,
    @SerializedName("members_url")
    var membersUrl: String,
    @SerializedName("node_id")
    var nodeİd: String,
    @SerializedName("public_members_url")
    var publicMembersUrl: String,
    @SerializedName("repos_url")
    var reposUrl: String,
    @SerializedName("url")
    var url: String)
