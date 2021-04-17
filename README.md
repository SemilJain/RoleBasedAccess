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

[Response.txt](https://github.com/SemilJain/RoleBasedAccess/files/6329282/Response.txt)
