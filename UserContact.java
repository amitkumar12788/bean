/**
 * UserContact.java
 */
package com.bdisys.survey.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Nimish
 *
 */
@Entity
@Table(name="user_contact")
public class UserContact extends BaseEntity {
	private Long id;
	private String emailId;
	private String firstName;
	private String lastName;
	private ContactGroup contactGroup;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CONTACT_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="EMAIL_ID")
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Column(name="FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name="LAST_NAME")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@ManyToOne
	@JoinColumn(name="CONTACT_GROUP_ID")
	public ContactGroup getContactGroup() {
		return contactGroup;
	}
	public void setContactGroup(ContactGroup contactGroup) {
		this.contactGroup = contactGroup;
	}
	
}
