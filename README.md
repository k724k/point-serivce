# 🏷️ point-service

사용자의 포인트 적립 및 차감 로직을 처리하는 마이크로서비스입니다.

---

# 📌 Overview

Point Service는 사용자 활동에 따라 포인트를 관리하는 서비스입니다.

게시글 작성 요청 시 포인트 차감을 처리하며 게시글 작성 이벤트를 Kafka로 수신하여 포인트 적립을 수행합니다.

이를 통해 서비스 간 결합도를 낮춘 **이벤트 기반 구조**로 포인트 로직을 처리합니다.

---

# 🔧 Key Features

### 1️⃣ 포인트 차감

게시글 작성 요청 시 Board Service에서 Point Service API를 호출하여

- 사용자 포인트 차감 처리

를 수행합니다.

---

### 2️⃣ 포인트 적립

게시글 작성 완료 이벤트 발생 시 Kafka 이벤트를 수신하여

- 사용자 포인트 적립

을 처리합니다.

---

### 3️⃣ 이벤트 기반 처리

Board Service에서 발행한 Kafka 이벤트를 소비하여 포인트 적립 로직을 처리하는 **비동기 이벤트 구조**로 구현했습니다.

---

# 🏗 Architecture

<img width="557" height="239" alt="Image" src="https://github.com/user-attachments/assets/d9924386-8d59-4e4e-93db-5b924c0ca251" />

<img width="703" height="482" alt="Image" src="https://github.com/user-attachments/assets/ccdad428-4237-4ebb-bce4-060bc6b9e649" />

---

# 🔗 Related Services

- https://github.com/k724k/api-gateway-service
- https://github.com/k724k/user-service
- https://github.com/k724k/board-service

---

# ⚙️ Tech Stack

Java  
Spring Boot  
Spring Data JPA  
MySQL  
Apache Kafka  
Docker  
AWS
