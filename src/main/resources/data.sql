INSERT INTO tb_user (nome, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (nome, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (nome, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');


INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) values ( 'BootCamp HTML','NULL','NULL');

INSERT INTO tb_offer(edition,start_Moment,end_Moment, course_id) values ( '1.0','2020-07-14T10:00:00','2021-07-14T10:00:00',1 );

INSERT INTO tb_notification(texto,moment,read,route,user_id) values ( 'Obrigo(a) pelo curso','2020-07-14T10:00:00', true,'http://www.escola.com.br', 1);

INSERT INTO tb_resource(title,description,position,img_Uri,type,extemal_Link,offer_id) values ( 'Trilha HTML','Trilha principal do curso',1,'NULL',1,'NULL',1);
INSERT INTO tb_resource(title,description,position,img_Uri,type,extemal_Link,offer_id) values ( 'Forum','Tire suas duvidas',2,'NULL',2,'NULL',1);
INSERT INTO tb_resource(title,description,position,img_Uri,type,extemal_Link,offer_id) values ( 'Lives','Lives Escrusivas para as Turmas',3,'NULL',0,'NULL',1);

INSERT INTO tb_section(title,description,position,img_Uri,resource_id,prerequite_id)values ('Capitulo 01','Nesse capitulo vamos começar',1,'NULL.img',1,null );
INSERT INTO tb_section(title,description,position,img_Uri,resource_id,prerequite_id)values ('Capitulo 01','Nesse capitulo vamos começar',2,'NULL.img',1,1 );
INSERT INTO tb_section(title,description,position,img_Uri,resource_id,prerequite_id)values ('Capitulo 01','Nesse capitulo vamos começar',3,'NULL.img',1,2 );

INSERT INTO tb_enrollment(user_id,offer_id,enroll_Moment,refund_Moment,available,only_Update) values ( 1,1, '2020-07-14T10:00:00', null, true, false );
INSERT INTO tb_enrollment(user_id,offer_id,enroll_Moment,refund_Moment,available,only_Update) values ( 2,1, '2020-07-14T10:00:00', null, true, false );

















