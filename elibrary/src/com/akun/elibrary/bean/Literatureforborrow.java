package com.akun.elibrary.bean;

//import java.util.Date;

public class Literatureforborrow extends LiteratureforborrowKey {
    //添加的属性start======================================================
    private String categoryname;
    private String literaturename;
    private Integer totalnum;
    private String borrowtime;
    private String expectedreturntime;
    private String sname;
    private String snumber;
    private String lindex;
    private Integer outnum;
    private Integer literatureid;
    private Integer categoryid;
    private Integer expired;//0表未超期限；1表超期限
    //添加的属性end======================================================
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column dbo.literatureForBorrow.num
	 * @ibatorgenerated  Thu Apr 05 15:26:19 CST 2012
	 */
	private Integer num;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column dbo.literatureForBorrow.returned
	 * @ibatorgenerated  Thu Apr 05 15:26:19 CST 2012
	 */
	private Short returned;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column dbo.literatureForBorrow.returnTime
	 * @ibatorgenerated  Thu Apr 05 15:26:19 CST 2012
	 */
	private String returntime;

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column dbo.literatureForBorrow.num
	 * @return  the value of dbo.literatureForBorrow.num
	 * @ibatorgenerated  Thu Apr 05 15:26:19 CST 2012
	 */
	public Integer getNum() {
		return num;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column dbo.literatureForBorrow.num
	 * @param num  the value for dbo.literatureForBorrow.num
	 * @ibatorgenerated  Thu Apr 05 15:26:19 CST 2012
	 */
	public void setNum(Integer num) {
		this.num = num;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column dbo.literatureForBorrow.returned
	 * @return  the value of dbo.literatureForBorrow.returned
	 * @ibatorgenerated  Thu Apr 05 15:26:19 CST 2012
	 */
	public Short getReturned() {
		return returned;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column dbo.literatureForBorrow.returned
	 * @param returned  the value for dbo.literatureForBorrow.returned
	 * @ibatorgenerated  Thu Apr 05 15:26:19 CST 2012
	 */
	public void setReturned(Short returned) {
		this.returned = returned;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column dbo.literatureForBorrow.returnTime
	 * @return  the value of dbo.literatureForBorrow.returnTime
	 * @ibatorgenerated  Thu Apr 05 15:26:19 CST 2012
	 */
	public String getReturntime() {
		return returntime;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column dbo.literatureForBorrow.returnTime
	 * @param returntime  the value for dbo.literatureForBorrow.returnTime
	 * @ibatorgenerated  Thu Apr 05 15:26:19 CST 2012
	 */
	public void setReturntime(String returntime) {
		this.returntime = returntime;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getLiteraturename() {
		return literaturename;
	}

	public void setLiteraturename(String literaturename) {
		this.literaturename = literaturename;
	}

	public int getTotalnum() {
		return totalnum;
	}

	public void setTotalnum(int totalnum) {
		this.totalnum = totalnum;
	}

	public String getBorrowtime() {
		return borrowtime;
	}

	public void setBorrowtime(String borrowtime) {
		this.borrowtime = borrowtime;
	}

	public String getExpectedreturntime() {
		return expectedreturntime;
	}

	public void setExpectedreturntime(String expectedreturntime) {
		this.expectedreturntime = expectedreturntime;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSnumber() {
		return snumber;
	}

	public void setSnumber(String snumber) {
		this.snumber = snumber;
	}

	public String getLindex() {
		return lindex;
	}

	public void setLindex(String lindex) {
		this.lindex = lindex;
	}

	public void setTotalnum(Integer totalnum) {
		this.totalnum = totalnum;
	}

	public Integer getOutnum() {
		return outnum;
	}

	public void setOutnum(Integer outnum) {
		this.outnum = outnum;
	}

	public Integer getLiteratureid() {
		return literatureid;
	}

	public void setLiteratureid(Integer literatureid) {
		this.literatureid = literatureid;
	}

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public int getExpired() {
		return expired;
	}

	public void setExpired(int expired) {
		this.expired = expired;
	}
    
	
	
}