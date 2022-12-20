Problems from simplest to most complex

- Find out how many orders, how many products and how many sellers are in the data.
- How many products have been sold at least once? Which is the product contained in more orders?
- How many distinct products have been sold in each day?
- What is the average revenue of the orders?
- For each seller, what is the average % contribution of an order to the seller's daily quota?
- Who are the second most selling and the least selling persons (sellers) for each product? Who are those for product with `product_id = 0`
- Create a new column called `hashed_bill` defined as follows:
    - if the `order_id` is even: apply MD5 hashing iteratively to the `bill_raw_text` field, once for each 'A' (capital 'A') present in the text. E.g. if the bill text is 'nbAAnllA', you would apply hashing three times iteratively (only if the order number is even)
    - if the `order_id` is odd: apply SHA256 hashing to the bill text

    Finally, check if there are any duplicate on the new column

