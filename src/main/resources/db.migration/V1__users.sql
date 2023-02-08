CREATE TABLE IF NOT EXISTS users
(
    id                BIGSERIAL PRIMARY KEY,
    telegram_user_id  BIGINT    UNIQUE NOT NULL
);