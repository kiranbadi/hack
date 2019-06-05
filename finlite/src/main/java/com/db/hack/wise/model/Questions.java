package com.db.hack.wise.model;

import java.util.List;

/**
 * Created by Balamurugan on 6/4/2019.
 */

public class Questions {

    private String question;

    private List<String> options;

    private String rationale;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public String getRationale() {
		return rationale;
	}

	public void setRationale(String rationale) {
		this.rationale = rationale;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((options == null) ? 0 : options.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + ((rationale == null) ? 0 : rationale.hashCode());
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
		Questions other = (Questions) obj;
		if (options == null) {
			if (other.options != null)
				return false;
		} else if (!options.equals(other.options))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (rationale == null) {
			if (other.rationale != null)
				return false;
		} else if (!rationale.equals(other.rationale))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Questions [question=" + question + ", options=" + options + ", rationale=" + rationale + "]";
	}
    
    
}
