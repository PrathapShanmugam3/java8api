package com.oasys.helpdesk.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.oasys.helpdesk.conf.Trackable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler" })
@EqualsAndHashCode(callSuper=false)
@Table(name = "help_desk_ticket_sub_category")
public class SubCategory extends Trackable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1876912232063693652L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "code")
	private String code;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_help_desk_ticket_category_id"))
	private Category helpDeskTicketCategory;

	@Column(name = "sub_category_name")
	private String subCategoryName;

    @Column(name = "is_active") 
	private Boolean active;

}