package com.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

@SuppressWarnings("serial")
public class GetCurrentDateTimeClass extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException {
		
		JspWriter out  = pageContext.getOut();
		try {
			out.write(" "+Calendar.getInstance().getTime());  //print date and time
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
		
	}

}
