package com.role.access.main;

import com.role.access.model.User;
import com.role.access.service.AdminService;
import java.util.HashMap;

public class AccessRoleMain {

	public static HashMap<String, User> hashMap = new HashMap<>();

	public static void main(String[] args) {

		// Start flow by calling constructor and initializing admin values
		new AdminService(hashMap);

	}
}
