-- username is mjood and password is abs232
INSERT INTO Users(id, name, email, gender, status, username, password) VALUES (1, 'User 1', 'Addulmajeed@mail.com', 'male','active','mjood', '$2y$10$.c2dKDayNmOjReV4sHSyeeYM8k58uha2MuiYfoEorWn.vRP1QnD6C');
-- username is amer and password is ss1254
INSERT INTO Users(id, name, email, gender, status, username, password) VALUES (2, 'User 2', 'Amer@mail.com', 'male','active','amer', '$2y$10$TrQO/Fqd5E6MxLi22naoSuVSvVnEKu/gZ/WFjo3Huzfq180PJxP72');
-- username is saleh and password is sass5
INSERT INTO Users(id, name, email, gender, status, username, password) VALUES (3, 'User 3', 'Saleh@mail.com', 'female','active','saleh', '$2y$10$Ho9kdXXs5YpzOqeU54es6uTPVMuSjahBLQT3XrghSsJlYQ7KhUWKe');
-- username is saud and password is msa56
INSERT INTO Users(id, name, email, gender, status, username, password) VALUES (4, 'User 4', 'Saud@mail.com', 'female','inactive','saud', '$2y$10$8cw04VUlaEqv1UpMsV6mNezLSnwAXdAJWUnkYF4.a4VPxw73fEMvO');

INSERT INTO Post(id, title, body, user_id) VALUES (1, 'Post 1', 'this is body', 1);
INSERT INTO Post(id, title, body, user_id) VALUES (2, 'Post 2', 'this is body', 1);
INSERT INTO Post(id, title, body, user_id) VALUES (3, 'Post 3', 'this is body', 2);
INSERT INTO Post(id, title, body, user_id) VALUES (4, 'Post 4', 'this is body', 2);
INSERT INTO Post(id, title, body, user_id) VALUES (5, 'Post 5', 'this is body', 3);

INSERT INTO Comment(id, name, email, body, post_id) VALUES (1, 'Comment 1', 'sinha_brahmabrata_sen@zboncak.com' ,'Ipsa ea qui. Id animi ipsam. Maxime temporibus repudiandae.', 1);
INSERT INTO Comment(id, name, email, body, post_id) VALUES (2, 'Comment 2', 'sinha_brahmabrata_sen@zboncak.com' ,'Ipsa ea qui. Id animi ipsam. Maxime temporibus repudiandae.', 1);
INSERT INTO Comment(id, name, email, body, post_id) VALUES (3, 'Comment 3', 'sinha_brahmabrata_sen@zboncak.com' ,'Ipsa ea qui. Id animi ipsam. Maxime temporibus repudiandae.', 1);
INSERT INTO Comment(id, name, email, body, post_id) VALUES (4, 'Comment 1', 'sinha_brahmabrata_sen@zboncak.com' ,'Ipsa ea qui. Id animi ipsam. Maxime temporibus repudiandae.', 2);
INSERT INTO Comment(id, name, email, body, post_id) VALUES (5, 'Comment 2', 'sinha_brahmabrata_sen@zboncak.com' ,'Ipsa ea qui. Id animi ipsam. Maxime temporibus repudiandae.', 2);
INSERT INTO Comment(id, name, email, body, post_id) VALUES (6, 'Comment 1', 'hiranmaya_pilla_i@botsford.org' ,'Ipsa ea qui. Id animi ipsam. Maxime temporibus repudiandae.', 3);