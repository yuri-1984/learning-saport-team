CREATE TABLE IF NOT EXISTS admins (id serial, name varchar(50) not null, kana varchar(50) not null, email varchar(50) not null unique, password varchar(100) not null, can_show_all_company boolean, constraint admins_PKC primary key (id));
DELETE FROM admins;

INSERT INTO admins (name,kana,email,password,can_show_all_company)VALUES('平岡優里','ヒラオカユリ','0427yuri','yuri0427jp@yahoo.co.jp',true);
INSERT INTO admins (name,kana,email,password,can_show_all_company)VALUES('原田大樹','ハラダヒロキ','0301hiroki','hiroki0301jp@yahoo.co.jp',true);
INSERT INTO admins (name,kana,email,password,can_show_all_company)VALUES('平岡京子','ヒラオカキョウコ','0301kyouko','kyouko0301jp@yahoo.co.jp',true);
commit;