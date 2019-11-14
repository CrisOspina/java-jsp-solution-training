-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-11-2019 a las 17:02:36
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `flotavehiculo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipovehi`
--

CREATE TABLE `tipovehi` (
  `idtv` int(11) NOT NULL,
  `nomtv` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipovehi`
--

INSERT INTO `tipovehi` (`idtv`, `nomtv`) VALUES
(1, 'Carro'),
(2, 'Camioneta'),
(3, 'Moto'),
(4, 'Bicicleta'),
(5, 'Jeep'),
(6, 'Barco'),
(7, 'Tren');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tipovehi`
--
ALTER TABLE `tipovehi`
  ADD PRIMARY KEY (`idtv`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tipovehi`
--
ALTER TABLE `tipovehi`
  MODIFY `idtv` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
