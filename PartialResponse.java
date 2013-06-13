package com.bdisys.survey.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;


@Entity
@Table(name="partial_response")
public class PartialResponse extends BaseEntity{
	
	private Long id;
	String collectorRecipientkey;
	private String xmlData;
	private Response response;
	private Page page;//Actually this is the last page id.
	private List<Long> pageids=new ArrayList<Long>(0);
	private Long PAGEID;
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="PARTIAL_RESPONSE_ID")
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

@Lob
@Column(name="XML_DATA")
	public String getXmlData() {
		return xmlData;
	}

	public void setXmlData(String xmlData) {
		this.xmlData = xmlData;
	}

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="RESPONSE_ID")
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}

	
	
	@Column(name="COLLECTOR_RECIPIENT_KEY")
	public String getCollectorRecipientkey() {
		return collectorRecipientkey;
	}
	public void setCollectorRecipientkey(String collectorRecipientkey) {
		this.collectorRecipientkey = collectorRecipientkey;
	}
	@ManyToOne
	@JoinColumn(name="PAGE_ID")
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	@org.hibernate.annotations.CollectionOfElements(
		    targetElement = java.lang.Long.class
		)

	@JoinTable(name="partialresponse_pages",joinColumns=@JoinColumn(name="PARTIAL_RESPONSE_ID"))
	@IndexColumn(name="ORDER_NUMBER",base=1)
	@Column(name="PAGGEID",nullable=false)
	public List<Long> getPageids() {
		return pageids;
	}
	public void setPageids(List<Long> pageids) {
		this.pageids = pageids;
	}

	
	

}
