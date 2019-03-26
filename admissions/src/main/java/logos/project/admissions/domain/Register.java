package logos.project.admissions.domain;

import java.sql.Date;

public class Register {
	private Integer id;
	private Integer student_id;
	private Integer faculty_id;
	private Date date;
	private Boolean accepted;

	public Register() {
	}

	

	public Register(Integer id, Integer student_id, Integer faculty_id, Date date, Boolean accepted ) {
		this.id = id;
		this.student_id = student_id;
		this.faculty_id = faculty_id;
		this.date = date;
		this.accepted = accepted;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getStudent_id() {
		return student_id;
	}



	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}



	public Integer getFaculty_id() {
		return faculty_id;
	}



	public void setFaculty_id(Integer faculty_id) {
		this.faculty_id = faculty_id;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public Boolean getAccepted() {
		return accepted;
	}



	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accepted == null) ? 0 : accepted.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((faculty_id == null) ? 0 : faculty_id.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((student_id == null) ? 0 : student_id.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Register other = (Register) obj;
		if (accepted == null) {
			if (other.accepted != null)
				return false;
		} else if (!accepted.equals(other.accepted))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (faculty_id == null) {
			if (other.faculty_id != null)
				return false;
		} else if (!faculty_id.equals(other.faculty_id))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (student_id == null) {
			if (other.student_id != null)
				return false;
		} else if (!student_id.equals(other.student_id))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Register [id=" + id + ", student_id=" + student_id + ", faculty_id=" + faculty_id + ", date=" + date
				+ ", accepted=" + accepted + "]";
	}

	
	
}
