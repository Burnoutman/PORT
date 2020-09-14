use port;

CREATE TABLE ships(
id INT NOT NULL AUTO_INCREMENT,
title_ship VARCHAR (255) NOT NULL,
displacement INT,
launch_date date,
capitan VARCHAR(255),
type_ship_id INT NOT NULL,
manufacturer_id INT NOT NULL,
max_speed INT,
military BOOLEAN,
PRIMARY KEY (id),
FOREIGN KEY (manufacturer_id) REFERENCES manufacturer (id),
FOREIGN KEY (type_ship_id) REFERENCES type_ship (id)
)