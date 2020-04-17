package com.szxs.entity;


public class Membersinfo {

  private Integer mid;
  private String mname;
  private String mgender;
  private Integer mage;
  private String maddress;
  private String memail;


  public Integer getMid() {
    return mid;
  }

  public void setMid(Integer mid) {
    this.mid = mid;
  }

  public String getMname() {
    return mname;
  }

  public void setMname(String mname) {
    this.mname = mname;
  }

  public String getMgender() {
    return mgender;
  }

  public void setMgender(String mgender) {
    this.mgender = mgender;
  }

  public Integer getMage() {
    return mage;
  }

  public void setMage(Integer mage) {
    this.mage = mage;
  }

  public String getMaddress() {
    return maddress;
  }

  public void setMaddress(String maddress) {
    this.maddress = maddress;
  }

  public String getMemail() {
    return memail;
  }

  public void setMemail(String memail) {
    this.memail = memail;
  }

  @Override
  public String toString() {
    return "Membersinfo{" +
            "mid=" + mid +
            ", mname='" + mname + '\'' +
            ", mgender='" + mgender + '\'' +
            ", mage=" + mage +
            ", maddress='" + maddress + '\'' +
            ", memail='" + memail + '\'' +
            '}';
  }
}
