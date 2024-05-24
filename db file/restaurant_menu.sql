-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2024 at 01:45 PM
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
-- Database: `restaurant_menu`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_order`
--

CREATE TABLE `tbl_order` (
  `order_id` int(50) NOT NULL,
  `order_name` varchar(50) NOT NULL,
  `order_type` varchar(50) NOT NULL,
  `order_quantity` int(50) NOT NULL,
  `order_price` int(50) NOT NULL,
  `order_date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_order`
--

INSERT INTO `tbl_order` (`order_id`, `order_name`, `order_type`, `order_quantity`, `order_price`, `order_date`) VALUES
(1, 'spaghetti', 'Meal', 20, 20, ''),
(2, 'lechon', 'Meal', 30, 30, ''),
(3, 'leche flan', 'Desserts', 20, 30, '22323'),
(4, 'cake', 'Desserts', 20, 15, '22323'),
(5, 'sprite', 'Drinks', 20, 30, '05/24/2024'),
(6, 'babaoy', 'Meal', 20, 670, '05/24/2024');

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
(201, 'Burger Steak', 'Meal', 'Available', 10, 120),
(202, 'Somai', 'Meals', 'Available', 10, 25);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `user_id` int(50) NOT NULL,
  `user_fname` varchar(50) NOT NULL,
  `user_lname` varchar(50) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `user_pass` varchar(200) NOT NULL,
  `acc_type` varchar(50) NOT NULL,
  `acc_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`user_id`, `user_fname`, `user_lname`, `user_email`, `user_name`, `user_pass`, `acc_type`, `acc_status`) VALUES
(1, 'Ryan12345', 'Cansancio', 'ryangwapo@gmail.com', 'Ryan Gwapo', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'Admin', 'Active'),
(2, 'Wilyam', 'Wilyam', 'wilyamsama@gmail.com', 'Wilyam Gwapo', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'Cashier', 'Active'),
(3, 'Agaw', 'Agaw', 'aigods@gmail.com', 'Ai Gods', '4k35IAeMPdTn6NJELwDlyasqIxuzkY1lzFCQbknsrvQ=', 'Customer', 'Active'),
(4, 'Jhon', 'Jhon', 'jhongwapo@gmail.com', 'Gahi', '4k35IAeMPdTn6NJELwDlyasqIxuzkY1lzFCQbknsrvQ=', 'Customer', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_order`
--
ALTER TABLE `tbl_order`
  ADD PRIMARY KEY (`order_id`);

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
-- AUTO_INCREMENT for table `tbl_order`
--
ALTER TABLE `tbl_order`
  MODIFY `order_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_product`
--
ALTER TABLE `tbl_product`
  MODIFY `product_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=203;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `user_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
