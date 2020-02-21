CREATE TABLE IF NOT EXISTS admins (id serial, name varchar(50) not null, kana varchar(50) not null, email varchar(50) not null unique, password varchar(100) not null, can_show_all_company boolean, constraint admins_PKC primary key (id));
DELETE FROM admins;

INSERT INTO admins (name,kana,password,email,can_show_all_company)VALUES('平岡優里','ヒラオカユリ','0427yuri','yuri0427jp@yahoo.co.jp',true);
INSERT INTO admins (name,kana,password,email,can_show_all_company)VALUES('原田大樹','ハラダヒロキ','0301hiroki','hiroki0301jp@yahoo.co.jp',true);
INSERT INTO admins (name,kana,password,email,can_show_all_company)VALUES('平岡京子','ヒラオカキョウコ','0301kyouko','kyouko0301jp@yahoo.co.jp',true);

drop table if exists instructors cascade;
CREATE TABLE IF NOT EXISTS instructors (id serial, name varchar(50) not null, kana varchar(50) not null, email varchar(50) not null unique, password varchar(100) not null, affiliation varchar(50) not null, remarks text,constraint instructors_PKC primary key (id));

INSERT INTO instructors (name,kana,email,password,affiliation,remarks)VALUES('伊賀政行','イガマサユキ','masayukijp@yahoo.co.jp','1111imasayuki','ラクス株式会社','週末は授業ができません');
INSERT INTO instructors (name,kana,email,password,affiliation,remarks)VALUES('佐藤健','サトウタケル','takerujp@yahoo.co.jp','2222satoutakeru','ラクスパートナーズ',NULL);
INSERT INTO instructors (name,kana,email,password,affiliation,remarks)VALUES('菅田将暉','スダマサキ','masakijp@yahoo.co.jp','3333masaki','ラクス株式会社',NULL);
