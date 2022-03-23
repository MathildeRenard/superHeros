-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 23 mars 2022 à 09:40
-- Version du serveur : 10.4.22-MariaDB
-- Version de PHP : 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `superheros`
--

-- --------------------------------------------------------

--
-- Structure de la table `incident`
--

CREATE TABLE `incident` (
  `id_incident` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `incident`
--

INSERT INTO `incident` (`id_incident`, `nom`) VALUES
(1, 'incendie'),
(2, 'accident routier'),
(3, 'Accident fluviale'),
(4, 'Accident aérien'),
(5, 'Eboulement'),
(6, 'Invasion de serpent'),
(7, 'Fuite de gaz\r\n'),
(8, 'Manifestation'),
(9, 'Braquage'),
(10, 'Evasion d’un prisonnier');

-- --------------------------------------------------------

--
-- Structure de la table `incident_heros`
--

CREATE TABLE `incident_heros` (
  `id_heros` int(11) NOT NULL,
  `id_incident` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `incident_heros`
--

INSERT INTO `incident_heros` (`id_heros`, `id_incident`) VALUES
(11, 4),
(11, 6),
(11, 10),
(12, 1),
(12, 2),
(12, 3),
(13, 5),
(13, 7),
(13, 8),
(14, 4),
(14, 9),
(14, 10),
(15, 1),
(15, 3),
(15, 6),
(16, 8),
(16, 9),
(16, 10),
(17, 1),
(17, 6),
(17, 10),
(19, 1),
(19, 4),
(19, 7);

-- --------------------------------------------------------

--
-- Structure de la table `super_heros`
--

CREATE TABLE `super_heros` (
  `id_heros` int(11) NOT NULL,
  `localisation` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `telephone` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `super_heros`
--

INSERT INTO `super_heros` (`id_heros`, `localisation`, `nom`, `telephone`) VALUES
(11, '49.526164,0.158818', 'Batman', 331),
(12, '43.179708,3.001266', 'Spiderman', 125),
(13, '43.757760,-0.573290', 'Superman', 261),
(14, '48.8760339494496,2.3470697657937407', 'Iron Man', 307),
(15, '48.87906719597665,2.3346460981046713', 'Aquaman', 138),
(16, '43.59860847333827,1.4342445979111946', 'Captain America', 294),
(17, '49.045949,3.393472', 'Wonder woman', 758),
(19, '50.015151,1.988251', 'Daredevil', 596);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `incident`
--
ALTER TABLE `incident`
  ADD PRIMARY KEY (`id_incident`);

--
-- Index pour la table `incident_heros`
--
ALTER TABLE `incident_heros`
  ADD KEY `FK6y6pkot39agt96151y9dli9wi` (`id_incident`),
  ADD KEY `FKi0dieeiv77ft6n5y7q8n98ayx` (`id_heros`);

--
-- Index pour la table `super_heros`
--
ALTER TABLE `super_heros`
  ADD PRIMARY KEY (`id_heros`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `incident`
--
ALTER TABLE `incident`
  MODIFY `id_incident` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT pour la table `super_heros`
--
ALTER TABLE `super_heros`
  MODIFY `id_heros` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `incident_heros`
--
ALTER TABLE `incident_heros`
  ADD CONSTRAINT `FK6y6pkot39agt96151y9dli9wi` FOREIGN KEY (`id_incident`) REFERENCES `incident` (`id_incident`),
  ADD CONSTRAINT `FKi0dieeiv77ft6n5y7q8n98ayx` FOREIGN KEY (`id_heros`) REFERENCES `super_heros` (`id_heros`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
