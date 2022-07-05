# ginkgo web service
  mvn clean package


CREATE USER 'ginkgo'@'%' IDENTIFIED BY 'beijing';
GRANT ALL PRIVILEGES ON *.* TO 'ginkgo'@'%' WITH GRANT OPTION;
flush privileges;


# License
  "MIT License"