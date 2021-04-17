package com.role.access.service;

import com.role.access.model.Resources;
import com.role.access.model.Role;
import com.role.access.model.User;

import java.util.HashMap;

public class UserService extends AccessControl {

    public UserService() {

    }

    public void UserMain(HashMap<String, User> hashMap, String userName) {
        String option = "";
        do {
            System.out.println("Hi! you are logged in as " + userName);
            System.out.println("press 1 for login as another user");
            System.out.println("press 2 for view roles");
            System.out.println("press 3 for access resource");
            System.out.println("press * for exit");
            option = scanner.nextLine();
            switch (option) {
                case "1":
                    loginDifferentUser(hashMap);
                    break;
                case "2":
                    viewRole(hashMap, userName);
                    break;
                case "3":
                    accessResource(hashMap, userName);
                    break;
                default:
                    System.out.println("Exit Option Selected | Invalid choice!");
                    break;
            }
        } while (!option.equalsIgnoreCase("*"));

    }

    private void accessResource(HashMap<String, User> hashMap, String userName) {
        try {
            System.out.println("Please enter the resource name and action type of resource space separated: ");
            String accessResource = scanner.nextLine();
            boolean flag = false;
            String resource = accessResource.split(" ")[0];
            String actionType = accessResource.split(" ")[1];
            User user = hashMap.get(userName);
            for (Role i : hashMap.get(userName).getRole()) {
                for (Resources j : i.getResources()) {
                    if (j.getResourceName().equalsIgnoreCase(resource) && j.getActionType().contains(actionType)) {
                        flag = true;
                        break;
                    }
                }
                if (flag)
                    break;
            }
            if (flag)
                System.out.println("Resource accessible!");
            else
                System.out.println("Resource not accessible!");
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        }
    }

    private void viewRole(HashMap<String, User> hashMap, String userName) {
        try {
            System.out.println("Following are the roles applicable on user: " + userName);
            for (Role i : hashMap.get(userName).getRole()) {
                System.out.println("Role Name: " + i.getRoleName());
                for (Resources j : i.getResources()) {
                    System.out.println("Resource name: " + j.getResourceName() + " Action Type: " + j.getActionType().toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        }
    }
}
