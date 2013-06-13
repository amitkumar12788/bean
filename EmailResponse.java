/**
 * EmailResponse.java
 */
package com.bdisys.survey.bean;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Nimish
 *
 */
@Entity
@Table(name="email_response")
public class EmailResponse extends Response {
	private Recipient recipient;
	@OneToOne
	@JoinColumn(name="RECIPIENT_ID")
	public Recipient getRecipient() {
		return recipient;
	}

	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}
}
