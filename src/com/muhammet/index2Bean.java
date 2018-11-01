package com.muhammet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="index2bean")
@SessionScoped
public class index2Bean {

	private int ilsecim; 
	
	private List<ilModel> illistesi = new ArrayList<>(Arrays.asList(
			new ilModel(1,"Adana"), new ilModel(6,"ankara"), new ilModel(34,"istanbul")
			));
	private List<ilceModels> ilcelistesi;
	

	public void ilcelisele() {
	
		System.out.println("Listener Çalıştı");
		
	}
	
	public int getIlsecim() {
		return ilsecim;
	}

	public void setIlsecim(int ilsecim) {
		this.ilsecim = ilsecim;
	}

	public List<ilModel> getIllistesi() {
		return illistesi;
	}
	public void setIllistesi(List<ilModel> illistesi) {
		this.illistesi = illistesi;
	}
	public List<ilceModels> getIlcelistesi() {
		System.out.println("Veriler Yüklendi");
		System.out.println("Seçilen il id si ....: "+ ilsecim);
		ilcelistesi = new ArrayList<>(Arrays.asList(
				new ilceModels(1,6,"bala"),new ilceModels(2,6,"yeni mahalle"), new ilceModels(3,6,"mamak"),
				new ilceModels(4,6,"altındağ"),new ilceModels(5,6,"keçiören"), new ilceModels(3,6,"sincan")		
				));
		return ilcelistesi;
	}
	public void setIlcelistesi(List<ilceModels> ilcelistesi) {
		this.ilcelistesi = ilcelistesi;
	}
	
	
	
}
