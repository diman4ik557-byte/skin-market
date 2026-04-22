# Skin Market

Платформа для заказа и создания Minecraft скинов.

## Архитектура

Проект состоит из 4 микросервисов:

| Сервис | Порт | Описание |
|--------|------|----------|
| Auth Service | 9510 | Аутентификация и JWT токены |
| Data Service | 8081 | Работа с БД, CRUD операции |
| Business Service | 8082 | Бизнес-логика, кэширование |
| Web Service | 8083 | Веб-интерфейс (Thymeleaf) |

## Технологии

- Java 17
- Spring Boot 3.2
- Spring Security + JWT
- PostgreSQL
- Redis
- Docker
- Thymeleaf
- MapStruct
- Flyway


## Тестовые пользователи

| Логин | Пароль | Роль |
|-------|--------|------|
| user | user123 | USER |
| artist | artist123 | ARTIST |
| admin | admin123 | ADMIN |

## Репозитории

- [Auth Service](https://github.com/diman4ik557-byte/skin-market-auth-service)
- [Data Service](https://github.com/diman4ik557-byte/skin-market-data-service)
- [Business Service](https://github.com/diman4ik557-byte/skin-market-business-service)
- [Web Service](https://github.com/diman4ik557-byte/skin-market-web-service)

## Запуск

docker start skin-market-db
docker run --name redis -p 6379:6379 -d redis

cd /mnt/c/Users/diman/IdeaProjects/skin-market
mvn clean package -DskipTests

##  1. Data Service (порт 8081)
cd data-service
mvn spring-boot:run -Dspring-boot.run.profiles=spring-jpa

##  2. Auth Service (порт 9510)
cd auth-service
mvn spring-boot:run -Dspring-boot.run.profiles=jwt

##  3. Business Service (порт 8082)
cd business-service
mvn spring-boot:run -Dspring-boot.run.profiles=basic

##  4. Web Service (порт 8083)
cd web-service
mvn spring-boot:run

http://localhost:8083