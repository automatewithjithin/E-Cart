# E-Cart
Repository for API development and Testing with E-Cart as example.
This project is made of Java SpringBoot Web Application.
API Documentation
----------------------
E Cart App API consists of 
  Controller
  Service Layer
  Repository Layer

Controller  
----------
Controller consists of 5 action methods
  Home (GET)
  GetProductByID(GET)
  getProductsByCategory(GET)
  addProduct(POST)
  updateProduct(PUT)
  deleteProduct(DELETE)

 Repo Layer
 -----------
 For simplicity I have not connected to any database. Instead I created an ArrayList and use for data storage.

 Steps to Work with the API
 --------------------------
 1. Download the Project from GitHub
 2. Open project in IntelliJ Idea editor(Preferred) or Eclipse
 3. Run the Project
 4. Open Postman
 5. Create a collection and add the following requests
      1. Home: http://localhost:8080/ecart/home
      2. GetProductById: http://localhost:8080/ecart/product/{id}
      3. GetProductByCategory: http://localhost:8080/ecart/category?name=Mobile
      4. Add Product: http://localhost:8080/ecart/add  (Provide Body payload as JSON)
      5. Update: http://localhost:8080/ecart/update  (Provide Body payload as JSON)
      6. Delete : http://localhost:8080/ecart/delete/{id}
  Note: Provide necessary JSON payload as body for add and update. Sample payload:
{
        "productId": 9,
        "productName": "Acer",
        "category": "Laptop",
        "price": 80000,
        "spec": [
            "12GBGB",
            "265GB",
            "White"
        ]
    }
6. Run the project in the editor and in Postman, Click on send and observe the results.
  
