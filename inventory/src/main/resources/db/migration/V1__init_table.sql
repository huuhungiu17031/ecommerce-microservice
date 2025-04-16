CREATE TABLE IF NOT EXISTS inventory (
    id                      SERIAL PRIMARY KEY,
    inventory_name          VARCHAR(255)           NOT NULL
);

CREATE TABLE IF NOT EXISTS inventory_product (
    id                      SERIAL PRIMARY KEY,
    inventory_id            INT,
    product_id              INT                    NOT NULL,
    quantity                INT                    NOT NULL DEFAULT 0
);

CREATE TABLE IF NOT EXISTS product (
    id                      SERIAL PRIMARY KEY,
    name                    VARCHAR(255),
    description             TEXT,
    price                   INT                    NOT NULL DEFAULT 0,
    shopId                  INT NOT NULL
);

ALTER TABLE inventory_product
ADD CONSTRAINT fk_inventory_id FOREIGN KEY (inventory_id) REFERENCES inventory(id);

ALTER TABLE inventory_product
ADD CONSTRAINT fk_product_id FOREIGN KEY (product_id) REFERENCES product(id);