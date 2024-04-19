INSERT INTO toydata (id, name, book_price, description) values (1, 'Белий совун', 0.01, 'Дикий жоский мега крут совун белый летать') ON CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (2, 'Чек Пук', 12, 'Фигурка чека пука крутая умеет стрелять из M4A4 со скинум топливный инжектор') ON CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (3, 'Бетмент', 240, 'Крутотенский блюститель закона русский ответ омереке пукает громка') ON CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (4, 'Барт Симпсон', 1337, 'Лютый дебошир стрелок, амогус вахтанг римский юлий цезарь ром крут') ON CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (5, 'Баби Йода', 69, 'Бабер йода валун крутить двигать Таков путь') ON CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (6, 'Дом', 1069, 'Набор сабери дом и живи в нем а не с родителями ванючка') ON CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (7, 'Машина Бетмен', 1069, 'Набор лихо бетмент компклет собери и уедь ехать в свой дом') ON CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (8, 'Бухатти', 305, 'Набор буххати чирон ухать быстро ловить хрустик смешно нареска') ON CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (9, 'Попуг', 305, 'Набор лихо пекпук собери друг дружи рассказ анекдот про попуг без ног хаха') ON CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (10, 'Майн', 229, 'Набор лихо минисруфт взрывать пещера капатьалмаз дороха убить скелет виграть') ON CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (11, 'Гравити Фолз', 994, 'Настолка граффити фулз смешно игра семья ссора развод') or CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (12, 'Ребенок', 1256, 'Купить ребенок смешно кормить взаимодействие кайф учеба ждать потом снова кайф когда не сможет рассказать') ON CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (13, 'Холмы и овцы', 890, 'Скажи ИА-ИА, таджик чуть-чуть ариец') ON CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (14, 'Че', 940, 'Настолка рыцари взорвать дракон украсть принцесса смешно сестра ссора') ON CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (15, 'Ящер', 1150, 'Купи ящер потом смотри какой он классный а потом стал человек фу') ON CONFLICT (id) DO NOTHING;
INSERT INTO toydata (id, name, book_price, description) values (16, 'Барбиджон', 869, 'Девачки дом целый катать жить от балды развлекалово смотреть не трогать') ON CONFLICT (id) DO NOTHING;

ALTER TABLE user_roles ADD COLUMN id serial NOT NULL;
ALTER TABLE user_roles ADD CONSTRAINT prima_key PRIMARY KEY (id);

INSERT INTO roles (id, role) VALUES (0, 'ROLE_USER') ON CONFLICT DO NOTHING;
INSERT INTO roles (id, role) VALUES (1, 'ROLE_ADMIN') ON CONFLICT DO NOTHING;

INSERT INTO users (id, name, password, phone_number, sir_name, user_name, account_non_locked) VALUES (0, '-', '$2a$12$UxaX6oq8qWJoSA2qMX9LWeLT0dtaKiS7NcXXDnFFl1wxFNustGxIK', '-', '-', 'admin', true) ON CONFLICT DO NOTHING;
INSERT INTO user_roles(user_id, role_id) VALUES (0, 1) ON CONFLICT DO NOTHING;
