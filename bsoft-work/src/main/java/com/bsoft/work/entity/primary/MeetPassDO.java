package com.bsoft.work.entity.primary;

import com.bsoft.work.key.MeetPassKey;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.util.Date;

@Entity
@IdClass(MeetPassKey.class)
@Table(name = "work_meet_pass_view")
public class MeetPassDO {
    private String personName;
    private String meetName;
    private String address;
    private Date startDate;
    private Date endDate;
    private String openId;
    private String mobileNo;
    private Integer validFlag;
    private Integer meetId;
    private String meetDate;
    private String subName;

    @Id
    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Id
    public Integer getMeetId() {
        return meetId;
    }

    public void setMeetId(Integer meetId) {
        this.meetId = meetId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getMeetName() {
        return meetName;
    }

    public void setMeetName(String meetName) {
        this.meetName = meetName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(Integer validFlag) {
        this.validFlag = validFlag;
    }

    public String getMeetDate() {
        return meetDate;
    }

    public void setMeetDate(String meetDate) {
        this.meetDate = meetDate;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }
}
