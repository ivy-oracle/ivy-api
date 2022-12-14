CREATE TABLE eth_block (
    block_number NUMERIC PRIMARY KEY,
    block_hash TEXT UNIQUE NOT NULL,
    block_timestamp TIMESTAMP NOT NULL
);

CREATE TABLE eth_transaction (
    transaction_hash TEXT PRIMARY KEY,
    from_address VARCHAR(50) NOT NULL,
    to_address VARCHAR(50) NOT NULL, 
    value NUMERIC NOT NULL,
    gas NUMERIC NOT NULL,
    gas_price NUMERIC NOT NULL,
    nonce NUMERIC NOT NULL,
    transaction_index NUMERIC NOT NULL,
    block_number NUMERIC NOT NULL,
    CONSTRAINT fk_eth_block FOREIGN KEY(block_number) REFERENCES eth_block(block_number)
);
