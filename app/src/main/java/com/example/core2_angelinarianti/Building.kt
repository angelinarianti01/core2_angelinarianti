package com.example.core2_angelinarianti

import android.os.Parcel
import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import java.util.*

@VersionedParcelize
data class Building(val name: String?,
                    val location: String?,
                    var ratings: Int = 0,
                    var date: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(location)
        parcel.writeInt(ratings)
        parcel.writeString(date)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Building> {
        override fun createFromParcel(parcel: Parcel): Building {
            return Building(parcel)
        }

        override fun newArray(size: Int): Array<Building?> {
            return arrayOfNulls(size)
        }
    }
}