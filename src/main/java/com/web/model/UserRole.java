package com.web.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user_role")
public class UserRole {
	private Integer userRoleSeq;
    private int companyMstrSeq;
    private String userRoleCd;
    private String userRoleDesc;
    private char status;
    private int createdBy;
    private Date createdDttm;
    private Integer updatedBy;
    private Date updateDttm;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ROLE_SEQ", unique = true, nullable = false)
    public Integer getUserRoleSeq() {
        return this.userRoleSeq;
    }

    public void setUserRoleSeq(Integer userRoleSeq) {
        this.userRoleSeq = userRoleSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public int getCompanyMstrSeq() {
        return this.companyMstrSeq;
    }

    public void setCompanyMstrSeq(int companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "USER_ROLE_CD", nullable = false, length = 20)
    public String getUserRoleCd() {
        return this.userRoleCd;
    }

    public void setUserRoleCd(String userRoleCd) {
        this.userRoleCd = userRoleCd;
    }

    @Column(name = "USER_ROLE_DESC", length = 100)
    public String getUserRoleDesc() {
        return this.userRoleDesc;
    }

    public void setUserRoleDesc(String userRoleDesc) {
        this.userRoleDesc = userRoleDesc;
    }

    @Column(name = "STATUS", nullable = false, length = 1)
    public char getStatus() {
        return this.status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Column(name = "CREATED_BY", nullable = false)
    public int getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DTTM", nullable = false, length = 19)
    public Date getCreatedDttm() {
		return createdDttm;
	}

	public void setCreatedDttm(Date createdDttm) {
		this.createdDttm = createdDttm;
	}

    @Column(name = "UPDATED_BY")
    public Integer getUpdatedBy() {
        return this.updatedBy;
    }

    

	public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DTTM", length = 19)
    public Date getUpdateDttm() {
        return this.updateDttm;
    }

    public void setUpdateDttm(Date updateDttm) {
        this.updateDttm = updateDttm;
    }

	@Override
	public String toString() {
		return "UserRole [userRoleSeq=" + userRoleSeq + ", companyMstrSeq=" + companyMstrSeq + ", userRoleCd="
				+ userRoleCd + ", userRoleDesc=" + userRoleDesc + ", status=" + status + ", createdBy=" + createdBy
				+ ", createdDttm=" + createdDttm + ", updatedBy=" + updatedBy + ", updateDttm=" + updateDttm + "]";
	}
    
    

}
