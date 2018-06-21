package com.dy.myboot.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RegLoginController {
    @RequestMapping("/login_p")
    public void login(HttpServletResponse resp) throws IOException {
        Gson gson = new Gson();
        Map<String, Object> map = new HashMap<>();
        resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        resp.setContentType("application/json;charset=UTF-8");
        map.put("status", "error");
        map.put("msg", "尚未登录，请登录!");
        PrintWriter out = resp.getWriter();
        out.write(gson.toJson(map));
        out.flush();
        out.close();
    }
}
