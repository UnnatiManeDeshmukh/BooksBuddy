# 📚 BookBuddy - Book Request Management System

A simple full-stack web application for managing book requests using **Spring Boot REST API (Backend)** and **HTML + CSS + JS (Frontend)**. Suitable for mini-projects, this system allows users to request books and lets the admin approve or deny them with ease.

---

## 👨‍💻 Developed By

**Unnati Manedeshmukh**  
Email: *unnatimd22@example.com*  
GitHub: [https://github.com/UnnatiManeDeshmukh](https://github.com/UnnatiManeDeshmukh)

---

## 📁 Project Structure

```
BookBuddy/
├── backend/
│   ├── src/
│   │   └── main/java/com/example/bookbuddy/
│   │       ├── controller/        # REST Controllers
│   │       ├── model/             # Entity classes
│   │       ├── repository/        # JPA Interfaces
│   │       └── service/           # Business Logic
│   ├── resources/
│   │   └── application.properties # DB Configuration
│   └── pom.xml                    # Maven File
│
├── frontend/
│   ├── index.html                 # Request & Admin UI
│   └── background.png             # Page Background
```

---

## ✅ Features

- 📩 Submit book request form
- 👨‍💼 Admin can view all requests
- ✅ Approve or ❌ Deny requests
- 📬 Confirmation alert for actions
- 🔐 Admin password protected section (`unnu`)

---

## 🚀 How to Run This Project

### ⚙️ Step 1: Backend (Spring Boot + PostgreSQL)

1. **Clone the repo**  
```bash
git clone https://github.com/UnnatiManeDeshmukh/BookBuddy.git
cd BookBuddy/backend
```

2. **Create a PostgreSQL database**  
Database name: `bookbuddy_db` 

3. **Configure DB in `application.properties`**  
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/bookbuddy_db
spring.datasource.username=postgres
spring.datasource.password=unnati22
spring.jpa.hibernate.ddl-auto=update
```

4. **Run the Spring Boot app**  
```bash
./mvnw spring-boot:run
```
> OR run as Spring Boot App from STS or IntelliJ

---

### 🌐 Step 2: Frontend (HTML + CSS + JS)

1. Open terminal in `frontend/` folder  
```bash
cd ../frontend
python -m http.server 
```

2. Visit the web page  
[http://localhost:5566](http://localhost:5566)

> 📢 Ensure backend is running at `http://localhost:7766`

---

## 🔐 Admin Section

To view and manage requests:  
Click on **"🔐 View All Requests (Admin)"**  
Enter password: `unnu`

---

## 📸 Preview

### 🧾 Request Form  
![Request Form](https://github.com/UnnatiManeDeshmukh/BooksBuddy/blob/main/Frontend1/OutPut.JPG)

### ✅ Admin Panel  
![Admin Panel](https://github.com/UnnatiManeDeshmukh/BooksBuddy/blob/main/Frontend1/OutPut1.JPG)



### 🧪 API Testing (Postman)  
![API Postman Output](https://github.com/UnnatiManeDeshmukh/BooksBuddy/blob/main/Frontend1/POST_OP.JPG)
---

## 📬 API Tested Using Postman

- `POST /api/requests` → Submit new request  
- `GET /api/requests` → View all requests  
- `PUT /api/requests/{id}/approve` → Approve request  
- `DELETE /api/requests/{id}` → Deny request

---

## 📌 Note

- Change the admin password in JS if needed
- Run both frontend and backend together for proper working

---

---

## 🙏 Thank You

Thank you for visiting the **BooksBuddy** project repository!  
We hope this project helps you understand full-stack integration using **Spring Boot** and **HTML/CSS/JS**.  
Feel free to explore, use, or improve the code. 😊



---

## 📬 Contact Me

If you have any queries, suggestions, or feedback, feel free to reach out:

- 📧 Email: unnatimd22@gmail.com  
- 🌐 GitHub: [UnnatiManeDeshmukh](https://github.com/UnnatiManeDeshmukh)

---
