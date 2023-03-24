## User Stories

```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```

```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```

```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```

```
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```

## Domain Model

| Classes | Members                    | Methods                       | Scenarios                                                                  | Outputs                                                           |
|---------|----------------------------|-------------------------------|----------------------------------------------------------------------------|-------------------------------------------------------------------|
| Basket  | ArrayList<String> contents | add(String bagel)             | As a customer add a bagel to my basket that has space in it                | Success message if the bagel is successfully added                |
|         | int capacity               |                               |                                                                            | Failure message if the basket is full                             |
|         |                            | remove(String bagel)          | As a customer remove the first instance of a type of bagel from the basket | Success message if the bagel is successfully removed              |
|         |                            |                               |                                                                            | Failure message if no bagels of that type are found in the basket |
|         |                            | resizeBasket(int newCapacity) | As a manager change the capacity of a basket                               | Success message if the basket is resized                          |
|         |                            | getCapacity()                 |                                                                            | Failure message if the newCapacity is not a proper size           |