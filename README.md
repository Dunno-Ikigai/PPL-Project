# PPL
## Grocery Management System
This is a Java console application for managing a grocery store inventory. The application allows you to add, search, display, delete products, and generate receipts.

### A grocery management system would need to be able to:
* Store information about products (e.g., name, description, price, inventory levels)
* Allow users to search for products and view product details
* Track sales and inventory levels
* Process transactions (e.g., purchases, returns, refunds)
* Generate reports (e.g., sales reports, inventory reports, profit and loss statements)

### Here's an example of a high-level class diagram that might be used for a grocery management system:

                +----------------+       +----------------+       +----------------+
                |    Product     |       |   Transaction  |       |      Report    |
                +----------------+       +----------------+       +----------------+
                | - productId    |       | - transactionId|       | - reportId     |
                | - name         |       | - date         |       | - reportType   |
                | - description  |       | - type         |       | - startDate   |
                | - price        |       | - productId    |       | - endDate     |
                | - inventory    |       | - quantity     |       | - data        |
                +----------------+       +----------------+       +----------------+
                       |                         |                          |
                       |                       has-a                      has-a
                       |                         |                          |
                       |             +---------------------+     +---------------------+
                       |             |   ProductManager    |     |  TransactionManager |
                       |             +---------------------+     +---------------------+
                       |             | + searchProducts()  |     | + processTransaction() |
                       +-------------| + addProduct()      |     | + generateReceipt()   |
                                     | + removeProduct()   |     | + generateRefund()    |
                                     | + updateInventory() |     +---------------------+
                                     +---------------------+
