package com.role.access.service;

import com.role.access.model.ActionList;
import com.role.access.model.Resources;
import com.role.access.model.Role;
import com.role.access.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AdminService extends AccessControl {
	Scanner scanner = new Scanner(System.in);

	public AdminService() {

	}

	public AdminService(HashMap<String, User> hashMap) {
		List<String> actionType = new ArrayList<String>();
		actionType.add(ActionList.ALLACCESS.toString());
		Resources resources = new Resources("AdminResource", actionType);
		List<Resources> resourcesList = new ArrayList<Resources>();
		resourcesList.add(resources);
		Role adminRole = new Role("admin", resourcesList);
		List<Role> roleList = new ArrayList<Role>();
		roleList.add(adminRole);
		User adminUser = new User("admin", roleList);
		hashMap.put("admin", adminUser);
		adminMenu(hashMap);
	}

	public void adminMenu(HashMap<String, User> hashMap) {
		String option = "";
		do {
			System.out.println("Hi! You are logged in as an Admin");
			System.out.println("Press 1 for login as another user");
			System.out.println("Press 2 for create user");
			System.out.println("Press 3 for edit role");
			System.out.println("Press 'exit' for exit");
			option = scanner.nextLine();
			switch (option) {
			case "1":
				loginDifferentUser(hashMap);
				break;
			case "2":
				createNewUser(hashMap);
				break;
			case "3":
				editRole(hashMap);
				break;
			default:
				System.out.println("Exit Option Selected | Invalid choice!");
				break;
			}
		} while (!option.equalsIgnoreCase("exit"));

	}

	public User createNewUser(HashMap<String, User> hashMap) {
		try {
			String resourceName = "";
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter New UserName: ");
			String userName = scanner.nextLine();

			List<Resources> resourcesList = new ArrayList<Resources>();

			do {
				System.out.println("Please Enter New Resource name: or '*' to exit");
				resourceName = scanner.nextLine();
				if (!resourceName.equalsIgnoreCase("*")) {
					System.out.println(
							"Please Enter all the Access types for the resource seperated by space [Allowed: ALLACCESS,READ,WRITE,EDIT,DELETE]");

					String actionType = scanner.nextLine();
					List<String> actionTypeList = addAccessTypes(actionType);
					Resources resources = new Resources(resourceName, actionTypeList);
					resourcesList.add(resources);
				}
			} while (!resourceName.equalsIgnoreCase("*"));

			Role role = new Role(userName, resourcesList);
			List<Role> roleList = new ArrayList<Role>();
			roleList.add(role);
			User user = new User(userName, roleList);
			hashMap.put(userName, user);
			System.out.println("User: " + userName + " created successfully!");
			return user;
		} catch (Exception e) {
			System.out.println("Exception occurred!");
			return null;
		}
	}

	public List<String> addAccessTypes(String actionType) {
		String[] accesses = actionType.split(" ");
		List<String> accessList = new ArrayList<>();
		for (int i = 0; i < accesses.length; i++)
			accessList.add(accesses[i]);
		return accessList;

	}

	public void editRole(HashMap<String, User> hashMap) {
		try {
			System.out.println("Enter userName whose role is to be edited: ");
			String userName = scanner.nextLine();
			User user = hashMap.get(userName);
			List<Role> roleList = user.getRole();
			System.out.println("Current Role: ");
			for (Role i : roleList) {
				System.out.println("Role Name: " + i.roleName);

				for (Resources j : i.resources) {
					System.out.println(
							"Resource name and action type: " + j.resourceName + " " + j.actionType.toString());
				}
			}
			System.out.println(
					"Please enter resource name, old action type and new action type to be edited for eg. A READ WRITE press * to exit: ");
			String roleName = scanner.nextLine();
			String resource = roleName.split(" ")[0];
			String oldActionType = roleName.split(" ")[1];
			String newActionType = roleName.split(" ")[2];
			for (Role i : user.getRole()) {
				for (Resources j : i.getResources()) {
					if (j.resourceName.equalsIgnoreCase(resource)) {
						j.getActionType().add(newActionType);
						j.getActionType().remove(oldActionType);
					}
				}
			}
			System.out.println("Edited role successfully!");
		} catch (Exception e) {
			System.out.println("Exception occurred!");
		}

	}
}
