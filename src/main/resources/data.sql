BEGIN;

USE library_of_things;

INSERT INTO users (first_name, last_name, email)
VALUES
    ('Johnnnn', 'Doeee', 'john@example.com'),
    ('Janennnn', 'Smith', 'jane@example.com'),
    ('Michael', 'Johnson', 'michael@example.com'),
    ('Emily', 'Wilson', 'emily@example.com');

INSERT INTO things (thing_name, checked_out, checked_in)
VALUES
    ('Unicycleee', '2023-08-01', '2023-12-01'),
    ('Violin', '2023-05-01', '2023-05-01'),
    ('Leaf Instrument', '2023-05-01', '2023-05-01'),
    ('Pressure Washer', '2023-05-01', '2023-05-01'),
    ('12 Lag Bolts', '2023-08-01', '2023-12-01'),
    ('Multidetektor', '2023-05-02', '2023-05-08'),
    ('3D Printer', '2023-05-02', '2023-05-08'),
    ('Bath Plug', '2023-05-02', '2023-05-08'),
    ('Zirkel', '2023-08-01', '2023-12-01');

INSERT INTO thing_categories (`category_name`)
VALUES
    ('Musical Instruments'),
    ('Tools'),
    ('Sports Equipment'),
    ('Household'),
    ('Spare Parts'),
    ('Burn Essential');

COMMIT;