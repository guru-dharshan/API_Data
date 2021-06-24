package com.devgd.apidata

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class ApiViewModel(application: Application) : AndroidViewModel(application) {
    var lst = MutableLiveData<List<ApiModelClass>>()
    val list = ArrayList<ApiModelClass>()

    fun getUsers(): LiveData<List<ApiModelClass>> {
        val url = "https://www.cryptingup.com/api/markets"
        val queue = Volley.newRequestQueue(getApplication())
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            Response.Listener<String> { response ->
                // Display the first 500 characters of the response string.
                // Log.i("yyyy","Response is: ${response.substring(0, 500)}")
                val jsonObj= JSONObject(response)
                val jsonArray=jsonObj.getJSONArray("markets")
                for (i in 0 until jsonArray.length()) {

                    val jobject = jsonArray.getJSONObject(i)
                    val title = jobject.getString("exchange_id")
                    val title1 = jobject.getString("symbol")
                    val title2 = jobject.getString("status")
                    val title3 = jobject.getString("volume_24h")
                    val title4 = jobject.getString("time")
                    list.add(ApiModelClass(title,title1,title2,title3,title4))

                }
                lst.value=list
            },
            Response.ErrorListener {

            })

        queue.add(stringRequest)

        return lst
    }

}