-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3308
-- Tiempo de generación: 09-11-2025 a las 23:36:49
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ganaderia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `animal`
--

CREATE TABLE `animal` (
  `id` int(11) NOT NULL,
  `codigo` int(11) NOT NULL,
  `fechanacimiento` varchar(15) NOT NULL,
  `nombre` varchar(9) NOT NULL,
  `peso` double(11,0) NOT NULL,
  `id_raza` int(11) NOT NULL,
  `madre` int(9) NOT NULL,
  `padre` int(9) NOT NULL,
  `id_sexo` int(11) NOT NULL,
  `id_color` int(11) NOT NULL,
  `id_pelaje` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `animal`
--

INSERT INTO `animal` (`id`, `codigo`, `fechanacimiento`, `nombre`, `peso`, `id_raza`, `madre`, `padre`, `id_sexo`, `id_color`, `id_pelaje`) VALUES
(2, 110, '2005/03/30', 'jesus', 20, 1, 102, 203, 2, 1, 1),
(3, 90, '2025/11/04', 'kkk', 909, 1, 9, 90, 2, 1, 2),
(5, 11, '2025/11/19', 'oscar ', 2, 2, 3, 22, 1, 1, 2),
(7, 123, '2025/11/07', 'lolita', 4500, 1, 987, 909, 1, 1, 1),
(8, 1234, '2025/11/04', 'jjjj', 2344, 4, 2323, 4444, 2, 1, 1),
(9, 1234, '2025/11/04', 'jjjj', 2344, 4, 2323, 4444, 2, 1, 1),
(10, 123, '2025/11/07', 'lolita', 4500, 1, 987, 909, 1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `color`
--

CREATE TABLE `color` (
  `id` int(11) NOT NULL,
  `color` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `color`
--

INSERT INTO `color` (`id`, `color`) VALUES
(1, 'negro'),
(2, 'Morado'),
(3, 'Purpura'),
(4, 'marron'),
(5, 'sggdg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `enfermedad`
--

CREATE TABLE `enfermedad` (
  `id` int(11) NOT NULL,
  `enfermedad` varchar(18) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `enfermedad`
--

INSERT INTO `enfermedad` (`id`, `enfermedad`) VALUES
(1, 'dolor de cabeza'),
(2, 'cancer');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelaje`
--

CREATE TABLE `pelaje` (
  `id` int(11) NOT NULL,
  `pelaje` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `pelaje`
--

INSERT INTO `pelaje` (`id`, `pelaje`) VALUES
(1, 'corto'),
(2, 'mediano'),
(3, 'largo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `raza`
--

CREATE TABLE `raza` (
  `id` int(11) NOT NULL,
  `raza` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `raza`
--

INSERT INTO `raza` (`id`, `raza`) VALUES
(1, 'f1'),
(2, 'Lola'),
(3, 'dfasdf'),
(4, 'hoztil'),
(5, 'gagg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `id` int(11) NOT NULL,
  `roles` varchar(18) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id`, `roles`) VALUES
(1, 'administrador'),
(2, 'usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sexo`
--

CREATE TABLE `sexo` (
  `id` int(11) NOT NULL,
  `sexo` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `sexo`
--

INSERT INTO `sexo` (`id`, `sexo`) VALUES
(1, 'Hembra'),
(2, 'Macho');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `cedula` int(9) NOT NULL,
  `nombre` varchar(16) NOT NULL,
  `password` varchar(18) NOT NULL,
  `confi_password` varchar(18) NOT NULL,
  `comida_favorita` varchar(18) NOT NULL,
  `color_favorito` varchar(18) NOT NULL,
  `animal_favorito` varchar(16) NOT NULL,
  `id_rol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `cedula`, `nombre`, `password`, `confi_password`, `comida_favorita`, `color_favorito`, `animal_favorito`, `id_rol`) VALUES
(1, 1, 'jesus', '123456', '123456', 'pollo', 'negro', 'perro', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `id` int(11) NOT NULL,
  `vacuna` varchar(18) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`id`, `vacuna`) VALUES
(1, 'diclofena'),
(2, 'paracetamol');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ve_registro`
--

CREATE TABLE `ve_registro` (
  `id` int(11) NOT NULL,
  `id_vacuna` int(11) NOT NULL,
  `id_enfermedad` int(11) NOT NULL,
  `fecha` varchar(15) NOT NULL,
  `id_animal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `ve_registro`
--

INSERT INTO `ve_registro` (`id`, `id_vacuna`, `id_enfermedad`, `fecha`, `id_animal`) VALUES
(2, 1, 1, '2025-11-05', 2),
(3, 2, 2, '2025-11-05', 2),
(11, 1, 1, '2025-11-06', 8),
(12, 1, 1, '2025-11-07', 8);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `animal`
--
ALTER TABLE `animal`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_color` (`id_color`),
  ADD KEY `id_pelaje` (`id_pelaje`),
  ADD KEY `id_raza` (`id_raza`),
  ADD KEY `id_sexo` (`id_sexo`);

--
-- Indices de la tabla `color`
--
ALTER TABLE `color`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `enfermedad`
--
ALTER TABLE `enfermedad`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pelaje`
--
ALTER TABLE `pelaje`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `raza`
--
ALTER TABLE `raza`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `sexo`
--
ALTER TABLE `sexo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_rol` (`id_rol`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ve_registro`
--
ALTER TABLE `ve_registro`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_enfermedad` (`id_enfermedad`),
  ADD KEY `id_vacuna` (`id_vacuna`),
  ADD KEY `id_animal` (`id_animal`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `animal`
--
ALTER TABLE `animal`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `color`
--
ALTER TABLE `color`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `enfermedad`
--
ALTER TABLE `enfermedad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `pelaje`
--
ALTER TABLE `pelaje`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `raza`
--
ALTER TABLE `raza`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `sexo`
--
ALTER TABLE `sexo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `ve_registro`
--
ALTER TABLE `ve_registro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `animal`
--
ALTER TABLE `animal`
  ADD CONSTRAINT `animal_ibfk_1` FOREIGN KEY (`id_color`) REFERENCES `color` (`id`),
  ADD CONSTRAINT `animal_ibfk_2` FOREIGN KEY (`id_pelaje`) REFERENCES `pelaje` (`id`),
  ADD CONSTRAINT `animal_ibfk_3` FOREIGN KEY (`id_raza`) REFERENCES `raza` (`id`),
  ADD CONSTRAINT `animal_ibfk_4` FOREIGN KEY (`id_sexo`) REFERENCES `sexo` (`id`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_rol`) REFERENCES `rol` (`id`);

--
-- Filtros para la tabla `ve_registro`
--
ALTER TABLE `ve_registro`
  ADD CONSTRAINT `ve_registro_ibfk_1` FOREIGN KEY (`id_enfermedad`) REFERENCES `enfermedad` (`id`),
  ADD CONSTRAINT `ve_registro_ibfk_2` FOREIGN KEY (`id_vacuna`) REFERENCES `vacuna` (`id`),
  ADD CONSTRAINT `ve_registro_ibfk_3` FOREIGN KEY (`id_animal`) REFERENCES `animal` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
