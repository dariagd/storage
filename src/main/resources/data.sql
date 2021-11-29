INSERT INTO product (product_name) VALUES ('controller' );
INSERT INTO product (product_name) VALUES ('microchip' );
INSERT INTO product (product_name) VALUES ('processor' );
INSERT INTO product (product_name) VALUES ('machine1' );
INSERT INTO product (product_name) VALUES ('machine2' );

INSERT INTO product__composition (parent_id, child_id, amount) VALUES (1, 2, 1);
INSERT INTO product__composition (parent_id, child_id, amount) VALUES (1, 3, 5);
INSERT INTO product__composition (parent_id, child_id, amount) VALUES (1, 4, 13);
INSERT INTO product__composition (parent_id, child_id, amount) VALUES (2, 4, 3);
INSERT INTO product__composition (parent_id, child_id, amount) VALUES (3, 5, 6);

INSERT INTO store (store_name, address) VALUES ('store1', 'moskvoreche' );
INSERT INTO store (store_name, address) VALUES ('store2', 'kashira' );
INSERT INTO store (store_name, address) VALUES ('store3', 'proletarskiy' );
INSERT INTO store (store_name, address) VALUES ('store4', 'leninskiy' );

INSERT INTO good (store_id, amount, note, product_id ) VALUES (1, 123, 'microchips', 1);
INSERT INTO good (store_id, amount, note, product_id ) VALUES (1, 25, 'controllers', 2);
INSERT INTO good (store_id, amount, note, product_id ) VALUES (2, 145, 'machine1', 1);
INSERT INTO good (store_id, amount, note, product_id ) VALUES (3, 45, 'machine2', 3);

INSERT INTO employee (first_name, last_name, middle_name, department) VALUES ('Kolya', 'Ivanov', 'Petrovich', 'Software');
INSERT INTO employee (first_name, last_name, middle_name, department) VALUES ('Irina', 'Ivanova', 'Petrovna', 'Documents');
INSERT INTO employee (first_name, last_name, middle_name, department) VALUES ('Ura', 'Nikolaev', 'Alexeevich', 'Testing');
INSERT INTO employee (first_name, last_name, middle_name, department) VALUES ('Olga', 'Opasnova', 'Egorovna', 'Development');

INSERT INTO employee__store (employee_id, store_id, expiration_date) VALUES (1, 1, '2021-10-04');
INSERT INTO employee__store (employee_id, store_id, expiration_date) VALUES (1, 2, '2021-10-04');
INSERT INTO employee__store (employee_id, store_id, expiration_date) VALUES (1, 3, '2021-10-04');
INSERT INTO employee__store (employee_id, store_id, expiration_date) VALUES (2, 4, '2021-12-05');
INSERT INTO employee__store (employee_id, store_id, expiration_date) VALUES (3, 1, '2021-12-04');
INSERT INTO employee__store (employee_id, store_id, expiration_date) VALUES (4, 2, '2021-11-07');
