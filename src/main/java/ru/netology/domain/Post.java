package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;

    private CommentsInfo commentsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс CommentsInfo
    private LikesInfo likesInfo; // поле из документации
    private RepostsInfo repostsInfoInfo; // поле из документации
    private Geo geo; // поле из документации
    private Donat donat; // поле из документации

    // + get/set на все поля
}
