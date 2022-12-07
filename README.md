# Learn it 🐣

*Учебный проект*

Learn It — сервис, помогающий в изучении иностранных языков, в частности английского. В его состав входят микросервисы, самостоятельные утилиты и библиотеки, объединенные общей тематикой изучения языка и решающие каждый одну законченную задачу. Сервисы не используют какой-либо общий код или ресурсы и независимы друг от друга в части реализации, но могут использовать API (интерфейсы) других сервисов.

## Сервисы

* **Директория сервиса**

    Короткое описание назначения сервиса: какую основную задачу решает.

    [Ссылка на документацию](README.md) (файл README.md в директории сервиса). В документации приводится описание доступных функций, основных интерфейсов, способов использования и запуска сервиса.

* **Тест: расставить слова в нужном порядке**

    //Раздел дополнится позднее, тема за @Xentention

* **...добавляйте свои сервисы...**

## Требования к сервисам

Сервисы должны поддерживать работу с несколькими пользователями. Это означает, что данные сохраняются для разных пользователей независимо, а методы сервиса могут принимать на вход информацию о текущем пользователе в виде строкового идентификатора.


## 💡 (for inspiration)


* регистрации пользователей
* перевод по словарю: перевод отдельного слова или фразы
* пополняемый список слов в изучении: в список можно добавить новые слова, а также отметить уже освоенные
* обучение через карточки: по [системе Лейтнера](https://ru.wikipedia.org/wiki/%D0%A1%D0%B8%D1%81%D1%82%D0%B5%D0%BC%D0%B0_%D0%9B%D0%B5%D0%B9%D1%82%D0%BD%D0%B5%D1%80%D0%B0)
* отслеживание прогресса изучения: сохранение метрик по пользователям (сколько слов выучил, сколько тестов прошел и т.п.)
* система ачивок: разработка метрик достижений и их учет
* анализ сложности текста/книги на основе частотности слов
* поиска примеров текста по заданному набору слов
* упрощение текста по словарям частотности и синонимов
* рекомендации: сформировать список слов для изучения (на день/неделю/месяц)
* рекомендации: по заданной тематике сформировать список книг/сериалов/фильмов для просмотра
* рекомендации: список фактов про англоязычных писателей
* рекомендации: ежедневные цитаты из книг и фильмов на английском языке
* тест: для слова выбрать правильный перевод из списка предложенных
* тест: по изображению выбрать правильное слово из списка вариантов
* тест: вставить пропущенное слово в предложение или фразу
* тест: расположить слова в фразе/предложении в правильном порядке
* тест: тестирование через чат-бота
* тест: угадай слово по произношению

---

## Ссылки

1. [LibreTranslate Translation API](https://libretranslate.com/?source=en&target=ru)

1. [List Of English Words](https://github.com/dwyl/english-words)

    Файлы со списками слов английского языка.
    
1. [Natural Language Corpus Data](http://norvig.com/ngrams/)

    Слова английского языка с частотой использования.

1. [Список слов русского языка](http://snowball.tartarus.org/algorithms/russian/voc.txt)

1. [Список имен существительных русского языка](https://harrix.dev/blog/2018/russian-nouns/)

1. [Martin Porter's stemming algorithm](https://tartarus.org/martin/PorterStemmer/java.txt)

    Реализация стеммера (приведения к базовой форме) для слов английского языка;
    
1. [Стеммер Портера для русского языка](https://medium.com/@eigenein/стеммер-портера-для-русского-языка-d41c38b2d340)

1. ...добавляйте, что было полезно вам и может быть полезным другим...
