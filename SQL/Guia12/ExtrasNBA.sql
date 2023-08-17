select *from jugadores where Posicion like '%c%';
select *from equipos;
-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
select nombre from jugadores order by nombre;

-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente
select nombre from jugadores 
where Posicion ='c' and peso >200
order by nombre;

-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
select Nombre from equipos order by Nombre;

-- 4. Mostrar el nombre de los equipos del este (East).
select Nombre from equipos 
where Conferencia ='East'
order by Nombre;

-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select *from equipos where Ciudad like 'C%';

-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.

select e.nombre, j.nombre from equipos e
inner join jugadores j
on e.nombre = j.nombre_equipo
order by e.nombre;

-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select e.nombre, j.nombre from equipos e
inner join jugadores j 
on e.nombre = j.nombre_equipo
where e.nombre ='Raptors'
order by j.nombre;

-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
select e.puntos_por_partido, j.nombre from estadisticas e
inner join jugadores j
where j.nombre='Pau Gasol';

-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
select e.puntos_por_partido, j.nombre, e.temporada from estadisticas e
inner join jugadores j
where j.nombre='Pau Gasol' and e.temporada ='04/05';

-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
select sum(e.puntos_por_partido), j.nombre from estadisticas e
inner join jugadores j
on e.jugador = j.codigo
group by j.Nombre;

-- 11. Mostrar el número de jugadores de cada equipo.
select count(j.nombre) as cantidad_jugadores,e.nombre from equipos e
inner join jugadores j
on j.nombre_equipo=e.nombre
group by e.Nombre;

-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
select t1.nombre
from ( select sum(e.puntos_por_partido) as puntos, j.nombre from estadisticas e
inner join jugadores j
on e.jugador = j.codigo
group by j.Nombre
order by j.Nombre) t1
where t1.puntos = (select max(t2.puntos) from (select j.nombre, sum(e.puntos_por_partido) as puntos 
from jugadores j, estadisticas e
where j.codigo = e.jugador 
group by j.nombre 
order by j.nombre) t2);

-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
select j.nombre,j.Altura, e.conferencia,e.division from jugadores j 
inner join equipos e
on j.Nombre_equipo=e.Nombre
order by altura desc limit 1;

-- 14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.       
select t1.equipo_local, t1.equipo_visitante, t1.diferencia
from (select  equipo_local,equipo_visitante,abs(puntos_local - puntos_visitante) as diferencia from partidos) t1
where t1.diferencia = (select max(abs(puntos_local - puntos_visitante)) from partidos);

-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.

select codigo, equipo_local,equipo_visitante,puntos_local,puntos_visitante,
Case 
when puntos_local > puntos_visitante then equipo_local
when puntos_local < puntos_visitante then equipo_visitante
else 'EMPATE'
end as ganador
from partidos;



        
