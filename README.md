
Используйте Java SE 7.

Для тестов используется :
junit-4.10
mockito-1.9.5.

Для запуска приложения через Docker необходимо после скачивания проекта ввести в командной строке следующие команды:
1) docker build -t my-image . 
2)docker run --rm -v $PWD:/app -w /app my-image javac Main.java       
      ---компиляция файлов
3)docker run --rm -v $PWD:/app -w /app my-image java Main
      ---запуск приложения

