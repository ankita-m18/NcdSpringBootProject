package com.ankita.ncd.entity;

public class Score {
	
	private int age;
	private int smoke;
	private int alcohol;
	private int waist;
	private int phy_act;
	private int fam_his;
	
	//private int total=0;
	//private String screening="";
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSmoke() {
		return smoke;
	}
	public void setSmoke(int smoke) {
		this.smoke = smoke;
	}
	public int getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(int alcohol) {
		this.alcohol = alcohol;
	}
	public int getWaist() {
		return waist;
	}
	public void setWaist(int waist) {
		this.waist = waist;
	}
	public int getPhy_act() {
		return phy_act;
	}
	public void setPhy_act(int phy_act) {
		this.phy_act = phy_act;
	}
	public int getFam_his() {
		return fam_his;
	}
	public void setFam_his(int fam_his) {
		this.fam_his = fam_his;
	}
	
//	public int totalScore()
//	{
//		total = age + smoke + alcohol + waist + phy_act + fam_his;
//		
//		return total;
//	}
//	
//	public String Screening()
//	{
//		if (total > 4)
//			screening ="yes";
//		if (total <= 4)
//			screening="no";
//		
//        return screening;
//	}
//	
}
