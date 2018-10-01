-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 28, 2018 at 04:45 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.1.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `electric_bikes`
--
CREATE DATABASE IF NOT EXISTS `electric_bikes` DEFAULT CHARACTER SET utf8 COLLATE utf8_latvian_ci;
USE `electric_bikes`;

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `id` int(11) NOT NULL,
  `name` varchar(100) COLLATE utf8_latvian_ci NOT NULL,
  `surname` varchar(100) COLLATE utf8_latvian_ci NOT NULL,
  `phone` varchar(20) COLLATE utf8_latvian_ci NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_latvian_ci;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`id`, `name`, `surname`, `phone`, `timestamp`) VALUES
(1, 'Jānis', 'Kalniņš', '29456987', '2018-09-26 19:50:06'),
(2, 'Pēteris', 'Ašais', '26987412', '2018-09-26 19:50:06'),
(3, 'Anna', 'Liepiņa', '+37129654732', '2018-09-26 19:50:06'),
(10, 'Ernests', 'Rabarbers', '28796852', '2018-09-28 08:45:56'),
(12, 'Kristīne', 'Liepiņa', '123566', '2018-09-28 13:51:58'),
(13, 'Pēteris', 'Kreilis', '26984867', '2018-09-28 14:37:54');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `id` int(11) NOT NULL,
  `brand` varchar(100) COLLATE utf8_latvian_ci NOT NULL,
  `model` varchar(100) COLLATE utf8_latvian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_latvian_ci;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`id`, `brand`, `model`) VALUES
(9, 'Trek', 'Eo'),
(10, 'Tricycle', 'Green'),
(11, 'Gyro', 'Scooter'),
(12, 'Tesla', 'Model S'),
(13, 'kask', 'asdasd');

-- --------------------------------------------------------

--
-- Table structure for table `rental`
--

CREATE TABLE `rental` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `inv_id` int(11) NOT NULL,
  `date_start` datetime NOT NULL,
  `date_end` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_latvian_ci;

--
-- Dumping data for table `rental`
--

INSERT INTO `rental` (`id`, `user_id`, `inv_id`, `date_start`, `date_end`) VALUES
(1, 1, 11, '2018-09-30 11:00:00', '2018-09-30 14:00:00'),
(2, 2, 13, '2018-10-01 09:00:00', '2018-10-01 17:30:00'),
(3, 1, 13, '2018-12-12 12:30:00', '2018-12-12 13:30:00'),
(4, 2, 9, '2018-09-12 06:30:00', '2018-09-13 08:30:00'),
(5, 3, 10, '2018-07-26 12:00:00', '2018-07-27 12:00:00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rental`
--
ALTER TABLE `rental`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employees`
--
ALTER TABLE `employees`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `rental`
--
ALTER TABLE `rental`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
