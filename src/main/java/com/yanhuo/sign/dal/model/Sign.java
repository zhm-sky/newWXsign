package com.yanhuo.sign.dal.model;

import java.io.Serializable;
import java.util.Date;

public class Sign implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign.sign_id
     *
     * @mbggenerated
     */
    private Long signId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign.begin_sign_time
     *
     * @mbggenerated
     */
    private Date beginSignTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign.s_id
     *
     * @mbggenerated
     */
    private Long sId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign.c_name
     *
     * @mbggenerated
     */
    private String cName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign.c_location
     *
     * @mbggenerated
     */
    private String cLocation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign.is_sign
     *
     * @mbggenerated
     */
    private Boolean isSign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign.sign_time
     *
     * @mbggenerated
     */
    private Date signTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign.t_name
     *
     * @mbggenerated
     */
    private String tName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign.t_id
     *
     * @mbggenerated
     */
    private Integer tId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign.sign_num
     *
     * @mbggenerated
     */
    private Integer signNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sign
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign.sign_id
     *
     * @return the value of sign.sign_id
     *
     * @mbggenerated
     */
    public Long getSignId() {
        return signId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign.sign_id
     *
     * @param signId the value for sign.sign_id
     *
     * @mbggenerated
     */
    public void setSignId(Long signId) {
        this.signId = signId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign.begin_sign_time
     *
     * @return the value of sign.begin_sign_time
     *
     * @mbggenerated
     */
    public Date getBeginSignTime() {
        return beginSignTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign.begin_sign_time
     *
     * @param beginSignTime the value for sign.begin_sign_time
     *
     * @mbggenerated
     */
    public void setBeginSignTime(Date beginSignTime) {
        this.beginSignTime = beginSignTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign.s_id
     *
     * @return the value of sign.s_id
     *
     * @mbggenerated
     */
    public Long getsId() {
        return sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign.s_id
     *
     * @param sId the value for sign.s_id
     *
     * @mbggenerated
     */
    public void setsId(Long sId) {
        this.sId = sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign.c_name
     *
     * @return the value of sign.c_name
     *
     * @mbggenerated
     */
    public String getcName() {
        return cName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign.c_name
     *
     * @param cName the value for sign.c_name
     *
     * @mbggenerated
     */
    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign.c_location
     *
     * @return the value of sign.c_location
     *
     * @mbggenerated
     */
    public String getcLocation() {
        return cLocation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign.c_location
     *
     * @param cLocation the value for sign.c_location
     *
     * @mbggenerated
     */
    public void setcLocation(String cLocation) {
        this.cLocation = cLocation == null ? null : cLocation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign.is_sign
     *
     * @return the value of sign.is_sign
     *
     * @mbggenerated
     */
    public Boolean getIsSign() {
        return isSign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign.is_sign
     *
     * @param isSign the value for sign.is_sign
     *
     * @mbggenerated
     */
    public void setIsSign(Boolean isSign) {
        this.isSign = isSign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign.sign_time
     *
     * @return the value of sign.sign_time
     *
     * @mbggenerated
     */
    public Date getSignTime() {
        return signTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign.sign_time
     *
     * @param signTime the value for sign.sign_time
     *
     * @mbggenerated
     */
    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign.t_name
     *
     * @return the value of sign.t_name
     *
     * @mbggenerated
     */
    public String gettName() {
        return tName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign.t_name
     *
     * @param tName the value for sign.t_name
     *
     * @mbggenerated
     */
    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign.t_id
     *
     * @return the value of sign.t_id
     *
     * @mbggenerated
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign.t_id
     *
     * @param tId the value for sign.t_id
     *
     * @mbggenerated
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign.sign_num
     *
     * @return the value of sign.sign_num
     *
     * @mbggenerated
     */
    public Integer getSignNum() {
        return signNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign.sign_num
     *
     * @param signNum the value for sign.sign_num
     *
     * @mbggenerated
     */
    public void setSignNum(Integer signNum) {
        this.signNum = signNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", signId=").append(signId);
        sb.append(", beginSignTime=").append(beginSignTime);
        sb.append(", sId=").append(sId);
        sb.append(", cName=").append(cName);
        sb.append(", cLocation=").append(cLocation);
        sb.append(", isSign=").append(isSign);
        sb.append(", signTime=").append(signTime);
        sb.append(", tName=").append(tName);
        sb.append(", tId=").append(tId);
        sb.append(", signNum=").append(signNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}