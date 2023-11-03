DROP DATABASE IF EXISTS library_of_things;

CREATE DATABASE TEST;

DROP DATABASE TEST;

CREATE DATABASE library_of_things;

USE library_of_things;

CREATE TABLE users (
    user_id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    email VARCHAR(100),
    PRIMARY KEY(user_id)
);

CREATE TABLE things (
    thing_id INT NOT NULL AUTO_INCREMENT,
    thing_name VARCHAR(100),
    checked_out DATETIME DEFAULT NOW(),
    checked_in DATETIME DEFAULT NOW(),
    checked_out_user_id INT DEFAULT NULL,
    FOREIGN KEY (checked_out_user_id) REFERENCES users(user_id),
    PRIMARY KEY(thing_id)
);

CREATE TABLE thing_categories (
    category_id INT NOT NULL AUTO_INCREMENT,
    category_name VARCHAR(100),
    PRIMARY KEY(category_id),
    thing_id INT DEFAULT NULL,
    FOREIGN KEY (thing_id) REFERENCES things(thing_id)
);