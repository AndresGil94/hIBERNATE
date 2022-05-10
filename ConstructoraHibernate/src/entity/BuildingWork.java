package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity
public class BuildingWork {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	
	private Long id;
	
	@Column
	
	private String Localitation;
	
	@Column 
	
	private int buildingId;
	
	@Column 
	
	private Date deadline;
	
	@OneToMany(cascade =CascadeType.ALL, mappedBy = "buildingWork")
	
	private Set<OutsourceCompany> oc = new HashSet<OutsourceCompany>();
	
	
	
	public Set<OutsourceCompany> getOc() {
		return oc;
	}

	public void setOc(Set<OutsourceCompany> oc) {
		this.oc = oc;
	}

	public BuildingWork() {
	}

	public BuildingWork(String localitation, int buildingId, Date deadline) {
		super();
		Localitation = localitation;
		this.buildingId = buildingId;
		this.deadline = deadline;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocalitation() {
		return Localitation;
	}

	public void setLocalitation(String localitation) {
		Localitation = localitation;
	}

	public int getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(int buildingId) {
		this.buildingId = buildingId;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	
	
	

}
