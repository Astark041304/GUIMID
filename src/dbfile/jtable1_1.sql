-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 09, 2024 at 02:59 PM
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
-- Database: `jtable1`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_product`
--

CREATE TABLE `tbl_product` (
  `product_id` int(50) NOT NULL,
  `product_name` varchar(50) NOT NULL,
  `product_type` varchar(50) NOT NULL,
  `product_status` varchar(50) NOT NULL,
  `product_quantity` int(50) NOT NULL,
  `product_price` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_product`
--

INSERT INTO `tbl_product` (`product_id`, `product_name`, `product_type`, `product_status`, `product_quantity`, `product_price`) VALUES
(201, 'Lechon', 'Meals', 'Available', 5, 1500);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `user_id` int(20) NOT NULL,
  `user_fname` varchar(50) NOT NULL,
  `user_lname` varchar(50) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `user_pass` varchar(150) NOT NULL,
  `acc_type` varchar(50) NOT NULL,
  `acc_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`user_id`, `user_fname`, `user_lname`, `user_email`, `user_name`, `user_pass`, `acc_type`, `acc_status`) VALUES
(101, 'John', 'Test', 'Johntest@email.com', 'John Test', 'Gwapo', 'User', 'Active'),
(102, 'Wilyam', 'Mayor', 'hanni@gmail.com', 'Pham Hanni', 'gwapokayko', 'Admin', 'Active'),
(103, 'Hanni', 'Pham', 'hannihoney@email.com', 'Hanni Pham', 'hannicutie', 'Admin', 'Active'),
(104, 'Astark', 'test', 'astark@email.com', 'AsTaRk', 'testtest', 'User', 'Active'),
(105, 'Huh ', 'Yunjin', 'jenaisante@email.com', 'Jennifer', 'try ma add ba', 'Admin', 'Active'),
(107, 'pildi', 'pildi', 'pilidman@email.com', 'Lakers', 'TLdF+vPI3NRyyJw1Jp2qloBwC2RorrvN2R/9EIuZUhk=', 'User', 'Pending'),
(109, 'Nayeon', 'Unnie', 'nayeonunnie@email.com', 'Nayeonunnie', '8jjBa7turKveWjKl94HA+w7UNWOgRzXa/vOFFY6SFh0=', 'User', 'Pending'),
(110, 'Hash', 'Hash', 'hash', 'Hash', '5xoerXovaMc8YXchLTchga3p31mMx/R9W8gUu+KvcyQ=', 'Admin', 'Pending'),
(111, 'Huh ', 'Yunjin', 'huhyunjin@email.com', 'Jenai', 't2NYbHFTlARa8mDMCNfWrcrcoXAzMEy6K9rFKRdM04M=', 'Admin', 'Active'),
(112, 'ryangwapo', 'ryan', 'ryan', 'ryan', '8zQYGnSzJB3pYLvQWmJaYRDvmEfFSrLvVYtMecrq55g=', 'Admin', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_product`
--
ALTER TABLE `tbl_product`
  ADD PRIMARY KEY (`product_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_product`
--
ALTER TABLE `tbl_product`
  MODIFY `product_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=202;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `user_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=113;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
