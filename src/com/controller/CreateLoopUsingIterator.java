package com.controller;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

@SuppressWarnings("serial")
public class CreateLoopUsingIterator extends TagSupport
{
	private int limit;

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public int doStartTag() throws JspException {
		return EVAL_BODY_INCLUDE;                        
	}
	
	@Override                                               //  we can We can iterate the body content of any tag using   
	public int doAfterBody() throws JspException {          //  the doAfterBody() method of IterationTag interface.
		
		if(limit>1){
			limit--;
			return EVAL_BODY_AGAIN;
		}else
			return SKIP_BODY;

	}
}
