package com.istad.miniprojectspring.repository;

import com.istad.miniprojectspring.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UsersRepo {
    private List<User> userList = new ArrayList<>(){{
    add(new User("001","visal sak","You must understand the whole of life, not just one part of it. That is why you must read, that is why you must look at the skies, why you must sing, dance and write poems, and suffer, and understand, for all that is life",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFfJ7YD9Yfdc2EscvN2GSYh-AxevtbDRIUrA&usqp=CAU","https://imgnew.outlookindia.com/uploadimage/library/16_9/16_9_5/IMAGE_1651729920.webp"
            ));
    add(new User("002","Nouch mikey","To live in the eternal present there must be death to the past, to memory. In this death there is timeless renewal.","https://i.pinimg.com/originals/e2/7f/77/e27f77d65ac0229504c9aa75383b5399.jpg",
            "https://v2.cimg.co/news/100430/248406/polina-kondrashova-fhrwah2hmnm-unsplash.jpg"
           ));
    add(new User("003","Samnang Ma","It is a waste of energy when we try to conform to a pattern. To conserve energy, we must be aware of how we dissipate energy.",
            "https://i.pinimg.com/736x/e4/f4/a8/e4f4a8e8587271bd39ec8d497d2ec0b4.jpg","https://images.squarespace-cdn.com/content/v1/5e55383538da6e7b34219641/1623270212425-BKBOSVBQQ4YQJGHKQJXW/Vader24_0001_PINK_blue.jpg?format=1000w"

    ));
        add(new User("004","Mongo Maryma","It is a waste of energy when we try to conform to a pattern. To conserve energy, we must be aware of how we dissipate energy.",
                "https://i.pinimg.com/originals/91/fa/11/91fa115580694840ddd8d2150d3d625e.png","https://99designs-blog.imgix.net/blog/wp-content/uploads/2021/05/merlin_184196631_939fb22d-b909-4205-99d9-b464fb961d32-superJumbo.jpeg?auto=format&q=60&fit=max&w=930"

        ));
    }};

    public List<User> getUserList() {
        return userList;
    }
    public void addNewUser(User user){
        userList.add(user);
    }
}
