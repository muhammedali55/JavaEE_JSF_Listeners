package com.muhammet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name="indexbean")
@SessionScoped
public class indexBean {

	private String actionS;
	private String actionListenerS;
	
	public void actionString() {
		actionS =  "Action işlemi sonuç method çağırma";
		System.out.println(actionS);
	}
	
	public void actinListenerString() {
		 actionListenerS = "Action Listner method çağırma";
		 System.out.println(actionListenerS);
	}

	public String getActionS() {
		return actionS;
	}

	public void setActionS(String actionS) {
		this.actionS = actionS;
	}

	public String getActionListenerS() {
		return actionListenerS;
	}

	public void setActionListenerS(String actionListenerS) {
		this.actionListenerS = actionListenerS;
	}
	
	
}
