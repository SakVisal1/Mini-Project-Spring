package com.istad.miniprojectspring.repository;

import com.istad.miniprojectspring.model.AllUsers;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AllUsersRepo {
    private List<AllUsers> allUsersList = new ArrayList<>(){{
        add(new AllUsers("001","Selena ","https://e0.pxfuel.com/wallpapers/734/250/desktop-wallpaper-salvataggi-rapidi-nft-monkey.jpg",
                "Words are pale shadows of forgotten names. As names have power, words have power. Words can light fires in the minds of men. Words can wring tears from the hardest","https://getwallpapers.com/wallpaper/full/b/8/3/443193.jpg"));
        add(new AllUsers("002","NataMika ","https://public.nftstatic.com/static/nft/zipped/7b8d44a22668460baab20fb4f74e051e_zipped.jpeg",
                "Using words to talk of words is like using a pencil to draw a picture of itself, on itself. Impossible. Confusing. Frustrating ... but there are other ways to understanding.",
                "https://e0.pxfuel.com/wallpapers/448/516/desktop-wallpaper-tv-show-adventure-time-drawn-environments-cartoon-style.jpg"));
        add(new AllUsers("003","Capuchino","https://public.nftstatic.com/static/nft/zipped/e5e7b9e64e8f40fab64472e3d1bffdc5_zipped.jpeg",
                "It was June, and the world smelled of roses. The sunshine was like powdered gold over the grassy hillside",
                "https://wallpaperaccess.com/full/3303.jpg"));
        add(new AllUsers("004","Jakarta","https://public.nftstatic.com/static/nft/zipped/c24115ddff43413c94ca2d2f3daecd12_zipped.jpeg",
                "Blue was a fanciful, but sensible thing. Like a platypus, or one of those sandwiches that had been cut into circles for a fancy tea party",
                "https://i.redd.it/0a5e7cd2ase71.png"));

    }};

    public List<AllUsers> getAllUsersList() {
        return allUsersList;
    }
}
