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
LinkedIn
