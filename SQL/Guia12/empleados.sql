use personal;
-- 1. Obtener los datos completos de los empleados.
select *from empleados;
-- 2. Obtener los datos completos de los departamentos.
select *from departamentos;
-- 3. Listar el nombre de los departamentos.
select nombre_depto as DEPARTAMENTO from departamentos;
-- 4. Obtener el nombre y salario de todos los empleados.
select nombre as EMPLEADO, sal_emp as SALARIO from empleados;
-- 5. Listar todas las comisiones.
select comision_emp as COMISIONES from empleados;
-- 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
select * from empleados where cargo_emp ='Secretaria';
-- 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.
select * from empleados where cargo_emp ='Vendedor' order by nombre;
-- 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.
select nombre as EMPLEADO, cargo_emp as CARGO, sal_emp as SALARIO from empleados 
order by sal_emp;
-- 9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad de “Ciudad Real”
select e.nombre as EMPLEADO, e.cargo_emp as CARGO, d.ciudad from empleados e
inner join departamentos d 
on e.id_depto=d.id_depto
where e.cargo_emp like 'Jefe%' and d.ciudad ='Ciudad Real';
-- 10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.
select nombre as NOMBRE, cargo_emp as CARGO from empleados;
-- 11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor.
select nombre as EMPLEADO, sal_emp as SALARIO, comision_emp as COMISION from empleados 
where id_depto=2000 
order by comision_emp;
-- 12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del empleado y el total a pagar, en orden alfabético.
SELECT nombre, SUM(sal_emp + comision_emp +500) as TOTAL FROM Empleados 
where id_depto=3000
GROUP BY nombre
order by nombre;
-- 13. Muestra los empleados cuyo nombre empiece con la letra J.
select *from empleados where nombre like 'j%';
-- 14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000.
SELECT sal_emp as SALARIO, comision_emp as COMISION, nombre as EMPLEADO, SUM(sal_emp + comision_emp) as TOTAL FROM Empleados
where comision_emp > 1000
GROUP BY sal_emp,comision_emp, nombre; 
-- 15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.
SELECT sal_emp as SALARIO, comision_emp as COMISION, nombre as EMPLEADO, SUM(sal_emp + comision_emp) as TOTAL FROM Empleados
where comision_emp = 0
GROUP BY sal_emp,comision_emp, nombre; 
-- 16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
SELECT sal_emp as SALARIO, comision_emp as COMISION, nombre as EMPLEADO, SUM(sal_emp + comision_emp) as TOTAL FROM Empleados
where comision_emp > sal_emp
GROUP BY sal_emp,comision_emp, nombre; 
-- 17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.
SELECT sal_emp as SALARIO, comision_emp as COMISION, nombre as EMPLEADO, SUM(sal_emp + comision_emp) as TOTAL FROM Empleados
where comision_emp <= sal_emp*0.30
GROUP BY sal_emp,comision_emp, nombre; 
-- 18. Hallar los empleados cuyo nombre no contiene la cadena “MA”
select *from empleados where nombre not like '%MA%';
-- 19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o ‘Mantenimiento.
select  nombre_depto from departamentos where nombre_depto in ('Ventas','Investigacion','Mantenimiento');
-- 20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento.
select nombre_depto from departamentos where nombre_depto not in ('Ventas','Investigacion','Mantenimiento');
-- 21. Mostrar el salario más alto de la empresa.
select MAX(sal_emp)  from empleados ;
-- 22. Mostrar el nombre del último empleado de la lista por orden alfabético.
select nombre from empleados  order by nombre desc limit 1;
-- 23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
SELECT MAX(sal_emp),MIN(sal_emp),MAX(sal_emp)-MIN(sal_emp) FROM empleados;
-- 24. Hallar el salario promedio por departamento.
select avg(sal_emp) as PROMEDIO from empleados;
-- 25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos 
select id_depto, count(nombre) from empleados
group by id_depto
having count(nombre)>3;
-- 26. Hallar los departamentos que no tienen empleados
select id_depto, count(nombre) from empleados
group by id_depto
having count(nombre)=0;
-- 28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento. 
select *from empleados where sal_emp >=(select avg(sal_emp)  from empleados) order by id_depto;
