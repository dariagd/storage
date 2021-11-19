CREATE TABLE store (
    store_id LONG,
    store_name VARCHAR(20),
    address VARCHAR(50),
    PRIMARY KEY (store_id)
);
CREATE TABLE good (
    good_id LONG,
    store_id LONG,
    amount LONG,
    note VARCHAR(50),
    product_id LONG,
    PRIMARY KEY (good_id, store_id),
    FOREIGN KEY (store_id) REFERENCES store(store_id)
);
CREATE TABLE product (
    product_id LONG,
    product_name VARCHAR(30)
);
CREATE TABLE product_composition (
    parent_id LONG,
    child_id LONG,
    amount LONG,
    PRIMARY KEY (parent_id, child_id),
    FOREIGN KEY (parent_id) REFERENCES product(product_id),
    FOREIGN KEY (child_id) REFERENCES product(product_id)
);
CREATE TABLE employee (
    employee_id LONG,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    middle_name VARCHAR(20),
    department VARCHAR(30),
    PRIMARY KEY (employee_id)
);
CREATE TABLE employee_store (
    employee_id LONG,
    store_id LONG,
    expiration_date DATE,
    PRIMARY KEY (employee_id, store_id),
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
    FOREIGN KEY (store_id) REFERENCES store(store_id)
);