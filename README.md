🧩 Rubik Solver Backend
A Spring Boot REST API that provides endpoints to scramble, solve, and check the solved state of a Rubik’s Cube.
The backend is containerized using Docker and deployed on Render Cloud.

🚀 Live Demo (Backend)
🌐 Base URL
Copy code
https://rubiksolver-backend.onrender.com

🛠️ Tech Stack
Java 17
Spring Boot
Maven
REST API
Docker (Multi-stage build)
Render (Cloud Deployment)

📌 Features
🔀 Scramble Rubik’s Cube with random moves
🧠 Solve a given cube state
✅ Check whether a cube state is solved
🌍 Deployed and accessible via public REST endpoints

📂 Project Structure
rubiksolver
│── src
│   └── main
│       ├── java
│       │   └── com.example.rubiksolver
│       │       ├── controller
│       │       ├── service
│       │       └── model
│       └── resources
│── Dockerfile
│── pom.xml
│── README.md

🔗 API Endpoints
1️⃣ Scramble Cube
POST
/cube/scramble
Request Body

Json
{
  "steps": 10
}
Response

Json
{
  "moves": ["R", "U", "L", "D"]
}
2️⃣ Solve Cube
POST
/cube/solve
Request Body
Json
{
  "cubeState": "your_cube_state_here"
}
Response
Json
{
  "solution": ["R", "U", "R'", "U'"]
}
3️⃣ Check if Cube is Solved
POST
/cube/solved
Request Body
Json
{
  "cubeState": "your_cube_state_here"
}
Response
Json
true

🐳 Docker Support
This project uses a multi-stage Docker build for efficient deployment.
Build & Run Locally

Bash
docker build -t rubiksolver-backend .
docker run -p 8080:8080 rubiksolver-backend
🧪 Run Locally Without Docker
Prerequisites
Java 17+
Maven

Bash
mvn clean package
java -jar target/*.jar
Server starts at:
http://localhost:8080

🌩️ Deployment
The application is deployed on Render using:
GitHub integration
Docker runtime
Automatic builds on push

🎯 Future Improvements
Swagger / OpenAPI documentation
Frontend integration (React / HTML UI)
Database support (PostgreSQL)
Authentication & rate limiting
