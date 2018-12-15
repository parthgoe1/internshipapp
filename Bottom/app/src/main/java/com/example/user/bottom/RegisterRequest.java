package com.example.user.bottom;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "https://restaurant.mybiller.io/gef/user/register";
    private Map<String, String> params;

    @Override
    public Map<String, String> getParams() {
        return params;
    }

    public RegisterRequest(String name, String phone_number, String password, String email,Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("phone_number", phone_number);
        params.put("email", email);
        params.put("password", password);
    }


}
