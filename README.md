# RoleBasedAccess
BlueStack Assignment for providing a user role based access in Java

To Implement the code, Run the AccessRoleMain class or import this project in any IDE like Eclipse or Intellij

The code has the default user configured as admin and the other category is all other users.

Three packages:
Main: Starts the flow
Service: Contains the main logic
Model: The Entities are defined here

The three models are

Resources- is for defining resourceName, and their action type.
Role- class is for defining role name and list of Resource class
User- class is for defining userName and list of Role class.

Working:
The intial user logged in is the admin. Admin can create new users, edit roles and user can also log in as other users.
New User can ask for resource access. and view all accesses.

Object oriented concepts like Encapsulation, Abstraction, Inheritance, Enums, MVC design pattern etc are used in the implementation.

Sample responses:

Hi! You are logged in as an Admin
Press 1 for login as another user
Press 2 for create user
Press 3 for edit role
Press 'exit' for exit
2
Please Enter New UserName: 
Semil
Please Enter New Resource name: or '*' to exit
A
Please Enter all the Access types for the resource seperated by space [Allowed: ALLACCESS,READ,WRITE,EDIT,DELETE]
READ
Please Enter New Resource name: or '*' to exit
B
Please Enter all the Access types for the resource seperated by space [Allowed: ALLACCESS,READ,WRITE,EDIT,DELETE]
EDIT
Please Enter New Resource name: or '*' to exit
*
User: Semil created successfully!
Hi! You are logged in as an Admin
Press 1 for login as another user
Press 2 for create user
Press 3 for edit role
Press 'exit' for exit
3
Enter userName whose role is to be edited: 
Semil
Current Role: 
Role Name: Semil
Resource name and action type: A [READ]
Resource name and action type: B [EDIT]
Please enter resource name, old action type and new action type to be edited for eg. A READ WRITE press * to exit: 
A READ ALLACCESS
Edited role successfully!
Hi! You are logged in as an Admin
Press 1 for login as another user
Press 2 for create user
Press 3 for edit role
Press 'exit' for exit
1
Following is the user list please select appropriate username: 
Use Name: admin
Use Name: Semil
Semil
Hi! you are logged in as Semil
press 1 for login as another user
press 2 for view roles
press 3 for access resource
press * for exit
2
Following are the roles applicable on user: Semil
Role Name: Semil
Resource name: A Action Type: [ALLACCESS]
Resource name: B Action Type: [EDIT]
Hi! you are logged in as Semil
press 1 for login as another user
press 2 for view roles
press 3 for access resource
press * for exit
3
Please enter the resource name and action type of resource space separated: 
A ALLACCESS
Resource accessible!
Hi! you are logged in as Semil
press 1 for login as another user
press 2 for view roles
press 3 for access resource
press * for exit
3
Please enter the resource name and action type of resource space separated: 
A UPLOAD
Resource not accessible!
Hi! you are logged in as Semil
press 1 for login as another user
press 2 for view roles
press 3 for access resource
press * for exit
*
Exit Option Selected | Invalid choice!
Hi! You are logged in as an Admin
Press 1 for login as another user
Press 2 for create user
Press 3 for edit role
Press 'exit' for exit
exit
Exit Option Selected | Invalid choice!
