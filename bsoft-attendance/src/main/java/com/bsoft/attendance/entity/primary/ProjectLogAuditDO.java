package com.bsoft.attendance.entity.primary;

import javax.persistence.*;
import java.util.Date;

/**
 * 项目工程日志
 */
@Entity
@Table(name="bsoft_portal.pro_worklog")
public class ProjectLogAuditDO {
    private Integer id;
    private String auditter;
    private String nextAuditter;//下一步待审人
    private Date auditDate;
    private Integer auditFlag;
    private Integer refuse;
    private Integer auditType;
    private String remark;
    private String contractNo;
    private String submitter;
    private Integer workLogId;
    private Double verifyHours;//审核工时
    private Date lastestOperate;
    private String projectId;
    @Transient
    private Integer flag; //操作来源 5.门户   12.app

    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuditter() {
        return auditter;
    }

    public void setAuditter(String auditter) {
        this.auditter = auditter;
    }

    public String getNextAuditter() {
        return nextAuditter;
    }

    public void setNextAuditter(String nextAuditter) {
        this.nextAuditter = nextAuditter;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public Integer getAuditFlag() {
        return auditFlag;
    }

    public void setAuditFlag(Integer auditFlag) {
        this.auditFlag = auditFlag;
    }

    public Integer getRefuse() {
        return refuse;
    }

    public void setRefuse(Integer refuse) {
        this.refuse = refuse;
    }


    public Integer getAuditType() {
        return auditType;
    }

    public void setAuditType(Integer auditType) {
        this.auditType = auditType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Transient
    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public Integer getWorkLogId() {
        return workLogId;
    }

    public void setWorkLogId(Integer workLogId) {
        this.workLogId = workLogId;
    }

    public Double getVerifyHours() {
        return verifyHours;
    }

    public void setVerifyHours(Double verifyHours) {
        this.verifyHours = verifyHours;
    }

    public Date getLastestOperate() {
        return lastestOperate;
    }

    public void setLastestOperate(Date lastestOperate) {
        this.lastestOperate = lastestOperate;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
