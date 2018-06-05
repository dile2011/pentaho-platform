CREATE DATABASE IF NOT EXISTS `hibernate` DEFAULT CHARACTER SET latin1;

USE hibernate;
 
CREATE USER 'hibuser'@'%' IDENTIFIED BY 'password';

commit;
