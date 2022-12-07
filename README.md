# Spring Cloud Microservices
Réaliser par Ahmouny Hamza, pour le control JEE 2022

## Pre-requis
- Intellij Idea Ultimate

## Installation  
1. Start Intellij Idea Ultimate
2. Import all projects as module
3. Setup Spring Boot services
4. Run all the services (customerservice, inventoryservice, eurekadiscovery, orderservice, gatewayservice)

## Setup
Project setup as moduls on Intellij Idea Ultimate to start everything at once
![image](https://user-images.githubusercontent.com/46407388/206121820-1ea1f5c1-ab29-4b4c-8d98-ac1a96e37a12.png)

## Customer Service
Création des entites et projection, avec inventory repository.
### root/
![image](https://user-images.githubusercontent.com/46407388/206119222-6c7cca50-4e37-4051-9642-c6ee36f0d666.png)
### Customers/1
![image](https://user-images.githubusercontent.com/46407388/206119403-e94ccbd5-b476-47a7-9c9a-103f1d0a9278.png)
### Customers/
![image](https://user-images.githubusercontent.com/46407388/206119528-7d9fa19b-9b68-4ed0-ad93-6d3fa3d78e59.png)

## Inventory Service
Création des entites et projection, avec customer repository.
### root/
![image](https://user-images.githubusercontent.com/46407388/206119764-b7d01a44-1646-459b-bc2b-f7fb42e6f395.png)
### products
![image](https://user-images.githubusercontent.com/46407388/206119856-3db4d35c-8b8f-4b6c-8b38-aa10ea174a9e.png)
### products/8e95517c-618e-4ad6-b71a-79b443e1b9a3
![image](https://user-images.githubusercontent.com/46407388/206121062-d40d42fc-458a-4c5b-a414-f7f3721511f0.png)

## Order Service (Billing with Invoice)
Création des entites (productItem et orders, avec enums et models) et order's projection, mise en place du feign et enfin orders/productItem repository.
### productItems
![image](https://user-images.githubusercontent.com/46407388/206125173-7debfa94-f2ae-41a0-9e98-ae9946c8125c.png)
### productItems/1
![image](https://user-images.githubusercontent.com/46407388/206125051-a6dfcebc-a352-406a-a3f7-c646afc43d41.png)
### orders
![image](https://user-images.githubusercontent.com/46407388/206125330-b3fa1786-4b85-4e41-a1bf-986ba9957b1f.png)
### orders/a03d7402-cc7f-46a3-a9a3-36f2b510007c
![image](https://user-images.githubusercontent.com/46407388/206125625-2bccdb2b-c0f1-4802-bb40-7e23ff9b5abe.png)

## Eureka
Mise en place d'Eureka Discovery
### /root System status & instances registred with eureka
![image](https://user-images.githubusercontent.com/46407388/206121345-92d4fb2d-da80-41bd-907c-eadd759c73e3.png)

## Gateway
Mise en place d'un gateway, route pour chaque micro-service (Product-service, Customer-service, Order-service)
### lopode/PRODUCT-SERVICE
![image](https://user-images.githubusercontent.com/46407388/206123042-f6d0f320-253e-46ce-a01f-024edcb544ce.png)
### lopode/CUSTOMER-SERVICE
![image](https://user-images.githubusercontent.com/46407388/206123324-229ecd5a-b68f-4485-a03d-e59aad509e56.png)
### lopode/ORDER-SERVICE
![image](https://user-images.githubusercontent.com/46407388/206124842-f4aa8f11-0fc1-468d-b8b3-6c535f03f754.png)

## Keycloak
Mise en place d'une securitée/Auth avec KeyCloak
### Setup
![image](https://user-images.githubusercontent.com/46407388/206116435-5ef5ee3e-07fa-4498-bc30-2a1baa11420f.png)
### Postman
![image](https://user-images.githubusercontent.com/46407388/206116789-117ba8a2-f337-4fa4-9e01-5d34998c82e5.png)
### Refresh Token
![image](https://user-images.githubusercontent.com/46407388/206116912-121fab06-38fc-4e4b-81ee-cb8013bd2ff1.png)
### Client Auth Credentials
![image](https://user-images.githubusercontent.com/46407388/206117029-7f95a0d9-d7d1-453d-8b0b-8b157098d418.png)


## Client Angular: 
https://github.com/Hamzalopode/micro-cloud-angular

## Pre-requis
- VS CODE ou autre
- npm

## Installation  
1. ```cd workfolder```
2. ```npm install```

## Setup
```npm start```

## Angular Client Front
### Products
![image](https://user-images.githubusercontent.com/46407388/206127888-ff5cc025-c9f1-4040-a0a1-76c0e5f64bb9.png)
### Customers
![image](https://user-images.githubusercontent.com/46407388/206128479-89c8bdaf-34e9-4e9f-a946-489fd4fe474a.png)
### customers/1/orders
![image](https://user-images.githubusercontent.com/46407388/206128712-a449b0f2-6dd1-45b4-9db1-0dfd1e9f9c49.png)
### /customers/order-details/a03d7402-cc7f-46a3-a9a3-36f2b510007c
![image](https://user-images.githubusercontent.com/46407388/206128906-b79d93a5-54e0-42e1-97cf-f11b3477ab1b.png)


## Misc
Projet encadré par Mr. Mohamed Youssfi: https://www.youtube.com/@mohamedYoussfi 2022-2023