# BloodSyncApplication
Blood Sync is a full-stack web application designed to connect blood donors and blood seekers efficiently. It provides a platform where users can register as donors or request blood in emergency situations. The project uses HTML, CSS, JavaScript for the frontend and Java (Servlets, JDBC) with MySQL for the backend, ensuring smooth user interactions and reliable data management.

Features
📝 User registration and login (Donors and Receivers)

🔍 Search available donors by blood group and location

📅 Request blood donations and manage requests

🛡️ Secure data handling with server-side validations

📑 Admin panel for monitoring and managing users and requests

📱 Responsive UI for different devices

Technologies Used
Frontend:

HTML5

CSS3

JavaScript

Backend:

Java (Servlets and JDBC)

Database:

MySQL

Tools:

Apache Tomcat Server

MySQL Workbench

VS Code / Eclipse IDE

How It Works
Donors and receivers can register and log in securely.

Donors can update their availability and blood group information.

Receivers can search for matching donors and send blood requests.

Admin can verify users, manage blood requests, and maintain the database.

Setup Instructions
Clone or download the project repository.

Import the project into your IDE (like Eclipse or VS Code with Java extensions).

Set up a MySQL database and import the provided .sql file (if available) to create necessary tables.

Update the JDBC database connection settings (username, password, URL) in your project files.

Deploy the project on an Apache Tomcat server.

Access the application in your browser (usually at http://localhost:8080/BloodSync).

Database Structure (Basic Idea)
Users Table: Stores user details like name, blood group, location, contact info, role (donor/receiver).

Requests Table: Stores blood requests, donor-receiver mappings, and status of requests.

Project Status
✅ Core functionalities complete
🚀 Future plans:

Email notifications to donors and receivers

Adding maps integration for nearby donors

Adding emergency contact features


Author
Abhinav Saxena
LinkedIn : https://www.linkedin.com/in/abhinav0211/



🔧 Setup Instructions (Detailed)
Follow these steps to set up and run the BloodSync application on your local machine:

1. Clone the Repository
bash
Copy code
git clone https://github.com/yourusername/BloodSyncApplication.git
Or download the ZIP file and extract it.

2. Open in Eclipse IDE
Open Eclipse IDE.

Go to File > Import > Existing Projects into Workspace.

Select the root directory where you cloned the project.

Click Finish to import.

3. Set Up Apache Tomcat
Go to Window > Preferences > Server > Runtime Environments.

Click Add, choose Apache Tomcat vX.X (e.g., 9.0), and set the path to your Tomcat installation.

Once added, right-click on your project → Run As → Run on Server.

4. Configure MySQL Database
Open MySQL Workbench.

Create a new database (e.g., bloodsyncdb).

Run the provided .sql file (if available) to create tables like Users, Requests.

5. Edit JDBC Configuration
In your Java Servlet or utility class where the DB connection is set:

java
Copy code
String url = "jdbc:mysql://localhost:3306/bloodsyncdb";
String username = "root";
String password = "your_mysql_password";
Ensure the MySQL JDBC driver is added to your project:

Right-click project > Build Path > Configure Build Path > Libraries > Add External JARs.

Add the MySQL Connector JAR (e.g., mysql-connector-java-8.x.x.jar).

6. Deploy on Tomcat
Right-click project > Run As > Run on Server.

Choose the configured Apache Tomcat server.

7. Access the Application
Open your browser and navigate to:

arduino
Copy code
http://localhost:8080/BloodSync
✅ Troubleshooting Tips
Make sure your Tomcat server is running without errors.

Check your MySQL service is running and the credentials are correct.

If using ports other than 8080, update the URL accordingly.

Confirm the .class files are generated in the WEB-INF/classes directory.
