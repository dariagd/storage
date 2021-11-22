INSERT INTO product (product_id, product_name) VALUES ( 123, 'controller' );
INSERT INTO product (product_id, product_name) VALUES ( 55, 'microchip' );
INSERT INTO product (product_id, product_name) VALUES ( 34, 'processor' );
INSERT INTO product (product_id, product_name) VALUES ( 71, 'machine1' );
INSERT INTO product (product_id, product_name) VALUES ( 72, 'machine2' );

INSERT INTO product_composition (parent_id, child_id, amount) VALUES (71, 34, 1);
INSERT INTO product_composition (parent_id, child_id, amount) VALUES (71, 55, 5);
INSERT INTO product_composition (parent_id, child_id, amount) VALUES (71, 123, 13);
INSERT INTO product_composition (parent_id, child_id, amount) VALUES (72, 34, 3);
INSERT INTO product_composition (parent_id, child_id, amount) VALUES (72, 123, 6);

INSERT INTO store (store_id, store_name, address) VALUES ( 12, 'store1', 'moskvoreche' );
INSERT INTO store (store_id, store_name, address) VALUES ( 13, 'store2', 'kashira' );
INSERT INTO store (store_id, store_name, address) VALUES ( 14, 'store3', 'proletarskiy' );
INSERT INTO store (store_id, store_name, address) VALUES ( 15, 'store4', 'leninskiy' );

INSERT INTO good (good_id, store_id, amount, note, product_id ) VALUES (5, 12, 56, 'microchips', 55);
INSERT INTO good (good_id, store_id, amount, note, product_id ) VALUES (2, 12, 100, 'controllers', 123);
INSERT INTO good (good_id, store_id, amount, note, product_id ) VALUES (3, 13, 2, 'machine1', 71);
INSERT INTO good (good_id, store_id, amount, note, product_id ) VALUES (4, 15, 4, 'machine2', 72);

INSERT INTO employee (employee_id, first_name, last_name, middle_name, department) VALUES (1, 'Kolya', 'Ivanov', 'Petrovich', 'Software');
INSERT INTO employee (employee_id, first_name, last_name, middle_name, department) VALUES (3, 'Irina', 'Ivanova', 'Petrovna', 'Documents');
INSERT INTO employee (employee_id, first_name, last_name, middle_name, department) VALUES (6, 'Ura', 'Nikolaev', 'Alexeevich', 'Testing');
INSERT INTO employee (employee_id, first_name, last_name, middle_name, department) VALUES (9, 'Olga', 'Opasnova', 'Egorovna', 'Development');

INSERT INTO employee_store (employee_id, store_id, expiration_date) VALUES (1, 12, '2021-10-04');
INSERT INTO employee_store (employee_id, store_id, expiration_date) VALUES (1, 13, '2021-10-04');
INSERT INTO employee_store (employee_id, store_id, expiration_date) VALUES (1, 14, '2021-10-04');
INSERT INTO employee_store (employee_id, store_id, expiration_date) VALUES (3, 12, '2021-12-05');
INSERT INTO employee_store (employee_id, store_id, expiration_date) VALUES (3, 13, '2021-12-04');
INSERT INTO employee_store (employee_id, store_id, expiration_date) VALUES (9, 12, '2021-11-07');
