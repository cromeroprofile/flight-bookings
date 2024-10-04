
INSERT INTO Airport (airport_code, airport_name, city, country) VALUES
('MAD', 'Madrid-Barajas Adolfo Suárez', 'Madrid', 'ESPAÑA'),
('BCN', 'Barcelona-El Prat', 'Barcelona', 'ESPAÑA'),
('VLC', 'Valencia', 'Valencia', 'ESPAÑA'),
('AGP', 'Málaga-Costa del Sol', 'Málaga', 'ESPAÑA'),
('ALC', 'Alicante-Elche', 'Alicante', 'ESPAÑA'),
('SVQ', 'Sevilla', 'Sevilla', 'ESPAÑA'),
('BIO', 'Bilbao', 'Bilbao', 'ESPAÑA'),
('PMI', 'Palma de Mallorca', 'Palma de Mallorca', 'ESPAÑA'),
('LPA', 'Gran Canaria', 'Las Palmas', 'ESPAÑA'),
('TFS', 'Tenerife Sur', 'Tenerife', 'ESPAÑA'),
('LAX', 'Los Angeles International Airport', 'Los Ángeles', 'EE_UU'),
('JFK', 'John F. Kennedy International Airport', 'Nueva York', 'EE_UU'),
('ORD', 'O\'Hare International Airport', 'Chicago', 'EE_UU'),
('ATL', 'Hartsfield-Jackson Atlanta International Airport', 'Atlanta', 'EE_UU'),
('DFW', 'Dallas/Fort Worth International Airport', 'Dallas', 'EE_UU'),
('YYZ', 'Toronto Pearson International Airport', 'Toronto', 'CANADA'),
('GRU', 'São Paulo/Guarulhos International Airport', 'São Paulo', 'BRASIL'),
('MEX', 'Mexico City International Airport', 'Ciudad de México', 'MEXICO'),
('BOG', 'Bogotá El Dorado International Airport', 'Bogotá', 'COLOMBIA'),
('CUN', 'Cancún International Airport', 'Cancún', 'MEXICO'),
('LHR', 'London Heathrow Airport', 'Londres', 'REINO_UNIDO'),
('AMS', 'Amsterdam Airport Schiphol', 'Ámsterdam', 'PAISES_BAJOS'),
('CDG', 'Charles de Gaulle Airport', 'París', 'FRANCIA'),
('FRA', 'Frankfurt Airport', 'Fráncfort', 'ALEMANIA'),
('MUC', 'Munich Airport', 'Múnich', 'ALEMANIA'),
('ZRH', 'Zurich Airport', 'Zúrich', 'SUIZA'),
('CPH', 'Copenhagen Airport', 'Copenhague', 'DINAMARCA'),
('VIE', 'Vienna International Airport', 'Viena', 'AUSTRIA'),
('LIS', 'Lisbon Portela Airport', 'Lisboa', 'PORTUGAL'),
('BRU', 'Brussels Airport', 'Bruselas', 'BELGICA');


INSERT INTO flight
(availability, capacity_plane, flight_airplane, flight_number, flight_price, num_rows, departure_time, arrival_time, flight_duration, origin_airport_id, destination_airport_id)
VALUES
(1, 180, 1, 1001, 300.50, 3, '2024-10-12 08:00:00', '2024-10-12 12:00:00', 4, 'MAD', 'LAX'),
(1, 200, 2, 1002, 450.75, 4, '2024-10-12 14:30:00', '2024-10-12 19:00:00', 4.5, 'BCN', 'JFK')
--(1, 150, 3, 1003, 200.00, 30, '2024-10-12 09:00:00', '2024-10-12 11:30:00', 2.5, 'AGP', 'LHR'),
--(1, 220, 1, 1004, 350.25, 44, '2024-10-13 10:45:00', '2024-10-13 13:45:00', 3, 'BIO', 'AMS'),
--(1, 250, 2, 1005, 320.00, 50, '2024-10-13 18:00:00', '2024-10-13 21:30:00', 3.5, 'PMI', 'CDG'),
--(1, 300, 3, 1006, 400.50, 60, '2024-10-13 11:00:00', '2024-10-13 14:30:00', 3.5, 'MAD', 'FRA'),
--(1, 170, 1, 1007, 250.75, 34, '2024-10-14 07:30:00', '2024-10-14 10:30:00', 3, 'SVQ', 'ZRH'),
--(1, 300, 2, 1008, 480.00, 60, '2024-10-14 16:15:00', '2024-10-14 20:15:00', 4, 'BCN', 'ATL'),
--(1, 150, 1, 1009, 275.50, 30, '2024-10-15 09:15:00', '2024-10-15 12:15:00', 3, 'ALC', 'ORD'),
--(1, 220, 2, 1010, 450.25, 44, '2024-10-15 14:00:00', '2024-10-15 17:30:00', 3.5, 'MAD', 'JFK'),
--(1, 180, 3, 1011, 350.00, 36, '2024-10-16 08:30:00', '2024-10-16 12:00:00', 3.5, 'BCN', 'LHR'),
--(1, 150, 1, 1012, 320.75, 30, '2024-10-16 14:45:00', '2024-10-16 18:15:00', 3.5, 'PMI', 'MEX'),
--(1, 200, 2, 1013, 290.00, 40, '2024-10-17 10:00:00', '2024-10-17 12:30:00', 2.5, 'SVQ', 'YYZ'),
--(1, 300, 3, 1014, 600.50, 60, '2024-10-17 16:30:00', '2024-10-17 20:00:00', 3.5, 'BIO', 'GRU'),
--(1, 170, 1, 1015, 450.00, 34, '2024-10-18 07:00:00', '2024-10-18 10:30:00', 3.5, 'MAD', 'ATL'),
--(1, 250, 2, 1016, 330.00, 50, '2024-10-18 14:15:00', '2024-10-18 18:15:00', 4, 'ALC', 'FRA'),
--(1, 220, 3, 1017, 425.75, 44, '2024-10-19 09:45:00', '2024-10-19 12:00:00', 2.25, 'BCN', 'ZRH'),
--(1, 180, 1, 1018, 250.50, 36, '2024-10-19 14:00:00', '2024-10-19 17:00:00', 3, 'MAD', 'CDG'),
--(1, 150, 2, 1019, 320.00, 30, '2024-10-20 10:15:00', '2024-10-20 13:45:00', 3.5, 'PMI', 'ORD'),
--(1, 300, 3, 1020, 550.50, 60, '2024-10-20 16:00:00', '2024-10-20 20:30:00', 4.5, 'SVQ', 'YYZ'),
--(1, 220, 1, 1021, 400.00, 44, '2024-10-21 08:30:00', '2024-10-21 12:00:00', 3.5, 'BIO', 'LHR'),
--(1, 180, 2, 1022, 480.00, 36, '2024-10-21 14:30:00', '2024-10-21 19:00:00', 4.5, 'MAD', 'MEX'),
--(1, 150, 3, 1023, 300.00, 30, '2024-10-22 10:00:00', '2024-10-22 12:30:00', 2.5, 'PMI', 'ATL'),
--(1, 300, 1, 1024, 450.25, 60, '2024-10-22 16:15:00', '2024-10-22 20:15:00', 4, 'ALC', 'GRU'),
--(1, 200, 2, 1025, 350.50, 40, '2024-10-23 09:00:00', '2024-10-23 12:30:00', 3.5, 'BCN', 'DFW'),
--(1, 170, 3, 1026, 325.00, 34, '2024-10-23 14:45:00', '2024-10-23 17:15:00', 2.5, 'MAD', 'YYZ'),
--(1, 220, 1, 1027, 490.00, 44, '2024-10-24 08:30:00', '2024-10-24 12:00:00', 3.5, 'BIO', 'JFK'),
--(1, 250, 2, 1028, 410.75, 50, '2024-10-24 14:15:00', '2024-10-24 18:15:00', 4, 'PMI', 'LHR'),
--(1, 300, 3, 1029, 540.00, 60, '2024-10-25 10:30:00', '2024-10-25 13:30:00', 3, 'SVQ', 'MUC'),
--(1, 150, 1, 1030, 225.00, 30, '2024-10-25 16:00:00', '2024-10-25 19:00:00', 3, 'MAD', 'FRA'),
--(1, 180, 2, 1031, 350.25, 36, '2024-10-26 09:15:00', '2024-10-26 12:30:00', 3.25, 'ALC', 'ZRH'),
--(1, 220, 3, 1032, 320.50, 44, '2024-10-26 14:30:00', '2024-10-26 19:00:00', 4.5, 'BCN', 'CDG'),
--(1, 150, 1, 1033, 275.00, 30, '2024-10-27 10:00:00', '2024-10-27 12:30:00', 2.5, 'MAD', 'ORD'),
--(1, 300, 2, 1034, 590.00, 60, '2024-10-27 16:15:00', '2024-10-27 20:15:00', 4.0, 'SVQ', 'ATL'),
--(1, 170, 3, 1035, 430.75, 34, '2024-10-28 08:00:00', '2024-10-28 11:00:00', 3.0, 'BIO', 'MEX'),
--(1, 200, 1, 1036, 480.50, 40, '2024-10-28 14:45:00', '2024-10-28 18:00:00', 3.25, 'PMI', 'YYZ'),
--(1, 220, 2, 1037, 600.00, 44, '2024-10-29 10:30:00', '2024-10-29 14:00:00', 3.5, 'MAD', 'GRU'),
--(1, 180, 3, 1038, 325.25, 36, '2024-10-29 16:15:00', '2024-10-29 19:15:00', 3.0, 'BCN', 'DFW'),
--(1, 250, 1, 1039, 490.00, 50, '2024-10-30 09:15:00', '2024-10-30 12:15:00', 3.0, 'ALC', 'LHR'),
--(1, 300, 2, 1040, 410.50, 60, '2024-10-30 14:00:00', '2024-10-30 17:30:00', 3.5, 'SVQ', 'ORD'),
--(1, 150, 3, 1041, 230.00, 30, '2024-10-31 10:00:00', '2024-10-31 12:30:00', 2.5, 'BIO', 'ATL'),
--(1, 220, 1, 1042, 575.00, 44, '2024-10-31 14:30:00', '2024-10-31 18:30:00', 4.0, 'MAD', 'YYZ'),
--(1, 250, 2, 1043, 600.00, 50, '2024-11-01 09:00:00', '2024-11-01 12:30:00', 3.5, 'ALC', 'MEX'),
--(1, 300, 3, 1044, 700.00, 60, '2024-11-01 16:15:00', '2024-11-01 20:00:00', 3.75, 'SVQ', 'LHR'),
--(1, 170, 1, 1045, 350.50, 34, '2024-11-02 08:00:00', '2024-11-02 10:30:00', 2.5, 'BCN', 'GRU'),
--(1, 200, 2, 1046, 290.75, 40, '2024-11-02 14:15:00', '2024-11-02 17:00:00', 2.75, 'PMI', 'ORD'),
--(1, 180, 3, 1047, 430.00, 36, '2024-11-03 10:00:00', '2024-11-03 13:30:00', 3.5, 'BIO', 'JFK'),
--(1, 220, 1, 1048, 480.25, 44, '2024-11-03 16:00:00', '2024-11-03 19:00:00', 3.0, 'MAD', 'DFW'),
--(1, 250, 2, 1049, 550.50, 50, '2024-11-04 08:30:00', '2024-11-04 12:00:00', 3.5, 'SVQ', 'YYZ'),
--(1, 300, 3, 1050, 500.00, 60, '2024-11-04 14:15:00', '2024-11-04 18:15:00', 4.0, 'ALC', 'MUC'),
--(1, 150, 1, 1051, 275.00, 30, '2024-11-05 09:15:00', '2024-11-05 12:00:00', 2.75, 'BCN', 'CDG'),
--(1, 220, 2, 1052, 400.00, 44, '2024-11-05 14:45:00', '2024-11-05 18:30:00', 3.5, 'MAD', 'FRA'),
--(1, 200, 3, 1053, 310.25, 40, '2024-11-06 10:00:00', '2024-11-06 13:00:00', 3.0, 'PMI', 'ORD'),
--(1, 170, 1, 1054, 560.00, 34, '2024-11-06 16:00:00', '2024-11-06 19:00:00', 3.0, 'BIO', 'ATL'),
--(1, 300, 2, 1055, 670.00, 60, '2024-11-07 08:30:00', '2024-11-07 12:30:00', 4.0, 'SVQ', 'JFK'),
--(1, 250, 3, 1056, 370.00, 50, '2024-11-07 14:15:00', '2024-11-07 17:45:00', 3.5, 'ALC', 'MUC'),
--(1, 180, 1, 1057, 400.50, 36, '2024-11-08 10:30:00', '2024-11-08 14:00:00', 3.5, 'MAD', 'LHR'),
--(1, 220, 2, 1058, 480.00, 44, '2024-11-08 16:15:00', '2024-11-08 20:00:00', 3.75, 'BCN', 'GRU'),
--(1, 150, 3, 1059, 290.50, 30, '2024-11-09 09:15:00', '2024-11-09 12:30:00', 3.25, 'PMI', 'ORD'),
--(1, 300, 1, 1060, 530.00, 60, '2024-11-09 14:30:00', '2024-11-09 18:30:00', 4.0, 'BIO', 'YYZ'),
--(1, 200, 2, 1061, 600.50, 40, '2024-11-10 08:00:00', '2024-11-10 11:00:00', 3.0, 'SVQ', 'JFK'),
--(1, 220, 3, 1062, 710.00, 44, '2024-11-10 14:00:00', '2024-11-10 17:00:00', 3.5, 'MAD', 'DFW'),
--(1, 150, 1, 1063, 320.00, 30, '2024-11-11 09:15:00', '2024-11-11 12:15:00', 2.75, 'ALC', 'MUC'),
--(1, 300, 2, 1064, 600.00, 60, '2024-11-11 15:00:00', '2024-11-11 18:00:00', 4.0, 'BCN', 'LHR'),
--(1, 180, 3, 1065, 550.25, 36, '2024-11-12 10:30:00', '2024-11-12 14:30:00', 3.5, 'PMI', 'ORD'),
--(1, 250, 1, 1066, 450.75, 50, '2024-11-12 16:15:00', '2024-11-12 19:15:00', 4.0, 'BIO', 'ATL'),
--(1, 170, 2, 1067, 390.00, 34, '2024-11-13 08:00:00', '2024-11-13 10:30:00', 2.5, 'MAD', 'YYZ'),
--(1, 200, 3, 1068, 470.00, 40, '2024-11-13 14:00:00', '2024-11-13 17:30:00', 3.5, 'ALC', 'LHR'),
--(1, 300, 1, 1069, 680.25, 60, '2024-11-14 10:30:00', '2024-11-14 14:30:00', 4.0, 'BCN', 'MUC'),
--(1, 150, 2, 1070, 255.00, 30, '2024-11-14 15:00:00', '2024-11-14 18:00:00', 3.0, 'SVQ', 'ORD'),
--(1, 220, 3, 1071, 580.50, 44, '2024-11-15 08:00:00', '2024-11-15 11:00:00', 3.0, 'PMI', 'YYZ'),
--(1, 250, 1, 1072, 460.00, 50, '2024-11-15 14:30:00', '2024-11-15 18:00:00', 4.0, 'BIO', 'DFW'),
--(1, 300, 2, 1073, 620.00, 60, '2024-11-16 10:00:00', '2024-11-16 13:00:00', 3.0, 'MAD', 'ATL'),
--(1, 150, 3, 1074, 350.00, 30, '2024-11-16 15:00:00', '2024-11-16 18:00:00', 3.5, 'ALC', 'JFK'),
--(1, 170, 1, 1075, 290.50, 34, '2024-11-17 09:15:00', '2024-11-17 12:00:00', 2.75, 'SVQ', 'GRU'),
--(1, 200, 2, 1076, 410.25, 40, '2024-11-17 14:30:00', '2024-11-17 17:30:00', 3.0, 'BCN', 'MUC'),
--(1, 220, 3, 1077, 330.00, 44, '2024-11-18 08:00:00', '2024-11-18 11:00:00', 3.5, 'MAD', 'ORD'),
--(1, 250, 1, 1078, 580.00, 50, '2024-11-18 14:00:00', '2024-11-18 17:30:00', 4.0, 'PMI', 'YYZ'),
--(1, 300, 2, 1079, 650.25, 60, '2024-11-19 10:30:00', '2024-11-19 14:00:00', 3.5, 'BIO', 'ATL'),
--(1, 150, 3, 1080, 325.00, 30, '2024-11-19 16:15:00', '2024-11-19 20:15:00', 4.0, 'ALC', 'JFK'),
--(1, 220, 1, 1081, 510.00, 44, '2024-11-20 09:15:00', '2024-11-20 12:15:00', 3.5, 'SVQ', 'LHR'),
--(1, 250, 2, 1082, 490.75, 50, '2024-11-20 14:30:00', '2024-11-20 18:30:00', 4.0, 'MAD', 'GRU'),
--(1, 300, 3, 1083, 320.00, 60, '2024-11-21 10:00:00', '2024-11-21 12:30:00', 2.5, 'BIO', 'MUC'),
--(1, 150, 1, 1084, 430.00, 30, '2024-11-21 14:00:00', '2024-11-21 18:00:00', 4.0, 'ALC', 'ORD'),
--(1, 220, 2, 1085, 610.50, 44, '2024-11-22 08:30:00', '2024-11-22 12:30:00', 4.0, 'MAD', 'YYZ'),
--(1, 250, 3, 1086, 550.25, 50, '2024-11-22 14:15:00', '2024-11-22 18:00:00', 4.0, 'BIO', 'JFK'),
--(1, 300, 1, 1087, 730.00, 60, '2024-11-23 10:00:00', '2024-11-23 14:00:00', 4.0, 'SVQ', 'ATL'),
--(1, 150, 2, 1088, 420.50, 30, '2024-11-23 16:15:00', '2024-11-23 20:15:00', 4.0, 'ALC', 'LHR'),
--(1, 220, 3, 1089, 350.00, 44, '2024-11-24 09:00:00', '2024-11-24 12:00:00', 3.0, 'MAD', 'YYZ'),
--(1, 250, 1, 1090, 490.50, 50, '2024-11-24 14:30:00', '2024-11-24 18:30:00', 4.0, 'BIO', 'DFW'),
--(1, 300, 2, 1091, 620.00, 60, '2024-11-25 10:00:00', '2024-11-25 13:30:00', 3.0, 'SVQ', 'ORD'),
--(1, 150, 3, 1092, 300.25, 30, '2024-11-25 14:30:00', '2024-11-25 18:30:00', 4.0, 'ALC', 'MUC'),
--(1, 220, 1, 1093, 540.75, 44, '2024-11-26 09:15:00', '2024-11-26 12:15:00', 3.5, 'MAD', 'YYZ'),
--(1, 250, 2, 1094, 670.00, 50, '2024-11-26 14:30:00', '2024-11-26 18:30:00', 4.0, 'BIO', 'ORD'),
--(1, 300, 3, 1095, 450.00, 60, '2024-11-27 10:30:00', '2024-11-27 14:00:00', 3.5, 'SVQ', 'JFK'),
--(1, 150, 1, 1096, 300.50, 30, '2024-11-27 14:00:00', '2024-11-27 17:30:00', 4.0, 'ALC', 'ATL'),
--(1, 220, 2, 1097, 520.00, 44, '2024-11-28 09:30:00', '2024-11-28 12:30:00', 3.5, 'MAD', 'MUC'),
--(1, 250, 3, 1098, 400.25, 50, '2024-11-28 14:00:00', '2024-11-28 17:30:00', 4.0, 'BIO', 'ORD'),
--(1, 300, 1, 1099, 600.00, 60, '2024-11-29 10:00:00', '2024-11-29 13:30:00', 3.0, 'SVQ', 'DFW'),
--(1, 150, 2, 1100, 290.50, 30, '2024-11-29 15:00:00', '2024-11-29 18:00:00', 3.5, 'ALC', 'YYZ');
--
--
--