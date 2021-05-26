INSERT INTO URL (ID, TYPE, URL) VALUES(1, 'DETAIL',  'http://marvel.com/comics/issue/27649/incredible_hulks_2010_604_djurdjevic_70th_anniversary_variant/djurdjevic_70th_anniversary_variant?utm_campaign=apiRef&utm_source=8c27f0c0e1817e44558ed7672272dc95');
INSERT INTO COMIC (ID,
                    DESCRIPTION,
                    DIGITAL_ID,
                    FORMAT,
                    ISSUE_NUMBER,
                    MODIFIED,
                    PAGE_COUNT,
                    RESOURCEURI,
                    TITLE,
                    UPC,
                    VARIANT_DESCRIPTION) 
    VALUES (1,
      'After picking fights with the Juggernaut, Norman Osborn, and the Wolverine clan, the most insane father and son team in the Marvel Universe might actually be bonding.  But everythings about to blow wide open for Bruce Banner and his big, green, barbarian son Skaar when one of the Hulks greatest enemies brings back the most important villainess Bruce Banners ever faced.  Who is the Harpy?  And whose side will Banner take when she and Skaar meet sword to claw in a gamma-powered deathmatch?  Stone might bleed, feathers might fly, and hearts might break in the highest stakes battle yet for Banner and Son! Plus, The Savage SHE-HULK continues her quest to find\r\nJennifer Walters in a back-up by Fred Van Lente and\r\nMichael Ryan!\r\nRated A ...$3.99',
      '0',
      'Comic',
      604,
      CURRENT_TIMESTAMP(),
      40,
      'qualquerbosta',
      'Incredible Hulks (2010) #604 (DJURDJEVIC 70TH ANNIVERSARY VARIANT)',
      '5960606637-60421',
      'DJURDJEVIC 70TH ANNIVERSARY VARIANT'
    );

INSERT INTO COMIC (ID,
                    DESCRIPTION,
                    DIGITAL_ID,
                    FORMAT,
                    ISSUE_NUMBER,
                    MODIFIED,
                    PAGE_COUNT,
                    RESOURCEURI,
                    TITLE,
                    UPC,
                    VARIANT_DESCRIPTION) 
    VALUES (2,
      'The Marvel Age of Comics continues! This time around, Spidey meets his match against such classic villains as Electro and the Lizard, and faces the return of one of his first foes: the Vulture! Plus: Spider-Man vs. the Living Brain, Peter Parkers fight with Flash Thompson, and the wall-crawler tackles the high-flying Human Torch!',
      '0',
      'Digest',
      604,
      '2018-01-22',
      96,
      'http://gateway.marvel.com/v1/public/comics/1308',
      'Marvel Age Spider-Man Vol. 2: Everyday Hero (Digest)',
      '5960611451-00111',
      ''
    );


INSERT INTO COMIC_URL (URL_ID, COMIC_ID) VALUES (1,1);


INSERT INTO CHARACTER(
                      ID, 
                      DESCRIPTION,
                      MODIFIED,
                      NAME,
                      RESOURCEURI,
                      EXTENSION,
                      PATH
                    )
VALUES(1, 
      'Caught in a gamma bomb explosion while trying to save the life of a teenager, Dr. Bruce Banner was transformed into the incredibly powerful creature called the Hulk. An all too often misunderstood hero, the angrier the Hulk gets, the stronger the Hulk gets.',                    
       CURRENT_TIMESTAMP(),
      'Hulk',
      'http://gateway.marvel.com/v1/public/characters/1009351',
      'jpg',
      'http://i.annihil.us/u/prod/marvel/i/mg/5/a0/538615ca33ab0'
      );

INSERT INTO CHARACTER(ID, 
                      DESCRIPTION,
                      MODIFIED,
                      NAME,
                      RESOURCEURI,
                      EXTENSION,
                      PATH
                    )
VALUES(2, 
      'Bitten by a radioactive spider, high school student Peter Parker gained the speed, strength and powers of a spider. Adopting the name Spider-Man, Peter hoped to start a career using his new abilities. Taught that with great power comes great responsibility, Spidey has vowed to use his powers to help people.',                    
      CURRENT_TIMESTAMP(),
      'Spider-Man',
      'http://gateway.marvel.com/v1/public/characters/1009610',
      'jpg',
      'http://i.annihil.us/u/prod/marvel/i/mg/3/50/526548a343e4b'
      );

INSERT INTO CHARACTER_COMIC (COMIC_ID, CHARACTER_ID) VALUES  (1,1);
INSERT INTO CHARACTER_COMIC (COMIC_ID, CHARACTER_ID) VALUES (2,1);




