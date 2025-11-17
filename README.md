# База данных EndoVar

Проект построен на основе технологии BeanExplorer version 5 (be5) - https://github.com/DevelopmentOnTheEdge/be5

## Документация по проекту
Cтруктура базы данных, диаграммы и т.п.

- [EndoVar-docs](https://github.com/genespace-ru/EndoVar-docs)

## Установка проекта локально

0. Установите (или у вас уже установлены):
* PostreSQL (15-17 версии, с 18 какая-то ошибка при синхронизации)
* Java (версии 21-25)
* maven
* Node, npm 

1. Создайте базу данных, например endovar с пользователем endovar, в PostgreSQL. Для этого можно использовать pgAdmin 4.

2. Настроить файл для соединения с базой данных - connectionProfiles.local.yaml
В проекте уже есть несколько соединений, которые можно использовать, например:
```
connectionProfiles:
  profiles:
    test_local:
      connectionUrl: jdbc:postgresql://localhost:5434/endovar
      username: endovar
      password: endovar
```

3. указать используемую строку соединения в файле <code>EndoVar/src/profile.local</code>, например:
```
test_local
```
Важно - файл <code>EndoVar/src/profile.local</code> у каждого разработчика свой и не вносится в репозиторий.

4. Установите зависимости для фронтенда
```
npm install
```

5. Создайте таблицы приложения в пустой базе данных endovar
```
mvn be5:create-db
```

6. Выполните скрипты для накатывания тестовых данных:
```
```

## Запуск проекта локально
1. Запуск сервера: ```mvn jetty:run -Djetty.http.port=8200```
2. Запуск фронтенда: ```npm start```
3. Интерфейс в браузере: http://localhost:8888
```
Login: Administrator  
Password: 12345
```

## Полезные комманды

```mvn be5:sync -DBE5_FORCE_UPDATE=true```
<br/>Обновляет структуру базы данных по файлам yaml. 

```mvn be5:data -DBE5_SCRIPT=dictionaries```
<br/>Выполняет заданный скрипт, здесь dictionaries.ftl
<br/>Важно:
- скрипт имеет расширение ```.ftl```, но оно при запуске не указывается,
- скрипт должен быть указан в проекте (```project.yaml```):
```
  scripts:
  - Post-db
  - dictionaries
...
```

### Генерация таблиц и диаграмм для документации
```sh
mvn be5:generate-doc -DBE5_DOC_PATH=../EndoVar-docs/source
```
После этого в проекте EndoVar-docs
```sh
make.html
```

