package com.mela.uasapi.rest

import com.mela.uasapi.BuildConfig
import retrofit.http.GET
import com.mela.uasapi.model.RootDataModel
import rx.Observable
import java.util.*

interface ApiService {
    @GET("detil_jadwal?key=" + BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getJadwalKuliah(
    ): Observable<RootDataModel>

    @GET("detil_pribadi?key=" + BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getProfil(
    ): Observable<RootDataModel>
}