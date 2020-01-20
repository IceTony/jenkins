# jenkins
## Установка Jenkins на Ubuntu
1. Установить java
```
sudo apt install openjdk-11-jdk
```
2. Добавить ключ и репозиторий
```
wget -q -O - https://pkg.jenkins.io/debian/jenkins.io.key | sudo apt-key add -
sudo sh -c 'echo deb http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
sudo apt update
```
3. Установить и запустить jenkins
```
sudo apt install jenkins
sudo systemctl start jenkins
```
4. Открыть порт 8080
```
sudo ufw allow 8080
```
5. Через браузер открыть адрес: `http://your_server_ip_or_domain:8080` и вставить пароль из файла `/var/lib/jenkins/secrets/initialAdminPassword`
6. Продолжить настройку следуя инструкциям в веб интерфейсе
