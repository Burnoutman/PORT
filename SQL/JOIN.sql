SELECT ts.type_ship,sh.title_ship, mf.title_manufacturer,mf.country,displacement,launch_date,capitan,max_speed,military FROM ships sh INNER JOIN manufacturer mf ON sh.manufacturer_id=mf.id INNER JOIN type_ship ts ON sh.type_ship_id=ts.id;