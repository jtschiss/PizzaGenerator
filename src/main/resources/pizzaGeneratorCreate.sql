
-- Create tables
CREATE TABLE user (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    username varchar(50) NOT NULL,
    password varchar(255) NOT NULL,
    group_id INT -- foreign key
);

CREATE TABLE toppings (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    topping varchar(20) NOT NULL,
    popularity INT
);

CREATE TABLE liked_toppings (
    user_id INT NOT NULL, -- foreign key
    topping_id INT NOT NULL, -- foreign key
    CONSTRAINT liked_toppings_pk PRIMARY KEY (user_id, topping_id)
);

CREATE TABLE groups (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(100) NOT NULL,
    password varchar(255) NOT NULL,
    owner_id INT NOT NULL -- foreign key
);

-- Create foreign key constraints
ALTER TABLE user
ADD CONSTRAINT user_groups_fk
FOREIGN KEY (group_id) REFERENCES groups (id);

ALTER TABLE liked_toppings
ADD CONSTRAINT liked_toppings_user_fk
FOREIGN KEY (user_id) REFERENCES user (id);

ALTER TABLE liked_toppings
ADD CONSTRAINT liked_toppings_toppings_fk
FOREIGN KEY (topping_id) REFERENCES toppings (id);

ALTER TABLE groups
ADD CONSTRAINT groups_user_fk
FOREIGN KEY (owner_id) REFERENCES user (id);
