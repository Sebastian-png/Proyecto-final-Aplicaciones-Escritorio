-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-09-2023 a las 07:43:52
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `academia_futbol`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `ID_ESTUDIANTE` int(11) NOT NULL,
  `CATEGORIA` varchar(255) DEFAULT NULL,
  `CIUDAD` varchar(255) DEFAULT NULL,
  `EDAD` varchar(255) DEFAULT NULL,
  `GENERO` varchar(255) DEFAULT NULL,
  `MESES_ATRASADOS` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `VALOR_MES` varchar(255) DEFAULT NULL,
  `UNRESPONSABLE_ID_PADRE` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`ID_ESTUDIANTE`, `CATEGORIA`, `CIUDAD`, `EDAD`, `GENERO`, `MESES_ATRASADOS`, `NOMBRE`, `VALOR_MES`, `UNRESPONSABLE_ID_PADRE`) VALUES
(1, 'Prebenjamines: Entre 5 y 7 años', 'Cali', '5', 'Masculino', '0', 'Laura Jaimes', '$200.000', 1),
(2, 'Cadetes: Entre 14 y 15 años', 'Pereira', '15', 'Femenino', '1', 'Sebastian Loaiza', '$300.000', 2),
(3, 'Infantiles: Entre 12 y 13 años', 'Bogota', '12', 'Masculino', '1', 'James', '$160.000', 3),
(4, 'Alevines: Entre 10 y 11 años', 'Cartagena', '11', 'Femenino', '3', 'Meteo Dominguez', '$150.000', 4),
(6, 'Prebenjamines: Entre 5 y 7 años', 'Medellin', '6', 'Masculino', '0', 'Pedro Gomez', '$140.000', 6),
(7, 'Cadetes: Entre 14 y 15 años', 'bogota', '15', 'Masculino', '3', 'David', '230.000', 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `responsable`
--

CREATE TABLE `responsable` (
  `ID_PADRE` int(11) NOT NULL,
  `CELULAR` varchar(255) DEFAULT NULL,
  `CORELEC` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `responsable`
--

INSERT INTO `responsable` (`ID_PADRE`, `CELULAR`, `CORELEC`, `NOMBRE`) VALUES
(1, '3228723011', 'Lauj@gmail.com', 'Laura Jaimes'),
(2, '3126781231', 'sebasl@gmail.com', 'Sebastian Loaiza'),
(3, '3139401243', 'jam@gmail.com', 'James'),
(4, '123123412', 'mat@gmai.com', 'Meteo Dominguez'),
(5, '127361562', 'anrom@gmail.com', 'Andres Roman'),
(6, '1239053121', 'perdrogo@gmail.com', 'Pedro Gomez'),
(7, '21312314', 'david@gmaoil.com', 'David'),
(8, '', '', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`ID_ESTUDIANTE`),
  ADD KEY `FK_ESTUDIANTE_UNRESPONSABLE_ID_PADRE` (`UNRESPONSABLE_ID_PADRE`);

--
-- Indices de la tabla `responsable`
--
ALTER TABLE `responsable`
  ADD PRIMARY KEY (`ID_PADRE`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  MODIFY `ID_ESTUDIANTE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `responsable`
--
ALTER TABLE `responsable`
  MODIFY `ID_PADRE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD CONSTRAINT `FK_ESTUDIANTE_UNRESPONSABLE_ID_PADRE` FOREIGN KEY (`UNRESPONSABLE_ID_PADRE`) REFERENCES `responsable` (`ID_PADRE`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
