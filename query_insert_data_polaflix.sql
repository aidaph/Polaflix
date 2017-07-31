INSERT into polaflix.serie (id, name, tipo_serie, descripcion, creador, image_url) 
values (1, "Orange is The New Black", 2, 
				"Piper Chapman (Taylor Schiling), una mujer de Connecticut con una vida estable ", "Jenji Kohan", "imagenes/Orangeisthenewblack.jpg");

insert into polaflix.actor(id, nombre, serie_id) values (1, "Taylor Schiling", 1);
insert into polaflix.actor(id, nombre, serie_id) values (2, "Laura Prepon", 1);
insert into polaflix.actor(id, nombre, serie_id) values (3, "Danielle Brooks", 1);
insert into polaflix.actor(id, nombre, serie_id) values (4, "Taryn Manning", 1);

insert into polaflix.temporada(id, num, serie_id) values (1,1,1);
insert into polaflix.temporada(id, num, serie_id) values (2,2,1);
insert into polaflix.temporada(id, num, serie_id) values (3,3,1);
insert into polaflix.temporada(id, num, serie_id) values (4,4,1);
insert into polaflix.temporada(id, num, serie_id) values (5,5,1);

INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (11, "I wasn't ready", 1, "Sentenced to fifteen months for a crime committed in her youth, Piper Chapman leaves her supportive fiance Larry for her new home: a women's prison.", 1.5, 1);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (12,"Tit Punch", 2, "After insulting the food in front of the prison chef, Piper is starved out by the kitchen staff and struggles to offer up an acceptable apology.", 1.5, 1);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (13, "Lesbian Request Denied ", 3, "Targeted for romance by a fellow prisoner, Piper finds that subtlety is an ineffective approach to letting her suitor down.", 1.5, 1);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (14,"Imaginary Enemies", 4, "Piper gets to know her stern new roommate; the prisoners prepare a farewell party for one of their own; a misplaced screwdriver has dire consequences.", 1.5, 1);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (15,"The Chickening", 5, "When her sighting of a legendary feral chicken polarizes the inmates, Larry wonders if Piper is getting too absorbed in the fishbowl of prison life.", 1.5, 1);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (16,"WAC Pack", 6, "The inmates campaign along racial lines for positions on a prisoners council, but Piper tries to stay above the increasingly raucous competition.", 1.5, 1);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (17,"Blood Donut", 7, "Piper wants the prison's outdoor running track reopened, but in order to get it, she'll have to give her corrections officer something he wants.", 1.5, 1);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (18,"Moscow Mule", 8, "Red gets pressured to smuggle drugs through her kitchen; Larry publishes an article about Piper in the New York Times; two babies come into the world.", 1.5, 1);
INSERT into polaflix.capitulo(id,nombre, num, descripcion, precio, tempo_id) 
values (19,"Fucksgiving ", 9, "Thanksgiving arrives with the promise of a visit by Larry, but Piper's raunchy dance moves land her in solitary with a holiday feast of moldy bologna.", 1.5, 1);
INSERT into polaflix.capitulo(id,nombre, num, descripcion, precio, tempo_id) 
values (110,"Bora Bora Bora", 10, "Pennsatucky discovers a new skill; the inmates try to scare delinquent teenagers straight; Pornstache's side business suffers a tragic setback.", 1.5, 1);
INSERT into polaflix.capitulo(id,nombre, num, descripcion, precio, tempo_id) 
values (111,"Tall Men with Feelings", 11, "The prisoners mourn one of their own and even a drunken Pornstache reveals surprising emotions; Larry gives a revealing radio interview.", 1.5, 1);
INSERT into polaflix.capitulo(id,nombre, num, descripcion, precio, tempo_id) 
values (112,"Fool Me Once", 12, "Painful truths reorient several relationships and careers; Pennsatucky feels disrespected by Piper, which is not good; Larry delivers an ultimatum.", 1.5, 1);
INSERT into polaflix.capitulo(id,nombre, num, descripcion, precio, tempo_id) 
values (113,"Can't Fix Crazy", 13, "Red's scheme to reclaim her kitchen backfires; the inmates stage a Christmas pageant; Piper's plans unravel even as she realizes her life is in jeopardy.", 1.5, 1);

INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (114,"Thirsty Bird", 1, "Piper's world is turned upside down when she is forced to confront the consequences of her actions and face new challenges.", 1.5, 2);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (115,"Looks Blue, Tastes Red", 2, "A mock Job Fair provides Taystee with a chance to show off her business smarts; Red feels isolated from her prison family.", 1.5, 2);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (116, "Hugs Can Be Deceiving", 3, "Piper is challenged by her Soso experience; Morello gets her heart broken; a figure from Taystee's past arrives to disturb the status quo.", 1.5, 2);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (117,"A Whole Other Hole", 4, "Sophia gives the women a much-needed lesson in female anatomy; Morello takes a detour; Larry makes some life changes.", 1.5, 2);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (118,"Low Self Esteem City", 5, "A bathroom turf war sees deeper lines drawn in the sand as Gloria and Vee go head to head. Piper receives devastating news.", 1.5, 2);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (119,"You Also Have a Pizza", 6, "Love is in the air as the inmates prepare for a Valentine's Day party; Red makes an intriguing new discovery. Larry asks Piper to be his prison mole.", 1.5, 2);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (120,"Comic Sans", 7, "Piper starts a prison newsletter with the help of Healy and a few other inmates; Vee launches an entrepreneurial enterprise.", 1.5, 2);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (121,"Appropriately Sized Pots", 8, "Piper faces a new backlash over special privileges; Caputo feels pressure to toughen up, resulting in administrative changes.", 1.5, 2);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (122,"40 Oz. of Furlough", 9, "Piper's relationship with Larry faces a real-world test; Red's effort to redeem herself is finally rewarded. A familiar figure returns to Litchfield.", 1.5, 2);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (123,"Little Mustachioed Shit", 10, "The guards get tougher in a bid to turn up prison contraband; a big, lingering secret is finally revealed.", 1.5, 2);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (124,"Take a Break from Your Values", 11, "Piper is shocked at an unexpected change in her status; Soso's hunger strike attracts new support that takes on a religious fervor.", 1.5, 2);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (125,"It Was the Change", 12, "Tensions run high as a prison power outage forces several issues to come to light. Piper finds herself compromised and is forced to think on her feet.", 1.5, 2);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (126,"We Have Manners. We're Polite. ", 13,  "Several futures hang in the balance as the inmates face and confront their worst nightmares: Life will never be the same again.", 1.5, 2);

INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (127,"Mother's Day ", 1, "Caputo's kinder, gentler new regime includes organizing a Mother's Day fair for the inmates that brings up a LOT of mixed feelings about family.", 1.5, 3);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (128, "Bed Bugs and Beyond", 2, "Tempers flare when bed bugs invade. Alex cracks. Red lashes out at Piper. Aleida interferes with Daya and Bennett. Caputo gets bad news.", 1.5, 3);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (129,"Empathy Is a Boner Killer", 3, "Nicky's stash situation gets complicated. Alex and Crazy Eyes try a new drama class. Red assists Healy with a personal matter.", 1.5, 3);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (130,"Finger in the Dyke", 4, "Big Boo comes up with a scheme to make money. Daya, Taystee and Crazy Eyes confront reality. Caputo tries to make a good impression on some visitors.", 1.5, 3);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (131,"Fake It Till You Fake It Some More", 5, "Rumors fly among the inmates about a new, higher-paying job assignment, especially when they have to take a test for it", 1.5, 3);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (132,"Ching Chong Chang", 6, "Regime change isn't going over well with the staff, but Red makes it work for her. Lorna finds a way to meet men. Chang shows her private side.", 1.5, 3);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (133,"Tongue-Tied ", 7, "Norma’s healing powers draw more believers. Piper creates a new business venture. Caputo breaks in the new hires.", 1.5, 3);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (134,"Fear, and Other Smells ", 8, "Piper gets creative in order to grow her business. Crazy Eyes’s sci-fi sex story for drama class is a hit. Alex doesn’t trust new inmate Lolly.", 1.5, 3);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (135,"Where My Dreidel At", 9, "Too many inmates seem to be getting religion, so a rabbi comes to visit. Leanne tries to organize Norma's followers.", 1.5,3);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (136,"A Tittin' and a Hairin'", 10, "Pennsatucky, Piper, Crazy Eyes and Lorna get closer with their new admirers. Tensions between Sophia and Gloria, and Alex and Lolly escalate.", 1.5, 3);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (137,"We Can Be Heroes", 11, "Caputo and Piper confront labor issues. A miracle occurs in Norma's group. Crazy Eyes's erotica winds up in the hands of the staff.", 1.5, 3);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (138,"Don’t Make Me Come Back There ", 12,  "Daya goes into labor. Sophia suffers a hate crime. Stella helps Piper with a business snag. Taystee takes on a new role.", 1.5, 3);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (139,"Trust No Bitch", 12,  "Miracles and conversions occur, but Piper and Caputo know that some situations can't be dealt with through spiritual means.", 1.5, 3);

INSERT into polaflix.serie (id, name, tipo_serie, descripcion, creador, image_url) 
values (2, "13 reasons why", 2, 
				"El adolescente Clay Jensen (Dylan Minnette) vuelve un día a casa después del colegio y encuentra una misteriosa caja con su nombre. Dentro descubre una cinta grabada por Hannah Baker 
                (Katherine Langford).", "Kyle Patrick Alvarez", "imagenes/13_reasons.jpg");

insert into polaflix.actor(id, nombre, serie_id) values (21, "Dylan Minnette", 2);
insert into polaflix.actor(id, nombre, serie_id) values (22, "Katherine Langford", 2);
insert into polaflix.actor(id, nombre, serie_id) values (23, "Christian Navarro", 2);

insert into polaflix.temporada(id, num, serie_id) values (6,1,2);

INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (21, "Tape 1, Side A", 1, "As the school mourns the death of Hannah Baker, her friend Clay receives a box of tapes with messages she recorded before she committed suicide.", 1.5, 6);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (22,"Tape 1, Side B", 2, "Hannah makes friends with Jessica and Alex, two other new students. Justin doesn't show up at school, and Hannah's mother finds something troubling.", 1.5, 6);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (23, "Tape 2, Side A", 3, "Jealousy and gossip take a toll on Hannah's relationships. As Alex struggles with feelings regret, the guys pressure Clay into getting drunk.", 1.5, 6);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (24,"Tape 2, Side B", 4, "Hannah thinks someone is stalking her and sets a trap. Hannah's mother confronts the principal, and Clay strikes back at someone who wronged Hannah.", 1.5, 6);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (25, "Tape 3, Side A", 5, "Hannah and Clay connect at the school dance, but a crass rumor ruins the mood. Clay takes Courtney to visit Hannah's grave.", 1.5, 6);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (26,"Tape 3, Side B", 6, "Hannah's date on Valentine's Day doesn't go as planned. Alex gets in a big fight at school and has to face the honor board.", 1.5, 6);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (27, "Tape 4, Side A", 7, "Another student sabotages Hannah during a class project. Clay's nightmares about Hannah spill over into the daytime.", 1.5, 6);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (28,"Tape 4, Side B", 8, "Inspired by a friend's poetry reading, Hannah pours her heart out. Tony confides in Clay about the night of Hannah's death.", 1.5, 6);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (29, "Tape 5, Side A", 9, "Hannah witnesses a traumatic event at a summertime party. Clay tries to reason with Justin, and Marcus warns him that the worst is yet to come.", 1.5, 6);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (210,"Tape 5, Side B", 10, "A distraught Hannah gets a ride home from the party. Jessica's behavior grows increasingly erratic, and Clay learns the truth behind a tragedy.", 1.5, 6);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (211, "Tape 6, Side A", 11, "Clay and Hannah grow closer. While Clay spends a heartbreaking night listening to his tape with Tony, tensions boil over at Bryce's house.", 1.5, 6);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (212,"Tape 6, Side B", 12, "Hannah winds up at a party after an argument with her parents. The students are served with subpoenas, and Justin wrestles with conflicting loyalties.", 1.5, 6);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (213,"Tape 7, Side A", 13, "Hannah seeks help from Mr. Porter, the school counselor. Clay plays the new tape for Tony and weighs what to do next", 1.5, 6);

INSERT into polaflix.serie (id, name, tipo_serie, descripcion, creador, image_url) 
values (3, "The Get Down", 1, 
				"The Get Down focuses on 1970s New York City - broken down and beaten up, violent, cash strapped except each other,
                armed only with verbal games, improvised dance steps, some magic markers and spray cans.", 
                "Baz Luhrmann", "imagenes/the_get_down.jpg");

insert into polaflix.actor(id, nombre, serie_id) values (31, "Justice Smith", 3);
insert into polaflix.actor(id, nombre, serie_id) values (32, "Herizen F. Guardiola", 3);
insert into polaflix.actor(id, nombre, serie_id) values (33, "Shameik Moore", 3);
insert into polaflix.actor(id, nombre, serie_id) values (34, "Skylan Brooks", 3);
insert into polaflix.actor(id, nombre, serie_id) values (35, "Jaden Smith", 3);
insert into polaflix.actor(id, nombre, serie_id) values (36, "Tremaine Brown Jr", 3);

insert into polaflix.temporada(id, num, serie_id) values (7,1,3);

INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (31, "Where There Is Ruin, There Is Hope for a Treasure ", 1, "Zeke's resolve to woo a girl sends him into a dizzying, dangerous nightclub scene, where he crosses paths with a nimble local legend.", 1.5, 7);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (32,"Seek Those Who Fan Your Flames ", 2, "The guys seek spiritual advice from a grandmaster. Mylene's future might be in the hands of her father and politically powerful uncle.", 1.5, 7);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (33, "Darkness Is Your Candle", 3, "Disgraced record producer Jackie Moreno wants to shepherd Mylene's singing career. Boo-Boo plays a rare bootleg tape at a party, inviting trouble.", 1.5, 7);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (34,"Forget Safety, Be Notorious", 4, "After a citywide blackout, Papa Fuerte takes a shine to mayoral candidate Ed Koch. Shao finds himself on the outs with Flash and tries to make amends", 1.5, 7);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (35, "You Have Wings, Learn to Fly", 5, "The Get Down Boys apply their skills in a dicey situation as Zeke hurries to make a meeting. Mylene's quest for a contract takes an unexpected turn.", 1.5, 7);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (36,"Raise Your Words, Not Your Voice", 6, "Dizzee has a new experience at a secret party in the city. As the guys gear up for an explosive DJ battle, Zeke boards a political rollercoaster.", 1.5, 7);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (37, "Unfold Your Own Myth", 7, "Tensions between Shao and the boys threaten to destabilize the group. With her star on the rise, Mylene faces new expectations and pressures.", 1.5, 7);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (38,"The Beat Says, This Is the Way", 8, "Zeke's Ivy League meeting goes off the rails. Ra-Ra has a bold proposition for Fat Annie, resulting in an explosive musical showdown at Les Inferno.", 1.5, 7);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (39, "One by One, Into the Dark", 9, "Confronted by ultimatums, Zeke and Mylene each must make a tough choice. Annie Pitches a deal to skeptical a Shao and a resentful Cadillac.", 1.5, 7);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (310,"Gamble Everything ", 10, "Mylene has a fateful encounter with her idol, the Cruz family reaches a critical juncture, a revelation strikes Ra-Ra, and Shao takes rash action.", 1.5, 7);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (311, "Only from Exile Can We Come Home", 11, "While the B-boy community rallies in defense of the get down. Mylene's musical fate hangs in the balance, and Zeke receives some life-altering news.", 1.5, 7);

#select u.* from polaflix.usuario as u;
#select u.* from polaflix.usuario_series_empezadas as u where u.usuario_id=1;

## Add serie
INSERT into polaflix.serie (id, name, tipo_serie, descripcion, creador, image_url) 
values (4, "Westworld", 2, 
				"Westworld is a dark odyssey about the dawn of artificial consciousness and the evolution of sin. Set at the intersection of the
                near future and the reimagined past, it explores a world in which every human appetite can be indulged.", 
                "Jonathan Nolan", "imagenes/westworld.jpg");

insert into polaflix.actor(id, nombre, serie_id) values (41, "Evan Rachel Wood", 4);
insert into polaflix.actor(id, nombre, serie_id) values (42, "Anthony Hopkins", 4);
insert into polaflix.actor(id, nombre, serie_id) values (43, " Ed Harris", 4);
insert into polaflix.actor(id, nombre, serie_id) values (44, "Thandie Newton", 4);
insert into polaflix.actor(id, nombre, serie_id) values (45, "Jeffrey Wright", 4);
insert into polaflix.actor(id, nombre, serie_id) values (46, "James Marsden", 4);

insert into polaflix.temporada(id, num, serie_id) values (8,1,4);

INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (41, "The Original", 1, 
"As another day of fantasy plays out in Westworld top programmer Bernard Lowe alerts park founder 
Dr. Robert Ford about incidents of aberrant behavior cropping up in some recently re-coded hosts. ", 1.5, 8);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (42,"Chestnut", 2, "A pair of guests arrive at Westworld with different expectations and agendas.
 Bernard and Quality Assurance head Theresa Cullen debate whether a recent host anomaly is contagious.", 1.5, 8);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (43, "The Stray", 3, "Elsie and Stubbs head into the hills in pursuit of a missing host. 
Teddy gets a new backstory, which sets him off in pursuit of a new villain, leaving Dolores alone in Sweetwater. ", 1.5, 8);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (44,"Dissonance Theory", 4, "Dolores joins William and Logan on a bounty hunt in the badlands.
 The Man in Black, with Lawrence in tow, finds a critical clue in his search to unlock the maze.", 1.5, 8);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (45, "Contrapasso", 5, "Dolores, William, and Logan reach Pariah, a town built on decadence and transgression — and are recruited for a dangerous mission. 
The Man in Black meets an unlikely ally in his search to unlock the maze.", 1.5, 8);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (46,"The Adversary", 6, "Lutz is charmed by Maeve; Elsie discovers evidence that could point to sabotage; the Man in Black and Teddy clash with a garrison.", 1.5, 8);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (47, "Trompe L'Oeil", 7, "Dolores and William journey into treacherous terrain; Maeve delivers an ultimatum; Bernard considers his next move.", 1.5, 8);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (48,"Trace Decay ", 8, "Bernard struggles with a mandate; Maeve looks to change her script; Teddy is jarred by dark memories.", 1.5, 8);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (49, "The Well-Tempered Clavier ", 9, "Dolores and Bernard reconnect with their pasts; Maeve makes a bold proposition to Hector; Teddy finds enlightenment, at a price.", 1.5, 8);
INSERT into polaflix.capitulo(id, nombre, num, descripcion, precio, tempo_id) 
values (410,"The Bicameral Mind", 10, "Ford unveils his bold new narrative; Dolores embraces her identity; Maeve sets her plan in motion.", 1.5, 8);

insert into polaflix.usuario(id, isban, username, password, cuota_fija) values (1, "ES6621000418401234567891","nicky", "nicky123", false);
# Primer cursor añadido a la ultima temporada de OITNB
insert into polaflix.cursor_serie(id, ultima_temporada_id, user_id, serie_id, ultimo_capitulo_id) values (1, 3, 1, 1, 130);
insert into polaflix.cursor_serie(id, ultima_temporada_id, user_id, serie_id) values (2, 1, 1, 2);
insert into polaflix.cursor_serie(id, ultima_temporada_id, user_id, serie_id,ultimo_capitulo_id) values (3, 1, 1, 3, 36);
insert into polaflix.cursor_serie(id, ultima_temporada_id, user_id, serie_id) values (4, 1, 1, 4);

insert into polaflix.usuario_series_empezadas(usuario_id, series_empezadas_id) values (1, 1);
insert into polaflix.usuario_series_empezadas(usuario_id, series_empezadas_id) values (1, 3);
insert into polaflix.usuario_series_pendientes(usuario_id, series_pendientes_id) values (1, 2);

insert into polaflix.factura(id, fecha, importe_total, user_id) values (1, "2017-06-30", 0, 1);
insert into polaflix.factura(id, fecha, importe_total, user_id) values (2, "2017-07-31", 0, 1);


insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (1, "2017-06-23", 11, 1);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (2, "2017-06-23", 12, 1);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (3, "2017-06-23", 13, 1);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (4, "2017-06-23", 14, 1);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (5, "2017-06-24", 15, 1);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (6, "2017-06-24", 16, 1);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (7, "2017-06-24", 17, 1);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (8, "2017-06-25", 18, 1);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (9, "2017-06-26", 19, 1);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (10, "2017-06-26", 120, 1);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (11, "2017-06-28", 121, 1);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (12, "2017-07-03", 122, 2);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (13, "2017-07-03", 123, 2);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (14, "2017-07-04", 124, 2);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (15, "2017-07-05", 125, 2);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (16, "2017-07-06", 126, 2);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (17, "2017-07-07", 127, 2);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (18, "2017-07-08", 128, 2);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (19, "2017-07-08", 129, 2);
insert into polaflix.capitulo_visualizado(id, fecha, capitulo_id, factura_id) values (20, "2017-07-09", 130, 2);

#select u.* from polaflix.usuario as u;
select c.* from polaflix.capitulo_visualizado as c;

