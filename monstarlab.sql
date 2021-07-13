-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 13, 2021 at 05:37 AM
-- Server version: 10.3.15-MariaDB
-- PHP Version: 7.1.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `monstarlab`
--

-- --------------------------------------------------------

--
-- Table structure for table `favorites`
--

CREATE TABLE `favorites` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `movie_id` int(11) NOT NULL,
  `date_added` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `favorites`
--

INSERT INTO `favorites` (`id`, `user_id`, `movie_id`, `date_added`) VALUES
(1, 1, 2, '2021-07-12 16:14:57'),
(2, 1, 18, '2021-07-12 16:15:42'),
(3, 1, 11, '2021-07-12 16:15:56'),
(8, 1, 5, '2021-07-12 17:21:25'),
(9, 1, 6, '2021-07-12 17:21:54'),
(10, 1, 8, '2021-07-12 18:39:15'),
(11, 1, 13, '2021-07-12 18:45:49'),
(12, 1, 12, '2021-07-12 18:48:15'),
(13, 1, 4, '2021-07-12 18:50:19'),
(14, 1, 7, '2021-07-13 03:18:06');

-- --------------------------------------------------------

--
-- Table structure for table `movies`
--

CREATE TABLE `movies` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `year` year(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `movies`
--

INSERT INTO `movies` (`id`, `name`, `year`) VALUES
(1, 'Bad Boys for Life', 2020),
(2, 'The Grudge', 2020),
(3, 'Dolittle', 2020),
(4, 'Weathering with You', 2020),
(5, 'The Gentlemen', 2020),
(6, 'The Rhythm Section', 2020),
(7, 'Gretel & Hansel', 2020),
(8, 'The Tomorrow War', 2021),
(9, 'F9: The Fast Saga', 2021),
(10, 'The Many Saints of Newark', 2021),
(11, 'Luca', 2021),
(12, 'Fear Street Part 1: 1994', 2021),
(13, 'Black Widow', 2021),
(14, 'Jurassic World: Dominion', 2022),
(15, 'Thor: Love and Thunder', 2022),
(16, 'The Batman', 2022),
(17, 'Knives Out 2', 2022),
(18, 'Transformers: Rise of the Beasts', 2022),
(19, 'John Wick: Chapter 4', 2022),
(20, 'Doctor Strange in the Multiverse of Madness', 2022),
(21, 'Nigel Arugay', 1996);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`) VALUES
(1, 'admin', 'nigel', 'arugay');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `favorites`
--
ALTER TABLE `favorites`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `movies`
--
ALTER TABLE `movies`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `favorites`
--
ALTER TABLE `favorites`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `movies`
--
ALTER TABLE `movies`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
