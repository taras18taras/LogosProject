package logos.project.admissions.domain;

public class Student {

	private Integer id;
	private String first_name;
	private String second_name;
	private String last_name;
	private Integer english_score;
	private Integer math_score;
	private Integer history_score;

	public Student() {
	}

	
	public Student(Integer id, String first_name, String second_name,String last_name,Integer english_score,Integer math_score,Integer history_score ) {
		this.id = id;
		this.first_name = first_name;
		this.second_name = second_name;
		this.last_name = last_name;
		this.english_score = english_score;
		this.math_score = math_score;
		this.history_score = history_score;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getSecond_name() {
		return second_name;
	}


	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((history_score == null) ? 0 : history_score.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((math_score == null) ? 0 : math_score.hashCode());
		result = prime * result + ((second_name == null) ? 0 : second_name.hashCode());
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
		Student other = (Student) obj;
		if (english_score == null) {
			if (other.english_score != null)
				return false;
		} else if (!english_score.equals(other.english_score))
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
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
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (math_score == null) {
			if (other.math_score != null)
				return false;
		} else if (!math_score.equals(other.math_score))
			return false;
		if (second_name == null) {
			if (other.second_name != null)
				return false;
		} else if (!second_name.equals(other.second_name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", first_name=" + first_name + ", second_name=" + second_name + ", last_name="
				+ last_name + ", english_score=" + english_score + ", math_score=" + math_score + ", history_score="
				+ history_score + "]";
	}

	
	
}
