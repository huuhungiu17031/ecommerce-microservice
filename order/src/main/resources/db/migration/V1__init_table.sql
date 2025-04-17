-- Create ENUM type for status
CREATE TYPE order_status AS ENUM (
    'PENDING',
    'PAID',
    'PROCESSING',
    'SHIPPED',
    'DELIVERED',
    'CANCELLED',
    'RETURNED',
    'FAILED'
);

CREATE TABLE IF NOT EXISTS orders (
    id            SERIAL PRIMARY KEY,
    user_id       INTEGER                   NOT NULL,
    shop_id       INTEGER                   NOT NULL,
    request_id    VARCHAR(255)              NOT NULL,
    total_items   INTEGER,
    total_price   INTEGER                   NOT NULL,
    status        order_status              NOT NULL
);

CREATE TABLE IF NOT EXISTS order_item (
    id            SERIAL PRIMARY KEY,
    product_id    INTEGER                   NOT NULL,
    quantity      INTEGER                   NOT NULL,
    price         NUMERIC(10, 2)            NOT NULL,
    order_id      INTEGER
);

ALTER TABLE order_item
ADD CONSTRAINT fk_order_id 
FOREIGN KEY (order_id) REFERENCES orders(id) 
ON DELETE CASCADE;
