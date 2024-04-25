DO $$
BEGIN
  IF NOT EXISTS (SELECT FROM pg_database WHERE datname = 'stockshistory') THEN
    CREATE DATABASE stockshistory;
  END IF;
END $$;