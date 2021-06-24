package com.devgd.apidata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private val movieList = ArrayList<ApiModelClass>()
    private lateinit var moviesAdapter: ApiAdapter
    private var requestQueue: RequestQueue? = null
    var textView:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        moviesAdapter = ApiAdapter(movieList)
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
            recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = moviesAdapter
       // prepareMovieData()
        textView=findViewById(R.id.errorMessage)
    }

//    private fun prepareMovieData() {
//        val url = "https://www.cryptingup.com/api/markets"
//        val queue = Volley.newRequestQueue(this)
//        val stringRequest = StringRequest(Request.Method.GET, url,
//                Response.Listener<String> { response ->
//                    // Display the first 500 characters of the response string.
//                   // Log.i("yyyy","Response is: ${response.substring(0, 500)}")
//                    val jsonObj=JSONObject(response)
//                    val jsonArray=jsonObj.getJSONArray("markets")
//                    for (i in 0 until jsonArray.length()) {
//                        Log.i("loop", movieList.size.toString())
//                        val jobject = jsonArray.getJSONObject(i)
//                        val title = jobject.getString("exchange_id")
//                        val title1 = jobject.getString("symbol")
//                        val title2 = jobject.getString("status")
//                        val title3 = jobject.getString("volume_24h")
//                        val title4 = jobject.getString("time")
//                        movieList.add(ApiModelClass(title,title1,title2,title3,title4))
//
//                    }
//                    Log.i("lenlisss", movieList.size.toString())
//
//                    moviesAdapter.notifyDataSetChanged()
//                },
//                Response.ErrorListener {
//
//                })
//
//        queue.add(stringRequest)
//
//    }
    }