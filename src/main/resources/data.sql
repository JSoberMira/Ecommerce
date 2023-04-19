INSERT INTO PRODUCT(ID, SEQUENCE) VALUES(1, 10);
INSERT INTO PRODUCT(ID, SEQUENCE) VALUES(2, 7);
INSERT INTO PRODUCT(ID, SEQUENCE) VALUES(3, 15);
INSERT INTO PRODUCT(ID, SEQUENCE) VALUES(4, 13);
INSERT INTO PRODUCT(ID, SEQUENCE) VALUES(5, 6);

INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(11, 1, true, false);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(12, 1, false, false);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(13, 1 , true, false);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(21, 2, false, false);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(22, 2, false, false);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(23, 2, true, true);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(31, 3, true, false);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(32, 3, true, false);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(33, 3, false, false);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(41, 4, false, false);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(42, 4, false, false);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(43, 4, false, false);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(44, 4, true, true);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(51, 5, true, false);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(52, 5, false, false);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(53, 5, false, false);
INSERT INTO SIZE (ID, PRODUCT_ID, BACK_SOON , SPECIAL) VALUES(54, 5, true, true);


INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (11, 0);
INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (12, 0);
INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (13, 0);
INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (22, 0);
INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (31, 10);
INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (32, 10);
INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (33, 10);
INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (41, 0);
INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (42, 0);
INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (43, 0);
INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (44, 10);
INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (51, 10);
INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (52, 10);
INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (53, 10);
INSERT INTO STOCK(SIZE_ID, QUANTITY) VALUES (54, 10);