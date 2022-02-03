package com.example.kriptoparauygulamasi.service

import com.example.kriptoparauygulamasi.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    // GET , POST , UPDATE , DELETE

   @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
   fun getData(): Call<List<CryptoModel>>

}