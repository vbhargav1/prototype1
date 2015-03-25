package com.gradstudyeval.actions;


import com.opensymphony.xwork2.ActionSupport;

public class noAction extends ActionSupport {
	
	public String execute() throws Exception{
		System.out.println("noAction executed");
				return SUCCESS;
	}

}
