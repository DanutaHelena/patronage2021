CREATE TABLE PARKING (
    id INTEGER  AUTO_INCREMENT PRIMARY KEY,
    number INT  NOT NULL,
    storey INT NOT NULL,
    type VARCHAR(45) NOT NULL,
    status BIT
);