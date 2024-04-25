INSERT INTO roles (role_name) VALUES ('USER');
INSERT INTO roles (user_id, role_name) VALUES ('USER',(SELECT id FROM accounts WHERE username='user1'));
INSERT INTO roles (user_id, role_name) VALUES ('USER',(SELECT id FROM accounts WHERE username='user2'));
