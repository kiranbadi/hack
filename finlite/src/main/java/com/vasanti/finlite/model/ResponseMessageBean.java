package com.vasanti.finlite.model;

import java.util.List;
import java.util.Objects;

public class ResponseMessageBean {
	
	    private String status = null;
	    private String message = null;	    
	    private List<String> responseData = null;
		/**
		 * @return the status
		 */
		public String getStatus() {
			return status;
		}
		/**
		 * @param status the status to set
		 */
		public void setStatus(String status) {
			this.status = status;
		}
		/**
		 * @return the message
		 */
		public String getMessage() {
			return message;
		}
		/**
		 * @param message the message to set
		 */
		public void setMessage(String message) {
			this.message = message;
		}
		/**
		 * @return the responseData
		 */
		public List<String> getResponseData() {
			return responseData;
		}
		/**
		 * @param responseData the responseData to set
		 */
		public void setResponseData(List<String> responseData) {
			this.responseData = responseData;
		}
		@Override
		public int hashCode() {
			return Objects.hash(message, responseData, status);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (!(obj instanceof ResponseMessageBean)) {
				return false;
			}
			ResponseMessageBean other = (ResponseMessageBean) obj;
			return Objects.equals(message, other.message) && Objects.equals(responseData, other.responseData)
					&& Objects.equals(status, other.status);
		}
		@Override
		public String toString() {
			return "ResponseMessageBean [status=" + status + ", message=" + message + ", responseData=" + responseData
					+ "]";
		}

	   
}
