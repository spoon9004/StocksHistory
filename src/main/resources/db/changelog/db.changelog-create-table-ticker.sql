CREATE TABLE ticker (
    Id UUID PRIMARY KEY,
    user_id BIGINT NOT NULL,
    ticker_name VARCHAR(255) NOT NULL,
    date_ticker TIMESTAMP,
    open_value DECIMAL(19, 2),
    close_value DECIMAL(19, 2),
    high_value DECIMAL(19, 2),
    low_value DECIMAL(19, 2)
);