package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class OutsourceCompany {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	
	private long id;
	
	@Column
	
	private String companyName;
	
	@Column
	
	private String companyCif;
	
	
	@Column 
	
	private int budget;
		
	@ManyToOne
	@JoinColumn(name = "FK_buildingWork")
	private BuildingWork buildingWork;
	
	public BuildingWork getBuildingWork() {
		return buildingWork;
	}


	public void setBuildingWork(BuildingWork buildingWork) {
		this.buildingWork = buildingWork;
	}


	
	
	public OutsourceCompany() {
	}


	public OutsourceCompany(String companyName, String companyCif, int budget) {
		this.companyName = companyName;
		this.companyCif = companyCif;
		this.budget = budget;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCompanyCif() {
		return companyCif;
	}


	public void setCompanyCif(String companyCif) {
		this.companyCif = companyCif;
	}


	public int getBudget() {
		return budget;
	}


	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	
	
	

}
