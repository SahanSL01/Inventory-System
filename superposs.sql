-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 14, 2024 at 01:20 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `superposs`
--

-- --------------------------------------------------------

--
-- Table structure for table `superposs`
--

CREATE TABLE `superposs` (
  `ID` int(11) NOT NULL,
  `ProductName` varchar(30) NOT NULL,
  `Category` varchar(20) NOT NULL,
  `Quantity` int(10) NOT NULL,
  `Price` int(30) NOT NULL,
  `AvailableStok` int(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

--
-- Dumping data for table `superposs`
--

INSERT INTO `superposs` (`ID`, `ProductName`, `Category`, `Quantity`, `Price`, `AvailableStok`) VALUES
(10, 'Bluetooth Wireless Mouse', 'Computer Prts', 574, 1500, 50),
(8, 'Dell i7', 'computer', 478, 175000, 10),
(9, 'Aspor A323', 'Power Bank', 54, 2199, 10),
(11, 'Toshiba 1Tb Harddisk', 'Computer Parts', 214, 14000, 20);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `superposs`
--
ALTER TABLE `superposs`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `superposs`
--
ALTER TABLE `superposs`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
