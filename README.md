# ***Share your Experience: Product Feedback Management***

**Topic Contents**

**I. Project Overview**

**II. Explanation of how OOP principles were applied.**
* **Encapsulation**
* **Inheritance**
* **Polymorphism**
* **Abstraction**

**III. Details of chosen SDG and its integration into the project.**

**IV. Instruction in running the program.**




# I. Project Overview

Share your experience:  Product feedback system is a Java-based console application that allows users to give their experience on the products. This system has two forms, including rating and suggestion. This console application can also be used by administrators to take updates on the given feedback. The main goal of this system is to gather the product weaknesses to address for better production and improving customer satisfaction.

# II. Explanation of how OOP principles were applied.

**Encapsulation**

Classes like `customerAccount` and `Administrator` are used to encapsulate `usernames` and `passwords` by the users providing the access controlled to data like `createAccount`, `login` and `AdminMenu` using private method, this cannot be accessible from outside of the class, ensuring that only `usernames` and `passwords` can be added and validated in a secure manner. On the other hand, the `Feedback` class attributes like `name`, `rating`, and `suggestion` are also private to keep them and expose only necessary operations and can be accessed using the getters and setters’ method.

**Inheritance**

In this system the Product class is the base class of Furniture class inheriting all of the attributes of Product class like productName, productCategory, and productID. This inheritance allows to reuse the attributes of the Product class into Feedback class without needing to redefine them. Beside inheriting attributes in the base class Furniture class extend the functionality of the Product by making some attributes related to Furnitures like type, material, specific type and details. For example, if the product is chair it can be extending the information using the attributes in Furniture class.

**Polymorphism**

Polymorphism is used in this system to connect more the relationship of Product class and its subclass Furniture. The Product class use a `getdescription` method to override the specific implementation of subclasses that were define in the parent class Product

**Abstraction**

Abstraction was used in this system to define a blueprint for all product types. Encapsulating the core attributes and leaving the implementation of certain methods such as `getDescription` to its subclasses. Ensuring that every Furniture must consistent to all of the details regardless of their specific type. In this code, the `Furniture` class must provide a detailed description of furniture products in the list using the `getDescription` function and the superclass `Products` will abstract features such as `productNames` and `productCategory`.

# III. Details of chosen SDG and its integration into the project.

This system chose `SDG 12: Responsible Consumption and Production`. By gathering customer experience in the products, this system will collect feedback, ratings, and some suggestions to help manufacturers address what they will need to improve to give the customer their satisfaction in using the products they will make. This mechanism will enable producers to enhance product quality and address possible problems. Positive feedback can boost the manufacturer's confidence, which will make their product of higher quality and give the customer what they expected in buying this product. On the other hand, negative feedback will address some areas for improvement, like durability and design, that the buyers will like. Through the utilization of this system, both buyers and manufacturers have the ability to decrease waste, thus aligning the products more closely with the needs of customers and the environment.

# IV. Instruction in running the program.

**Customer Dashboard**

![image](https://github.com/user-attachments/assets/4462aa2e-3ada-4d17-acfa-78b3bc28e85e)

**Creating Account**

Step 1: If the user doesn’t have an account, he/she can make an account if they choose number 1 in the option.

![image](https://github.com/user-attachments/assets/cf7f3533-8920-424c-ad8f-4259be8accf2)

**Logging in**

The user can log in using their existing account.

![image](https://github.com/user-attachments/assets/32cc23dd-ac68-4d80-927a-5ccb83fd507c)

**Feedback Menu**

After logging in the feedback menu will display.

![image](https://github.com/user-attachments/assets/526421db-e0de-47b8-8626-8575a7eefdff)

**List of Products that can a user provide feedback.**

![image](https://github.com/user-attachments/assets/a963b2ba-96e0-4da8-976b-2733d274c2f8)

**Providing feedback.**

Step2: After the customer choose number 1 in the options and select a product to give feedback. He/she will proceed in giving feedback and rating.

![image](https://github.com/user-attachments/assets/3117b0b1-c6bb-4cb7-8708-f6f423e4127b)

**If rating is less than or equal to 2.**

If the customers are unsatisfied with the products, he/she can give a suggestion for improving.

![image](https://github.com/user-attachments/assets/2a89eb1b-26cb-4f25-addf-ad2b2ca82fd5)

**Viewing the customer feedback.**

Step 3: After giving a feedback the customer can view his/her and the other customer feedbacks.

![image](https://github.com/user-attachments/assets/d9dca509-e44c-4a0e-a05c-dfe174e822ee)

**Logging Out**

Step 4: After the user provide and view the feedbacks he/she can log out choosing the number 3 in the option.

![image](https://github.com/user-attachments/assets/f71ff750-9cde-44fe-aaa2-afa91a85d85b)

# Admin Dashboard

This console application also provides logging in of admins to review and update the customer feedbacks.

![image](https://github.com/user-attachments/assets/efa5ed48-2d21-4c18-a74e-04e8ab784fe8)

**Step 1: Viewing the customer Feedbacks**

![image](https://github.com/user-attachments/assets/c7b1d2fd-a704-4752-9c05-4c59fcdcf1ac)

**Step 2: Updating Customer Feedback status**

![image](https://github.com/user-attachments/assets/6833f35f-7a36-474e-a909-704e25bced36)













