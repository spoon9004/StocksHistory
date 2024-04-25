CREATE TABLE accounts (
    id UUID PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    is_active BOOLEAN,
    google_name VARCHAR(255),
    google_username VARCHAR(255) NOT NULL UNIQUE
);