package logos.project.admissions.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "register")

public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private Integer student_id;
	@Column
	private Integer english_score;
	@Column
	private Integer math_score;
	@Column
	private Integer history_score;
	@Column
	private Integer sum_score;

	

	public Integer getSum_score() {
		return sum_score;
	}



	public void setSum_score(Integer sum_score) {
		this.sum_score = sum_score;
	}



	public Register() {
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



	public Integer getEnglish_score() {
		return english_score;
	}



	public void setEnglish_score(Integer english_score) {
		this.english_score = english_score;
	}



	public Integer getMath_score() {
		return math_score;
	}



	public void setMath_score(Integer math_score) {
		this.math_score = math_score;
	}



	public Integer getHistory_score() {
		return history_score;
	}



	public void setHistory_score(Integer history_score) {
		this.history_score = history_score;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((english_score == null) ? 0 : english_score.hashCode());
		result = prime * result + ((history_score == null) ? 0 : history_score.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((math_score == null) ? 0 : math_score.hashCode());
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
		if (english_score == null) {
			if (other.english_score != null)
				return false;
		} else if (!english_score.equals(other.english_score))
			return false;
		if (history_score == null) {
			if (other.history_score != null)
				return false;
		} else if (!history_score.equals(other.history_score))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (math_score == null) {
			if (other.math_score != null)
				return false;
		} else if (!math_score.equals(other.math_score))
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
		return "Register [id=" + id + ", student_id=" + student_id + ", english_score=" + english_score
				+ ", math_score=" + math_score + ", history_score=" + history_score + "]";
	}

	

	
	
}
