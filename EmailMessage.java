/**
 * EmailMessage.java
 */
package com.bdisys.survey.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Nimish
 *
 */
@Entity
@Table(name="email_message")
public class EmailMessage extends BaseEntity {
	private Long id;
	private String emailSubject;
	private String emailContent1;
	private EmailStatus emailStatus;
	private Date sentDate;
	private String cronString;
	private RecipientType recipientType;
	private List<Criteria> customCriterias = new ArrayList<Criteria>(0);
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MESSAGE_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="EMAIL_SUBJECT")
	public String getEmailSubject() {
		return emailSubject;
	}
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}
	@Lob
	@Column(name="EMAIL_CONTENT")
	public String getEmailContent() {
		return emailContent1;
	}
	public void setEmailContent(String emailContent1) {
		this.emailContent1 = emailContent1;
	}
	@Enumerated(EnumType.STRING)
	@Column(name="EMAIL_STATUS")
	public EmailStatus getEmailStatus() {
		return emailStatus;
	}
	public void setEmailStatus(EmailStatus emailStatus) {
		this.emailStatus = emailStatus;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="SENT_DATE")
	public Date getSentDate() {
		return sentDate;
	}
	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}
	@Column(name="CRON_STRING")
	public String getCronString() {
		return cronString;
	}
	public void setCronString(String cronString) {
		this.cronString = cronString;
	}
	@Enumerated(EnumType.STRING)
	@Column(name="RECIPIENT_TYPE")
	public RecipientType getRecipientType() {
		return recipientType;
	}
	public void setRecipientType(RecipientType recipientType) {
		this.recipientType = recipientType;
	}
	@OneToMany
	@JoinTable(name="email_message_criteria",joinColumns={@JoinColumn(name="MESSAGE_ID")},inverseJoinColumns={@JoinColumn(name="CRITERIA_ID")})
	public List<Criteria> getCustomCriterias() {
		return customCriterias;
	}
	public void setCustomCriterias(List<Criteria> customCriterias) {
		this.customCriterias = customCriterias;
	}
	
}
