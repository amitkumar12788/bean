package com.bdisys.survey.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="page_logic")
public class PageLogic extends BaseEntity{
	private Long id;
	private Page nextPage;

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LOGIC_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="NEXT_PAGE_ID")
	public Page getNextPage() {
		return nextPage;
	}
	public void setNextPage(Page nextPage) {
		this.nextPage = nextPage;
	}
	

}
