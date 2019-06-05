package com.db.hack.wise.service;

/**
 * Created by Balamurugan on 6/4/2019.
 */

public interface LoginService {
	public boolean getMemberDetails(int id, String userName, String password);

	public Boolean getMemberDetailsForUser(String userName, String password);
}
