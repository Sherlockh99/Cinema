package com.sherlock.gb.kotlin.cinema.model.gson_decoder
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Poster (
	@SerializedName("_id") val _id : String,
	@SerializedName("url") val url : String,
	@SerializedName("previewUrl") val previewUrl : String
): Parcelable