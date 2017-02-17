package com.aasim.stormnow;

/**
 * Created by aasim on 17/02/17.
 */

public class Templates {
}


//This class contains copy - paste templates that will be required in our Project

/*

< ******************************************* >
HTTP GET

final String url = "http://httpbin.org/get?param1=hello";

// prepare the Request
JsonObjectRequest getRequest = new JsonObjectRequest(Request.Method.GET, url, null,
    new Response.Listener<JSONObject>()
    {
        @Override
        public void onResponse(JSONObject response) {
                        // display response
            Log.d("Response", response.toString());
        }
    },
    new Response.ErrorListener()
    {
         @Override
         public void onErrorResponse(VolleyError error) {
            Log.d("Error.Response", response);
       }
    }
);

// add it to the RequestQueue
RequestQueue queue = Volley.newRequestQueue(this);  // this = context
queue.add(getRequest);





< ******************************************* >
HTTP POST

url = "http://httpbin.org/post";
StringRequest postRequest = new StringRequest(Request.Method.POST, url,
    new Response.Listener<String>()
    {
        @Override
        public void onResponse(String response) {
            // response
            Log.d("Response", response);
        }
    },
    new Response.ErrorListener()
    {
         @Override
         public void onErrorResponse(VolleyError error) {
             // error
             Log.d("Error.Response", response);
       }
    }
) {
    @Override
    protected Map<String, String> getParams()
    {
            Map<String, String>  params = new HashMap<String, String>();
            params.put("name", "Alif");
            params.put("domain", "http://itsalif.info");

            return params;
    }
};
RequestQueue queue = Volley.newRequestQueue(this);  // this = context
queue.add(postRequest);

< ******************************************* >
Used For Storing all small values that are used in your entire app like settings,username,etc.

Shared Preference

STORING:
SharedPreferences prefs = getSharedPreferences(ApplicationConstants.PREFERENCES, Context.MODE_PRIVATE);
SharedPreferences.Editor editor = prefs.edit();
editor.putString(name, value);
editor.commit();

RETRIEVING:
mPrefs.getString(name, "");

< ******************************************* >


 */