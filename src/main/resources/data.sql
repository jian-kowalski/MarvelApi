-- Charactes

INSERT INTO CHARACTER (ID, NAME, DESCRIPTION, MODIFIED, EXTENSION, PATH) VALUES (1, 'Capitão América', 'O segundo melhor', CURRENT_TIMESTAMP(), 'http://i.annihil.us/u/prod/marvel/i/mg/3/50/526548a343e4b', 'jpg');
INSERT INTO CHARACTER (ID, NAME, DESCRIPTION, MODIFIED, EXTENSION, PATH) VALUES (2, 'Homem de Ferro', 'O melhor',CURRENT_TIMESTAMP(), 'http://i.annihil.us/u/prod/marvel/i/mg/3/50/526548a343e4b', 'jpg');
INSERT INTO CHARACTER (ID, NAME, DESCRIPTION, MODIFIED, EXTENSION, PATH) VALUES (3, 'Hulk', 'O verde que pode acaber como o Thanos', CURRENT_TIMESTAMP(), 'http://i.annihil.us/u/prod/marvel/i/mg/3/50/526548a343e4b', 'jpg');
INSERT INTO CHARACTER (ID, NAME, DESCRIPTION, MODIFIED, EXTENSION, PATH) VALUES (4, 'Thor', 'Era forte, perdeu um olho e engordou muito', CURRENT_TIMESTAMP(), 'http://i.annihil.us/u/prod/marvel/i/mg/3/50/526548a343e4b', 'jpg');
INSERT INTO CHARACTER (ID, NAME, DESCRIPTION, MODIFIED, EXTENSION, PATH) VALUES (5, 'Viúva Negra', 'Ainda vai aparecer muito', CURRENT_TIMESTAMP(), 'http://i.annihil.us/u/prod/marvel/i/mg/3/50/526548a343e4b', 'jpg');
INSERT INTO CHARACTER (ID, NAME, DESCRIPTION, MODIFIED, EXTENSION, PATH) VALUES (6, 'Gavião Arqueiro', 'Ajudou, mas nem tanto', CURRENT_TIMESTAMP(), 'http://i.annihil.us/u/prod/marvel/i/mg/3/50/526548a343e4b', 'jpg');

-- Comics

INSERT INTO COMIC (ID, TITLE, DESCRIPTION, NUMBER, DIGITAL_ID, MODIFIED, VARIANT_DESCRIPTION,  CHARACTER_ID) VALUES (1, 'Capitão América-1l', 's simply dummy text of the printing and typesetting', 1, 0, CURRENT_TIMESTAMP(), 'Bitten by a radioactive spider', 1);
INSERT INTO COMIC (ID, TITLE, DESCRIPTION, NUMBER, DIGITAL_ID, MODIFIED, VARIANT_DESCRIPTION,  CHARACTER_ID) VALUES (2, 'Capitão América-2', 's simply dummy text of the printing and typesetting', 1, 0, CURRENT_TIMESTAMP(), 'Bitten by a radioactive spider', 1);
INSERT INTO COMIC (ID, TITLE, DESCRIPTION, NUMBER, DIGITAL_ID, MODIFIED, VARIANT_DESCRIPTION,  CHARACTER_ID) VALUES (3, 'Capitão América-3', 's simply dummy text of the printing and typesetting', 5, 0, CURRENT_TIMESTAMP(), 'Bitten by a radioactive spider', 1);

INSERT INTO COMIC (ID, TITLE, DESCRIPTION, NUMBER, DIGITAL_ID, MODIFIED, VARIANT_DESCRIPTION,  CHARACTER_ID) VALUES (4, 'Homem de Ferro- 2', 's simply dummy text of the printing and typesetting', 1, 0, CURRENT_TIMESTAMP(), 'Bitten by a radioactive spider', 2);
INSERT INTO COMIC (ID, TITLE, DESCRIPTION, NUMBER, DIGITAL_ID, MODIFIED, VARIANT_DESCRIPTION,  CHARACTER_ID) VALUES (5, 'Homem de Ferro- 3', 's simply dummy text of the printing and typesetting', 3, 1, CURRENT_TIMESTAMP(), 'Bitten by a radioactive spider', 2);
INSERT INTO COMIC (ID, TITLE, DESCRIPTION, NUMBER, DIGITAL_ID, MODIFIED, VARIANT_DESCRIPTION,  CHARACTER_ID) VALUES (6, 'Homem de Ferro- 8', 's simply dummy text of the printing and typesetting', 2, 0, CURRENT_TIMESTAMP(), 'Bitten by a radioactive spider', 2);

INSERT INTO COMIC (ID, TITLE, DESCRIPTION, NUMBER, DIGITAL_ID, MODIFIED, VARIANT_DESCRIPTION,  CHARACTER_ID) VALUES (7, 'Immortal Hulk - 5', 's simply dummy text of the printing and typesetting',0, 1, CURRENT_TIMESTAMP(), 'Bitten by a radioactive spider', 3);
INSERT INTO COMIC (ID, TITLE, DESCRIPTION, NUMBER, DIGITAL_ID, MODIFIED, VARIANT_DESCRIPTION,  CHARACTER_ID) VALUES (8, 'O Incrível Hulk - 1', 's simply dummy text of the printing and typesetting',0, 1,  CURRENT_TIMESTAMP(), 'Bitten by a radioactive spider', 3);
INSERT INTO COMIC (ID, TITLE, DESCRIPTION, NUMBER, DIGITAL_ID, MODIFIED, VARIANT_DESCRIPTION,  CHARACTER_ID) VALUES (9, 'Hulk Contra o Mundo', 's simply dummy text of the printing and typesetting',0, 2,  CURRENT_TIMESTAMP(), 'Bitten by a radioactive spider', 3);

INSERT INTO COMIC (ID, TITLE, DESCRIPTION, NUMBER, DIGITAL_ID, MODIFIED, VARIANT_DESCRIPTION,  CHARACTER_ID) VALUES (11, 'Thor - 1', 's simply dummy text of the printing and typesetting',0,1,  CURRENT_TIMESTAMP(), 'Bitten by a radioactive spider', 4);
INSERT INTO COMIC (ID, TITLE, DESCRIPTION, NUMBER, DIGITAL_ID, MODIFIED, VARIANT_DESCRIPTION,  CHARACTER_ID) VALUES (12, 'Thor: 2', 's simply dummy text of the printing and typesetting',0, 2,  CURRENT_TIMESTAMP(), 'Bitten by a radioactive spider', 4);
INSERT INTO COMIC (ID, TITLE, DESCRIPTION, NUMBER, DIGITAL_ID, MODIFIED, VARIANT_DESCRIPTION,  CHARACTER_ID) VALUES (10, 'Thor - 3', 's simply dummy text of the printing and typesetting',0, 4,  CURRENT_TIMESTAMP(), 'Bitten by a radioactive spider', 4);

