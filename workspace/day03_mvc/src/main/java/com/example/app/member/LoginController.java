package com.example.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;

public class LoginController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		
		if(cookies == null) {return;}
		
		for(Cookie cookie : cookies) {
			String name = cookie.getName();
			
			if(name.equals("loginId")) {
				req.setAttribute("loginId", cookie.getValue());
			}
		}
	}
}
