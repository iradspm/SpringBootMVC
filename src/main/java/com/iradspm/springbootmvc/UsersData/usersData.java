package com.iradspm.springbootmvc.UsersData;

import com.iradspm.springbootmvc.model.Users;

import java.util.ArrayList;
import java.util.List;

public class usersData {
    List<Users> u=new ArrayList<>();
    public List<Users> getUsersList()
    {
        u.add(new Users(1,"Peter John","Kitui"));
        u.add(new Users(2,"George Kim","Nakuru"));
        u.add(new Users(3,"Achesa Loyce","Wajir"));

        return u;
    }


}
