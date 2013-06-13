/**
 * User.java
 */
package com.bdisys.survey.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Nimish
 *
 */
@Entity
@Table(name="user")
public class User extends BaseEntity implements Serializable {
	private Long id;
	private String firstName;
	private String lastName;
	private String password;
	private AccountType accountType;
	private UserStatus status;
	private String emailID;
	
	@Column(name="FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name="EMAIL_ID")
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	@Column(name="LAST_NAME")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Column(name="PASSWORD")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Enumerated(EnumType.STRING)
	@Column(name="ACCOUNT_TYPE")
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	@Enumerated(EnumType.STRING)
	@Column(name="USER_STATUS")
	public UserStatus getStatus() {
		return status;
	}
	public void setStatus(UserStatus status) {
		this.status = status;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User user =  (User)obj;
			if(user.getId().compareTo(this.getId()) == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return this.getId().hashCode();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
