.PHONY: build-all run-all stop-all

build-all:
	cd auth-service && mvn clean package -DskipTests
	cd data-service && mvn clean package -DskipTests
	cd business-service && mvn clean package -DskipTests
	cd web-service && mvn clean package -DskipTests

run-all:
	docker-compose up -d

stop-all:
	docker-compose down
