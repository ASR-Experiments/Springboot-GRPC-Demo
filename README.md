# SpringBoot GRPC Demo

## Introduction

This project makes use of Springboot's GRPC starter to demonstrate the GRPC APIs.

## APIs

1. Say Hello
    This API expects a name and sends the Hello to provided name as part of the response.
    ##### Example 1: When name is provided
    **Request**
    ```json
    {
        "name": "Arvind"
    }
    ```
   **Response**
   ```json
   {
        "greeting": "Hello Arvind !!!"
   }
   ```
   ##### Example 2: When name is not provided
   **Response**
   ```json
   {
        "greeting": "Hello World !!!"
   }
   ```
   
## References

1. [Postman Collection](https://www.postman.com/rwind-ching/workspace/spring-grpc-demo/collection/680515647a1fcb6960a5f6aa?action=share&creator=13601294&active-environment=13601294-44a1a4dc-70ae-4224-b288-36b11be47f34)