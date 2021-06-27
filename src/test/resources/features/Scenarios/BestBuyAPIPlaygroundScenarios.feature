Feature: Best Buy API Playground API's

  @GETSERVICES
  Scenario: Retrieve Services
    When GetServices API is called list of services are returned

  @CREATESERVICE
  Scenario: Create a Service
    When PostService API is called service is created

  @GETPRODUCTS
  Scenario: Retrieve Products
    When GetProducts API is called list of products are returned

  @CREATEPRODUCT
  Scenario: Create a Product
    When PostProduct API is called product is created

  @GETCATEGORIES
  Scenario: Retrieve Categories
    When GetCategories API is called list of categories are returned

  @CREATECATEGORY
  Scenario: Create a Category
    When PostCategory API is called category is created